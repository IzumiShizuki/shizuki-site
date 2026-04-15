package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.e1 f12705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f12706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f12707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f12708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f12709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f12710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f12711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.e1 f12712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f12713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0.e1 f12714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.e1 f12715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.e1 f12716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f12717m;

    public b1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10) {
        q1.q qVar = new q1.q(j10);
        x0.r0 r0Var = x0.r0.f24439f;
        this.f12705a = new x0.e1(qVar, r0Var);
        this.f12706b = new x0.e1(new q1.q(j11), r0Var);
        this.f12707c = new x0.e1(new q1.q(j12), r0Var);
        this.f12708d = new x0.e1(new q1.q(j13), r0Var);
        this.f12709e = new x0.e1(new q1.q(j14), r0Var);
        this.f12710f = new x0.e1(new q1.q(j15), r0Var);
        this.f12711g = new x0.e1(new q1.q(j16), r0Var);
        this.f12712h = new x0.e1(new q1.q(j17), r0Var);
        this.f12713i = new x0.e1(new q1.q(j18), r0Var);
        this.f12714j = new x0.e1(new q1.q(j19), r0Var);
        this.f12715k = new x0.e1(new q1.q(j20), r0Var);
        this.f12716l = new x0.e1(new q1.q(j21), r0Var);
        this.f12717m = new x0.e1(Boolean.valueOf(z10), r0Var);
    }

    public final long a() {
        return ((q1.q) this.f12709e.getValue()).f17577a;
    }

    public final long b() {
        return ((q1.q) this.f12711g.getValue()).f17577a;
    }

    public final long c() {
        return ((q1.q) this.f12714j.getValue()).f17577a;
    }

    public final long d() {
        return ((q1.q) this.f12712h.getValue()).f17577a;
    }

    public final long e() {
        return ((q1.q) this.f12715k.getValue()).f17577a;
    }

    public final long f() {
        return ((q1.q) this.f12705a.getValue()).f17577a;
    }

    public final long g() {
        return ((q1.q) this.f12706b.getValue()).f17577a;
    }

    public final long h() {
        return ((q1.q) this.f12707c.getValue()).f17577a;
    }

    public final long i() {
        return ((q1.q) this.f12710f.getValue()).f17577a;
    }

    public final boolean j() {
        return ((Boolean) this.f12717m.getValue()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) q1.q.i(f())) + ", primaryVariant=" + ((Object) q1.q.i(g())) + ", secondary=" + ((Object) q1.q.i(h())) + ", secondaryVariant=" + ((Object) q1.q.i(((q1.q) this.f12708d.getValue()).f17577a)) + ", background=" + ((Object) q1.q.i(a())) + ", surface=" + ((Object) q1.q.i(i())) + ", error=" + ((Object) q1.q.i(b())) + ", onPrimary=" + ((Object) q1.q.i(d())) + ", onSecondary=" + ((Object) q1.q.i(((q1.q) this.f12713i.getValue()).f17577a)) + ", onBackground=" + ((Object) q1.q.i(c())) + ", onSurface=" + ((Object) q1.q.i(e())) + ", onError=" + ((Object) q1.q.i(((q1.q) this.f12716l.getValue()).f17577a)) + ", isLight=" + j() + ')';
    }
}
