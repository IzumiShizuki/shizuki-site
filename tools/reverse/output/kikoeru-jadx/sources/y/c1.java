package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f25102q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f25103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25104s;

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
        int iA0 = x0Var.a0(this.f25102q) + x0Var.a0(this.f25100o);
        int iA02 = x0Var.a0(this.f25103r) + x0Var.a0(this.f25101p);
        g2.g1 g1VarV = u0Var.v(f3.b.i(-iA0, -iA02, j10));
        return x0Var.b0(f3.b.g(g1VarV.f7180a + iA0, j10), f3.b.f(g1VarV.f7181b + iA02, j10), vb.s.f22820a, new cg.b(this, g1VarV, x0Var, 24));
    }
}
