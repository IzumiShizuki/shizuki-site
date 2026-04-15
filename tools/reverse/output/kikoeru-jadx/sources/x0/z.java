package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24526b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ic.a aVar) {
        super(aVar);
        r0 r0Var = r0.f24439f;
        this.f24527c = r0Var;
    }

    @Override // x0.m1
    public final n1 a(Object obj) {
        switch (this.f24526b) {
            case 0:
                return new n1(this, obj, obj == null, null, true);
            default:
                return new n1(this, obj, obj == null, (i2) this.f24527c, true);
        }
    }

    @Override // x0.m1
    public r2 b() {
        switch (this.f24526b) {
            case 0:
                return (a0) this.f24527c;
            default:
                return super.b();
        }
    }

    public z(ic.k kVar) {
        super(new q9.j0(17));
        this.f24527c = new a0(kVar);
    }
}
