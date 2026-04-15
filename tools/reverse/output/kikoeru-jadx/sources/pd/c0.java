package pd;

import b0.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f16999p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ed.o f17000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f17001o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(w1 w1Var, ed.o oVar, i iVar) {
        super(w1Var, null);
        jc.l.e(oVar, "jClass");
        this.f17000n = oVar;
        this.f17001o = iVar;
    }

    public static k0 v(k0 k0Var) {
        if (k0Var.j() != 2) {
            return k0Var;
        }
        Collection collectionA = k0Var.A();
        jc.l.d(collectionA, "getOverriddenDescriptors(...)");
        Collection<k0> collection = collectionA;
        ArrayList arrayList = new ArrayList(vb.n.K(collection, 10));
        for (k0 k0Var2 : collection) {
            jc.l.b(k0Var2);
            arrayList.add(v(k0Var2));
        }
        return (k0) vb.m.x0(vb.m.U(arrayList));
    }

    @Override // le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return null;
    }

    @Override // pd.z
    public final Set h(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return vb.t.f22821a;
    }

    @Override // pd.z
    public final Set i(le.f fVar, le.l lVar) {
        jc.l.e(fVar, "kindFilter");
        Set setJ0 = vb.m.J0(((c) this.f17096e.b()).a());
        i iVar = this.f17001o;
        c0 c0VarK = nd.h.k(iVar);
        Set setC = c0VarK != null ? c0VarK.c() : null;
        if (setC == null) {
            setC = vb.t.f22821a;
        }
        setJ0.addAll(setC);
        if (this.f17000n.f6508a.isEnum()) {
            setJ0.addAll(ud.b.x(vc.o.f22900c, vc.o.f22898a));
        }
        w1 w1Var = this.f17093b;
        setJ0.addAll(((je.a) ((od.a) w1Var.f1395c).f16338x).g(iVar, w1Var));
        return setJ0;
    }

    @Override // pd.z
    public final void j(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
        w1 w1Var = this.f17093b;
        ((je.a) ((od.a) w1Var.f1395c).f16338x).d(this.f17001o, eVar, arrayList, w1Var);
    }

    @Override // pd.z
    public final c k() {
        return new a(this.f17000n, l.f17047d);
    }

    @Override // pd.z
    public final void m(LinkedHashSet linkedHashSet, be.e eVar) {
        jc.l.e(eVar, "name");
        i iVar = this.f17001o;
        c0 c0VarK = nd.h.k(iVar);
        Collection collectionK0 = c0VarK == null ? vb.t.f22821a : vb.m.K0(c0VarK.f(eVar, gd.b.f7518e));
        od.a aVar = (od.a) this.f17093b.f1395c;
        linkedHashSet.addAll(a2.c.c0(eVar, collectionK0, linkedHashSet, this.f17001o, aVar.f16320f, ((te.l) aVar.f16335u).f20744d));
        if (this.f17000n.f6508a.isEnum()) {
            if (eVar.equals(vc.o.f22900c)) {
                linkedHashSet.add(ee.m.i(iVar));
            } else if (eVar.equals(vc.o.f22898a)) {
                linkedHashSet.add(ee.m.j(iVar));
            }
        }
    }

    @Override // pd.d0, pd.z
    public final void n(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bd.a aVar = new bd.a(18, eVar);
        i iVar = this.f17001o;
        bf.m.f(ud.b.w(iVar), a0.f16994a, new b0(iVar, linkedHashSet, aVar));
        boolean zIsEmpty = arrayList.isEmpty();
        w1 w1Var = this.f17093b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                k0 k0VarV = v((k0) obj);
                Object arrayList2 = linkedHashMap.get(k0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(k0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                od.a aVar2 = (od.a) w1Var.f1395c;
                vb.m.P(arrayList3, a2.c.c0(eVar, collection, arrayList, this.f17001o, aVar2.f16320f, ((te.l) aVar2.f16335u).f20744d));
            }
            arrayList.addAll(arrayList3);
        } else {
            od.a aVar3 = (od.a) w1Var.f1395c;
            arrayList.addAll(a2.c.c0(eVar, linkedHashSet, arrayList, this.f17001o, aVar3.f16320f, ((te.l) aVar3.f16335u).f20744d));
        }
        if (this.f17000n.f6508a.isEnum() && eVar.equals(vc.o.f22899b)) {
            bf.m.a(arrayList, ee.m.h(iVar));
        }
    }

    @Override // pd.z
    public final Set o(le.f fVar) {
        jc.l.e(fVar, "kindFilter");
        Set setJ0 = vb.m.J0(((c) this.f17096e.b()).f());
        l lVar = l.f17048e;
        i iVar = this.f17001o;
        bf.m.f(ud.b.w(iVar), a0.f16994a, new b0(iVar, setJ0, lVar));
        if (this.f17000n.f6508a.isEnum()) {
            setJ0.add(vc.o.f22899b);
        }
        return setJ0;
    }

    @Override // pd.z
    public final yc.k q() {
        return this.f17001o;
    }
}
