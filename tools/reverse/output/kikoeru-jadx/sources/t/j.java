package t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20086a;

    public j(long j10) {
        this.f20086a = j10;
        if ((j10 & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        x.a.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return p1.b.c(this.f20086a, ((j) obj).f20086a);
    }

    public final int hashCode() {
        return p1.b.g(this.f20086a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) p1.b.k(this.f20086a)) + ')';
    }
}
