package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.k f8003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f8004f;

    public e(long j10, k kVar, ic.k kVar2, g gVar) {
        super(j10, kVar);
        this.f8003e = kVar2;
        this.f8004f = gVar;
        gVar.k();
    }

    @Override // h1.g
    public final void c() {
        g gVar = this.f8004f;
        if (this.f8010c) {
            return;
        }
        if (this.f8009b != gVar.g()) {
            a();
        }
        gVar.l();
        this.f8010c = true;
        synchronized (n.f8051c) {
            o();
        }
    }

    @Override // h1.g
    public final ic.k e() {
        return this.f8003e;
    }

    @Override // h1.g
    public final boolean f() {
        return true;
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
    public final void n(e0 e0Var) {
        g1.d dVar = n.f8049a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // h1.g
    public final g u(ic.k kVar) {
        return new e(this.f8009b, this.f8008a, n.l(kVar, this.f8003e, true), this.f8004f);
    }

    @Override // h1.g
    public final void m() {
    }
}
