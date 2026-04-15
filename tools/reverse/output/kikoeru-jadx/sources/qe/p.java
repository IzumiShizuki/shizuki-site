package qe;

import bd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import wd.f0;
import wd.g1;
import wd.z0;
import yc.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f18211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final be.c f18213i;

    public p(d0 d0Var, f0 f0Var, yd.f fVar, yd.a aVar, ud.i iVar, oe.i iVar2, String str, ic.a aVar2) {
        jc.l.e(f0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(aVar, "metadataVersion");
        jc.l.e(iVar2, "components");
        jc.l.e(str, "debugName");
        z0 z0Var = f0Var.f23673g;
        jc.l.d(z0Var, "getTypeTable(...)");
        bd.f0 f0Var2 = new bd.f0(z0Var);
        yd.i iVar3 = yd.i.f26206b;
        g1 g1Var = f0Var.f23674h;
        jc.l.d(g1Var, "getVersionRequirementTable(...)");
        oe.k kVarA = iVar2.a(d0Var, fVar, f0Var2, ud.n.c(g1Var), aVar, iVar);
        List list = f0Var.f23670d;
        jc.l.d(list, "getFunctionList(...)");
        List list2 = f0Var.f23671e;
        jc.l.d(list2, "getPropertyList(...)");
        List list3 = f0Var.f23672f;
        jc.l.d(list3, "getTypeAliasList(...)");
        super(kVarA, list, list2, list3, aVar2);
        this.f18211g = d0Var;
        this.f18212h = str;
        this.f18213i = ((j0) d0Var).f2596e;
    }

    @Override // qe.o, le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        g8.a.V(this.f18207b.f16390a.f16372i, bVar, this.f18211g, eVar);
        return super.a(eVar, bVar);
    }

    @Override // le.p, le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        Collection collectionI = i(fVar, kVar);
        Iterable iterable = this.f18207b.f16390a.f16374k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            vb.m.P(arrayList, ((ad.c) it.next()).b(this.f18213i));
        }
        return vb.m.q0(collectionI, arrayList);
    }

    @Override // qe.o
    public final be.b l(be.e eVar) {
        jc.l.e(eVar, "name");
        return new be.b(this.f18213i, eVar);
    }

    @Override // qe.o
    public final Set n() {
        return vb.t.f22821a;
    }

    @Override // qe.o
    public final Set o() {
        return vb.t.f22821a;
    }

    @Override // qe.o
    public final Set p() {
        return vb.t.f22821a;
    }

    @Override // qe.o
    public final boolean q(be.e eVar) {
        jc.l.e(eVar, "name");
        if (super.q(eVar)) {
            return true;
        }
        Iterable iterable = this.f18207b.f16390a.f16374k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((ad.c) it.next()).c(this.f18213i, eVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f18212h;
    }

    @Override // qe.o
    public final void h(ArrayList arrayList, ic.k kVar) {
    }
}
