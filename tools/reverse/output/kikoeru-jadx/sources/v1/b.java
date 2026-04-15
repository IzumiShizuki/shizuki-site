package v1;

import f3.m;
import i2.l0;
import jc.l;
import n7.b0;
import p1.c;
import p4.p;
import q1.h0;
import q1.k;
import q1.o;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f22354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f22356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22357d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f22358e = m.f6667a;

    public boolean b(float f10) {
        return false;
    }

    public boolean e(k kVar) {
        return false;
    }

    public final void g(l0 l0Var, long j10, float f10, k kVar) {
        s1.b bVar = l0Var.f8782a;
        if (this.f22357d != f10) {
            if (!b(f10)) {
                if (f10 == 1.0f) {
                    p pVar = this.f22354a;
                    if (pVar != null) {
                        pVar.g(f10);
                    }
                    this.f22355b = false;
                } else {
                    p pVarH = this.f22354a;
                    if (pVarH == null) {
                        pVarH = h0.h();
                        this.f22354a = pVarH;
                    }
                    pVarH.g(f10);
                    this.f22355b = true;
                }
            }
            this.f22357d = f10;
        }
        if (!l.a(this.f22356c, kVar)) {
            if (!e(kVar)) {
                if (kVar == null) {
                    p pVar2 = this.f22354a;
                    if (pVar2 != null) {
                        pVar2.j(null);
                    }
                    this.f22355b = false;
                } else {
                    p pVarH2 = this.f22354a;
                    if (pVarH2 == null) {
                        pVarH2 = h0.h();
                        this.f22354a = pVarH2;
                    }
                    pVarH2.j(kVar);
                    this.f22355b = true;
                }
            }
            this.f22356c = kVar;
        }
        m layoutDirection = l0Var.getLayoutDirection();
        if (this.f22358e != layoutDirection) {
            f(layoutDirection);
            this.f22358e = layoutDirection;
        }
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (l0Var.e() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l0Var.e() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((y1) bVar.f19346b.f3618b).a0(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.f22355b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        c cVarF = b0.f(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        o oVarZ = bVar.f19346b.z();
                        p pVarH3 = this.f22354a;
                        if (pVarH3 == null) {
                            pVarH3 = h0.h();
                            this.f22354a = pVarH3;
                        }
                        try {
                            oVarZ.a(cVarF, pVarH3);
                            i(l0Var);
                            oVarZ.r();
                        } catch (Throwable th2) {
                            oVarZ.r();
                            throw th2;
                        }
                    } else {
                        i(l0Var);
                    }
                }
            } catch (Throwable th3) {
                ((y1) bVar.f19346b.f3618b).a0(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        ((y1) bVar.f19346b.f3618b).a0(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(l0 l0Var);

    public void f(m mVar) {
    }
}
