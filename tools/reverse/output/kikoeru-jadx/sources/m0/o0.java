package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f13372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13373c;

    public /* synthetic */ o0(int i10, int i11, g2.g1 g1Var) {
        this.f13371a = i11;
        this.f13372b = g1Var;
        this.f13373c = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g2.f1 f1Var = (g2.f1) obj;
        switch (this.f13371a) {
            case 0:
                g2.f1.k(f1Var, this.f13372b, 0, this.f13373c);
                break;
            default:
                g2.f1.k(f1Var, this.f13372b, 0, this.f13373c);
                break;
        }
        return ub.a0.f21526a;
    }
}
