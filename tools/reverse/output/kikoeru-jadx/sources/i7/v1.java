package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements lf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.f f9344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ac.i f9345c;

    /* JADX WARN: Multi-variable type inference failed */
    public v1(ic.n nVar, lf.f fVar) {
        this.f9343a = 2;
        this.f9345c = (ac.i) nVar;
        this.f9344b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r1v0, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ac.i, ic.n] */
    @Override // lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r7, yb.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f9343a
            switch(r0) {
                case 0: goto L9a;
                case 1: goto L84;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof lf.o
            if (r0 == 0) goto L18
            r0 = r8
            lf.o r0 = (lf.o) r0
            int r1 = r0.f12457e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f12457e = r1
            goto L1d
        L18:
            lf.o r0 = new lf.o
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f12456d
            int r1 = r0.f12457e
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            ub.a.f(r8)
            goto L79
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            mf.p r7 = r0.f12461i
            lf.g r1 = r0.f12460h
            i7.v1 r3 = r0.f12459g
            ub.a.f(r8)     // Catch: java.lang.Throwable -> L41
            goto L64
        L41:
            r8 = move-exception
            goto L80
        L43:
            ub.a.f(r8)
            mf.p r8 = new mf.p
            yb.h r1 = r0.f302b
            jc.l.b(r1)
            r8.<init>(r7, r1)
            ac.i r1 = r6.f9345c     // Catch: java.lang.Throwable -> L7c
            r0.f12459g = r6     // Catch: java.lang.Throwable -> L7c
            r0.f12460h = r7     // Catch: java.lang.Throwable -> L7c
            r0.f12461i = r8     // Catch: java.lang.Throwable -> L7c
            r0.f12457e = r3     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r1.q(r8, r0)     // Catch: java.lang.Throwable -> L7c
            if (r1 != r4) goto L61
            goto L7b
        L61:
            r3 = r6
            r1 = r7
            r7 = r8
        L64:
            r7.w()
            lf.f r7 = r3.f9344b
            r8 = 0
            r0.f12459g = r8
            r0.f12460h = r8
            r0.f12461i = r8
            r0.f12457e = r2
            java.lang.Object r7 = r7.b(r1, r0)
            if (r7 != r4) goto L79
            goto L7b
        L79:
            ub.a0 r4 = ub.a0.f21526a
        L7b:
            return r4
        L7c:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L80:
            r7.w()
            throw r8
        L84:
            i7.u1 r0 = new i7.u1
            ac.i r1 = r6.f9345c
            r2 = 1
            r0.<init>(r7, r1, r2)
            lf.f r7 = r6.f9344b
            java.lang.Object r7 = r7.b(r0, r8)
            zb.a r8 = zb.a.f26667a
            if (r7 != r8) goto L97
            goto L99
        L97:
            ub.a0 r7 = ub.a0.f21526a
        L99:
            return r7
        L9a:
            i7.u1 r0 = new i7.u1
            ac.i r1 = r6.f9345c
            r2 = 0
            r0.<init>(r7, r1, r2)
            lf.f r7 = r6.f9344b
            java.lang.Object r7 = r7.b(r0, r8)
            zb.a r8 = zb.a.f26667a
            if (r7 != r8) goto Lad
            goto Laf
        Lad:
            ub.a0 r7 = ub.a0.f21526a
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.v1.b(lf.g, yb.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v1(lf.f fVar, ic.n nVar, int i10) {
        this.f9343a = i10;
        switch (i10) {
            case 1:
                this.f9344b = fVar;
                this.f9345c = (ac.i) nVar;
                break;
            default:
                this.f9344b = fVar;
                this.f9345c = (ac.i) nVar;
                break;
        }
    }
}
