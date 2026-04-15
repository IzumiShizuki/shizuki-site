package p4;

import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16568a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16569b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16570c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f16571d;

    static {
        HashMap map = new HashMap();
        f16571d = map;
        h0.r(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        h0.r(-983041, map, "azure", -657956, "beige");
        h0.r(-6972, map, "bisque", -16777216, "black");
        h0.r(-5171, map, "blanchedalmond", -16776961, "blue");
        h0.r(-7722014, map, "blueviolet", -5952982, "brown");
        h0.r(-2180985, map, "burlywood", -10510688, "cadetblue");
        h0.r(-8388864, map, "chartreuse", -2987746, "chocolate");
        h0.r(-32944, map, "coral", -10185235, "cornflowerblue");
        h0.r(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        h0.r(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        h0.r(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        h0.r(-29696, map, "darkorange", -6737204, "darkorchid");
        h0.r(-7667712, map, "darkred", -1468806, "darksalmon");
        h0.r(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        h0.r(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        h0.r(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        h0.r(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        h0.r(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        h0.r(-38476, map, "hotpink", -3318692, "indianred");
        h0.r(-11861886, map, "indigo", -16, "ivory");
        h0.r(-989556, map, "khaki", -1644806, "lavender");
        h0.r(-3851, map, "lavenderblush", -8586240, "lawngreen");
        h0.r(-1331, map, "lemonchiffon", -5383962, "lightblue");
        h0.r(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        h0.r(-18751, map, "lightpink", -24454, "lightsalmon");
        h0.r(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        h0.r(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        h0.r(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        h0.r(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        h0.r(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        h0.r(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        h0.r(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        h0.r(-15132304, map, "midnightblue", -655366, "mintcream");
        h0.r(-6943, map, "mistyrose", -6987, "moccasin");
        h0.r(-8531, map, "navajowhite", -16777088, "navy");
        h0.r(-133658, map, "oldlace", -8355840, "olive");
        h0.r(-9728477, map, "olivedrab", -23296, "orange");
        h0.r(-47872, map, "orangered", -2461482, "orchid");
        h0.r(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        h0.r(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        h0.r(-4139, map, "papayawhip", -9543, "peachpuff");
        h0.r(-3308225, map, "peru", -16181, "pink");
        h0.r(-2252579, map, "plum", -5185306, "powderblue");
        h0.r(-8388480, map, "purple", -10079335, "rebeccapurple");
        h0.r(-65536, map, "red", -4419697, "rosybrown");
        h0.r(-12490271, map, "royalblue", -7650029, "saddlebrown");
        h0.r(-360334, map, "salmon", -744352, "sandybrown");
        h0.r(-13726889, map, "seagreen", -2578, "seashell");
        h0.r(-6270419, map, "sienna", -4144960, "silver");
        h0.r(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        h0.r(-12156236, map, "steelblue", -2968436, "tan");
        h0.r(-16744320, map, "teal", -2572328, "thistle");
        h0.r(-40121, map, "tomato", 0, "transparent");
        h0.r(-12525360, map, "turquoise", -1146130, "violet");
        h0.r(-663885, map, "wheat", -1, "white");
        h0.r(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        c.c(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f16570c : f16569b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f16568a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f16571d.get(ud.e.c0(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
