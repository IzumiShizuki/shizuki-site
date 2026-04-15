package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f1203g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f1201e = i10;
        this.f1203g = c1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f1201e) {
            case 0:
                return new b1(this.f1203g, cVar, 0);
            default:
                return new b1(this.f1203g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f1201e) {
        }
        return ((b1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f1201e) {
            case 0:
                int i10 = this.f1202f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    r.k kVar = (r.k) this.f1203g.f1208b;
                    Float f10 = new Float(0.0f);
                    r.z0 z0VarQ = r.d.q(1, new Float(0.5f));
                    this.f1202f = 1;
                    Object objI = r.d.i(kVar, f10, z0VarQ, true, null, this, 8);
                    zb.a aVar = zb.a.f26667a;
                    if (objI == aVar) {
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
                int i11 = this.f1202f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    r.k kVar2 = (r.k) this.f1203g.f1208b;
                    Float f11 = new Float(0.0f);
                    r.z0 z0VarQ2 = r.d.q(1, new Float(0.5f));
                    this.f1202f = 1;
                    Object objI2 = r.d.i(kVar2, f11, z0VarQ2, true, null, this, 8);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objI2 == aVar2) {
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
