package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f13940b;

    public /* synthetic */ y1(a2 a2Var, int i10) {
        this.f13939a = i10;
        this.f13940b = a2Var;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f13939a;
        a2 a2Var = this.f13940b;
        switch (i10) {
            case 0:
                if (((k5) i2.f.i(a2Var, l5.f13235a)) == null) {
                    u0.b bVar = a2Var.f12650u;
                    if (bVar != null) {
                        a2Var.C0(bVar);
                    }
                    a2Var.f12650u = null;
                } else if (a2Var.f12650u == null) {
                    z1 z1Var = new z1(0, a2Var);
                    y1 y1Var = new y1(a2Var, 1);
                    w.k kVar = a2Var.f12646q;
                    boolean z10 = a2Var.f12647r;
                    float f10 = a2Var.f12648s;
                    r.u1 u1Var = u0.j.f21202a;
                    u0.b bVar2 = new u0.b(kVar, z10, f10, z1Var, y1Var);
                    a2Var.B0(bVar2);
                    a2Var.f12650u = bVar2;
                }
                return ub.a0.f21526a;
            default:
                return ((b1) i2.f.i(a2Var, c1.f12773a)).j() ? ((double) q1.h0.r(((q1.q) i2.f.i(a2Var, j1.f13125a)).f17577a)) > 0.5d ? l5.f13238d : l5.f13239e : l5.f13240f;
        }
    }
}
