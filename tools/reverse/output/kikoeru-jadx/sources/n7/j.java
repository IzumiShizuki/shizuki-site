package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f15509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f15507e = i10;
        this.f15509g = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15507e) {
            case 0:
                return new j(this.f15509g, cVar, 0);
            default:
                return new j(this.f15509g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f15507e) {
        }
        return ((j) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f15507e) {
            case 0:
                int i10 = this.f15508f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    m0 m0Var = this.f15509g.f15519b;
                    this.f15508f = 1;
                    Object objG = m0Var.g(this);
                    zb.a aVar = zb.a.f26667a;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i11 = this.f15508f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f15508f = 1;
                    Object objB = this.f15509g.b(this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }
}
