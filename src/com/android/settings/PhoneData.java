package com.android.settings;

import java.util.ArrayList;
import java.util.List;
import com.android.settings.R;

public final class PhoneData {
    public static List<AboutPhoneData> data = new ArrayList<>();
    static {
        data.add(new AboutPhoneData(0));
        // Redwood
        data.add(new AboutPhoneData(1,
            "redwood",
            "Snapdragon 778G",
            "5000",
            "1080 x 2400, 120Hz",
            "108MP + 8MP + 2MP, 16MP"
        ));
        // Redwood Global
        data.add(new AboutPhoneData(2,
            "redwood_global",
            "Snapdragon 778G",
            "5000",
            "1080 x 2400, 120Hz",
            "108MP + 8MP + 2MP, 16MP"
        ));
        // Ginkgo
        data.add(new AboutPhoneData(3,
            "ginkgo",
            "Snapdragon 665",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // Willow
        data.add(new AboutPhoneData(4,
            "willow",
            "Snapdragon 665",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // Munch
        data.add(new AboutPhoneData(5,
            "munch",
            "Snapdragon 870",
            "4500",
            "1080 x 2400, 120Hz",
            "64MP + 8MP + 2MP, 20MP"
        ));
        data.add(new AboutPhoneData(6,
            "munch_global",
            "Snapdragon 870",
            "4500",
            "1080 x 2400, 120Hz",
            "64MP + 8MP + 2MP, 20MP"
        ));
        data.add(new AboutPhoneData(7,
            "munch_in_global",
            "Snapdragon 870",
            "4500",
            "1080 x 2400, 120Hz",
            "64MP + 8MP + 2MP, 20MP"
        ));
        // Beryllium
        data.add(new AboutPhoneData(8,
            "beryllium",
            "Snapdragon 845",
            "4000",
            "1080 x 2246, 60Hz",
            "12MP + 5MP, 20MP"
        ));
        // Vayu
        data.add(new AboutPhoneData(9,
            "vayu",
            "Snapdragon 860",
            "5160",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        data.add(new AboutPhoneData(10,
            "vayu_global",
            "Snapdragon 860",
            "5160",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // Bhima
        data.add(new AboutPhoneData(11,
            "bhima",
            "Snapdragon 860",
            "5160",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        data.add(new AboutPhoneData(12,
            "bhima_global",
            "Snapdragon 860",
            "5160",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // Spartan
        data.add(new AboutPhoneData(13,
            "RE54E4L1",
            "Snapdragon 870",
            "5000",
            "1080 x 1920, 120Hz",
            "64MP + 8MP, 20MP"
        ));
        // Joyeuse
        data.add(new AboutPhoneData(14,
            "joyeuse",
            "Snapdragon 720G",
            "5000",
            "1080 x 2400, 60Hz",
            "64MP , 16MP"
        ));
        // Gram
        data.add(new AboutPhoneData(15,
            "gram",
            "Snapdragon 720G",
            "5000",
            "1080 x 2400, 60Hz",
            "48MP , 16MP"
        ));
        // Curtana
        data.add(new AboutPhoneData(16,
            "curtana",
            "Snapdragon 720G",
            "5000",
            "1080 x 2400, 60Hz",
            "48MP , 16MP"
        ));
        // Excalibur
        data.add(new AboutPhoneData(17,
            "excalibur",
            "Snapdragon 720G",
            "5000",
            "1080 x 2400, 60Hz",
            "64MP , 32MP"
        ));
        // Pong
        data.add(new AboutPhoneData(18,
            "Pong",
            "Snapdragon 8+ Gen 1",
            "4700",
            "1080 x 2412, 120Hz",
            "50MP + 50MP, 32MP"
        ));
        // Surya
        data.add(new AboutPhoneData(19,
            "surya",
            "Snapdragon 732G",
            "5160",
            "1080 x 2400, 120Hz",
            "64MP + 13MP, 20MP"
        ));
        // Karna
        data.add(new AboutPhoneData(20,
            "karna",
            "Snapdragon 732G",
            "6000",
            "1080 x 2400, 120Hz",
            "64MP + 13MP, 20MP"
        ));
        // Marble
        data.add(new AboutPhoneData(21,
            "marble",
            "SD 7+ Gen2",
            "5000",
            "1080 x 2400, 120Hz",
            "64MP + 8MP + 2 MP, 16MP"
        ));
        // OnePlus6T
        data.add(new AboutPhoneData(22,
            "OnePlus6T",
            "Snapdragon 845",
            "3700",
            "1080 x 2340, 60Hz",
            "16MP + 20 MP, 16MP"
        ));
        // OnePlus6
        data.add(new AboutPhoneData(23,
            "OnePlus6",
            "Snapdragon 845",
            "3300",
            "1080 x 2280, 60Hz",
            "16MP + 20 MP, 16MP"
        ));
        // Lavender
        data.add(new AboutPhoneData(24,
            "lavender",
            "Snapdragon 660",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 5MP, 13MP"
        ));
        // Whyred
        data.add(new AboutPhoneData(25,
            "whyred",
            "Snapdragon 636",
            "4000",
            "1080 x 2160, 60Hz",
            "12MP + 5MP"
        ));
        // spes
        data.add(new AboutPhoneData(26,
            "spes",
            "Snapdragon 680",
            "5000",
            "1080 x 2400, 90Hz",
            "50MP + 8MP + 2MP, 13MP"
        ));
        // spesn
        data.add(new AboutPhoneData(27,
            "spesn",
            "Snapdragon 680",
            "5000",
            "1080 x 2400, 90Hz",
            "50MP + 8MP + 2MP, 13MP"
        ));
        // X3
        data.add(new AboutPhoneData(28,
            "x3",
            "Snapdragon 855+",
            "4200",
            "1080 x 2400, 120Hz",
            "64MP + 12MP + 8MP + 2MP"
        ));
        // Sweet_k6a
        data.add(new AboutPhoneData(29,
            "sweet_k6a",
            "Snapdragon 732G",
            "5020",
            "1080 x 2400, 120Hz",
            "108MP + 8MP + 2 MP + 2 MP"
        ));
        // Sweet2
        data.add(new AboutPhoneData(30,
            "sweet2",
            "Snapdragon 732G",
            "5020",
            "1080 x 2400, 120Hz",
            "108MP + 8MP + 2 MP + 2 MP"
        ));
        // Sunstone
        data.add(new AboutPhoneData(31,
            "sunstone",
            "Snapdragon 4 Gen1",
            "5000",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2 MP, 13MP"
        ));
        // Moonstone
        data.add(new AboutPhoneData(32,
            "moonstone",
            "Snapdragon 695",
            "5000",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 2 MP, 13MP"
        ));
        // Violet
        data.add(new AboutPhoneData(33,
            "violet",
            "Snapdragon 675",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 5MP, 13MP"
        ));
        // Zeus
        data.add(new AboutPhoneData(34,
            "zeus_global",
            "Snapdragon 8 Gen 1",
            "4700",
            "1440 x 3200, 120Hz",
            "50MP + 50MP + 50MP, 32MP"
        ));
        data.add(new AboutPhoneData(35,
            "zeus_in",
            "Snapdragon 8 Gen 1",
            "4700",
            "1440 x 3200, 120Hz",
            "50MP + 50MP + 50MP, 32MP"
        ));
        data.add(new AboutPhoneData(36,
            "zeus",
            "Snapdragon 8 Gen 1",
            "4700",
            "1440 x 3200, 120Hz",
            "50MP + 50MP + 50MP, 32MP"
        ));
        // alioth
        data.add(new AboutPhoneData(37,
            "alioth",
            "Snapdragon 870",
            "4520",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 5MP, 20MP"
        ));
        data.add(new AboutPhoneData(38,
            "aliothin",
            "Snapdragon 870",
            "4520",
            "1080 x 2400, 120Hz",
            "48MP + 8MP + 5MP, 20MP"
        ));
        // raphael
        data.add(new AboutPhoneData(39,
            "raphael",
            "Snapdragon 855",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 13MP, 20MP"
        ));
        data.add(new AboutPhoneData(40,
            "raphael_global",
            "Snapdragon 855",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 13MP, 20MP"
        ));
        data.add(new AboutPhoneData(41,
            "raphaelin",
            "Snapdragon 855",
            "4000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 13MP, 20MP"
        ));
        // chime
        data.add(new AboutPhoneData(42,
            "lime",
            "Snapdragon 662",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        data.add(new AboutPhoneData(43,
            "citrus",
            "Snapdragon 662",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        data.add(new AboutPhoneData(44,
            "lemon",
            "Snapdragon 662",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        data.add(new AboutPhoneData(45,
            "pomelo",
            "Snapdragon 662",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // daisy
        data.add(new AboutPhoneData(46,
            "daisy",
            "Snapdragon 625",
            "4000",
            "1080 x 2280, 60Hz",
            "12MP + 5MP, 5MP"
        ));
        // sakura
        data.add(new AboutPhoneData(47,
            "sakura",
            "Snapdragon 625",
            "4000",
            "1080 x 2280, 60Hz",
            "12MP + 5MP, 5MP"
        ));
        // begonia
        data.add(new AboutPhoneData(48,
            "begonia",
            "Mediatek Helio G90T",
            "4500",
            "1080 x 2340, 60Hz",
            "64MP + 8MP + 2MP + 2MP"
        ));
        // mido
        data.add(new AboutPhoneData(49,
            "mido",
            "Snapdragon 625",
            "4100",
            "1080 x 1920, 60Hz",
            "13MP + 5MP"
        ));
        // guamp
        data.add(new AboutPhoneData(50,
            "guamp",
            "Snapdragon 662",
            "5000",
            "720 x 1600, 60Hz",
            "48MP + 2MP + 2MP, 8MP"
        ));
        // A51
        data.add(new AboutPhoneData(51,
            "a51",
            "Exynos 9611",
            "4000",
            "1080 x 2400, 60Hz",
            "48MP + 12MP, 5MP, 5MP"
        ));
        // F41
        data.add(new AboutPhoneData(52,
            "f41",
            "Exynos 9611",
            "6000",
            "1080 x 2340, 60Hz",
            "64MP + 8MP, 5MP"
        ));
        // M31s
        data.add(new AboutPhoneData(53,
            "m31s",
            "Exynos 9611",
            "6000",
            "1080 x 2400, 60Hz",
            "64MP + 12MP, 5MP, 5MP"
        ));
        // M31
        data.add(new AboutPhoneData(54,
            "m31",
            "Exynos 9611",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP, 5MP, 5MP"
        ));
        // M21
        data.add(new AboutPhoneData(55,
            "m21",
            "Exynos 9611",
            "6000",
            "1080 x 2340, 60Hz",
            "48MP + 8MP, 5MP"
        ));
        // hawao
        data.add(new AboutPhoneData(56,
            "hawao",
            "Snapdragon 680",
            "5000",
            "1080 x 2400, 60Hz",
            "50MP + 8MP + 2MP, 16MP"
        ));
        // devon
        data.add(new AboutPhoneData(57,
            "devon",
            "Snapdragon 680",
            "5000",
            "1080 x 2400, 90Hz",
            "50MP + 8MP + 2MP, 16MP"
        ));
        // rhode
        data.add(new AboutPhoneData(58,
            "rhode",
            "Snapdragon 680",
            "5000",
            "1080 x 2400, 90Hz",
            "50MP + 8MP + 2MP, 16MP"
        ));
        // mojito
        data.add(new AboutPhoneData(59,
            "mojito",
            "Snapdragon 678",
            "5000",
            "1080 x 2400, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // sunny
        data.add(new AboutPhoneData(60,
            "sunny",
            "Snapdragon 678",
            "5000",
            "1080 x 2400, 60Hz",
            "48MP + 8MP + 2MP + 2MP"
        ));
        // ruby
        data.add(new AboutPhoneData(61,
            "ruby",
            "Mediatek Dimensity 1080",
            "5000",
            "1080 x 2400, 120Hz",
            "50MP + 8MP + 2MP, 16MP"
        ));
        // rubypro
        data.add(new AboutPhoneData(62,
            "rubypro",
            "Mediatek Dimensity 1080",
            "5000",
            "1080 x 2400, 120Hz",
            "200MP + 8MP + 2MP, 16MP"
        ));
        // rubyplus
        data.add(new AboutPhoneData(63,
            "rubyplus",
            "Mediatek Dimensity 1080",
            "4300",
            "1080 x 2400, 120Hz",
            "200MP + 8MP + 2MP, 16MP"
        ));
        // avicii
        data.add(new AboutPhoneData(64,
            "avicii",
            "Snapdragon 765G",
            "4115",
            "1080 x 2400, 90Hz",
            "48MP + 8MP + 5MP + 2MP"
        ));
        // cheetah
        data.add(new AboutPhoneData(65,
            "cheetah",
            "Google Tensor G2",
            "5000",
            "3120 x 1440, 120Hz",
            "50MP + 48MP + 12MP + 10MP"
        ));
        // panther
        data.add(new AboutPhoneData(66,
            "panther",
            "Google Tensor G2",
            "4355",
            "2400 x 1080, 90Hz",
            "50MP + 12MP + 10MP"
        ));
        // garnet
        data.add(new AboutPhoneData(67,
            "garnet",
            "Snapdragon 7s Gen2",
            "5100",
            "1220 x 2712, 120HZ",
            "200MP + 8MP + 2MP"
        ));
        data.add(new AboutPhoneData(68,
            "garnet_global",
            "Snapdragon 7s Gen2",
            "5100",
            "1220 x 2712, 120HZ",
            "200MP + 8MP + 2MP"
        ));
        data.add(new AboutPhoneData(69,
            "garnet_global_in_global",
            "Snapdragon 7s Gen2",
            "5100",
            "1220 x 2712, 120HZ",
            "200MP + 8MP + 2MP"
        ));
        // cebu
        data.add(new AboutPhoneData(70,
            "cebu",
            "Snapdragon 662",
            "6000",
            "720 × 1640, 60HZ",
            "64MP + 2MP + 2MP, 16MP"
        ));
        // hanoip
        data.add(new AboutPhoneData(71,
            "hanoip",
            "Snapdragon 732G",
            "6000",
            "1080 x 2460, 120HZ",
            "64MP + 8MP + 2MP, 16MP"
        ));
        // guacamole
        data.add(new AboutPhoneData(72,
            "guacamole",
            "Snapdragon 855",
            "4000",
            "1440 x 3120, 90HZ",
            "48MP + 8MP + 16MP, 16MP"
        ));
        // hotdogb
        data.add(new AboutPhoneData(73,
            "hotdogb",
            "Snapdragon 855+",
            "5000",
            "1080 x 2400, 90HZ",
            "48MP + 12MP + 16MP"
        ));
        // shiba
        data.add(new AboutPhoneData(74,
            "shiba",
            "Tensor G3",
            "4575",
            "1080 x 2400, 120HZ",
            "50MP + 12MP, 10.5MP"
        ));
        // husky
        data.add(new AboutPhoneData(75,
            "husky",
            "Tensor G3",
            "5050",
            "1344 x 2992, 120HZ",
            "50MP + 48MP + 48MP, 10.5MP"
        ));
        // lisa
        data.add(new AboutPhoneData(76,
            "lisa",
            "Snapdragon™ 778G",
            "4250",
            "1080 x 2400, 90HZ",
            "64MP + 8MP + 5MP, 20MP"
        ));
       // raven
       data.add(new AboutPhoneData(77,
            "raven",
            "Tensor G1",
            "5003",
            "1440 x 3120, 120HZ",
            "50MP + 48MP + 12MP, 11,1 MP"
        ));
       // oriole
        data.add(new AboutPhoneData(78,
            "oriole",
            "Tensor GS101",
            "4614",
            "1080x2400, 90HZ",
            "50MP + 12MP, 8 MP"
        ));
        // guam
        data.add(new AboutPhoneData(79,
            "guam",
            "Snapdragon 460",
            "5000",
            "720 x 1600, 60Hz",
            "48MP + 2MP , 8MP"
        ));
        // borneo
        data.add(new AboutPhoneData(80,
            "borneo",
            "Snapdragon 622",
            "5000",
            "720 x 1600, 60Hz",
            "48MP + 2MP + 2MP , 8MP"
        ));
        // vili
        data.add(new AboutPhoneData(81,
            "vili",
            "Snapdragon 888",
            "5000",
            "1080 x 2400, 120HZ",
            "108MP + 8MP + 5MP, 16MP"
        ));
        // sky
        data.add(new AboutPhoneData(82,
            "sky",
            "Snapdragon 4 Gen 2",
            "5000",
            "1080 x 2460, 90HZ",
            "50MP + 2MP, 8MP"
        ));
        data.add(new AboutPhoneData(83,
             "infinity_sky",
             "Snapdragon 4 Gen 2",
             "5000",
             "1080 x 2460, 90HZ",
             "50MP + 2MP, 8MP"
        ));
        data.add(new AboutPhoneData(84,
             "xig03_jp_kdi",
             "Snapdragon 4 Gen 2",
             "5000",
             "1080 x 2460, 90HZ",
             "50MP + 2MP, 8MP"
        ));
        data.add(new AboutPhoneData(85,
             "river",
             "Snapdragon 4 Gen 2",
             "5000",
             "1080 x 2460, 90HZ",
             "50MP + 2MP, 8MP"
        ));
        data.add(new AboutPhoneData(86,
             "bluejay",
             "Tensor GS101",
             "4410",
             "1080 x 2400, 90HZ",
             "12,2MP + 12MP, 8MP"
        ));
        data.add(new AboutPhoneData(87,
             "tundra",
             "Snapdragon 888+",
             "4400",
             "1080 x 2440, 144HZ",
             "50MP + 13MP + 2MP, 32MP"
        ));
        // Aston
        data.add(new AboutPhoneData(88,
            "OP5D35L1",
            "Snapdragon 8 Gen 2",
            "5500",
            "1264 x 2780, 120HZ",
            "50MP + 8MP + 2MP, 16MP"
        ));
        data.add(new AboutPhoneData(89,
            "OP5CF9L1",
            "Snapdragon 8 Gen 2",
            "5500",
            "1264 x 2780, 120HZ",
            "50MP + 8MP + 2MP, 16MP"
        ));
       data.add(new AboutPhoneData(90,
             "RMX1901",
             "Snapdragon 710",
             "3765",
             "1080 x 2340, 60HZ",
             "48MP + 5MP"
       ));
    }
    public static List<AboutPhoneData> getData() {
        return data;
    }
}
