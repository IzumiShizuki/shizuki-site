package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f21119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(ic.k kVar, int i10) {
        super(3);
        this.f21118b = i10;
        this.f21119c = kVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f21118b) {
            case 0:
                long j10 = ((p1.b) obj3).f16481a;
                this.f21119c.a(new p1.b(((c2.t) obj2).f3324c));
                return ub.a0.f21526a;
            default:
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar.W(-1608161351);
                ic.k kVar = this.f21119c;
                boolean zF = oVar.f(kVar);
                Object objK = oVar.K();
                if (zF || objK == x0.k.f24334a) {
                    objK = new y.x(kVar);
                    oVar.h0(objK);
                }
                y.x xVar = (y.x) objK;
                oVar.p(false);
                return xVar;
        }
    }
}
