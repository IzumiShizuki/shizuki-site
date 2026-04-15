package pd;

import b0.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ed.y f17076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f17077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final re.h f17078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final re.j f17079q;

    public u(w1 w1Var, ed.y yVar, p pVar) {
        super(w1Var, null);
        this.f17076n = yVar;
        this.f17077o = pVar;
        re.o oVar = ((od.a) w1Var.f1395c).f16315a;
        bd.i iVar = new bd.i(10, w1Var, this, false);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17078p = new re.h(lVar, iVar);
        this.f17079q = ((re.l) oVar).c(new ee.j(4, this, w1Var));
    }

    @Override // le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return v(eVar, null);
    }

    @Override // pd.z, le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return vb.r.f22819a;
    }

    @Override // pd.z, le.p, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        if (!fVar.a(le.f.f12309l | le.f.f12302e)) {
            return vb.r.f22819a;
        }
        Iterable iterable = (Iterable) this.f17095d.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            yc.k kVar2 = (yc.k) obj;
            if (kVar2 instanceof yc.e) {
                be.e name = ((yc.e) kVar2).getName();
                jc.l.d(name, "getName(...)");
                if (((Boolean) kVar.a(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // pd.z
    public final Set h(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        if (!fVar.a(le.f.f12302e)) {
            return vb.t.f22821a;
        }
        Set set = (Set) this.f17078p.b();
        if (set == null) {
            this.f17076n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(be.e.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // pd.z
    public final Set i(le.f fVar, le.l lVar) {
        jc.l.e(fVar, "kindFilter");
        return vb.t.f22821a;
    }

    @Override // pd.z
    public final c k() {
        return b.f16995a;
    }

    @Override // pd.z
    public final void m(LinkedHashSet linkedHashSet, be.e eVar) {
        jc.l.e(eVar, "name");
    }

    @Override // pd.z
    public final Set o(le.f fVar) {
        jc.l.e(fVar, "kindFilter");
        return vb.t.f22821a;
    }

    @Override // pd.z
    public final yc.k q() {
        return this.f17077o;
    }

    public final yc.e v(be.e eVar, ed.o oVar) {
        be.e eVar2 = be.g.f2755a;
        jc.l.e(eVar, "name");
        String strB = eVar.b();
        jc.l.d(strB, "asString(...)");
        if (strB.length() <= 0 || eVar.f2752b) {
            return null;
        }
        Set set = (Set) this.f17078p.b();
        if (oVar == null && set != null && !set.contains(eVar.b())) {
            return null;
        }
        return (yc.e) this.f17079q.a(new q(eVar, oVar));
    }
}
