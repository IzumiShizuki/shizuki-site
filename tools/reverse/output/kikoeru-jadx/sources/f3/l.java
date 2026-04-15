package f3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6666a;

    public static boolean a(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).f6666a;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static String c(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.f6666a, obj);
    }

    public final int hashCode() {
        long j10 = this.f6666a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return c(this.f6666a);
    }
}
