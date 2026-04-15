package t2;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import m0.g4;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f20344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f20345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20349f;

    public i0(h0 h0Var, n nVar, long j10) {
        this.f20344a = h0Var;
        this.f20345b = nVar;
        this.f20346c = j10;
        ArrayList arrayList = nVar.f20373h;
        float fD = 0.0f;
        this.f20347d = arrayList.isEmpty() ? 0.0f : ((p) arrayList.get(0)).f20377a.f20257d.d(0);
        if (!arrayList.isEmpty()) {
            p pVar = (p) vb.m.h0(arrayList);
            fD = pVar.f20377a.f20257d.d(r4.f21254g - 1) + pVar.f20382f;
        }
        this.f20348e = fD;
        this.f20349f = nVar.f20372g;
    }

    public final e3.j a(int i10) {
        n nVar = this.f20345b;
        ArrayList arrayList = nVar.f20373h;
        nVar.l(i10);
        p pVar = (p) arrayList.get(i10 == ((g) nVar.f20366a.f4201b).f20320b.length() ? ud.b.r(arrayList) : c0.d(i10, arrayList));
        return pVar.f20377a.f20257d.f21253f.isRtlCharAt(pVar.d(i10)) ? e3.j.f6079b : e3.j.f6078a;
    }

    public final p1.c b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        n nVar = this.f20345b;
        nVar.k(i10);
        ArrayList arrayList = nVar.f20373h;
        p pVar = (p) arrayList.get(c0.d(i10, arrayList));
        a aVar = pVar.f20377a;
        int iD = pVar.d(i10);
        CharSequence charSequence = aVar.f20258e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbO = j2.h0.o(iD, "offset(", ") is out of bounds [0,");
            sbO.append(charSequence.length());
            sbO.append(')');
            z2.a.a(sbO.toString());
        }
        u2.k kVar = aVar.f20257d;
        Layout layout = kVar.f21253f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = kVar.g(lineForOffset);
        float fE = kVar.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = kVar.i(iD, false);
                fH2 = kVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = kVar.h(iD, false);
                fH2 = kVar.h(iD + 1, true);
            } else {
                fI = kVar.i(iD, false);
                fI2 = kVar.i(iD + 1, true);
            }
            float f10 = fH;
            fI = fH2;
            fI2 = f10;
        } else {
            fI = kVar.h(iD, false);
            fI2 = kVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return pVar.a(new p1.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final p1.c c(int i10) {
        n nVar = this.f20345b;
        ArrayList arrayList = nVar.f20373h;
        nVar.l(i10);
        p pVar = (p) arrayList.get(i10 == ((g) nVar.f20366a.f4201b).f20320b.length() ? ud.b.r(arrayList) : c0.d(i10, arrayList));
        a aVar = pVar.f20377a;
        int iD = pVar.d(i10);
        CharSequence charSequence = aVar.f20258e;
        u2.k kVar = aVar.f20257d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbO = j2.h0.o(iD, "offset(", ") is out of bounds [0,");
            sbO.append(charSequence.length());
            sbO.append(']');
            z2.a.a(sbO.toString());
        }
        float fH = kVar.h(iD, false);
        int lineForOffset = kVar.f21253f.getLineForOffset(iD);
        return pVar.a(new p1.c(fH, kVar.g(lineForOffset), fH, kVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j10 = this.f20346c;
        float f10 = (int) (j10 >> 32);
        n nVar = this.f20345b;
        return f10 < nVar.f20369d || nVar.f20368c || ((float) ((int) (j10 & 4294967295L))) < nVar.f20370e;
    }

    public final float e(int i10) {
        n nVar = this.f20345b;
        nVar.m(i10);
        ArrayList arrayList = nVar.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        int i11 = i10 - pVar.f20380d;
        u2.k kVar = aVar.f20257d;
        return kVar.f21253f.getLineLeft(i11) + (i11 == kVar.f21254g + (-1) ? kVar.f21257j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return jc.l.a(this.f20344a, i0Var.f20344a) && this.f20345b.equals(i0Var.f20345b) && f3.l.b(this.f20346c, i0Var.f20346c) && this.f20347d == i0Var.f20347d && this.f20348e == i0Var.f20348e && jc.l.a(this.f20349f, i0Var.f20349f);
    }

    public final float f(int i10) {
        n nVar = this.f20345b;
        nVar.m(i10);
        ArrayList arrayList = nVar.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        int i11 = i10 - pVar.f20380d;
        u2.k kVar = aVar.f20257d;
        return kVar.f21253f.getLineRight(i11) + (i11 == kVar.f21254g + (-1) ? kVar.f21258k : 0.0f);
    }

    public final int g(int i10) {
        n nVar = this.f20345b;
        nVar.m(i10);
        ArrayList arrayList = nVar.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        return aVar.f20257d.f21253f.getLineStart(i10 - pVar.f20380d) + pVar.f20378b;
    }

    public final e3.j h(int i10) {
        n nVar = this.f20345b;
        ArrayList arrayList = nVar.f20373h;
        nVar.l(i10);
        p pVar = (p) arrayList.get(i10 == ((g) nVar.f20366a.f4201b).f20320b.length() ? ud.b.r(arrayList) : c0.d(i10, arrayList));
        a aVar = pVar.f20377a;
        int iD = pVar.d(i10);
        u2.k kVar = aVar.f20257d;
        return kVar.f21253f.getParagraphDirection(kVar.f21253f.getLineForOffset(iD)) == 1 ? e3.j.f6078a : e3.j.f6079b;
    }

    public final int hashCode() {
        int iHashCode = (this.f20345b.hashCode() + (this.f20344a.hashCode() * 31)) * 31;
        long j10 = this.f20346c;
        return this.f20349f.hashCode() + t0.x(this.f20348e, t0.x(this.f20347d, (((int) (j10 ^ (j10 >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final q1.h i(int i10, int i11) {
        n nVar = this.f20345b;
        g gVar = (g) nVar.f20366a.f4201b;
        if (i10 < 0 || i10 > i11 || i11 > gVar.f20320b.length()) {
            z2.a.a("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + gVar.f20320b.length() + "), or start > end!");
        }
        if (i10 == i11) {
            return q1.j.a();
        }
        q1.h hVarA = q1.j.a();
        c0.g(nVar.f20373h, c0.b(i10, i11), new g4(hVarA, i10, i11));
        return hVarA;
    }

    public final long j(int i10) {
        int iA;
        int iV;
        int iV2;
        n nVar = this.f20345b;
        ArrayList arrayList = nVar.f20373h;
        nVar.l(i10);
        p pVar = (p) arrayList.get(i10 == ((g) nVar.f20366a.f4201b).f20320b.length() ? ud.b.r(arrayList) : c0.d(i10, arrayList));
        a aVar = pVar.f20377a;
        int iD = pVar.d(i10);
        ce.g gVarJ = aVar.f20257d.j();
        if (gVarJ.t(gVarJ.A(iD))) {
            gVarJ.b(iD);
            iA = iD;
            while (iA != -1 && (!gVarJ.t(iA) || gVarJ.p(iA))) {
                iA = gVarJ.A(iA);
            }
        } else {
            gVarJ.b(iD);
            iA = gVarJ.s(iD) ? (!gVarJ.q(iD) || gVarJ.o(iD)) ? gVarJ.A(iD) : iD : gVarJ.o(iD) ? gVarJ.A(iD) : -1;
        }
        if (iA == -1) {
            iA = iD;
        }
        if (gVarJ.p(gVarJ.v(iD))) {
            gVarJ.b(iD);
            iV = iD;
            while (iV != -1 && (gVarJ.t(iV) || !gVarJ.p(iV))) {
                iV = gVarJ.v(iV);
            }
        } else {
            gVarJ.b(iD);
            if (gVarJ.o(iD)) {
                if (!gVarJ.q(iD) || gVarJ.s(iD)) {
                    iV2 = gVarJ.v(iD);
                    iV = iV2;
                } else {
                    iV = iD;
                }
            } else if (gVarJ.s(iD)) {
                iV2 = gVarJ.v(iD);
                iV = iV2;
            } else {
                iV = -1;
            }
        }
        if (iV != -1) {
            iD = iV;
        }
        return pVar.b(c0.b(iA, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f20344a + ", multiParagraph=" + this.f20345b + ", size=" + ((Object) f3.l.c(this.f20346c)) + ", firstBaseline=" + this.f20347d + ", lastBaseline=" + this.f20348e + ", placeholderRects=" + this.f20349f + ')';
    }
}
