package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.k f8005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8006f;

    public f(long j10, k kVar, ic.k kVar2) {
        super(j10, kVar);
        this.f8005e = kVar2;
        this.f8006f = 1;
    }

    @Override // h1.g
    public final void c() {
        if (this.f8010c) {
            return;
        }
        l();
        this.f8010c = true;
        synchronized (n.f8051c) {
            o();
        }
    }

    @Override // h1.g
    public final ic.k e() {
        return this.f8005e;
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
        this.f8006f++;
    }

    @Override // h1.g
    public final void l() {
        int i10 = this.f8006f - 1;
        this.f8006f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // h1.g
    public final void n(e0 e0Var) {
        g1.d dVar = n.f8049a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // h1.g
    public final g u(ic.k kVar) {
        n.d(this);
        return new e(this.f8009b, this.f8008a, n.l(kVar, this.f8005e, true), this);
    }

    @Override // h1.g
    public final void m() {
    }
}
