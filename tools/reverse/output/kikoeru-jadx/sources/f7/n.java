package f7;

import m0.f4;
import r.i0;
import s.o1;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6782f;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f6777a = i10;
        this.f6778b = obj;
        this.f6779c = obj2;
        this.f6780d = obj3;
        this.f6781e = obj4;
        this.f6782f = obj5;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6777a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                q qVar = (q) this.f6779c;
                e7.j jVar = (e7.j) this.f6778b;
                if ((iIntValue & 3) == 2 && oVar.z()) {
                    oVar.Q();
                } else {
                    boolean zH = oVar.h(jVar) | oVar.h(qVar);
                    h1.s sVar = (h1.s) this.f6781e;
                    Object objK = oVar.K();
                    if (zH || objK == x0.k.f24334a) {
                        objK = new ba.i(sVar, jVar, qVar, 3);
                        oVar.h0(objK);
                    }
                    x0.v.c(jVar, (ic.k) objK, oVar);
                    a2.c.i(jVar, (g1.c) this.f6780d, f1.g.f(-497631156, new ee.b(1, (p) this.f6782f, jVar), oVar), oVar, 384);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f4.a((i0) this.f6778b, (w0) this.f6779c, (o1) this.f6780d, (j1.q) this.f6781e, (f1.f) this.f6782f, oVar2, 48);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
