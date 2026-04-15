package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.g f9329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ac.i f9330c;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(lf.g gVar, ic.n nVar, int i10) {
        this.f9328a = i10;
        switch (i10) {
            case 1:
                this.f9329b = gVar;
                this.f9330c = (ac.i) nVar;
                break;
            default:
                this.f9329b = gVar;
                this.f9330c = (ac.i) nVar;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ac.i, ic.n] */
    @Override // lf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7, yb.c r8) {
        /*
            r6 = this;
            int r0 = r6.f9328a
            switch(r0) {
                case 0: goto L63;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof i7.w1
            if (r0 == 0) goto L18
            r0 = r8
            i7.w1 r0 = (i7.w1) r0
            int r1 = r0.f9356e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f9356e = r1
            goto L1d
        L18:
            i7.w1 r0 = new i7.w1
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f9355d
            int r1 = r0.f9356e
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            ub.a.f(r8)
            goto L60
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            lf.g r7 = r0.f9357f
            ub.a.f(r8)
            goto L54
        L3d:
            ub.a.f(r8)
            i7.k0 r7 = (i7.k0) r7
            lf.g r8 = r6.f9329b
            r0.f9357f = r8
            r0.f9356e = r3
            ac.i r1 = r6.f9330c
            java.lang.Object r7 = r7.b(r1, r0)
            if (r7 != r4) goto L51
            goto L62
        L51:
            r5 = r8
            r8 = r7
            r7 = r5
        L54:
            r1 = 0
            r0.f9357f = r1
            r0.f9356e = r2
            java.lang.Object r7 = r7.n(r8, r0)
            if (r7 != r4) goto L60
            goto L62
        L60:
            ub.a0 r4 = ub.a0.f21526a
        L62:
            return r4
        L63:
            boolean r0 = r8 instanceof i7.t1
            if (r0 == 0) goto L76
            r0 = r8
            i7.t1 r0 = (i7.t1) r0
            int r1 = r0.f9322e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L76
            int r1 = r1 - r2
            r0.f9322e = r1
            goto L7b
        L76:
            i7.t1 r0 = new i7.t1
            r0.<init>(r6, r8)
        L7b:
            java.lang.Object r8 = r0.f9321d
            int r1 = r0.f9322e
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L9b
            if (r1 == r3) goto L95
            if (r1 != r2) goto L8d
            ub.a.f(r8)
            goto Lbe
        L8d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L95:
            lf.g r7 = r0.f9323f
            ub.a.f(r8)
            goto Lb2
        L9b:
            ub.a.f(r8)
            i7.k0 r7 = (i7.k0) r7
            lf.g r8 = r6.f9329b
            r0.f9323f = r8
            r0.f9322e = r3
            ac.i r1 = r6.f9330c
            java.lang.Object r7 = r7.a(r1, r0)
            if (r7 != r4) goto Laf
            goto Lc0
        Laf:
            r5 = r8
            r8 = r7
            r7 = r5
        Lb2:
            r1 = 0
            r0.f9323f = r1
            r0.f9322e = r2
            java.lang.Object r7 = r7.n(r8, r0)
            if (r7 != r4) goto Lbe
            goto Lc0
        Lbe:
            ub.a0 r4 = ub.a0.f21526a
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.u1.n(java.lang.Object, yb.c):java.lang.Object");
    }
}
