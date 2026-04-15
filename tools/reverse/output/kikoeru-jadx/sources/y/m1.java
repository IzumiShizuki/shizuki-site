package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f25181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f25182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25183s;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long B0(g2.x0 r7) {
        /*
            r6 = this;
            float r0 = r6.f25181q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f25181q
            int r0 = r7.a0(r0)
            if (r0 >= 0) goto L19
            r0 = 0
            goto L19
        L16:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L19:
            float r3 = r6.f25182r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L2b
            float r3 = r6.f25182r
            int r3 = r7.a0(r3)
            if (r3 >= 0) goto L2e
            r3 = 0
            goto L2e
        L2b:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L2e:
            float r4 = r6.f25179o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L45
            float r4 = r6.f25179o
            int r4 = r7.a0(r4)
            if (r4 >= 0) goto L3f
            r4 = 0
        L3f:
            if (r4 <= r0) goto L42
            r4 = r0
        L42:
            if (r4 == r1) goto L45
            goto L46
        L45:
            r4 = 0
        L46:
            float r5 = r6.f25180p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L5d
            float r5 = r6.f25180p
            int r7 = r7.a0(r5)
            if (r7 >= 0) goto L57
            r7 = 0
        L57:
            if (r7 <= r3) goto L5a
            r7 = r3
        L5a:
            if (r7 == r1) goto L5d
            r2 = r7
        L5d:
            long r0 = f3.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.m1.B0(g2.x0):long");
    }

    @Override // i2.z
    public final int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        long jB0 = B0(q0Var);
        if (f3.a.e(jB0)) {
            return f3.a.g(jB0);
        }
        if (!this.f25183s) {
            i10 = f3.b.g(i10, jB0);
        }
        return f3.b.f(u0Var.L(i10), jB0);
    }

    @Override // i2.z
    public final int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        long jB0 = B0(q0Var);
        if (f3.a.e(jB0)) {
            return f3.a.g(jB0);
        }
        if (!this.f25183s) {
            i10 = f3.b.g(i10, jB0);
        }
        return f3.b.f(u0Var.b(i10), jB0);
    }

    @Override // i2.z
    public final int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        long jB0 = B0(q0Var);
        if (f3.a.f(jB0)) {
            return f3.a.h(jB0);
        }
        if (!this.f25183s) {
            i10 = f3.b.f(i10, jB0);
        }
        return f3.b.g(u0Var.t(i10), jB0);
    }

    @Override // i2.z
    public final int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        long jB0 = B0(q0Var);
        if (f3.a.f(jB0)) {
            return f3.a.h(jB0);
        }
        if (!this.f25183s) {
            i10 = f3.b.f(i10, jB0);
        }
        return f3.b.g(u0Var.m(i10), jB0);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        int iJ;
        int iH;
        int i10;
        int iG;
        long jA;
        long jB0 = B0(x0Var);
        if (this.f25183s) {
            jA = f3.b.e(j10, jB0);
        } else {
            if (Float.isNaN(this.f25179o)) {
                iJ = f3.a.j(j10);
                int iH2 = f3.a.h(jB0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = f3.a.j(jB0);
            }
            if (Float.isNaN(this.f25181q)) {
                iH = f3.a.h(j10);
                int iJ2 = f3.a.j(jB0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = f3.a.h(jB0);
            }
            if (Float.isNaN(this.f25180p)) {
                i10 = f3.a.i(j10);
                int iG2 = f3.a.g(jB0);
                if (i10 > iG2) {
                    i10 = iG2;
                }
            } else {
                i10 = f3.a.i(jB0);
            }
            if (Float.isNaN(this.f25182r)) {
                iG = f3.a.g(j10);
                int i11 = f3.a.i(jB0);
                if (iG < i11) {
                    iG = i11;
                }
            } else {
                iG = f3.a.g(jB0);
            }
            jA = f3.b.a(iJ, iH, i10, iG);
        }
        g2.g1 g1VarV = u0Var.v(jA);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new b0.p(g1VarV, 15));
    }
}
