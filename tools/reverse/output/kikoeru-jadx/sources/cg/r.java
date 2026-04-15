package cg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f4101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, boolean z10, boolean z11, yb.c cVar) {
        super(2, cVar);
        this.f4101e = vVar;
        this.f4102f = z10;
        this.f4103g = z11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new r(this.f4101e, this.f4102f, this.f4103g, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        r rVar = (r) o((hf.y) obj, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        rVar.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        this.f4101e.f4118g.setValue(new ub.k(Boolean.valueOf(this.f4102f), Boolean.valueOf(this.f4103g)));
        return ub.a0.f21526a;
    }
}
