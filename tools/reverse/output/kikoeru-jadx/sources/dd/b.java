package dd;

import ef.u;
import jc.l;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f5865a;

    public /* synthetic */ b(ClassLoader classLoader) {
        this.f5865a = classLoader;
    }

    public y1 a(be.b bVar, yd.e eVar) {
        c cVarS;
        l.e(bVar, "classId");
        l.e(eVar, "metadataVersion");
        String strI0 = u.i0(bVar.f2741b.f2744a.f2747a, '.', '$');
        be.c cVar = bVar.f2740a;
        if (!cVar.f2744a.c()) {
            strI0 = cVar + '.' + strI0;
        }
        Class clsA0 = android.support.v4.media.session.b.a0(this.f5865a, strI0);
        if (clsA0 == null || (cVarS = g8.a.s(clsA0)) == null) {
            return null;
        }
        return new y1(14, cVarS);
    }
}
