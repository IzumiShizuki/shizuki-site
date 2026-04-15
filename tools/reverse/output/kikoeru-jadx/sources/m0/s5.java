package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s5 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f13601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f13602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4 f13604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f13605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.o f13606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x5 f13607h;

    public s5(int i10, f1.f fVar, f1.f fVar2, ic.n nVar, s4 s4Var, f1.f fVar3, ic.o oVar, x5 x5Var) {
        this.f13600a = i10;
        this.f13601b = fVar;
        this.f13602c = fVar2;
        this.f13603d = nVar;
        this.f13604e = s4Var;
        this.f13605f = fVar3;
        this.f13606g = oVar;
        this.f13607h = x5Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            v5.c(this.f13600a, this.f13601b, this.f13602c, f1.g.f(545329543, new ee.b(6, this.f13606g, this.f13607h), oVar), this.f13603d, this.f13604e, this.f13605f, oVar, 24576);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
