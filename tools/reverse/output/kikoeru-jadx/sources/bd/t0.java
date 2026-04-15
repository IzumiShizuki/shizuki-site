package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends le.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc.y f2670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.c f2671c;

    public t0(yc.y yVar, be.c cVar) {
        jc.l.e(yVar, "moduleDescriptor");
        jc.l.e(cVar, "fqName");
        this.f2670b = yVar;
        this.f2671c = cVar;
    }

    @Override // le.p, le.o
    public final Set d() {
        return vb.t.f22821a;
    }

    @Override // le.p, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        if (fVar.a(le.f.f12305h)) {
            be.c cVar = this.f2671c;
            if (!cVar.f2744a.c() || !fVar.f12317a.contains(le.c.f12297a)) {
                yc.y yVar = this.f2670b;
                Collection collectionP = yVar.p(cVar, kVar);
                ArrayList arrayList = new ArrayList(collectionP.size());
                Iterator it = collectionP.iterator();
                while (it.hasNext()) {
                    be.e eVarG = ((be.c) it.next()).f2744a.g();
                    if (((Boolean) kVar.a(eVarG)).booleanValue()) {
                        c0 c0Var = null;
                        if (!eVarG.f2752b) {
                            c0 c0Var2 = (c0) yVar.K0(cVar.a(eVarG));
                            if (!((Boolean) n7.b0.r(c0Var2.f2557f, c0.f2553h[1])).booleanValue()) {
                                c0Var = c0Var2;
                            }
                        }
                        bf.m.a(arrayList, c0Var);
                    }
                }
                return arrayList;
            }
        }
        return vb.r.f22819a;
    }

    public final String toString() {
        return "subpackages of " + this.f2671c + " from " + this.f2670b;
    }
}
