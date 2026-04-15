package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f19103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.m f19104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, w.m mVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f19101e = i10;
        this.f19103g = dVar;
        this.f19104h = mVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f19101e) {
            case 0:
                return new b(this.f19103g, this.f19104h, cVar, 0);
            case 1:
                return new b(this.f19103g, this.f19104h, cVar, 1);
            default:
                return new b(this.f19103g, this.f19104h, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f19101e) {
        }
        return ((b) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f19101e) {
            case 0:
                int i10 = this.f19102f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    w.k kVar = this.f19103g.f19119q;
                    if (kVar != null) {
                        w.l lVar = new w.l(this.f19104h);
                        this.f19102f = 1;
                        Object objA = kVar.a(lVar, this);
                        zb.a aVar = zb.a.f26667a;
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 1:
                int i11 = this.f19102f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    w.k kVar2 = this.f19103g.f19119q;
                    if (kVar2 != null) {
                        this.f19102f = 1;
                        Object objA2 = kVar2.a(this.f19104h, this);
                        zb.a aVar2 = zb.a.f26667a;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i12 = this.f19102f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    w.k kVar3 = this.f19103g.f19119q;
                    if (kVar3 != null) {
                        w.n nVar = new w.n(this.f19104h);
                        this.f19102f = 1;
                        Object objA3 = kVar3.a(nVar, this);
                        zb.a aVar3 = zb.a.f26667a;
                        if (objA3 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }
}
