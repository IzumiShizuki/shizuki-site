package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.h0 f11511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f11513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11514d;

    public j0(h0.h0 h0Var, long j10, i0 i0Var, boolean z10) {
        this.f11511a = h0Var;
        this.f11512b = j10;
        this.f11513c = i0Var;
        this.f11514d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f11511a == j0Var.f11511a && p1.b.c(this.f11512b, j0Var.f11512b) && this.f11513c == j0Var.f11513c && this.f11514d == j0Var.f11514d;
    }

    public final int hashCode() {
        return ((this.f11513c.hashCode() + ((p1.b.g(this.f11512b) + (this.f11511a.hashCode() * 31)) * 31)) * 31) + (this.f11514d ? 1231 : 1237);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f11511a + ", position=" + ((Object) p1.b.k(this.f11512b)) + ", anchor=" + this.f11513c + ", visible=" + this.f11514d + ')';
    }
}
