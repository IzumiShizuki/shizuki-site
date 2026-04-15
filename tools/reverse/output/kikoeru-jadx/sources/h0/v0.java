package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f7906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(c1 c1Var, int i10) {
        super(1);
        this.f7905b = i10;
        this.f7906c = c1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f7905b) {
            case 0:
                this.f7906c.a(((p1.b) obj).f16481a);
                break;
            default:
                c2.t tVar = (c2.t) obj;
                this.f7906c.e(c2.s.f(tVar, false));
                tVar.a();
                break;
        }
        return ub.a0.f21526a;
    }
}
