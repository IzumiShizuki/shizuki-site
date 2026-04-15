package p4;

import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import cb.e0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m4.o0;
import m4.p0;
import m4.y0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f16553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f16554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f16555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f16556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f16557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f16558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static HashMap f16559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f16560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f16561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f16562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f16563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f16564q;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f16548a = i10;
        String str = Build.DEVICE;
        f16549b = str;
        String str2 = Build.MANUFACTURER;
        f16550c = str2;
        String str3 = Build.MODEL;
        f16551d = str3;
        f16552e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f16553f = new byte[0];
        f16554g = new long[0];
        f16555h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f16556i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f16557j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f16558k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f16560m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f16561n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f16562o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f16563p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f16564q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, TinkerReport.KEY_APPLIED_DEXOPT_OTHER, 108, 107, 98, TinkerReport.KEY_APPLIED_UPGRADE_FAIL, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, TinkerReport.KEY_LOADED_EXCEPTION_DEX, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 242, 245, 216, 223, 214, TinkerReport.KEY_APPLIED_FAIL_COST_OTHER, 196, 195, TinkerReport.KEY_APPLIED_SUCC_COST_30S_LESS, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 144, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_DEX_META, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND, 140, 139, 130, 133, 168, 175, 166, 161, TinkerReport.KEY_APPLIED_VERSION_CHECK, 179, 186, 189, 199, 192, TinkerReport.KEY_APPLIED_SUCC_COST_10S_LESS, TinkerReport.KEY_APPLIED_FAIL_COST_10S_LESS, 219, 220, 213, 210, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 248, 241, 246, 227, 228, 237, 234, TinkerReport.KEY_APPLIED_LIB_EXTRACT, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_RES_META, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 137, 142, 135, 128, 149, 146, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_META_NOT_FOUND, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL, 177, TinkerReport.KEY_APPLIED_DEX_EXTRACT, 191, TinkerReport.KEY_APPLIED_RESOURCE_EXTRACT, 173, 170, 163, 164, 249, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE, 247, 240, 229, 226, 235, 236, 193, 198, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, TinkerReport.KEY_APPLIED_DEXOPT_FORMAT, TinkerReport.KEY_APPLIED_INFO_CORRUPTED, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, TinkerReport.KEY_APPLIED_EXCEPTION, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, TinkerReport.KEY_APPLIED_PATCH_FILE_EXTRACT, 188, 187, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, 145, TinkerReport.KEY_APPLIED_PACKAGE_CHECK_LIB_META, 159, 138, 141, 132, 131, 222, 217, TinkerReport.KEY_APPLIED_FAIL_COST_60S_LESS, 215, 194, 197, TinkerReport.KEY_APPLIED_SUCC_COST_OTHER, TinkerReport.KEY_APPLIED_SUCC_COST_60S_LESS, 230, 225, 232, 239, TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 244, 243};
    }

    public static int A(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B(int r4, int r5) {
        /*
            r0 = 2
            if (r4 == r0) goto L29
            r1 = 3
            if (r4 == r1) goto L28
            r2 = 4
            if (r4 == r2) goto L26
            r3 = 21
            if (r4 == r3) goto L24
            r3 = 22
            if (r4 == r3) goto L26
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 == r3) goto L29
            r0 = 1342177280(0x50000000, float:8.589935E9)
            if (r4 == r0) goto L24
            r0 = 1610612736(0x60000000, float:3.689349E19)
            if (r4 != r0) goto L1e
            goto L26
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L24:
            r0 = 3
            goto L29
        L26:
            r0 = 4
            goto L29
        L28:
            r0 = 1
        L29:
            int r0 = r0 * r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c0.B(int, int):int");
    }

    public static long C(float f10, long j10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String D(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            c.o("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static String E(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? t0.C(i10, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean F(m4.y0 r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.i()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.B0(r3)
            if (r3 == 0) goto L17
            r4.c()
        L15:
            r0 = 1
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.B0(r3)
            if (r1 == 0) goto L24
            r4.v()
            goto L15
        L24:
            boolean r1 = r4.B0(r2)
            if (r1 == 0) goto L2e
            r4.k()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c0.F(m4.y0):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c0.G(android.net.Uri, java.lang.String):int");
    }

    public static boolean H(s sVar, s sVar2, Inflater inflater) {
        if (sVar.a() <= 0) {
            return false;
        }
        if (sVar2.f16611a.length < sVar.a()) {
            sVar2.b(sVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(sVar.f16611a, sVar.f16612b, sVar.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = sVar2.f16611a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = sVar2.f16611a;
                    if (iInflate == bArr2.length) {
                        sVar2.b(bArr2.length * 2);
                    }
                } else {
                    sVar2.F(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean I(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean J(Context context) {
        int i10 = f16548a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f16551d;
        if (i10 == 30 && (ud.e.s(str, "moto g(20)") || ud.e.s(str, "rmx3231"))) {
            return true;
        }
        return i10 == 34 && ud.e.s(str, "sm-x200");
    }

    public static boolean K(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean L(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void M(int i10, int i11, int i12, ArrayList arrayList) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(arrayList.remove(i10 + i13));
        }
        arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
    }

    public static long N(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String O(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strC0 = ud.e.c0(str);
        int i10 = 0;
        String str2 = strC0.split("-", 2)[0];
        if (f16559l == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f16560m;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            f16559l = map;
        }
        String str4 = (String) f16559l.get(str2);
        if (str4 != null) {
            StringBuilder sbP = h0.p(str4);
            sbP.append(strC0.substring(str2.length()));
            strC0 = sbP.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strC0;
        }
        while (true) {
            String[] strArr2 = f16561n;
            if (i10 >= strArr2.length) {
                return strC0;
            }
            if (strC0.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + strC0.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static Object[] P(int i10, Object[] objArr) {
        c.c(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static long Q(String str) throws p0 {
        Matcher matcher = f16555h.matcher(str);
        if (!matcher.matches()) {
            throw p0.a(null, "Invalid date/time format: " + str);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    public static void R(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void S(int i10, int i11, List list) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static long T(int i10, long j10) {
        return V(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static void U(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jA = a.a.A(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = a.a.A(jArr[i10], jA, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jA2 = a.a.A(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = a.a.P(jArr[i10], jA2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i11] = a.a.A(1000000L, a.a.A(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i11] = W(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = a.a.P(1000000L, a.a.A(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public static long V(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? W(j10, j11, j12, roundingMode) : a.a.P(j11, a.a.A(j10, j12, RoundingMode.UNNECESSARY)) : a.a.A(j11, a.a.A(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : a.a.P(j10, a.a.A(j11, j12, RoundingMode.UNNECESSARY)) : a.a.A(j10, a.a.A(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long W(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c0.W(long, long, long, java.math.RoundingMode):long");
    }

    public static void X(Service service, int i10, Notification notification, int i11, String str) {
        if (f16548a < 29) {
            service.startForeground(i10, notification);
            return;
        }
        try {
            service.startForeground(i10, notification, i11);
        } catch (RuntimeException e10) {
            c.n("Util", "The service must be declared with a foregroundServiceType that includes ".concat(str));
            throw e10;
        }
    }

    public static boolean Y(y0 y0Var, boolean z10) {
        return y0Var == null || !y0Var.r() || y0Var.i() == 1 || y0Var.i() == 4 || (z10 && y0Var.H() != 0);
    }

    public static String[] Z(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int a(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return z10 ? iBinarySearch : i10;
    }

    public static boolean a0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int b(d2.b bVar, long j10) {
        int i10 = bVar.f5449b - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (bVar.d(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < bVar.f5449b && bVar.d(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static e0 b0(cb.y yVar, cb.q qVar) {
        e0 e0Var = new e0();
        b5.h hVar = new b5.h(20, e0Var, yVar);
        cb.r rVar = cb.r.f3875a;
        e0Var.a(hVar, rVar);
        yVar.a(new b5.m(yVar, e0Var, qVar, 7), rVar);
        return e0Var;
    }

    public static int c(List list, Long l10, boolean z10) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, l10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l10) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static long c0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int d(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static int e(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int f(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int i(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long j(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean k(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static boolean l(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i10, int i11, int i12, byte[] bArr) {
        while (i10 < i11) {
            i12 = f16562o[((i12 >>> 24) ^ (bArr[i10] & 255)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler n(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        c.j(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static Handler o(androidx.media3.exoplayer.offline.f fVar) {
        return new Handler(v(), fVar);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return 23;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static AudioFormat r(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int s(int i10) {
        int i11 = f16548a;
        if (i10 == 10) {
            return i11 >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return i11 >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return TinkerReport.KEY_APPLIED_SUCC_COST_OTHER;
            case 5:
                return 220;
            case 6:
                return TinkerReport.KEY_LOADED_EXCEPTION_DEX;
            case 7:
                return 1276;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return 6396;
            default:
                return 0;
        }
    }

    public static int t(int i10, String str) {
        int i11 = 0;
        for (String str2 : Z(str)) {
            if (i10 == o0.i(o0.e(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String u(int i10, String str) {
        String[] strArrZ = Z(str);
        if (strArrZ.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrZ) {
            if (i10 == o0.i(o0.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static Looper v() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int w(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int x(String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static long y(float f10, long j10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long z(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }
}
