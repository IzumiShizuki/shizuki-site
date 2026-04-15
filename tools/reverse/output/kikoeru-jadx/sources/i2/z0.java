package i2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends g2.g1 implements g2.u0, a, b1 {
    public boolean B;
    public float F;
    public boolean G;
    public ic.k H;
    public t1.b I;
    public float K;
    public boolean M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f8908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8909g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8913k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8915m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ic.k f8917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t1.b f8918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f8919q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8926x;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8910h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8911i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f8914l = h0.f8722c;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8916n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8920r = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k0 f8927y = new k0(this, 0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z0.e f8928z = new z0.e(new z0[16]);
    public boolean A = true;
    public long C = f3.b.b(0, 0, 15);
    public final y0 D = new y0(this, 1);
    public final y0 E = new y0(this, 0);
    public long J = 0;
    public final y0 L = new y0(this, 2);

    public z0(n0 n0Var) {
        this.f8908f = n0Var;
    }

    @Override // g2.g1, g2.u0
    public final Object A() {
        return this.f8921s;
    }

    @Override // i2.b1
    public final void C(boolean z10) {
        n0 n0Var = this.f8908f;
        if (z10 != n0Var.a().f8822i) {
            n0Var.a().f8822i = z10;
            this.M = true;
        }
    }

    @Override // i2.a
    public final void D() {
        this.B = true;
        k0 k0Var = this.f8927y;
        k0Var.h();
        boolean z10 = this.f8925w;
        n0 n0Var = this.f8908f;
        if (z10) {
            z0.e eVarZ = n0Var.f8790a.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                j0 j0Var = (j0) objArr[i11];
                if (j0Var.r() && j0Var.s() == h0.f8720a && j0.R(j0Var)) {
                    j0.Y(n0Var.f8790a, false, 7);
                }
            }
        }
        if (this.f8926x || (!this.f8915m && !d().f8824k && this.f8925w)) {
            this.f8925w = false;
            f0 f0Var = n0Var.f8793d;
            n0Var.f8793d = f0.f8691c;
            n0Var.g(false);
            j0 j0Var2 = n0Var.f8790a;
            r1 snapshotObserver = ((j2.v) m0.a(j0Var2)).getSnapshotObserver();
            snapshotObserver.a(j0Var2, snapshotObserver.f8841e, this.E);
            n0Var.f8793d = f0Var;
            if (d().f8824k && n0Var.f8799j) {
                requestLayout();
            }
            this.f8926x = false;
        }
        if (k0Var.f8775d) {
            k0Var.f8776e = true;
        }
        if (k0Var.f8773b && k0Var.e()) {
            k0Var.g();
        }
        this.B = false;
    }

    @Override // i2.a
    public final boolean F() {
        return this.f8922t;
    }

    @Override // i2.a
    public final void K() {
        j0.Y(this.f8908f.f8790a, false, 7);
    }

    @Override // g2.u0
    public final int L(int i10) {
        n0 n0Var = this.f8908f;
        if (!f.s(n0Var.f8790a)) {
            q0();
            return n0Var.a().L(i10);
        }
        v0 v0Var = n0Var.f8806q;
        jc.l.b(v0Var);
        return v0Var.L(i10);
    }

    @Override // g2.g1
    public final int R(g2.t tVar) {
        n0 n0Var = this.f8908f;
        j0 j0VarV = n0Var.f8790a.v();
        f0 f0Var = j0VarV != null ? j0VarV.G.f8793d : null;
        f0 f0Var2 = f0.f8689a;
        k0 k0Var = this.f8927y;
        if (f0Var == f0Var2) {
            k0Var.f8774c = true;
        } else {
            j0 j0VarV2 = n0Var.f8790a.v();
            if ((j0VarV2 != null ? j0VarV2.G.f8793d : null) == f0.f8691c) {
                k0Var.f8775d = true;
            }
        }
        this.f8915m = true;
        int iR = n0Var.a().R(tVar);
        this.f8915m = false;
        return iR;
    }

    @Override // g2.g1
    public final int V() {
        return this.f8908f.a().V();
    }

    @Override // g2.g1
    public final int W() {
        return this.f8908f.a().W();
    }

    @Override // g2.g1
    public final void Y(long j10, float f10, ic.k kVar) throws Throwable {
        u0(j10, f10, kVar, null);
    }

    @Override // g2.u0
    public final int b(int i10) {
        n0 n0Var = this.f8908f;
        if (!f.s(n0Var.f8790a)) {
            q0();
            return n0Var.a().b(i10);
        }
        v0 v0Var = n0Var.f8806q;
        jc.l.b(v0Var);
        return v0Var.b(i10);
    }

    @Override // i2.a
    public final u d() {
        return this.f8908f.f8790a.F.f8664c;
    }

    @Override // g2.g1
    public final void d0(long j10, float f10, t1.b bVar) throws Throwable {
        u0(j10, f10, null, bVar);
    }

    @Override // i2.a
    public final a g() {
        n0 n0Var;
        j0 j0VarV = this.f8908f.f8790a.v();
        if (j0VarV == null || (n0Var = j0VarV.G) == null) {
            return null;
        }
        return n0Var.f8805p;
    }

    @Override // i2.a
    public final k0 i() {
        return this.f8927y;
    }

    @Override // i2.a
    public final void l(a0.f0 f0Var) {
        z0.e eVarZ = this.f8908f.f8790a.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            f0Var.a(((j0) objArr[i11]).G.f8805p);
        }
    }

    public final List l0() {
        n0 n0Var = this.f8908f;
        n0Var.f8790a.j0();
        boolean z10 = this.A;
        z0.e eVar = this.f8928z;
        if (!z10) {
            return eVar.f();
        }
        j0 j0Var = n0Var.f8790a;
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (eVar.f26374c <= i11) {
                eVar.b(j0Var2.G.f8805p);
            } else {
                z0 z0Var = j0Var2.G.f8805p;
                Object[] objArr2 = eVar.f26372a;
                Object obj = objArr2[i11];
                objArr2[i11] = z0Var;
            }
        }
        eVar.l(((z0.b) j0Var.n()).f26366a.f26374c, eVar.f26374c);
        this.A = false;
        return eVar.f();
    }

    @Override // g2.u0
    public final int m(int i10) {
        n0 n0Var = this.f8908f;
        if (!f.s(n0Var.f8790a)) {
            q0();
            return n0Var.a().m(i10);
        }
        v0 v0Var = n0Var.f8806q;
        jc.l.b(v0Var);
        return v0Var.m(i10);
    }

    public final void n0() {
        boolean z10 = this.f8922t;
        this.f8922t = true;
        j0 j0Var = this.f8908f.f8790a;
        d1 d1Var = j0Var.F;
        if (!z10) {
            d1Var.f8664c.Y0();
            if (j0Var.r()) {
                j0.Y(j0Var, true, 6);
            } else if (j0Var.G.f8794e) {
                j0.W(j0Var, true, 6);
            }
        }
        g1 g1Var = d1Var.f8664c.f8703r;
        for (g1 g1Var2 = d1Var.f8665d; !jc.l.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f8703r) {
            if (g1Var2.J) {
                g1Var2.T0();
            }
        }
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (j0Var2.w() != Integer.MAX_VALUE) {
                j0Var2.G.f8805p.n0();
                j0.Z(j0Var2);
            }
        }
    }

    public final void o0() {
        if (this.f8922t) {
            this.f8922t = false;
            n0 n0Var = this.f8908f;
            d1 d1Var = n0Var.f8790a.F;
            g1 g1Var = d1Var.f8664c.f8703r;
            for (g1 g1Var2 = d1Var.f8665d; !jc.l.a(g1Var2, g1Var) && g1Var2 != null; g1Var2 = g1Var2.f8703r) {
                j1.p pVarO0 = g1Var2.O0(h1.g(1048576));
                if (pVarO0 != null && (pVarO0.f9690a.f9693d & 1048576) != 0) {
                    boolean zG = h1.g(1048576);
                    j1.p pVarM0 = g1Var2.M0();
                    if (zG || (pVarM0 = pVarM0.f9694e) != null) {
                        for (j1.p pVarO02 = g1Var2.O0(zG); pVarO02 != null && (pVarO02.f9693d & 1048576) != 0; pVarO02 = pVarO02.f9695f) {
                            if ((pVarO02.f9692c & 1048576) != 0) {
                                j1.p pVarF = pVarO02;
                                z0.e eVar = null;
                                while (pVarF != null) {
                                    if ((pVarF.f9692c & 1048576) != 0 && (pVarF instanceof n)) {
                                        int i10 = 0;
                                        for (j1.p pVar = ((n) pVarF).f8789p; pVar != null; pVar = pVar.f9695f) {
                                            if ((pVar.f9692c & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    pVarF = pVar;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new z0.e(new j1.p[16]);
                                                    }
                                                    if (pVarF != null) {
                                                        eVar.b(pVarF);
                                                        pVarF = null;
                                                    }
                                                    eVar.b(pVar);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    pVarF = f.f(eVar);
                                }
                            }
                            if (pVarO02 != pVarM0) {
                            }
                        }
                    }
                }
                g1Var2.e1();
            }
            z0.e eVarZ = n0Var.f8790a.z();
            Object[] objArr = eVarZ.f26372a;
            int i11 = eVarZ.f26374c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((j0) objArr[i12]).G.f8805p.o0();
            }
        }
    }

    public final void p0() {
        n0 n0Var = this.f8908f;
        if (n0Var.f8801l > 0) {
            z0.e eVarZ = n0Var.f8790a.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                j0 j0Var = (j0) objArr[i11];
                n0 n0Var2 = j0Var.G;
                boolean z10 = n0Var2.f8799j;
                z0 z0Var = n0Var2.f8805p;
                if ((z10 || n0Var2.f8800k) && !z0Var.f8925w) {
                    j0Var.X(false);
                }
                z0Var.p0();
            }
        }
    }

    public final void q0() {
        n0 n0Var = this.f8908f;
        j0.Y(n0Var.f8790a, false, 7);
        j0 j0Var = n0Var.f8790a;
        j0 j0VarV = j0Var.v();
        if (j0VarV == null || j0Var.C != h0.f8722c) {
            return;
        }
        int iOrdinal = j0VarV.G.f8793d.ordinal();
        j0Var.C = iOrdinal != 0 ? iOrdinal != 2 ? j0VarV.C : h0.f8721b : h0.f8720a;
    }

    public final void r0() {
        this.G = true;
        n0 n0Var = this.f8908f;
        j0 j0VarV = n0Var.f8790a.v();
        float f10 = d().C;
        j0 j0Var = n0Var.f8790a;
        d1 d1Var = j0Var.F;
        g1 g1Var = d1Var.f8665d;
        u uVar = d1Var.f8664c;
        while (g1Var != uVar) {
            jc.l.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            c0 c0Var = (c0) g1Var;
            f10 += c0Var.C;
            g1Var = c0Var.f8703r;
        }
        if (f10 != this.F) {
            this.F = f10;
            if (j0VarV != null) {
                j0VarV.P();
            }
            if (j0VarV != null) {
                j0VarV.C();
            }
        }
        if (this.f8922t) {
            j0Var.F.f8664c.Y0();
        } else {
            if (j0VarV != null) {
                j0VarV.C();
            }
            n0();
            if (this.f8909g && j0VarV != null) {
                j0VarV.X(false);
            }
        }
        if (j0VarV != null) {
            n0 n0Var2 = j0VarV.G;
            if (!this.f8909g && n0Var2.f8793d == f0.f8691c) {
                if (this.f8911i != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i10 = n0Var2.f8798i;
                this.f8911i = i10;
                n0Var2.f8798i = i10 + 1;
            }
        } else {
            this.f8911i = 0;
        }
        D();
    }

    @Override // i2.a
    public final void requestLayout() {
        this.f8908f.f8790a.X(false);
    }

    public final void s0(long j10) {
        n0 n0Var = this.f8908f;
        f0 f0Var = n0Var.f8793d;
        j0 j0Var = n0Var.f8790a;
        f0 f0Var2 = f0.f8693e;
        if (f0Var != f0Var2) {
            f2.a.b("layout state is not idle before measure starts");
        }
        this.C = j10;
        f0 f0Var3 = f0.f8689a;
        n0Var.f8793d = f0Var3;
        this.f8924v = false;
        r1 snapshotObserver = ((j2.v) m0.a(j0Var)).getSnapshotObserver();
        snapshotObserver.a(j0Var, snapshotObserver.f8839c, this.D);
        if (n0Var.f8793d == f0Var3) {
            this.f8925w = true;
            this.f8926x = true;
            n0Var.f8793d = f0Var2;
        }
    }

    @Override // g2.u0
    public final int t(int i10) {
        n0 n0Var = this.f8908f;
        if (!f.s(n0Var.f8790a)) {
            q0();
            return n0Var.a().t(i10);
        }
        v0 v0Var = n0Var.f8806q;
        jc.l.b(v0Var);
        return v0Var.t(i10);
    }

    public final void t0(long j10, float f10, ic.k kVar, t1.b bVar) {
        n0 n0Var = this.f8908f;
        j0 j0Var = n0Var.f8790a;
        j0 j0Var2 = n0Var.f8790a;
        if (j0Var.Q) {
            f2.a.a("place is called on a deactivated node");
        }
        n0Var.f8793d = f0.f8691c;
        this.f8916n = j10;
        this.f8919q = f10;
        this.f8917o = kVar;
        this.f8918p = bVar;
        this.G = false;
        p1 p1VarA = m0.a(j0Var2);
        if (this.f8925w || !this.f8922t) {
            this.f8927y.f8778g = false;
            n0Var.f(false);
            this.H = kVar;
            this.J = j10;
            this.K = f10;
            this.I = bVar;
            r1 snapshotObserver = ((j2.v) p1VarA).getSnapshotObserver();
            snapshotObserver.a(j0Var2, snapshotObserver.f8842f, this.L);
        } else {
            g1 g1VarA = n0Var.a();
            g1VarA.c1(f3.j.d(j10, g1VarA.f7184e), f10, kVar, bVar);
            r0();
        }
        n0Var.f8793d = f0.f8693e;
        this.f8913k = true;
    }

    public final void u0(long j10, float f10, ic.k kVar, t1.b bVar) throws Throwable {
        boolean z10;
        g2.f1 placementScope;
        n0 n0Var = this.f8908f;
        j0 j0Var = n0Var.f8790a;
        j0 j0Var2 = n0Var.f8790a;
        boolean z11 = true;
        try {
            this.f8923u = true;
            if (!f3.j.b(j10, this.f8916n) || this.M) {
                if (n0Var.f8800k || n0Var.f8799j || this.M) {
                    this.f8925w = true;
                    this.M = false;
                }
                p0();
            }
            v0 v0Var = n0Var.f8806q;
            if (v0Var != null) {
                n0 n0Var2 = v0Var.f8861f;
                if (f.s(n0Var2.f8790a)) {
                    z10 = true;
                } else {
                    if (v0Var.f8873r == s0.f8850c && !n0Var2.f8791b) {
                        n0Var2.f8792c = true;
                    }
                    z10 = n0Var2.f8792c;
                }
                if (z10) {
                    g1 g1Var = n0Var.a().f8704s;
                    if (g1Var == null || (placementScope = g1Var.f8825l) == null) {
                        placementScope = ((j2.v) m0.a(j0Var2)).getPlacementScope();
                    }
                    v0 v0Var2 = n0Var.f8806q;
                    jc.l.b(v0Var2);
                    j0 j0VarV = j0Var2.v();
                    if (j0VarV != null) {
                        j0VarV.G.f8797h = 0;
                    }
                    v0Var2.f8864i = Integer.MAX_VALUE;
                    placementScope.h(v0Var2, (int) (j10 >> 32), (int) (4294967295L & j10), 0.0f);
                }
            }
            v0 v0Var3 = n0Var.f8806q;
            if (v0Var3 == null || v0Var3.f8867l) {
                z11 = false;
            }
            if (z11) {
                f2.a.b("Error: Placement happened before lookahead.");
            }
            t0(j10, f10, kVar, bVar);
        } catch (Throwable th2) {
            j0Var.b0(th2);
            throw null;
        }
    }

    @Override // g2.u0
    public final g2.g1 v(long j10) throws Throwable {
        h0 h0Var;
        n0 n0Var = this.f8908f;
        j0 j0Var = n0Var.f8790a;
        h0 h0Var2 = j0Var.C;
        h0 h0Var3 = h0.f8722c;
        if (h0Var2 == h0Var3) {
            j0Var.e();
        }
        if (f.s(n0Var.f8790a)) {
            v0 v0Var = n0Var.f8806q;
            jc.l.b(v0Var);
            v0Var.f8865j = h0Var3;
            v0Var.v(j10);
        }
        j0 j0Var2 = n0Var.f8790a;
        j0 j0VarV = j0Var2.v();
        if (j0VarV != null) {
            n0 n0Var2 = j0VarV.G;
            if (this.f8914l != h0Var3 && !j0Var2.E) {
                f2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = n0Var2.f8793d.ordinal();
            if (iOrdinal == 0) {
                h0Var = h0.f8720a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + n0Var2.f8793d);
                }
                h0Var = h0.f8721b;
            }
            this.f8914l = h0Var;
        } else {
            this.f8914l = h0Var3;
        }
        v0(j10);
        return this;
    }

    public final boolean v0(long j10) throws Throwable {
        n0 n0Var = this.f8908f;
        j0 j0Var = n0Var.f8790a;
        j0 j0Var2 = n0Var.f8790a;
        try {
            if (j0Var.Q) {
                f2.a.a("measure is called on a deactivated node");
            }
            p1 p1VarA = m0.a(j0Var2);
            j0 j0VarV = j0Var2.v();
            boolean z10 = true;
            j0Var2.E = j0Var2.E || (j0VarV != null && j0VarV.E);
            if (!j0Var2.r() && f3.a.b(this.f7183d, j10)) {
                ((j2.v) p1VarA).m(j0Var2, false);
                j0Var2.a0();
                return false;
            }
            this.f8927y.f8777f = false;
            z0.e eVarZ = j0Var2.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((j0) objArr[i11]).G.f8805p.f8927y.f8774c = false;
            }
            this.f8912j = true;
            long j11 = n0Var.a().f7182c;
            k0(j10);
            s0(j10);
            if (f3.l.b(n0Var.a().f7182c, j11) && n0Var.a().f7180a == this.f7180a && n0Var.a().f7181b == this.f7181b) {
                z10 = false;
            }
            h0((((long) n0Var.a().f7181b) & 4294967295L) | (((long) n0Var.a().f7180a) << 32));
            return z10;
        } catch (Throwable th2) {
            j0Var.b0(th2);
            throw null;
        }
    }
}
