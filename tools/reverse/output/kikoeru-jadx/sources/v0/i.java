package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.b f22235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f22237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v1.b bVar, String str, j1.q qVar, long j10, int i10) {
        super(2);
        this.f22235b = bVar;
        this.f22236c = str;
        this.f22237d = qVar;
        this.f22238e = j10;
        this.f22239f = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j.a(this.f22235b, this.f22236c, this.f22237d, this.f22238e, (x0.o) obj, x0.v.D(this.f22239f | 1));
        return ub.a0.f21526a;
    }
}
