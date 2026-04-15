package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12472c;

    public /* synthetic */ p(f fVar, int i10, int i11) {
        this.f12470a = i11;
        this.f12471b = fVar;
        this.f12472c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    @Override // lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r8, yb.c r9) {
        /*
            r7 = this;
            int r0 = r7.f12470a
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            lf.f r0 = r7.f12471b
            lf.p r0 = (lf.p) r0
            i7.u0 r1 = new i7.u0
            int r2 = r7.f12472c
            r1.<init>(r8, r2)
            java.lang.Object r8 = r0.b(r1, r9)
            zb.a r9 = zb.a.f26667a
            if (r8 != r9) goto L19
            goto L1b
        L19:
            ub.a0 r8 = ub.a0.f21526a
        L1b:
            return r8
        L1c:
            boolean r0 = r9 instanceof lf.v
            if (r0 == 0) goto L2f
            r0 = r9
            lf.v r0 = (lf.v) r0
            int r1 = r0.f12503e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2f
            int r1 = r1 - r2
            r0.f12503e = r1
            goto L34
        L2f:
            lf.v r0 = new lf.v
            r0.<init>(r7, r9)
        L34:
            java.lang.Object r9 = r0.f12502d
            int r1 = r0.f12503e
            r2 = 1
            if (r1 == 0) goto L4d
            if (r1 != r2) goto L45
            java.lang.Object r8 = r0.f12505g
            ub.a.f(r9)     // Catch: mf.a -> L43
            goto L78
        L43:
            r9 = move-exception
            goto L74
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            ub.a.f(r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            jc.w r1 = new jc.w
            r1.<init>()
            lf.f r3 = r7.f12471b     // Catch: mf.a -> L70
            lf.x r4 = new lf.x     // Catch: mf.a -> L70
            int r5 = r7.f12472c     // Catch: mf.a -> L70
            r4.<init>(r1, r5, r8, r9)     // Catch: mf.a -> L70
            r0.f12505g = r9     // Catch: mf.a -> L70
            r0.f12503e = r2     // Catch: mf.a -> L70
            java.lang.Object r8 = r3.b(r4, r0)     // Catch: mf.a -> L70
            zb.a r9 = zb.a.f26667a
            if (r8 != r9) goto L78
            goto L7a
        L70:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L74:
            java.lang.Object r0 = r9.f15127a
            if (r0 != r8) goto L7b
        L78:
            ub.a0 r9 = ub.a0.f21526a
        L7a:
            return r9
        L7b:
            throw r9
        L7c:
            jc.w r0 = new jc.w
            r0.<init>()
            lf.r r1 = new lf.r
            int r2 = r7.f12472c
            r1.<init>(r0, r2, r8)
            lf.f r8 = r7.f12471b
            java.lang.Object r8 = r8.b(r1, r9)
            zb.a r9 = zb.a.f26667a
            if (r8 != r9) goto L93
            goto L95
        L93:
            ub.a0 r8 = ub.a0.f21526a
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p.b(lf.g, yb.c):java.lang.Object");
    }
}
