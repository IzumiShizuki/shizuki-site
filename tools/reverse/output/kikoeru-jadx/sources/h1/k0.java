package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f8039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ic.k f8042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8043i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g gVar, ic.k kVar, boolean z10, boolean z11) {
        ic.k kVarE;
        super(0L, k.f8034e);
        g1.d dVar = n.f8049a;
        this.f8039e = gVar;
        this.f8040f = z10;
        this.f8041g = z11;
        this.f8042h = n.l(kVar, (gVar == null || (kVarE = gVar.e()) == null) ? n.f8058j.f7986e : kVarE, z10);
        this.f8043i = f1.g.c();
    }

    @Override // h1.g
    public final void c() {
        g gVar;
        this.f8010c = true;
        if (!this.f8041g || (gVar = this.f8039e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // h1.g
    public final k d() {
        return v().d();
    }

    @Override // h1.g
    public final ic.k e() {
        return this.f8042h;
    }

    @Override // h1.g
    public final boolean f() {
        return v().f();
    }

    @Override // h1.g
    public final long g() {
        return v().g();
    }

    @Override // h1.g
    public final ic.k i() {
        return null;
    }

    @Override // h1.g
    public final void k() {
        t.m();
        throw null;
    }

    @Override // h1.g
    public final void l() {
        t.m();
        throw null;
    }

    @Override // h1.g
    public final void m() {
        v().m();
    }

    @Override // h1.g
    public final void n(e0 e0Var) {
        v().n(e0Var);
    }

    @Override // h1.g
    public final g u(ic.k kVar) {
        ic.k kVarL = n.l(kVar, this.f8042h, true);
        return !this.f8040f ? n.h(v().u(null), kVarL, true) : v().u(kVarL);
    }

    public final g v() {
        g gVar = this.f8039e;
        return gVar == null ? n.f8058j : gVar;
    }
}
