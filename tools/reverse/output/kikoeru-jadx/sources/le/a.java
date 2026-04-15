package le;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import pc.f0;
import yc.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o[] f12294c;

    public a(String str, o[] oVarArr) {
        this.f12293b = str;
        this.f12294c = oVarArr;
    }

    @Override // le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        yc.h hVar = null;
        for (o oVar : this.f12294c) {
            yc.h hVarA = oVar.a(eVar, bVar);
            if (hVarA != null) {
                if (!(hVarA instanceof yc.i) || !((w) hVarA).c0()) {
                    return hVarA;
                }
                if (hVar == null) {
                    hVar = hVarA;
                }
            }
        }
        return hVar;
    }

    @Override // le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        o[] oVarArr = this.f12294c;
        int length = oVarArr.length;
        if (length == 0) {
            return vb.r.f22819a;
        }
        if (length == 1) {
            return oVarArr[0].b(eVar, bVar);
        }
        Collection collectionR = null;
        for (o oVar : oVarArr) {
            collectionR = g8.a.r(collectionR, oVar.b(eVar, bVar));
        }
        return collectionR == null ? vb.t.f22821a : collectionR;
    }

    @Override // le.o
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f12294c) {
            vb.m.P(linkedHashSet, oVar.c());
        }
        return linkedHashSet;
    }

    @Override // le.o
    public final Set d() {
        return f0.y(vb.l.b0(this.f12294c));
    }

    @Override // le.q
    public final Collection e(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        o[] oVarArr = this.f12294c;
        int length = oVarArr.length;
        if (length == 0) {
            return vb.r.f22819a;
        }
        if (length == 1) {
            return oVarArr[0].e(fVar, kVar);
        }
        Collection collectionR = null;
        for (o oVar : oVarArr) {
            collectionR = g8.a.r(collectionR, oVar.e(fVar, kVar));
        }
        return collectionR == null ? vb.t.f22821a : collectionR;
    }

    @Override // le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        o[] oVarArr = this.f12294c;
        int length = oVarArr.length;
        if (length == 0) {
            return vb.r.f22819a;
        }
        if (length == 1) {
            return oVarArr[0].f(eVar, bVar);
        }
        Collection collectionR = null;
        for (o oVar : oVarArr) {
            collectionR = g8.a.r(collectionR, oVar.f(eVar, bVar));
        }
        return collectionR == null ? vb.t.f22821a : collectionR;
    }

    @Override // le.o
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f12294c) {
            vb.m.P(linkedHashSet, oVar.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.f12293b;
    }
}
