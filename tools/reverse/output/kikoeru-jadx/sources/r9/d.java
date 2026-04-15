package r9;

import a9.r;
import com.tencent.bugly.beta.tinker.TinkerReport;
import f1.g;
import ic.o;
import ic.p;
import jc.l;
import ub.a0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18973b;

    public /* synthetic */ d(c cVar, int i10) {
        this.f18972a = i10;
        this.f18973b = cVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f18972a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.g(zBooleanValue) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c cVar = this.f18973b;
                    if (zBooleanValue) {
                        oVar.W(-506129781);
                        o oVar2 = cVar.f18970g;
                        if (oVar2 == null) {
                            oVar.W(-506129782);
                        } else {
                            oVar.W(-1955989417);
                            oVar2.g(cVar, oVar, 0);
                        }
                        oVar.p(false);
                        oVar.p(false);
                    } else {
                        oVar.W(-506093015);
                        ka.b.i(g.f(-718394310, new r(17, cVar), oVar), g.f(141212388, new d(cVar, 1), oVar), 0L, 0L, 0.0f, null, oVar, 390, TinkerReport.KEY_APPLIED_DEXOPT_EXIST);
                        oVar.p(false);
                    }
                } else {
                    oVar.Q();
                }
                break;
            default:
                k1 k1Var = (k1) obj;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e(k1Var, "$this$TopBar");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar3.f(k1Var) ? 4 : 2;
                }
                if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c cVar2 = this.f18973b;
                    p pVar = cVar2.f18967d;
                    if (pVar == null) {
                        oVar3.W(2085284555);
                    } else {
                        oVar3.W(-1733848074);
                        pVar.l(k1Var, cVar2, oVar3, Integer.valueOf(iIntValue2 & 14));
                    }
                    oVar3.p(false);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
