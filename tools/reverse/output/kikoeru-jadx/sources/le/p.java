package le;

import bd.s0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements o {
    @Override // le.q
    public yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return null;
    }

    @Override // le.o
    public Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return vb.r.f22819a;
    }

    @Override // le.o
    public Set c() {
        Collection collectionE = e(f.f12313p, bf.c.f2795a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof s0) {
                be.e name = ((s0) obj).getName();
                jc.l.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // le.o
    public Set d() {
        return null;
    }

    @Override // le.q
    public Collection e(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return vb.r.f22819a;
    }

    @Override // le.o
    public Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return vb.r.f22819a;
    }

    @Override // le.o
    public Set g() {
        Collection collectionE = e(f.f12314q, bf.c.f2795a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof s0) {
                be.e name = ((s0) obj).getName();
                jc.l.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
