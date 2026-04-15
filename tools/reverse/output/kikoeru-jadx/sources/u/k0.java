package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends i2.n implements i2.u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e1 f20975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jc.m f20976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w.k f20978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public kf.f f20979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w.b f20980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c2.j0 f20982x;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(ic.k kVar, boolean z10, w.k kVar2, e1 e1Var) {
        this.f20975q = e1Var;
        this.f20976r = (jc.m) kVar;
        this.f20977s = z10;
        this.f20978t = kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E0(u.k0 r4, ac.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof u.g0
            if (r0 == 0) goto L13
            r0 = r5
            u.g0 r0 = (u.g0) r0
            int r1 = r0.f20913g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20913g = r1
            goto L18
        L13:
            u.g0 r0 = new u.g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20911e
            int r1 = r0.f20913g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            u.k0 r4 = r0.f20910d
            ub.a.f(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ub.a.f(r5)
            w.b r5 = r4.f20980v
            if (r5 == 0) goto L4f
            w.k r1 = r4.f20978t
            if (r1 == 0) goto L4c
            w.a r3 = new w.a
            r3.<init>(r5)
            r0.f20910d = r4
            r0.f20913g = r2
            java.lang.Object r5 = r1.a(r3, r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r4.f20980v = r5
        L4f:
            r0 = 0
            r4.K0(r0)
            ub.a0 r4 = ub.a0.f21526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k0.E0(u.k0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(u.k0 r6, u.n r7, ac.c r8) {
        /*
            boolean r0 = r8 instanceof u.h0
            if (r0 == 0) goto L13
            r0 = r8
            u.h0 r0 = (u.h0) r0
            int r1 = r0.f20933i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20933i = r1
            goto L18
        L13:
            u.h0 r0 = new u.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f20931g
            int r1 = r0.f20933i
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            w.b r6 = r0.f20930f
            u.n r7 = r0.f20929e
            u.k0 r0 = r0.f20928d
            ub.a.f(r8)
            goto L77
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            u.n r7 = r0.f20929e
            u.k0 r6 = r0.f20928d
            ub.a.f(r8)
            goto L5d
        L40:
            ub.a.f(r8)
            w.b r8 = r6.f20980v
            if (r8 == 0) goto L5d
            w.k r1 = r6.f20978t
            if (r1 == 0) goto L5d
            w.a r5 = new w.a
            r5.<init>(r8)
            r0.f20928d = r6
            r0.f20929e = r7
            r0.f20933i = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L5d
            goto L74
        L5d:
            w.b r8 = new w.b
            r8.<init>()
            w.k r1 = r6.f20978t
            if (r1 == 0) goto L79
            r0.f20928d = r6
            r0.f20929e = r7
            r0.f20930f = r8
            r0.f20933i = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L75
        L74:
            return r4
        L75:
            r0 = r6
            r6 = r8
        L77:
            r8 = r6
            r6 = r0
        L79:
            r6.f20980v = r8
            long r7 = r7.f21012a
            r6.J0(r7)
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k0.F0(u.k0, u.n, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(u.k0 r4, u.o r5, ac.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof u.i0
            if (r0 == 0) goto L13
            r0 = r6
            u.i0 r0 = (u.i0) r0
            int r1 = r0.f20946h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20946h = r1
            goto L18
        L13:
            u.i0 r0 = new u.i0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20944f
            int r1 = r0.f20946h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            u.o r5 = r0.f20943e
            u.k0 r4 = r0.f20942d
            ub.a.f(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ub.a.f(r6)
            w.b r6 = r4.f20980v
            if (r6 == 0) goto L53
            w.k r1 = r4.f20978t
            if (r1 == 0) goto L50
            w.c r3 = new w.c
            r3.<init>(r6)
            r0.f20942d = r4
            r0.f20943e = r5
            r0.f20946h = r2
            java.lang.Object r6 = r1.a(r3, r0)
            zb.a r0 = zb.a.f26667a
            if (r6 != r0) goto L50
            return r0
        L50:
            r6 = 0
            r4.f20980v = r6
        L53:
            long r5 = r5.f21016a
            r4.K0(r5)
            ub.a0 r4 = ub.a0.f21526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k0.G0(u.k0, u.o, ac.c):java.lang.Object");
    }

    public final void H0() {
        w.b bVar = this.f20980v;
        if (bVar != null) {
            w.k kVar = this.f20978t;
            if (kVar != null) {
                kVar.b(new w.a(bVar));
            }
            this.f20980v = null;
        }
    }

    public abstract Object I0(j0 j0Var, j0 j0Var2);

    public abstract void J0(long j10);

    public abstract void K0(long j10);

    public abstract boolean L0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(ic.k kVar, boolean z10, w.k kVar2, e1 e1Var, boolean z11) {
        c2.j0 j0Var;
        this.f20976r = (jc.m) kVar;
        boolean z12 = true;
        if (this.f20977s != z10) {
            this.f20977s = z10;
            if (!z10) {
                H0();
                c2.j0 j0Var2 = this.f20982x;
                if (j0Var2 != null) {
                    C0(j0Var2);
                }
                this.f20982x = null;
            }
            z11 = true;
        }
        if (!jc.l.a(this.f20978t, kVar2)) {
            H0();
            this.f20978t = kVar2;
        }
        if (this.f20975q != e1Var) {
            this.f20975q = e1Var;
        } else {
            z12 = z11;
        }
        if (!z12 || (j0Var = this.f20982x) == null) {
            return;
        }
        j0Var.D0();
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    @Override // i2.u1
    public void j(c2.l lVar, c2.m mVar, long j10) {
        if (this.f20977s && this.f20982x == null) {
            d0.h hVar = new d0.h(5, this);
            c2.l lVar2 = c2.e0.f3261a;
            c2.j0 j0Var = new c2.j0(null, null, null, hVar);
            B0(j0Var);
            this.f20982x = j0Var;
        }
        c2.j0 j0Var2 = this.f20982x;
        if (j0Var2 != null) {
            j0Var2.j(lVar, mVar, j10);
        }
    }

    @Override // i2.u1
    public final long l() {
        return i2.b2.f8652a;
    }

    @Override // j1.p
    public void s0() {
        z();
    }

    @Override // j1.p
    public final void t0() {
        this.f20981w = false;
        H0();
    }

    @Override // i2.u1
    public final void z() {
        c2.j0 j0Var = this.f20982x;
        if (j0Var != null) {
            j0Var.z();
        }
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }
}
