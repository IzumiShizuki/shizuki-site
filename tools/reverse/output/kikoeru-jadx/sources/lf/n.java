package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ac.i f12448b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(f fVar, ic.o oVar) {
        this.f12447a = fVar;
        this.f12448b = (ac.i) oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v4, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ac.i, ic.o] */
    @Override // lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r9, yb.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof lf.m
            if (r0 == 0) goto L13
            r0 = r10
            lf.m r0 = (lf.m) r0
            int r1 = r0.f12439e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12439e = r1
            goto L18
        L13:
            lf.m r0 = new lf.m
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12438d
            int r1 = r0.f12439e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            zb.a r6 = zb.a.f26667a
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.f12441g
            mf.p r9 = (mf.p) r9
            ub.a.f(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f12441g
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            ub.a.f(r10)
            goto La1
        L44:
            lf.g r9 = r0.f12442h
            java.lang.Object r1 = r0.f12441g
            lf.n r1 = (lf.n) r1
            ub.a.f(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8d
        L50:
            ub.a.f(r10)
            lf.f r10 = r8.f12447a     // Catch: java.lang.Throwable -> L8b
            r0.f12441g = r8     // Catch: java.lang.Throwable -> L8b
            r0.f12442h = r9     // Catch: java.lang.Throwable -> L8b
            r0.f12439e = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r10.b(r9, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r6) goto L62
            goto La0
        L62:
            r1 = r8
        L63:
            mf.p r10 = new mf.p
            yb.h r3 = r0.f302b
            jc.l.b(r3)
            r10.<init>(r9, r3)
            ac.i r9 = r1.f12448b     // Catch: java.lang.Throwable -> L83
            r0.f12441g = r10     // Catch: java.lang.Throwable -> L83
            r0.f12442h = r5     // Catch: java.lang.Throwable -> L83
            r0.f12439e = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.g(r10, r5, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r6) goto L7c
            goto La0
        L7c:
            r9 = r10
        L7d:
            r9.w()
            ub.a0 r9 = ub.a0.f21526a
            return r9
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.w()
            throw r10
        L8b:
            r9 = move-exception
            r1 = r8
        L8d:
            lf.h1 r10 = new lf.h1
            r10.<init>(r9)
            ac.i r1 = r1.f12448b
            r0.f12441g = r9
            r0.f12442h = r5
            r0.f12439e = r3
            java.lang.Object r10 = lf.p0.e(r10, r1, r9, r0)
            if (r10 != r6) goto La1
        La0:
            return r6
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.n.b(lf.g, yb.c):java.lang.Object");
    }
}
