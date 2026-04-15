package mf;

import jc.c0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yb.c[] f15132a = new yb.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final app.nekogram.translator.r f15133b = new app.nekogram.translator.r(7, "NULL");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final app.nekogram.translator.r f15134c = new app.nekogram.translator.r(7, "DONE");

    public static final Object a(yb.h hVar, Object obj, Object obj2, ic.n nVar, yb.c cVar) {
        Object objQ;
        Object objN = nf.b.n(hVar, obj2);
        try {
            t tVar = new t(cVar, hVar);
            if (t0.M(nVar)) {
                c0.c(2, nVar);
                objQ = nVar.q(obj, tVar);
            } else {
                objQ = ud.s.E(nVar, obj, tVar);
            }
            nf.b.g(hVar, objN);
            if (objQ == zb.a.f26667a) {
                jc.l.e(cVar, "frame");
            }
            return objQ;
        } catch (Throwable th2) {
            nf.b.g(hVar, objN);
            throw th2;
        }
    }
}
