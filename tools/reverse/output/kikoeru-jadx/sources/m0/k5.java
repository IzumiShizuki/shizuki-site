package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13193a = q1.q.f17575h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k5) {
            return q1.q.c(this.f13193a, ((k5) obj).f13193a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13193a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) q1.q.i(this.f13193a)) + ", rippleAlpha=null)";
    }
}
