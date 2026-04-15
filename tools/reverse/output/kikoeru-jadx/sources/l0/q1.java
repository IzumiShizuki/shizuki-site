package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11601b;

    public q1(long j10, long j11) {
        this.f11600a = j10;
        this.f11601b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return q1.q.c(this.f11600a, q1Var.f11600a) && q1.q.c(this.f11601b, q1Var.f11601b);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f11601b) + (ub.v.a(this.f11600a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        q.t0.K(this.f11600a, ", selectionBackgroundColor=", sb);
        sb.append((Object) q1.q.i(this.f11601b));
        sb.append(')');
        return sb.toString();
    }
}
