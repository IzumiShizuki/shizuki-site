package y0;

import x0.a2;
import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f25346d = new t(0, 3, 1);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        v2.e eVar;
        a2 a2Var = (a2) jVar.f(1);
        x0.a aVar = (x0.a) jVar.f(0);
        c cVar2 = (c) jVar.f(2);
        d2 d2VarK = a2Var.k();
        if (j0Var != null) {
            try {
                eVar = new v2.e(13, j0Var, d2Var);
            } catch (Throwable th2) {
                d2VarK.e(false);
                throw th2;
            }
        } else {
            eVar = null;
        }
        if (!cVar2.f25310b.H()) {
            x0.p.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.f25309a.G(cVar, d2VarK, mVar, eVar);
        d2VarK.e(true);
        d2Var.d();
        aVar.getClass();
        d2Var.z(a2Var, a2Var.a(aVar));
        d2Var.k();
    }
}
