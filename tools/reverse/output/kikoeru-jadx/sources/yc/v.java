package yc;

import b0.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final app.nekogram.translator.r f26151a = new app.nekogram.translator.r(10, "InvalidModuleNotifier");

    public static final tc.b0 a(se.a0 a0Var, i iVar, int i10) {
        if (iVar == null || ue.l.f(iVar)) {
            return null;
        }
        int size = iVar.L().size() + i10;
        if (iVar.d0()) {
            List listSubList = a0Var.q().subList(i10, size);
            k kVarY = iVar.y();
            return new tc.b0(iVar, listSubList, a(a0Var, kVarY instanceof i ? (i) kVarY : null, size));
        }
        if (size != a0Var.q().size()) {
            ee.e.n(iVar);
        }
        return new tc.b0(iVar, a0Var.q().subList(i10, a0Var.q().size()), (tc.b0) null);
    }

    public static final void b(g0 g0Var, be.c cVar, ArrayList arrayList) {
        jc.l.e(g0Var, "<this>");
        jc.l.e(cVar, "fqName");
        g0Var.a(cVar, arrayList);
    }

    public static final List c(i iVar) {
        List listO;
        Object next;
        se.k0 k0VarQ;
        List listL = iVar.L();
        jc.l.d(listL, "getDeclaredTypeParameters(...)");
        if (!iVar.d0() && !(iVar.y() instanceof b)) {
            return listL;
        }
        int i10 = ie.d.f9520a;
        ie.b bVar = ie.b.f9517b;
        List listG0 = df.m.g0(new df.i(new df.h(new df.f(df.m.Y(df.m.b0(iVar, bVar), 1), q.f26143d, 1), true, q.f26144e), q.f26145f, df.p.f6004i));
        Iterator it = df.m.Y(df.m.b0(iVar, bVar), 1).iterator();
        while (true) {
            listO = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof e) {
                break;
            }
        }
        e eVar = (e) next;
        if (eVar != null && (k0VarQ = eVar.Q()) != null) {
            listO = k0VarQ.o();
        }
        if (listO == null) {
            listO = vb.r.f22819a;
        }
        if (listG0.isEmpty() && listO.isEmpty()) {
            List listL2 = iVar.L();
            jc.l.d(listL2, "getDeclaredTypeParameters(...)");
            return listL2;
        }
        ArrayList<q0> arrayListQ0 = vb.m.q0(listG0, listO);
        ArrayList arrayList = new ArrayList(vb.n.K(arrayListQ0, 10));
        for (q0 q0Var : arrayListQ0) {
            jc.l.b(q0Var);
            arrayList.add(new d(q0Var, iVar, listL.size()));
        }
        return vb.m.q0(listL, arrayList);
    }

    public static final e d(y yVar, be.b bVar) {
        jc.l.e(yVar, "<this>");
        jc.l.e(bVar, "classId");
        h hVarE = e(yVar, bVar);
        if (hVarE instanceof e) {
            return (e) hVarE;
        }
        return null;
    }

    public static final h e(y yVar, be.b bVar) {
        jc.l.e(yVar, "<this>");
        jc.l.e(bVar, "classId");
        if (yVar.P0(ee.m.f6539a) != null) {
            throw new ClassCastException();
        }
        h0 h0VarK0 = yVar.K0(bVar.f2740a);
        be.d dVar = bVar.f2741b.f2744a;
        dVar.getClass();
        List listF = be.d.f(dVar);
        le.k kVar = ((bd.c0) h0VarK0).f2558g;
        be.e eVar = (be.e) vb.m.Y(listF);
        gd.b bVar2 = gd.b.f7520g;
        h hVarA = kVar.a(eVar, bVar2);
        if (hVarA != null) {
            for (be.e eVar2 : listF.subList(1, listF.size())) {
                if (hVarA instanceof e) {
                    h hVarA2 = ((e) hVarA).I0().a(eVar2, bVar2);
                    hVarA = hVarA2 instanceof e ? (e) hVarA2 : null;
                    if (hVarA != null) {
                    }
                }
            }
            return hVarA;
        }
        return null;
    }

    public static final e f(y yVar, be.b bVar, w1 w1Var) {
        jc.l.e(yVar, "<this>");
        jc.l.e(bVar, "classId");
        jc.l.e(w1Var, "notFoundClasses");
        e eVarD = d(yVar, bVar);
        return eVarD != null ? eVarD : w1Var.K(bVar, df.m.g0(df.m.e0(df.m.b0(bVar, r.f26147h), q.f26141b)));
    }

    public static final h g(k kVar) {
        k kVarY = kVar.y();
        if (kVarY == null || (kVar instanceof d0)) {
            return null;
        }
        if (!(kVarY.y() instanceof d0)) {
            return g(kVarY);
        }
        if (kVarY instanceof h) {
            return (h) kVarY;
        }
        return null;
    }

    public static final boolean h(g0 g0Var, be.c cVar) {
        jc.l.e(g0Var, "<this>");
        jc.l.e(cVar, "fqName");
        return g0Var.b(cVar);
    }

    public static final ArrayList i(g0 g0Var, be.c cVar) {
        jc.l.e(g0Var, "<this>");
        jc.l.e(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        b(g0Var, cVar, arrayList);
        return arrayList;
    }

    public static final e j(y yVar, be.c cVar) {
        le.o oVarI0;
        jc.l.e(yVar, "<this>");
        jc.l.e(cVar, "fqName");
        be.d dVar = cVar.f2744a;
        if (!dVar.c()) {
            le.k kVar = ((bd.c0) yVar.K0(cVar.b())).f2558g;
            be.e eVarG = dVar.g();
            gd.b bVar = gd.b.f7514a;
            h hVarA = kVar.a(eVarG, bVar);
            e eVar = hVarA instanceof e ? (e) hVarA : null;
            if (eVar != null) {
                return eVar;
            }
            e eVarJ = j(yVar, cVar.b());
            h hVarA2 = (eVarJ == null || (oVarI0 = eVarJ.I0()) == null) ? null : oVarI0.a(dVar.g(), bVar);
            if (hVarA2 instanceof e) {
                return (e) hVarA2;
            }
        }
        return null;
    }
}
