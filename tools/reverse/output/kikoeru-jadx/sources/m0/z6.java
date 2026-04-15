package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z6 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f13999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f14000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14001d;

    public /* synthetic */ z6(ic.n nVar, f1.f fVar, boolean z10, int i10) {
        this.f13998a = i10;
        this.f13999b = nVar;
        this.f14000c = fVar;
        this.f14001d = z10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13998a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f1.f fVar = this.f14000c;
                    ic.n nVar = this.f13999b;
                    if (nVar == null) {
                        oVar.W(1845819398);
                        a7.e(fVar, oVar, 0);
                        oVar.p(false);
                    } else if (this.f14001d) {
                        oVar.W(1845821491);
                        a7.a(fVar, nVar, oVar, 0);
                        oVar.p(false);
                    } else {
                        oVar.W(1845823628);
                        a7.b(fVar, nVar, oVar, 0);
                        oVar.p(false);
                    }
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z8.a(((d9) oVar2.j(e9.f12960b)).f12887j, f1.g.f(1789628237, new z6(this.f13999b, this.f14000c, this.f14001d, 0), oVar2), oVar2, 48);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x0.z zVar = h1.f13043a;
                    long j10 = ((q1.q) oVar3.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar.a(Float.valueOf((!((b1) oVar3.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.87f : 1.0f)), f1.g.f(1236486620, new z6(this.f13999b, this.f14000c, this.f14001d, 1), oVar3), oVar3, 56);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
