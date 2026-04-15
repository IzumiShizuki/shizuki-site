package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f22327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f22328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f10, j1.q qVar, long j10, long j11, int i10) {
        super(2);
        this.f22327b = f10;
        this.f22328c = qVar;
        this.f22329d = j10;
        this.f22330e = j11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(49);
        w.b(this.f22327b, this.f22328c, this.f22329d, this.f22330e, (x0.o) obj, iD);
        return ub.a0.f21526a;
    }
}
