package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f8545a;

    public h0(Throwable th2, u uVar, yb.h hVar) {
        super("Coroutine dispatcher " + uVar + " threw an exception, context = " + hVar, th2);
        this.f8545a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f8545a;
    }
}
