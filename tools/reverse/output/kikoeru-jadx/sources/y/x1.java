package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f25286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public jc.m f25287p;

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
        g2.g1 g1VarV = u0Var.v(f3.b.a(this.f25286o != b0.f25088a ? 0 : f3.a.j(j10), f3.a.h(j10), this.f25286o == b0.f25089b ? f3.a.i(j10) : 0, f3.a.g(j10)));
        int iK = nh.b.k(g1VarV.f7180a, f3.a.j(j10), f3.a.h(j10));
        int iK2 = nh.b.k(g1VarV.f7181b, f3.a.i(j10), f3.a.g(j10));
        return x0Var.b0(iK, iK2, vb.s.f22820a, new w1(this, iK, g1VarV, iK2, x0Var));
    }
}
