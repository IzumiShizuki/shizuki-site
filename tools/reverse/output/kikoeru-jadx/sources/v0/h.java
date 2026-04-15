package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.f f22223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f22225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22228g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w1.f fVar, String str, j1.q qVar, long j10, int i10, int i11) {
        super(2);
        this.f22223b = fVar;
        this.f22224c = str;
        this.f22225d = qVar;
        this.f22226e = j10;
        this.f22227f = i10;
        this.f22228g = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j.b(this.f22223b, this.f22224c, this.f22225d, this.f22226e, (x0.o) obj, x0.v.D(this.f22227f | 1), this.f22228g);
        return ub.a0.f21526a;
    }
}
