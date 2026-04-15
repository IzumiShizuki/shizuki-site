package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f24369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f24371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f24373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24374f = true;

    public n1(m1 m1Var, Object obj, boolean z10, i2 i2Var, boolean z11) {
        this.f24369a = m1Var;
        this.f24370b = z10;
        this.f24371c = i2Var;
        this.f24372d = z11;
        this.f24373e = obj;
    }

    public final Object a() {
        if (this.f24370b) {
            return null;
        }
        Object obj = this.f24373e;
        if (obj != null) {
            return obj;
        }
        p.d("Unexpected form of a provided value");
        throw new ce.j0();
    }
}
