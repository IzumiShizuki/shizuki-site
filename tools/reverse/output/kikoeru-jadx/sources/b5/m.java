package b5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import b0.c1;
import b7.b1;
import b7.c2;
import b7.c3;
import b7.e2;
import b7.e4;
import b7.f4;
import b7.i4;
import b7.k4;
import b7.o2;
import b7.p1;
import b7.s3;
import b7.t1;
import b7.u1;
import b7.v1;
import b7.y1;
import b7.z3;
import c7.k1;
import com.cnl.kikoeru.MainService;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.f1;
import m4.y0;
import v4.j0;
import v4.q0;
import ya.a1;
import ya.i0;
import ya.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1583d;

    public /* synthetic */ m(p1 p1Var, b7.d0 d0Var, String str, Bundle bundle) {
        this.f1580a = 1;
        this.f1581b = d0Var;
        this.f1582c = str;
        this.f1583d = bundle;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b5.r, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        e4 e4Var;
        switch (this.f1580a) {
            case 0:
                q qVar = (q) this.f1581b;
                this.f1582c.x(qVar.f1593a, qVar.f1594b, (Exception) this.f1583d);
                return;
            case 1:
                b7.d0 d0Var = (b7.d0) this.f1581b;
                String str = (String) this.f1582c;
                Bundle bundle = (Bundle) this.f1583d;
                d0Var.f();
                b7.c0 c0Var = d0Var.f1705b;
                o1 it = (!c0Var.T() ? f4.f1776b : c0Var.O()).f1778a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        e4Var = (e4) it.next();
                        if (e4Var.f1761a != 0 || !e4Var.f1762b.equals(str)) {
                        }
                    } else {
                        e4Var = null;
                    }
                }
                if (e4Var != null) {
                    d0Var.f();
                    if ((!c0Var.T() ? f4.f1776b : c0Var.O()).f1778a.contains(e4Var)) {
                        e4 e4Var2 = new e4(str, bundle);
                        Bundle bundle2 = Bundle.EMPTY;
                        d0Var.f();
                        cb.y yVarR = c0Var.T() ? c0Var.R(e4Var2) : g8.a.Q(new i4(-100));
                        yVarR.a(new cb.t(0, yVarR, new app.nekogram.translator.r(1, str)), cb.r.f3875a);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                c2 c2Var = (c2) this.f1581b;
                Runnable runnable = (Runnable) this.f1582c;
                t1 t1Var = (t1) this.f1583d;
                c2Var.getClass();
                runnable.run();
                c2Var.f1680g.f2047g.F(t1Var);
                return;
            case 3:
                y1 y1Var = (y1) this.f1581b;
                t1 t1Var2 = (t1) this.f1582c;
                KeyEvent keyEvent = (KeyEvent) this.f1583d;
                c2 c2Var2 = (c2) y1Var.f2207c;
                if (c2Var2.g(t1Var2)) {
                    c2Var2.a(keyEvent, false);
                } else {
                    o2 o2Var = c2Var2.f1681h;
                    k1 k1Var = t1Var2.f2095a;
                    k1Var.getClass();
                    o2Var.getClass();
                    o2Var.H(1, new e2(o2Var, 1), k1Var, true);
                }
                y1Var.f2206b = null;
                return;
            case 4:
                MainService mainService = (MainService) this.f1581b;
                p1 p1Var = (p1) this.f1582c;
                v1 v1Var = (v1) this.f1583d;
                MainService mainService2 = p1Var.f2022a;
                HashMap map = p1Var.f2028g;
                if (!map.containsKey(v1Var)) {
                    b7.o1 o1Var = new b7.o1(mainService2, v1Var);
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    k4 k4Var = v1Var.f2118a.f1683j;
                    k4Var.getClass();
                    Bundle bundle4 = Bundle.EMPTY;
                    p4.c0.v();
                    Bundle bundle5 = new Bundle(bundle3);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    b7.f0 f0Var = new b7.f0(mainLooper);
                    p4.c0.R(new Handler(mainLooper), new b7.z(f0Var, new b7.d0(mainService2, k4Var, bundle5, o1Var, mainLooper, f0Var, k4Var.f1919a.i() ? new androidx.media3.exoplayer.offline.u(new s4.i(mainService2)) : null), 0));
                    map.put(v1Var, f0Var);
                    f0Var.a(new b7.f(p1Var, f0Var, o1Var, v1Var, 1), p1Var.f2026e);
                }
                v1Var.f2118a.f1696w = new c1(2, mainService);
                return;
            case 5:
                c2 c2Var3 = (c2) this.f1581b;
                c3 c3Var = (c3) this.f1582c;
                u1 u1Var = (u1) this.f1583d;
                if (c2Var3.h()) {
                    return;
                }
                z3 z3Var = c2Var3.f1693t;
                c3Var.getClass();
                s3.i(z3Var, u1Var);
                return;
            case 6:
                c4.n nVar = (c4.n) this.f1581b;
                android.support.v4.media.session.b bVar = (android.support.v4.media.session.b) this.f1582c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1583d;
                try {
                    c4.u uVarD = a2.c.D(nVar.f3388a);
                    if (uVarD == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    c4.t tVar = (c4.t) ((c4.j) uVarD.f3368b);
                    synchronized (tVar.f3402d) {
                        tVar.f3404f = threadPoolExecutor;
                        break;
                    }
                    ((c4.j) uVarD.f3368b).a(new c4.m(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    bVar.N(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 7:
                cb.y yVar = (cb.y) this.f1581b;
                cb.e0 e0Var = (cb.e0) this.f1582c;
                try {
                    try {
                        e0Var.m(((cb.q) this.f1583d).apply(g8.a.B(yVar)));
                        return;
                    } catch (Throwable th3) {
                        e0Var.l(th3);
                        return;
                    }
                } catch (Error e10) {
                    e = e10;
                    e0Var.l(e);
                    return;
                } catch (CancellationException unused) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e11) {
                    e = e11;
                    e0Var.l(e);
                    return;
                } catch (ExecutionException e12) {
                    e = e12;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.l(e);
                    return;
                }
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                cb.e0 e0Var2 = (cb.e0) this.f1581b;
                h hVar = (h) this.f1582c;
                i4 i4Var = (i4) this.f1583d;
                try {
                    if (e0Var2.f3872a instanceof cb.a) {
                        return;
                    }
                    hVar.run();
                    e0Var2.k(i4Var);
                    return;
                } catch (Throwable th4) {
                    e0Var2.l(th4);
                    return;
                }
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                j0 j0Var = (j0) this.f1581b;
                ya.f0 f0Var2 = (ya.f0) this.f1582c;
                j5.d0 d0Var2 = (j5.d0) this.f1583d;
                w4.d dVar = j0Var.f22544c;
                a1 a1VarF = f0Var2.f();
                b1 b1Var = dVar.f23352d;
                y0 y0Var = dVar.f23355g;
                y0Var.getClass();
                b1Var.getClass();
                b1Var.f1653e = i0.q(a1VarF);
                if (!a1VarF.isEmpty()) {
                    b1Var.f1654f = (j5.d0) a1VarF.get(0);
                    d0Var2.getClass();
                    b1Var.f1655g = d0Var2;
                }
                if (((j5.d0) b1Var.f1652d) == null) {
                    b1Var.f1652d = b1.u(y0Var, (i0) b1Var.f1653e, (j5.d0) b1Var.f1654f, (f1) b1Var.f1650b);
                }
                b1Var.L(y0Var.J());
                return;
            default:
                q0 q0Var = (q0) this.f1581b;
                Pair pair = (Pair) this.f1582c;
                q0Var.f22620b.f22643h.x(((Integer) pair.first).intValue(), (j5.d0) pair.second, (Exception) this.f1583d);
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f1580a = i10;
        this.f1581b = obj;
        this.f1582c = obj2;
        this.f1583d = obj3;
    }
}
