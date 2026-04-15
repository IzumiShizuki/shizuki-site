package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements x0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f7715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f7716c;

    public /* synthetic */ j1(x0.w0 w0Var, w.k kVar, int i10) {
        this.f7714a = i10;
        this.f7715b = w0Var;
        this.f7716c = kVar;
    }

    @Override // x0.e0
    public final void a() {
        switch (this.f7714a) {
            case 0:
                x0.w0 w0Var = this.f7715b;
                w.m mVar = (w.m) w0Var.getValue();
                if (mVar != null) {
                    w.l lVar = new w.l(mVar);
                    w.k kVar = this.f7716c;
                    if (kVar != null) {
                        kVar.b(lVar);
                    }
                    w0Var.setValue(null);
                }
                break;
            case 1:
                x0.w0 w0Var2 = this.f7715b;
                w.m mVar2 = (w.m) w0Var2.getValue();
                if (mVar2 != null) {
                    this.f7716c.b(new w.l(mVar2));
                    w0Var2.setValue(null);
                }
                break;
            default:
                x0.w0 w0Var3 = this.f7715b;
                w.m mVar3 = (w.m) w0Var3.getValue();
                if (mVar3 != null) {
                    this.f7716c.b(new w.l(mVar3));
                    w0Var3.setValue(null);
                }
                break;
        }
    }
}
