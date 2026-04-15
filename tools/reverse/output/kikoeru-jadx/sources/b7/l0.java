package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements r0, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f1921b;

    public /* synthetic */ l0(t0 t0Var, int i10) {
        this.f1920a = i10;
        this.f1921b = t0Var;
    }

    @Override // p4.k
    public void a(Object obj) {
        m4.w0 w0Var = (m4.w0) obj;
        switch (this.f1920a) {
            case 1:
                w0Var.y(this.f1921b.f2090v);
                break;
            default:
                w0Var.y(this.f1921b.f2090v);
                break;
        }
    }

    @Override // b7.r0
    public void d(t tVar, int i10) {
        switch (this.f1920a) {
            case 0:
                tVar.W(this.f1921b.f2071c, i10);
                break;
            case 3:
                tVar.f(this.f1921b.f2071c, i10);
                break;
            default:
                tVar.v(this.f1921b.f2071c, i10);
                break;
        }
    }
}
