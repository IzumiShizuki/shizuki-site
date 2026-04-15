package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends j2.l0 implements g2.f0, h2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f25080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f25081c;

    public a0(z0 z0Var) {
        this.f25080b = z0Var;
        this.f25081c = x0.v.v(z0Var);
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
        if (obj instanceof a0) {
            return this.f25080b.equals(((a0) obj).f25080b);
        }
        return false;
    }

    @Override // g2.f0
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.l(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        int iB = ((r1) this.f25081c.getValue()).b(x0Var);
        vb.s sVar = vb.s.f22820a;
        if (iB == 0) {
            return x0Var.b0(0, 0, sVar, n.f25186e);
        }
        g2.g1 g1VarV = u0Var.v(f3.a.a(j10, 0, 0, iB, iB, 3));
        return x0Var.b0(g1VarV.f7180a, iB, sVar, new b0.p(g1VarV, 12));
    }

    public final int hashCode() {
        return i.f25139d.hashCode() + (this.f25080b.hashCode() * 31);
    }

    @Override // h2.c
    public final void i(h2.f fVar) {
        this.f25081c.setValue(new c0(this.f25080b, (r1) fVar.s(u1.f25267a)));
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
