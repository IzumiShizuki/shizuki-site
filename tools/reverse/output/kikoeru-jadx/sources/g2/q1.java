package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f7278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f7279c = new p1(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1 f7280d = new p1(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f7281e = new p1(this, 1);

    public q1(t1 t1Var) {
        this.f7277a = t1Var;
    }

    public final p0 a() {
        p0 p0Var = this.f7278b;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
