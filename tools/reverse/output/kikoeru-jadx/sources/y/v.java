package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g2.v0, g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.f f25269b;

    public v(h hVar, j1.f fVar) {
        this.f25268a = hVar;
        this.f25269b = fVar;
    }

    @Override // y.g1
    public final g2.w0 a(g2.g1[] g1VarArr, g2.x0 x0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return x0Var.b0(i11, i10, vb.s.f22820a, new o1.x(g1VarArr, this, i11, x0Var, iArr));
    }

    @Override // y.g1
    public final int b(g2.g1 g1Var) {
        return g1Var.f7180a;
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        int iA0 = yVar.a0(this.f25268a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iA0, i10);
        List list2 = list;
        int size = list2.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g2.u0 u0Var = (g2.u0) list.get(i11);
            float fK = d.k(d.j(u0Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(u0Var.b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, u0Var.t(iMin2));
            } else if (fK > 0.0f) {
                f10 += fK;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            g2.u0 u0Var2 = (g2.u0) list.get(i12);
            float fK2 = d.k(d.j(u0Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, u0Var2.t(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // y.g1
    public final void d(int i10, int[] iArr, int[] iArr2, g2.x0 x0Var) {
        this.f25268a.c(x0Var, i10, iArr, iArr2);
    }

    @Override // y.g1
    public final long e(int i10, int i11, int i12, boolean z10) {
        return !z10 ? f3.b.a(0, i12, i10, i11) : pc.f0.w(0, i12, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return jc.l.a(this.f25268a, vVar.f25268a) && this.f25269b.equals(vVar.f25269b);
    }

    @Override // g2.v0
    public final int f(g2.y yVar, List list, int i10) {
        int iA0 = yVar.a0(this.f25268a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iA0, i10);
        List list2 = list;
        int size = list2.size();
        float f10 = 0.0f;
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            g2.u0 u0Var = (g2.u0) list.get(i11);
            float fK = d.k(d.j(u0Var));
            if (fK == 0.0f) {
                int iMin2 = Math.min(u0Var.b(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, u0Var.m(iMin2));
            } else if (fK > 0.0f) {
                f10 += fK;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            g2.u0 u0Var2 = (g2.u0) list.get(i12);
            float fK2 = d.k(d.j(u0Var2));
            if (fK2 > 0.0f) {
                iMax = Math.max(iMax, u0Var2.m(iRound != Integer.MAX_VALUE ? Math.round(iRound * fK2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // g2.v0
    public final int g(g2.y yVar, List list, int i10) {
        int iA0 = yVar.a0(this.f25268a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            g2.u0 u0Var = (g2.u0) list.get(i12);
            float fK = d.k(d.j(u0Var));
            int iL = u0Var.L(i10);
            if (fK == 0.0f) {
                i11 += iL;
            } else if (fK > 0.0f) {
                f10 += fK;
                iMax = Math.max(iMax, Math.round(iL / fK));
            }
        }
        return ((list.size() - 1) * iA0) + Math.round(iMax * f10) + i11;
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        return d.l(this, f3.a.i(j10), f3.a.j(j10), f3.a.g(j10), f3.a.h(j10), x0Var.a0(this.f25268a.a()), x0Var, list, new g2.g1[list.size()], 0, list.size(), null, 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25269b.f9679a) + (this.f25268a.hashCode() * 31);
    }

    @Override // g2.v0
    public final int i(g2.y yVar, List list, int i10) {
        int iA0 = yVar.a0(this.f25268a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            g2.u0 u0Var = (g2.u0) list.get(i12);
            float fK = d.k(d.j(u0Var));
            int iB = u0Var.b(i10);
            if (fK == 0.0f) {
                i11 += iB;
            } else if (fK > 0.0f) {
                f10 += fK;
                iMax = Math.max(iMax, Math.round(iB / fK));
            }
        }
        return ((list.size() - 1) * iA0) + Math.round(iMax * f10) + i11;
    }

    @Override // y.g1
    public final int j(g2.g1 g1Var) {
        return g1Var.f7181b;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f25268a + ", horizontalAlignment=" + this.f25269b + ')';
    }
}
