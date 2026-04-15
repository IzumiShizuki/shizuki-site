package p2;

import m0.m;
import u2.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16519c;

    public f(int i10, m mVar) {
        this.f16517a = i10;
        this.f16519c = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16519c
            u2.k r0 = (u2.k) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f21253f
            int r3 = u3.x0.q(r3, r6, r7)
            android.text.Layout r4 = r0.f21253f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = 0
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f16517a
            if (r1 != r4) goto L35
            float r6 = r5.f16518b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f16517a = r4
            r5.f16518b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.f.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p2.e
            if (r0 == 0) goto L13
            r0 = r6
            p2.e r0 = (p2.e) r0
            int r1 = r0.f16516f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16516f = r1
            goto L18
        L13:
            p2.e r0 = new p2.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16514d
            int r1 = r0.f16516f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r6)
            goto L44
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r6)
            java.lang.Object r6 = r4.f16519c
            m0.m r6 = (m0.m) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.f16516f = r2
            java.lang.Object r6 = r6.q(r1, r0)
            zb.a r5 = zb.a.f26667a
            if (r6 != r5) goto L44
            return r5
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f16518b
            float r6 = r6 + r5
            r4.f16518b = r6
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.f.b(float, ac.c):java.lang.Object");
    }

    public f(k kVar) {
        this.f16519c = kVar;
        this.f16517a = -1;
    }
}
