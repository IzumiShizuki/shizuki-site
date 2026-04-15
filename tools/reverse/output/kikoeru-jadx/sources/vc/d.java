package vc;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f22831a;

    static {
        Set<k> set = k.f22846e;
        ArrayList arrayList = new ArrayList(vb.n.K(set, 10));
        for (k kVar : set) {
            jc.l.e(kVar, "primitiveType");
            arrayList.add(o.f22908k.a(kVar.f22856a));
        }
        ArrayList<be.c> arrayListR0 = vb.m.r0(vb.m.r0(vb.m.r0(arrayList, n.f22875f.i()), n.f22879h.i()), n.f22881j.i());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (be.c cVar : arrayListR0) {
            jc.l.e(cVar, "topLevelFqName");
            linkedHashSet.add(new be.b(cVar.b(), cVar.f2744a.g()));
        }
        f22831a = linkedHashSet;
    }
}
