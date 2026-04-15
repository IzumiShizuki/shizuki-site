package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ya.i0 f14220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ya.i0 f14221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f14222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f14223h;

    public g1(ya.a1 a1Var, ya.a1 a1Var2, int[] iArr) {
        p4.c.c(a1Var.f25948d == iArr.length);
        this.f14220e = a1Var;
        this.f14221f = a1Var2;
        this.f14222g = iArr;
        this.f14223h = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f14223h[iArr[i10]] = i10;
        }
    }

    @Override // m4.i1
    public final int a(boolean z10) {
        if (p()) {
            return -1;
        }
        if (z10) {
            return this.f14222g[0];
        }
        return 0;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.i1
    public final int c(boolean z10) {
        if (p()) {
            return -1;
        }
        ya.i0 i0Var = this.f14220e;
        if (!z10) {
            return i0Var.size() - 1;
        }
        return this.f14222g[i0Var.size() - 1];
    }

    @Override // m4.i1
    public final int e(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == c(z10)) {
            if (i11 == 2) {
                return a(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 + 1;
        }
        return this.f14222g[this.f14223h[i10] + 1];
    }

    @Override // m4.i1
    public final f1 f(int i10, f1 f1Var, boolean z10) {
        f1 f1Var2 = (f1) this.f14221f.get(i10);
        f1Var.i(f1Var2.f14201a, f1Var2.f14202b, f1Var2.f14203c, f1Var2.f14204d, f1Var2.f14205e, f1Var2.f14207g, f1Var2.f14206f);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return this.f14221f.size();
    }

    @Override // m4.i1
    public final int k(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == a(z10)) {
            if (i11 == 2) {
                return c(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 - 1;
        }
        return this.f14222g[this.f14223h[i10] - 1];
    }

    @Override // m4.i1
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.i1
    public final h1 m(int i10, h1 h1Var, long j10) {
        h1 h1Var2 = (h1) this.f14220e.get(i10);
        h1Var.b(h1Var2.f14262a, h1Var2.f14264c, h1Var2.f14265d, h1Var2.f14266e, h1Var2.f14267f, h1Var2.f14268g, h1Var2.f14269h, h1Var2.f14270i, h1Var2.f14271j, h1Var2.f14273l, h1Var2.f14274m, h1Var2.f14275n, h1Var2.f14276o, h1Var2.f14277p);
        h1Var.f14272k = h1Var2.f14272k;
        return h1Var;
    }

    @Override // m4.i1
    public final int o() {
        return this.f14220e.size();
    }
}
