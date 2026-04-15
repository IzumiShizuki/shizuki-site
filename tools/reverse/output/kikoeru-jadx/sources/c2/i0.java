package c2;

import j2.z2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements f3.c, yb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f3282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf.k f3283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hf.k f3284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f3285d = m.f3315b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yb.i f3286e = yb.i.f26088a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f3287f;

    public i0(j0 j0Var, hf.k kVar) {
        this.f3287f = j0Var;
        this.f3282a = j0Var;
        this.f3283b = kVar;
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f3282a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f3282a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / this.f3282a.a();
    }

    @Override // f3.c
    public final float M() {
        return this.f3282a.M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f3282a.a() * f10;
    }

    @Override // f3.c
    public final float a() {
        return this.f3282a.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        j0 j0Var = this.f3282a;
        j0Var.getClass();
        return a0.c.q(f10, j0Var);
    }

    public final Object b(m mVar, ac.a aVar) {
        hf.k kVar = new hf.k(1, ud.s.p(aVar));
        kVar.r();
        this.f3285d = mVar;
        this.f3284c = kVar;
        return kVar.q();
    }

    public final long c() {
        j0 j0Var = this.f3287f;
        j0Var.getClass();
        long jV = a0.c.v(i2.f.y(j0Var).A.d(), j0Var);
        long j10 = j0Var.f3306y;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV >> 32)) - ((int) (j10 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jV & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final z2 d() {
        j0 j0Var = this.f3287f;
        j0Var.getClass();
        return i2.f.y(j0Var).A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r10, ic.n r12, ac.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof c2.f0
            if (r0 == 0) goto L13
            r0 = r13
            c2.f0 r0 = (c2.f0) r0
            int r1 = r0.f3265g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3265g = r1
            goto L18
        L13:
            c2.f0 r0 = new c2.f0
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f3263e
            int r1 = r0.f3265g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            hf.r1 r10 = r0.f3262d
            ub.a.f(r13)     // Catch: java.lang.Throwable -> L28
            r6 = r9
            goto L6e
        L28:
            r0 = move-exception
            r11 = r0
            r6 = r9
            goto L76
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            ub.a.f(r13)
            r3 = 0
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 > 0) goto L4d
            hf.k r13 = r9.f3284c
            if (r13 == 0) goto L4d
            c2.n r1 = new c2.n
            r1.<init>(r10)
            ub.m r1 = ub.a.b(r1)
            r13.h(r1)
        L4d:
            c2.j0 r13 = r9.f3287f
            hf.y r13 = r13.n0()
            c2.g0 r3 = new c2.g0
            r8 = 0
            r7 = 0
            r6 = r9
            r4 = r10
            r3.<init>(r4, r6, r7, r8)
            r10 = 3
            hf.r1 r10 = hf.a0.y(r13, r7, r7, r3, r10)
            r0.f3262d = r10     // Catch: java.lang.Throwable -> L74
            r0.f3265g = r2     // Catch: java.lang.Throwable -> L74
            java.lang.Object r13 = r12.q(r9, r0)     // Catch: java.lang.Throwable -> L74
            zb.a r11 = zb.a.f26667a
            if (r13 != r11) goto L6e
            return r11
        L6e:
            c2.b r11 = c2.b.f3245b
            r10.g(r11)
            return r13
        L74:
            r0 = move-exception
            r11 = r0
        L76:
            c2.b r12 = c2.b.f3245b
            r10.g(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.f(long, ic.n, ac.c):java.lang.Object");
    }

    @Override // f3.c
    public final long f0(long j10) {
        j0 j0Var = this.f3282a;
        j0Var.getClass();
        return a0.c.v(j10, j0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r5, u.f2 r7, ac.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof c2.h0
            if (r0 == 0) goto L13
            r0 = r8
            c2.h0 r0 = (c2.h0) r0
            int r1 = r0.f3275f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3275f = r1
            goto L18
        L13:
            c2.h0 r0 = new c2.h0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f3273d
            int r1 = r0.f3275f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r8)     // Catch: c2.n -> L3c
            return r8
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r8)
            r0.f3275f = r2     // Catch: c2.n -> L3c
            java.lang.Object r5 = r4.f(r5, r7, r0)     // Catch: c2.n -> L3c
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L3b
            return r6
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.i0.g(long, u.f2, ac.a):java.lang.Object");
    }

    @Override // yb.c
    public final void h(Object obj) {
        j0 j0Var = this.f3287f;
        synchronized (j0Var.f3303v) {
            j0Var.f3302u.j(this);
        }
        this.f3283b.h(obj);
    }

    @Override // f3.c
    public final float i0(long j10) {
        j0 j0Var = this.f3282a;
        j0Var.getClass();
        return a0.c.u(j10, j0Var);
    }

    @Override // f3.c
    public final long n(long j10) {
        j0 j0Var = this.f3282a;
        j0Var.getClass();
        return a0.c.t(j10, j0Var);
    }

    @Override // f3.c
    public final float r(long j10) {
        j0 j0Var = this.f3282a;
        j0Var.getClass();
        return a0.c.s(j10, j0Var);
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f3286e;
    }
}
