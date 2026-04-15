package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9165f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, Object obj, yb.c cVar) {
        super(1, cVar);
        this.f9164e = i10;
        this.f9165f = obj;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f9164e) {
            case 0:
                return new i1(0, (ic.a) this.f9165f, cVar).u(ub.a0.f21526a);
            default:
                i1 i1Var = new i1(1, (r.c) this.f9165f, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                i1Var.u(a0Var);
                return a0Var;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f9164e;
        Object obj2 = this.f9165f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                return ((ic.a) obj2).b();
            default:
                ub.a.f(obj);
                r.c.b((r.c) obj2);
                return ub.a0.f21526a;
        }
    }
}
