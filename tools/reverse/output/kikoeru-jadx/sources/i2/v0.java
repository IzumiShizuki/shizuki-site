package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends g2.g1 implements g2.u0, a, b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f8861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8862g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f3.a f8869n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ic.k f8871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t1.b f8872q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8877v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f8879x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8880y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8863h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8864i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f8865j = h0.f8722c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8870o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s0 f8873r = s0.f8850c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k0 f8874s = new k0(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z0.e f8875t = new z0.e(new v0[16]);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8876u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8878w = true;

    public v0(n0 n0Var) {
        this.f8861f = n0Var;
        this.f8879x = n0Var.f8805p.f8921s;
    }

    @Override // g2.g1, g2.u0
    public final Object A() {
        return this.f8879x;
    }

    @Override // i2.b1
    public final void C(boolean z10) {
        r0 r0VarK0;
        n0 n0Var = this.f8861f;
        r0 r0VarK02 = n0Var.a().K0();
        if (Boolean.valueOf(z10).equals(r0VarK02 != null ? Boolean.valueOf(r0VarK02.f8822i) : null) || (r0VarK0 = n0Var.a().K0()) == null) {
            return;
        }
        r0VarK0.f8822i = z10;
    }

    @Override // i2.a
    public final void D() {
        this.f8877v = true;
        k0 k0Var = this.f8874s;
        k0Var.h();
        n0 n0Var = this.f8861f;
        boolean z10 = n0Var.f8795f;
        j0 j0Var = n0Var.f8790a;
        if (z10) {
            z0.e eVarZ = j0Var.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                j0 j0Var2 = (j0) objArr[i11];
                n0 n0Var2 = j0Var2.G;
                if (n0Var2.f8794e && j0Var2.t() == h0.f8720a) {
                    v0 v0Var = n0Var2.f8806q;
                    jc.l.b(v0Var);
                    v0 v0Var2 = n0Var2.f8806q;
                    f3.a aVar = v0Var2 != null ? v0Var2.f8869n : null;
                    jc.l.b(aVar);
                    if (v0Var.s0(aVar.f6651a)) {
                        j0.W(j0Var, false, 7);
                    }
                }
            }
        }
        t tVar = d().S;
        jc.l.b(tVar);
        if (n0Var.f8796g || (!this.f8866k && !tVar.f8824k && n0Var.f8795f)) {
            n0Var.f8795f = false;
            f0 f0Var = n0Var.f8793d;
            n0Var.f8793d = f0.f8692d;
            p1 p1VarA = m0.a(j0Var);
            n0Var.i(false);
            r1 snapshotObserver = ((j2.v) p1VarA).getSnapshotObserver();
            b0.s1 s1Var = new b0.s1(6, this, tVar);
            snapshotObserver.getClass();
            if (j0Var.f8749h != null) {
                snapshotObserver.a(j0Var, snapshotObserver.f8844h, s1Var);
            } else {
                snapshotObserver.a(j0Var, snapshotObserver.f8841e, s1Var);
            }
            n0Var.f8793d = f0Var;
            if (n0Var.f8802m && tVar.f8824k) {
                requestLayout();
            }
            n0Var.f8796g = false;
        }
        if (k0Var.f8775d) {
            k0Var.f8776e = true;
        }
        if (k0Var.f8773b && k0Var.e()) {
            k0Var.g();
        }
        this.f8877v = false;
    }

    @Override // i2.a
    public final boolean F() {
        return this.f8873r != s0.f8850c;
    }

    @Override // i2.a
    public final void K() {
        j0.W(this.f8861f.f8790a, false, 7);
    }

    @Override // g2.u0
    public final int L(int i10) {
        p0();
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.L(i10);
    }

    @Override // g2.g1
    public final int R(g2.t tVar) {
        n0 n0Var = this.f8861f;
        j0 j0VarV = n0Var.f8790a.v();
        f0 f0Var = j0VarV != null ? j0VarV.G.f8793d : null;
        f0 f0Var2 = f0.f8690b;
        k0 k0Var = this.f8874s;
        if (f0Var == f0Var2) {
            k0Var.f8774c = true;
        } else {
            j0 j0VarV2 = n0Var.f8790a.v();
            if ((j0VarV2 != null ? j0VarV2.G.f8793d : null) == f0.f8692d) {
                k0Var.f8775d = true;
            }
        }
        this.f8866k = true;
        r0 r0VarK0 = n0Var.a().K0();
        jc.l.b(r0VarK0);
        int iR = r0VarK0.R(tVar);
        this.f8866k = false;
        return iR;
    }

    @Override // g2.g1
    public final int V() {
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.V();
    }

    @Override // g2.g1
    public final int W() {
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.W();
    }

    @Override // g2.g1
    public final void Y(long j10, float f10, ic.k kVar) throws Throwable {
        r0(j10, kVar, null);
    }

    @Override // g2.u0
    public final int b(int i10) {
        p0();
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.b(i10);
    }

    @Override // i2.a
    public final u d() {
        return this.f8861f.f8790a.F.f8664c;
    }

    @Override // g2.g1
    public final void d0(long j10, float f10, t1.b bVar) throws Throwable {
        r0(j10, null, bVar);
    }

    @Override // i2.a
    public final a g() {
        n0 n0Var;
        j0 j0VarV = this.f8861f.f8790a.v();
        if (j0VarV == null || (n0Var = j0VarV.G) == null) {
            return null;
        }
        return n0Var.f8806q;
    }

    @Override // i2.a
    public final k0 i() {
        return this.f8874s;
    }

    @Override // i2.a
    public final void l(a0.f0 f0Var) {
        z0.e eVarZ = this.f8861f.f8790a.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            v0 v0Var = ((j0) objArr[i11]).G.f8806q;
            jc.l.b(v0Var);
            f0Var.a(v0Var);
        }
    }

    public final void l0(boolean z10) {
        n0 n0Var = this.f8861f;
        if (z10 && n0Var.f8792c) {
            return;
        }
        if (z10 || n0Var.f8792c) {
            this.f8873r = s0.f8850c;
            z0.e eVarZ = n0Var.f8790a.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                v0 v0Var = ((j0) objArr[i11]).G.f8806q;
                jc.l.b(v0Var);
                v0Var.l0(true);
            }
        }
    }

    @Override // g2.u0
    public final int m(int i10) {
        p0();
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.m(i10);
    }

    public final void n0() {
        s0 s0Var = this.f8873r;
        n0 n0Var = this.f8861f;
        boolean z10 = n0Var.f8792c;
        j0 j0Var = n0Var.f8790a;
        s0 s0Var2 = s0.f8848a;
        if (z10) {
            this.f8873r = s0.f8849b;
        } else {
            this.f8873r = s0Var2;
        }
        if (s0Var != s0Var2 && n0Var.f8794e) {
            j0.W(j0Var, true, 6);
        }
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            v0 v0Var = j0Var2.G.f8806q;
            if (v0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (v0Var.f8864i != Integer.MAX_VALUE) {
                v0Var.n0();
                j0.Z(j0Var2);
            }
        }
    }

    public final void o0() {
        n0 n0Var = this.f8861f;
        if (n0Var.f8804o > 0) {
            z0.e eVarZ = n0Var.f8790a.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                j0 j0Var = (j0) objArr[i11];
                n0 n0Var2 = j0Var.G;
                if ((n0Var2.f8802m || n0Var2.f8803n) && !n0Var2.f8795f) {
                    j0Var.V(false);
                }
                v0 v0Var = n0Var2.f8806q;
                if (v0Var != null) {
                    v0Var.o0();
                }
            }
        }
    }

    public final void p0() {
        n0 n0Var = this.f8861f;
        j0.W(n0Var.f8790a, false, 7);
        j0 j0Var = n0Var.f8790a;
        j0 j0VarV = j0Var.v();
        if (j0VarV == null || j0Var.C != h0.f8722c) {
            return;
        }
        int iOrdinal = j0VarV.G.f8793d.ordinal();
        j0Var.C = iOrdinal != 0 ? iOrdinal != 2 ? j0VarV.C : h0.f8721b : h0.f8720a;
    }

    public final void q0() {
        f0 f0Var;
        this.f8880y = true;
        n0 n0Var = this.f8861f;
        j0 j0VarV = n0Var.f8790a.v();
        s0 s0Var = this.f8873r;
        if ((s0Var != s0.f8848a && !n0Var.f8792c) || (s0Var != s0.f8849b && n0Var.f8792c)) {
            n0();
            if (this.f8862g && j0VarV != null) {
                j0VarV.V(false);
            }
        }
        if (j0VarV != null) {
            n0 n0Var2 = j0VarV.G;
            if (!this.f8862g && ((f0Var = n0Var2.f8793d) == f0.f8691c || f0Var == f0.f8692d)) {
                if (this.f8864i != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i10 = n0Var2.f8797h;
                this.f8864i = i10;
                n0Var2.f8797h = i10 + 1;
            }
        } else {
            this.f8864i = 0;
        }
        D();
    }

    public final void r0(long j10, ic.k kVar, t1.b bVar) throws Throwable {
        n0 n0Var = this.f8861f;
        j0 j0Var = n0Var.f8790a;
        j0 j0Var2 = n0Var.f8790a;
        try {
            j0 j0VarV = j0Var.v();
            f0 f0Var = j0VarV != null ? j0VarV.G.f8793d : null;
            f0 f0Var2 = f0.f8692d;
            if (f0Var == f0Var2) {
                n0Var.f8792c = false;
            }
            if (j0Var2.Q) {
                f2.a.a("place is called on a deactivated node");
            }
            n0Var.f8793d = f0Var2;
            this.f8867l = true;
            this.f8880y = false;
            if (!f3.j.b(j10, this.f8870o)) {
                if (n0Var.f8803n || n0Var.f8802m) {
                    n0Var.f8795f = true;
                }
                o0();
            }
            p1 p1VarA = m0.a(j0Var2);
            if (n0Var.f8795f || !F()) {
                n0Var.h(false);
                this.f8874s.f8778g = false;
                r1 snapshotObserver = ((j2.v) p1VarA).getSnapshotObserver();
                u0 u0Var = new u0(this, p1VarA, j10);
                snapshotObserver.getClass();
                if (j0Var2.f8749h != null) {
                    snapshotObserver.a(j0Var2, snapshotObserver.f8843g, u0Var);
                } else {
                    snapshotObserver.a(j0Var2, snapshotObserver.f8842f, u0Var);
                }
            } else {
                r0 r0VarK0 = n0Var.a().K0();
                jc.l.b(r0VarK0);
                r0VarK0.E0(f3.j.d(j10, r0VarK0.f7184e));
                q0();
            }
            this.f8870o = j10;
            this.f8871p = kVar;
            this.f8872q = bVar;
            n0Var.f8793d = f0.f8693e;
        } catch (Throwable th2) {
            j0Var.b0(th2);
            throw null;
        }
    }

    @Override // i2.a
    public final void requestLayout() {
        this.f8861f.f8790a.V(false);
    }

    public final boolean s0(long j10) throws Throwable {
        long j11;
        n0 n0Var = this.f8861f;
        j0 j0Var = n0Var.f8790a;
        j0 j0Var2 = n0Var.f8790a;
        try {
            if (j0Var.Q) {
                f2.a.a("measure is called on a deactivated node");
            }
            j0 j0VarV = j0Var2.v();
            j0Var2.E = j0Var2.E || (j0VarV != null && j0VarV.E);
            if (!j0Var2.G.f8794e) {
                f3.a aVar = this.f8869n;
                if (aVar == null ? false : f3.a.b(aVar.f6651a, j10)) {
                    p1 p1Var = j0Var2.f8755n;
                    if (p1Var != null) {
                        ((j2.v) p1Var).m(j0Var2, true);
                    }
                    j0Var2.a0();
                    return false;
                }
            }
            this.f8869n = new f3.a(j10);
            k0(j10);
            this.f8874s.f8777f = false;
            z0.e eVarZ = j0Var2.z();
            Object[] objArr = eVarZ.f26372a;
            int i10 = eVarZ.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                v0 v0Var = ((j0) objArr[i11]).G.f8806q;
                jc.l.b(v0Var);
                v0Var.f8874s.f8774c = false;
            }
            if (this.f8868m) {
                j11 = this.f7182c;
            } else {
                long j12 = Integer.MIN_VALUE;
                j11 = (j12 & 4294967295L) | (j12 << 32);
            }
            this.f8868m = true;
            r0 r0VarK0 = n0Var.a().K0();
            if (!(r0VarK0 != null)) {
                f2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            n0Var.c(j10);
            h0((((long) r0VarK0.f7181b) & 4294967295L) | (((long) r0VarK0.f7180a) << 32));
            return (((int) (j11 >> 32)) == r0VarK0.f7180a && ((int) (j11 & 4294967295L)) == r0VarK0.f7181b) ? false : true;
        } catch (Throwable th2) {
            j0Var.b0(th2);
            throw null;
        }
    }

    @Override // g2.u0
    public final int t(int i10) {
        p0();
        r0 r0VarK0 = this.f8861f.a().K0();
        jc.l.b(r0VarK0);
        return r0VarK0.t(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // g2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.g1 v(long r6) {
        /*
            r5 = this;
            i2.n0 r0 = r5.f8861f
            i2.j0 r1 = r0.f8790a
            i2.j0 r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            i2.n0 r1 = r1.G
            i2.f0 r1 = r1.f8793d
            goto L11
        L10:
            r1 = r2
        L11:
            i2.f0 r3 = i2.f0.f8690b
            if (r1 == r3) goto L25
            i2.j0 r1 = r0.f8790a
            i2.j0 r1 = r1.v()
            if (r1 == 0) goto L21
            i2.n0 r1 = r1.G
            i2.f0 r2 = r1.f8793d
        L21:
            i2.f0 r1 = i2.f0.f8692d
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f8791b = r1
        L28:
            i2.j0 r1 = r0.f8790a
            i2.j0 r2 = r1.v()
            if (r2 == 0) goto L72
            i2.n0 r2 = r2.G
            i2.h0 r3 = r5.f8865j
            i2.h0 r4 = i2.h0.f8722c
            if (r3 == r4) goto L42
            boolean r1 = r1.E
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            f2.a.b(r1)
        L42:
            i2.f0 r1 = r2.f8793d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            i2.f0 r0 = r2.f8793d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            i2.h0 r1 = i2.h0.f8721b
            goto L6f
        L6d:
            i2.h0 r1 = i2.h0.f8720a
        L6f:
            r5.f8865j = r1
            goto L76
        L72:
            i2.h0 r1 = i2.h0.f8722c
            r5.f8865j = r1
        L76:
            i2.j0 r0 = r0.f8790a
            i2.h0 r1 = r0.C
            i2.h0 r2 = i2.h0.f8722c
            if (r1 != r2) goto L81
            r0.e()
        L81:
            r5.s0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.v0.v(long):g2.g1");
    }
}
