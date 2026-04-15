package ub;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f21556a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return jc.l.g(this.f21556a & 255, ((r) obj).f21556a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f21556a == ((r) obj).f21556a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21556a;
    }

    public final String toString() {
        return String.valueOf(this.f21556a & 255);
    }
}
