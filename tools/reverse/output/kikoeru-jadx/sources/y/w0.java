package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f25275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25276p;

    @Override // i2.z
    public final int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return u0Var.L(i10);
    }

    @Override // i2.z
    public final int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return u0Var.b(i10);
    }

    @Override // i2.z
    public final int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return this.f25275o == v0.f25270a ? u0Var.m(i10) : u0Var.t(i10);
    }

    @Override // i2.z
    public final int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return this.f25275o == v0.f25270a ? u0Var.m(i10) : u0Var.t(i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        int iM = this.f25275o == v0.f25270a ? u0Var.m(f3.a.g(j10)) : u0Var.t(f3.a.g(j10));
        if (iM < 0) {
            iM = 0;
        }
        if (iM < 0) {
            f3.i.a("width must be >= 0");
        }
        long jH = f3.b.h(iM, iM, 0, Integer.MAX_VALUE);
        if (this.f25276p) {
            jH = f3.b.e(j10, jH);
        }
        g2.g1 g1VarV = u0Var.v(jH);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new b0.p(g1VarV, 14));
    }
}
