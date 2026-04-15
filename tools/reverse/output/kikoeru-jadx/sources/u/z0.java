package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21150c;

    public z0(long j10, long j11, boolean z10) {
        this.f21148a = j10;
        this.f21149b = j11;
        this.f21150c = z10;
    }

    public final z0 a(z0 z0Var) {
        return new z0(p1.b.i(this.f21148a, z0Var.f21148a), Math.max(this.f21149b, z0Var.f21149b), this.f21150c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return p1.b.c(this.f21148a, z0Var.f21148a) && this.f21149b == z0Var.f21149b && this.f21150c == z0Var.f21150c;
    }

    public final int hashCode() {
        int iG = p1.b.g(this.f21148a) * 31;
        long j10 = this.f21149b;
        return ((iG + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f21150c ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) p1.b.k(this.f21148a)) + ", timeMillis=" + this.f21149b + ", shouldApplyImmediately=" + this.f21150c + ')';
    }
}
