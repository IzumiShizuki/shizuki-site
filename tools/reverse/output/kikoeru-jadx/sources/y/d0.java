package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f25112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25113p;

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
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!f3.a.d(j10) || this.f25112o == b0.f25088a) {
            iJ = f3.a.j(j10);
            iH = f3.a.h(j10);
        } else {
            int iRound = Math.round(f3.a.h(j10) * this.f25113p);
            int iJ2 = f3.a.j(j10);
            iJ = f3.a.h(j10);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!f3.a.c(j10) || this.f25112o == b0.f25089b) {
            int i10 = f3.a.i(j10);
            iG = f3.a.g(j10);
            iG2 = i10;
        } else {
            int iRound2 = Math.round(f3.a.g(j10) * this.f25113p);
            int i11 = f3.a.i(j10);
            iG2 = f3.a.g(j10);
            if (iRound2 < i11) {
                iRound2 = i11;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        g2.g1 g1VarV = u0Var.v(f3.b.a(iJ, iH, iG2, iG));
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new b0.p(g1VarV, 13));
    }
}
