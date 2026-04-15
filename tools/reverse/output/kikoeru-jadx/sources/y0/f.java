package y0;

import x0.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f25316d = new f(0, 2, 1);

    @Override // y0.i0
    public final void c(m4.j jVar, x0.c cVar, d2 d2Var, f1.m mVar, j0 j0Var) {
        f1.h hVar = (f1.h) jVar.f(1);
        int i10 = hVar != null ? hVar.f6631a : 0;
        a aVar = (a) jVar.f(0);
        if (i10 > 0) {
            cVar = new ch.z(cVar, i10);
        }
        aVar.F(cVar, d2Var, mVar, j0Var != null ? new v2.e(13, j0Var, d2Var) : null);
    }
}
