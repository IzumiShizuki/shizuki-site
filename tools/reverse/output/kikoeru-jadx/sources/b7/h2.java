package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f1811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3 f1812c;

    public /* synthetic */ h2(o2 o2Var, z3 z3Var, int i10) {
        this.f1810a = i10;
        this.f1811b = o2Var;
        this.f1812c = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1810a) {
            case 0:
                this.f1811b.f2012k.d0(this.f1812c.d());
                break;
            default:
                o2 o2Var = this.f1811b;
                c7.e1 e1Var = o2Var.f2012k;
                z3 z3Var = this.f1812c;
                e1Var.d0(z3Var.d());
                o2Var.f2010i.s(z3Var.m().a(17) ? z3Var.J() : m4.i1.f14291a);
                break;
        }
    }
}
