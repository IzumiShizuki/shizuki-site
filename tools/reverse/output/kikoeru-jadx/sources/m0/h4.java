package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends j1.p implements i2.l, i2.z {
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
        boolean z10 = this.f9703n && ((Boolean) i2.f.i(this, t3.f13651a)).booleanValue();
        long j11 = t3.f13652b;
        g2.g1 g1VarV = u0Var.v(j10);
        int iMax = z10 ? Math.max(g1VarV.f7180a, x0Var.a0(f3.h.b(j11))) : g1VarV.f7180a;
        int iMax2 = z10 ? Math.max(g1VarV.f7181b, x0Var.a0(f3.h.a(j11))) : g1VarV.f7181b;
        return x0Var.b0(iMax, iMax2, vb.s.f22820a, new g4(iMax, iMax2, g1VarV));
    }
}
