package ub;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21558a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jc.l.g(this.f21558a ^ Integer.MIN_VALUE, ((t) obj).f21558a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f21558a == ((t) obj).f21558a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21558a;
    }

    public final String toString() {
        return String.valueOf(((long) this.f21558a) & 4294967295L);
    }
}
