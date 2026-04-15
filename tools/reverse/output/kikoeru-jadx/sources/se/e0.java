package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f19939a;

    public e0(vc.i iVar) {
        jc.l.e(iVar, "kotlinBuiltIns");
        this.f19939a = iVar.o();
    }

    @Override // se.n0
    public final x0 a() {
        return x0.OUT_VARIANCE;
    }

    @Override // se.n0
    public final w b() {
        return this.f19939a;
    }

    @Override // se.n0
    public final boolean c() {
        return true;
    }

    @Override // se.n0
    public final n0 d(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }
}
