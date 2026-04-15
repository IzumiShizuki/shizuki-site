package vc;

import bd.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import se.u0;
import vb.w;
import yc.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f22927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f22928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f22929d;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.f22924b);
        }
        f22926a = vb.m.K0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.f22921a);
        }
        vb.m.K0(arrayList2);
        f22927b = new HashMap();
        f22928c = new HashMap();
        w.y(new HashMap(w.t(4)), new ub.k[]{new ub.k(q.UBYTEARRAY, be.e.e("ubyteArrayOf")), new ub.k(q.USHORTARRAY, be.e.e("ushortArrayOf")), new ub.k(q.UINTARRAY, be.e.e("uintArrayOf")), new ub.k(q.ULONGARRAY, be.e.e("ulongArrayOf"))});
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.f22925c.f());
        }
        f22929d = linkedHashSet;
        for (r rVar3 : r.values()) {
            HashMap map = f22927b;
            be.b bVar = rVar3.f22925c;
            be.b bVar2 = rVar3.f22923a;
            map.put(bVar, bVar2);
            f22928c.put(bVar2, rVar3.f22925c);
        }
    }

    public static final boolean a(se.w wVar) {
        yc.h hVarH;
        if (u0.l(wVar) || (hVarH = wVar.t().h()) == null) {
            return false;
        }
        yc.k kVarY = hVarH.y();
        return (kVarY instanceof d0) && jc.l.a(((j0) ((d0) kVarY)).f2596e, o.f22908k) && f22926a.contains(hVarH.getName());
    }
}
