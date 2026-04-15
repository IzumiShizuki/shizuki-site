package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8897a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8900d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f3.a f8905i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7.e1 f8898b = new c7.e1(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f8901e = new androidx.media3.exoplayer.offline.u(23);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.e f8902f = new z0.e(new j0[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8903g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0.e f8904h = new z0.e(new w0[16]);

    public x0(j0 j0Var) {
        this.f8897a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(i2.j0 r5, f3.a r6) throws java.lang.Throwable {
        /*
            i2.j0 r0 = r5.f8749h
            i2.n0 r1 = r5.G
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            i2.v0 r0 = r1.f8806q
            jc.l.b(r0)
            long r3 = r6.f6651a
            boolean r6 = r0.s0(r3)
            goto L2f
        L18:
            r6 = 0
            goto L2f
        L1a:
            i2.v0 r6 = r1.f8806q
            if (r6 == 0) goto L21
            f3.a r1 = r6.f8869n
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            jc.l.b(r6)
            long r0 = r1.f6651a
            boolean r6 = r6.s0(r0)
        L2f:
            i2.j0 r0 = r5.v()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            i2.j0 r1 = r0.f8749h
            r3 = 3
            if (r1 != 0) goto L40
            i2.j0.Y(r0, r2, r3)
            return r6
        L40:
            i2.h0 r1 = r5.t()
            i2.h0 r4 = i2.h0.f8720a
            if (r1 != r4) goto L4c
            i2.j0.W(r0, r2, r3)
            return r6
        L4c:
            i2.h0 r5 = r5.t()
            i2.h0 r1 = i2.h0.f8721b
            if (r5 != r1) goto L57
            r0.V(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.x0.b(i2.j0, f3.a):boolean");
    }

    public static boolean c(j0 j0Var, f3.a aVar) {
        boolean zQ = aVar != null ? j0Var.Q(aVar) : j0.R(j0Var);
        j0 j0VarV = j0Var.v();
        if (zQ && j0VarV != null) {
            if (j0Var.s() == h0.f8720a) {
                j0.Y(j0VarV, false, 3);
                return zQ;
            }
            if (j0Var.s() == h0.f8721b) {
                j0VarV.X(false);
            }
        }
        return zQ;
    }

    public static boolean h(j0 j0Var) {
        v0 v0Var;
        k0 k0Var;
        if (j0Var.G.f8794e) {
            return (j0Var.t() == h0.f8722c && ((v0Var = j0Var.G.f8806q) == null || (k0Var = v0Var.f8874s) == null || !k0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(j0 j0Var) {
        if (!j0Var.r()) {
            return false;
        }
        do {
            if (j0Var.s() == h0.f8722c && !j0Var.G.f8805p.f8927y.e()) {
                j0 j0VarV = j0Var.v();
                if ((j0VarV != null ? j0VarV.G.f8793d : null) != f0.f8689a) {
                    return false;
                }
            }
            j0Var = j0Var.v();
            if (j0Var == null) {
                return false;
            }
        } while (!j0Var.J());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            androidx.media3.exoplayer.offline.u r1 = r7.f8901e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f968b
            z0.e r8 = (z0.e) r8
            i2.j0 r2 = r7.f8897a
            int r3 = r2.P
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.O = r0
        L17:
            java.lang.Object r8 = r1.f968b
            z0.e r8 = (z0.e) r8
            int r2 = r8.f26374c
            if (r2 == 0) goto L62
            i2.m1 r3 = i2.m1.f8786b
            java.lang.Object[] r4 = r8.f26372a
            r5 = 0
            vb.l.L0(r4, r3, r5, r2)
            int r2 = r8.f26374c
            java.lang.Object r3 = r1.f969c
            i2.j0[] r3 = (i2.j0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            i2.j0[] r3 = new i2.j0[r3]
        L3a:
            r4 = 0
            r1.f969c = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f26372a
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            jc.l.b(r8)
            boolean r0 = r8.O
            if (r0 == 0) goto L5b
            androidx.media3.exoplayer.offline.u.T0(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f969c = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.x0.a(boolean):void");
    }

    public final void d() {
        z0.e eVar = this.f8904h;
        int i10 = eVar.f26374c;
        if (i10 != 0) {
            Object[] objArr = eVar.f26372a;
            for (int i11 = 0; i11 < i10; i11++) {
                w0 w0Var = (w0) objArr[i11];
                j0 j0Var = w0Var.f8887a;
                boolean z10 = w0Var.f8889c;
                j0 j0Var2 = w0Var.f8887a;
                if (j0Var.I()) {
                    if (w0Var.f8888b) {
                        j0.W(j0Var2, z10, 2);
                    } else {
                        j0.Y(j0Var2, z10, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(j0 j0Var) {
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (jc.l.a(j0Var2.K(), Boolean.TRUE) && !j0Var2.Q) {
                if (this.f8898b.p(j0Var2)) {
                    j0Var2.L();
                }
                e(j0Var2);
            }
        }
    }

    public final void f(j0 j0Var, boolean z10) {
        if (!this.f8899c) {
            f2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? j0Var.G.f8794e : j0Var.r()) {
            f2.a.a("node not yet measured");
        }
        g(j0Var, z10);
    }

    public final void g(j0 j0Var, boolean z10) {
        v0 v0Var;
        k0 k0Var;
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            h0 h0Var = h0.f8720a;
            if ((!z10 && (j0Var2.s() == h0Var || j0Var2.G.f8805p.f8927y.e())) || (z10 && (j0Var2.t() == h0Var || ((v0Var = j0Var2.G.f8806q) != null && (k0Var = v0Var.f8874s) != null && k0Var.e())))) {
                boolean zS = f.s(j0Var2);
                n0 n0Var = j0Var2.G;
                if (zS && !z10) {
                    if (n0Var.f8794e && this.f8898b.p(j0Var2)) {
                        m(j0Var2, true, false);
                    } else {
                        f(j0Var2, true);
                    }
                }
                if (z10 ? n0Var.f8794e : j0Var2.r()) {
                    m(j0Var2, z10, false);
                }
                if (!(z10 ? n0Var.f8794e : j0Var2.r())) {
                    g(j0Var2, z10);
                }
            }
        }
        if (z10 ? j0Var.G.f8794e : j0Var.r()) {
            m(j0Var, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(j2.t tVar) {
        boolean z10;
        j1.p pVar;
        ?? F;
        j0 j0Var;
        boolean z11;
        boolean z12;
        c7.e1 e1Var = this.f8898b;
        j0 j0Var2 = this.f8897a;
        if (!j0Var2.I()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!j0Var2.J()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f8899c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        if (this.f8905i != null) {
            this.f8899c = true;
            this.f8900d = true;
            try {
                boolean zJ = e1Var.J();
                b0.c1 c1Var = (b0.c1) e1Var.f3618b;
                if (zJ) {
                    z10 = false;
                    while (true) {
                        b0.c1 c1Var2 = (b0.c1) e1Var.f3620d;
                        b0.c1 c1Var3 = (b0.c1) e1Var.f3619c;
                        if (((z1) c1Var.f1208b).isEmpty()) {
                            if (!((z1) c1Var3.f1208b).isEmpty()) {
                                j0Var = (j0) ((z1) c1Var3.f1208b).first();
                                c1Var3.C(j0Var);
                                z11 = j0Var.f8749h != null;
                                z12 = true;
                            } else {
                                if (((z1) c1Var2.f1208b).isEmpty()) {
                                    break;
                                }
                                j0 j0Var3 = (j0) ((z1) c1Var2.f1208b).first();
                                c1Var2.C(j0Var3);
                                j0Var = j0Var3;
                            }
                            z12 = true;
                        } else {
                            j0Var = (j0) ((z1) c1Var.f1208b).first();
                            c1Var.C(j0Var);
                            z11 = j0Var.f8749h != null;
                            z12 = false;
                        }
                        boolean zM = m(j0Var, z11, z12);
                        if (!z12) {
                            if (j0Var.G.f8795f) {
                                e1Var.i(j0Var, w.f8883b);
                            }
                            if (j0Var.p()) {
                                e1Var.i(j0Var, w.f8885d);
                            }
                        }
                        if (j0Var == j0Var2 && zM) {
                            z10 = true;
                        }
                    }
                    if (tVar != null) {
                        tVar.b();
                    }
                } else {
                    z10 = false;
                }
            } finally {
            }
        } else {
            z10 = false;
        }
        z0.e eVar = this.f8902f;
        Object[] objArr = eVar.f26372a;
        int i11 = eVar.f26374c;
        int i12 = 0;
        while (i12 < i11) {
            d1 d1Var = ((j0) objArr[i12]).F;
            u uVar = d1Var.f8664c;
            boolean zG = h1.g(128);
            if (zG) {
                pVar = uVar.R;
            } else {
                pVar = uVar.R.f9694e;
                if (pVar == null) {
                }
                i12++;
                i10 = 0;
            }
            q1.i0 i0Var = g1.M;
            j1.p pVarO0 = uVar.O0(zG);
            while (pVarO0 != null && (pVarO0.f9693d & 128) != 0) {
                if ((pVarO0.f9692c & 128) != 0) {
                    ?? r13 = pVarO0;
                    ?? eVar2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof y) {
                            ((y) r13).B(d1Var.f8664c);
                        } else {
                            if ((r13.f9692c & 128) != 0 && (r13 instanceof n)) {
                                j1.p pVar2 = ((n) r13).f8789p;
                                F = r13;
                                eVar2 = eVar2;
                                while (pVar2 != null) {
                                    if ((pVar2.f9692c & 128) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            F = pVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            i10 = 0;
                            r13 = F;
                            eVar2 = eVar2;
                        }
                        F = f.f(eVar2);
                        i10 = 0;
                        r13 = F;
                        eVar2 = eVar2;
                    }
                }
                if (pVarO0 != pVar) {
                    pVarO0 = pVarO0.f9695f;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        eVar.g();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [i2.j0, java.lang.Object] */
    public final void k(j0 j0Var, long j10) {
        j1.p pVar;
        ?? F;
        if (j0Var.Q) {
            return;
        }
        j0 j0Var2 = this.f8897a;
        if (j0Var.equals(j0Var2)) {
            f2.a.a("measureAndLayout called on root");
        }
        if (!j0Var2.I()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!j0Var2.J()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f8899c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f8905i != null) {
            this.f8899c = true;
            this.f8900d = false;
            try {
                c7.e1 e1Var = this.f8898b;
                ((b0.c1) e1Var.f3618b).C(j0Var);
                ((b0.c1) e1Var.f3619c).C(j0Var);
                ((b0.c1) e1Var.f3620d).C(j0Var);
                if ((b(j0Var, new f3.a(j10)) || j0Var.G.f8795f) && jc.l.a(j0Var.K(), Boolean.TRUE)) {
                    j0Var.L();
                }
                e(j0Var);
                c(j0Var, new f3.a(j10));
                if (j0Var.p() && j0Var.J()) {
                    j0Var.U();
                    androidx.media3.exoplayer.offline.u uVar = this.f8901e;
                    uVar.getClass();
                    if (j0Var.P > 0) {
                        ((z0.e) uVar.f968b).b(j0Var);
                        j0Var.O = true;
                    }
                }
                d();
            } finally {
            }
        }
        z0.e eVar = this.f8902f;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            d1 d1Var = ((j0) objArr[i11]).F;
            u uVar2 = d1Var.f8664c;
            boolean zG = h1.g(128);
            if (zG) {
                pVar = uVar2.R;
            } else {
                pVar = uVar2.R.f9694e;
                if (pVar == null) {
                }
            }
            q1.i0 i0Var = g1.M;
            for (j1.p pVarO0 = uVar2.O0(zG); pVarO0 != null && (pVarO0.f9693d & 128) != 0; pVarO0 = pVarO0.f9695f) {
                if ((pVarO0.f9692c & 128) != 0) {
                    ?? r12 = pVarO0;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof y) {
                            ((y) r12).B(d1Var.f8664c);
                        } else {
                            if ((r12.f9692c & 128) != 0 && (r12 instanceof n)) {
                                j1.p pVar2 = ((n) r12).f8789p;
                                int i12 = 0;
                                F = r12;
                                eVar2 = eVar2;
                                while (pVar2 != null) {
                                    if ((pVar2.f9692c & 128) != 0) {
                                        i12++;
                                        eVar2 = eVar2;
                                        if (i12 == 1) {
                                            F = pVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            r12 = F;
                            eVar2 = eVar2;
                        }
                        F = f.f(eVar2);
                        r12 = F;
                        eVar2 = eVar2;
                    }
                }
                if (pVarO0 != pVar) {
                }
            }
        }
        eVar.g();
    }

    public final void l() {
        c7.e1 e1Var = this.f8898b;
        if (e1Var.J()) {
            j0 j0Var = this.f8897a;
            if (!j0Var.I()) {
                f2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!j0Var.J()) {
                f2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f8899c) {
                f2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f8905i != null) {
                this.f8899c = true;
                this.f8900d = false;
                try {
                    if (!((z1) ((b0.c1) e1Var.f3620d).f1208b).isEmpty() && !((z1) ((b0.c1) e1Var.f3618b).f1208b).isEmpty()) {
                        if (j0Var.f8749h != null) {
                            o(j0Var, true);
                        } else {
                            n(j0Var);
                        }
                    }
                    o(j0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f8899c = false;
                        this.f8900d = false;
                    }
                }
            }
        }
    }

    public final boolean m(j0 j0Var, boolean z10, boolean z11) {
        f3.a aVar;
        boolean zB;
        g2.f1 placementScope;
        u uVar;
        j0 j0VarV;
        v0 v0Var;
        k0 k0Var;
        boolean z12 = j0Var.Q;
        n0 n0Var = j0Var.G;
        if (z12 || (!j0Var.J() && !n0Var.f8805p.f8923u && !i(j0Var) && !jc.l.a(j0Var.K(), Boolean.TRUE) && !h(j0Var) && !n0Var.f8805p.f8927y.e() && ((v0Var = n0Var.f8806q) == null || (k0Var = v0Var.f8874s) == null || !k0Var.e()))) {
            return false;
        }
        j0 j0Var2 = this.f8897a;
        if (j0Var == j0Var2) {
            aVar = this.f8905i;
            jc.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            zB = n0Var.f8794e ? b(j0Var, aVar) : false;
            if (z11 && ((zB || n0Var.f8795f) && jc.l.a(j0Var.K(), Boolean.TRUE))) {
                j0Var.L();
            }
        } else {
            boolean zC = j0Var.r() ? c(j0Var, aVar) : false;
            if (z11 && j0Var.p() && (j0Var == j0Var2 || ((j0VarV = j0Var.v()) != null && j0VarV.J() && n0Var.f8805p.f8923u))) {
                if (j0Var == j0Var2) {
                    if (j0Var.C == h0.f8722c) {
                        j0Var.f();
                    }
                    j0 j0VarV2 = j0Var.v();
                    if (j0VarV2 == null || (uVar = j0VarV2.F.f8664c) == null || (placementScope = uVar.f8825l) == null) {
                        placementScope = ((j2.v) m0.a(j0Var)).getPlacementScope();
                    }
                    g2.f1.k(placementScope, n0Var.f8805p, 0, 0);
                } else {
                    j0Var.U();
                }
                androidx.media3.exoplayer.offline.u uVar2 = this.f8901e;
                uVar2.getClass();
                if (j0Var.P > 0) {
                    ((z0.e) uVar2.f968b).b(j0Var);
                    j0Var.O = true;
                }
                ((j2.v) m0.a(j0Var)).getRectManager().e(j0Var);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(j0 j0Var) throws Throwable {
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (j0Var2.s() == h0.f8720a || j0Var2.G.f8805p.f8927y.e()) {
                if (f.s(j0Var2)) {
                    o(j0Var2, true);
                } else {
                    n(j0Var2);
                }
            }
        }
    }

    public final void o(j0 j0Var, boolean z10) throws Throwable {
        f3.a aVar;
        if (j0Var.Q) {
            return;
        }
        if (j0Var == this.f8897a) {
            aVar = this.f8905i;
            jc.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(j0Var, aVar);
        } else {
            c(j0Var, aVar);
        }
    }

    public final boolean p(j0 j0Var, boolean z10) {
        int iOrdinal = j0Var.G.f8793d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f8904h.b(new w0(j0Var, false, z10));
            } else {
                if (iOrdinal != 4) {
                    throw new ce.j0();
                }
                if (!j0Var.r() || z10) {
                    j0Var.G.f8805p.f8924v = true;
                    if (!j0Var.Q && (j0Var.J() || i(j0Var))) {
                        j0 j0VarV = j0Var.v();
                        if (j0VarV == null || !j0VarV.r()) {
                            this.f8898b.i(j0Var, w.f8884c);
                        }
                        if (!this.f8900d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j10) {
        f3.a aVar = this.f8905i;
        if (aVar == null ? false : f3.a.b(aVar.f6651a, j10)) {
            return;
        }
        if (this.f8899c) {
            f2.a.a("updateRootConstraints called while measuring");
        }
        this.f8905i = new f3.a(j10);
        j0 j0Var = this.f8897a;
        j0 j0Var2 = j0Var.f8749h;
        n0 n0Var = j0Var.G;
        if (j0Var2 != null) {
            n0Var.f8794e = true;
        }
        n0Var.f8805p.f8924v = true;
        this.f8898b.i(j0Var, j0Var2 != null ? w.f8882a : w.f8884c);
    }
}
