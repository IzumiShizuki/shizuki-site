package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.e f18375a = new z0.e(new c0[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18376b = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18377c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f18378d = x0.v.v(Boolean.TRUE);

    public final void a(int i10, x0.o oVar) {
        oVar.Y(-318043801);
        int i11 = (oVar.h(this) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            Object objK = oVar.K();
            yb.c cVar = null;
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v(null);
                oVar.h0(objK);
            }
            x0.w0 w0Var = (x0.w0) objK;
            if (((Boolean) this.f18378d.getValue()).booleanValue() || ((Boolean) this.f18376b.getValue()).booleanValue()) {
                oVar.W(1719883733);
                boolean zH = oVar.h(this);
                Object objK2 = oVar.K();
                if (zH || objK2 == r0Var) {
                    objK2 = new e.j(w0Var, this, cVar, 20);
                    oVar.h0(objK2);
                }
                x0.v.e((ic.n) objK2, this, oVar);
                oVar.p(false);
            } else {
                oVar.W(1721270456);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 16, this);
        }
    }
}
