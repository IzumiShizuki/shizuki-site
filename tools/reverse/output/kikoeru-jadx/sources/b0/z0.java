package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f1415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f1416b = new w1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c7.e1 f1417c;

    public z0(ic.k kVar) {
        this.f1415a = kVar;
    }

    public final y0 a(int i10, long j10) {
        c7.e1 e1Var = this.f1417c;
        if (e1Var == null) {
            return h.f1257a;
        }
        v1 v1Var = new v1(e1Var, i10, j10, this.f1416b);
        ((x1) e1Var.f3620d).b(v1Var);
        return v1Var;
    }
}
