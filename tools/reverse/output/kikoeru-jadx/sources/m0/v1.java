package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f13731j;

    public v1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f13722a = j10;
        this.f13723b = j11;
        this.f13724c = j12;
        this.f13725d = j13;
        this.f13726e = j14;
        this.f13727f = j15;
        this.f13728g = j16;
        this.f13729h = j17;
        this.f13730i = j18;
        this.f13731j = j19;
    }

    public final x0.w0 a(boolean z10, boolean z11, x0.o oVar) {
        oVar.W(-1491563694);
        x0.w0 w0VarY = x0.v.y(new q1.q(z10 ? z11 ? this.f13728g : this.f13729h : z11 ? this.f13730i : this.f13731j), oVar);
        oVar.p(false);
        return w0VarY;
    }

    public final x0.w0 b(boolean z10, boolean z11, x0.o oVar) {
        oVar.W(1575395620);
        x0.w0 w0VarY = x0.v.y(new q1.q(z10 ? z11 ? this.f13724c : this.f13725d : z11 ? this.f13726e : this.f13727f), oVar);
        oVar.p(false);
        return w0VarY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return q1.q.c(this.f13722a, v1Var.f13722a) && q1.q.c(this.f13723b, v1Var.f13723b) && q1.q.c(this.f13724c, v1Var.f13724c) && q1.q.c(this.f13725d, v1Var.f13725d) && q1.q.c(this.f13726e, v1Var.f13726e) && q1.q.c(this.f13727f, v1Var.f13727f) && q1.q.c(this.f13728g, v1Var.f13728g) && q1.q.c(this.f13729h, v1Var.f13729h) && q1.q.c(this.f13730i, v1Var.f13730i) && q1.q.c(this.f13731j, v1Var.f13731j);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13731j) + q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(q.t0.y(ub.v.a(this.f13722a) * 31, 31, this.f13723b), 31, this.f13724c), 31, this.f13725d), 31, this.f13726e), 31, this.f13727f), 31, this.f13728g), 31, this.f13729h), 31, this.f13730i);
    }
}
