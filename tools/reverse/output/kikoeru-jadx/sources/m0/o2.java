package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t2 f13381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(t2 t2Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f13379e = i10;
        this.f13381g = t2Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13379e) {
            case 0:
                return new o2(this.f13381g, cVar, 0);
            default:
                return new o2(this.f13381g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f13379e) {
        }
        return ((o2) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f13379e) {
            case 0:
                int i10 = this.f13380f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f13380f = 1;
                    Object objA = this.f13381g.a(this);
                    zb.a aVar = zb.a.f26667a;
                    if (objA == aVar) {
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
                int i11 = this.f13380f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f13380f = 1;
                    Object objA2 = this.f13381g.a(this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objA2 == aVar2) {
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
