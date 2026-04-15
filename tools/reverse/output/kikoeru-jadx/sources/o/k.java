package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15994a;

    public static long a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f15994a == ((k) obj).f15994a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f15994a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j10 = this.f15994a;
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return j2.h0.m(sb, (int) (j10 & 4294967295L), ')');
    }
}
