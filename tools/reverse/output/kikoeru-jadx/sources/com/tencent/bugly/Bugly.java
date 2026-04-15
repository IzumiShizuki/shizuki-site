package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.proguard.I;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class Bugly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f4321a = false;
    public static Context applicationContext = null;
    public static boolean enable = true;

    public static synchronized String getAppChannel() {
        byte[] bArr;
        com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
        if (aVarM == null) {
            return null;
        }
        if (TextUtils.isEmpty(aVarM.I)) {
            J jA = J.a();
            if (jA == null) {
                return aVarM.I;
            }
            Map<String, byte[]> mapA = jA.a(556, (I) null, true);
            if (mapA != null && (bArr = mapA.get("app_channel")) != null) {
                return new String(bArr);
            }
        }
        return aVarM.I;
    }

    public static void init(Context context, String str, boolean z10) {
        init(context, str, z10, null);
    }

    public static void putUserData(Context context, String str, String str2) {
        CrashReport.putUserData(context, str, str2);
    }

    public static void setAppChannel(Context context, String str) {
        CrashReport.setAppChannel(context, str);
    }

    public static void setIsDevelopmentDevice(Context context, boolean z10) {
        CrashReport.setIsDevelopmentDevice(context, z10);
    }

    public static void setUserId(Context context, String str) {
        CrashReport.setUserId(context, str);
    }

    public static void setUserTag(Context context, int i10) {
        CrashReport.setUserSceneTag(context, i10);
    }

    public static synchronized void init(Context context, String str, boolean z10, BuglyStrategy buglyStrategy) {
        if (f4321a) {
            return;
        }
        f4321a = true;
        Context contextA = ca.a(context);
        applicationContext = contextA;
        if (contextA == null) {
            Log.e(X.f4917b, "init arg 'context' should not be null!");
            return;
        }
        b.a(CrashModule.getInstance());
        b.a(Beta.getInstance());
        b.f4348a = enable;
        b.a(applicationContext, str, z10, buglyStrategy);
    }
}
