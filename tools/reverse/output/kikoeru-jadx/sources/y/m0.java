package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f25170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f25174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f25175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f3.m f25177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f25178j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int[] iArr, int i10, int i11, int i12, g2.g1[] g1VarArr, n0 n0Var, int i13, f3.m mVar, int[] iArr2) {
        super(1);
        this.f25170b = iArr;
        this.f25171c = i10;
        this.f25172d = i11;
        this.f25173e = i12;
        this.f25174f = g1VarArr;
        this.f25175g = n0Var;
        this.f25176h = i13;
        this.f25177i = mVar;
        this.f25178j = iArr2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        d dVar;
        g2.f1 f1Var = (g2.f1) obj;
        int[] iArr = this.f25170b;
        int i10 = iArr != null ? iArr[this.f25171c] : 0;
        int i11 = this.f25172d;
        for (int i12 = i11; i12 < this.f25173e; i12++) {
            g2.g1 g1Var = this.f25174f[i12];
            jc.l.b(g1Var);
            Object objA = g1Var.A();
            h1 h1Var = objA instanceof h1 ? (h1) objA : null;
            if (h1Var == null || (dVar = h1Var.f25137c) == null) {
                dVar = this.f25175g.f25194d;
            }
            f1Var.h(g1Var, this.f25178j[i12 - i11], dVar.f(this.f25176h - g1Var.V(), this.f25177i) + i10, 0.0f);
        }
        return ub.a0.f21526a;
    }
}
