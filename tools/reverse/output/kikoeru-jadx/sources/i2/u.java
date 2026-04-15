package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends g1 {
    public static final p4.p T;
    public final a2 R;
    public t S;

    static {
        p4.p pVarH = q1.h0.h();
        pVarH.i(q1.q.f17572e);
        pVarH.o(1.0f);
        pVarH.p(1);
        T = pVarH;
    }

    public u(j0 j0Var) {
        super(j0Var);
        a2 a2Var = new a2();
        a2Var.f9693d = 0;
        this.R = a2Var;
        a2Var.f9697h = this;
        this.S = j0Var.f8749h != null ? new t(this) : null;
    }

    @Override // i2.g1
    public final void H0() {
        if (this.S == null) {
            this.S = new t(this);
        }
    }

    @Override // i2.g1
    public final r0 K0() {
        return this.S;
    }

    @Override // g2.u0
    public final int L(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.g(j0Var.F.f8665d, j0Var.m(), i10);
    }

    @Override // i2.g1
    public final j1.p M0() {
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // i2.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(i2.d r19, long r20, i2.s r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.u.S0(i2.d, long, i2.s, int, boolean):void");
    }

    @Override // g2.g1
    public final void Y(long j10, float f10, ic.k kVar) {
        if (this.f8701p) {
            r0 r0VarK0 = K0();
            jc.l.b(r0VarK0);
            c1(r0VarK0.f8832p, f10, kVar, null);
        } else {
            c1(j10, f10, kVar, null);
        }
        if (this.f8823j) {
            return;
        }
        this.f8700o.G.f8805p.r0();
    }

    @Override // g2.u0
    public final int b(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.i(j0Var.F.f8665d, j0Var.m(), i10);
    }

    @Override // i2.g1
    public final void b1(q1.o oVar, t1.b bVar) throws Throwable {
        j0 j0Var = this.f8700o;
        p1 p1VarA = m0.a(j0Var);
        z0.e eVarY = j0Var.y();
        Object[] objArr = eVarY.f26372a;
        int i10 = eVarY.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (j0Var2.J()) {
                j0Var2.i(oVar, bVar);
            }
        }
        if (((j2.v) p1VarA).getShowLayoutBounds()) {
            long j10 = this.f7182c;
            oVar.j(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, T);
        }
    }

    @Override // i2.g1, g2.g1
    public final void d0(long j10, float f10, t1.b bVar) {
        u uVar;
        if (this.f8701p) {
            r0 r0VarK0 = K0();
            jc.l.b(r0VarK0);
            uVar = this;
            uVar.c1(r0VarK0.f8832p, f10, null, bVar);
        } else {
            c1(j10, f10, null, bVar);
            uVar = this;
        }
        if (uVar.f8823j) {
            return;
        }
        uVar.f8700o.G.f8805p.r0();
    }

    @Override // g2.u0
    public final int m(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.f(j0Var.F.f8665d, j0Var.m(), i10);
    }

    @Override // i2.q0
    public final int n0(g2.t tVar) {
        t tVar2 = this.S;
        if (tVar2 != null) {
            return tVar2.n0(tVar);
        }
        z0 z0Var = this.f8700o.G.f8805p;
        k0 k0Var = z0Var.f8927y;
        if (!z0Var.f8915m) {
            if (z0Var.f8908f.f8793d == f0.f8689a) {
                k0Var.f8777f = true;
                if (k0Var.f8773b) {
                    z0Var.f8925w = true;
                    z0Var.f8926x = true;
                }
            } else {
                k0Var.f8778g = true;
            }
        }
        z0Var.d().f8824k = true;
        z0Var.D();
        z0Var.d().f8824k = false;
        Integer num = (Integer) k0Var.f8780i.get(tVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // g2.u0
    public final int t(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.c(j0Var.F.f8665d, j0Var.m(), i10);
    }

    @Override // g2.u0
    public final g2.g1 v(long j10) {
        if (this.f8702q) {
            t tVar = this.S;
            jc.l.b(tVar);
            j10 = tVar.f7183d;
        }
        k0(j10);
        j0 j0Var = this.f8700o;
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j0) objArr[i11]).G.f8805p.f8914l = h0.f8722c;
        }
        f1(j0Var.f8764w.h(this, j0Var.m(), j10));
        X0();
        return this;
    }
}
