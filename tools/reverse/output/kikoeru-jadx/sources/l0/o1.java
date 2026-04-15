package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.l f11583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f11584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(t.l lVar, l1 l1Var, int i10) {
        super(0);
        this.f11582b = i10;
        this.f11583c = lVar;
        this.f11584d = l1Var;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [ic.a, jc.m] */
    @Override // ic.a
    public final Object b() {
        switch (this.f11582b) {
            case 0:
                this.f11584d.d();
                nh.b.g(this.f11583c);
                break;
            case 1:
                this.f11584d.b(false);
                nh.b.g(this.f11583c);
                break;
            case 2:
                this.f11584d.m();
                nh.b.g(this.f11583c);
                break;
            case 3:
                this.f11584d.n();
                nh.b.g(this.f11583c);
                break;
            default:
                ?? r0 = this.f11584d.f11531g;
                if (r0 != 0) {
                    r0.b();
                }
                nh.b.g(this.f11583c);
                break;
        }
        return ub.a0.f21526a;
    }
}
