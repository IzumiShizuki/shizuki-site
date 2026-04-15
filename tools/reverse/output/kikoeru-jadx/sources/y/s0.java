package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements g2.f0, h2.c, j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f25233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f25234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f25235c;

    public s0(r1 r1Var) {
        this.f25233a = r1Var;
        this.f25234b = x0.v.v(r1Var);
        this.f25235c = x0.v.v(r1Var);
    }

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    @Override // g2.f0
    public final /* synthetic */ int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.i(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final /* synthetic */ int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.b(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final /* synthetic */ int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.e(this, q0Var, u0Var, i10);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        return a0.c.r(this, qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return jc.l.a(((s0) obj).f25233a, this.f25233a);
        }
        return false;
    }

    @Override // g2.f0
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.l(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        x0.e1 e1Var = this.f25234b;
        int iA = ((r1) e1Var.getValue()).a(x0Var, x0Var.getLayoutDirection());
        int iB = ((r1) e1Var.getValue()).b(x0Var);
        int iD = ((r1) e1Var.getValue()).d(x0Var, x0Var.getLayoutDirection()) + iA;
        int iC = ((r1) e1Var.getValue()).c(x0Var) + iB;
        g2.g1 g1VarV = u0Var.v(f3.b.i(-iD, -iC, j10));
        return x0Var.b0(f3.b.g(g1VarV.f7180a + iD, j10), f3.b.f(g1VarV.f7181b + iC, j10), vb.s.f22820a, new v0.l(g1VarV, iA, iB, 1));
    }

    public final int hashCode() {
        return this.f25233a.hashCode();
    }

    @Override // h2.c
    public final void i(h2.f fVar) {
        r1 r1Var = (r1) fVar.s(u1.f25267a);
        r1 r1Var2 = this.f25233a;
        this.f25234b.setValue(new c0(r1Var2, r1Var));
        this.f25235c.setValue(new n1(r1Var, r1Var2));
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
