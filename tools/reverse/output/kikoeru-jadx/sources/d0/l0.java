package d0;

import u.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.f f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5369b;

    public l0(v.f fVar, d dVar) {
        this.f5368a = fVar;
        this.f5369b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(u.y1 r7, float r8, yb.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof d0.k0
            if (r0 == 0) goto L13
            r0 = r9
            d0.k0 r0 = (d0.k0) r0
            int r1 = r0.f5366g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5366g = r1
            goto L1a
        L13:
            d0.k0 r0 = new d0.k0
            ac.c r9 = (ac.c) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f5364e
            int r1 = r0.f5366g
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            d0.l0 r7 = r0.f5363d
            ub.a.f(r9)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ub.a.f(r9)
            a0.f0 r9 = new a0.f0
            r9.<init>(r6, r7)
            r0.f5363d = r6
            r0.f5366g = r2
            v.f r1 = r6.f5368a
            java.lang.Object r9 = r1.d(r7, r8, r9, r0)
            zb.a r7 = zb.a.f26667a
            if (r9 != r7) goto L48
            return r7
        L48:
            r7 = r6
        L49:
            java.lang.Number r9 = (java.lang.Number) r9
            float r8 = r9.floatValue()
            d0.d r7 = r7.f5369b
            d0.y r9 = r7.f5311d
            d0.y r0 = r7.f5311d
            java.lang.Object r0 = r0.f5433d
            x0.a1 r0 = (x0.a1) r0
            float r0 = r0.e()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L63
            goto L9f
        L63:
            java.lang.Object r0 = r9.f5433d
            x0.a1 r0 = (x0.a1) r0
            float r0 = r0.e()
            float r0 = java.lang.Math.abs(r0)
            double r2 = (double) r0
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L9f
            int r9 = r7.j()
            u.k r0 = r7.f5318k
            boolean r0 = r0.a()
            if (r0 == 0) goto L9a
            x0.e1 r0 = r7.f5323p
            java.lang.Object r0 = r0.getValue()
            d0.w r0 = (d0.w) r0
            hf.y r0 = r0.f5428r
            d0.r r2 = new d0.r
            r3 = 2
            r4 = 0
            r2.<init>(r7, r4, r3)
            r3 = 3
            hf.a0.y(r0, r4, r4, r2, r3)
        L9a:
            r0 = 0
            r7.s(r1, r9, r0)
            goto La6
        L9f:
            java.lang.Object r7 = r9.f5433d
            x0.a1 r7 = (x0.a1) r7
            r7.e()
        La6:
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.l0.a(u.y1, float, yb.c):java.lang.Object");
    }
}
