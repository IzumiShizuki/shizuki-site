package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f20356b = c0.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20357c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20358a;

    public /* synthetic */ k0(long j10) {
        this.f20358a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean b(long j10) {
        return ((int) (j10 >> 32)) == ((int) (j10 & 4294967295L));
    }

    public static final int c(long j10) {
        return d(j10) - e(j10);
    }

    public static final int d(long j10) {
        return Math.max((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final int e(long j10) {
        return Math.min((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final boolean f(long j10) {
        return ((int) (j10 >> 32)) > ((int) (j10 & 4294967295L));
    }

    public static String g(long j10) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return j2.h0.m(sb, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k0) {
            return this.f20358a == ((k0) obj).f20358a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f20358a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return g(this.f20358a);
    }
}
