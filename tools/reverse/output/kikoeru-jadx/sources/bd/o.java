package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements yc.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2625b;

    public o(List list, String str) {
        jc.l.e(str, "debugName");
        this.f2624a = list;
        this.f2625b = str;
        list.size();
        vb.m.K0(list).size();
    }

    @Override // yc.g0
    public final void a(be.c cVar, ArrayList arrayList) {
        jc.l.e(cVar, "fqName");
        Iterator it = this.f2624a.iterator();
        while (it.hasNext()) {
            yc.v.b((yc.g0) it.next(), cVar, arrayList);
        }
    }

    @Override // yc.g0
    public final boolean b(be.c cVar) {
        jc.l.e(cVar, "fqName");
        List list = this.f2624a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!yc.v.h((yc.g0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // yc.g0
    public final Collection p(be.c cVar, ic.k kVar) {
        jc.l.e(cVar, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f2624a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((yc.g0) it.next()).p(cVar, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f2625b;
    }
}
