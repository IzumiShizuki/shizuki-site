package yc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26116a;

    public f0(ArrayList arrayList) {
        this.f26116a = arrayList;
    }

    @Override // yc.g0
    public final void a(be.c cVar, ArrayList arrayList) {
        jc.l.e(cVar, "fqName");
        for (Object obj : this.f26116a) {
            if (jc.l.a(((bd.j0) ((d0) obj)).f2596e, cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // yc.g0
    public final boolean b(be.c cVar) {
        jc.l.e(cVar, "fqName");
        ArrayList arrayList = this.f26116a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (jc.l.a(((bd.j0) ((d0) it.next())).f2596e, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // yc.g0
    public final Collection p(be.c cVar, ic.k kVar) {
        jc.l.e(cVar, "fqName");
        return df.m.g0(new df.h(df.m.e0(vb.m.R(this.f26116a), q.f26142c), true, new e0(cVar, 0)));
    }
}
