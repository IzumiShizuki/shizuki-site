package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g1 implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f8572e;

    public o(k1 k1Var) {
        this.f8572e = k1Var;
    }

    @Override // hf.n
    public final boolean c(Throwable th2) {
        return j().E(th2);
    }

    @Override // hf.g1
    public final boolean k() {
        return true;
    }

    @Override // hf.g1
    public final void l(Throwable th2) {
        this.f8572e.w(j());
    }
}
