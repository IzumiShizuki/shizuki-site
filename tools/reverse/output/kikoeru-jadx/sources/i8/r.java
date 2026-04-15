package i8;

import g2.f0;
import g2.g1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.q0;
import lf.b1;
import lf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements t8.i, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f9452a = p0.c(new f3.a(w.f9469a));

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    @Override // g2.f0
    public final /* synthetic */ int b(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.i(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final /* synthetic */ int c(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.b(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final /* synthetic */ int d(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.e(this, q0Var, u0Var, i10);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        return a0.c.r(this, qVar);
    }

    @Override // g2.f0
    public final /* synthetic */ int f(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.l(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        f3.a aVar = new f3.a(j10);
        b1 b1Var = this.f9452a;
        b1Var.getClass();
        b1Var.m(null, aVar);
        g1 g1VarV = u0Var.v(j10);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new p(g1VarV, 0));
    }

    @Override // t8.i
    public final Object h(h8.f fVar) {
        return p0.m(new k(this.f9452a, 1), fVar);
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
