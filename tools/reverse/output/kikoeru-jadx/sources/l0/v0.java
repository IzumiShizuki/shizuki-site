package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.l f11650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f11651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(t.l lVar, s0 s0Var, int i10) {
        super(0);
        this.f11649b = i10;
        this.f11650c = lVar;
        this.f11651d = s0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f11649b) {
            case 0:
                this.f11651d.b();
                nh.b.g(this.f11650c);
                break;
            default:
                this.f11651d.k();
                nh.b.g(this.f11650c);
                break;
        }
        return ub.a0.f21526a;
    }
}
