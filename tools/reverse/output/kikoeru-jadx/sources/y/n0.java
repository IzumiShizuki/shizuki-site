package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f25191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f25192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f25194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f25195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f25196f;

    public n0(f fVar, h hVar, float f10, z zVar, float f11, l0 l0Var) {
        this.f25191a = fVar;
        this.f25192b = hVar;
        this.f25193c = f10;
        this.f25194d = zVar;
        this.f25195e = f11;
        this.f25196f = l0Var;
    }

    public static int c(List list, int i10, int i11, int i12, l0 l0Var) {
        boolean z10;
        long jA = o.k.a(0, 0);
        if (!list.isEmpty()) {
            int i13 = Integer.MAX_VALUE;
            h0 h0Var = new h0(l0Var, f3.b.a(0, i10, 0, Integer.MAX_VALUE), i11, i12);
            g2.u0 u0Var = (g2.u0) vb.m.b0(0, list);
            int iL = u0Var != null ? u0Var.L(i10) : 0;
            int iM = u0Var != null ? u0Var.m(iL) : 0;
            int i14 = 0;
            if (h0Var.b(list.size() > 1, 0, o.k.a(i10, Integer.MAX_VALUE), u0Var == null ? null : new o.k(o.k.a(iM, iL)), 0, 0, 0, false, false).f25130b) {
                l0Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i15 = i10;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    int i21 = i15 - iM;
                    int i22 = i17 + 1;
                    int iMax = Math.max(i16, iL);
                    g2.u0 u0Var2 = (g2.u0) vb.m.b0(i22, list);
                    iL = u0Var2 != null ? u0Var2.L(i10) : 0;
                    int iM2 = u0Var2 != null ? u0Var2.m(iL) + i11 : 0;
                    if (i17 + 2 < list.size()) {
                        i17 = i22;
                        z10 = true;
                    } else {
                        i17 = i22;
                        z10 = false;
                    }
                    int i23 = i17 - i20;
                    int i24 = i19;
                    int i25 = iM2;
                    g0 g0VarB = h0Var.b(z10, i23, o.k.a(i21, i13), u0Var2 == null ? null : new o.k(o.k.a(iM2, iL)), i24, i14, iMax, false, false);
                    if (g0VarB.f25129a) {
                        int i26 = iMax + i12 + i14;
                        h0Var.a(g0VarB, u0Var2 != null, i24, i26, i21, i23);
                        int i27 = i25 - i11;
                        i19 = i24 + 1;
                        if (g0VarB.f25130b) {
                            i18 = i17;
                            i14 = i26;
                            break;
                        }
                        i15 = i10;
                        i20 = i17;
                        iM = i27;
                        i14 = i26;
                        i16 = 0;
                    } else {
                        iM = i25;
                        i15 = i21;
                        i19 = i24;
                        i16 = iMax;
                    }
                    i18 = i17;
                    i13 = Integer.MAX_VALUE;
                }
                jA = o.k.a(i14 - i12, i18);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // y.g1
    public final g2.w0 a(g2.g1[] g1VarArr, g2.x0 x0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return x0Var.b0(i10, i11, vb.s.f22820a, new m0(iArr2, i12, i13, i14, g1VarArr, this, i11, f3.m.f6667a, iArr));
    }

    @Override // y.g1
    public final int b(g2.g1 g1Var) {
        return g1Var.V();
    }

    @Override // y.g1
    public final void d(int i10, int[] iArr, int[] iArr2, g2.x0 x0Var) {
        this.f25191a.b(x0Var, i10, iArr, x0Var.getLayoutDirection(), iArr2);
    }

    @Override // y.g1
    public final long e(int i10, int i11, int i12, boolean z10) {
        j1 j1Var = i1.f25149a;
        return !z10 ? f3.b.a(i10, i11, 0, i12) : pc.f0.x(i10, i11, 0, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f25191a.equals(n0Var.f25191a) && this.f25192b.equals(n0Var.f25192b) && f3.f.a(this.f25193c, n0Var.f25193c) && this.f25194d.equals(n0Var.f25194d) && f3.f.a(this.f25195e, n0Var.f25195e) && jc.l.a(this.f25196f, n0Var.f25196f);
    }

    public final int hashCode() {
        return this.f25196f.hashCode() + ((((((Float.floatToIntBits(this.f25195e) + ((this.f25194d.hashCode() + q.t0.x(this.f25193c, (this.f25192b.hashCode() + ((this.f25191a.hashCode() + 38161) * 31)) * 31, 31)) * 31)) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31);
    }

    @Override // y.g1
    public final int j(g2.g1 g1Var) {
        return g1Var.W();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f25191a + ", verticalArrangement=" + this.f25192b + ", mainAxisSpacing=" + ((Object) f3.f.b(this.f25193c)) + ", crossAxisAlignment=" + this.f25194d + ", crossAxisArrangementSpacing=" + ((Object) f3.f.b(this.f25195e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f25196f + ')';
    }
}
