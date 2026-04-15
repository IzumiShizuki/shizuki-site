package v0;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f22162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f22163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22164j;

    public a0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f22155a = j10;
        this.f22156b = j11;
        this.f22157c = j12;
        this.f22158d = j13;
        this.f22159e = j14;
        this.f22160f = j15;
        this.f22161g = j16;
        this.f22162h = j17;
        this.f22163i = j18;
        this.f22164j = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return q1.q.c(this.f22155a, a0Var.f22155a) && q1.q.c(this.f22156b, a0Var.f22156b) && q1.q.c(this.f22157c, a0Var.f22157c) && q1.q.c(this.f22158d, a0Var.f22158d) && q1.q.c(this.f22159e, a0Var.f22159e) && q1.q.c(this.f22160f, a0Var.f22160f) && q1.q.c(this.f22161g, a0Var.f22161g) && q1.q.c(this.f22162h, a0Var.f22162h) && q1.q.c(this.f22163i, a0Var.f22163i) && q1.q.c(this.f22164j, a0Var.f22164j);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f22164j) + t0.y(t0.y(t0.y(t0.y(t0.y(t0.y(t0.y(t0.y(ub.v.a(this.f22155a) * 31, 31, this.f22156b), 31, this.f22157c), 31, this.f22158d), 31, this.f22159e), 31, this.f22160f), 31, this.f22161g), 31, this.f22162h), 31, this.f22163i);
    }
}
