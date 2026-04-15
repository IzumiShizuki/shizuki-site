package na;

import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ub.e f15713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15714c;

    public /* synthetic */ j(ub.e eVar, Object obj, int i10) {
        this.f15712a = i10;
        this.f15713b = eVar;
        this.f15714c = obj;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f15712a) {
            case 0:
                f1.f fVar = (f1.f) this.f15713b;
                j7.b bVar = (j7.b) this.f15714c;
                a0.d dVar = (a0.d) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                x0.o oVar = (x0.o) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                jc.l.e(dVar, "$this$items");
                if ((iIntValue2 & 6) == 0) {
                    i10 = (oVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
                    fVar.k(dVar, num, bVar.b(iIntValue), oVar, Integer.valueOf(i10 & 126));
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                f1.f fVar2 = (f1.f) this.f15713b;
                j7.b bVar2 = (j7.b) this.f15714c;
                a0.d dVar2 = (a0.d) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                jc.l.e(dVar2, "$this$items");
                if ((iIntValue4 & 6) == 0) {
                    i11 = (oVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= oVar2.d(iIntValue3) ? 32 : 16;
                }
                if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
                    fVar2.l(dVar2, bVar2.b(iIntValue3), oVar2, Integer.valueOf(i11 & 14));
                } else {
                    oVar2.Q();
                }
                break;
            default:
                ic.k kVar = (ic.k) this.f15713b;
                w0 w0Var = (w0) this.f15714c;
                String str = (String) obj2;
                x0.o oVar3 = (x0.o) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                jc.l.e((a0.d) obj, "$this$items");
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= oVar3.f(str) ? 32 : 16;
                }
                if (!oVar3.N(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    oVar3.Q();
                } else if (str != null) {
                    int i12 = iIntValue5 & 112;
                    boolean zF = oVar3.f(kVar) | (i12 == 32);
                    Object objK = oVar3.K();
                    r0 r0Var = x0.k.f24334a;
                    if (zF || objK == r0Var) {
                        objK = new a9.d(3, kVar, str);
                        oVar3.h0(objK);
                    }
                    ic.a aVar = (ic.a) objK;
                    boolean zF2 = oVar3.f(w0Var) | (i12 == 32);
                    Object objK2 = oVar3.K();
                    if (zF2 || objK2 == r0Var) {
                        objK2 = new a9.d(4, w0Var, str);
                        oVar3.h0(objK2);
                    }
                    ba.z.a(str, aVar, (ic.a) objK2, oVar3, (iIntValue5 >> 3) & 14, 0);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
