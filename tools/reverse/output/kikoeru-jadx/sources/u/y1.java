package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f21144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f21145b;

    public y1(c2 c2Var, a2 a2Var) {
        this.f21144a = c2Var;
        this.f21145b = a2Var;
    }

    @Override // u.k1
    public final float a(float f10) {
        float fAbs = Math.abs(f10);
        c2 c2Var = this.f21144a;
        if (fAbs != 0.0f && ((f10 > 0.0f && !c2Var.f20844a.d()) || ((f10 < 0.0f && !c2Var.f20844a.c()) || !((Boolean) c2Var.f20850g.b()).booleanValue()))) {
            throw new r.k0(2, "The fling animation was cancelled");
        }
        return c2Var.d(c2Var.g(this.f21145b.a(2, c2Var.e(c2Var.h(f10)))));
    }
}
