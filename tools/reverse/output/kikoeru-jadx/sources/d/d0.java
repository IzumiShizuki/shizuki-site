package d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f5191b;

    public /* synthetic */ d0(j0 j0Var, int i10) {
        this.f5190a = i10;
        this.f5191b = j0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5190a) {
            case 0:
                this.f5191b.c();
                break;
            case 1:
                this.f5191b.b();
                break;
            default:
                this.f5191b.c();
                break;
        }
        return ub.a0.f21526a;
    }
}
