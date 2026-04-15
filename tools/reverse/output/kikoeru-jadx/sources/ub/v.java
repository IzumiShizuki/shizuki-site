package ub;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21560a;

    public /* synthetic */ v(long j10) {
        this.f21560a = j10;
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jc.l.h(this.f21560a ^ Long.MIN_VALUE, ((v) obj).f21560a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f21560a == ((v) obj).f21560a;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.f21560a);
    }

    public final String toString() {
        return a.h(10, this.f21560a);
    }
}
