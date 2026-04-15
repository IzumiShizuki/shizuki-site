package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13798h;

    public w1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f13791a = j10;
        this.f13792b = j11;
        this.f13793c = j12;
        this.f13794d = j13;
        this.f13795e = j14;
        this.f13796f = j15;
        this.f13797g = j16;
        this.f13798h = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1.class != obj.getClass()) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return q1.q.c(this.f13791a, w1Var.f13791a) && q1.q.c(this.f13792b, w1Var.f13792b) && q1.q.c(this.f13793c, w1Var.f13793c) && q1.q.c(this.f13794d, w1Var.f13794d) && q1.q.c(this.f13795e, w1Var.f13795e) && q1.q.c(this.f13796f, w1Var.f13796f) && q1.q.c(this.f13797g, w1Var.f13797g) && q1.q.c(this.f13798h, w1Var.f13798h);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13798h) + q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(ub.v.a(this.f13791a) * 31, 31, this.f13792b), 31, this.f13793c), 31, this.f13794d), 31, this.f13795e), 31, this.f13796f), 31, this.f13797g);
    }
}
