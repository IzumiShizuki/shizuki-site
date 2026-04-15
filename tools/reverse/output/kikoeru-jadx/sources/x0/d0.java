package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f24263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f24264b;

    public d0(ic.k kVar) {
        this.f24263a = kVar;
    }

    @Override // x0.u1
    public final void c() {
        e0 e0Var = this.f24264b;
        if (e0Var != null) {
            e0Var.a();
        }
        this.f24264b = null;
    }

    @Override // x0.u1
    public final void d() {
        this.f24264b = (e0) this.f24263a.a(v.f24512b);
    }

    @Override // x0.u1
    public final void a() {
    }
}
