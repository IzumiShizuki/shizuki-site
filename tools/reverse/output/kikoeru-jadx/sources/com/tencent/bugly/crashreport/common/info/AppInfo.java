package com.tencent.bugly.crashreport.common.info;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.bugly.proguard.X;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class AppInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f4557a = "@buglyAllChannel@".split(",");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4558b = "@buglyAllChannelPriority@".split(",");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ActivityManager f4559c;

    public static boolean a(Context context, String str) {
        if (context != null && str != null && str.trim().length() > 0) {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str.equals(str2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public static Map<String, String> b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return null;
            }
            HashMap map = new HashMap();
            Object obj = applicationInfo.metaData.get("BUGLY_DISABLE");
            if (obj != null) {
                map.put("BUGLY_DISABLE", obj.toString());
            }
            Object obj2 = applicationInfo.metaData.get("BUGLY_APPID");
            if (obj2 != null) {
                map.put("BUGLY_APPID", obj2.toString());
            }
            Object obj3 = applicationInfo.metaData.get("BUGLY_APP_CHANNEL");
            if (obj3 != null) {
                map.put("BUGLY_APP_CHANNEL", obj3.toString());
            }
            Object obj4 = applicationInfo.metaData.get("BUGLY_APP_VERSION");
            if (obj4 != null) {
                map.put("BUGLY_APP_VERSION", obj4.toString());
            }
            Object obj5 = applicationInfo.metaData.get("BUGLY_ENABLE_DEBUG");
            if (obj5 != null) {
                map.put("BUGLY_ENABLE_DEBUG", obj5.toString());
            }
            Object obj6 = applicationInfo.metaData.get("com.tencent.rdm.uuid");
            if (obj6 != null) {
                map.put("com.tencent.rdm.uuid", obj6.toString());
            }
            Object obj7 = applicationInfo.metaData.get("BUGLY_APP_BUILD_NO");
            if (obj7 != null) {
                map.put("BUGLY_APP_BUILD_NO", obj7.toString());
            }
            Object obj8 = applicationInfo.metaData.get("BUGLY_AREA");
            if (obj8 != null) {
                map.put("BUGLY_AREA", obj8.toString());
            }
            return map;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static PackageInfo c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(d(context), 0);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageName();
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static boolean e(Context context) {
        if (context == null) {
            return false;
        }
        if (f4559c == null) {
            f4559c = (ActivityManager) context.getSystemService("activity");
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            f4559c.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory) {
                return false;
            }
            X.a("Memory is low.", new Object[0]);
            return true;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    public static String a(Context context, int i10) {
        FileReader fileReader;
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(i10);
            sb.append("/cmdline");
            fileReader = new FileReader(sb.toString());
        } catch (Throwable th2) {
            th = th2;
            fileReader = null;
        }
        try {
            char[] cArr = new char[512];
            fileReader.read(cArr);
            int i11 = 0;
            while (i11 < 512 && cArr[i11] != 0) {
                i11++;
            }
            String strSubstring = new String(cArr).substring(0, i11);
            try {
                fileReader.close();
            } catch (Throwable unused) {
            }
            return strSubstring;
        } catch (Throwable th3) {
            th = th3;
            try {
                if (!X.b(th)) {
                    th.printStackTrace();
                }
                String strValueOf = String.valueOf(i10);
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable unused2) {
                    }
                }
                return strValueOf;
            } finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public static String a(Context context) {
        CharSequence applicationLabel;
        if (context == null) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (packageManager != null && applicationInfo != null && (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) != null) {
                return applicationLabel.toString();
            }
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    public static List<String> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            String str = map.get("BUGLY_DISABLE");
            if (str == null || str.length() == 0) {
                return null;
            }
            String[] strArrSplit = str.split(",");
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                strArrSplit[i10] = strArrSplit[i10].trim();
            }
            return Arrays.asList(strArrSplit);
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }
}
