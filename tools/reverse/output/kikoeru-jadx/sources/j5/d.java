package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f10239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c[] f10240c = new c[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f10244g;

    public d(b0 b0Var, boolean z10, long j10, long j11) {
        this.f10238a = b0Var;
        this.f10241d = z10 ? j10 : -9223372036854775807L;
        this.f10242e = j10;
        this.f10243f = j11;
    }

    @Override // j5.a0
    public final void a(b0 b0Var) {
        if (this.f10244g != null) {
            return;
        }
        a0 a0Var = this.f10239b;
        a0Var.getClass();
        a0Var.a(this);
    }

    public final boolean b() {
        return this.f10241d != -9223372036854775807L;
    }

    @Override // j5.d1
    public final void c(e1 e1Var) {
        a0 a0Var = this.f10239b;
        a0Var.getClass();
        a0Var.c(this);
    }

    @Override // j5.e1
    public final long d() {
        long jD = this.f10238a.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f10243f;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        return this.f10238a.e(f0Var);
    }

    @Override // j5.b0
    public final void f() throws f {
        f fVar = this.f10244g;
        if (fVar != null) {
            throw fVar;
        }
        this.f10238a.f();
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f10239b = a0Var;
        this.f10238a.g(this, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f10241d = r0
            j5.c[] r0 = r6.f10240c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f10236b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            j5.b0 r0 = r6.f10238a
            long r0 = r0.h(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f10242e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f10243f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            p4.c.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.h(long):long");
    }

    @Override // j5.b0
    public final void i(long j10) {
        this.f10238a.i(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    @Override // j5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(m5.r[] r10, boolean[] r11, j5.c1[] r12, boolean[] r13, long r14) {
        /*
            r9 = this;
            int r0 = r12.length
            j5.c[] r0 = new j5.c[r0]
            r9.f10240c = r0
            int r0 = r12.length
            j5.c1[] r4 = new j5.c1[r0]
            r0 = 0
            r1 = 0
        La:
            int r2 = r12.length
            r8 = 0
            if (r1 >= r2) goto L1f
            j5.c[] r2 = r9.f10240c
            r3 = r12[r1]
            j5.c r3 = (j5.c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1a
            j5.c1 r8 = r3.f10235a
        L1a:
            r4[r1] = r8
            int r1 = r1 + 1
            goto La
        L1f:
            j5.b0 r1 = r9.f10238a
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            long r10 = r1.l(r2, r3, r4, r5, r6)
            boolean r13 = r9.b()
            if (r13 == 0) goto L50
            r13 = 0
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 == 0) goto L50
            int r13 = r2.length
            r14 = 0
        L37:
            if (r14 >= r13) goto L50
            r15 = r2[r14]
            if (r15 == 0) goto L4d
            m4.q r15 = r15.m()
            java.lang.String r1 = r15.f14544n
            java.lang.String r15 = r15.f14541k
            boolean r15 = m4.o0.a(r1, r15)
            if (r15 != 0) goto L4d
            r13 = r10
            goto L55
        L4d:
            int r14 = r14 + 1
            goto L37
        L50:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L55:
            r9.f10241d = r13
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L70
            long r13 = r9.f10242e
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L6e
            long r13 = r9.f10243f
            r1 = -9223372036854775808
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 == 0) goto L70
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 > 0) goto L6e
            goto L70
        L6e:
            r13 = 0
            goto L71
        L70:
            r13 = 1
        L71:
            p4.c.i(r13)
        L74:
            int r13 = r12.length
            if (r0 >= r13) goto L9a
            r13 = r4[r0]
            if (r13 != 0) goto L80
            j5.c[] r13 = r9.f10240c
            r13[r0] = r8
            goto L91
        L80:
            j5.c[] r14 = r9.f10240c
            r15 = r14[r0]
            if (r15 == 0) goto L8a
            j5.c1 r15 = r15.f10235a
            if (r15 == r13) goto L91
        L8a:
            j5.c r15 = new j5.c
            r15.<init>(r9, r13)
            r14[r0] = r15
        L91:
            j5.c[] r13 = r9.f10240c
            r13 = r13[r0]
            r12[r0] = r13
            int r0 = r0 + 1
            goto L74
        L9a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.l(m5.r[], boolean[], j5.c1[], boolean[], long):long");
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f10238a.m();
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        long j11 = this.f10242e;
        if (j10 == j11) {
            return j11;
        }
        long j12 = p4.c0.j(b1Var.f22405a, 0L, j10 - j11);
        long j13 = b1Var.f22406b;
        long j14 = this.f10243f;
        long j15 = p4.c0.j(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j10);
        if (j12 != b1Var.f22405a || j15 != b1Var.f22406b) {
            b1Var = new v4.b1(j12, j15);
        }
        return this.f10238a.o(j10, b1Var);
    }

    @Override // j5.b0
    public final long p() {
        if (b()) {
            long j10 = this.f10241d;
            this.f10241d = -9223372036854775807L;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j10;
        }
        long jP2 = this.f10238a.p();
        if (jP2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        p4.c.i(jP2 >= this.f10242e);
        long j11 = this.f10243f;
        p4.c.i(j11 == Long.MIN_VALUE || jP2 <= j11);
        return jP2;
    }

    @Override // j5.b0
    public final o1 q() {
        return this.f10238a.q();
    }

    @Override // j5.e1
    public final long t() {
        long jT = this.f10238a.t();
        if (jT != Long.MIN_VALUE) {
            long j10 = this.f10243f;
            if (j10 == Long.MIN_VALUE || jT < j10) {
                return jT;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j5.e1
    public final void w(long j10) {
        this.f10238a.w(j10);
    }
}
