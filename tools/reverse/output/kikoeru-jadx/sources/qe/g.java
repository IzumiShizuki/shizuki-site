package qe;

import b0.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import se.w;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te.f f18166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final re.i f18167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final re.i f18168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f18169j;

    public g(h hVar, te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        this.f18169j = hVar;
        oe.k kVar = hVar.f18177l;
        wd.k kVar2 = hVar.f18170e;
        List list = kVar2.f23817q;
        jc.l.d(list, "getFunctionList(...)");
        List list2 = kVar2.f23818r;
        jc.l.d(list2, "getPropertyList(...)");
        List list3 = kVar2.f23819s;
        jc.l.d(list3, "getTypeAliasList(...)");
        List list4 = kVar2.f23811k;
        jc.l.d(list4, "getNestedClassNameList(...)");
        List list5 = list4;
        yd.f fVar2 = hVar.f18177l.f16391b;
        ArrayList arrayList = new ArrayList(vb.n.K(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(x0.r(fVar2, ((Number) it.next()).intValue()));
        }
        super(kVar, list, list2, list3, new e(0, arrayList));
        oe.i iVar = kVar.f16390a;
        this.f18166g = fVar;
        re.l lVar = iVar.f16364a;
        f fVar3 = new f(this, 0);
        lVar.getClass();
        this.f18167h = new re.i(lVar, fVar3);
        re.l lVar2 = iVar.f16364a;
        f fVar4 = new f(this, 1);
        lVar2.getClass();
        this.f18168i = new re.i(lVar2, fVar4);
    }

    @Override // qe.o, le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        yc.e eVar2;
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        s(eVar, bVar);
        w1 w1Var = this.f18169j.f18181p;
        return (w1Var == null || (eVar2 = (yc.e) ((re.j) w1Var.f1396d).a(eVar)) == null) ? super.a(eVar, bVar) : eVar2;
    }

    @Override // qe.o, le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        s(eVar, bVar);
        return super.b(eVar, bVar);
    }

    @Override // le.p, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return (Collection) this.f18167h.b();
    }

    @Override // qe.o, le.p, le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        s(eVar, bVar);
        return super.f(eVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [vb.r] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // qe.o
    public final void h(ArrayList arrayList, ic.k kVar) {
        ?? arrayList2;
        w1 w1Var = this.f18169j.f18181p;
        if (w1Var != null) {
            Set<be.e> setKeySet = ((LinkedHashMap) w1Var.f1395c).keySet();
            arrayList2 = new ArrayList();
            for (be.e eVar : setKeySet) {
                jc.l.e(eVar, "name");
                yc.e eVar2 = (yc.e) ((re.j) w1Var.f1396d).a(eVar);
                if (eVar2 != null) {
                    arrayList2.add(eVar2);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = vb.r.f22819a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // qe.o
    public final void j(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f18168i.b()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((w) it.next()).n0().f(eVar, gd.b.f7516c));
        }
        oe.k kVar = this.f18207b;
        arrayList.addAll(kVar.f16390a.f16377n.d(eVar, this.f18169j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((te.l) kVar.f16390a.f16380q).f20744d.h(eVar, arrayList2, arrayList3, this.f18169j, new bd.t(arrayList, 1));
    }

    @Override // qe.o
    public final void k(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f18168i.b()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((w) it.next()).n0().b(eVar, gd.b.f7516c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((te.l) this.f18207b.f16390a.f16380q).f20744d.h(eVar, arrayList2, arrayList3, this.f18169j, new bd.t(arrayList, 1));
    }

    @Override // qe.o
    public final be.b l(be.e eVar) {
        jc.l.e(eVar, "name");
        return this.f18169j.f18173h.d(eVar);
    }

    @Override // qe.o
    public final Set n() {
        List listI = this.f18169j.f18179n.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            Set setD = ((w) it.next()).n0().d();
            if (setD == null) {
                return null;
            }
            vb.m.P(linkedHashSet, setD);
        }
        return linkedHashSet;
    }

    @Override // qe.o
    public final Set o() {
        h hVar = this.f18169j;
        List listI = hVar.f18179n.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            vb.m.P(linkedHashSet, ((w) it.next()).n0().c());
        }
        linkedHashSet.addAll(this.f18207b.f16390a.f16377n.b(hVar));
        return linkedHashSet;
    }

    @Override // qe.o
    public final Set p() {
        List listI = this.f18169j.f18179n.i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            vb.m.P(linkedHashSet, ((w) it.next()).n0().g());
        }
        return linkedHashSet;
    }

    @Override // qe.o
    public final boolean r(r rVar) {
        return this.f18207b.f16390a.f16378o.e(this.f18169j, rVar);
    }

    public final void s(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        jc.l.e(this.f18207b.f16390a.f16372i, "<this>");
        jc.l.e(this.f18169j, "scopeOwner");
    }
}
