package d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements b0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5367a;

    public l(d dVar) {
        this.f5367a = dVar;
    }

    @Override // b0.r
    public final int a() {
        return this.f5367a.l();
    }

    @Override // b0.r
    public final int b() {
        return Math.min(r0.l() - 1, ((j) vb.m.h0(this.f5367a.k().f5411a)).f5346a);
    }

    @Override // b0.r
    public final int c() {
        int i10;
        d dVar = this.f5367a;
        if (dVar.k().f5411a.size() == 0) {
            return 0;
        }
        int iH = android.support.v4.media.session.b.H(dVar.k());
        int i11 = dVar.k().f5412b + dVar.k().f5413c;
        if (i11 != 0 && (i10 = iH / i11) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // b0.r
    public final boolean d() {
        return !this.f5367a.k().f5411a.isEmpty();
    }

    @Override // b0.r
    public final int e() {
        return Math.max(0, this.f5367a.f5312e);
    }
}
