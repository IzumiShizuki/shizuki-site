package j8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f10609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.m f10610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf.e f10611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f10612d;

    public e(n nVar, s8.m mVar, rf.e eVar, j jVar) {
        this.f10609a = nVar;
        this.f10610b = mVar;
        this.f10611c = eVar;
        this.f10612d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof j8.d
            if (r0 == 0) goto L13
            r0 = r9
            j8.d r0 = (j8.d) r0
            int r1 = r0.f10608h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10608h = r1
            goto L18
        L13:
            j8.d r0 = new j8.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f10606f
            int r1 = r0.f10608h
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r0.f10604d
            rf.e r0 = (rf.e) r0
            ub.a.f(r9)     // Catch: java.lang.Throwable -> L2e
            goto L79
        L2e:
            r9 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            rf.e r1 = r0.f10605e
            java.lang.Object r3 = r0.f10604d
            j8.e r3 = (j8.e) r3
            ub.a.f(r9)
            r9 = r1
            goto L59
        L43:
            ub.a.f(r9)
            r0.f10604d = r8
            rf.e r9 = r8.f10611c
            r0.f10605e = r9
            r0.f10608h = r3
            r1 = r9
            rf.h r1 = (rf.h) r1
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r4) goto L58
            goto L75
        L58:
            r3 = r8
        L59:
            androidx.lifecycle.n0 r1 = new androidx.lifecycle.n0     // Catch: java.lang.Throwable -> L85
            r5 = 15
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L85
            r0.f10604d = r9     // Catch: java.lang.Throwable -> L85
            r3 = 0
            r0.f10605e = r3     // Catch: java.lang.Throwable -> L85
            r0.f10608h = r2     // Catch: java.lang.Throwable -> L85
            yb.i r2 = yb.i.f26088a     // Catch: java.lang.Throwable -> L85
            androidx.lifecycle.r r5 = new androidx.lifecycle.r     // Catch: java.lang.Throwable -> L85
            r6 = 5
            r5.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = hf.a0.H(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r0 != r4) goto L76
        L75:
            return r4
        L76:
            r7 = r0
            r0 = r9
            r9 = r7
        L79:
            j8.g r9 = (j8.g) r9     // Catch: java.lang.Throwable -> L2e
            rf.h r0 = (rf.h) r0
            r0.d()
            return r9
        L81:
            r7 = r0
            r0 = r9
            r9 = r7
            goto L87
        L85:
            r0 = move-exception
            goto L81
        L87:
            rf.h r0 = (rf.h) r0
            r0.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.e.a(ac.c):java.lang.Object");
    }
}
