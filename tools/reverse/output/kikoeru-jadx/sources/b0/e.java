package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hf.k f1217b;

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    @Override // j1.q
    public final /* synthetic */ j1.q e(j1.q qVar) {
        return a0.c.r(this, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof b0.d
            if (r0 == 0) goto L13
            r0 = r5
            b0.d r0 = (b0.d) r0
            int r1 = r0.f1212g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1212g = r1
            goto L18
        L13:
            b0.d r0 = new b0.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1210e
            int r1 = r0.f1212g
            ub.a0 r2 = ub.a0.f21526a
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            hf.k r0 = r0.f1209d
            ub.a.f(r5)
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ub.a.f(r5)
            boolean r5 = r4.f1216a
            if (r5 != 0) goto L5b
            hf.k r5 = r4.f1217b
            r0.f1209d = r5
            r0.f1212g = r3
            hf.k r1 = new hf.k
            yb.c r0 = ud.s.p(r0)
            r1.<init>(r3, r0)
            r1.r()
            r4.f1217b = r1
            java.lang.Object r0 = r1.q()
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            if (r0 == 0) goto L5b
            r0.h(r2)
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.h(ac.c):java.lang.Object");
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return ((Boolean) kVar.a(this)).booleanValue();
    }
}
