package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f20892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(k0 k0Var, int i10) {
        super(0);
        this.f20891b = i10;
        this.f20892c = k0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f20891b) {
            case 0:
                kf.f fVar = this.f20892c.f20979u;
                if (fVar != null) {
                    fVar.e(l.f20994a);
                }
                return ub.a0.f21526a;
            default:
                return Boolean.valueOf(!this.f20892c.L0());
        }
    }
}
