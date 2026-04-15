package ie;

import bd.j0;
import bd.n0;
import bd.y0;
import be.e;
import bf.m;
import df.p;
import ic.k;
import java.util.Collection;
import jc.l;
import jc.y;
import te.g;
import vc.i;
import yc.d0;
import yc.h;
import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9520a = 0;

    static {
        e.e("value");
    }

    public static final boolean a(y0 y0Var) {
        Boolean boolH = m.h(ud.b.w(y0Var), a.f9515b, c.f9519i);
        l.d(boolH, "ifAny(...)");
        return boolH.booleanValue();
    }

    public static yc.c b(yc.c cVar, k kVar) {
        l.e(cVar, "<this>");
        return (yc.c) m.f(ud.b.w(cVar), new a(1), new bf.a(new y(), kVar));
    }

    public static final be.c c(yc.l lVar) {
        l.e(lVar, "<this>");
        be.d dVarH = h(lVar);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.i();
        }
        return null;
    }

    public static final yc.e d(zc.b bVar) {
        l.e(bVar, "<this>");
        h hVarH = bVar.b().t().h();
        if (hVarH instanceof yc.e) {
            return (yc.e) hVarH;
        }
        return null;
    }

    public static final i e(yc.k kVar) {
        l.e(kVar, "<this>");
        return j(kVar).g();
    }

    public static final be.b f(h hVar) {
        yc.k kVarY;
        be.b bVarF;
        if (hVar == null || (kVarY = hVar.y()) == null) {
            return null;
        }
        if (kVarY instanceof d0) {
            be.c cVar = ((j0) ((d0) kVarY)).f2596e;
            e name = hVar.getName();
            l.d(name, "getName(...)");
            return new be.b(cVar, name);
        }
        if (!(kVarY instanceof yc.i) || (bVarF = f((h) kVarY)) == null) {
            return null;
        }
        e name2 = hVar.getName();
        l.d(name2, "getName(...)");
        return bVarF.d(name2);
    }

    public static final be.c g(yc.k kVar) {
        l.e(kVar, "<this>");
        be.c cVarH = ee.e.h(kVar);
        return cVarH != null ? cVarH : ee.e.g(kVar.y()).a(kVar.getName()).i();
    }

    public static final be.d h(yc.k kVar) {
        l.e(kVar, "<this>");
        be.d dVarG = ee.e.g(kVar);
        l.d(dVarG, "getFqName(...)");
        return dVarG;
    }

    public static final void i(yc.y yVar) {
        l.e(yVar, "<this>");
        if (yVar.P0(g.f20728a) != null) {
            throw new ClassCastException();
        }
    }

    public static final yc.y j(yc.k kVar) {
        l.e(kVar, "<this>");
        yc.y yVarD = ee.e.d(kVar);
        l.d(yVarD, "getContainingModule(...)");
        return yVarD;
    }

    public static final yc.c k(yc.c cVar) {
        l.e(cVar, "<this>");
        if (!(cVar instanceof yc.j0)) {
            return cVar;
        }
        k0 k0VarD1 = ((n0) ((yc.j0) cVar)).D1();
        l.d(k0VarD1, "getCorrespondingProperty(...)");
        return k0VarD1;
    }

    public static final df.i l(yc.c cVar) {
        l.e(cVar, "<this>");
        df.k kVarD0 = vb.l.d0(new yc.c[]{cVar});
        Collection collectionA = cVar.A();
        l.d(collectionA, "getOverriddenDescriptors(...)");
        return df.m.Z(vb.l.d0(new df.k[]{kVarD0, new df.i(vb.m.R(collectionA), new b(1), p.f6004i)}));
    }
}
