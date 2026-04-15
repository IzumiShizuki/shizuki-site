package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5786c;

    public /* synthetic */ r(Object obj, long j10, int i10) {
        this.f5784a = i10;
        this.f5785b = obj;
        this.f5786c = j10;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5784a) {
            case 0:
                hf.a0.y((hf.y) this.f5785b, null, null, new y(this.f5786c, null, 1), 3);
                return ub.a0.f21526a;
            case 1:
                hf.a0.y((hf.y) this.f5785b, null, null, new y(this.f5786c, null, 2), 3);
                return ub.a0.f21526a;
            default:
                return ((q1.j0) ((q1.m) this.f5785b)).b(this.f5786c);
        }
    }
}
