package y0;

import x0.d2;
import x0.p1;
import x0.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f25313d = new d0(1, 0, 2);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        int iE = jVar.e(0);
        int i10 = d2Var.f24286v;
        int iM = d2Var.M(d2Var.f24266b, d2Var.r(i10));
        int iG = d2Var.g(d2Var.f24266b, d2Var.r(i10 + 1));
        for (int iMax = Math.max(iM, iG - iE); iMax < iG; iMax++) {
            Object obj = d2Var.f24267c[d2Var.h(iMax)];
            if (obj instanceof v1) {
                mVar.d((v1) obj);
            } else if (obj instanceof p1) {
                ((p1) obj).e();
            }
        }
        if (iE <= 0) {
            x0.p.c("Check failed");
        }
        int i11 = d2Var.f24286v;
        int iM2 = d2Var.M(d2Var.f24266b, d2Var.r(i11));
        int iG2 = d2Var.g(d2Var.f24266b, d2Var.r(i11 + 1)) - iE;
        if (iG2 < iM2) {
            x0.p.c("Check failed");
        }
        d2Var.I(iG2, iE, i11);
        int i12 = d2Var.f24273i;
        if (i12 >= iM2) {
            d2Var.f24273i = i12 - iE;
        }
    }
}
