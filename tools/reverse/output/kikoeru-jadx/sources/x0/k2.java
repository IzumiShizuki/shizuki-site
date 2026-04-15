package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f24338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f24339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f24340i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(ic.n nVar, w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f24336e = i10;
        this.f24339h = nVar;
        this.f24340i = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f24336e) {
            case 0:
                k2 k2Var = new k2(this.f24339h, this.f24340i, cVar, 0);
                k2Var.f24338g = obj;
                return k2Var;
            default:
                k2 k2Var2 = new k2(this.f24339h, this.f24340i, cVar, 1);
                k2Var2.f24338g = obj;
                return k2Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f24336e) {
        }
        return ((k2) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f24336e) {
            case 0:
                int i10 = this.f24337f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    l1 l1Var = new l1(this.f24340i, ((hf.y) this.f24338g).O());
                    this.f24337f = 1;
                    Object objQ = this.f24339h.q(l1Var, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objQ == aVar) {
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
                int i11 = this.f24337f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    l1 l1Var2 = new l1(this.f24340i, ((hf.y) this.f24338g).O());
                    this.f24337f = 1;
                    Object objQ2 = this.f24339h.q(l1Var2, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objQ2 == aVar2) {
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
