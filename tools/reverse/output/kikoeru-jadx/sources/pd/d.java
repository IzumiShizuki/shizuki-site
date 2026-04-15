package pd;

import b0.w1;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements le.o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f17002f = {jc.z.f10839a.g(new jc.s(d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f17003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f17004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f17005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.i f17006e;

    public d(w1 w1Var, ed.y yVar, p pVar) {
        this.f17003b = w1Var;
        this.f17004c = pVar;
        this.f17005d = new u(w1Var, yVar, pVar);
        re.o oVar = ((od.a) w1Var.f1395c).f16315a;
        bd.e eVar = new bd.e(13, this);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17006e = new re.i(lVar, eVar);
    }

    @Override // le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        i(eVar, bVar);
        u uVar = this.f17005d;
        uVar.getClass();
        yc.h hVar = null;
        yc.e eVarV = uVar.v(eVar, null);
        if (eVarV != null) {
            return eVarV;
        }
        for (le.o oVar : h()) {
            yc.h hVarA = oVar.a(eVar, bVar);
            if (hVarA != null) {
                if (!(hVarA instanceof yc.i) || !((yc.w) hVarA).c0()) {
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
        i(eVar, bVar);
        le.o[] oVarArrH = h();
        this.f17005d.getClass();
        Collection collectionR = vb.r.f22819a;
        for (le.o oVar : oVarArrH) {
            collectionR = g8.a.r(collectionR, oVar.b(eVar, bVar));
        }
        return collectionR == null ? vb.t.f22821a : collectionR;
    }

    @Override // le.o
    public final Set c() {
        le.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (le.o oVar : oVarArrH) {
            vb.m.P(linkedHashSet, oVar.c());
        }
        linkedHashSet.addAll(this.f17005d.c());
        return linkedHashSet;
    }

    @Override // le.o
    public final Set d() {
        HashSet hashSetY = f0.y(vb.l.b0(h()));
        if (hashSetY == null) {
            return null;
        }
        hashSetY.addAll(this.f17005d.d());
        return hashSetY;
    }

    @Override // le.q
    public final Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        le.o[] oVarArrH = h();
        Collection collectionE = this.f17005d.e(fVar, kVar);
        for (le.o oVar : oVarArrH) {
            collectionE = g8.a.r(collectionE, oVar.e(fVar, kVar));
        }
        return collectionE == null ? vb.t.f22821a : collectionE;
    }

    @Override // le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        i(eVar, bVar);
        le.o[] oVarArrH = h();
        Collection collectionF = this.f17005d.f(eVar, bVar);
        for (le.o oVar : oVarArrH) {
            collectionF = g8.a.r(collectionF, oVar.f(eVar, bVar));
        }
        return collectionF == null ? vb.t.f22821a : collectionF;
    }

    @Override // le.o
    public final Set g() {
        le.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (le.o oVar : oVarArrH) {
            vb.m.P(linkedHashSet, oVar.g());
        }
        linkedHashSet.addAll(this.f17005d.g());
        return linkedHashSet;
    }

    public final le.o[] h() {
        return (le.o[]) n7.b0.r(this.f17006e, f17002f[0]);
    }

    public final void i(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        g8.a.V(((od.a) this.f17003b.f1395c).f16328n, bVar, this.f17004c, eVar);
    }

    public final String toString() {
        return "scope for " + this.f17004c;
    }
}
