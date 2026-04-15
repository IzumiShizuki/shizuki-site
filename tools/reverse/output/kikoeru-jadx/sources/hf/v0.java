package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8600f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vb.j f8603e;

    @Override // hf.u
    public final u h0(int i10) {
        nf.b.a(i10);
        return this;
    }

    public final void i0(boolean z10) {
        long j10 = this.f8601c - (z10 ? 4294967296L : 1L);
        this.f8601c = j10;
        if (j10 <= 0 && this.f8602d) {
            shutdown();
        }
    }

    public final void j0(j0 j0Var) {
        vb.j jVar = this.f8603e;
        if (jVar == null) {
            jVar = new vb.j();
            this.f8603e = jVar;
        }
        jVar.addLast(j0Var);
    }

    public abstract Thread k0();

    public final void l0(boolean z10) {
        this.f8601c = (z10 ? 4294967296L : 1L) + this.f8601c;
        if (z10) {
            return;
        }
        this.f8602d = true;
    }

    public abstract long m0();

    public final boolean n0() {
        vb.j jVar = this.f8603e;
        if (jVar == null) {
            return false;
        }
        j0 j0Var = (j0) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (j0Var == null) {
            return false;
        }
        j0Var.run();
        return true;
    }

    public void o0(long j10, s0 s0Var) {
        b0.f8520j.t0(j10, s0Var);
    }

    public abstract void shutdown();
}
