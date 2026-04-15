package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d1 f25124o;

    @Override // i2.z
    public final /* synthetic */ int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        float fB = this.f25124o.b(x0Var.getLayoutDirection());
        float fC = this.f25124o.c();
        float fD = this.f25124o.d(x0Var.getLayoutDirection());
        float fA = this.f25124o.a();
        float f10 = 0;
        if (!((Float.compare(fA, f10) >= 0) & (Float.compare(fB, f10) >= 0) & (Float.compare(fC, f10) >= 0) & (Float.compare(fD, f10) >= 0))) {
            z.a.a("Padding must be non-negative");
        }
        int iA0 = x0Var.a0(fB);
        int iA02 = x0Var.a0(fD) + iA0;
        int iA03 = x0Var.a0(fC);
        int iA04 = x0Var.a0(fA) + iA03;
        g2.g1 g1VarV = u0Var.v(f3.b.i(-iA02, -iA04, j10));
        return x0Var.b0(f3.b.g(g1VarV.f7180a + iA02, j10), f3.b.f(g1VarV.f7181b + iA04, j10), vb.s.f22820a, new v0.l(g1VarV, iA0, iA03, 2));
    }
}
