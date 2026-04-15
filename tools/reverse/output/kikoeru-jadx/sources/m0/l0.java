package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f13222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13223f;

    public /* synthetic */ l0(long j10, long j11, boolean z10, f1.f fVar, int i10, int i11) {
        this.f13218a = i11;
        this.f13219b = j10;
        this.f13220c = j11;
        this.f13221d = z10;
        this.f13222e = fVar;
        this.f13223f = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13218a) {
            case 0:
                ((Integer) obj2).getClass();
                r0.e(this.f13219b, this.f13220c, this.f13221d, this.f13222e, (x0.o) obj, x0.v.D(this.f13223f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                y7.b(this.f13219b, this.f13220c, this.f13221d, this.f13222e, (x0.o) obj, x0.v.D(this.f13223f | 1));
                break;
        }
        return ub.a0.f21526a;
    }
}
