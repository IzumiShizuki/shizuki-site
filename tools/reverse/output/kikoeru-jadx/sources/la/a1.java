package la;

import g2.f1;
import g2.g1;
import g2.n1;
import g2.r1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f11898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f11899c;

    public /* synthetic */ a1(f1.f fVar, f1.f fVar2, int i10) {
        this.f11897a = i10;
        this.f11898b = fVar;
        this.f11899c = fVar2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11897a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j1.q qVarR = androidx.compose.foundation.layout.c.r(j1.n.f9689a, 3);
                    f1.f fVar = this.f11898b;
                    boolean zF = oVar.f(fVar);
                    f1.f fVar2 = this.f11899c;
                    boolean zF2 = zF | oVar.f(fVar2);
                    Object objK = oVar.K();
                    if (zF2 || objK == x0.k.f24334a) {
                        objK = new a1(fVar, fVar2, 1);
                        oVar.h0(objK);
                    }
                    n1.c(qVarR, (ic.n) objK, oVar, 6, 0);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            default:
                final r1 r1Var = (r1) obj;
                jc.l.e(r1Var, "$this$SubcomposeLayout");
                List listP = r1Var.P(this.f11898b, n0.f12047a);
                int iH = f3.a.h(((f3.a) obj2).f6651a);
                List<g2.u0> list = listP;
                ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((g2.u0) it.next()).m(Integer.MAX_VALUE)));
                }
                int size = listP.size() * ((Number) vb.m.l0(arrayList)).intValue();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    size += ((g2.u0) it2.next()).m(Integer.MAX_VALUE);
                }
                final int iMin = Math.min(size, iH);
                int size2 = listP.size();
                final jc.w wVar = new jc.w();
                if (size2 > 0) {
                    wVar.f10836a = iMin / size2;
                }
                Iterator it3 = list.iterator();
                final int iMax = 0;
                while (it3.hasNext()) {
                    iMax = Math.max(((g2.u0) it3.next()).b(wVar.f10836a), iMax);
                }
                final ArrayList arrayList2 = new ArrayList(vb.n.K(list, 10));
                for (g2.u0 u0Var : list) {
                    int i10 = wVar.f10836a;
                    if (i10 < 0 || iMax < 0) {
                        f3.i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
                    arrayList2.add(u0Var.v(f3.b.h(i10, i10, iMax, iMax)));
                }
                final ArrayList arrayList3 = new ArrayList(size2);
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList3.add(new m0(r1Var.I(wVar.f10836a) * i11, r1Var.I(wVar.f10836a)));
                }
                final f1.f fVar3 = this.f11899c;
                return r1Var.b0(iMin, iMax, vb.s.f22820a, new ic.k() { // from class: la.c1
                    @Override // ic.k
                    public final Object a(Object obj3) {
                        f1 f1Var = (f1) obj3;
                        jc.l.e(f1Var, "$this$layout");
                        for (g2.u0 u0Var2 : r1Var.P(new f1.f(new ba.h0(11, fVar3, arrayList3), 1421676114, true), n0.f12048b)) {
                            int i12 = iMin;
                            boolean z10 = i12 >= 0;
                            int i13 = iMax;
                            if (!(z10 & (i13 >= 0))) {
                                f3.i.a("width and height must be >= 0");
                            }
                            f1.k(f1Var, u0Var2.v(f3.b.h(i12, i12, i13, i13)), 0, 0);
                        }
                        int i14 = 0;
                        for (Object obj4 : arrayList2) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                ud.b.H();
                                throw null;
                            }
                            f1.k(f1Var, (g1) obj4, i14 * wVar.f10836a, 0);
                            i14 = i15;
                        }
                        return ub.a0.f21526a;
                    }
                });
        }
    }
}
