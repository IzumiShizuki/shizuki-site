package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.crashreport.biz.f;
import com.tencent.bugly.crashreport.common.strategy.c;
import com.tencent.bugly.proguard.H;
import com.tencent.bugly.proguard.I;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.T;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ba;
import com.tencent.bugly.proguard.ca;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4348a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<a> f4349b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static J f4351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f4352e;

    private static boolean a(com.tencent.bugly.crashreport.common.info.a aVar) {
        List<String> list = aVar.P;
        return list != null && list.contains("bugly");
    }

    public static synchronized void a(Context context) {
        a(context, (BuglyStrategy) null);
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        if (f4352e) {
            X.e("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(X.f4917b, "[init] context of init() is null, check it.");
            return;
        }
        com.tencent.bugly.crashreport.common.info.a aVarA = com.tencent.bugly.crashreport.common.info.a.a(context);
        if (a(aVarA)) {
            f4348a = false;
            return;
        }
        String strE = aVarA.e();
        if (strE == null) {
            Log.e(X.f4917b, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
        } else {
            a(context, strE, aVarA.f4566ba, buglyStrategy);
        }
    }

    public static synchronized void a(Context context, String str, boolean z10, BuglyStrategy buglyStrategy) {
        if (f4352e) {
            X.e("[init] initial Multi-times, ignore this.", new Object[0]);
            return;
        }
        if (context == null) {
            Log.w(X.f4917b, "[init] context is null, check it.");
            return;
        }
        if (str == null) {
            Log.e(X.f4917b, "init arg 'crashReportAppID' should not be null!");
            return;
        }
        f4352e = true;
        if (z10) {
            f4350c = true;
            X.f4918c = true;
            X.e("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
            X.b("--------------------------------------------------------------------------------------------", new Object[0]);
            X.e("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
            X.e("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
            X.e("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
            X.e("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
            X.b("--------------------------------------------------------------------------------------------", new Object[0]);
            X.d("[init] Open debug mode of Bugly.", new Object[0]);
        }
        X.c(" crash report start initializing...", new Object[0]);
        X.d("[init] Bugly start initializing...", new Object[0]);
        X.c("[init] Bugly complete version: v%s", "3.4.12(1.5.23)");
        Context contextA = ca.a(context);
        com.tencent.bugly.crashreport.common.info.a aVarA = com.tencent.bugly.crashreport.common.info.a.a(contextA);
        aVarA.E();
        ba.a(contextA);
        f4351d = J.a(contextA, f4349b);
        T.a(contextA);
        c cVarA = c.a(contextA, f4349b);
        H hA = H.a(contextA);
        if (a(aVarA)) {
            f4348a = false;
            return;
        }
        aVarA.c(str);
        X.c("[param] Set APP ID:%s", str);
        a(buglyStrategy, aVarA);
        for (int i10 = 0; i10 < f4349b.size(); i10++) {
            try {
                if (hA.a(f4349b.get(i10).f4347id)) {
                    f4349b.get(i10).init(contextA, z10, buglyStrategy);
                }
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        f.b(contextA, buglyStrategy);
        cVarA.a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
        X.d("[init] Bugly initialization finished.", new Object[0]);
    }

    private static void a(BuglyStrategy buglyStrategy, com.tencent.bugly.crashreport.common.info.a aVar) {
        byte[] bArr;
        if (buglyStrategy == null) {
            return;
        }
        String appVersion = buglyStrategy.getAppVersion();
        if (!TextUtils.isEmpty(appVersion)) {
            if (appVersion.length() > 100) {
                String strSubstring = appVersion.substring(0, 100);
                X.e("appVersion %s length is over limit %d substring to %s", appVersion, 100, strSubstring);
                appVersion = strSubstring;
            }
            aVar.E = appVersion;
            X.c("[param] Set App version: %s", buglyStrategy.getAppVersion());
        }
        try {
            if (buglyStrategy.isReplaceOldChannel()) {
                String appChannel = buglyStrategy.getAppChannel();
                if (!TextUtils.isEmpty(appChannel)) {
                    if (appChannel.length() > 100) {
                        String strSubstring2 = appChannel.substring(0, 100);
                        X.e("appChannel %s length is over limit %d substring to %s", appChannel, 100, strSubstring2);
                        appChannel = strSubstring2;
                    }
                    f4351d.a(556, "app_channel", appChannel.getBytes(), (I) null, false);
                    aVar.I = appChannel;
                }
            } else {
                Map<String, byte[]> mapA = f4351d.a(556, (I) null, true);
                if (mapA != null && (bArr = mapA.get("app_channel")) != null) {
                    aVar.I = new String(bArr);
                }
            }
            X.c("[param] Set App channel: %s", aVar.I);
        } catch (Exception e10) {
            if (f4350c) {
                e10.printStackTrace();
            }
        }
        String appPackageName = buglyStrategy.getAppPackageName();
        if (!TextUtils.isEmpty(appPackageName)) {
            if (appPackageName.length() > 100) {
                String strSubstring3 = appPackageName.substring(0, 100);
                X.e("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, strSubstring3);
                appPackageName = strSubstring3;
            }
            aVar.f4575g = appPackageName;
            X.c("[param] Set App package: %s", buglyStrategy.getAppPackageName());
        }
        String deviceID = buglyStrategy.getDeviceID();
        if (deviceID != null) {
            if (deviceID.length() > 100) {
                String strSubstring4 = deviceID.substring(0, 100);
                X.e("deviceId %s length is over limit %d substring to %s", deviceID, 100, strSubstring4);
                deviceID = strSubstring4;
            }
            aVar.d(deviceID);
            X.c("[param] Set device ID: %s", deviceID);
        }
        aVar.f4580j = buglyStrategy.isUploadProcess();
        ba.f4923c = buglyStrategy.isBuglyLogUpload();
    }

    public static synchronized void a(a aVar) {
        if (!f4349b.contains(aVar)) {
            f4349b.add(aVar);
        }
    }
}
