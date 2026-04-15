package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f21065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21066b;

    public r1(c2 c2Var, boolean z10) {
        this.f21065a = c2Var;
        this.f21066b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r4, long r6, yb.c r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof u.q1
            if (r4 == 0) goto L13
            r4 = r8
            u.q1 r4 = (u.q1) r4
            int r5 = r4.f21050g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f21050g = r5
            goto L1a
        L13:
            u.q1 r4 = new u.q1
            ac.c r8 = (ac.c) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f21048e
            int r8 = r4.f21050g
            r0 = 1
            if (r8 == 0) goto L3e
            if (r8 == r0) goto L38
            r6 = 2
            if (r8 != r6) goto L30
            long r6 = r4.f21047d
            ub.a.f(r5)
            f3.q r5 = (f3.q) r5
            long r4 = r5.f6675a
            goto L60
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            long r6 = r4.f21047d
            ub.a.f(r5)
            goto L5c
        L3e:
            ub.a.f(r5)
            boolean r5 = r3.f21066b
            r1 = 0
            if (r5 == 0) goto L64
            u.c2 r5 = r3.f21065a
            boolean r8 = r5.f20851h
            if (r8 == 0) goto L4f
            r4 = r1
            goto L60
        L4f:
            r4.f21047d = r6
            r4.f21050g = r0
            java.lang.Object r5 = r5.b(r6, r4)
            zb.a r4 = zb.a.f26667a
            if (r5 != r4) goto L5c
            return r4
        L5c:
            f3.q r5 = (f3.q) r5
            long r4 = r5.f6675a
        L60:
            long r1 = f3.q.d(r6, r4)
        L64:
            f3.q r4 = new f3.q
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.r1.D(long, long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final /* synthetic */ long F(int i10, long j10) {
        return 0L;
    }

    @Override // b2.a
    public final Object V(long j10, yb.c cVar) {
        return new f3.q(0L);
    }

    @Override // b2.a
    public final long X(int i10, long j10, long j11) {
        if (!this.f21066b) {
            return 0L;
        }
        c2 c2Var = this.f21065a;
        if (c2Var.f20844a.a()) {
            return 0L;
        }
        return c2Var.h(c2Var.d(c2Var.f20844a.e(c2Var.d(c2Var.g(j11)))));
    }
}
