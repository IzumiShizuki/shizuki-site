package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f19955b = new i0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f19956c = new i0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f19957d = new i0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19958a;

    public /* synthetic */ i0(int i10) {
        this.f19958a = i10;
    }

    @Override // se.c
    public final ve.e F(j0 j0Var, ve.d dVar) {
        switch (this.f19958a) {
            case 0:
                jc.l.e(j0Var, "state");
                jc.l.e(dVar, "type");
                return j0Var.f19961c.v0(dVar);
            case 1:
                jc.l.e(j0Var, "state");
                jc.l.e(dVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                jc.l.e(j0Var, "state");
                jc.l.e(dVar, "type");
                return j0Var.f19961c.U(dVar);
        }
    }
}
