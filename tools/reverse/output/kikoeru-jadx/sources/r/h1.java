package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f18438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f18439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f18442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f18443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f18444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f18446i;

    public h1(j jVar, v1 v1Var, Object obj, Object obj2, p pVar) {
        this.f18438a = jVar.a(v1Var);
        this.f18439b = v1Var;
        this.f18440c = obj2;
        this.f18441d = obj;
        this.f18442e = (p) v1Var.f18596a.a(obj);
        ic.k kVar = v1Var.f18596a;
        this.f18443f = (p) kVar.a(obj2);
        this.f18444g = pVar != null ? d.k(pVar) : ((p) kVar.a(obj)).c();
        this.f18445h = -1L;
    }

    @Override // r.f
    public final boolean a() {
        return this.f18438a.a();
    }

    @Override // r.f
    public final long b() {
        if (this.f18445h < 0) {
            this.f18445h = this.f18438a.n(this.f18442e, this.f18443f, this.f18444g);
        }
        return this.f18445h;
    }

    @Override // r.f
    public final v1 c() {
        return this.f18439b;
    }

    @Override // r.f
    public final p d(long j10) {
        if (!q.t0.a(this, j10)) {
            return this.f18438a.H(j10, this.f18442e, this.f18443f, this.f18444g);
        }
        p pVar = this.f18446i;
        if (pVar != null) {
            return pVar;
        }
        p pVarT = this.f18438a.t(this.f18442e, this.f18443f, this.f18444g);
        this.f18446i = pVarT;
        return pVarT;
    }

    @Override // r.f
    public final /* synthetic */ boolean e(long j10) {
        return q.t0.a(this, j10);
    }

    @Override // r.f
    public final Object f(long j10) {
        if (q.t0.a(this, j10)) {
            return this.f18440c;
        }
        p pVarG = this.f18438a.g(j10, this.f18442e, this.f18443f, this.f18444g);
        int iB = pVarG.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(pVarG.a(i10))) {
                n0.b("AnimationVector cannot contain a NaN. " + pVarG + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return this.f18439b.f18597b.a(pVarG);
    }

    @Override // r.f
    public final Object g() {
        return this.f18440c;
    }

    public final void h(Object obj) {
        if (jc.l.a(obj, this.f18441d)) {
            return;
        }
        this.f18441d = obj;
        this.f18442e = (p) this.f18439b.f18596a.a(obj);
        this.f18446i = null;
        this.f18445h = -1L;
    }

    public final void i(Object obj) {
        if (jc.l.a(this.f18440c, obj)) {
            return;
        }
        this.f18440c = obj;
        this.f18443f = (p) this.f18439b.f18596a.a(obj);
        this.f18446i = null;
        this.f18445h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f18441d + " -> " + this.f18440c + ",initial velocity: " + this.f18444g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f18438a;
    }
}
