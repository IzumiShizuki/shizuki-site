package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r.c f13313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f13314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f13315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o1 f13316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w.j f13317j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r.c cVar, float f10, boolean z10, o1 o1Var, w.j jVar, yb.c cVar2) {
        super(2, cVar2);
        this.f13313f = cVar;
        this.f13314g = f10;
        this.f13315h = z10;
        this.f13316i = o1Var;
        this.f13317j = jVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new n1(this.f13313f, this.f13314g, this.f13315h, this.f13316i, this.f13317j, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((n1) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r8.f(r0, r7) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (m0.w2.a(r8, r3, r0, r7.f13317j, r7) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        return r4;
     */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f13312e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L13:
            ub.a.f(r8)
            goto L87
        L18:
            ub.a.f(r8)
            r.c r8 = r7.f13313f
            x0.e1 r0 = r8.f18335e
            java.lang.Object r0 = r0.getValue()
            f3.f r0 = (f3.f) r0
            float r0 = r0.f6657a
            float r3 = r7.f13314g
            boolean r0 = f3.f.a(r0, r3)
            if (r0 != 0) goto L87
            boolean r0 = r7.f13315h
            zb.a r4 = zb.a.f26667a
            if (r0 != 0) goto L43
            f3.f r0 = new f3.f
            r0.<init>(r3)
            r7.f13312e = r2
            java.lang.Object r8 = r8.f(r0, r7)
            if (r8 != r4) goto L87
            goto L86
        L43:
            x0.e1 r0 = r8.f18335e
            java.lang.Object r0 = r0.getValue()
            f3.f r0 = (f3.f) r0
            float r0 = r0.f6657a
            m0.o1 r2 = r7.f13316i
            float r5 = r2.f13375b
            boolean r5 = f3.f.a(r0, r5)
            if (r5 == 0) goto L5f
            w.m r0 = new w.m
            r5 = 0
            r0.<init>(r5)
            goto L7c
        L5f:
            float r5 = r2.f13377d
            boolean r5 = f3.f.a(r0, r5)
            if (r5 == 0) goto L6d
            w.h r0 = new w.h
            r0.<init>()
            goto L7c
        L6d:
            float r2 = r2.f13378e
            boolean r0 = f3.f.a(r0, r2)
            if (r0 == 0) goto L7b
            w.f r0 = new w.f
            r0.<init>()
            goto L7c
        L7b:
            r0 = 0
        L7c:
            r7.f13312e = r1
            w.j r1 = r7.f13317j
            java.lang.Object r8 = m0.w2.a(r8, r3, r0, r1, r7)
            if (r8 != r4) goto L87
        L86:
            return r4
        L87:
            ub.a0 r8 = ub.a0.f21526a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.n1.u(java.lang.Object):java.lang.Object");
    }
}
