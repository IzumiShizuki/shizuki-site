package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f8546i;

    public h1(yb.c cVar, k1 k1Var) {
        super(1, cVar);
        this.f8546i = k1Var;
    }

    @Override // hf.k
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // hf.k
    public final Throwable p(k1 k1Var) {
        Throwable thC;
        k1 k1Var2 = this.f8546i;
        k1Var2.getClass();
        Object obj = k1.f8563a.get(k1Var2);
        return (!(obj instanceof j1) || (thC = ((j1) obj).c()) == null) ? obj instanceof s ? ((s) obj).f8586a : k1Var.u() : thC;
    }
}
