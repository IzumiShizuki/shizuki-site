package ka;

import j2.h0;
import m0.a7;
import m0.b1;
import m0.b2;
import m0.c1;
import m0.c2;
import m0.d2;
import m0.h7;
import m0.z8;
import q.u;
import ub.a0;
import x0.o2;
import x0.v;
import y.i1;
import y.j1;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f11283b;

    public /* synthetic */ l(k kVar, int i10) {
        this.f11282a = i10;
        this.f11283b = kVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f11282a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                ((Integer) obj3).getClass();
                jc.l.e((u) obj, "$this$AnimatedVisibility");
                k kVar = this.f11283b;
                c2 c2Var = kVar.f11279j;
                if (c2Var.f12776c.getValue() == d2.f12848b) {
                    n.b(kVar);
                }
                h7.a(c2Var, null, ud.e.X(b2.f12718a), null, f1.g.f(-2079094562, new l(kVar, 1), oVar), oVar, 221568);
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$SwipeToDismiss");
                if (oVar2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    oVar2.W(-582608177);
                    final k kVar2 = this.f11283b;
                    j1.q qVar = kVar2.f11271b;
                    o2 o2Var = c1.f12773a;
                    final int i10 = 0;
                    final int i11 = 1;
                    a7.c(qVar, f1.g.f(-1347530105, new ic.n() { // from class: ka.m
                        @Override // ic.n
                        public final Object q(Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    x0.o oVar3 = (x0.o) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar3, 0);
                                        int iQ = v.q(oVar3);
                                        x0.j1 j1VarL = oVar3.l();
                                        j1.q qVarC = j1.a.c(j1.n.f9689a, oVar3);
                                        i2.k.f8771g0.getClass();
                                        i2.i iVar = i2.j.f8733b;
                                        oVar3.a0();
                                        if (oVar3.S) {
                                            oVar3.k(iVar);
                                        } else {
                                            oVar3.k0();
                                        }
                                        v.A(i2.j.f8738g, j1VarA, oVar3);
                                        v.A(i2.j.f8737f, j1VarL, oVar3);
                                        i2.h hVar = i2.j.f8741j;
                                        if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                                            h0.s(iQ, oVar3, iQ, hVar);
                                        }
                                        v.A(i2.j.f8735d, qVarC, oVar3);
                                        k kVar3 = kVar2;
                                        ic.k kVar4 = kVar3.f11273d;
                                        if (kVar4 == null) {
                                            oVar3.W(-1762870767);
                                        } else {
                                            oVar3.W(-1762870766);
                                            boolean zH = oVar3.h(kVar3) | oVar3.f(kVar4);
                                            Object objK = oVar3.K();
                                            if (zH || objK == x0.k.f24334a) {
                                                objK = new a9.d(14, kVar3, kVar4);
                                                oVar3.h0(objK);
                                            }
                                            android.support.v4.media.session.b.o((ic.a) objK, null, false, null, f1.g.f(-1984834870, new l(kVar3, 2), oVar3), oVar3, 805306368, 510);
                                        }
                                        oVar3.p(false);
                                        oVar3.W(-1762558349);
                                        oVar3.p(false);
                                        oVar3.p(true);
                                    } else {
                                        oVar3.Q();
                                    }
                                    break;
                                default:
                                    x0.o oVar4 = (x0.o) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (oVar4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        z8.b((String) kVar2.f11270a.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                    } else {
                                        oVar4.Q();
                                    }
                                    break;
                            }
                            return a0.f21526a;
                        }
                    }, oVar2), kVar2.f11273d != null, null, ((b1) oVar2.j(o2Var)).a(), c1.a((b1) oVar2.j(o2Var), ((b1) oVar2.j(o2Var)).a()), 0.0f, f1.g.f(-1391812031, new ic.n() { // from class: ka.m
                        @Override // ic.n
                        public final Object q(Object obj4, Object obj5) {
                            switch (i11) {
                                case 0:
                                    x0.o oVar3 = (x0.o) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar3, 0);
                                        int iQ = v.q(oVar3);
                                        x0.j1 j1VarL = oVar3.l();
                                        j1.q qVarC = j1.a.c(j1.n.f9689a, oVar3);
                                        i2.k.f8771g0.getClass();
                                        i2.i iVar = i2.j.f8733b;
                                        oVar3.a0();
                                        if (oVar3.S) {
                                            oVar3.k(iVar);
                                        } else {
                                            oVar3.k0();
                                        }
                                        v.A(i2.j.f8738g, j1VarA, oVar3);
                                        v.A(i2.j.f8737f, j1VarL, oVar3);
                                        i2.h hVar = i2.j.f8741j;
                                        if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                                            h0.s(iQ, oVar3, iQ, hVar);
                                        }
                                        v.A(i2.j.f8735d, qVarC, oVar3);
                                        k kVar3 = kVar2;
                                        ic.k kVar4 = kVar3.f11273d;
                                        if (kVar4 == null) {
                                            oVar3.W(-1762870767);
                                        } else {
                                            oVar3.W(-1762870766);
                                            boolean zH = oVar3.h(kVar3) | oVar3.f(kVar4);
                                            Object objK = oVar3.K();
                                            if (zH || objK == x0.k.f24334a) {
                                                objK = new a9.d(14, kVar3, kVar4);
                                                oVar3.h0(objK);
                                            }
                                            android.support.v4.media.session.b.o((ic.a) objK, null, false, null, f1.g.f(-1984834870, new l(kVar3, 2), oVar3), oVar3, 805306368, 510);
                                        }
                                        oVar3.p(false);
                                        oVar3.W(-1762558349);
                                        oVar3.p(false);
                                        oVar3.p(true);
                                    } else {
                                        oVar3.Q();
                                    }
                                    break;
                                default:
                                    x0.o oVar4 = (x0.o) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (oVar4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        z8.b((String) kVar2.f11270a.getValue(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                    } else {
                                        oVar4.Q();
                                    }
                                    break;
                            }
                            return a0.f21526a;
                        }
                    }, oVar2), oVar2, 12582960, 72);
                    oVar2.p(false);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((k1) obj, "$this$TextButton");
                if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z8.b(this.f11283b.f11275f, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
