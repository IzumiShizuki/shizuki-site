package qe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jc.a0;
import jc.z;
import n7.b0;
import q.t0;
import yc.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends le.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f18206f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe.k f18207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f18208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f18209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.h f18210e;

    static {
        jc.s sVar = new jc.s(o.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        a0 a0Var = z.f10839a;
        f18206f = new pc.u[]{a0Var.g(sVar), t0.H(o.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, a0Var)};
    }

    public o(oe.k kVar, List list, List list2, List list3, ic.a aVar) {
        jc.l.e(kVar, "c");
        jc.l.e(list, "functionList");
        jc.l.e(list2, "propertyList");
        jc.l.e(list3, "typeAliasList");
        this.f18207b = kVar;
        oe.i iVar = kVar.f16390a;
        iVar.f16366c.getClass();
        this.f18208c = new n(this, list, list2, list3);
        re.l lVar = iVar.f16364a;
        le.j jVar = new le.j(1, aVar);
        lVar.getClass();
        this.f18209d = new re.i(lVar, jVar);
        bd.e eVar = new bd.e(15, this);
        lVar.getClass();
        this.f18210e = new re.h(lVar, eVar);
    }

    @Override // le.p, le.q
    public yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        if (q(eVar)) {
            return this.f18207b.f16390a.b(l(eVar));
        }
        n nVar = this.f18208c;
        if (!nVar.f18199c.keySet().contains(eVar)) {
            return null;
        }
        nVar.getClass();
        return (p0) nVar.f18202f.a(eVar);
    }

    @Override // le.p, le.o
    public Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        n nVar = this.f18208c;
        nVar.getClass();
        jc.l.e(eVar, "name");
        return !((Set) b0.r(nVar.f18204h, n.f18196j[1])).contains(eVar) ? vb.r.f22819a : (Collection) nVar.f18201e.a(eVar);
    }

    @Override // le.p, le.o
    public final Set c() {
        return (Set) b0.r(this.f18208c.f18203g, n.f18196j[0]);
    }

    @Override // le.p, le.o
    public final Set d() {
        pc.u uVar = f18206f[1];
        re.h hVar = this.f18210e;
        jc.l.e(hVar, "<this>");
        jc.l.e(uVar, "p");
        return (Set) hVar.b();
    }

    @Override // le.p, le.o
    public Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        n nVar = this.f18208c;
        nVar.getClass();
        jc.l.e(eVar, "name");
        return !((Set) b0.r(nVar.f18203g, n.f18196j[0])).contains(eVar) ? vb.r.f22819a : (Collection) nVar.f18200d.a(eVar);
    }

    @Override // le.p, le.o
    public final Set g() {
        return (Set) b0.r(this.f18208c.f18204h, n.f18196j[1]);
    }

    public abstract void h(ArrayList arrayList, ic.k kVar);

    public final Collection i(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(le.f.f12303f)) {
            h(arrayList, kVar);
        }
        n nVar = this.f18208c;
        nVar.getClass();
        re.i iVar = nVar.f18203g;
        re.i iVar2 = nVar.f18204h;
        boolean zA = fVar.a(le.f.f12307j);
        vb.r rVar = vb.r.f22819a;
        ee.h hVar = ee.h.f6526b;
        if (zA) {
            Set<be.e> set = (Set) b0.r(iVar2, n.f18196j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (be.e eVar : set) {
                if (((Boolean) kVar.a(eVar)).booleanValue()) {
                    jc.l.e(eVar, "name");
                    arrayList2.addAll(!((Set) b0.r(iVar2, n.f18196j[1])).contains(eVar) ? rVar : (Collection) nVar.f18201e.a(eVar));
                }
            }
            vb.p.M(arrayList2, hVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(le.f.f12306i)) {
            Set<be.e> set2 = (Set) b0.r(iVar, n.f18196j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (be.e eVar2 : set2) {
                if (((Boolean) kVar.a(eVar2)).booleanValue()) {
                    jc.l.e(eVar2, "name");
                    arrayList3.addAll(!((Set) b0.r(iVar, n.f18196j[0])).contains(eVar2) ? rVar : (Collection) nVar.f18200d.a(eVar2));
                }
            }
            vb.p.M(arrayList3, hVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(le.f.f12309l)) {
            for (be.e eVar3 : m()) {
                if (((Boolean) kVar.a(eVar3)).booleanValue()) {
                    bf.m.a(arrayList, this.f18207b.f16390a.b(l(eVar3)));
                }
            }
        }
        if (fVar.a(le.f.f12304g)) {
            for (be.e eVar4 : nVar.f18199c.keySet()) {
                if (((Boolean) kVar.a(eVar4)).booleanValue()) {
                    nVar.getClass();
                    jc.l.e(eVar4, "name");
                    bf.m.a(arrayList, (p0) nVar.f18202f.a(eVar4));
                }
            }
        }
        return bf.m.d(arrayList);
    }

    public void j(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
    }

    public void k(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
    }

    public abstract be.b l(be.e eVar);

    public final Set m() {
        return (Set) b0.r(this.f18209d, f18206f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(be.e eVar) {
        jc.l.e(eVar, "name");
        return m().contains(eVar);
    }

    public boolean r(r rVar) {
        return true;
    }
}
