package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f22559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f22560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f22561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f22562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22563e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22564f;

    public k(c0 c0Var, p4.v vVar) {
        this.f22560b = c0Var;
        this.f22559a = new c1(vVar);
    }

    @Override // v4.g0
    public final void a(m4.s0 s0Var) {
        g0 g0Var = this.f22562d;
        if (g0Var != null) {
            g0Var.a(s0Var);
            s0Var = this.f22562d.e();
        }
        this.f22559a.a(s0Var);
    }

    @Override // v4.g0
    public final long b() {
        if (this.f22563e) {
            return this.f22559a.b();
        }
        g0 g0Var = this.f22562d;
        g0Var.getClass();
        return g0Var.b();
    }

    @Override // v4.g0
    public final boolean c() {
        if (this.f22563e) {
            this.f22559a.getClass();
            return false;
        }
        g0 g0Var = this.f22562d;
        g0Var.getClass();
        return g0Var.c();
    }

    public final void d(e eVar) {
        g0 g0Var;
        g0 g0VarH = eVar.h();
        if (g0VarH == null || g0VarH == (g0Var = this.f22562d)) {
            return;
        }
        if (g0Var != null) {
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f22562d = g0VarH;
        this.f22561c = eVar;
        ((x4.x) g0VarH).a(this.f22559a.f22438e);
    }

    @Override // v4.g0
    public final m4.s0 e() {
        g0 g0Var = this.f22562d;
        return g0Var != null ? g0Var.e() : this.f22559a.f22438e;
    }
}
