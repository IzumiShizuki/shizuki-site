package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends nf.q implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8611e;

    public x1(long j10, ac.c cVar) {
        super(cVar, cVar.s());
        this.f8611e = j10;
    }

    @Override // hf.k1
    public final String Z() {
        return super.Z() + "(timeMillis=" + this.f8611e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.p(this.f8507c);
        w(new w1("Timed out waiting for " + this.f8611e + " ms", this));
    }
}
