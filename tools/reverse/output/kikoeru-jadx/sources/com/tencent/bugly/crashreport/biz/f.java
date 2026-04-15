package com.tencent.bugly.crashreport.biz;

import android.app.Application;
import android.content.Context;
import cb.t;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.List;
import ob.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4544a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4545b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f4546c = 300000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f4547d = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f4548e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f4549f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f4550g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f4551h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static c f4552i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static long f4553j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f4554k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Class<?> f4555l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f4556m = true;

    public static /* synthetic */ int i() {
        int i10 = f4549f;
        f4549f = i10 + 1;
        return i10;
    }

    public static void l() {
        c cVar = f4552i;
        if (cVar != null) {
            cVar.a(2, false, 0L);
        }
    }

    private static void m() {
        a aVarM = a.m();
        if (aVarM == null) {
            return;
        }
        String className = null;
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getMethodName().equals("onCreate")) {
                className = stackTraceElement.getClassName();
            }
            if (stackTraceElement.getClassName().equals("android.app.Activity")) {
                z10 = true;
            }
        }
        if (className == null) {
            className = "unknown";
        } else if (z10) {
            aVarM.a(true);
        } else {
            className = "background";
        }
        aVarM.W = className;
    }

    private static void n() {
        f4551h = System.currentTimeMillis();
        f4552i.a(1, false, 0L);
        X.c("[session] launch app, new start", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, BuglyStrategy buglyStrategy) {
        boolean zIsEnableUserInfo;
        boolean zRecordUserInfoOnceADay;
        boolean z10 = false;
        if (buglyStrategy != null) {
            zRecordUserInfoOnceADay = buglyStrategy.recordUserInfoOnceADay();
            zIsEnableUserInfo = buglyStrategy.isEnableUserInfo();
        } else {
            zIsEnableUserInfo = true;
            zRecordUserInfoOnceADay = false;
        }
        if (!zRecordUserInfoOnceADay) {
            z10 = zIsEnableUserInfo;
        } else if (!b(context)) {
            return;
        }
        m();
        if (z10) {
            c(context);
        }
        if (f4556m) {
            n();
            f4552i.a();
            f4552i.b(21600000L);
        }
    }

    private static void d(Context context) {
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application == null) {
            return;
        }
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f4554k;
            if (activityLifecycleCallbacks != null) {
                application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        } catch (Exception e10) {
            if (X.b(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }

    private static boolean b(Context context) {
        a aVarA = a.a(context);
        List<UserInfoBean> listA = f4552i.a(aVarA.f4576h);
        if (listA == null) {
            return true;
        }
        for (int i10 = 0; i10 < listA.size(); i10++) {
            UserInfoBean userInfoBean = listA.get(i10);
            if (userInfoBean.f4534n.equals(aVarA.E) && userInfoBean.f4522b == 1) {
                long jB = ca.b();
                if (jB <= 0) {
                    return true;
                }
                if (userInfoBean.f4525e >= jB) {
                    if (userInfoBean.f4526f <= 0) {
                        f4552i.b();
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void a(StrategyBean strategyBean, boolean z10) {
        c cVar = f4552i;
        if (cVar != null && !z10) {
            cVar.b();
        }
        if (strategyBean == null) {
            return;
        }
        long j10 = strategyBean.f4632p;
        if (j10 > 0) {
            f4547d = j10;
        }
        int i10 = strategyBean.f4637u;
        if (i10 > 0) {
            f4545b = i10;
        }
        long j11 = strategyBean.f4638v;
        if (j11 > 0) {
            f4546c = j11;
        }
    }

    public static void c(long j10) {
        if (j10 < 0) {
            j10 = com.tencent.bugly.crashreport.common.strategy.c.b().c().f4632p;
        }
        f4548e = j10;
    }

    public static void a(Context context) {
        if (!f4544a || context == null) {
            return;
        }
        d(context);
        f4544a = false;
    }

    private static void c(Context context) {
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application == null) {
            return;
        }
        try {
            if (f4554k == null) {
                f4554k = new d();
            }
            application.registerActivityLifecycleCallbacks(f4554k);
        } catch (Exception e10) {
            if (X.b(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }

    public static void b(Context context, BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f4544a) {
            return;
        }
        boolean z10 = a.a(context).f4580j;
        f4556m = z10;
        f4552i = new c(context, z10);
        f4544a = true;
        if (buglyStrategy != null) {
            f4555l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            c(context, buglyStrategy);
        } else {
            W.c().a(new t(7, context, buglyStrategy), appReportDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2) {
        return ca.a() + "  " + str + "  " + str2 + "\n";
    }
}
