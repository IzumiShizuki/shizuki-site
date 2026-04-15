package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rf.a f19301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f19303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y0 f19304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f19306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f19307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y0 f19308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ac.i f19309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f19310n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(v0 v0Var, y0 y0Var, ic.n nVar, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f19307k = v0Var;
        this.f19308l = y0Var;
        this.f19309m = (ac.i) nVar;
        this.f19310n = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        x0 x0Var = new x0(this.f19307k, this.f19308l, this.f19309m, this.f19310n, cVar);
        x0Var.f19306j = obj;
        return x0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((x0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // ac.a
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f19305i
            r1 = 2
            r2 = 1
            r3 = 0
            zb.a r4 = zb.a.f26667a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L27
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r9.f19302f
            s.y0 r0 = (s.y0) r0
            rf.a r1 = r9.f19301e
            java.lang.Object r2 = r9.f19306j
            s.w0 r2 = (s.w0) r2
            ub.a.f(r10)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r10 = move-exception
            goto La7
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            s.y0 r0 = r9.f19304h
            java.lang.Object r2 = r9.f19303g
            java.lang.Object r5 = r9.f19302f
            ic.n r5 = (ic.n) r5
            rf.a r6 = r9.f19301e
            java.lang.Object r7 = r9.f19306j
            s.w0 r7 = (s.w0) r7
            ub.a.f(r10)
            r8 = r6
            r6 = r5
            r5 = r8
            goto L7a
        L3c:
            ub.a.f(r10)
            java.lang.Object r10 = r9.f19306j
            hf.y r10 = (hf.y) r10
            s.w0 r0 = new s.w0
            yb.h r10 = r10.O()
            hf.v r5 = hf.v.f8599b
            yb.f r10 = r10.R(r5)
            jc.l.b(r10)
            hf.d1 r10 = (hf.d1) r10
            s.v0 r5 = r9.f19307k
            r0.<init>(r5, r10)
            s.y0 r10 = r9.f19308l
            s.y0.a(r10, r0)
            rf.c r5 = r10.f19313b
            r9.f19306j = r0
            r9.f19301e = r5
            ac.i r6 = r9.f19309m
            r9.f19302f = r6
            java.lang.Object r7 = r9.f19310n
            r9.f19303g = r7
            r9.f19304h = r10
            r9.f19305i = r2
            java.lang.Object r2 = r5.g(r9)
            if (r2 != r4) goto L77
            goto L8c
        L77:
            r2 = r7
            r7 = r0
            r0 = r10
        L7a:
            r9.f19306j = r7     // Catch: java.lang.Throwable -> La4
            r9.f19301e = r5     // Catch: java.lang.Throwable -> La4
            r9.f19302f = r0     // Catch: java.lang.Throwable -> La4
            r9.f19303g = r3     // Catch: java.lang.Throwable -> La4
            r9.f19304h = r3     // Catch: java.lang.Throwable -> La4
            r9.f19305i = r1     // Catch: java.lang.Throwable -> La4
            java.lang.Object r10 = r6.q(r2, r9)     // Catch: java.lang.Throwable -> La4
            if (r10 != r4) goto L8d
        L8c:
            return r4
        L8d:
            r1 = r5
            r2 = r7
        L8f:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f19312a     // Catch: java.lang.Throwable -> La2
        L91:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L98
            goto L9e
        L98:
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r4 == r2) goto L91
        L9e:
            r1.b(r3)
            return r10
        La2:
            r10 = move-exception
            goto Lb7
        La4:
            r10 = move-exception
            r1 = r5
            r2 = r7
        La7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f19312a     // Catch: java.lang.Throwable -> La2
        La9:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La2
            if (r4 != 0) goto Lb6
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r4 != r2) goto Lb6
            goto La9
        Lb6:
            throw r10     // Catch: java.lang.Throwable -> La2
        Lb7:
            r1.b(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s.x0.u(java.lang.Object):java.lang.Object");
    }
}
