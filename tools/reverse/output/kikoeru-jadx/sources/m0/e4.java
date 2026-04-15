package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.o f12917b;

    public e4(boolean z10, ic.o oVar) {
        this.f12916a = z10;
        this.f12917b = oVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        float f10;
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            if (this.f12916a) {
                oVar.W(-1691869137);
                long j10 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                f10 = (!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.87f : 1.0f;
                oVar.p(false);
            } else {
                oVar.W(-1691868397);
                long j11 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                if (((b1) oVar.j(c1.f12773a)).j()) {
                    q1.h0.r(j11);
                } else {
                    q1.h0.r(j11);
                }
                oVar.p(false);
                f10 = 0.38f;
            }
            x0.v.a(h1.f13043a.a(Float.valueOf(f10)), f1.g.f(-308149173, new p2(this.f12917b, 1), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
