package m4;

import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f14438a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f14439b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        e7.c0 c0VarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (c0VarG = g(str2)) != null && (iA = c0VarG.a()) != 0 && iA != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : p4.c0.Z(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrZ = p4.c0.Z(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrZ) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        e7.c0 c0VarG;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c0VarG = g(str2)) == null) {
                    return 0;
                }
                return c0VarG.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        e7.c0 c0VarG;
        String strF = null;
        if (str != null) {
            String strC0 = ud.e.c0(str.trim());
            if (strC0.startsWith("avc1") || strC0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strC0.startsWith("hev1") || strC0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strC0.startsWith("dvav") || strC0.startsWith("dva1") || strC0.startsWith("dvhe") || strC0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strC0.startsWith("av01")) {
                return "video/av01";
            }
            if (strC0.startsWith("vp9") || strC0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strC0.startsWith("vp8") || strC0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strC0.startsWith("mp4a")) {
                if (strC0.startsWith("mp4a.") && (c0VarG = g(strC0)) != null) {
                    strF = f(c0VarG.f6308b);
                }
                return strF == null ? "audio/mp4a-latm" : strF;
            }
            if (strC0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strC0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strC0.startsWith("ac-3") || strC0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strC0.startsWith("ec-3") || strC0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strC0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strC0.startsWith("ac-4") || strC0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strC0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strC0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strC0.startsWith("dtsh") || strC0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strC0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strC0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strC0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strC0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strC0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strC0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strC0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strC0.contains("eia608") || strC0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f14438a;
            if (arrayList.size() > 0) {
                throw q.t0.A(0, arrayList);
            }
        }
        return null;
    }

    public static String f(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case TinkerReport.KEY_APPLIED_UPGRADE_FAIL /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static e7.c0 g(String str) {
        Matcher matcher = f14439b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new e7.c0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f14438a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        throw q.t0.A(0, arrayList);
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : p4.c0.Z(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        String strC0;
        if (str == null) {
            return null;
        }
        strC0 = ud.e.c0(str);
        strC0.getClass();
        switch (strC0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strC0;
        }
    }
}
