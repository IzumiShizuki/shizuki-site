package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f22319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j10, ic.a aVar, long j11) {
        super(1);
        this.f22318b = j10;
        this.f22319c = aVar;
        this.f22320d = j11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        s1.d dVar = (s1.d) obj;
        float fB = p1.e.b(dVar.e());
        w.e(dVar, 1.0f, this.f22318b, fB);
        w.e(dVar, ((Number) this.f22319c.b()).floatValue(), this.f22320d, fB);
        return ub.a0.f21526a;
    }
}
