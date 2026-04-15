package le;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import yc.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12324b;

    public i(o oVar) {
        jc.l.e(oVar, "workerScope");
        this.f12324b = oVar;
    }

    @Override // le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        yc.h hVarA = this.f12324b.a(eVar, bVar);
        if (hVarA != null) {
            yc.e eVar2 = hVarA instanceof yc.e ? (yc.e) hVarA : null;
            if (eVar2 != null) {
                return eVar2;
            }
            if (hVarA instanceof p0) {
                return (p0) hVarA;
            }
        }
        return null;
    }

    @Override // le.p, le.o
    public final Set c() {
        return this.f12324b.c();
    }

    @Override // le.p, le.o
    public final Set d() {
        return this.f12324b.d();
    }

    @Override // le.p, le.q
    public final Collection e(f fVar, ic.k kVar) {
        Collection collection;
        jc.l.e(fVar, "kindFilter");
        int i10 = f.f12309l & fVar.f12318b;
        f fVar2 = i10 == 0 ? null : new f(i10, fVar.f12317a);
        if (fVar2 == null) {
            collection = vb.r.f22819a;
        } else {
            Collection collectionE = this.f12324b.e(fVar2, kVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionE) {
                if (obj instanceof yc.i) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // le.p, le.o
    public final Set g() {
        return this.f12324b.g();
    }

    public final String toString() {
        return "Classes from " + this.f12324b;
    }
}
