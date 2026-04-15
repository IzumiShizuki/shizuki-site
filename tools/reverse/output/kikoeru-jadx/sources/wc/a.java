package wc;

import bd.c0;
import bd.h0;
import ef.n;
import ef.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n7.b0;
import vb.t;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ad.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.l f23491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f23492b;

    public a(re.l lVar, h0 h0Var) {
        jc.l.e(h0Var, "module");
        this.f23491a = lVar;
        this.f23492b = h0Var;
    }

    @Override // ad.c
    public final yc.e a(be.b bVar) {
        be.c cVar;
        l lVarA;
        jc.l.e(bVar, "classId");
        if (bVar.f2742c || bVar.g()) {
            return null;
        }
        String str = bVar.f2741b.f2744a.f2747a;
        if (!n.n0(str, "Function", false) || (lVarA = m.f23513b.a((cVar = bVar.f2740a), str)) == null) {
            return null;
        }
        k kVar = lVarA.f23511a;
        int i10 = lVarA.f23512b;
        List list = (List) b0.r(((c0) this.f23492b.K0(cVar)).f2556e, c0.f2553h[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof pe.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (vb.m.a0(arrayList2) == null) {
            return new c(this.f23491a, (pe.c) vb.m.Y(arrayList), kVar, i10);
        }
        throw new ClassCastException();
    }

    @Override // ad.c
    public final Collection b(be.c cVar) {
        jc.l.e(cVar, "packageFqName");
        return t.f22821a;
    }

    @Override // ad.c
    public final boolean c(be.c cVar, be.e eVar) {
        jc.l.e(cVar, "packageFqName");
        jc.l.e(eVar, "name");
        String strB = eVar.b();
        jc.l.d(strB, "asString(...)");
        return (u.k0(strB, "Function", false) || u.k0(strB, "KFunction", false) || u.k0(strB, "SuspendFunction", false) || u.k0(strB, "KSuspendFunction", false)) && m.f23513b.a(cVar, strB) != null;
    }
}
