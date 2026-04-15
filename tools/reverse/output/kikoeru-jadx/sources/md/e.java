package md;

import ed.t;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import jc.l;
import ub.k;
import vb.w;
import zc.m;
import zc.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15110a = w.v(new k("PACKAGE", EnumSet.noneOf(n.class)), new k("TYPE", EnumSet.of(n.f26711c, n.f26723o)), new k("ANNOTATION_TYPE", EnumSet.of(n.f26712d)), new k("TYPE_PARAMETER", EnumSet.of(n.f26713e)), new k("FIELD", EnumSet.of(n.f26715g)), new k("LOCAL_VARIABLE", EnumSet.of(n.f26716h)), new k("PARAMETER", EnumSet.of(n.f26717i)), new k("CONSTRUCTOR", EnumSet.of(n.f26718j)), new k("METHOD", EnumSet.of(n.f26719k, n.f26720l, n.f26721m)), new k("TYPE_USE", EnumSet.of(n.f26722n)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f15111b = w.v(new k("RUNTIME", m.f26706a), new k("CLASS", m.f26707b), new k("SOURCE", m.f26708c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static ge.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f15110a.get(be.e.e(((t) it.next()).f6513b.name()).b());
            if (iterable == null) {
                iterable = vb.t.f22821a;
            }
            vb.m.P(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList2, 10));
        for (n nVar : arrayList2) {
            be.c cVar = vc.n.f22892u;
            l.e(cVar, "topLevelFqName");
            arrayList3.add(new ge.i(new be.b(cVar.b(), cVar.f2744a.g()), be.e.e(nVar.name())));
        }
        return new ge.b(arrayList3, d.f15109a);
    }
}
