package cb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f3841h;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f3841h = runnable;
    }

    @Override // cb.p
    public final String i() {
        return "task=[" + this.f3841h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3841h.run();
        } catch (Throwable th2) {
            l(th2);
            throw th2;
        }
    }
}
