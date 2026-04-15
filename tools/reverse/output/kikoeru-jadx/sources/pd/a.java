package pd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed.o f16988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f16989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd.a f16990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f16991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f16992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f16993f;

    public a(ed.o oVar, ic.k kVar) {
        jc.l.e(oVar, "jClass");
        this.f16988a = oVar;
        this.f16989b = kVar;
        bd.a aVar = new bd.a(16, this);
        this.f16990c = aVar;
        df.h hVar = new df.h(vb.m.R(oVar.d()), true, aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        df.e eVar = new df.e(hVar);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            be.e eVarC = ((ed.x) next).c();
            Object arrayList = linkedHashMap.get(eVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f16991d = linkedHashMap;
        df.h hVar2 = new df.h(vb.m.R(this.f16988a.b()), true, this.f16989b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        df.e eVar2 = new df.e(hVar2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((ed.u) next2).c(), next2);
        }
        this.f16992e = linkedHashMap2;
        ArrayList arrayListF = this.f16988a.f();
        ic.k kVar2 = this.f16989b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) kVar2.a(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iT = vb.w.t(vb.n.K(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iT < 16 ? 16 : iT);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((ed.a0) obj2).c(), obj2);
        }
        this.f16993f = linkedHashMap3;
    }

    @Override // pd.c
    public final Set a() {
        df.h hVar = new df.h(vb.m.R(this.f16988a.d()), true, this.f16990c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        df.e eVar = new df.e(hVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((ed.x) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // pd.c
    public final ed.u b(be.e eVar) {
        jc.l.e(eVar, "name");
        return (ed.u) this.f16992e.get(eVar);
    }

    @Override // pd.c
    public final Collection c(be.e eVar) {
        jc.l.e(eVar, "name");
        List list = (List) this.f16991d.get(eVar);
        return list != null ? list : vb.r.f22819a;
    }

    @Override // pd.c
    public final ed.a0 d(be.e eVar) {
        jc.l.e(eVar, "name");
        return (ed.a0) this.f16993f.get(eVar);
    }

    @Override // pd.c
    public final Set e() {
        return this.f16993f.keySet();
    }

    @Override // pd.c
    public final Set f() {
        df.h hVar = new df.h(vb.m.R(this.f16988a.b()), true, this.f16989b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        df.e eVar = new df.e(hVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((ed.u) eVar.next()).c());
        }
        return linkedHashSet;
    }
}
