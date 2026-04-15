package vc;

import bd.i0;
import bd.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import se.x0;
import yc.t;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f22915a;

    static {
        ue.l lVar = ue.l.f21664a;
        bd.r rVar = new bd.r(ue.l.f21665b, o.f22903f, 0);
        be.e eVarG = o.f22904g.f2744a.g();
        re.b bVar = re.l.f19010e;
        i0 i0Var = new i0(rVar, eVarG, bVar);
        i0Var.f2588h = x.f26158e;
        ld.o oVar = yc.o.f26129e;
        if (oVar == null) {
            i0.k(9);
            throw null;
        }
        i0Var.f2589i = oVar;
        List listW = ud.b.w(w0.G1(i0Var, x0.IN_VARIANCE, be.e.e("T"), 0, bVar));
        if (i0Var.f2591k != null) {
            throw new IllegalStateException("Type parameters are already set for " + i0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listW);
        i0Var.f2591k = arrayList;
        i0Var.f2590j = new se.i(i0Var, arrayList, i0Var.f2592l, i0Var.f2593m);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            i0.k(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((bd.l) ((t) it.next())).f2717g = i0Var.E();
        }
        f22915a = i0Var;
    }
}
