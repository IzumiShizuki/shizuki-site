package i2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends q0 implements g2.u0, g2.c0, q1 {
    public static final q1.i0 M;
    public static final x N;
    public static final float[] O;
    public static final d P;
    public static final d Q;
    public o.f0 A;
    public float C;
    public p1.a D;
    public x E;
    public t1.b F;
    public q1.o G;
    public b0.i0 H;
    public boolean J;
    public o1 K;
    public t1.b L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f8700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g1 f8703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g1 f8704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ic.k f8707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f3.c f8708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f3.m f8709x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g2.w0 f8711z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f8710y = 0.8f;
    public long B = 0;
    public final f1 I = new f1(this, 1);

    static {
        q1.i0 i0Var = new q1.i0();
        i0Var.f17521b = 1.0f;
        i0Var.f17522c = 1.0f;
        i0Var.f17523d = 1.0f;
        long j10 = q1.w.f17581a;
        i0Var.f17527h = j10;
        i0Var.f17528i = j10;
        i0Var.f17530k = 8.0f;
        i0Var.f17531l = q1.p0.f17566b;
        i0Var.f17532m = q1.h0.f17515a;
        i0Var.f17534o = 9205357640488583168L;
        i0Var.f17535p = a.a.c();
        i0Var.f17536q = f3.m.f6667a;
        i0Var.f17537r = 3;
        M = i0Var;
        N = new x();
        O = q1.a0.a();
        P = new d(1);
        Q = new d(2);
    }

    public g1(j0 j0Var) {
        this.f8700o = j0Var;
        this.f8708w = j0Var.f8766y;
        this.f8709x = j0Var.f8767z;
    }

    public static g1 g1(g2.c0 c0Var) {
        g1 g1Var;
        g2.r0 r0Var = c0Var instanceof g2.r0 ? (g2.r0) c0Var : null;
        if (r0Var != null && (g1Var = r0Var.f7282a.f8831o) != null) {
            return g1Var;
        }
        jc.l.c(c0Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (g1) c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // g2.g1, g2.u0
    public final Object A() {
        j0 j0Var = this.f8700o;
        if (!j0Var.F.d(64)) {
            return null;
        }
        M0();
        Object objL0 = null;
        for (j1.p pVar = j0Var.F.f8666e; pVar != null; pVar = pVar.f9694e) {
            if ((pVar.f9692c & 64) != 0) {
                ?? F = pVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof s1) {
                        objL0 = ((s1) F).l0(objL0);
                    } else if ((F.f9692c & 64) != 0 && (F instanceof n)) {
                        j1.p pVar2 = ((n) F).f8789p;
                        int i10 = 0;
                        F = F;
                        eVar = eVar;
                        while (pVar2 != null) {
                            if ((pVar2.f9692c & 64) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    F = pVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new z0.e(new j1.p[16]);
                                    }
                                    if (F != 0) {
                                        eVar.b(F);
                                        F = 0;
                                    }
                                    eVar.b(pVar2);
                                }
                            }
                            pVar2 = pVar2.f9695f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
        }
        return objL0;
    }

    @Override // i2.q0
    public final void A0() {
        t1.b bVar = this.L;
        if (bVar != null) {
            d0(this.B, this.C, bVar);
        } else {
            Y(this.B, this.C, this.f8707v);
        }
    }

    @Override // g2.c0
    public final g2.c0 B() {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        W0();
        return this.f8700o.F.f8665d.f8704s;
    }

    public final void B0(g1 g1Var, p1.a aVar, boolean z10) {
        if (g1Var == this) {
            return;
        }
        g1 g1Var2 = this.f8704s;
        if (g1Var2 != null) {
            g1Var2.B0(g1Var, aVar, z10);
        }
        long j10 = this.B;
        float f10 = (int) (j10 >> 32);
        aVar.f16477a -= f10;
        aVar.f16479c -= f10;
        float f11 = (int) (j10 & 4294967295L);
        aVar.f16478b -= f11;
        aVar.f16480d -= f11;
        o1 o1Var = this.K;
        if (o1Var != null) {
            o1Var.k(aVar, true);
            if (this.f8706u && z10) {
                long j11 = this.f7182c;
                aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
            }
        }
    }

    public final long C0(g1 g1Var, long j10) {
        if (g1Var == this) {
            return j10;
        }
        g1 g1Var2 = this.f8704s;
        return (g1Var2 == null || jc.l.a(g1Var, g1Var2)) ? J0(j10) : J0(g1Var2.C0(g1Var, j10));
    }

    public final long D0(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - W();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - V();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float E0(long j10, long j11) {
        if (W() >= Float.intBitsToFloat((int) (j11 >> 32)) && V() >= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jD0 = D0(j11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - W());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - V()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void F0(q1.o oVar, t1.b bVar) {
        o1 o1Var = this.K;
        if (o1Var != null) {
            o1Var.b(oVar, bVar);
            return;
        }
        long j10 = this.B;
        float f10 = (int) (j10 >> 32);
        float f11 = (int) (j10 & 4294967295L);
        oVar.p(f10, f11);
        G0(oVar, bVar);
        oVar.p(-f10, -f11);
    }

    @Override // g2.c0
    public final long G(long j10) {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return V0(g2.n1.i(this), ((j2.v) m0.a(this.f8700o)).L(j10));
    }

    public final void G0(q1.o oVar, t1.b bVar) {
        q1.o oVar2;
        t1.b bVar2;
        j1.p pVarN0 = N0(4);
        if (pVarN0 == null) {
            b1(oVar, bVar);
            return;
        }
        j0 j0Var = this.f8700o;
        j0Var.getClass();
        l0 sharedDrawScope = ((j2.v) m0.a(j0Var)).getSharedDrawScope();
        long jR = gh.g.R(this.f7182c);
        sharedDrawScope.getClass();
        z0.e eVar = null;
        while (pVarN0 != null) {
            if (pVarN0 instanceof p) {
                oVar2 = oVar;
                bVar2 = bVar;
                sharedDrawScope.c(oVar2, jR, this, (p) pVarN0, bVar2);
            } else {
                oVar2 = oVar;
                bVar2 = bVar;
                if ((pVarN0.f9692c & 4) != 0 && (pVarN0 instanceof n)) {
                    int i10 = 0;
                    for (j1.p pVar = ((n) pVarN0).f8789p; pVar != null; pVar = pVar.f9695f) {
                        if ((pVar.f9692c & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                pVarN0 = pVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new z0.e(new j1.p[16]);
                                }
                                if (pVarN0 != null) {
                                    eVar.b(pVarN0);
                                    pVarN0 = null;
                                }
                                eVar.b(pVar);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                oVar = oVar2;
                bVar = bVar2;
            }
            pVarN0 = f.f(eVar);
            oVar = oVar2;
            bVar = bVar2;
        }
    }

    @Override // g2.c0
    public final long H(long j10) {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        W0();
        for (g1 g1Var = this; g1Var != null; g1Var = g1Var.f8704s) {
            j10 = g1Var.h1(j10);
        }
        return j10;
    }

    public abstract void H0();

    public final g1 I0(g1 g1Var) {
        j0 j0VarV = g1Var.f8700o;
        j0 j0Var = this.f8700o;
        if (j0VarV == j0Var) {
            j1.p pVarM0 = g1Var.M0();
            j1.p pVarM02 = M0();
            if (!pVarM02.f9690a.f9703n) {
                f2.a.b("visitLocalAncestors called on an unattached node");
            }
            for (j1.p pVar = pVarM02.f9690a.f9694e; pVar != null; pVar = pVar.f9694e) {
                if ((pVar.f9692c & 2) != 0 && pVar == pVarM0) {
                    return g1Var;
                }
            }
            return this;
        }
        while (j0VarV.f8757p > j0Var.f8757p) {
            j0VarV = j0VarV.v();
            jc.l.b(j0VarV);
        }
        j0 j0VarV2 = j0Var;
        while (j0VarV2.f8757p > j0VarV.f8757p) {
            j0VarV2 = j0VarV2.v();
            jc.l.b(j0VarV2);
        }
        while (j0VarV != j0VarV2) {
            j0VarV = j0VarV.v();
            j0VarV2 = j0VarV2.v();
            if (j0VarV == null || j0VarV2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (j0VarV2 != j0Var) {
            if (j0VarV != g1Var.f8700o) {
                return j0VarV.F.f8664c;
            }
            return g1Var;
        }
        return this;
    }

    public final long J0(long j10) {
        long j11 = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32);
        o1 o1Var = this.K;
        return o1Var != null ? o1Var.d(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract r0 K0();

    public final long L0() {
        return this.f8708w.f0(this.f8700o.A.d());
    }

    @Override // f3.c
    public final float M() {
        return this.f8700o.f8766y.M();
    }

    public abstract j1.p M0();

    public final j1.p N0(int i10) {
        boolean zG = h1.g(i10);
        j1.p pVarM0 = M0();
        if (!zG && (pVarM0 = pVarM0.f9694e) == null) {
            return null;
        }
        for (j1.p pVarO0 = O0(zG); pVarO0 != null && (pVarO0.f9693d & i10) != 0; pVarO0 = pVarO0.f9695f) {
            if ((pVarO0.f9692c & i10) != 0) {
                return pVarO0;
            }
            if (pVarO0 == pVarM0) {
                return null;
            }
        }
        return null;
    }

    public final j1.p O0(boolean z10) {
        j1.p pVarM0;
        d1 d1Var = this.f8700o.F;
        if (d1Var.f8665d == this) {
            return d1Var.f8667f;
        }
        if (!z10) {
            g1 g1Var = this.f8704s;
            if (g1Var != null) {
                return g1Var.M0();
            }
            return null;
        }
        g1 g1Var2 = this.f8704s;
        if (g1Var2 == null || (pVarM0 = g1Var2.M0()) == null) {
            return null;
        }
        return pVarM0.f9695f;
    }

    public final void P0(j1.p pVar, d dVar, long j10, s sVar, int i10, boolean z10) {
        if (pVar == null) {
            S0(dVar, j10, sVar, i10, z10);
            return;
        }
        int i11 = sVar.f8847c;
        o.g0 g0Var = sVar.f8845a;
        sVar.i(i11 + 1, g0Var.f15971b);
        sVar.f8847c++;
        g0Var.a(pVar);
        sVar.f8846b.a(f.a(-1.0f, z10, false));
        P0(f.e(pVar, dVar.b()), dVar, j10, sVar, i10, z10);
        sVar.f8847c = i11;
    }

    public final void Q0(j1.p pVar, d dVar, long j10, s sVar, int i10, boolean z10, float f10) {
        if (pVar == null) {
            S0(dVar, j10, sVar, i10, z10);
            return;
        }
        int i11 = sVar.f8847c;
        o.g0 g0Var = sVar.f8845a;
        sVar.i(i11 + 1, g0Var.f15971b);
        sVar.f8847c++;
        g0Var.a(pVar);
        sVar.f8846b.a(f.a(f10, z10, false));
        a1(f.e(pVar, dVar.b()), dVar, j10, sVar, i10, z10, f10, true);
        sVar.f8847c = i11;
    }

    public final void R0(d dVar, long j10, s sVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        j1.p pVarN0 = N0(dVar.b());
        if (!n1(j10)) {
            if (i10 == 1) {
                float fE0 = E0(j10, L0());
                if ((Float.floatToRawIntBits(fE0) & Integer.MAX_VALUE) < 2139095040) {
                    if (sVar.f8847c != ud.b.r(sVar)) {
                        if (f.h(sVar.a(), f.a(fE0, false, false)) <= 0) {
                            return;
                        }
                    }
                    Q0(pVarN0, dVar, j10, sVar, i10, false, fE0);
                    return;
                }
                return;
            }
            return;
        }
        if (pVarN0 == null) {
            S0(dVar, j10, sVar, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < W() && fIntBitsToFloat2 < V()) {
            P0(pVarN0, dVar, j10, sVar, i10, z10);
            return;
        }
        float fE02 = i10 == 1 ? E0(j10, L0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fE02) & Integer.MAX_VALUE) < 2139095040) {
            if (sVar.f8847c != ud.b.r(sVar)) {
                z11 = z10;
                if (f.h(sVar.a(), f.a(fE02, z11, false)) > 0) {
                }
                a1(pVarN0, dVar, j10, sVar, i10, z11, fE02, z12);
            }
            z11 = z10;
            z12 = true;
            a1(pVarN0, dVar, j10, sVar, i10, z11, fE02, z12);
        }
        z11 = z10;
        z12 = false;
        a1(pVarN0, dVar, j10, sVar, i10, z11, fE02, z12);
    }

    public void S0(d dVar, long j10, s sVar, int i10, boolean z10) {
        g1 g1Var = this.f8703r;
        if (g1Var != null) {
            g1Var.R0(dVar, g1Var.J0(j10), sVar, i10, z10);
        }
    }

    public final void T0() {
        o1 o1Var = this.K;
        if (o1Var != null) {
            o1Var.invalidate();
            return;
        }
        g1 g1Var = this.f8704s;
        if (g1Var != null) {
            g1Var.T0();
        }
    }

    public final boolean U0() {
        if (this.K != null && this.f8710y <= 0.0f) {
            return true;
        }
        g1 g1Var = this.f8704s;
        if (g1Var != null) {
            return g1Var.U0();
        }
        return false;
    }

    public final long V0(g2.c0 c0Var, long j10) {
        if (c0Var instanceof g2.r0) {
            g2.r0 r0Var = (g2.r0) c0Var;
            r0Var.f7282a.f8831o.W0();
            return r0Var.b(this, j10 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        g1 g1VarG1 = g1(c0Var);
        g1VarG1.W0();
        g1 g1VarI0 = I0(g1VarG1);
        while (g1VarG1 != g1VarI0) {
            j10 = g1VarG1.h1(j10);
            g1VarG1 = g1VarG1.f8704s;
            jc.l.b(g1VarG1);
        }
        return C0(g1VarI0, j10);
    }

    public final void W0() {
        this.f8700o.G.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r7v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void X0() {
        j1.p pVarM0;
        boolean zG = h1.g(128);
        j1.p pVarO0 = O0(zG);
        if (pVarO0 == null || (pVarO0.f9690a.f9693d & 128) == 0) {
            return;
        }
        h1.g gVarD = h1.t.d();
        ic.k kVarE = gVarD != null ? gVarD.e() : null;
        h1.g gVarG = h1.t.g(gVarD);
        try {
            if (!zG) {
                pVarM0 = M0().f9694e;
                if (pVarM0 == null) {
                }
            }
            pVarM0 = M0();
            for (j1.p pVarO02 = O0(zG); pVarO02 != null; pVarO02 = pVarO02.f9695f) {
                if ((pVarO02.f9693d & 128) == 0) {
                    break;
                }
                if ((pVarO02.f9692c & 128) != 0) {
                    ?? F = pVarO02;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof y) {
                            ((y) F).m(this.f7182c);
                        } else if ((F.f9692c & 128) != 0 && (F instanceof n)) {
                            j1.p pVar = ((n) F).f8789p;
                            int i10 = 0;
                            F = F;
                            eVar = eVar;
                            while (pVar != null) {
                                if ((pVar.f9692c & 128) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        F = pVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new z0.e(new j1.p[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(pVar);
                                    }
                                }
                                pVar = pVar.f9695f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F = f.f(eVar);
                    }
                }
                if (pVarO02 == pVarM0) {
                    break;
                }
            }
        } finally {
            h1.t.k(gVarD, gVarG, kVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void Y0() {
        boolean zG = h1.g(128);
        j1.p pVarM0 = M0();
        if (!zG && (pVarM0 = pVarM0.f9694e) == null) {
            return;
        }
        for (j1.p pVarO0 = O0(zG); pVarO0 != null && (pVarO0.f9693d & 128) != 0; pVarO0 = pVarO0.f9695f) {
            if ((pVarO0.f9692c & 128) != 0) {
                ?? F = pVarO0;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof y) {
                        ((y) F).B(this);
                    } else if ((F.f9692c & 128) != 0 && (F instanceof n)) {
                        j1.p pVar = ((n) F).f8789p;
                        int i10 = 0;
                        F = F;
                        eVar = eVar;
                        while (pVar != null) {
                            if ((pVar.f9692c & 128) != 0) {
                                i10++;
                                eVar = eVar;
                                if (i10 == 1) {
                                    F = pVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new z0.e(new j1.p[16]);
                                    }
                                    if (F != 0) {
                                        eVar.b(F);
                                        F = 0;
                                    }
                                    eVar.b(pVar);
                                }
                            }
                            pVar = pVar.f9695f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    F = f.f(eVar);
                }
            }
            if (pVarO0 == pVarM0) {
                return;
            }
        }
    }

    public final void Z0() {
        this.f8705t = true;
        this.I.b();
        e1();
        if (f3.j.b(this.B, 0L)) {
            return;
        }
        this.f8700o.O();
    }

    @Override // f3.c
    public final float a() {
        return this.f8700o.f8766y.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8 A[PHI: r9
      0x01b8: PHI (r9v5 ??) = (r9v1 ??), (r9v1 ??), (r9v7 ??) binds: [B:51:0x017d, B:53:0x0181, B:67:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v10, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [z0.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(j1.p r23, i2.d r24, long r25, i2.s r27, int r28, boolean r29, float r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.g1.a1(j1.p, i2.d, long, i2.s, int, boolean, float, boolean):void");
    }

    public abstract void b1(q1.o oVar, t1.b bVar);

    @Override // g2.c0
    public final long c(long j10) {
        long jH = H(j10);
        j2.v vVar = (j2.v) m0.a(this.f8700o);
        vVar.G();
        return q1.a0.b(jH, vVar.T);
    }

    public final void c1(long j10, float f10, ic.k kVar, t1.b bVar) {
        j0 j0Var = this.f8700o;
        if (bVar != null) {
            if (kVar != null) {
                f2.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.L != bVar) {
                this.L = null;
                l1(null, false);
                this.L = bVar;
            }
            if (this.K == null) {
                p1 p1VarA = m0.a(j0Var);
                b0.i0 i0Var = this.H;
                if (i0Var == null) {
                    b0.i0 i0Var2 = new b0.i0(9, this, new f1(this, 0));
                    this.H = i0Var2;
                    i0Var = i0Var2;
                }
                f1 f1Var = this.I;
                o1 o1VarJ = ((j2.v) p1VarA).j(i0Var, f1Var, bVar);
                o1VarJ.e(this.f7182c);
                o1VarJ.i(j10);
                this.K = o1VarJ;
                j0Var.J = true;
                f1Var.b();
            }
        } else {
            if (this.L != null) {
                this.L = null;
                l1(null, false);
            }
            l1(kVar, false);
        }
        if (!f3.j.b(this.B, j10)) {
            ((j2.v) m0.a(j0Var)).Q(-4.0f);
            this.B = j10;
            j0Var.G.f8805p.p0();
            o1 o1Var = this.K;
            if (o1Var != null) {
                o1Var.i(j10);
            } else {
                g1 g1Var = this.f8704s;
                if (g1Var != null) {
                    g1Var.T0();
                }
            }
            j0Var.O();
            q0.y0(this);
            p1 p1Var = j0Var.f8755n;
            if (p1Var != null) {
                ((j2.v) p1Var).C(j0Var);
            }
        }
        this.C = f10;
        if (!this.f8824k) {
            p0(u0());
        }
        if (this == j0Var.F.f8665d) {
            ((j2.v) m0.a(j0Var)).getRectManager().g(j0Var, !j0Var.G.f8805p.f8913k);
        }
    }

    @Override // g2.g1
    public abstract void d0(long j10, float f10, t1.b bVar);

    public final void d1(p1.a aVar, boolean z10, boolean z11) {
        o1 o1Var = this.K;
        if (o1Var != null) {
            if (this.f8706u) {
                if (z11) {
                    long jL0 = L0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jL0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL0 & 4294967295L)) / 2.0f;
                    long j10 = this.f7182c;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j10 >> 32)) + fIntBitsToFloat, ((int) (j10 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j11 = this.f7182c;
                    aVar.a(0.0f, 0.0f, (int) (j11 >> 32), (int) (j11 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            o1Var.k(aVar, false);
        }
        long j12 = this.B;
        float f10 = (int) (j12 >> 32);
        aVar.f16477a += f10;
        aVar.f16479c += f10;
        float f11 = (int) (j12 & 4294967295L);
        aVar.f16478b += f11;
        aVar.f16480d += f11;
    }

    public final void e1() {
        if (this.K != null) {
            if (this.L != null) {
                this.L = null;
            }
            l1(null, false);
            this.f8700o.X(false);
        }
    }

    @Override // g2.c0
    public final void f(g2.c0 c0Var, float[] fArr) {
        g1 g1VarG1 = g1(c0Var);
        g1VarG1.W0();
        g1 g1VarI0 = I0(g1VarG1);
        q1.a0.d(fArr);
        g1VarG1.k1(g1VarI0, fArr);
        j1(g1VarI0, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [z0.e] */
    public final void f1(g2.w0 w0Var) {
        g1 g1Var;
        g2.w0 w0Var2 = this.f8711z;
        if (w0Var != w0Var2) {
            this.f8711z = w0Var;
            j0 j0Var = this.f8700o;
            if (w0Var2 == null || w0Var.h() != w0Var2.h() || w0Var.b() != w0Var2.b()) {
                int iH = w0Var.h();
                int iB = w0Var.b();
                o1 o1Var = this.K;
                if (o1Var != null) {
                    o1Var.e((((long) iH) << 32) | (((long) iB) & 4294967295L));
                } else if (j0Var.J() && (g1Var = this.f8704s) != null) {
                    g1Var.T0();
                }
                h0((((long) iB) & 4294967295L) | (((long) iH) << 32));
                if (this.f8707v != null) {
                    m1(false);
                }
                boolean zG = h1.g(4);
                j1.p pVarM0 = M0();
                if (zG || (pVarM0 = pVarM0.f9694e) != null) {
                    for (j1.p pVarO0 = O0(zG); pVarO0 != null && (pVarO0.f9693d & 4) != 0; pVarO0 = pVarO0.f9695f) {
                        if ((pVarO0.f9692c & 4) != 0) {
                            ?? F = pVarO0;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof p) {
                                    ((p) F).G();
                                } else if ((F.f9692c & 4) != 0 && (F instanceof n)) {
                                    j1.p pVar = ((n) F).f8789p;
                                    int i10 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar != null) {
                                        if ((pVar.f9692c & 4) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                F = pVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(pVar);
                                            }
                                        }
                                        pVar = pVar.f9695f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F = f.f(eVar);
                            }
                        }
                        if (pVarO0 == pVarM0) {
                            break;
                        }
                    }
                }
                p1 p1Var = j0Var.f8755n;
                if (p1Var != null) {
                    ((j2.v) p1Var).C(j0Var);
                }
            }
            o.f0 f0Var = this.A;
            if ((f0Var == null || f0Var.f15957e == 0) && w0Var.i().isEmpty()) {
                return;
            }
            o.f0 f0Var2 = this.A;
            Map mapI = w0Var.i();
            if (f0Var2 != null && f0Var2.f15957e == mapI.size()) {
                Object[] objArr = f0Var2.f15954b;
                int[] iArr = f0Var2.f15955c;
                long[] jArr = f0Var2.f15953a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i11 = 0;
                loop0: while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j10) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                int i15 = iArr[i14];
                                Integer num = (Integer) mapI.get((g2.t) obj);
                                if (num == null || num.intValue() != i15) {
                                    break loop0;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i12 != 8) {
                            return;
                        }
                    }
                    if (i11 == length) {
                        return;
                    } else {
                        i11++;
                    }
                }
            }
            j0Var.G.f8805p.f8927y.f();
            o.f0 f0Var3 = this.A;
            if (f0Var3 == null) {
                o.f0 f0Var4 = o.p0.f16030a;
                f0Var3 = new o.f0();
                this.A = f0Var3;
            }
            f0Var3.a();
            for (Map.Entry entry : w0Var.i().entrySet()) {
                f0Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f8700o.f8767z;
    }

    @Override // g2.c0
    public final boolean h() {
        return M0().f9703n;
    }

    public final long h1(long j10) {
        o1 o1Var = this.K;
        if (o1Var != null) {
            j10 = o1Var.d(j10, false);
        }
        long j11 = this.B;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + ((int) (j11 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final p1.c i1() {
        if (M0().f9703n) {
            g2.c0 c0VarI = g2.n1.i(this);
            p1.a aVar = this.D;
            if (aVar == null) {
                aVar = new p1.a();
                this.D = aVar;
            }
            long jD0 = D0(L0());
            int i10 = (int) (jD0 >> 32);
            aVar.f16477a = -Float.intBitsToFloat(i10);
            int i11 = (int) (jD0 & 4294967295L);
            aVar.f16478b = -Float.intBitsToFloat(i11);
            aVar.f16479c = Float.intBitsToFloat(i10) + W();
            aVar.f16480d = Float.intBitsToFloat(i11) + V();
            g1 g1Var = this;
            while (g1Var != c0VarI) {
                g1Var.d1(aVar, false, true);
                if (!aVar.b()) {
                    g1Var = g1Var.f8704s;
                    jc.l.b(g1Var);
                }
            }
            return new p1.c(aVar.f16477a, aVar.f16478b, aVar.f16479c, aVar.f16480d);
        }
        return p1.c.f16482e;
    }

    @Override // g2.c0
    public final void j(float[] fArr) {
        p1 p1VarA = m0.a(this.f8700o);
        g1 g1VarG1 = g1(g2.n1.i(this));
        k1(g1VarG1, fArr);
        if (p1VarA instanceof c2.h) {
            ((j2.v) ((c2.h) p1VarA)).w(fArr);
            return;
        }
        long jU = g1VarG1.u(0L);
        if ((9223372034707292159L & jU) != 9205357640488583168L) {
            q1.a0.f(fArr, Float.intBitsToFloat((int) (jU >> 32)), Float.intBitsToFloat((int) (jU & 4294967295L)));
        }
    }

    public final void j1(g1 g1Var, float[] fArr) {
        if (jc.l.a(g1Var, this)) {
            return;
        }
        g1 g1Var2 = this.f8704s;
        jc.l.b(g1Var2);
        g1Var2.j1(g1Var, fArr);
        if (!f3.j.b(this.B, 0L)) {
            float[] fArr2 = O;
            q1.a0.d(fArr2);
            long j10 = this.B;
            q1.a0.f(fArr2, -((int) (j10 >> 32)), -((int) (j10 & 4294967295L)));
            q1.a0.e(fArr, fArr2);
        }
        o1 o1Var = this.K;
        if (o1Var != null) {
            o1Var.g(fArr);
        }
    }

    @Override // g2.c0
    public final long k() {
        return this.f7182c;
    }

    public final void k1(g1 g1Var, float[] fArr) {
        g1 g1Var2 = this;
        while (!g1Var2.equals(g1Var)) {
            o1 o1Var = g1Var2.K;
            if (o1Var != null) {
                o1Var.a(fArr);
            }
            if (!f3.j.b(g1Var2.B, 0L)) {
                float[] fArr2 = O;
                q1.a0.d(fArr2);
                q1.a0.f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                q1.a0.e(fArr, fArr2);
            }
            g1Var2 = g1Var2.f8704s;
            jc.l.b(g1Var2);
        }
    }

    public final void l1(ic.k kVar, boolean z10) {
        p1 p1Var;
        if (kVar != null && this.L != null) {
            f2.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        j0 j0Var = this.f8700o;
        boolean z11 = (!z10 && this.f8707v == kVar && jc.l.a(this.f8708w, j0Var.f8766y) && this.f8709x == j0Var.f8767z) ? false : true;
        this.f8708w = j0Var.f8766y;
        this.f8709x = j0Var.f8767z;
        boolean zI = j0Var.I();
        f1 f1Var = this.I;
        if (!zI || kVar == null) {
            this.f8707v = null;
            o1 o1Var = this.K;
            if (o1Var != null) {
                if (!q1.h0.p(o1Var.mo0getUnderlyingMatrixsQKQjiQ())) {
                    j0Var.O();
                }
                o1Var.destroy();
                j0Var.J = true;
                f1Var.b();
                if (M0().f9703n && j0Var.J() && (p1Var = j0Var.f8755n) != null) {
                    ((j2.v) p1Var).C(j0Var);
                }
            }
            this.K = null;
            this.J = false;
            return;
        }
        this.f8707v = kVar;
        if (this.K != null) {
            if (z11 && m1(true)) {
                j0Var.O();
                ((j2.v) m0.a(j0Var)).getRectManager().f(j0Var);
                return;
            }
            return;
        }
        p1 p1VarA = m0.a(j0Var);
        b0.i0 i0Var = this.H;
        if (i0Var == null) {
            b0.i0 i0Var2 = new b0.i0(9, this, new f1(this, 0));
            this.H = i0Var2;
            i0Var = i0Var2;
        }
        o1 o1VarJ = ((j2.v) p1VarA).j(i0Var, f1Var, null);
        o1VarJ.e(this.f7182c);
        o1VarJ.i(this.B);
        this.K = o1VarJ;
        m1(true);
        j0Var.J = true;
        f1Var.b();
    }

    public final boolean m1(boolean z10) {
        p1 p1Var;
        boolean z11 = false;
        if (this.L == null) {
            o1 o1Var = this.K;
            if (o1Var != null) {
                ic.k kVar = this.f8707v;
                if (kVar == null) {
                    throw j2.h0.g("updateLayerParameters requires a non-null layerBlock");
                }
                q1.i0 i0Var = M;
                i0Var.f(1.0f);
                i0Var.g(1.0f);
                i0Var.b(1.0f);
                i0Var.l(0.0f);
                i0Var.m(0.0f);
                i0Var.h(0.0f);
                long j10 = q1.w.f17581a;
                i0Var.c(j10);
                i0Var.j(j10);
                if (i0Var.f17529j != 0.0f) {
                    i0Var.f17520a |= 1024;
                    i0Var.f17529j = 0.0f;
                }
                if (i0Var.f17530k != 8.0f) {
                    i0Var.f17520a |= 2048;
                    i0Var.f17530k = 8.0f;
                }
                i0Var.k(q1.p0.f17566b);
                i0Var.i(q1.h0.f17515a);
                i0Var.d(false);
                if (i0Var.f17537r != 3) {
                    i0Var.f17520a |= 524288;
                    i0Var.f17537r = 3;
                }
                i0Var.f17534o = 9205357640488583168L;
                i0Var.f17538s = null;
                i0Var.f17520a = 0;
                j0 j0Var = this.f8700o;
                i0Var.f17535p = j0Var.f8766y;
                i0Var.f17536q = j0Var.f8767z;
                i0Var.f17534o = gh.g.R(this.f7182c);
                ((j2.v) m0.a(j0Var)).getSnapshotObserver().a(this, e.f8675f, new b0.d0(14, kVar));
                x xVar = this.E;
                if (xVar == null) {
                    xVar = new x();
                    this.E = xVar;
                }
                x xVar2 = N;
                xVar2.getClass();
                xVar2.f8890a = xVar.f8890a;
                xVar2.f8891b = xVar.f8891b;
                xVar2.f8892c = xVar.f8892c;
                xVar2.f8893d = xVar.f8893d;
                xVar2.f8894e = xVar.f8894e;
                xVar2.f8895f = xVar.f8895f;
                xVar2.f8896g = xVar.f8896g;
                xVar.f8890a = i0Var.f17521b;
                xVar.f8891b = i0Var.f17522c;
                xVar.f8892c = i0Var.f17524e;
                xVar.f8893d = i0Var.f17525f;
                xVar.f8894e = i0Var.f17529j;
                xVar.f8895f = i0Var.f17530k;
                xVar.f8896g = i0Var.f17531l;
                o1Var.h(i0Var);
                boolean z12 = this.f8706u;
                this.f8706u = i0Var.f17533n;
                this.f8710y = i0Var.f17523d;
                if (xVar2.f8890a == xVar.f8890a && xVar2.f8891b == xVar.f8891b && xVar2.f8892c == xVar.f8892c && xVar2.f8893d == xVar.f8893d && xVar2.f8894e == xVar.f8894e && xVar2.f8895f == xVar.f8895f && q1.p0.a(xVar2.f8896g, xVar.f8896g)) {
                    z11 = true;
                }
                boolean z13 = !z11;
                if (z10 && ((!z11 || z12 != this.f8706u) && (p1Var = j0Var.f8755n) != null)) {
                    ((j2.v) p1Var).C(j0Var);
                }
                return z13;
            }
            if (this.f8707v != null) {
                f2.a.b("null layer with a non-null layerBlock");
                return false;
            }
        }
        return false;
    }

    public final boolean n1(long j10) {
        if ((((9187343241974906880L ^ (j10 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        o1 o1Var = this.K;
        return o1Var == null || !this.f8706u || o1Var.c(j10);
    }

    @Override // g2.c0
    public final long o(g2.c0 c0Var, long j10) {
        return V0(c0Var, j10);
    }

    @Override // i2.q1
    public final boolean q() {
        return (this.K == null || this.f8705t || !this.f8700o.I()) ? false : true;
    }

    @Override // i2.q0
    public final q0 q0() {
        return this.f8703r;
    }

    @Override // g2.c0
    public final p1.c s(g2.c0 c0Var, boolean z10) {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!c0Var.h()) {
            f2.a.b("LayoutCoordinates " + c0Var + " is not attached!");
        }
        g1 g1VarG1 = g1(c0Var);
        g1VarG1.W0();
        g1 g1VarI0 = I0(g1VarG1);
        p1.a aVar = this.D;
        if (aVar == null) {
            aVar = new p1.a();
            this.D = aVar;
        }
        aVar.f16477a = 0.0f;
        aVar.f16478b = 0.0f;
        aVar.f16479c = (int) (c0Var.k() >> 32);
        aVar.f16480d = (int) (c0Var.k() & 4294967295L);
        while (g1VarG1 != g1VarI0) {
            g1VarG1.d1(aVar, z10, false);
            if (aVar.b()) {
                return p1.c.f16482e;
            }
            g1VarG1 = g1VarG1.f8704s;
            jc.l.b(g1VarG1);
        }
        B0(g1VarI0, aVar, z10);
        return new p1.c(aVar.f16477a, aVar.f16478b, aVar.f16479c, aVar.f16480d);
    }

    @Override // i2.q0
    public final boolean s0() {
        return this.f8711z != null;
    }

    @Override // i2.q0
    public final j0 t0() {
        return this.f8700o;
    }

    @Override // g2.c0
    public final long u(long j10) {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((j2.v) m0.a(this.f8700o)).x(H(j10));
    }

    @Override // i2.q0
    public final g2.w0 u0() {
        g2.w0 w0Var = this.f8711z;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // i2.q0
    public final q0 v0() {
        return this.f8704s;
    }

    @Override // i2.q0
    public final long w0() {
        return this.B;
    }

    @Override // g2.c0
    public final long z(long j10) {
        if (!M0().f9703n) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        g2.c0 c0VarI = g2.n1.i(this);
        j2.v vVar = (j2.v) m0.a(this.f8700o);
        vVar.G();
        return V0(c0VarI, p1.b.h(q1.a0.b(j10, vVar.U), c0VarI.H(0L)));
    }

    @Override // i2.q0
    public final g2.c0 r0() {
        return this;
    }
}
