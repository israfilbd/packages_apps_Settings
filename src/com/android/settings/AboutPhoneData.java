package com.android.settings;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemProperties;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.WindowManager;

import java.lang.reflect.Method;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AboutPhoneData {
    private static final String TAG = "AboutPhoneData";

    private Context context;
    private String codename;
    private String soc;
    private String battery;
    private String display;
    private String camera;

    private static final String PROP_CODENAME = "ro.infinity.codename";
    private static final String PROP_SOC = "ro.infinity.soc";
    private static final String PROP_RO_BOARD_PLATFORM = "ro.board.platform";
    private static final String PROP_BATTERY = "ro.infinity.battery";
    private static final String PROP_DISPLAY = "ro.infinity.display";
    private static final String PROP_CAMERA = "ro.infinity.camera";

    public AboutPhoneData(Context context) {
        this.context = context;
        initializeData();
    }

    private void initializeData() {
        this.codename = getSystemPropertyOrDefault(PROP_CODENAME, getDeviceCodename());
        this.soc = getSystemPropertyOrDefault(PROP_SOC, getSoCInfo());
        this.battery = getSystemPropertyOrDefault(PROP_BATTERY, getBatteryInfo());
        this.display = getSystemPropertyOrDefault(PROP_DISPLAY, getDisplayInfo());
        this.camera = getSystemPropertyOrDefault(PROP_CAMERA, getCameraInfo());
    }

    private String getSystemPropertyOrDefault(String key, String defaultValue) {
        String value = SystemProperties.get(key);
        return (value != null && !value.isEmpty()) ? value : defaultValue;
    }

    private String getDeviceCodename() {
        return Build.DEVICE;
    }

    private String getSoCInfo() {
        String soc = SystemProperties.get(PROP_RO_BOARD_PLATFORM);
        return (soc != null && !soc.isEmpty()) ? soc : "Unknown";
    }

    private String getBatteryInfo() {
        int batteryCapacity = getBatteryCapacityFromBatteryManager();
        if (batteryCapacity <= 0) {
            batteryCapacity = getBatteryCapacityFromPowerProfile(context);
        }
        return batteryCapacity > 0 ? batteryCapacity + " mAh" : "Unknown";
    }

    private int getBatteryCapacityFromBatteryManager() {
        BatteryManager batteryManager = (BatteryManager) context.getSystemService(Context.BATTERY_SERVICE);
        if (batteryManager != null) {
            return batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        }
        return 0;
    }

    private int getBatteryCapacityFromPowerProfile(Context context) {
        try {
            Class<?> powerProfileClass = Class.forName("com.android.internal.os.PowerProfile");
            Object powerProfile = powerProfileClass.getConstructor(Context.class).newInstance(context);
            Method getBatteryCapacityMethod = powerProfileClass.getMethod("getBatteryCapacity");
            double batteryCapacity = (double) getBatteryCapacityMethod.invoke(powerProfile);
            return (int) Math.round(batteryCapacity);
        } catch (Exception e) {
            Log.e(TAG, "Error retrieving battery capacity from PowerProfile", e);
        }
        return 0;
    }

    private String getDisplayInfo() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int width = displayMetrics.widthPixels;
            int height = displayMetrics.heightPixels;
            int refreshRate = (int) (windowManager.getDefaultDisplay().getRefreshRate());
            return width + "x" + height + ", " + refreshRate + " Hz";
        }
        return "Unknown";
    }

    private String getCameraInfo() {
        StringBuilder cameraInfo = new StringBuilder();
        CameraManager cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
        
        if (cameraManager != null) {
            try {
                List<String> backCameras = new ArrayList<>();
                List<String> frontCameras = new ArrayList<>();

                for (String cameraId : cameraManager.getCameraIdList()) {
                    CameraCharacteristics characteristics = cameraManager.getCameraCharacteristics(cameraId);
                    Integer lensFacing = characteristics.get(CameraCharacteristics.LENS_FACING);
                    String lensFacingString = (lensFacing == null) ? "Unknown" :
                            (lensFacing == CameraCharacteristics.LENS_FACING_FRONT) ? "Front" : "Back";

                    String cameraResolution = getCameraResolution(characteristics);

                    if ("Front".equals(lensFacingString)) {
                        frontCameras.add(cameraResolution);
                    } else if ("Back".equals(lensFacingString)) {
                        backCameras.add(cameraResolution);
                    }
                }

                if (!backCameras.isEmpty()) {
                    cameraInfo.append(String.join(" + ", backCameras));
                }
                if (!frontCameras.isEmpty()) {
                    if (cameraInfo.length() > 0) {
                        cameraInfo.append(", ");
                    }
                    cameraInfo.append(String.join(" + ", frontCameras));
                }
            } catch (Exception e) {
                Log.e(TAG, "Error getting camera info", e);
            }
        } else {
            cameraInfo.append("Camera Manager not available.");
        }
        return cameraInfo.toString();
    }

    private String getCameraResolution(CameraCharacteristics characteristics) {
        Size[] sizes = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP).getOutputSizes(ImageFormat.JPEG);
        if (sizes != null && sizes.length > 0) {
            List<Size> sizeList = Arrays.asList(sizes);
            Collections.sort(sizeList, new Comparator<Size>() {
                @Override
                public int compare(Size s1, Size s2) {
                    return Integer.compare(s2.getWidth() * s2.getHeight(), s1.getWidth() * s1.getHeight());
                }
            });
            Size largestSize = sizeList.get(0);
            int width = largestSize.getWidth();
            int height = largestSize.getHeight();
            double megapixels = (width * height) / 1_000_000.0;
            return String.format("%.0f MP", megapixels);
        }
        return "Unknown Resolution";
    }

    public String getCodename() {
        return codename;
    }

    public String getSoc() {
        return soc;
    }

    public String getBattery() {
        return battery;
    }

    public String getDisplay() {
        return display;
    }

    public String getCamera() {
        return camera;
    }
}
