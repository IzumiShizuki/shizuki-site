package t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20093b;

    public /* synthetic */ b(j jVar, int i10) {
        this.f20092a = i10;
        this.f20093b = jVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f20092a) {
            case 0:
                j jVar = this.f20093b;
                return Float.valueOf(jVar.a() / jVar.f20129g.e() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.f20093b.f20128f.e() * 0.5f);
        }
    }
}
