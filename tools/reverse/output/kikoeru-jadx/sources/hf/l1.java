package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.c f8567d;

    public l1(yb.h hVar, ic.n nVar) {
        super(hVar, false);
        this.f8567d = ud.s.k(nVar, this, this);
    }

    @Override // hf.k1
    public final void e0() throws Throwable {
        try {
            nf.b.h(ub.a0.f21526a, ud.s.p(this.f8567d));
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof h0) {
                th = ((h0) th).f8545a;
            }
            h(ub.a.b(th));
            throw th;
        }
    }
}
