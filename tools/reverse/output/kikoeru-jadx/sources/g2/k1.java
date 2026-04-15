package g2;

import i2.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1.p implements i2.z, d2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f7225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0.o1 f7226p;

    public k1(x xVar) {
        this.f7225o = xVar;
        this.f7226p = new b0.o1(6, this, xVar);
    }

    @Override // i2.z
    public final /* synthetic */ int b(i2.q0 q0Var, u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(i2.q0 q0Var, u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(i2.q0 q0Var, u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(i2.q0 q0Var, u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        g1 g1VarV = u0Var.v(j10);
        return x0Var.y(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, this.f7226p, new b0.p(g1VarV, 2));
    }

    @Override // i2.d2
    public final Object k() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
