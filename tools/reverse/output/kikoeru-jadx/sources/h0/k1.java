package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7722e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ u.i1 f7724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long f7725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w.k f7726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f7727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f7728k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(hf.y yVar, x0.w0 w0Var, w.k kVar, yb.c cVar) {
        super(3, cVar);
        this.f7728k = yVar;
        this.f7727j = w0Var;
        this.f7726i = kVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        u.i1 i1Var = (u.i1) obj;
        p1.b bVar = (p1.b) obj2;
        switch (this.f7722e) {
            case 0:
                long j10 = bVar.f16481a;
                k1 k1Var = new k1((hf.y) this.f7728k, this.f7727j, this.f7726i, (yb.c) obj3);
                k1Var.f7724g = i1Var;
                k1Var.f7725h = j10;
                return k1Var.u(ub.a0.f21526a);
            default:
                long j11 = bVar.f16481a;
                x0.w0 w0Var = (x0.w0) this.f7728k;
                k1 k1Var2 = new k1(this.f7726i, this.f7727j, w0Var, (yb.c) obj3);
                k1Var2.f7724g = i1Var;
                k1Var2.f7725h = j11;
                return k1Var2.u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objG;
        int i10 = this.f7722e;
        Object obj2 = this.f7728k;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                hf.y yVar = (hf.y) obj2;
                int i11 = this.f7723f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    u.i1 i1Var = this.f7724g;
                    hf.a0.y(yVar, null, null, new b0.z(this.f7727j, this.f7725h, this.f7726i, null, 2), 3);
                    this.f7723f = 1;
                    objG = i1Var.g(this);
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objG = obj;
                }
                hf.a0.y(yVar, null, null, new b0.w(this.f7727j, ((Boolean) objG).booleanValue(), this.f7726i, null), 3);
                return a0Var;
            default:
                u.i1 i1Var2 = this.f7724g;
                long j10 = this.f7725h;
                int i12 = this.f7723f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    this.f7724g = null;
                    this.f7725h = j10;
                    this.f7723f = 1;
                    h2.g gVar = la.j.f12014b;
                    Object objK = hf.a0.k(new la.i(i1Var2, j10, this.f7726i, this.f7727j, (x0.w0) obj2, null), this);
                    if (objK != aVar) {
                        objK = a0Var;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(w.k kVar, x0.w0 w0Var, x0.w0 w0Var2, yb.c cVar) {
        super(3, cVar);
        this.f7726i = kVar;
        this.f7727j = w0Var;
        this.f7728k = w0Var2;
    }
}
