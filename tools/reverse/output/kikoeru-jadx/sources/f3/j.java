package f3;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6660a;

    public /* synthetic */ j(long j10) {
        this.f6660a = j10;
    }

    public static long a(int i10, int i11, int i12, long j10) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j10 & 4294967295L);
        }
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final long c(long j10, long j11) {
        int i10 = ((int) (j10 >> 32)) - ((int) (j11 >> 32));
        return (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) i10) << 32);
    }

    public static final long d(long j10, long j11) {
        int i10 = ((int) (j10 >> 32)) + ((int) (j11 >> 32));
        return (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) i10) << 32);
    }

    public static String e(long j10) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j10 >> 32));
        sb.append(", ");
        return h0.m(sb, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6660a == ((j) obj).f6660a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6660a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return e(this.f6660a);
    }
}
