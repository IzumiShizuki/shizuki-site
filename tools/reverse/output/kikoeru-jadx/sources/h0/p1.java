package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f7801g = g1.l.b(o1.f7793b, h.f7644o);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.a1 f7802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.a1 f7803b = new x0.a1(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.b1 f7804c = new x0.b1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1.c f7805d = p1.c.f16482e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7806e = t2.k0.f20356b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f7807f;

    public p1(u.e1 e1Var, float f10) {
        this.f7802a = new x0.a1(f10);
        this.f7807f = new x0.e1(e1Var, x0.r0.f24439f);
    }

    public final void a(u.e1 e1Var, p1.c cVar, int i10, int i11) {
        float f10 = i11 - i10;
        this.f7803b.f(f10);
        float f11 = cVar.f16483a;
        float f12 = cVar.f16484b;
        p1.c cVar2 = this.f7805d;
        float f13 = cVar2.f16483a;
        x0.a1 a1Var = this.f7802a;
        if (f11 != f13 || f12 != cVar2.f16484b) {
            boolean z10 = e1Var == u.e1.f20882a;
            if (z10) {
                f11 = f12;
            }
            float f14 = z10 ? cVar.f16486d : cVar.f16485c;
            float fE = a1Var.e();
            float f15 = i10;
            float f16 = fE + f15;
            a1Var.f(a1Var.e() + ((f14 <= f16 && (f11 >= fE || f14 - f11 <= f15)) ? (f11 >= fE || f14 - f11 > f15) ? 0.0f : f11 - fE : f14 - f16));
            this.f7805d = cVar;
        }
        a1Var.f(nh.b.j(a1Var.e(), 0.0f, f10));
        this.f7804c.f(i10);
    }
}
