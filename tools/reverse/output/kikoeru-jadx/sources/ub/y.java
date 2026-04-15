package ub;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f21563a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return jc.l.g(this.f21563a & 65535, ((y) obj).f21563a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f21563a == ((y) obj).f21563a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21563a;
    }

    public final String toString() {
        return String.valueOf(this.f21563a & 65535);
    }
}
