package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f8548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1 f8549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f8550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8551h;

    public i1(k1 k1Var, j1 j1Var, o oVar, Object obj) {
        this.f8548e = k1Var;
        this.f8549f = j1Var;
        this.f8550g = oVar;
        this.f8551h = obj;
    }

    @Override // hf.g1
    public final boolean k() {
        return false;
    }

    @Override // hf.g1
    public final void l(Throwable th2) {
        o oVar = this.f8550g;
        o oVarA0 = k1.a0(oVar);
        k1 k1Var = this.f8548e;
        j1 j1Var = this.f8549f;
        Object obj = this.f8551h;
        if (oVarA0 == null || !k1Var.k0(j1Var, oVarA0, obj)) {
            j1Var.f8556a.e(new nf.i(2), 2);
            o oVarA02 = k1.a0(oVar);
            if (oVarA02 == null || !k1Var.k0(j1Var, oVarA02, obj)) {
                k1Var.l(k1Var.I(j1Var, obj));
            }
        }
    }
}
