package q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17566b = h0.i(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17567c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17568a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f17568a == ((p0) obj).f17568a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f17568a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return d(this.f17568a);
    }
}
