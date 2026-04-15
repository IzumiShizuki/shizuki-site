package f3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6674a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, 0L) ? "Unspecified" : a(j10, 4294967296L) ? "Sp" : a(j10, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6674a == ((p) obj).f6674a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6674a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return b(this.f6674a);
    }
}
