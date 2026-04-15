package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f20793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(hf.y yVar, ic.o oVar, ic.k kVar, i1 i1Var, yb.c cVar) {
        super(2, cVar);
        this.f20790c = 2;
        this.f20794g = yVar;
        this.f20795h = (ac.i) oVar;
        this.f20796i = (jc.m) kVar;
        this.f20797j = i1Var;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ic.k, jc.m] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20790c) {
            case 0:
                a0 a0Var = new a0((cg.b) this.f20794g, (b0.p0) this.f20795h, (cg.y) this.f20796i, (cg.y) this.f20797j, cVar, 0);
                a0Var.f20793f = obj;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0((cg.e) this.f20794g, (a0.q) this.f20795h, (cg.f) this.f20796i, (cg.f) this.f20797j, cVar, 1);
                a0Var2.f20793f = obj;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0((hf.y) this.f20794g, (ac.i) this.f20795h, (jc.m) this.f20796i, (i1) this.f20797j, cVar);
                a0Var3.f20793f = obj;
                return a0Var3;
            default:
                a0 a0Var4 = new a0((x0.w0) this.f20791d, (x0.w0) this.f20794g, (x0.w0) this.f20795h, (x0.w0) this.f20796i, (x0.w0) this.f20797j, cVar);
                a0Var4.f20793f = obj;
                return a0Var4;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        c2.i0 i0Var = (c2.i0) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f20790c) {
        }
        return ((a0) o(i0Var, cVar)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (u.e0.g(r2, r10, r15, r22) == r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        if (r1 == r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c0, code lost:
    
        if (r0 == r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x028b, code lost:
    
        if (r0 == r9) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0247  */
    /* JADX WARN: Type inference failed for: r11v3, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r13v3, types: [ic.k, jc.m] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a0.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(jc.m mVar, jc.m mVar2, jc.m mVar3, jc.m mVar4, yb.c cVar, int i10) {
        super(2, cVar);
        this.f20790c = i10;
        this.f20794g = mVar;
        this.f20795h = mVar2;
        this.f20796i = mVar3;
        this.f20797j = mVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x0.w0 w0Var, x0.w0 w0Var2, x0.w0 w0Var3, x0.w0 w0Var4, x0.w0 w0Var5, yb.c cVar) {
        super(2, cVar);
        this.f20790c = 3;
        this.f20791d = w0Var;
        this.f20794g = w0Var2;
        this.f20795h = w0Var3;
        this.f20796i = w0Var4;
        this.f20797j = w0Var5;
    }
}
