package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1386e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1391j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x0.w0 w0Var, boolean z10, w.k kVar, yb.c cVar) {
        super(2, cVar);
        this.f1390i = w0Var;
        this.f1388g = z10;
        this.f1391j = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f1386e) {
            case 0:
                return new w(this.f1388g, (a0) this.f1389h, (r.x) this.f1390i, (t1.b) this.f1391j, cVar);
            default:
                return new w((x0.w0) this.f1390i, this.f1388g, (w.k) this.f1391j, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f1386e) {
        }
        return ((w) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r.c.d(r9.f1187p, new java.lang.Float(1.0f), (r.x) r8, r3, r12, 4) == r7) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f1386e
            ub.a0 r6 = ub.a0.f21526a
            java.lang.Object r1 = r12.f1391j
            boolean r2 = r12.f1388g
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            zb.a r7 = zb.a.f26667a
            r5 = 1
            java.lang.Object r8 = r12.f1390i
            switch(r0) {
                case 0: goto L56;
                default: goto L12;
            }
        L12:
            x0.w0 r8 = (x0.w0) r8
            int r0 = r12.f1387f
            if (r0 == 0) goto L29
            if (r0 != r5) goto L23
            java.lang.Object r0 = r12.f1389h
            r8 = r0
            x0.w0 r8 = (x0.w0) r8
            ub.a.f(r13)
            goto L51
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L29:
            ub.a.f(r13)
            java.lang.Object r0 = r8.getValue()
            w.m r0 = (w.m) r0
            if (r0 == 0) goto L55
            w.k r1 = (w.k) r1
            if (r2 == 0) goto L3e
            w.n r2 = new w.n
            r2.<init>(r0)
            goto L43
        L3e:
            w.l r2 = new w.l
            r2.<init>(r0)
        L43:
            if (r1 == 0) goto L51
            r12.f1389h = r8
            r12.f1387f = r5
            java.lang.Object r0 = r1.a(r2, r12)
            if (r0 != r7) goto L51
            r6 = r7
            goto L55
        L51:
            r0 = 0
            r8.setValue(r0)
        L55:
            return r6
        L56:
            java.lang.Object r0 = r12.f1389h
            r9 = r0
            b0.a0 r9 = (b0.a0) r9
            int r0 = r12.f1387f
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L75
            if (r0 == r5) goto L71
            if (r0 != r11) goto L6b
            ub.a.f(r13)     // Catch: java.lang.Throwable -> L69
            goto Lab
        L69:
            r0 = move-exception
            goto Lb1
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L71:
            ub.a.f(r13)     // Catch: java.lang.Throwable -> L69
            goto L8b
        L75:
            ub.a.f(r13)
            if (r2 == 0) goto L8b
            r.c r0 = r9.f1187p     // Catch: java.lang.Throwable -> L69
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L69
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r12.f1387f = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.f(r2, r12)     // Catch: java.lang.Throwable -> L69
            if (r0 != r7) goto L8b
            goto La9
        L8b:
            r.c r0 = r9.f1187p     // Catch: java.lang.Throwable -> L69
            r2 = r1
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L69
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r.x r8 = (r.x) r8     // Catch: java.lang.Throwable -> L69
            b0.v r3 = new b0.v     // Catch: java.lang.Throwable -> L69
            t1.b r2 = (t1.b) r2     // Catch: java.lang.Throwable -> L69
            r3.<init>(r2, r9, r10)     // Catch: java.lang.Throwable -> L69
            r12.f1387f = r11     // Catch: java.lang.Throwable -> L69
            r5 = 4
            r4 = r12
            r2 = r8
            java.lang.Object r0 = r.c.d(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L69
            if (r0 != r7) goto Lab
        La9:
            r6 = r7
            goto Lb0
        Lab:
            int r0 = b0.a0.f1171t
            r9.d(r10)
        Lb0:
            return r6
        Lb1:
            int r1 = b0.a0.f1171t
            r9.d(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.w.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z10, a0 a0Var, r.x xVar, t1.b bVar, yb.c cVar) {
        super(2, cVar);
        this.f1388g = z10;
        this.f1389h = a0Var;
        this.f1390i = xVar;
        this.f1391j = bVar;
    }
}
