package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f18042b;

    public /* synthetic */ m(r0 r0Var, int i10) {
        this.f18041a = i10;
        this.f18042b = r0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f18041a) {
            case 0:
                break;
            case 1:
                this.f18042b.f18088e.setValue(Boolean.TRUE);
                break;
            default:
                this.f18042b.f18087d.setValue(Boolean.TRUE);
                break;
        }
        return ub.a0.f21526a;
    }
}
