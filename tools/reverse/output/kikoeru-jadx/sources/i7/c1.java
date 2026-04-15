package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f9060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rf.c f9061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f9062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f9064j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f9059e = i10;
        this.f9064j = d1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f9059e) {
            case 0:
                return new c1(this.f9064j, cVar, 0);
            default:
                return new c1(this.f9064j, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f9059e) {
        }
        return ((c1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        d1 d1Var;
        e1 e1Var;
        rf.c cVar;
        d1 d1Var2;
        e1 e1Var2;
        rf.c cVar2;
        switch (this.f9059e) {
            case 0:
                int i10 = this.f9063i;
                zb.a aVar = zb.a.f26667a;
                try {
                    if (i10 == 0) {
                        ub.a.f(obj);
                        d1Var = this.f9064j;
                        e1Var = d1Var.f9082h;
                        rf.c cVar3 = e1Var.f9090a;
                        this.f9060f = e1Var;
                        this.f9061g = cVar3;
                        this.f9062h = d1Var;
                        this.f9063i = 1;
                        if (cVar3.g(this) == aVar) {
                            return aVar;
                        }
                        cVar = cVar3;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ub.a.f(obj);
                            return ub.a0.f21526a;
                        }
                        d1Var = this.f9062h;
                        cVar = this.f9061g;
                        e1Var = this.f9060f;
                        ub.a.f(obj);
                    }
                    g1 g1Var = e1Var.f9091b;
                    v1 v1Var = new v1(new f1(g1Var, null, 1), lf.p0.j(g1Var.f9126g));
                    cVar.b(null);
                    this.f9060f = null;
                    this.f9061g = null;
                    this.f9062h = null;
                    this.f9063i = 2;
                    if (d1.a(d1Var, v1Var, d0.f9072b, this) == aVar) {
                        return aVar;
                    }
                    return ub.a0.f21526a;
                } catch (Throwable th2) {
                    cVar.b(null);
                    throw th2;
                }
            default:
                int i11 = this.f9063i;
                zb.a aVar2 = zb.a.f26667a;
                try {
                    if (i11 == 0) {
                        ub.a.f(obj);
                        d1Var2 = this.f9064j;
                        e1Var2 = d1Var2.f9082h;
                        rf.c cVar4 = e1Var2.f9090a;
                        this.f9060f = e1Var2;
                        this.f9061g = cVar4;
                        this.f9062h = d1Var2;
                        this.f9063i = 1;
                        if (cVar4.g(this) == aVar2) {
                            return aVar2;
                        }
                        cVar2 = cVar4;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ub.a.f(obj);
                            return ub.a0.f21526a;
                        }
                        d1Var2 = this.f9062h;
                        cVar2 = this.f9061g;
                        e1Var2 = this.f9060f;
                        ub.a.f(obj);
                    }
                    g1 g1Var2 = e1Var2.f9091b;
                    v1 v1Var2 = new v1(new f1(g1Var2, null, 0), lf.p0.j(g1Var2.f9127h));
                    cVar2.b(null);
                    this.f9060f = null;
                    this.f9061g = null;
                    this.f9062h = null;
                    this.f9063i = 2;
                    if (d1.a(d1Var2, v1Var2, d0.f9073c, this) == aVar2) {
                        return aVar2;
                    }
                    return ub.a0.f21526a;
                } catch (Throwable th3) {
                    cVar2.b(null);
                    throw th3;
                }
        }
    }
}
