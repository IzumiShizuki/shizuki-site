package bd;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends le.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.e f2672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.e f2673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f2674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f2675e;

    public u(v vVar, re.o oVar) {
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f2675e = vVar;
        re.l lVar = (re.l) oVar;
        this.f2672b = lVar.b(new s(this, 0));
        this.f2673c = lVar.b(new s(this, 1));
        this.f2674d = new re.i(lVar, new e(2, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.u.h(int):void");
    }

    @Override // le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        if (eVar != null) {
            return (Collection) this.f2673c.a(eVar);
        }
        h(1);
        throw null;
    }

    @Override // le.p, le.o
    public final Set c() {
        Set set = (Set) this.f2675e.f2678i.b();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // le.p, le.o
    public final Set d() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // le.p, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.f2674d.b();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // le.p, le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        if (eVar != null) {
            return (Collection) this.f2672b.a(eVar);
        }
        h(5);
        throw null;
    }

    @Override // le.p, le.o
    public final Set g() {
        Set set = (Set) this.f2675e.f2678i.b();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final le.o i() {
        le.o oVarN0 = ((se.w) ((se.f) this.f2675e.Q()).i().iterator().next()).n0();
        if (oVarN0 != null) {
            return oVarN0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(be.e eVar, Collection collection) {
        if (eVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ee.l.f6536c.h(eVar, collection, Collections.EMPTY_SET, this.f2675e, new t(linkedHashSet, 0));
        return linkedHashSet;
    }
}
