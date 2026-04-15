package e4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6115b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f6114a = 0L;
            this.f6115b = 1L;
        } else {
            this.f6114a = j10;
            this.f6115b = j11;
        }
    }

    public final String toString() {
        return this.f6114a + "/" + this.f6115b;
    }
}
