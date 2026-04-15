package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f13993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3.i f13994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13995d;

    public z3(float f10, t2.l0 l0Var, e3.i iVar, ic.n nVar) {
        this.f13992a = f10;
        this.f13993b = l0Var;
        this.f13994c = iVar;
        this.f13995d = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.v.a(h1.f13043a.a(Float.valueOf(this.f13992a)), f1.g.f(-925826178, new f(this.f13993b, this.f13994c, this.f13995d, 2), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
