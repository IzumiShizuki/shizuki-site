package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.m f11978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f11981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w.k f11982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11983j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x0.w0 w0Var, long j10, w.k kVar, x0.w0 w0Var2, yb.c cVar) {
        super(2, cVar);
        this.f11980g = w0Var;
        this.f11981h = j10;
        this.f11982i = kVar;
        this.f11983j = w0Var2;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new h(this.f11980g, this.f11981h, this.f11982i, this.f11983j, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((h) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r6.f11982i.a(r0, r6) == r3) goto L17;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f11979f
            r1 = 2
            r2 = 1
            zb.a r3 = zb.a.f26667a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            w.m r0 = r6.f11978e
            ub.a.f(r7)
            goto L54
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            ub.a.f(r7)
            goto L40
        L1e:
            ub.a.f(r7)
            x0.w0 r7 = r6.f11980g
            java.lang.Object r7 = r7.getValue()
            ic.a r7 = (ic.a) r7
            java.lang.Object r7 = r7.b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L40
            long r4 = la.j.f12013a
            r6.f11979f = r2
            java.lang.Object r7 = hf.a0.l(r4, r6)
            if (r7 != r3) goto L40
            goto L53
        L40:
            w.m r0 = new w.m
            long r4 = r6.f11981h
            r0.<init>(r4)
            r6.f11978e = r0
            r6.f11979f = r1
            w.k r7 = r6.f11982i
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r3) goto L54
        L53:
            return r3
        L54:
            x0.w0 r7 = r6.f11983j
            r7.setValue(r0)
            ub.a0 r7 = ub.a0.f21526a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: la.h.u(java.lang.Object):java.lang.Object");
    }
}
