package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.t f25073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f25074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25079h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g2.t tVar, float f10, int i10, int i11, int i12, g2.g1 g1Var, int i13) {
        super(1);
        this.f25073b = tVar;
        this.f25074c = f10;
        this.f25075d = i10;
        this.f25076e = i11;
        this.f25077f = i12;
        this.f25078g = g1Var;
        this.f25079h = i13;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g2.f1 f1Var = (g2.f1) obj;
        boolean z10 = this.f25073b instanceof g2.t;
        g2.g1 g1Var = this.f25078g;
        int i10 = this.f25077f;
        int i11 = this.f25075d;
        float f10 = this.f25074c;
        int i12 = z10 ? 0 : !f3.f.a(f10, Float.NaN) ? i11 : (this.f25076e - i10) - g1Var.f7180a;
        if (!z10) {
            i11 = 0;
        } else if (f3.f.a(f10, Float.NaN)) {
            i11 = (this.f25079h - i10) - g1Var.f7181b;
        }
        g2.f1.k(f1Var, g1Var, i12, i11);
        return ub.a0.f21526a;
    }
}
