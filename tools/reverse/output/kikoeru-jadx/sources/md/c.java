package md;

import b0.w1;
import jc.l;
import ub.k;
import vb.w;
import vc.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.e f15105a = be.e.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be.e f15106b = be.e.e("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final be.e f15107c = be.e.e("value");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f15108d = w.v(new k(n.f22891t, ld.w.f12259c), new k(n.f22894w, ld.w.f12260d), new k(n.f22895x, ld.w.f12262f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static nd.g a(be.c cVar, sd.b bVar, w1 w1Var) {
        ed.e eVarA;
        l.e(cVar, "kotlinName");
        l.e(bVar, "annotationOwner");
        l.e(w1Var, "c");
        if (cVar.equals(n.f22884m)) {
            be.c cVar2 = ld.w.f12261e;
            l.d(cVar2, "DEPRECATED_ANNOTATION");
            ed.e eVarA2 = bVar.a(cVar2);
            if (eVarA2 != null) {
                return new g(eVarA2, w1Var);
            }
        }
        be.c cVar3 = (be.c) f15108d.get(cVar);
        if (cVar3 == null || (eVarA = bVar.a(cVar3)) == null) {
            return null;
        }
        return b(w1Var, eVarA, false);
    }

    public static nd.g b(w1 w1Var, ed.e eVar, boolean z10) {
        l.e(eVar, "annotation");
        l.e(w1Var, "c");
        be.b bVarA = ed.d.a(g8.a.D(g8.a.y(eVar.f6495a)));
        be.c cVar = ld.w.f12259c;
        l.d(cVar, "TARGET_ANNOTATION");
        if (bVarA.equals(lc.b.X(cVar))) {
            return new j(eVar, w1Var);
        }
        be.c cVar2 = ld.w.f12260d;
        l.d(cVar2, "RETENTION_ANNOTATION");
        if (bVarA.equals(lc.b.X(cVar2))) {
            return new i(eVar, w1Var);
        }
        be.c cVar3 = ld.w.f12262f;
        l.d(cVar3, "DOCUMENTED_ANNOTATION");
        if (bVarA.equals(lc.b.X(cVar3))) {
            return new b(w1Var, eVar, n.f22895x);
        }
        be.c cVar4 = ld.w.f12261e;
        l.d(cVar4, "DEPRECATED_ANNOTATION");
        if (bVarA.equals(lc.b.X(cVar4))) {
            return null;
        }
        return new pd.f(w1Var, eVar, z10);
    }
}
