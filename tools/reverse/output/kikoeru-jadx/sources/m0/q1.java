package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13489f;

    public q1(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f13484a = j10;
        this.f13485b = j11;
        this.f13486c = j12;
        this.f13487d = j13;
        this.f13488e = j14;
        this.f13489f = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return q1.q.c(this.f13484a, q1Var.f13484a) && q1.q.c(this.f13485b, q1Var.f13485b) && q1.q.c(this.f13486c, q1Var.f13486c) && q1.q.c(this.f13487d, q1Var.f13487d) && q1.q.c(this.f13488e, q1Var.f13488e) && q1.q.c(this.f13489f, q1Var.f13489f);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13489f) + q.t0.y(q.t0.y(q.t0.y(q.t0.y(ub.v.a(this.f13484a) * 31, 31, this.f13485b), 31, this.f13486c), 31, this.f13487d), 31, this.f13488e);
    }
}
