package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17460c;

    public u0(float f10, float f11, long j10) {
        this.f17458a = f10;
        this.f17459b = f11;
        this.f17460c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Float.compare(this.f17458a, u0Var.f17458a) == 0 && Float.compare(this.f17459b, u0Var.f17459b) == 0 && this.f17460c == u0Var.f17460c;
    }

    public final int hashCode() {
        int iX = t0.x(this.f17459b, Float.floatToIntBits(this.f17458a) * 31, 31);
        long j10 = this.f17460c;
        return iX + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f17458a + ", distance=" + this.f17459b + ", duration=" + this.f17460c + ')';
    }
}
