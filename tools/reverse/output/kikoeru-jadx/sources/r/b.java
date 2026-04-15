package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f18325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, yb.c cVar2) {
        super(1, cVar2);
        this.f18325e = cVar;
        this.f18326f = obj;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        b bVar = new b(this.f18325e, this.f18326f, (yb.c) obj);
        ub.a0 a0Var = ub.a0.f21526a;
        bVar.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        c cVar = this.f18325e;
        c.b(cVar);
        Object objA = c.a(cVar, this.f18326f);
        cVar.f18333c.f18468b.setValue(objA);
        cVar.f18335e.setValue(objA);
        return ub.a0.f21526a;
    }
}
