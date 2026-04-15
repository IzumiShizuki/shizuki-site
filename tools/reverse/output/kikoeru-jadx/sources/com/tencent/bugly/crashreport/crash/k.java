package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import c7.r;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C0011o;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ba;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f4802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.strategy.c f4803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.tencent.bugly.crashreport.common.info.a f4804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f4805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f4806e;

    private k(Context context) {
        h hVarG = h.g();
        if (hVarG == null) {
            return;
        }
        this.f4803b = com.tencent.bugly.crashreport.common.strategy.c.b();
        this.f4804c = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.f4805d = hVarG.f4754r;
        this.f4806e = context;
        W.c().a(new r(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        X.a("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            this.f4804c.getClass();
            ca.a((Class<?>) C0011o.class, "sdkPackageName", "com.tencent.bugly", (Object) null);
            X.a("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            X.c("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    private CrashDetailBean c(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.h();
        crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.j();
        crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.g();
        crashDetailBean.F = this.f4804c.v();
        crashDetailBean.G = this.f4804c.w();
        crashDetailBean.H = this.f4804c.x();
        crashDetailBean.f4675w = ca.a(this.f4806e, h.f4741e, h.f4744h);
        crashDetailBean.f4654b = i10;
        crashDetailBean.f4657e = this.f4804c.l();
        com.tencent.bugly.crashreport.common.info.a aVar = this.f4804c;
        crashDetailBean.f4658f = aVar.E;
        crashDetailBean.f4659g = aVar.i();
        crashDetailBean.f4665m = this.f4804c.y();
        String str4 = "";
        crashDetailBean.f4666n = h0.x("", str);
        crashDetailBean.f4667o = h0.x("", str2);
        if (str3 != null) {
            String[] strArrSplit = str3.split("\n");
            if (strArrSplit.length > 0) {
                str4 = strArrSplit[0];
            }
        } else {
            str3 = "";
        }
        crashDetailBean.f4668p = str4;
        crashDetailBean.f4669q = str3;
        crashDetailBean.f4670r = System.currentTimeMillis();
        crashDetailBean.f4673u = ca.c(crashDetailBean.f4669q.getBytes());
        crashDetailBean.f4678z = ca.a(h.f4742f, false);
        crashDetailBean.A = this.f4804c.f4576h;
        crashDetailBean.B = thread.getName() + "(" + thread.getId() + ")";
        crashDetailBean.I = this.f4804c.r();
        crashDetailBean.f4660h = this.f4804c.p();
        com.tencent.bugly.crashreport.common.info.a aVar2 = this.f4804c;
        crashDetailBean.N = aVar2.f4569d;
        crashDetailBean.O = aVar2.C();
        if (!h.g().f()) {
            this.f4805d.d(crashDetailBean);
        }
        crashDetailBean.R = this.f4804c.A();
        crashDetailBean.S = this.f4804c.t();
        crashDetailBean.T = this.f4804c.h();
        crashDetailBean.U = this.f4804c.g();
        crashDetailBean.f4677y = ba.b();
        if (crashDetailBean.P == null) {
            crashDetailBean.P = new LinkedHashMap();
        }
        if (map != null) {
            crashDetailBean.P.putAll(map);
        }
        return crashDetailBean;
    }

    public static k a(Context context) {
        if (f4802a == null) {
            f4802a = new k(context);
        }
        return f4802a;
    }

    public static void a(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        W.c().a(new d(thread, i10, str, str2, str3, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        String str4;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i10 == 4) {
            str4 = "Unity";
        } else if (i10 == 5 || i10 == 6) {
            str4 = "Cocos";
        } else {
            if (i10 != 8) {
                X.e("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i10));
                return;
            }
            str4 = "H5";
        }
        X.b("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!this.f4803b.d()) {
                X.e("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanC = this.f4803b.c();
            if (!strategyBeanC.f4622f && this.f4803b.d()) {
                X.b("[ExtraCrashManager] Crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                e.a(str4, ca.a(), this.f4804c.f4576h, threadCurrentThread.getName(), str + "\n" + str2 + "\n" + str3, null);
                X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            String str5 = str4;
            if (i10 != 5 && i10 != 6) {
                if (i10 == 8 && !strategyBeanC.f4628l) {
                    X.b("[ExtraCrashManager] %s report is disabled.", str5);
                    X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanC.f4627k) {
                X.b("[ExtraCrashManager] %s report is disabled.", str5);
                X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            CrashDetailBean crashDetailBeanC = c(threadCurrentThread, i10 == 8 ? 5 : i10, str, str2, str3, map);
            if (crashDetailBeanC == null) {
                X.b("[ExtraCrashManager] Failed to package crash data.", new Object[0]);
                X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            e.a(str5, ca.a(), this.f4804c.f4576h, threadCurrentThread.getName(), str + "\n" + str2 + "\n" + str3, crashDetailBeanC);
            if (!this.f4805d.c(crashDetailBeanC)) {
                this.f4805d.a(crashDetailBeanC, 3000L, false);
            }
            X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th2) {
            try {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th3) {
                X.b("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th3;
            }
        }
    }
}
