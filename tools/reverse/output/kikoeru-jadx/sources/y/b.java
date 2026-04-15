package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g2.t f25085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f25087q;

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
        long j11;
        long jA;
        g2.t tVar = this.f25085o;
        float f10 = this.f25086p;
        float f11 = this.f25087q;
        boolean z10 = tVar instanceof g2.t;
        if (z10) {
            j11 = j10;
            jA = f3.a.a(j11, 0, 0, 0, 0, 11);
        } else {
            j11 = j10;
            jA = f3.a.a(j11, 0, 0, 0, 0, 14);
        }
        g2.g1 g1VarV = u0Var.v(jA);
        int iR = g1VarV.R(tVar);
        if (iR == Integer.MIN_VALUE) {
            iR = 0;
        }
        int i10 = z10 ? g1VarV.f7181b : g1VarV.f7180a;
        int iG = (z10 ? f3.a.g(j11) : f3.a.h(j11)) - i10;
        int iK = nh.b.k((!Float.isNaN(f10) ? x0Var.a0(f10) : 0) - iR, 0, iG);
        int iK2 = nh.b.k(((!Float.isNaN(f11) ? x0Var.a0(f11) : 0) - i10) + iR, 0, iG - iK);
        int iMax = z10 ? g1VarV.f7180a : Math.max(g1VarV.f7180a + iK + iK2, f3.a.j(j11));
        int iMax2 = z10 ? Math.max(g1VarV.f7181b + iK + iK2, f3.a.i(j11)) : g1VarV.f7181b;
        int i11 = iMax;
        return x0Var.b0(i11, iMax2, vb.s.f22820a, new a(tVar, f10, iK, i11, iK2, g1VarV, iMax2));
    }
}
