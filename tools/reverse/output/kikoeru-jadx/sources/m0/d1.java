package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f12840b = new d1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f12841c = new d1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f12842d = new d1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d1 f12843e = new d1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d1 f12844f = new d1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1 f12845g = new d1(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12846a;

    public /* synthetic */ d1(int i10) {
        this.f12846a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12846a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                }
                break;
            case 5:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.Q();
                }
                break;
            case 6:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lc.b.f(0, oVar7);
                } else {
                    oVar7.Q();
                }
                break;
            default:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    f1.f fVar = g1.f13013a;
                    jc.l.b(null);
                    fVar.g(null, oVar8, 0);
                } else {
                    oVar8.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
