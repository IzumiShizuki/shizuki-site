package f3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p[] f6671b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6672c = lc.b.H(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6673a;

    public /* synthetic */ o(long j10) {
        this.f6673a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f6671b[(int) ((j10 & 1095216660480L) >>> 32)].f6674a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int d(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static String e(long j10) {
        long jB = b(j10);
        if (p.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p.a(jB, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (!p.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6673a == ((o) obj).f6673a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f6673a);
    }

    public final String toString() {
        return e(this.f6673a);
    }
}
