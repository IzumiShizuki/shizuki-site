package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f22618b;

    public /* synthetic */ q(v vVar, int i10) {
        this.f22617a = i10;
        this.f22618b = vVar;
    }

    @Override // p4.k
    public void a(Object obj) {
        m4.w0 w0Var = (m4.w0) obj;
        switch (this.f22617a) {
            case 1:
                w0Var.y(this.f22618b.J);
                break;
            default:
                w0Var.f(this.f22618b.L);
                break;
        }
    }
}
