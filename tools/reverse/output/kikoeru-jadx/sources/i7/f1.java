package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f9096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f9095e = i10;
        this.f9096f = g1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f9095e) {
            case 0:
                return new f1(this.f9096f, cVar, 0);
            default:
                return new f1(this.f9096f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        lf.g gVar = (lf.g) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f9095e) {
            case 0:
                f1 f1Var = (f1) o(gVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                f1Var.u(a0Var);
                return a0Var;
            default:
                f1 f1Var2 = (f1) o(gVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                f1Var2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f9095e) {
            case 0:
                ub.a.f(obj);
                this.f9096f.f9127h.e(new Integer(0));
                break;
            default:
                ub.a.f(obj);
                this.f9096f.f9126g.e(new Integer(0));
                break;
        }
        return ub.a0.f21526a;
    }
}
