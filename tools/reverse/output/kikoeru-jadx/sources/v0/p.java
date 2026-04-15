package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.q f22310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f22312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j1.q qVar, long j10, float f10, long j11, int i10, int i11) {
        super(2);
        this.f22310b = qVar;
        this.f22311c = j10;
        this.f22312d = f10;
        this.f22313e = j11;
        this.f22314f = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(1);
        w.a(this.f22310b, this.f22311c, this.f22312d, this.f22313e, this.f22314f, (x0.o) obj, iD);
        return ub.a0.f21526a;
    }
}
