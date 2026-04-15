package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f8577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f8578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, long j10, k kVar) {
        super(j10);
        this.f8578d = u0Var;
        this.f8577c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws h0 {
        this.f8577c.E(this.f8578d);
    }

    @Override // hf.s0
    public final String toString() {
        return super.toString() + this.f8577c;
    }
}
