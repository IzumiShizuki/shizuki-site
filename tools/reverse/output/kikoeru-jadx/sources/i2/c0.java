package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends g1 {
    public static final p4.p V;
    public z R;
    public f3.a S;
    public a0 T;
    public g2.i U;

    static {
        p4.p pVarH = q1.h0.h();
        pVarH.i(q1.q.f17573f);
        pVarH.o(1.0f);
        pVarH.p(1);
        V = pVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(j0 j0Var, z zVar) {
        super(j0Var);
        this.R = zVar;
        this.T = j0Var.f8749h != null ? new a0(this) : null;
        this.U = (((j1.p) zVar).f9690a.f9692c & 512) != 0 ? new g2.i(this, (q.e1) zVar) : null;
    }

    @Override // i2.g1
    public final void H0() {
        if (this.T == null) {
            this.T = new a0(this);
        }
    }

    @Override // i2.g1
    public final r0 K0() {
        return this.T;
    }

    @Override // g2.u0
    public final int L(int i10) {
        g2.i iVar = this.U;
        if (iVar == null) {
            z zVar = this.R;
            g1 g1Var = this.f8703r;
            jc.l.b(g1Var);
            return zVar.b(this, g1Var, i10);
        }
        q.e1 e1Var = iVar.f7198b;
        g1 g1Var2 = this.f8703r;
        jc.l.b(g1Var2);
        g1 g1Var3 = e1Var.f9690a.f9697h;
        jc.l.b(g1Var3);
        r0 r0VarK0 = g1Var3.K0();
        jc.l.b(r0VarK0);
        if (!r0VarK0.s0()) {
            return g1Var2.L(i10);
        }
        return e1Var.C0(new g2.f(iVar, iVar.getLayoutDirection()), new g2.q(g1Var2, i1.f8729a, j1.f8769b, 2), f3.b.b(i10, 0, 13)).b();
    }

    @Override // i2.g1
    public final j1.p M0() {
        return ((j1.p) this.R).f9690a;
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
        o1();
    }

    @Override // g2.u0
    public final int b(int i10) {
        g2.i iVar = this.U;
        if (iVar == null) {
            z zVar = this.R;
            g1 g1Var = this.f8703r;
            jc.l.b(g1Var);
            return zVar.c(this, g1Var, i10);
        }
        q.e1 e1Var = iVar.f7198b;
        g1 g1Var2 = this.f8703r;
        jc.l.b(g1Var2);
        g1 g1Var3 = e1Var.f9690a.f9697h;
        jc.l.b(g1Var3);
        r0 r0VarK0 = g1Var3.K0();
        jc.l.b(r0VarK0);
        if (!r0VarK0.s0()) {
            return g1Var2.b(i10);
        }
        return e1Var.C0(new g2.f(iVar, iVar.getLayoutDirection()), new g2.q(g1Var2, i1.f8730b, j1.f8769b, 2), f3.b.b(i10, 0, 13)).b();
    }

    @Override // i2.g1
    public final void b1(q1.o oVar, t1.b bVar) {
        g1 g1Var;
        g1 g1Var2 = this.f8703r;
        jc.l.b(g1Var2);
        g1Var2.F0(oVar, bVar);
        if (!((j2.v) m0.a(this.f8700o)).getShowLayoutBounds() || (g1Var = this.f8703r) == null) {
            return;
        }
        if (f3.l.b(this.f7182c, g1Var.f7182c) && f3.j.b(g1Var.B, 0L)) {
            return;
        }
        long j10 = this.f7182c;
        oVar.j(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, V);
    }

    @Override // i2.g1, g2.g1
    public final void d0(long j10, float f10, t1.b bVar) {
        if (this.f8701p) {
            r0 r0VarK0 = K0();
            jc.l.b(r0VarK0);
            c1(r0VarK0.f8832p, f10, null, bVar);
        } else {
            c1(j10, f10, null, bVar);
        }
        o1();
    }

    @Override // g2.u0
    public final int m(int i10) {
        g2.i iVar = this.U;
        if (iVar == null) {
            z zVar = this.R;
            g1 g1Var = this.f8703r;
            jc.l.b(g1Var);
            return zVar.f(this, g1Var, i10);
        }
        q.e1 e1Var = iVar.f7198b;
        g1 g1Var2 = this.f8703r;
        jc.l.b(g1Var2);
        g1 g1Var3 = e1Var.f9690a.f9697h;
        jc.l.b(g1Var3);
        r0 r0VarK0 = g1Var3.K0();
        jc.l.b(r0VarK0);
        if (!r0VarK0.s0()) {
            return g1Var2.m(i10);
        }
        return e1Var.C0(new g2.f(iVar, iVar.getLayoutDirection()), new g2.q(g1Var2, i1.f8729a, j1.f8768a, 2), f3.b.b(0, i10, 7)).h();
    }

    @Override // i2.q0
    public final int n0(g2.t tVar) {
        a0 a0Var = this.T;
        if (a0Var == null) {
            return f.c(this, tVar);
        }
        o.f0 f0Var = a0Var.f8836t;
        int iD = f0Var.d(tVar);
        if (iD >= 0) {
            return f0Var.f15955c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o1() {
        /*
            r7 = this;
            boolean r0 = r7.f8823j
            if (r0 == 0) goto L5
            return
        L5:
            r7.Y0()
            g2.i r0 = r7.U
            r1 = 0
            if (r0 == 0) goto L5a
            i2.a0 r2 = r7.T
            jc.l.b(r2)
            boolean r0 = r0.f7199c
            if (r0 != 0) goto L52
            long r2 = r7.f7182c
            i2.a0 r0 = r7.T
            r4 = 0
            if (r0 == 0) goto L27
            long r5 = r0.C0()
            f3.l r0 = new f3.l
            r0.<init>(r5)
            goto L28
        L27:
            r0 = r4
        L28:
            boolean r0 = f3.l.a(r2, r0)
            if (r0 == 0) goto L52
            i2.g1 r0 = r7.f8703r
            jc.l.b(r0)
            long r2 = r0.f7182c
            i2.g1 r0 = r7.f8703r
            jc.l.b(r0)
            i2.r0 r0 = r0.K0()
            if (r0 == 0) goto L4a
            long r4 = r0.C0()
            f3.l r0 = new f3.l
            r0.<init>(r4)
            r4 = r0
        L4a:
            boolean r0 = f3.l.a(r2, r4)
            if (r0 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            i2.g1 r2 = r7.f8703r
            jc.l.b(r2)
            r2.f8701p = r0
        L5a:
            g2.w0 r0 = r7.u0()
            r0.j()
            i2.g1 r0 = r7.f8703r
            jc.l.b(r0)
            r0.f8701p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c0.o1():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p1(z zVar) {
        if (!zVar.equals(this.R)) {
            if ((((j1.p) zVar).f9690a.f9692c & 512) != 0) {
                q.e1 e1Var = (q.e1) zVar;
                g2.i iVar = this.U;
                if (iVar != null) {
                    iVar.f7198b = e1Var;
                } else {
                    iVar = new g2.i(this, e1Var);
                }
                this.U = iVar;
            } else {
                this.U = null;
            }
        }
        this.R = zVar;
    }

    @Override // g2.u0
    public final int t(int i10) {
        g2.i iVar = this.U;
        if (iVar == null) {
            z zVar = this.R;
            g1 g1Var = this.f8703r;
            jc.l.b(g1Var);
            return zVar.d(this, g1Var, i10);
        }
        q.e1 e1Var = iVar.f7198b;
        g1 g1Var2 = this.f8703r;
        jc.l.b(g1Var2);
        g1 g1Var3 = e1Var.f9690a.f9697h;
        jc.l.b(g1Var3);
        r0 r0VarK0 = g1Var3.K0();
        jc.l.b(r0VarK0);
        if (!r0VarK0.s0()) {
            return g1Var2.t(i10);
        }
        return e1Var.C0(new g2.f(iVar, iVar.getLayoutDirection()), new g2.q(g1Var2, i1.f8730b, j1.f8768a, 2), f3.b.b(0, i10, 7)).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // g2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.g1 v(long r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c0.v(long):g2.g1");
    }
}
