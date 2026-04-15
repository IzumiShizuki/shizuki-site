package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f22032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f22033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f22034i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(y yVar, x xVar, x xVar2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f22030e = i10;
        this.f22032g = yVar;
        this.f22033h = xVar;
        this.f22034i = xVar2;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f22030e) {
            case 0:
                return new p(this.f22032g, this.f22033h, this.f22034i, cVar, 0);
            default:
                return new p(this.f22032g, this.f22033h, this.f22034i, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f22030e) {
        }
        return ((p) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f22030e) {
            case 0:
                int i10 = this.f22031f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f22031f = 1;
                    Object objB = y.b(this.f22032g, this.f22033h, this.f22034i, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB == aVar) {
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
                int i11 = this.f22031f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f22031f = 1;
                    Object objB2 = y.b(this.f22032g, this.f22033h, this.f22034i, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objB2 == aVar2) {
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
