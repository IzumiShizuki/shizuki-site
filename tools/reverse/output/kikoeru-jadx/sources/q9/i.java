package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f18017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f18018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(o oVar, r0 r0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f18016e = i10;
        this.f18017f = oVar;
        this.f18018g = r0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f18016e) {
            case 0:
                return new i(this.f18017f, this.f18018g, cVar, 0);
            default:
                return new i(this.f18017f, this.f18018g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f18016e) {
            case 0:
                i iVar = (i) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                iVar.u(a0Var);
                return a0Var;
            default:
                i iVar2 = (i) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                iVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f18016e;
        ub.a0 a0Var = ub.a0.f21526a;
        r0 r0Var = this.f18018g;
        o oVar = this.f18017f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                oVar.x(r0Var.w());
                break;
            default:
                ub.a.f(obj);
                if (!oVar.x(r0Var.w())) {
                    oVar.w(r0Var.w(), false);
                }
                break;
        }
        return a0Var;
    }
}
