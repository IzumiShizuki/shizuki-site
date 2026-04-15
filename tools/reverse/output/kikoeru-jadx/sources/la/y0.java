package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9.c f12152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12153c;

    public /* synthetic */ y0(r9.c cVar, int i10, int i11) {
        this.f12151a = i11;
        this.f12152b = cVar;
        this.f12153c = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f12151a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                l.m(this.f12152b, oVar, x0.v.D(this.f12153c | 1));
                break;
            case 1:
                n9.b.a(this.f12152b, oVar, x0.v.D(this.f12153c | 1));
                break;
            case 2:
                nh.a.b(this.f12152b, oVar, x0.v.D(this.f12153c | 1));
                break;
            default:
                nh.a.c(this.f12152b, oVar, x0.v.D(this.f12153c | 1));
                break;
        }
        return ub.a0.f21526a;
    }
}
