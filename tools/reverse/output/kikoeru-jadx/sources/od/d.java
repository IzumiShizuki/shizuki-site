package od;

import b0.w1;
import bd.i;
import ed.y;
import ic.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import pd.p;
import re.g;
import re.l;
import ub.f;
import vb.r;
import yc.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f16345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.e f16346b;

    public d(a aVar) {
        this.f16345a = new w1(aVar, b.f16340b, new f());
        l lVar = (l) aVar.f16315a;
        lVar.getClass();
        this.f16346b = new re.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new re.f(), 0);
    }

    @Override // yc.g0
    public final void a(be.c cVar, ArrayList arrayList) {
        jc.l.e(cVar, "fqName");
        arrayList.add(c(cVar));
    }

    @Override // yc.g0
    public final boolean b(be.c cVar) {
        jc.l.e(cVar, "fqName");
        ((a) this.f16345a.f1395c).f16316b.getClass();
        return false;
    }

    public final p c(be.c cVar) throws Throwable {
        ((a) this.f16345a.f1395c).f16316b.getClass();
        jc.l.e(cVar, "fqName");
        i iVar = new i(8, this, new y(cVar), false);
        re.e eVar = this.f16346b;
        eVar.getClass();
        Object objA = eVar.a(new g(cVar, iVar));
        if (objA != null) {
            return (p) objA;
        }
        re.e.f(3);
        throw null;
    }

    @Override // yc.g0
    public final Collection p(be.c cVar, k kVar) {
        jc.l.e(cVar, "fqName");
        Collection collection = (List) c(cVar).f17069k.b();
        if (collection == null) {
            collection = r.f22819a;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f16345a.f1395c).f16329o;
    }
}
