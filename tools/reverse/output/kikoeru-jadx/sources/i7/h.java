package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements lf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f9131b;

    public /* synthetic */ h(n nVar, int i10) {
        this.f9130a = i10;
        this.f9131b = nVar;
    }

    @Override // lf.f
    public final Object b(lf.g gVar, yb.c cVar) throws Throwable {
        switch (this.f9130a) {
            case 0:
                Object objB = this.f9131b.b(new g(gVar, 0), cVar);
                if (objB != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objB2 = this.f9131b.b(new g(gVar, 4), cVar);
                if (objB2 != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objB3 = this.f9131b.b(new g(gVar, 5), cVar);
                if (objB3 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
