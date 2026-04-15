package a0;

import b0.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f72c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f73d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n0 n0Var, int i10, int i11) {
        super(2);
        this.f71b = i11;
        this.f73d = n0Var;
        this.f72c = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f71b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l lVar = (l) this.f73d;
                    ah.j jVar = lVar.f75b.f68c;
                    int i10 = this.f72c;
                    b0.i iVarP = jVar.p(i10);
                    ((g) iVarP.f1265c).f40c.l(lVar.f76c, Integer.valueOf(i10 - iVarP.f1263a), oVar, 0);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ah.j jVar2 = ((c0.g) this.f73d).f3063b.f3060c;
                    int i11 = this.f72c;
                    b0.i iVarP2 = jVar2.p(i11);
                    ((c0.d) iVarP2.f1265c).f3057d.l(c0.h.f3065a, Integer.valueOf(i11 - iVarP2.f1263a), oVar2, 6);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ah.j jVarJ = ((d0.t) this.f73d).f5398b.j();
                    int i12 = this.f72c;
                    b0.i iVarP3 = jVarJ.p(i12);
                    ((d0.n) iVarP3.f1265c).f5373b.l(d0.x.f5429a, Integer.valueOf(i12 - iVarP3.f1263a), oVar3, 0);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
