package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f12971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a9.r f12972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u.e1 f12973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12974r;

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
        g2.g1 g1VarV = u0Var.v(j10);
        if (!x0Var.O() || !this.f12974r) {
            ub.k kVar = (ub.k) this.f12972p.q(new f3.l((((long) g1VarV.f7181b) & 4294967295L) | (((long) g1VarV.f7180a) << 32)), new f3.a(j10));
            x xVar = this.f12971o;
            a4 a4Var = (a4) kVar.f21543a;
            Object obj = kVar.f21544b;
            if (!jc.l.a(xVar.d(), a4Var)) {
                xVar.f13857m.setValue(a4Var);
                if (!xVar.i(obj)) {
                    xVar.f13856l.setValue(obj);
                }
            }
        }
        this.f12974r = x0Var.O() || this.f12974r;
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new ba.i(x0Var, this, g1VarV, 5));
    }

    @Override // j1.p
    public final void t0() {
        this.f12974r = false;
    }
}
