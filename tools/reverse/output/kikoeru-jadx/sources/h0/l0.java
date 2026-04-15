package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements g2.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f7739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2.d0 f7741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a f7742d;

    public l0(p1 p1Var, int i10, y2.d0 d0Var, ic.a aVar) {
        this.f7739a = p1Var;
        this.f7740b = i10;
        this.f7741c = d0Var;
        this.f7742d = aVar;
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
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return jc.l.a(this.f7739a, l0Var.f7739a) && this.f7740b == l0Var.f7740b && jc.l.a(this.f7741c, l0Var.f7741c) && jc.l.a(this.f7742d, l0Var.f7742d);
    }

    @Override // g2.f0
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.l(this, q0Var, u0Var, i10);
    }

    @Override // g2.f0
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        long j11;
        if (u0Var.t(f3.a.g(j10)) < f3.a.h(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = f3.a.a(j11, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        g2.g1 g1VarV = u0Var.v(j10);
        int iMin = Math.min(g1VarV.f7180a, f3.a.h(j11));
        return x0Var.b0(iMin, g1VarV.f7181b, vb.s.f22820a, new k0(x0Var, this, g1VarV, iMin, 0));
    }

    public final int hashCode() {
        return this.f7742d.hashCode() + ((this.f7741c.hashCode() + (((this.f7739a.hashCode() * 31) + this.f7740b) * 31)) * 31);
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f7739a + ", cursorOffset=" + this.f7740b + ", transformedText=" + this.f7741c + ", textLayoutResultProvider=" + this.f7742d + ')';
    }
}
