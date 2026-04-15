package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f2218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f2219c;

    public /* synthetic */ z(f0 f0Var, d0 d0Var, int i10) {
        this.f2217a = i10;
        this.f2218b = f0Var;
        this.f2219c = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2217a) {
            case 0:
                f0 f0Var = this.f2218b;
                d0 d0Var = this.f2219c;
                f0Var.f1770i = d0Var;
                if (f0Var.f1771j) {
                    f0Var.k(d0Var);
                }
                f0Var.a(new z(f0Var, d0Var, 1), new e0(0, f0Var));
                break;
            default:
                f0 f0Var2 = this.f2218b;
                d0 d0Var2 = this.f2219c;
                if (f0Var2.f3872a instanceof cb.a) {
                    d0Var2.d();
                }
                break;
        }
    }
}
