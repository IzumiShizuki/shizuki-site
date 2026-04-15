package s1;

import android.graphics.Paint;
import android.graphics.Shader;
import c7.e1;
import ce.j0;
import f3.m;
import java.util.ArrayList;
import jc.l;
import p4.p;
import q1.e0;
import q1.h0;
import q1.k;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f19345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f19346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f19347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f19348d;

    public b() {
        a aVar = new a();
        aVar.f19341a = c.f19349a;
        aVar.f19342b = m.f6667a;
        aVar.f19343c = f.f19350a;
        aVar.f19344d = 0L;
        this.f19345a = aVar;
        this.f19346b = new e1(this);
    }

    public static p b(b bVar, long j10, e eVar, float f10, int i10) {
        p pVarG = bVar.g(eVar);
        if (f10 != 1.0f) {
            j10 = q.b(q.d(j10) * f10, j10);
        }
        Paint paint = (Paint) pVarG.f16600b;
        if (!q.c(h0.c(paint.getColor()), j10)) {
            pVarG.i(j10);
        }
        if (((Shader) pVarG.f16601c) != null) {
            pVarG.l(null);
        }
        if (!l.a((k) pVarG.f16602d, null)) {
            pVarG.j(null);
        }
        if (pVarG.f16599a != i10) {
            pVarG.h(i10);
        }
        if (paint.isFilterBitmap()) {
            return pVarG;
        }
        pVarG.k(1);
        return pVarG;
    }

    public static p d(b bVar, long j10, float f10, int i10) {
        p pVarH = bVar.f19348d;
        if (pVarH == null) {
            pVarH = h0.h();
            pVarH.p(1);
            bVar.f19348d = pVarH;
        }
        Paint paint = (Paint) pVarH.f16600b;
        if (!q.c(h0.c(paint.getColor()), j10)) {
            pVarH.i(j10);
        }
        if (((Shader) pVarH.f16601c) != null) {
            pVarH.l(null);
        }
        if (!l.a((k) pVarH.f16602d, null)) {
            pVarH.j(null);
        }
        if (pVarH.f16599a != 3) {
            pVarH.h(3);
        }
        if (paint.getStrokeWidth() != f10) {
            pVarH.o(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (pVarH.e() != i10) {
            pVarH.m(i10);
        }
        if (pVarH.f() != 0) {
            pVarH.n(0);
        }
        if (paint.isFilterBitmap()) {
            return pVarH;
        }
        pVarH.k(1);
        return pVarH;
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return this.f19345a.f19341a.M();
    }

    @Override // s1.d
    public final void N(e0 e0Var, q1.m mVar, float f10, e eVar, int i10) {
        this.f19345a.f19343c.l(e0Var, c(mVar, eVar, f10, null, i10, 1));
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // s1.d
    public final e1 S() {
        return this.f19346b;
    }

    @Override // s1.d
    public final void T(float f10, long j10, q1.m mVar) {
        this.f19345a.f19343c.d(f10, j10, c(mVar, g.f19351a, 1.0f, null, 3, 1));
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // s1.d
    public final void Z(ArrayList arrayList, long j10, float f10) {
        this.f19345a.f19343c.s(arrayList, d(this, j10, f10, 1));
    }

    @Override // f3.c
    public final float a() {
        return this.f19345a.f19341a.a();
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public final p c(q1.m mVar, e eVar, float f10, k kVar, int i10, int i11) {
        p pVarG = g(eVar);
        if (mVar != null) {
            mVar.a(f10, this.f19346b.D(), pVarG);
        } else {
            Paint paint = (Paint) pVarG.f16600b;
            if (((Shader) pVarG.f16601c) != null) {
                pVarG.l(null);
            }
            long jC = h0.c(paint.getColor());
            long j10 = q.f17569b;
            if (!q.c(jC, j10)) {
                pVarG.i(j10);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                pVarG.g(f10);
            }
        }
        if (!l.a((k) pVarG.f16602d, kVar)) {
            pVarG.j(kVar);
        }
        if (pVarG.f16599a != i10) {
            pVarG.h(i10);
        }
        if (((Paint) pVarG.f16600b).isFilterBitmap() == i11) {
            return pVarG;
        }
        pVarG.k(i11);
        return pVarG;
    }

    @Override // s1.d
    public final long c0() {
        return nh.a.l(this.f19346b.D());
    }

    @Override // s1.d
    public final long e() {
        return this.f19346b.D();
    }

    @Override // s1.d
    public final void e0(long j10, long j11, long j12, long j13, e eVar) {
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        this.f19345a.f19343c.e(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), b(this, j10, eVar, 1.0f, 3));
    }

    public final void f(q1.f fVar, k kVar) {
        this.f19345a.f19343c.q(fVar, c(null, g.f19351a, 1.0f, kVar, 3, 1));
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    public final p g(e eVar) {
        if (l.a(eVar, g.f19351a)) {
            p pVar = this.f19347c;
            if (pVar != null) {
                return pVar;
            }
            p pVarH = h0.h();
            pVarH.p(0);
            this.f19347c = pVarH;
            return pVarH;
        }
        if (!(eVar instanceof h)) {
            throw new j0();
        }
        p pVarH2 = this.f19348d;
        if (pVarH2 == null) {
            pVarH2 = h0.h();
            pVarH2.p(1);
            this.f19348d = pVarH2;
        }
        Paint paint = (Paint) pVarH2.f16600b;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) eVar;
        float f10 = hVar.f19352a;
        if (strokeWidth != f10) {
            pVarH2.o(f10);
        }
        int iE = pVarH2.e();
        int i10 = hVar.f19354c;
        if (iE != i10) {
            pVarH2.m(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = hVar.f19353b;
        if (strokeMiter != f11) {
            paint.setStrokeMiter(f11);
        }
        int iF = pVarH2.f();
        int i11 = hVar.f19355d;
        if (iF == i11) {
            return pVarH2;
        }
        pVarH2.n(i11);
        return pVarH2;
    }

    @Override // s1.d
    public final void g0(long j10, float f10, long j11, e eVar, int i10) {
        this.f19345a.f19343c.d(f10, j11, b(this, j10, eVar, 1.0f, i10));
    }

    @Override // s1.d
    public final m getLayoutDirection() {
        return this.f19345a.f19342b;
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    @Override // s1.d
    public final void j0(long j10, long j11, long j12, float f10, e eVar, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f19345a.f19343c.j(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i12), b(this, j10, eVar, f10, i10));
    }

    @Override // s1.d
    public final void m0(long j10, float f10, float f11, long j11, long j12, float f12, h hVar) {
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        this.f19345a.f19343c.t(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i11), f10, f11, b(this, j10, hVar, f12, 3));
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // s1.d
    public final void p(e0 e0Var, long j10, float f10, e eVar) {
        this.f19345a.f19343c.l(e0Var, b(this, j10, eVar, f10, 3));
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }

    @Override // s1.d
    public final void w(long j10, long j11, long j12, float f10, int i10) {
        this.f19345a.f19343c.i(j11, j12, d(this, j10, f10, i10));
    }

    @Override // s1.d
    public final void x(q1.f fVar, long j10, long j11, long j12, float f10, k kVar, int i10) {
        this.f19345a.f19343c.g(fVar, j10, j11, j12, c(null, g.f19351a, f10, kVar, 3, i10));
    }
}
