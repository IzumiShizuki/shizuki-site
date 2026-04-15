package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5708a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5710c;

    public /* synthetic */ j(c0.z zVar, int i10) {
        this.f5710c = zVar;
        this.f5709b = i10;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5708a) {
            case 0:
                m0.T((b) this.f5710c, this.f5709b, null);
                return ub.a0.f21526a;
            default:
                return Boolean.valueOf(((x0.b1) ((c0.z) this.f5710c).f3182c.f3159e).e() > this.f5709b);
        }
    }

    public /* synthetic */ j(m0 m0Var, b bVar, int i10) {
        this.f5710c = bVar;
        this.f5709b = i10;
    }
}
