package pd;

import b0.w1;
import c7.e1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import se.s0;
import se.u0;
import se.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends bd.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w1 f17009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ed.c0 f17010l;

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(w1 w1Var, ed.c0 c0Var, int i10, yc.l lVar) {
        jc.l.e(c0Var, "javaTypeParameter");
        od.a aVar = (od.a) w1Var.f1395c;
        super(aVar.f16315a, lVar, new od.c(w1Var, c0Var, false), be.e.e(c0Var.f6486a.getName()), x0.INVARIANT, false, i10, aVar.f16327m);
        this.f17009k = w1Var;
        this.f17010l = c0Var;
    }

    @Override // bd.k
    public final List D1(List list) {
        td.c cVar;
        se.w wVar;
        se.w wVarB;
        w1 w1Var = this.f17009k;
        td.c cVar2 = ((od.a) w1Var.f1395c).f16332r;
        cVar2.getClass();
        List<se.w> list2 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        for (se.w wVar2 : list2) {
            td.n nVar = td.n.f20703d;
            jc.l.e(wVar2, "<this>");
            if (u0.c(wVar2, nVar, null)) {
                cVar = cVar2;
                wVar = wVar2;
            } else {
                cVar = cVar2;
                wVar = wVar2;
                wVarB = cVar.b(new td.p(this, false, w1Var, ld.a.f12174f, false), wVar, vb.r.f22819a, null, false);
                if (wVarB == null) {
                }
                arrayList.add(wVarB);
                cVar2 = cVar;
            }
            wVarB = wVar;
            arrayList.add(wVarB);
            cVar2 = cVar;
        }
        return arrayList;
    }

    @Override // bd.k
    public final List E1() {
        Type[] bounds = this.f17010l.f6486a.getBounds();
        jc.l.d(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ed.q(type));
        }
        ed.q qVar = (ed.q) vb.m.z0(arrayList);
        Collection collection = arrayList;
        if (jc.l.a(qVar != null ? qVar.f6510a : null, Object.class)) {
            collection = vb.r.f22819a;
        }
        Collection collection2 = collection;
        boolean zIsEmpty = collection2.isEmpty();
        w1 w1Var = this.f17009k;
        if (zIsEmpty) {
            return ud.b.w(se.c.g(((od.a) w1Var.f1395c).f16329o.g().e(), ((od.a) w1Var.f1395c).f16329o.g().o()));
        }
        Collection collection3 = collection2;
        ArrayList arrayList2 = new ArrayList(vb.n.K(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((e1) w1Var.f1397e).h0((ed.q) it.next(), n7.e.F(s0.f19985b, false, this, 3)));
        }
        return arrayList2;
    }
}
