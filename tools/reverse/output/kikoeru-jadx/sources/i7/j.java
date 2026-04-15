package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9170e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9173h;

    public /* synthetic */ j(int i10, yb.c cVar) {
        super(i10, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ac.i, ic.n] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9170e) {
            case 0:
                j jVar = new j(3, (yb.c) obj3);
                jVar.f9172g = (e0) obj;
                jVar.f9173h = (e0) obj2;
                return jVar.u(ub.a0.f21526a);
            default:
                return new j((m0.w) this.f9172g, (ac.i) this.f9173h, (yb.c) obj3).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ac.i, ic.n] */
    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f9170e) {
            case 0:
                int i10 = this.f9171f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e0 e0Var = (e0) this.f9172g;
                    ub.a.f(obj);
                    return e0Var;
                }
                ub.a.f(obj);
                e0 e0Var2 = (e0) this.f9172g;
                e0 e0Var3 = (e0) this.f9173h;
                this.f9172g = e0Var3;
                this.f9171f = 1;
                ((hf.r1) e0Var2.f9089b.f4204e).g(null);
                ub.a0 a0Var = ub.a0.f21526a;
                zb.a aVar = zb.a.f26667a;
                return a0Var == aVar ? aVar : e0Var3;
            default:
                int i11 = this.f9171f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    m0.v vVar = (m0.v) ((m0.w) this.f9172g).f13782b;
                    ?? r0 = (ac.i) this.f9173h;
                    this.f9171f = 1;
                    Object objQ = r0.q(vVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objQ == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(m0.w wVar, ic.n nVar, yb.c cVar) {
        super(3, cVar);
        this.f9172g = wVar;
        this.f9173h = (ac.i) nVar;
    }
}
