package y0;

import x0.d2;
import x0.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f25314d = new e(0, 2, 1);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        x0.a aVar = (x0.a) jVar.f(0);
        Object objF = jVar.f(1);
        if (objF instanceof v1) {
            v1 v1Var = (v1) objF;
            mVar.f6639e.b(v1Var);
            mVar.f6638d.a(v1Var);
        }
        if (d2Var.f24278n != 0) {
            x0.p.c("Can only append a slot if not current inserting");
        }
        int i10 = d2Var.f24273i;
        int i11 = d2Var.f24274j;
        int iC = d2Var.c(aVar);
        int iG = d2Var.g(d2Var.f24266b, d2Var.r(iC + 1));
        d2Var.f24273i = iG;
        d2Var.f24274j = iG;
        d2Var.w(1, iC);
        if (i10 >= iG) {
            i10++;
            i11++;
        }
        d2Var.f24267c[iG] = objF;
        d2Var.f24273i = i10;
        d2Var.f24274j = i11;
    }
}
