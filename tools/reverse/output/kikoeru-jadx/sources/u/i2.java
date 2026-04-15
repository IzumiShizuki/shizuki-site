package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i1 f20953g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(i1 i1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f20951e = i10;
        this.f20953g = i1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20951e) {
            case 0:
                return new i2(this.f20953g, cVar, 0);
            default:
                return new i2(this.f20953g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f20951e) {
        }
        return ((i2) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f20951e) {
            case 0:
                int i10 = this.f20952f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f20952f = 1;
                    Object objF = this.f20953g.f(this);
                    zb.a aVar = zb.a.f26667a;
                    if (objF == aVar) {
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
                int i11 = this.f20952f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f20952f = 1;
                    Object objF2 = this.f20953g.f(this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objF2 == aVar2) {
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
