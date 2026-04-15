package la;

import bg.a2;
import java.util.List;
import java.util.ListIterator;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12012f;

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f12007a = i10;
        this.f12008b = obj;
        this.f12009c = obj2;
        this.f12010d = obj3;
        this.f12011e = obj4;
        this.f12012f = obj5;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        Object objPrevious;
        switch (this.f12007a) {
            case 0:
                c0.h hVar = (c0.h) obj;
                int iIntValue = ((Number) obj2).intValue();
                x0.o oVar = (x0.o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                jc.l.e(hVar, "$this$items");
                if ((iIntValue2 & 6) == 0) {
                    i10 = (oVar.f(hVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
                    a2 a2Var = (a2) ((j7.b) this.f12008b).b(iIntValue);
                    oVar.W(-453877566);
                    if (a2Var != null) {
                        oVar.W(-453860269);
                        d0.e(a2Var, (j1.q) this.f12009c, (List) this.f12010d, (ic.a) this.f12011e, (ic.n) this.f12012f, oVar, 0);
                    } else {
                        oVar.W(-457012535);
                    }
                    oVar.p(false);
                    oVar.p(false);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                c0.h hVar2 = (c0.h) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                jc.l.e(hVar2, "$this$items");
                if ((iIntValue4 & 6) == 0) {
                    i11 = (oVar2.f(hVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i11 |= oVar2.d(iIntValue3) ? 32 : 16;
                }
                if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
                    a2 a2Var2 = (a2) ((j7.b) this.f12008b).b(iIntValue3);
                    oVar2.W(1708405348);
                    if (a2Var2 != null) {
                        oVar2.W(1708422645);
                        d0.a(a2Var2, (j1.q) this.f12009c, (List) this.f12010d, (ic.a) this.f12011e, (ic.n) this.f12012f, oVar2, 0);
                    } else {
                        oVar2.W(1704076073);
                    }
                    oVar2.p(false);
                    oVar2.p(false);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                q.h hVar3 = (q.h) obj;
                e7.j jVar = (e7.j) obj2;
                x0.o oVar3 = (x0.o) obj3;
                ((Number) obj4).intValue();
                boolean zA = jc.l.a(((r.w0) this.f12008b).f18605c.getValue(), (e7.j) this.f12009c);
                if (!((Boolean) ((x0.w0) this.f12011e).getValue()).booleanValue() && !zA) {
                    List list = (List) ((n2) this.f12012f).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            if (jc.l.a(jVar, (e7.j) objPrevious)) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    jVar = (e7.j) objPrevious;
                }
                if (jVar == null) {
                    oVar3.W(105930796);
                } else {
                    oVar3.W(-1520603531);
                    a2.c.i(jVar, (g1.c) this.f12010d, f1.g.f(-1263531443, new ee.b(3, jVar, hVar3), oVar3), oVar3, 384);
                }
                oVar3.p(false);
                break;
        }
        return ub.a0.f21526a;
    }
}
