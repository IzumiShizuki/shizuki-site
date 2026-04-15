package le;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import se.p0;
import se.r0;
import yc.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f12345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f12346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ub.p f12347e;

    public t(o oVar, r0 r0Var) {
        jc.l.e(oVar, "workerScope");
        jc.l.e(r0Var, "givenSubstitutor");
        this.f12344b = oVar;
        ub.a.d(new bd.e(8, r0Var));
        p0 p0VarF = r0Var.f();
        jc.l.d(p0VarF, "getSubstitution(...)");
        this.f12345c = new r0(gh.g.U(p0VarF));
        this.f12347e = ub.a.d(new bd.e(9, this));
    }

    @Override // le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        yc.h hVarA = this.f12344b.a(eVar, bVar);
        if (hVarA != null) {
            return (yc.h) i(hVarA);
        }
        return null;
    }

    @Override // le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return h(this.f12344b.b(eVar, bVar));
    }

    @Override // le.o
    public final Set c() {
        return this.f12344b.c();
    }

    @Override // le.o
    public final Set d() {
        return this.f12344b.d();
    }

    @Override // le.q
    public final Collection e(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return (Collection) this.f12347e.getValue();
    }

    @Override // le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return h(this.f12344b.f(eVar, bVar));
    }

    @Override // le.o
    public final Set g() {
        return this.f12344b.g();
    }

    public final Collection h(Collection collection) {
        if (this.f12345c.f19981a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((yc.k) it.next()));
        }
        return linkedHashSet;
    }

    public final yc.k i(yc.k kVar) {
        r0 r0Var = this.f12345c;
        if (r0Var.f19981a.e()) {
            return kVar;
        }
        if (this.f12346d == null) {
            this.f12346d = new HashMap();
        }
        HashMap map = this.f12346d;
        jc.l.b(map);
        Object objH = map.get(kVar);
        if (objH == null) {
            if (!(kVar instanceof o0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + kVar).toString());
            }
            objH = ((o0) kVar).h(r0Var);
            if (objH == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + kVar + " substitution fails");
            }
            map.put(kVar, objH);
        }
        return (yc.k) objH;
    }
}
