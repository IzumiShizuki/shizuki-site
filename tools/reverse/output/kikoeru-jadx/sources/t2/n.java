package t2;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m4.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f20366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f20372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f20373h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public n(ch.l lVar, long j10, int i10, int i11) {
        boolean z10;
        int i12;
        int iG;
        int i13;
        this.f20366a = lVar;
        this.f20367b = i10;
        if (f3.a.j(j10) != 0 || f3.a.i(j10) != 0) {
            z2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) lVar.f4205f;
        int size = arrayList2.size();
        int i14 = 0;
        int i15 = 0;
        float f10 = 0.0f;
        while (i14 < size) {
            q qVar = (q) arrayList2.get(i14);
            b3.c cVar = qVar.f20384a;
            int iH = f3.a.h(j10);
            if (f3.a.c(j10)) {
                i12 = i14;
                iG = f3.a.g(j10) - ((int) Math.ceil(f10));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i12 = i14;
                iG = f3.a.g(j10);
            }
            a aVar = new a(cVar, this.f20367b - i15, i11, f3.b.b(iH, iG, 5));
            float fB = aVar.b() + f10;
            u2.k kVar = aVar.f20257d;
            int i16 = i15 + kVar.f21254g;
            arrayList.add(new p(aVar, qVar.f20385b, qVar.f20386c, i15, i16, f10, fB));
            if (!kVar.f21251d) {
                if (i16 == this.f20367b) {
                    i13 = i12;
                    if (i13 != ud.b.r((ArrayList) this.f20366a.f4205f)) {
                    }
                } else {
                    i13 = i12;
                }
                i14 = i13 + 1;
                i15 = i16;
                f10 = fB;
            }
            z10 = true;
            i15 = i16;
            f10 = fB;
            break;
        }
        z10 = false;
        this.f20370e = f10;
        this.f20371f = i15;
        this.f20368c = z10;
        this.f20373h = arrayList;
        this.f20369d = f3.a.h(j10);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            p pVar = (p) arrayList.get(i17);
            ?? r72 = pVar.f20377a.f20259f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = ((Collection) r72).size();
            for (int i18 = 0; i18 < size3; i18++) {
                p1.c cVar2 = (p1.c) r72.get(i18);
                arrayList4.add(cVar2 != null ? pVar.a(cVar2) : null);
            }
            vb.m.P(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f20366a.f4202c).size()) {
            int size4 = ((List) this.f20366a.f4202c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList5.add(null);
            }
            arrayList3 = vb.m.q0(arrayList3, arrayList5);
        }
        this.f20372g = arrayList3;
    }

    public static void i(n nVar, q1.o oVar, long j10, q1.k0 k0Var, e3.l lVar, s1.e eVar) {
        oVar.f();
        ArrayList arrayList = nVar.f20373h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) arrayList.get(i10);
            pVar.f20377a.f(oVar, j10, k0Var, lVar, eVar);
            oVar.p(0.0f, pVar.f20377a.b());
        }
        oVar.r();
    }

    public static void j(n nVar, q1.o oVar, q1.m mVar, float f10, q1.k0 k0Var, e3.l lVar, s1.e eVar) {
        oVar.f();
        ArrayList arrayList = nVar.f20373h;
        if (arrayList.size() <= 1 || (mVar instanceof q1.n0)) {
            b3.i.a(nVar, oVar, mVar, f10, k0Var, lVar, eVar);
        } else {
            if (!(mVar instanceof q1.j0)) {
                throw new ce.j0();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) arrayList.get(i10);
                fB += pVar.f20377a.b();
                fMax = Math.max(fMax, pVar.f20377a.d());
            }
            Shader shaderB = ((q1.j0) mVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                a aVar = ((p) arrayList.get(i11)).f20377a;
                aVar.g(oVar, new q1.n(shaderB), f10, k0Var, lVar, eVar);
                oVar.p(0.0f, aVar.b());
                matrix.setTranslate(0.0f, -aVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        oVar.r();
    }

    public final void a(long j10, float[] fArr) {
        k(k0.e(j10));
        l(k0.d(j10));
        jc.w wVar = new jc.w();
        wVar.f10836a = 0;
        c0.g(this.f20373h, j10, new t0.c(j10, fArr, wVar, new jc.v()));
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        return aVar.f20257d.e(i10 - pVar.f20380d) + pVar.f20382f;
    }

    public final int c(int i10, boolean z10) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        int i11 = i10 - pVar.f20380d;
        u2.k kVar = aVar.f20257d;
        if (z10) {
            Layout layout = kVar.f21253f;
            u2.j jVar = u2.l.f21265a;
            if (layout.getEllipsisCount(i11) <= 0 || kVar.f21249b != TextUtils.TruncateAt.END) {
                ch.l lVarC = kVar.c();
                Layout layout2 = (Layout) lVarC.f4201b;
                iF = lVarC.x(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = kVar.f(i11);
        }
        return iF + pVar.f20378b;
    }

    public final int d(int i10) {
        int length = ((g) this.f20366a.f4201b).f20320b.length();
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(i10 >= length ? ud.b.r(arrayList) : i10 < 0 ? 0 : c0.d(i10, arrayList));
        return pVar.f20377a.f20257d.f21253f.getLineForOffset(pVar.d(i10)) + pVar.f20380d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(c0.f(arrayList, f10));
        int i10 = pVar.f20379c - pVar.f20378b;
        int i11 = pVar.f20380d;
        if (i10 == 0) {
            return i11;
        }
        a aVar = pVar.f20377a;
        float f11 = f10 - pVar.f20382f;
        u2.k kVar = aVar.f20257d;
        return kVar.f21253f.getLineForVertical(((int) f11) - kVar.f21255h) + i11;
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(c0.e(i10, arrayList));
        a aVar = pVar.f20377a;
        return aVar.f20257d.g(i10 - pVar.f20380d) + pVar.f20382f;
    }

    public final int g(long j10) {
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f20373h;
        p pVar = (p) arrayList.get(c0.f(arrayList, fIntBitsToFloat));
        int i11 = pVar.f20379c;
        int i12 = pVar.f20378b;
        if (i11 - i12 == 0) {
            return i12;
        }
        a aVar = pVar.f20377a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) - pVar.f20382f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        u2.k kVar = aVar.f20257d;
        int lineForVertical = kVar.f21253f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - kVar.f21255h);
        return kVar.f21253f.getOffsetForHorizontal(lineForVertical, (kVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    public final long h(p1.c cVar, int i10, d1 d1Var) {
        long jB;
        long j10;
        float f10 = cVar.f16484b;
        ArrayList arrayList = this.f20373h;
        int iF = c0.f(arrayList, f10);
        float f11 = ((p) arrayList.get(iF)).f20383g;
        float f12 = cVar.f16486d;
        if (f11 >= f12 || iF == ud.b.r(arrayList)) {
            p pVar = (p) arrayList.get(iF);
            return pVar.b(pVar.f20377a.c(pVar.c(cVar), i10, d1Var), true);
        }
        int iF2 = c0.f(arrayList, f12);
        long jB2 = k0.f20356b;
        while (true) {
            jB = k0.f20356b;
            if (!k0.a(jB2, jB) || iF > iF2) {
                break;
            }
            p pVar2 = (p) arrayList.get(iF);
            jB2 = pVar2.b(pVar2.f20377a.c(pVar2.c(cVar), i10, d1Var), true);
            iF++;
        }
        if (k0.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j10 = k0.f20356b;
            if (!k0.a(jB, j10) || iF > iF2) {
                break;
            }
            p pVar3 = (p) arrayList.get(iF2);
            jB = pVar3.b(pVar3.f20377a.c(pVar3.c(cVar), i10, d1Var), true);
            iF2--;
        }
        return k0.a(jB, j10) ? jB2 : c0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i10) {
        boolean z10 = false;
        ch.l lVar = this.f20366a;
        if (i10 >= 0 && i10 < ((g) lVar.f4201b).f20320b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbO = j2.h0.o(i10, "offset(", ") is out of bounds [0, ");
        sbO.append(((g) lVar.f4201b).f20320b.length());
        sbO.append(')');
        z2.a.a(sbO.toString());
    }

    public final void l(int i10) {
        boolean z10 = false;
        ch.l lVar = this.f20366a;
        if (i10 >= 0 && i10 <= ((g) lVar.f4201b).f20320b.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbO = j2.h0.o(i10, "offset(", ") is out of bounds [0, ");
        sbO.append(((g) lVar.f4201b).f20320b.length());
        sbO.append(']');
        z2.a.a(sbO.toString());
    }

    public final void m(int i10) {
        boolean z10 = false;
        int i11 = this.f20371f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        z2.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
