package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f10376b;

    public /* synthetic */ o0(t0 t0Var, int i10) {
        this.f10375a = i10;
        this.f10376b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10375a) {
            case 0:
                this.f10376b.J = true;
                break;
            case 1:
                this.f10376b.A();
                break;
            default:
                t0 t0Var = this.f10376b;
                if (!t0Var.P) {
                    a0 a0Var = t0Var.f10436s;
                    a0Var.getClass();
                    a0Var.c(t0Var);
                }
                break;
        }
    }
}
