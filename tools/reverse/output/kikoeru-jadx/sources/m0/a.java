package m0;

import androidx.compose.foundation.layout.FillElement;
import ic.n;
import ic.p;
import java.util.ArrayList;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12636d;

    public /* synthetic */ a(float f10, float f11, f1.f fVar, int i10) {
        this.f12634b = f10;
        this.f12635c = f11;
        this.f12636d = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12633a) {
            case 0:
                ((Integer) obj2).getClass();
                k.c(this.f12634b, this.f12635c, (f1.f) this.f12636d, (x0.o) obj, x0.v.D(439));
                break;
            default:
                final y8.i iVar = (y8.i) this.f12636d;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                    y.e1 e1VarB = androidx.compose.foundation.layout.a.b(0.0f, 12, 13);
                    boolean zH = oVar.h(iVar);
                    final float f10 = this.f12634b;
                    boolean zC = zH | oVar.c(f10);
                    final float f11 = this.f12635c;
                    boolean zC2 = zC | oVar.c(f11);
                    Object objK = oVar.K();
                    if (zC2 || objK == x0.k.f24334a) {
                        objK = new ic.k() { // from class: y8.k
                            @Override // ic.k
                            public final Object a(Object obj3) {
                                a0.j jVar = (a0.j) obj3;
                                jc.l.e(jVar, "$this$LazyColumn");
                                final i iVar2 = iVar;
                                int size = iVar2.f25923c.size();
                                final float f12 = f10;
                                final float f13 = f11;
                                a0.c.C(jVar, size, null, new f1.f(new p() { // from class: y8.l
                                    @Override // ic.p
                                    public final Object l(Object obj4, Object obj5, Object obj6, Object obj7) {
                                        i iVar3 = iVar2;
                                        ArrayList arrayList = iVar3.f25923c;
                                        Integer num = (Integer) obj5;
                                        int iIntValue2 = num.intValue();
                                        o oVar2 = (o) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        jc.l.e((a0.d) obj4, "$this$items");
                                        if ((iIntValue3 & 48) == 0) {
                                            iIntValue3 |= oVar2.d(iIntValue2) ? 32 : 16;
                                        }
                                        if (oVar2.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                            ArrayList arrayList2 = iVar3.f25921a;
                                            ((n) ((f) arrayList.get(iIntValue2)).f25906a.q(iVar3, num)).q(oVar2, 0);
                                            float f14 = f12;
                                            if (f3.f.a(f14, 0) || iIntValue2 == arrayList.size() - 1 || arrayList2.contains(num) || arrayList2.contains(Integer.valueOf(iIntValue2 + 1)) || iVar3.f25922b.contains(num)) {
                                                oVar2.W(971430844);
                                            } else {
                                                oVar2.W(973362609);
                                                c.a(null, 0L, f14, f13, oVar2, 0);
                                            }
                                            oVar2.p(false);
                                        } else {
                                            oVar2.Q();
                                        }
                                        return a0.f21526a;
                                    }
                                }, -197480186, true), 6);
                                return a0.f21526a;
                            }
                        };
                        oVar.h0(objK);
                    }
                    a.a.g(384, 506, null, (ic.k) objK, null, fillElement, null, null, oVar, null, e1VarB, false);
                } else {
                    oVar.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ a(y8.i iVar, float f10, float f11) {
        this.f12636d = iVar;
        this.f12634b = f10;
        this.f12635c = f11;
    }
}
