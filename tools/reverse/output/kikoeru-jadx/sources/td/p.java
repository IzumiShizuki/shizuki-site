package td;

import b0.w1;
import bd.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pd.e0;
import se.a0;
import se.u0;
import se.w;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.a f20709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f20711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ld.a f20712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20713e;

    public p(zc.a aVar, boolean z10, w1 w1Var, ld.a aVar2, boolean z11) {
        jc.l.e(w1Var, "containerContext");
        this.f20709a = aVar;
        this.f20710b = z10;
        this.f20711c = w1Var;
        this.f20712d = aVar2;
        this.f20713e = z11;
    }

    public static void a(Object obj, ArrayList arrayList, bd.a aVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) aVar.a(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, aVar);
            }
        }
    }

    public static be.d c(a0 a0Var) {
        ue.i iVar = u0.f19993a;
        yc.h hVarH = a0Var.t().h();
        yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
        if (eVar != null) {
            return ee.e.g(eVar);
        }
        return null;
    }

    public static g d(ve.d dVar) {
        a0 a0VarH;
        a0 a0VarH2;
        jc.l.e(dVar, "<this>");
        se.q qVarG = te.g.g(dVar);
        if (qVarG == null || (a0VarH = te.g.Q(qVarG)) == null) {
            a0VarH = te.g.h(dVar);
            jc.l.b(a0VarH);
        }
        if (te.g.I(a0VarH)) {
            return g.f20681b;
        }
        se.q qVarG2 = te.g.g(dVar);
        if (qVarG2 == null || (a0VarH2 = te.g.b0(qVarG2)) == null) {
            a0VarH2 = te.g.h(dVar);
            jc.l.b(a0VarH2);
        }
        if (te.g.I(a0VarH2)) {
            return null;
        }
        return g.f20682c;
    }

    public final h b(q0 q0Var) {
        List list;
        g gVar;
        jc.l.e(q0Var, "<this>");
        if (!(q0Var instanceof e0)) {
            return null;
        }
        List upperBounds = q0Var.getUpperBounds();
        jc.l.d(upperBounds, "getUpperBounds(...)");
        List list2 = upperBounds;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!te.g.E((ve.d) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (d((ve.d) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                ub.h hVarC = ub.a.c(ub.i.f21541b, new x(upperBounds, this));
                boolean zIsEmpty = arrayList.isEmpty();
                g gVar2 = g.f20680a;
                if (!zIsEmpty) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            jc.l.e((ve.d) it2.next(), "<this>");
                            list = upperBounds;
                        }
                    }
                    return new h(gVar2, false);
                }
                if (((List) hVarC.getValue()).isEmpty()) {
                    return null;
                }
                List list3 = (List) hVarC.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    if (it3.hasNext()) {
                        jc.l.e((ve.d) it3.next(), "<this>");
                        list = (List) hVarC.getValue();
                    }
                }
                return new h(gVar2, true);
                List list4 = list;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    gVar = g.f20681b;
                } else {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        if (!te.g.K((ve.d) it4.next())) {
                            gVar = g.f20682c;
                            break;
                        }
                    }
                    gVar = g.f20681b;
                }
                return new h(gVar, list != upperBounds);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    public final ArrayList e(ve.d dVar) {
        w1 w1Var = this.f20711c;
        ld.t tVar = (ld.t) w1Var.f1394b.getValue();
        ld.b bVar = ((od.a) w1Var.f1395c).f16331q;
        jc.l.e(dVar, "<this>");
        a aVar = new a(dVar, bVar.b(tVar, ((w) dVar).getAnnotations()), null);
        bd.a aVar2 = new bd.a(25, this);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, aVar2);
        return arrayList;
    }
}
