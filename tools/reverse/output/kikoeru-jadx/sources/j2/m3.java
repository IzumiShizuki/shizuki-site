package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o3 f9916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(o3 o3Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f9914e = i10;
        this.f9916g = o3Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f9914e) {
            case 0:
                return new m3(this.f9916g, cVar, 0);
            default:
                return new m3(this.f9916g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f9914e) {
        }
        return ((m3) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f9914e) {
            case 0:
                int i10 = this.f9915f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                v vVar = this.f9916g.f9944a;
                this.f9915f = 1;
                Object objL = vVar.f10045s.l(this);
                zb.a aVar = zb.a.f26667a;
                if (objL != aVar) {
                    objL = a0Var;
                }
                return objL == aVar ? aVar : a0Var;
            default:
                int i11 = this.f9915f;
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                v vVar2 = this.f9916g.f9944a;
                this.f9915f = 1;
                Object objA = vVar2.f10047t.a(this);
                zb.a aVar2 = zb.a.f26667a;
                if (objA != aVar2) {
                    objA = a0Var2;
                }
                return objA == aVar2 ? aVar2 : a0Var2;
        }
    }
}
