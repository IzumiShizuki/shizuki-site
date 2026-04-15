package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends j1.p implements i2.s1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25290p;

    @Override // i2.s1
    public final Object l0(Object obj) {
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        if (h1Var == null) {
            h1Var = new h1();
        }
        h1Var.f25135a = this.f25289o;
        h1Var.f25136b = this.f25290p;
        return h1Var;
    }
}
