package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.o f20966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1 f20967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c2.t f20968i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(ic.o oVar, i1 i1Var, c2.t tVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f20964e = i10;
        this.f20966g = oVar;
        this.f20967h = i1Var;
        this.f20968i = tVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20964e) {
            case 0:
                return new j2(this.f20966g, this.f20967h, this.f20968i, cVar, 0);
            default:
                return new j2(this.f20966g, this.f20967h, this.f20968i, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f20964e) {
        }
        return ((j2) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f20964e) {
            case 0:
                int i10 = this.f20965f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    p1.b bVar = new p1.b(this.f20968i.f3324c);
                    this.f20965f = 1;
                    Object objG = this.f20966g.g(this.f20967h, bVar, this);
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
                int i11 = this.f20965f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    p1.b bVar2 = new p1.b(this.f20968i.f3324c);
                    this.f20965f = 1;
                    Object objG2 = this.f20966g.g(this.f20967h, bVar2, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objG2 == aVar2) {
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
