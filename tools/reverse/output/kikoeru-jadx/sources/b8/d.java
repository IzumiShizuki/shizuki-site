package b8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2241b;

    public d(e eVar, Throwable th2) {
        super(th2);
        this.f2240a = eVar;
        this.f2241b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2241b;
    }
}
