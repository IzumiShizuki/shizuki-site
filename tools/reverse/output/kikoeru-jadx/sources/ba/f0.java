package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2354f;

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2349a = i11;
        this.f2351c = obj;
        this.f2352d = obj2;
        this.f2353e = obj3;
        this.f2354f = obj4;
        this.f2350b = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2349a) {
            case 0:
                ((Integer) obj2).getClass();
                j0.a((y.d1) this.f2351c, (k0) this.f2352d, (j1.q) this.f2353e, (j1.q) this.f2354f, (x0.o) obj, x0.v.D(this.f2350b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((f1.f) this.f2351c).i((a0.d) this.f2352d, (Integer) this.f2353e, this.f2354f, (x0.o) obj, x0.v.D(this.f2350b) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                q9.w.d((x0.w0) this.f2351c, (bg.p) this.f2352d, (ic.k) this.f2353e, (ic.k) this.f2354f, (x0.o) obj, x0.v.D(this.f2350b | 1));
                break;
        }
        return ub.a0.f21526a;
    }
}
