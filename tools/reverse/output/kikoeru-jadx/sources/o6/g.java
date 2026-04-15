package o6;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16254b;

    public g(byte[] bArr, long j10) {
        this.f16253a = j10;
        this.f16254b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f16253a, ((g) obj).f16253a);
    }
}
