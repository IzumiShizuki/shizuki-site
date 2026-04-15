package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.o2 f9837a = new x0.o2(g2.f9816c);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(j0.m r4, e.j r5, ac.c r6) {
        /*
            boolean r0 = r6 instanceof j2.h2
            if (r0 == 0) goto L13
            r0 = r6
            j2.h2 r0 = (j2.h2) r0
            int r1 = r0.f9822e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9822e = r1
            goto L18
        L13:
            j2.h2 r0 = new j2.h2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9821d
            int r1 = r0.f9822e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            ub.a.f(r6)
            ce.j0 r4 = new ce.j0
            r4.<init>()
            throw r4
        L32:
            ub.a.f(r6)
            r6 = r4
            j1.p r6 = (j1.p) r6
            j1.p r6 = r6.f9690a
            boolean r6 = r6.f9703n
            if (r6 == 0) goto L61
            i2.p1 r6 = i2.f.z(r4)
            i2.j0 r4 = i2.f.y(r4)
            x0.x r4 = r4.B
            f1.k r4 = (f1.k) r4
            r4.getClass()
            x0.o2 r1 = j2.j2.f9837a
            java.lang.Object r4 = x0.v.w(r4, r1)
            if (r4 != 0) goto L5b
            r0.f9822e = r2
            b(r6, r5, r0)
            return
        L5b:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.j2.a(j0.m, e.j, ac.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(i2.p1 r4, ic.n r5, ac.c r6) {
        /*
            boolean r0 = r6 instanceof j2.i2
            if (r0 == 0) goto L13
            r0 = r6
            j2.i2 r0 = (j2.i2) r0
            int r1 = r0.f9832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9832e = r1
            goto L18
        L13:
            j2.i2 r0 = new j2.i2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9831d
            int r1 = r0.f9832e
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L35
            r4 = 2
            if (r1 == r4) goto L2c
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2c:
            ub.a.f(r6)
            ce.j0 r4 = new ce.j0
            r4.<init>()
            throw r4
        L35:
            ub.a.f(r6)
            ce.j0 r4 = new ce.j0
            r4.<init>()
            throw r4
        L3e:
            ub.a.f(r6)
            r0.f9832e = r2
            j2.v r4 = (j2.v) r4
            r4.O(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.j2.b(i2.p1, ic.n, ac.c):void");
    }
}
