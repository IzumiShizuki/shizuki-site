package y0;

import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ud.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25329b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25331d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25333f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0[] f25328a = new i0[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f25330c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f25332e = new Object[16];

    public final void F() {
        this.f25329b = 0;
        this.f25331d = 0;
        vb.l.p0(0, this.f25333f, this.f25332e);
        this.f25333f = 0;
    }

    public final void G(x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        if (I()) {
            m4.j jVar = new m4.j(this);
            k0 k0Var = (k0) jVar.f14299e;
            while (true) {
                i0 i0Var = k0Var.f25328a[jVar.f14296b];
                x0.a aVarE = i0Var.e(jVar);
                x0.c cVar2 = cVar;
                d2 d2Var2 = d2Var;
                f1.m mVar2 = mVar;
                j0 j0Var2 = j0Var;
                try {
                    i0Var.c(jVar, cVar2, d2Var2, mVar2, j0Var2);
                    int i10 = jVar.f14296b;
                    int i11 = k0Var.f25329b;
                    if (i10 < i11) {
                        i0 i0Var2 = k0Var.f25328a[i10];
                        jVar.f14297c += i0Var2.f25324b;
                        jVar.f14298d += i0Var2.f25325c;
                        int i12 = i10 + 1;
                        jVar.f14296b = i12;
                        if (i12 >= i11) {
                            break;
                        }
                        cVar = cVar2;
                        d2Var = d2Var2;
                        mVar = mVar2;
                        j0Var = j0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        F();
    }

    public final boolean H() {
        return this.f25329b == 0;
    }

    public final boolean I() {
        return this.f25329b != 0;
    }

    public final void J(i0 i0Var) {
        int i10 = this.f25329b;
        i0[] i0VarArr = this.f25328a;
        if (i10 == i0VarArr.length) {
            i0[] i0VarArr2 = new i0[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(i0VarArr, 0, i0VarArr2, 0, i10);
            this.f25328a = i0VarArr2;
        }
        int i11 = this.f25331d;
        int i12 = i0Var.f25324b;
        int i13 = i0Var.f25325c;
        int i14 = i11 + i12;
        int[] iArr = this.f25330c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            vb.l.h0(0, 0, length, iArr, iArr2);
            this.f25330c = iArr2;
        }
        int i16 = this.f25333f + i13;
        Object[] objArr = this.f25332e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f25332e = objArr2;
        }
        i0[] i0VarArr3 = this.f25328a;
        int i18 = this.f25329b;
        this.f25329b = i18 + 1;
        i0VarArr3[i18] = i0Var;
        this.f25331d += i0Var.f25324b;
        this.f25333f += i13;
    }
}
