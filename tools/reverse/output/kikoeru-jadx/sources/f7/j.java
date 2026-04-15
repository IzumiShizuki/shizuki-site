package f7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends e7.v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f6765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.f f6766g;

    public j(i iVar, String str, f1.f fVar) {
        super(iVar, str);
        this.f6765f = iVar;
        this.f6766g = fVar;
    }

    @Override // e7.v
    public final e7.u a() {
        return (h) super.a();
    }

    @Override // e7.v
    public final e7.u b() {
        return new h(this.f6765f, this.f6766g);
    }
}
