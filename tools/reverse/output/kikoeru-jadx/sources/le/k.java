package le;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12327b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12328c;

    public k(o oVar) {
        this.f12328c = oVar;
    }

    @Override // le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return l().a(eVar, bVar);
    }

    @Override // le.o
    public Collection b(be.e eVar, gd.b bVar) {
        switch (this.f12327b) {
            case 1:
                jc.l.e(eVar, "name");
                return ee.m.o(k(eVar, bVar), l.f12331d);
            default:
                return k(eVar, bVar);
        }
    }

    @Override // le.o
    public final Set c() {
        return l().c();
    }

    @Override // le.o
    public final Set d() {
        return l().d();
    }

    @Override // le.q
    public Collection e(f fVar, ic.k kVar) {
        switch (this.f12327b) {
            case 1:
                jc.l.e(fVar, "kindFilter");
                Collection collectionI = i(fVar, kVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((yc.k) obj) instanceof yc.b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return vb.m.q0(ee.m.o(arrayList, l.f12332e), arrayList2);
            default:
                return i(fVar, kVar);
        }
    }

    @Override // le.o
    public Collection f(be.e eVar, gd.b bVar) {
        switch (this.f12327b) {
            case 1:
                jc.l.e(eVar, "name");
                return ee.m.o(j(eVar, bVar), l.f12330c);
            default:
                return j(eVar, bVar);
        }
    }

    @Override // le.o
    public final Set g() {
        return l().g();
    }

    public final o h() {
        if (!(l() instanceof k)) {
            return l();
        }
        o oVarL = l();
        jc.l.c(oVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((k) oVarL).h();
    }

    public final Collection i(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return l().e(fVar, kVar);
    }

    public final Collection j(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return l().f(eVar, bVar);
    }

    public final Collection k(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return l().b(eVar, bVar);
    }

    public final o l() {
        switch (this.f12327b) {
            case 0:
                return (o) ((re.i) this.f12328c).b();
            default:
                return (o) this.f12328c;
        }
    }

    public k(re.o oVar, ic.a aVar) {
        jc.l.e(oVar, "storageManager");
        this.f12328c = new re.i((re.l) oVar, new j(0, aVar));
    }
}
