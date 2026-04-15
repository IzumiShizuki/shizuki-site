package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.c f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rf.c f20950d = new rf.c();

    public i1(f3.c cVar) {
        this.f20947a = cVar;
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f20947a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f20947a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return this.f20947a.J(f10);
    }

    @Override // f3.c
    public final float M() {
        return this.f20947a.M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f20947a.Q(f10);
    }

    @Override // f3.c
    public final float a() {
        return this.f20947a.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        return this.f20947a.a0(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.f1
            if (r0 == 0) goto L13
            r0 = r5
            u.f1 r0 = (u.f1) r0
            int r1 = r0.f20895f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20895f = r1
            goto L18
        L13:
            u.f1 r0 = new u.f1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20893d
            int r1 = r0.f20895f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r5)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            ub.a.f(r5)
            r0.f20895f = r2
            java.lang.Object r5 = r4.g(r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L46
            ub.a0 r5 = ub.a0.f21526a
            return r5
        L46:
            u.t0 r5 = new u.t0
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.i1.b(ac.c):java.lang.Object");
    }

    public final void c() {
        this.f20949c = true;
        rf.c cVar = this.f20950d;
        if (cVar.e()) {
            cVar.b(null);
        }
    }

    public final void d() {
        this.f20948b = true;
        rf.c cVar = this.f20950d;
        if (cVar.e()) {
            cVar.b(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.g1
            if (r0 == 0) goto L13
            r0 = r5
            u.g1 r0 = (u.g1) r0
            int r1 = r0.f20917g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20917g = r1
            goto L18
        L13:
            u.g1 r0 = new u.g1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20915e
            int r1 = r0.f20917g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            u.i1 r0 = r0.f20914d
            ub.a.f(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ub.a.f(r5)
            r0.f20914d = r4
            r0.f20917g = r2
            rf.c r5 = r4.f20950d
            java.lang.Object r5 = r5.g(r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L41
            return r0
        L41:
            r0 = r4
        L42:
            r5 = 0
            r0.f20948b = r5
            r0.f20949c = r5
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.i1.f(ac.c):java.lang.Object");
    }

    @Override // f3.c
    public final long f0(long j10) {
        return this.f20947a.f0(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.h1
            if (r0 == 0) goto L13
            r0 = r5
            u.h1 r0 = (u.h1) r0
            int r1 = r0.f20937g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20937g = r1
            goto L18
        L13:
            u.h1 r0 = new u.h1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f20935e
            int r1 = r0.f20937g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            u.i1 r0 = r0.f20934d
            ub.a.f(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ub.a.f(r5)
            boolean r5 = r4.f20948b
            if (r5 != 0) goto L51
            boolean r5 = r4.f20949c
            if (r5 != 0) goto L51
            r0.f20934d = r4
            r0.f20937g = r2
            rf.c r5 = r4.f20950d
            java.lang.Object r5 = r5.g(r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L49
            return r0
        L49:
            r0 = r4
        L4a:
            rf.c r5 = r0.f20950d
            r1 = 0
            r5.b(r1)
            goto L52
        L51:
            r0 = r4
        L52:
            boolean r5 = r0.f20948b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.i1.g(ac.c):java.lang.Object");
    }

    @Override // f3.c
    public final float i0(long j10) {
        return this.f20947a.i0(j10);
    }

    @Override // f3.c
    public final long n(long j10) {
        return this.f20947a.n(j10);
    }

    @Override // f3.c
    public final float r(long j10) {
        return this.f20947a.r(j10);
    }
}
