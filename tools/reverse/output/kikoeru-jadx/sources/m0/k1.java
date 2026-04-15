package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13173d;

    public k1(long j10, long j11, long j12, long j13) {
        this.f13170a = j10;
        this.f13171b = j11;
        this.f13172c = j12;
        this.f13173d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return q1.q.c(this.f13170a, k1Var.f13170a) && q1.q.c(this.f13171b, k1Var.f13171b) && q1.q.c(this.f13172c, k1Var.f13172c) && q1.q.c(this.f13173d, k1Var.f13173d);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13173d) + q.t0.y(q.t0.y(ub.v.a(this.f13170a) * 31, 31, this.f13171b), 31, this.f13172c);
    }
}
