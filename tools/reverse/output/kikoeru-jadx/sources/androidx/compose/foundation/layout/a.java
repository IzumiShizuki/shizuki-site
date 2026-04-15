package androidx.compose.foundation.layout;

import f3.m;
import ic.k;
import j1.n;
import j1.q;
import m0.a7;
import m0.i0;
import y.d1;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static e1 a(float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return new e1(f10, f11, f10, f11);
    }

    public static e1 b(float f10, float f11, int i10) {
        float f12 = i0.f13081b;
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        return new e1(f10, f11, f12, 0);
    }

    public static final q c(q qVar, float f10, boolean z10) {
        return qVar.e(new AspectRatioElement(f10, z10));
    }

    public static final float d(d1 d1Var, m mVar) {
        return mVar == m.f6667a ? d1Var.d(mVar) : d1Var.b(mVar);
    }

    public static final float e(d1 d1Var, m mVar) {
        return mVar == m.f6667a ? d1Var.b(mVar) : d1Var.d(mVar);
    }

    public static final boolean f(int i10, int i11, long j10) {
        int iJ = f3.a.j(j10);
        if (i10 > f3.a.h(j10) || iJ > i10) {
            return false;
        }
        return i11 <= f3.a.g(j10) && f3.a.i(j10) <= i11;
    }

    public static final q g(q qVar, k kVar) {
        return qVar.e(new OffsetPxElement(kVar));
    }

    public static final q h(q qVar, float f10, float f11) {
        return qVar.e(new OffsetElement(f10, f11));
    }

    public static final q i(q qVar, d1 d1Var) {
        return qVar.e(new PaddingValuesElement(d1Var));
    }

    public static final q j(q qVar, float f10) {
        return qVar.e(new PaddingElement(f10, f10, f10, f10));
    }

    public static final q k(q qVar, float f10, float f11) {
        return qVar.e(new PaddingElement(f10, f11, f10, f11));
    }

    public static q l(q qVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return k(qVar, f10, f11);
    }

    public static final q m(q qVar, float f10, float f11, float f12, float f13) {
        return qVar.e(new PaddingElement(f10, f11, f12, f13));
    }

    public static q n(q qVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return m(qVar, f10, f11, f12, f13);
    }

    public static final q o() {
        float f10 = a7.f12659a;
        float f11 = a7.f12665g;
        boolean zIsNaN = Float.isNaN(f10);
        q alignmentLineOffsetDpElement = n.f9689a;
        q alignmentLineOffsetDpElement2 = !zIsNaN ? new AlignmentLineOffsetDpElement(g2.c.f7162a, f10, Float.NaN) : alignmentLineOffsetDpElement;
        if (!Float.isNaN(f11)) {
            alignmentLineOffsetDpElement = new AlignmentLineOffsetDpElement(g2.c.f7163b, Float.NaN, f11);
        }
        return alignmentLineOffsetDpElement2.e(alignmentLineOffsetDpElement);
    }

    public static final q p(q qVar) {
        return qVar.e(new IntrinsicWidthElement());
    }
}
