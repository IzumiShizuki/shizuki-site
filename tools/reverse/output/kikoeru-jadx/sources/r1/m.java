package r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f18697b;

    public /* synthetic */ m(q qVar, int i10) {
        this.f18696a = i10;
        this.f18697b = qVar;
    }

    @Override // r1.i
    public final double c(double d10) {
        switch (this.f18696a) {
            case 0:
                return nh.b.i(this.f18697b.f18712k.c(d10), r10.f18706e, r10.f18707f);
            default:
                return this.f18697b.f18715n.c(nh.b.i(d10, r0.f18706e, r0.f18707f));
        }
    }
}
