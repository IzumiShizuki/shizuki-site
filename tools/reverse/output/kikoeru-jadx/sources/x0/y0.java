package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24524a;

    public y0(String str) {
        this.f24524a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && jc.l.a(this.f24524a, ((y0) obj).f24524a);
    }

    public final int hashCode() {
        return this.f24524a.hashCode();
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("OpaqueKey(key="), this.f24524a, ')');
    }
}
