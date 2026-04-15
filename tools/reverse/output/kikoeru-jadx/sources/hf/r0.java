package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f8584c;

    public r0(Runnable runnable, long j10) {
        super(j10);
        this.f8584c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8584c.run();
    }

    @Override // hf.s0
    public final String toString() {
        return super.toString() + this.f8584c;
    }
}
