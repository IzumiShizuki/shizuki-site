package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25204o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25205p;

    @Override // i2.z
    public final int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        int iL = u0Var.L(i10);
        int iQ = !Float.isNaN(this.f25205p) ? a0.c.q(this.f25205p, q0Var) : 0;
        return iL < iQ ? iQ : iL;
    }

    @Override // i2.z
    public final int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        int iB = u0Var.b(i10);
        int iQ = !Float.isNaN(this.f25205p) ? a0.c.q(this.f25205p, q0Var) : 0;
        return iB < iQ ? iQ : iB;
    }

    @Override // i2.z
    public final int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        int iT = u0Var.t(i10);
        int iQ = !Float.isNaN(this.f25204o) ? a0.c.q(this.f25204o, q0Var) : 0;
        return iT < iQ ? iQ : iT;
    }

    @Override // i2.z
    public final int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        int iM = u0Var.m(i10);
        int iQ = !Float.isNaN(this.f25204o) ? a0.c.q(this.f25204o, q0Var) : 0;
        return iM < iQ ? iQ : iM;
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        int iJ;
        int i10;
        if (Float.isNaN(this.f25204o) || f3.a.j(j10) != 0) {
            iJ = f3.a.j(j10);
        } else {
            int iA0 = x0Var.a0(this.f25204o);
            iJ = f3.a.h(j10);
            if (iA0 < 0) {
                iA0 = 0;
            }
            if (iA0 <= iJ) {
                iJ = iA0;
            }
        }
        int iH = f3.a.h(j10);
        if (Float.isNaN(this.f25205p) || f3.a.i(j10) != 0) {
            i10 = f3.a.i(j10);
        } else {
            int iA02 = x0Var.a0(this.f25205p);
            i10 = f3.a.g(j10);
            int i11 = iA02 >= 0 ? iA02 : 0;
            if (i11 <= i10) {
                i10 = i11;
            }
        }
        g2.g1 g1VarV = u0Var.v(f3.b.a(iJ, iH, i10, f3.a.g(j10)));
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new b0.p(g1VarV, 16));
    }
}
