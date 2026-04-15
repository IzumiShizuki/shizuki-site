package t0;

import f3.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.h f20118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.e f20119b;

    public h(de.h hVar, f1.e eVar) {
        this.f20118a = hVar;
        this.f20119b = eVar;
    }

    @Override // b2.a
    public final Object D(long j10, long j11, yb.c cVar) {
        return new q(0L);
    }

    @Override // b2.a
    public final long F(int i10, long j10) {
        if (i10 != 1) {
            return 0L;
        }
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i11) >= 0.0f) {
            return 0L;
        }
        float fFloatValue = ((Number) this.f20118a.a(Float.valueOf(Float.intBitsToFloat(i11)))).floatValue();
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r5, yb.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t0.g
            if (r0 == 0) goto L13
            r0 = r7
            t0.g r0 = (t0.g) r0
            int r1 = r0.f20117f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20117f = r1
            goto L1a
        L13:
            t0.g r0 = new t0.g
            ac.c r7 = (ac.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.f20115d
            int r1 = r0.f20117f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ub.a.f(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ub.a.f(r7)
            float r5 = f3.q.c(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.f20117f = r2
            f1.e r5 = r4.f20119b
            java.lang.Object r7 = r5.q(r6, r0)
            zb.a r5 = zb.a.f26667a
            if (r7 != r5) goto L48
            return r5
        L48:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = pc.f0.c(r6, r5)
            f3.q r7 = new f3.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h.V(long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final long X(int i10, long j10, long j11) {
        if (i10 != 1) {
            return 0L;
        }
        int i11 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) <= 0.0f) {
            return 0L;
        }
        return (4294967295L & ((long) Float.floatToRawIntBits(((Number) this.f20118a.a(Float.valueOf(Float.intBitsToFloat(i11)))).floatValue()))) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
