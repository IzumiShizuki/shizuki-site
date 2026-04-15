package i2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements s1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.b f8782a = new s1.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f8783b;

    @Override // f3.c
    public final long E(float f10) {
        return this.f8782a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f8782a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / this.f8782a.a();
    }

    @Override // f3.c
    public final float M() {
        return this.f8782a.M();
    }

    @Override // s1.d
    public final void N(q1.e0 e0Var, q1.m mVar, float f10, s1.e eVar, int i10) {
        this.f8782a.N(e0Var, mVar, f10, eVar, i10);
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f8782a.a() * f10;
    }

    @Override // s1.d
    public final c7.e1 S() {
        return this.f8782a.f19346b;
    }

    @Override // s1.d
    public final void T(float f10, long j10, q1.m mVar) {
        this.f8782a.T(f10, j10, mVar);
    }

    @Override // s1.d
    public final void Z(ArrayList arrayList, long j10, float f10) {
        this.f8782a.Z(arrayList, j10, f10);
    }

    @Override // f3.c
    public final float a() {
        return this.f8782a.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        s1.b bVar = this.f8782a;
        bVar.getClass();
        return a0.c.q(f10, bVar);
    }

    public final void b() {
        s1.b bVar = this.f8782a;
        q1.o oVarZ = bVar.f19346b.z();
        m mVar = this.f8783b;
        if (mVar == null) {
            throw j2.h0.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        j1.p pVar = (j1.p) mVar;
        j1.p pVarF = pVar.f9690a.f9695f;
        if (pVarF == null || (pVarF.f9693d & 4) == 0) {
            pVarF = null;
        } else {
            while (pVarF != null) {
                int i10 = pVarF.f9692c;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    pVarF = pVarF.f9695f;
                }
            }
            pVarF = null;
        }
        if (pVarF == null) {
            g1 g1VarV = f.v(mVar, 4);
            if (g1VarV.M0() == pVar.f9690a) {
                g1VarV = g1VarV.f8703r;
                jc.l.b(g1VarV);
            }
            g1VarV.b1(oVarZ, (t1.b) bVar.f19346b.f3619c);
            return;
        }
        z0.e eVar = null;
        while (pVarF != null) {
            if (pVarF instanceof p) {
                p pVar2 = (p) pVarF;
                t1.b bVar2 = (t1.b) bVar.f19346b.f3619c;
                g1 g1VarV2 = f.v(pVar2, 4);
                long jR = gh.g.R(g1VarV2.f7182c);
                j0 j0Var = g1VarV2.f8700o;
                j0Var.getClass();
                ((j2.v) m0.a(j0Var)).getSharedDrawScope().c(oVarZ, jR, g1VarV2, pVar2, bVar2);
            } else if ((pVarF.f9692c & 4) != 0 && (pVarF instanceof n)) {
                int i11 = 0;
                for (j1.p pVar3 = ((n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                    if ((pVar3.f9692c & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            pVarF = pVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new z0.e(new j1.p[16]);
                            }
                            if (pVarF != null) {
                                eVar.b(pVarF);
                                pVarF = null;
                            }
                            eVar.b(pVar3);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            pVarF = f.f(eVar);
        }
    }

    public final void c(q1.o oVar, long j10, g1 g1Var, p pVar, t1.b bVar) {
        p pVar2 = this.f8783b;
        this.f8783b = pVar;
        f3.m mVar = g1Var.f8700o.f8767z;
        s1.b bVar2 = this.f8782a;
        f3.c cVarB = bVar2.f19346b.B();
        c7.e1 e1Var = bVar2.f19346b;
        f3.m mVarC = e1Var.C();
        q1.o oVarZ = e1Var.z();
        long jD = e1Var.D();
        t1.b bVar3 = (t1.b) e1Var.f3619c;
        e1Var.b0(g1Var);
        e1Var.c0(mVar);
        e1Var.a0(oVar);
        e1Var.e0(j10);
        e1Var.f3619c = bVar;
        oVar.f();
        try {
            pVar.R(this);
            oVar.r();
            e1Var.b0(cVarB);
            e1Var.c0(mVarC);
            e1Var.a0(oVarZ);
            e1Var.e0(jD);
            e1Var.f3619c = bVar3;
            this.f8783b = pVar2;
        } catch (Throwable th2) {
            oVar.r();
            e1Var.b0(cVarB);
            e1Var.c0(mVarC);
            e1Var.a0(oVarZ);
            e1Var.e0(jD);
            e1Var.f3619c = bVar3;
            throw th2;
        }
    }

    @Override // s1.d
    public final long c0() {
        return this.f8782a.c0();
    }

    public final void d(q1.m mVar, long j10, long j11, float f10, s1.e eVar, int i10) {
        s1.b bVar = this.f8782a;
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        bVar.f19345a.f19343c.j(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), bVar.c(mVar, eVar, f10, null, i10, 1));
    }

    @Override // s1.d
    public final long e() {
        return this.f8782a.f19346b.D();
    }

    @Override // s1.d
    public final void e0(long j10, long j11, long j12, long j13, s1.e eVar) {
        this.f8782a.e0(j10, j11, j12, j13, eVar);
    }

    public final void f(q1.m mVar, long j10, long j11, long j12, float f10, s1.e eVar) {
        s1.b bVar = this.f8782a;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        bVar.f19345a.f19343c.e(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), bVar.c(mVar, eVar, f10, null, 3, 1));
    }

    @Override // f3.c
    public final long f0(long j10) {
        s1.b bVar = this.f8782a;
        bVar.getClass();
        return a0.c.v(j10, bVar);
    }

    @Override // s1.d
    public final void g0(long j10, float f10, long j11, s1.e eVar, int i10) {
        this.f8782a.g0(j10, f10, j11, eVar, i10);
    }

    @Override // s1.d
    public final f3.m getLayoutDirection() {
        return this.f8782a.f19345a.f19342b;
    }

    @Override // f3.c
    public final float i0(long j10) {
        s1.b bVar = this.f8782a;
        bVar.getClass();
        return a0.c.u(j10, bVar);
    }

    @Override // s1.d
    public final void j0(long j10, long j11, long j12, float f10, s1.e eVar, int i10) {
        this.f8782a.j0(j10, j11, j12, f10, eVar, i10);
    }

    @Override // s1.d
    public final void m0(long j10, float f10, float f11, long j11, long j12, float f12, s1.h hVar) {
        this.f8782a.m0(j10, f10, f11, j11, j12, f12, hVar);
    }

    @Override // f3.c
    public final long n(long j10) {
        s1.b bVar = this.f8782a;
        bVar.getClass();
        return a0.c.t(j10, bVar);
    }

    @Override // s1.d
    public final void p(q1.e0 e0Var, long j10, float f10, s1.e eVar) {
        this.f8782a.p(e0Var, j10, f10, eVar);
    }

    @Override // f3.c
    public final float r(long j10) {
        s1.b bVar = this.f8782a;
        bVar.getClass();
        return a0.c.s(j10, bVar);
    }

    @Override // s1.d
    public final void w(long j10, long j11, long j12, float f10, int i10) {
        this.f8782a.w(j10, j11, j12, f10, i10);
    }

    @Override // s1.d
    public final void x(q1.f fVar, long j10, long j11, long j12, float f10, q1.k kVar, int i10) {
        this.f8782a.x(fVar, j10, j11, j12, f10, kVar, i10);
    }
}
