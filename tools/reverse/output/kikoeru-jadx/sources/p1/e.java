package p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16495a;

    public /* synthetic */ e(long j10) {
        this.f16495a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float c(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean e(long j10) {
        return (j10 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j10 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j10 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + n7.e.I(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + n7.e.I(Float.intBitsToFloat((int) (j10 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16495a == ((e) obj).f16495a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16495a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return f(this.f16495a);
    }
}
