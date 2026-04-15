package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.L;
import com.tencent.bugly.proguard.T;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.ca;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4737a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f4738b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4739c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f4740d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f4741e = 20480;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f4742f = 20480;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static long f4743g = 604800000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f4744h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f4745i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f4746j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f4747k = 5000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f4748l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f4749m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f4750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f4751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static h f4752p;
    private int A = 31;
    private boolean B = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f4753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f4754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final l f4755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final NativeCrashHandler f4756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.tencent.bugly.crashreport.common.strategy.c f4757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final W f4758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.crash.anr.h f4759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BuglyStrategy.a f4760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m f4761y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f4762z;

    public h(int i10, Context context, W w10, boolean z10, BuglyStrategy.a aVar, m mVar, String str) {
        f4737a = i10;
        Context contextA = ca.a(context);
        this.f4753q = contextA;
        com.tencent.bugly.crashreport.common.strategy.c cVarB = com.tencent.bugly.crashreport.common.strategy.c.b();
        this.f4757u = cVarB;
        this.f4758v = w10;
        this.f4760x = aVar;
        this.f4761y = mVar;
        T tA = T.a();
        J jA = J.a();
        e eVar = new e(i10, contextA, tA, jA, cVarB, aVar, mVar);
        this.f4754r = eVar;
        com.tencent.bugly.crashreport.common.info.a aVarA = com.tencent.bugly.crashreport.common.info.a.a(contextA);
        this.f4755s = new l(contextA, eVar, cVarB, aVarA);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextA, aVarA, eVar, cVarB, w10, z10, str);
        this.f4756t = nativeCrashHandler;
        aVarA.f4593pa = nativeCrashHandler;
        this.f4759w = com.tencent.bugly.crashreport.crash.anr.h.a(contextA, cVarB, aVarA, w10, jA, eVar, aVar);
    }

    public static synchronized h g() {
        return f4752p;
    }

    public void c() {
        this.f4759w.b(false);
    }

    public void d() {
        this.f4755s.b();
    }

    public void e() {
        this.f4756t.setUserOpened(false);
    }

    public boolean f() {
        return this.B;
    }

    public boolean h() {
        Boolean bool = this.f4762z;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = com.tencent.bugly.crashreport.common.info.a.m().f4576h;
        List<L> listA = J.a().a(1);
        ArrayList arrayList = new ArrayList();
        if (listA == null || listA.size() <= 0) {
            this.f4762z = Boolean.FALSE;
            return false;
        }
        for (L l10 : listA) {
            if (str.equals(l10.f4874c)) {
                this.f4762z = Boolean.TRUE;
                arrayList.add(l10);
            }
        }
        if (arrayList.size() > 0) {
            J.a().a(arrayList);
        }
        return true;
    }

    public boolean i() {
        return this.f4759w.b();
    }

    public boolean j() {
        return (this.A & 8) > 0;
    }

    public boolean k() {
        return (this.A & 16) > 0;
    }

    public boolean l() {
        return (this.A & 2) > 0;
    }

    public boolean m() {
        return (this.A & 1) > 0;
    }

    public boolean n() {
        return (this.A & 4) > 0;
    }

    public synchronized void o() {
        r();
        s();
        p();
    }

    public void p() {
        this.f4759w.b(true);
    }

    public void q() {
        this.f4756t.enableCatchAnrTrace();
    }

    public void r() {
        this.f4755s.a();
    }

    public void s() {
        this.f4756t.setUserOpened(true);
    }

    public synchronized void t() {
        this.f4759w.g();
    }

    public void u() {
        this.f4756t.checkUploadRecordCrash();
    }

    public static synchronized h a(int i10, Context context, boolean z10, BuglyStrategy.a aVar, m mVar, String str) {
        try {
            if (f4752p == null) {
                f4752p = new h(i10, context, W.c(), z10, aVar, mVar, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4752p;
    }

    public synchronized void b() {
        d();
        e();
        c();
    }

    public void a(StrategyBean strategyBean) {
        this.f4755s.a(strategyBean);
        this.f4756t.onStrategyChanged(strategyBean);
        this.f4759w.a(strategyBean);
        a(3000L);
    }

    public synchronized void a(boolean z10, boolean z11, boolean z12) {
        this.f4756t.testNativeCrash(z10, z11, z12);
    }

    public void a(Thread thread, Throwable th2, boolean z10, String str, byte[] bArr, boolean z11) {
        this.f4758v.a(new a(this, z10, thread, th2, str, bArr, z11));
    }

    public void a(CrashDetailBean crashDetailBean) {
        this.f4754r.f(crashDetailBean);
    }

    public void a(long j10) {
        W.c().a(new c(0, this), j10);
    }

    public void a() {
        if (com.tencent.bugly.crashreport.common.info.a.m().f4576h.equals(AppInfo.d(this.f4753q))) {
            this.f4756t.removeEmptyNativeRecordFiles();
        }
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(boolean z10) {
        this.B = z10;
    }
}
