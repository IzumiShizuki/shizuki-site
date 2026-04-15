package com.tencent.bugly.proguard;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f4916a = "CrashReportInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4917b = "CrashReport";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4918c = false;

    private static boolean a(int i10, String str, Object... objArr) {
        if (!f4918c) {
            return false;
        }
        String strF = f(str, objArr);
        if (i10 == 0) {
            Log.i(f4917b, strF);
            return true;
        }
        if (i10 == 1) {
            Log.d(f4917b, strF);
            return true;
        }
        if (i10 == 2) {
            Log.w(f4917b, strF);
            return true;
        }
        if (i10 == 3) {
            Log.e(f4917b, strF);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Log.i(f4916a, strF);
        return true;
    }

    public static boolean b(Throwable th2) {
        return a(2, th2);
    }

    public static boolean c(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    private static String f(String str, Object... objArr) {
        return str == null ? "null" : (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    public static boolean b(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean c(Class cls, String str, Object... objArr) {
        Locale locale = Locale.US;
        return a(0, "[" + cls.getSimpleName() + "] " + str, objArr);
    }

    public static boolean b(Class cls, String str, Object... objArr) {
        Locale locale = Locale.US;
        return a(3, "[" + cls.getSimpleName() + "] " + str, objArr);
    }

    private static boolean a(int i10, Throwable th2) {
        if (f4918c) {
            return a(i10, ca.b(th2), new Object[0]);
        }
        return false;
    }

    public static boolean a(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        Locale locale = Locale.US;
        return a(1, "[" + cls.getSimpleName() + "] " + str, objArr);
    }

    public static boolean a(Throwable th2) {
        return a(3, th2);
    }
}
