package h1;

import o.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f8028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f8030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ic.k f8031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ic.k f8032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8033t;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(c cVar, ic.k kVar, ic.k kVar2, boolean z10, boolean z11) {
        ic.k kVarI;
        ic.k kVarE;
        g1.d dVar = n.f8049a;
        super(0L, k.f8034e, n.l(kVar, (cVar == null || (kVarE = cVar.e()) == null) ? n.f8058j.f7986e : kVarE, z10), n.b(kVar2, (cVar == null || (kVarI = cVar.i()) == null) ? n.f8058j.f7987f : kVarI));
        this.f8028o = cVar;
        this.f8029p = z10;
        this.f8030q = z11;
        this.f8031r = this.f7986e;
        this.f8032s = this.f7987f;
        this.f8033t = f1.g.c();
    }

    @Override // h1.c
    public final void C(l0 l0Var) {
        t.m();
        throw null;
    }

    @Override // h1.c
    public final c D(ic.k kVar, ic.k kVar2) {
        ic.k kVarL = n.l(kVar, this.f8031r, true);
        ic.k kVarB = n.b(kVar2, this.f8032s);
        return !this.f8029p ? new j0(E().D(null, kVarB), kVarL, kVarB, false, true) : E().D(kVarL, kVarB);
    }

    public final c E() {
        c cVar = this.f8028o;
        return cVar == null ? n.f8058j : cVar;
    }

    @Override // h1.c, h1.g
    public final void c() {
        c cVar;
        this.f8010c = true;
        if (!this.f8030q || (cVar = this.f8028o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // h1.g
    public final k d() {
        return E().d();
    }

    @Override // h1.c, h1.g
    public final ic.k e() {
        return this.f8031r;
    }

    @Override // h1.c, h1.g
    public final boolean f() {
        return E().f();
    }

    @Override // h1.g
    public final long g() {
        return E().g();
    }

    @Override // h1.c, h1.g
    public final int h() {
        return E().h();
    }

    @Override // h1.c, h1.g
    public final ic.k i() {
        return this.f8032s;
    }

    @Override // h1.c, h1.g
    public final void k() {
        t.m();
        throw null;
    }

    @Override // h1.c, h1.g
    public final void l() {
        t.m();
        throw null;
    }

    @Override // h1.c, h1.g
    public final void m() {
        E().m();
    }

    @Override // h1.c, h1.g
    public final void n(e0 e0Var) {
        E().n(e0Var);
    }

    @Override // h1.g
    public final void r(k kVar) {
        t.m();
        throw null;
    }

    @Override // h1.g
    public final void s(long j10) {
        t.m();
        throw null;
    }

    @Override // h1.c, h1.g
    public final void t(int i10) {
        E().t(i10);
    }

    @Override // h1.c, h1.g
    public final g u(ic.k kVar) {
        ic.k kVarL = n.l(kVar, this.f8031r, true);
        return !this.f8029p ? n.h(E().u(null), kVarL, true) : E().u(kVarL);
    }

    @Override // h1.c
    public final t w() {
        return E().w();
    }

    @Override // h1.c
    public final l0 x() {
        return E().x();
    }

    @Override // h1.c
    /* JADX INFO: renamed from: y */
    public final ic.k e() {
        return this.f8031r;
    }
}
