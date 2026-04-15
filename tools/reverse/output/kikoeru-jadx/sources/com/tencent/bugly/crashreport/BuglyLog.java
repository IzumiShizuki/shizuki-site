package com.tencent.bugly.crashreport;

import android.util.Log;
import com.tencent.bugly.proguard.ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BuglyLog {
    public static void d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.d(str, str2);
        }
        ba.c("D", str, str2);
    }

    public static void e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.e(str, str2);
        }
        ba.c("E", str, str2);
    }

    public static void i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.i(str, str2);
        }
        ba.c("I", str, str2);
    }

    public static void setCache(int i10) {
        ba.a(i10);
    }

    public static void v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.v(str, str2);
        }
        ba.c("V", str, str2);
    }

    public static void w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.w(str, str2);
        }
        ba.c("W", str, str2);
    }

    public static void e(String str, String str2, Throwable th2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (com.tencent.bugly.b.f4350c) {
            Log.e(str, str2, th2);
        }
        ba.a("E", str, th2);
    }
}
