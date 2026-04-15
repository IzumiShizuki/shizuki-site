package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2410f;

    public /* synthetic */ m(String str, Object obj, Object obj2, int i10, int i11, int i12) {
        this.f2405a = i12;
        this.f2406b = str;
        this.f2409e = obj;
        this.f2410f = obj2;
        this.f2407c = i10;
        this.f2408d = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2405a) {
            case 0:
                ((Integer) obj2).getClass();
                z.a(this.f2406b, (ic.a) this.f2409e, (ic.a) this.f2410f, (x0.o) obj, x0.v.D(this.f2407c | 1), this.f2408d);
                break;
            default:
                ((Integer) obj2).getClass();
                ka.b.k(this.f2406b, this.f2409e, (j1.q) this.f2410f, (x0.o) obj, x0.v.D(this.f2407c | 1), this.f2408d);
                break;
        }
        return ub.a0.f21526a;
    }
}
