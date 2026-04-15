package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o4 implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f13388a;

    public o4(x xVar) {
        this.f13388a = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r3, long r5, yb.c r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof m0.m4
            if (r3 == 0) goto L13
            r3 = r7
            m0.m4 r3 = (m0.m4) r3
            int r4 = r3.f13282g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f13282g = r4
            goto L1a
        L13:
            m0.m4 r3 = new m0.m4
            ac.c r7 = (ac.c) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.f13280e
            int r7 = r3.f13282g
            r0 = 1
            if (r7 == 0) goto L31
            if (r7 != r0) goto L29
            long r5 = r3.f13279d
            ub.a.f(r4)
            goto L47
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            ub.a.f(r4)
            float r4 = f3.q.c(r5)
            r3.f13279d = r5
            r3.f13282g = r0
            m0.x r7 = r2.f13388a
            java.lang.Object r3 = r7.h(r4, r3)
            zb.a r4 = zb.a.f26667a
            if (r3 != r4) goto L47
            return r4
        L47:
            f3.q r3 = new f3.q
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.o4.D(long, long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final long F(int i10, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i10 != 1) {
            return 0L;
        }
        x xVar = this.f13388a;
        float fE = xVar.e(fIntBitsToFloat);
        x0.a1 a1Var = xVar.f13854j;
        float fE2 = Float.isNaN(a1Var.e()) ? 0.0f : a1Var.e();
        a1Var.f(fE);
        return a(fE - fE2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r6, yb.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m0.n4
            if (r0 == 0) goto L13
            r0 = r8
            m0.n4 r0 = (m0.n4) r0
            int r1 = r0.f13324g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13324g = r1
            goto L1a
        L13:
            m0.n4 r0 = new m0.n4
            ac.c r8 = (ac.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.f13322e
            int r1 = r0.f13324g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r6 = r0.f13321d
            ub.a.f(r8)
            goto L6f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ub.a.f(r8)
            float r8 = f3.q.c(r6)
            m0.x r1 = r5.f13388a
            float r3 = r1.f()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L6d
            m0.a4 r4 = r1.d()
            java.util.Map r4 = r4.f12652a
            java.util.Collection r4 = r4.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Float r4 = vb.m.m0(r4)
            if (r4 == 0) goto L5a
            float r4 = r4.floatValue()
            goto L5c
        L5a:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L5c:
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L6d
            r0.f13321d = r6
            r0.f13324g = r2
            java.lang.Object r8 = r1.h(r8, r0)
            zb.a r0 = zb.a.f26667a
            if (r8 != r0) goto L6f
            return r0
        L6d:
            r6 = 0
        L6f:
            f3.q r8 = new f3.q
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.o4.V(long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final long X(int i10, long j10, long j11) {
        if (i10 != 1) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j11));
        x xVar = this.f13388a;
        float fE = xVar.e(fIntBitsToFloat);
        x0.a1 a1Var = xVar.f13854j;
        float fE2 = Float.isNaN(a1Var.e()) ? 0.0f : a1Var.e();
        a1Var.f(fE);
        return a(fE - fE2);
    }

    public final long a(float f10) {
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }
}
