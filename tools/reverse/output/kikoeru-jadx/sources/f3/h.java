package f3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6659a;

    public static final float a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6659a == ((h) obj).f6659a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6659a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        long j10 = this.f6659a;
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.b(b(j10))) + " x " + ((Object) f.b(a(j10)));
    }
}
