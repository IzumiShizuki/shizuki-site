package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    @Override // h1.c
    public final c D(ic.k kVar, ic.k kVar2) {
        return (c) ((g) n.f(new m(new ee.j(1, kVar, kVar2), 0)));
    }

    @Override // h1.c, h1.g
    public final void c() {
        synchronized (n.f8051c) {
            o();
        }
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
        n.a();
    }

    @Override // h1.c, h1.g
    public final g u(ic.k kVar) {
        int i10 = 0;
        return (f) ((g) n.f(new m(new a(kVar, i10), i10)));
    }

    @Override // h1.c
    public final t w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
