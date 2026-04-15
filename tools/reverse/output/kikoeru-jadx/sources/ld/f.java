package ld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f12211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f12212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f12213d;

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    static {
        be.d dVar = vc.n.f22881j;
        ub.k kVar = new ub.k(dVar.a(be.e.e("name")).i(), vc.o.f22901d);
        ub.k kVar2 = new ub.k(dVar.a(be.e.e("ordinal")).i(), be.e.e("ordinal"));
        ub.k kVar3 = new ub.k(lc.b.h(vc.n.C, "size"), be.e.e("size"));
        be.c cVar = vc.n.G;
        Map mapV = vb.w.v(kVar, kVar2, kVar3, new ub.k(lc.b.h(cVar, "size"), be.e.e("size")), new ub.k(vc.n.f22873e.a(be.e.e("length")).i(), be.e.e("length")), new ub.k(lc.b.h(cVar, "keys"), be.e.e("keySet")), new ub.k(lc.b.h(cVar, "values"), be.e.e("values")), new ub.k(lc.b.h(cVar, "entries"), be.e.e("entrySet")), new ub.k(lc.b.h(vc.n.f22866a0, "size"), be.e.e("length")), new ub.k(lc.b.h(vc.n.f22868b0, "size"), be.e.e("length")), new ub.k(lc.b.h(vc.n.f22870c0, "size"), be.e.e("length")));
        f12210a = mapV;
        Set<Map.Entry> setEntrySet = mapV.entrySet();
        ArrayList<ub.k> arrayList = new ArrayList(vb.n.K(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new ub.k(((be.c) entry.getKey()).f2744a.g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ub.k kVar4 : arrayList) {
            be.e eVar = (be.e) kVar4.f21544b;
            Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((List) arrayList2).add((be.e) kVar4.f21543a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(vb.w.t(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), vb.m.U((Iterable) entry2.getValue()));
        }
        f12211b = linkedHashMap2;
        ?? r0 = f12210a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            String str = xc.d.f24905a;
            be.b bVarF = xc.d.f(((be.c) entry3.getKey()).b().f2744a);
            jc.l.b(bVarF);
            linkedHashSet.add(bVarF.a().a((be.e) entry3.getValue()));
        }
        Set setKeySet = f12210a.keySet();
        f12212c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(vb.n.K(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((be.c) it.next()).f2744a.g());
        }
        f12213d = vb.m.K0(arrayList3);
    }
}
