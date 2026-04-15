package m9;

import ic.o;
import java.util.Iterator;
import m0.b0;
import ub.a0;
import vb.u;
import x0.w0;
import y.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f15014c;

    public /* synthetic */ g(w0 w0Var, w0 w0Var2, int i10) {
        this.f15012a = i10;
        this.f15013b = w0Var;
        this.f15014c = w0Var2;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f15012a;
        w wVar = (w) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                jc.l.e(wVar, "$this$ExposedDropdownMenu");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (String str : g9.a.f7458e) {
                        boolean zF = oVar.f(str);
                        Object objK = oVar.K();
                        if (zF || objK == x0.k.f24334a) {
                            objK = new ba.c((Object) str, this.f15013b, (Object) this.f15014c, 15);
                            oVar.h0(objK);
                        }
                        b0.b((ic.a) objK, null, false, null, f1.g.f(514427773, new i9.k(1, str), oVar), oVar, 196608, 30);
                    }
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                jc.l.e(wVar, "$this$ExposedDropdownMenu");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Iterator it = vb.l.O0((String[]) na.o.f15732e.getValue()).iterator();
                    while (true) {
                        df.b bVar = (df.b) it;
                        if (bVar.f5974b.hasNext()) {
                            u uVar = (u) bVar.next();
                            boolean zH = oVar.h(uVar);
                            Object objK2 = oVar.K();
                            if (zH || objK2 == x0.k.f24334a) {
                                objK2 = new ba.c((Object) uVar, this.f15013b, (Object) this.f15014c, 18);
                                oVar.h0(objK2);
                            }
                            b0.b((ic.a) objK2, null, false, null, f1.g.f(-1111919093, new ba.l(9, uVar), oVar), oVar, 196608, 30);
                        }
                    }
                } else {
                    oVar.Q();
                }
                break;
            default:
                jc.l.e(wVar, "$this$ExposedDropdownMenu");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (t9.a aVar : t9.a.values()) {
                        boolean zD = oVar.d(aVar.ordinal());
                        Object objK3 = oVar.K();
                        if (zD || objK3 == x0.k.f24334a) {
                            objK3 = new ba.c((Object) aVar, this.f15013b, (Object) this.f15014c, 25);
                            oVar.h0(objK3);
                        }
                        b0.b((ic.a) objK3, null, false, null, f1.g.f(-1796058080, new ba.l(13, aVar), oVar), oVar, 196608, 30);
                    }
                } else {
                    oVar.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
