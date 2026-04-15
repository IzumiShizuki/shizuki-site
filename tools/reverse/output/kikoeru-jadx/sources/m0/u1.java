package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13689c;

    public u1(long j10, long j11, long j12) {
        this.f13687a = j10;
        this.f13688b = j11;
        this.f13689c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return q1.q.c(this.f13687a, u1Var.f13687a) && q1.q.c(this.f13688b, u1Var.f13688b) && q1.q.c(this.f13689c, u1Var.f13689c);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13689c) + q.t0.y(ub.v.a(this.f13687a) * 31, 31, this.f13688b);
    }
}
