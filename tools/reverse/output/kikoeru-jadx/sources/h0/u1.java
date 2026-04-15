package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements g2.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f7883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2.d0 f7885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a f7886d;

    public u1(p1 p1Var, int i10, y2.d0 d0Var, ic.a aVar) {
        this.f7883a = p1Var;
        this.f7884b = i10;
        this.f7885c = d0Var;
        this.f7886d = aVar;
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
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return jc.l.a(this.f7883a, u1Var.f7883a) && this.f7884b == u1Var.f7884b && jc.l.a(this.f7885c, u1Var.f7885c) && jc.l.a(this.f7886d, u1Var.f7886d);
    }

    @Override // g2.f0
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.l(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        g2.g1 g1VarV = u0Var.v(f3.a.a(j10, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(g1VarV.f7181b, f3.a.g(j10));
        return x0Var.b0(g1VarV.f7180a, iMin, vb.s.f22820a, new k0(x0Var, this, g1VarV, iMin, 1));
    }

    public final int hashCode() {
        return this.f7886d.hashCode() + ((this.f7885c.hashCode() + (((this.f7883a.hashCode() * 31) + this.f7884b) * 31)) * 31);
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f7883a + ", cursorOffset=" + this.f7884b + ", transformedText=" + this.f7885c + ", textLayoutResultProvider=" + this.f7886d + ')';
    }
}
