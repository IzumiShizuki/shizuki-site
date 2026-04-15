package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f2414d;

    public /* synthetic */ m0(x0.w0 w0Var, String str, ic.a aVar, int i10, int i11) {
        this.f2411a = i11;
        this.f2412b = w0Var;
        this.f2413c = str;
        this.f2414d = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f2411a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                z.d(this.f2412b, this.f2413c, this.f2414d, oVar, x0.v.D(7));
                break;
            case 1:
                z.d(this.f2412b, this.f2413c, this.f2414d, oVar, x0.v.D(7));
                break;
            case 2:
                q9.w.c(this.f2412b, this.f2413c, this.f2414d, oVar, x0.v.D(7));
                break;
            default:
                q9.w.c(this.f2412b, this.f2413c, this.f2414d, oVar, x0.v.D(7));
                break;
        }
        return ub.a0.f21526a;
    }
}
