package y0;

import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f25326d = new j(0, 2, 1);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        int i10;
        f1.h hVar = (f1.h) jVar.f(0);
        int iC = d2Var.c((x0.a) jVar.f(1));
        if (d2Var.f24284t >= iC) {
            x0.p.c("Check failed");
        }
        ud.e.L(d2Var, cVar, iC);
        int i11 = d2Var.f24284t;
        int iD = d2Var.f24286v;
        while (iD >= 0 && !d2Var.x(iD)) {
            iD = d2Var.D(d2Var.f24266b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i11) {
            if (d2Var.u(i11, iT)) {
                if (d2Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += d2Var.x(iT) ? 1 : d2Var.f24266b[(d2Var.r(iT) * 5) + 1] & 67108863;
                iT += d2Var.t(iT);
            }
        }
        while (true) {
            i10 = d2Var.f24284t;
            if (i10 >= iC) {
                break;
            }
            if (d2Var.u(iC, i10)) {
                int i12 = d2Var.f24284t;
                if (i12 < d2Var.f24285u && (d2Var.f24266b[(d2Var.r(i12) * 5) + 1] & 1073741824) != 0) {
                    cVar.c(d2Var.C(d2Var.f24284t));
                    iK = 0;
                }
                d2Var.O();
            } else {
                iK += d2Var.K();
            }
        }
        if (i10 != iC) {
            x0.p.c("Check failed");
        }
        hVar.f6631a = iK;
    }
}
