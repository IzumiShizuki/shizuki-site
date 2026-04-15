package te;

import se.j0;
import se.w;
import se.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f20743c = e.f20725a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ee.l f20744d = new ee.l(ee.l.f6537d);

    public final boolean a(w wVar, w wVar2) {
        jc.l.e(wVar, "a");
        jc.l.e(wVar2, "b");
        return se.d.h(g.l(false, null, this.f20743c, 6), wVar.x(), wVar2.x());
    }

    public final boolean b(w wVar, w wVar2) {
        jc.l.e(wVar, "subtype");
        jc.l.e(wVar2, "supertype");
        j0 j0VarL = g.l(true, null, this.f20743c, 6);
        w0 w0VarX = wVar.x();
        w0 w0VarX2 = wVar2.x();
        if (w0VarX == w0VarX2) {
            return true;
        }
        j0VarL.b(w0VarX, w0VarX2);
        return se.d.f19934a.f(j0VarL, j0VarL.f19961c, w0VarX, w0VarX2);
    }
}
