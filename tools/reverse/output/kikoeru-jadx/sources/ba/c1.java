package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements lf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf.f f2319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f2320c;

    public /* synthetic */ c1(lf.f fVar, f1 f1Var, int i10) {
        this.f2318a = i10;
        this.f2319b = fVar;
        this.f2320c = f1Var;
    }

    @Override // lf.f
    public final Object b(lf.g gVar, yb.c cVar) {
        switch (this.f2318a) {
            case 0:
                Object objB = this.f2319b.b(new b1(gVar, this.f2320c, 0), cVar);
                if (objB != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objB2 = this.f2319b.b(new b1(gVar, this.f2320c, 1), cVar);
                if (objB2 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
