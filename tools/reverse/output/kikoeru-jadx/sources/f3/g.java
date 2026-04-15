package f3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6658a;

    public static String a(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j10 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6658a == ((g) obj).f6658a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6658a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return a(this.f6658a);
    }
}
