package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends j1.p implements i2.y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ic.k f7166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7167p;

    @Override // i2.y
    public final void m(long j10) {
        if (f3.l.b(this.f7167p, j10)) {
            return;
        }
        this.f7166o.a(new f3.l(j10));
        this.f7167p = j10;
    }

    @Override // j1.p
    public final boolean o0() {
        return true;
    }

    @Override // i2.y
    public final /* synthetic */ void B(c0 c0Var) {
    }
}
