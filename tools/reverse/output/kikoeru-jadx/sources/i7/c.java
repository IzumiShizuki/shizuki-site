package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9052a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.g f9053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.w f9054c;

    public c(jc.w wVar, lf.g gVar) {
        this.f9054c = wVar;
        this.f9053b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(vb.u r5, yb.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i7.b
            if (r0 == 0) goto L13
            r0 = r6
            i7.b r0 = (i7.b) r0
            int r1 = r0.f9047h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9047h = r1
            goto L18
        L13:
            i7.b r0 = new i7.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9045f
            int r1 = r0.f9047h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            vb.u r5 = r0.f9044e
            i7.c r0 = r0.f9043d
            ub.a.f(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ub.a.f(r6)
            jc.l.b(r5)
            int r6 = r5.f22822a
            jc.w r1 = r4.f9054c
            int r1 = r1.f10836a
            if (r6 <= r1) goto L59
            java.lang.Object r6 = r5.f22823b
            r0.f9043d = r4
            r0.f9044e = r5
            r0.f9047h = r2
            lf.g r1 = r4.f9053b
            java.lang.Object r6 = r1.n(r6, r0)
            zb.a r0 = zb.a.f26667a
            if (r6 != r0) goto L52
            return r0
        L52:
            r0 = r4
        L53:
            jc.w r6 = r0.f9054c
            int r5 = r5.f22822a
            r6.f10836a = r5
        L59:
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.a(vb.u, yb.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // lf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6, yb.c r7) {
        /*
            r5 = this;
            int r0 = r5.f9052a
            switch(r0) {
                case 0: goto L5c;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof lf.g0
            if (r0 == 0) goto L18
            r0 = r7
            lf.g0 r0 = (lf.g0) r0
            int r1 = r0.f12406f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f12406f = r1
            goto L1d
        L18:
            lf.g0 r0 = new lf.g0
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f12404d
            int r1 = r0.f12406f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            ub.a.f(r7)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ub.a.f(r7)
            vb.u r7 = new vb.u
            jc.w r1 = r5.f9054c
            int r3 = r1.f10836a
            int r4 = r3 + 1
            r1.f10836a = r4
            if (r3 < 0) goto L54
            r7.<init>(r3, r6)
            r0.f12406f = r2
            lf.g r6 = r5.f9053b
            java.lang.Object r6 = r6.n(r7, r0)
            zb.a r7 = zb.a.f26667a
            if (r6 != r7) goto L51
            goto L53
        L51:
            ub.a0 r7 = ub.a0.f21526a
        L53:
            return r7
        L54:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "Index overflow has happened"
            r6.<init>(r7)
            throw r6
        L5c:
            vb.u r6 = (vb.u) r6
            java.lang.Object r6 = r5.a(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.n(java.lang.Object, yb.c):java.lang.Object");
    }

    public c(lf.g gVar, jc.w wVar) {
        this.f9053b = gVar;
        this.f9054c = wVar;
    }
}
