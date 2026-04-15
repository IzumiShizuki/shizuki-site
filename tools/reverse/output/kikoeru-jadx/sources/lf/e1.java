package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.x f12395b;

    public e1(g gVar, b0.x xVar) {
        this.f12394a = gVar;
        this.f12395b = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ac.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof lf.d1
            if (r0 == 0) goto L13
            r0 = r8
            lf.d1 r0 = (lf.d1) r0
            int r1 = r0.f12388h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12388h = r1
            goto L18
        L13:
            lf.d1 r0 = new lf.d1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12386f
            int r1 = r0.f12388h
            ub.a0 r2 = ub.a0.f21526a
            r3 = 2
            r4 = 1
            zb.a r5 = zb.a.f26667a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            ub.a.f(r8)
            return r2
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            mf.p r1 = r0.f12385e
            lf.e1 r4 = r0.f12384d
            ub.a.f(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5d
        L3c:
            r8 = move-exception
            goto L77
        L3e:
            ub.a.f(r8)
            mf.p r1 = new mf.p
            yb.h r8 = r0.f302b
            jc.l.b(r8)
            lf.g r6 = r7.f12394a
            r1.<init>(r6, r8)
            b0.x r8 = r7.f12395b     // Catch: java.lang.Throwable -> L3c
            r0.f12384d = r7     // Catch: java.lang.Throwable -> L3c
            r0.f12385e = r1     // Catch: java.lang.Throwable -> L3c
            r0.f12388h = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.q(r1, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r5) goto L5c
            goto L75
        L5c:
            r4 = r7
        L5d:
            r1.w()
            lf.g r8 = r4.f12394a
            boolean r1 = r8 instanceof lf.e1
            if (r1 == 0) goto L76
            lf.e1 r8 = (lf.e1) r8
            r1 = 0
            r0.f12384d = r1
            r0.f12385e = r1
            r0.f12388h = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L76
        L75:
            return r5
        L76:
            return r2
        L77:
            r1.w()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e1.a(ac.c):java.lang.Object");
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        return this.f12394a.n(obj, cVar);
    }
}
