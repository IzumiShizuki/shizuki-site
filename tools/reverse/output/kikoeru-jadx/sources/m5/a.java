package m5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14651b;

    public a(long j10, long j11) {
        this.f14650a = j10;
        this.f14651b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14650a == aVar.f14650a && this.f14651b == aVar.f14651b;
    }

    public final int hashCode() {
        return (((int) this.f14650a) * 31) + ((int) this.f14651b);
    }
}
