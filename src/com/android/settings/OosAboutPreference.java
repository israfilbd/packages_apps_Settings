package com.android.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

import com.android.settings.core.BasePreferenceController;
import com.android.settingslib.DeviceInfoUtils;
import com.android.settingslib.widget.LayoutPreference;
import com.airbnb.lottie.LottieAnimationView;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class OosAboutPreference extends BasePreferenceController implements View.OnTouchListener {

    private Context context;
    private AboutPhoneData phoneData;

    public OosAboutPreference(Context context, String key) {
        super(context, key);
        this.context = context;
        this.phoneData = new AboutPhoneData(context);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public void displayPreference(PreferenceScreen screen) {
        super.displayPreference(screen);
        LayoutPreference mPreference = screen.findPreference("infinity_about_layout");
        if (mPreference != null) {
            onBindItems(mPreference.findViewById(R.id.oos_about_root));
        }
    }

    private static void setInfo(String prop, TextView textView) {
        String value = SystemProperties.get(prop);
        textView.setText(TextUtils.isEmpty(value) ? "Unknown" : value);
    }

    public void onBindItems(View holder) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        int total = 0;
        double totalInt = 0.0;
        try {
            totalInt = (statFs.getBlockSizeLong() * statFs.getBlockCountLong() / Math.pow(1024, 3));
            if (totalInt > 0 && totalInt < 17)
                total = 16;
            else if (totalInt > 16 && totalInt < 33)
                total = 32;
            else if (totalInt > 32 && totalInt < 65)
                total = 64;
            else if (totalInt > 64 && totalInt < 129)
                total = 128;
            else if (totalInt > 128 && totalInt < 257)
                total = 256;
            else if (totalInt > 256 && totalInt < 513)
                total = 512;
        } catch (Exception e) {
            Log.e("OosAboutPreference", "Error calculating total ROM size: " + e.getMessage());
        }

        View root = holder;

        TextView display = root.findViewById(R.id.display_about);
        TextView battery = root.findViewById(R.id.battery_about);
        TextView soc = root.findViewById(R.id.soc_about);
        TextView camera = root.findViewById(R.id.camera_about);
        TextView device = root.findViewById(R.id.device_name);
        TextView deviceSec = root.findViewById(R.id.security_update);
        TextView kernel = root.findViewById(R.id.kernel_version);
        TextView maintainer = root.findViewById(R.id.infinity_maintainer);
        TextView infinityVersion = root.findViewById(R.id.infinity_version);
        TextView infinityStatus = root.findViewById(R.id.infinity_status);
        TextView rom = root.findViewById(R.id.rom_about);

        LottieAnimationView greenAnimationView = root.findViewById(R.id.green_animation_view);
        LottieAnimationView redAnimationView = root.findViewById(R.id.red_animation_view);

        String buildType = SystemProperties.get("ro.infinity.buildtype");
        if ("OFFICIAL".equalsIgnoreCase(buildType)) {
            greenAnimationView.setVisibility(View.VISIBLE);
            redAnimationView.setVisibility(View.GONE);
        } else {
            greenAnimationView.setVisibility(View.GONE);
            redAnimationView.setVisibility(View.VISIBLE);
        }

        display.setText(phoneData.getDisplay());
        battery.setText(phoneData.getBattery());
        soc.setText(phoneData.getSoc());
        camera.setText(phoneData.getCamera());

        infinityVersion.setText(String.format("Infinity-X v%s", SystemProperties.get("ro.infinity.version")));
        setInfo("ro.infinity.build.status", infinityStatus);
        setInfo("ro.infinity.maintainer", maintainer);
        deviceSec.setText(DeviceInfoUtils.getSecurityPatch());
        kernel.setText(DeviceInfoUtils.getFormattedKernelVersion(context));

        String modelName = SystemProperties.get("ro.product.model");
        String marketName = SystemProperties.get("ro.product.marketname");
        String infinityDevice = SystemProperties.get("ro.infinity.device");
        if (!TextUtils.isEmpty(marketName)) {
            device.setText(marketName + " (" + infinityDevice + ")");
        } else if (!TextUtils.isEmpty(modelName)) {
            device.setText(modelName + " (" + infinityDevice + ")");
        } else {
            device.setText(infinityDevice);
        }
        
        String customRam = SystemProperties.get("ro.infinity.ram");
        String customRom = SystemProperties.get("ro.infinity.rom");

        if (!TextUtils.isEmpty(customRam) && !TextUtils.isEmpty(customRom)) {
        	rom.setText(String.format(Locale.ENGLISH, "%s RAM + %s ROM", customRam, customRom));
	} else {
		double ramInGB = Double.parseDouble(getMem()) / Math.pow(1000, 2);
		int roundedRamInGB = (int) Math.ceil(ramInGB);
		rom.setText(String.format(Locale.ENGLISH, "%dGB RAM + %dGB ROM", roundedRamInGB, total));
		    if (rom.getText().length() >= 14) {
		        rom.setTextSize(12);
		    }    
	}

        root.findViewById(R.id.leftFinalDetail).setOnTouchListener(this);
        root.findViewById(R.id.righFinalDetail).setOnTouchListener(this);

        final Intent intent = new Intent(Intent.ACTION_MAIN)
                .setClassName(
                        "android", com.android.internal.app.PlatLogoActivity.class.getName());

                ImageView androidVersion = root.findViewById(R.id.android_version);

        androidVersion.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                try {
                    context.startActivity(intent);
                    return true;
                } catch (Exception ignored) {
                }
                return false;
            }
        });
    }

    private String getMem() {
        if (getMemInfoMap().containsKey("MemTotal")) {
            String s = getMemInfoMap().get("MemTotal");
            return s.split(" ")[0];
        }
        return "Unknown";
    }

    private Map<String, String> getMemInfoMap() {
        Map<String, String> map = new HashMap<>();
        try {
            Scanner s = new Scanner(new File("/proc/meminfo"));
            while (s.hasNextLine()) {
                String[] vals = s.nextLine().split(": ");
                if (vals.length > 1)
                    map.put(vals[0].trim(), vals[1].trim());
            }
        } catch (Exception e) {
            Log.e("getMemInfoMap", Log.getStackTraceString(e));
        }
        return map;
    }

    @Override
    public boolean onTouch(View v, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            v.animate().scaleX(.97f).setDuration(300).start();
            v.animate().scaleY(.97f).setDuration(300).start();
            return true;
        } else if (action == MotionEvent.ACTION_UP) {
            v.animate().cancel();
            v.animate().scaleX(1f).setDuration(500).start();
            v.animate().scaleY(1f).setDuration(500).start();
            return true;
        }
        return false;
    }
}
