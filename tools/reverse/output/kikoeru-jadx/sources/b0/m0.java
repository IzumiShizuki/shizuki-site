package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1297b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f1301f = n0Var;
        this.f1298c = obj;
        this.f1299d = i10;
        this.f1302g = obj2;
        this.f1300e = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f1297b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                g0.d((n0) this.f1301f, this.f1298c, this.f1299d, this.f1302g, oVar, x0.v.D(this.f1300e | 1));
                break;
            case 1:
                g0.b(this.f1298c, this.f1299d, (w0) this.f1301f, (f1.f) this.f1302g, oVar, x0.v.D(this.f1300e | 1));
                break;
            default:
                androidx.compose.ui.viewinterop.a.b((ic.k) this.f1301f, (j1.q) this.f1298c, (ic.k) this.f1302g, oVar, x0.v.D(this.f1299d | 1), this.f1300e);
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ic.k kVar, j1.q qVar, ic.k kVar2, int i10, int i11) {
        super(2);
        this.f1301f = kVar;
        this.f1298c = qVar;
        this.f1302g = kVar2;
        this.f1299d = i10;
        this.f1300e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Object obj, int i10, w0 w0Var, f1.f fVar, int i11) {
        super(2);
        this.f1298c = obj;
        this.f1299d = i10;
        this.f1301f = w0Var;
        this.f1302g = fVar;
        this.f1300e = i11;
    }
}
