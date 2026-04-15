package i9;

import android.app.ActivityManager;
import android.content.Intent;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.MainService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m4.i0;
import m4.i1;
import m4.l0;
import m4.n0;
import m4.o1;
import m4.q1;
import m4.r0;
import m4.s0;
import m4.u0;
import m4.u1;
import m4.v0;
import m4.w0;
import m4.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements w0 {
    @Override // m4.w0
    public final void U(boolean z10) {
        boolean z11;
        Object objB;
        Boolean boolValueOf = Boolean.valueOf(g9.a.c());
        boolean zBooleanValue = ((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "disableNotification", boolValueOf)).booleanValue();
        MainApplication mainApplicationA = a9.i.a();
        jc.l.e(mainApplicationA, "ctx");
        Object systemService = mainApplicationA.getSystemService("activity");
        jc.l.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(100);
        jc.l.d(runningServices, "getRunningServices(...)");
        List<ActivityManager.RunningServiceInfo> list = runningServices;
        if ((list instanceof Collection) && list.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (jc.l.a(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), MainService.class.getName())) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        }
        if (!z10 || z11 || zBooleanValue) {
            return;
        }
        try {
            objB = a9.i.a().startService(new Intent(a9.i.a(), (Class<?>) MainService.class));
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        Throwable thA = ub.n.a(objB);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    @Override // m4.w0
    public final /* synthetic */ void I() {
    }

    @Override // m4.w0
    public final /* synthetic */ void C(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void E(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void F(u1 u1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void J(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void K(List list) {
    }

    @Override // m4.w0
    public final /* synthetic */ void M(v0 v0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void N(long j10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void O(r0 r0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void Q(n0 n0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void R(m4.d dVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void S(o1 o1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void b(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void c(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void d(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void e(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void f(l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void h(l0 l0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void i(r0 r0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void j(q1 q1Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void l(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void o(s0 s0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void p(float f10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void r(int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void s(o4.c cVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void t(boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void u(m4.k kVar) {
    }

    @Override // m4.w0
    public final /* synthetic */ void y(u0 u0Var) {
    }

    @Override // m4.w0
    public final /* synthetic */ void B(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void D(i0 i0Var, int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void L(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void P(int i10, int i11) {
    }

    @Override // m4.w0
    public final /* synthetic */ void m(i1 i1Var, int i10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void n(int i10, boolean z10) {
    }

    @Override // m4.w0
    public final /* synthetic */ void g(x0 x0Var, x0 x0Var2, int i10) {
    }
}
