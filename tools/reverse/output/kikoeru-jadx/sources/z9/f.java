package z9;

import hf.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f26623c;

    public /* synthetic */ f(r rVar, y yVar, int i10) {
        this.f26621a = i10;
        this.f26622b = rVar;
        this.f26623c = yVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f26621a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r rVar = this.f26622b;
                    boolean zH = oVar.h(rVar);
                    y yVar = this.f26623c;
                    boolean zH2 = zH | oVar.h(yVar);
                    Object objK = oVar.K();
                    if (zH2 || objK == x0.k.f24334a) {
                        objK = new g(rVar, yVar, 2);
                        oVar.h0(objK);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK, null, false, null, a.f26606l, oVar, 805306368, 510);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r rVar2 = this.f26622b;
                    boolean zH3 = oVar2.h(rVar2);
                    y yVar2 = this.f26623c;
                    boolean zH4 = zH3 | oVar2.h(yVar2);
                    Object objK2 = oVar2.K();
                    if (zH4 || objK2 == x0.k.f24334a) {
                        objK2 = new g(rVar2, yVar2, 1);
                        oVar2.h0(objK2);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, a.f26603i, oVar2, 805306368, 510);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
