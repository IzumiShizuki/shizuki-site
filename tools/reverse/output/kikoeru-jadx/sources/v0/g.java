package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22204b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f22205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22210h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cg.f0 f0Var, j1.q qVar, boolean z10, f fVar, w.k kVar, int i10) {
        super(2);
        f1.f fVar2 = cg.j.f4050a;
        this.f22208f = f0Var;
        this.f22205c = qVar;
        this.f22206d = z10;
        this.f22209g = fVar;
        this.f22210h = kVar;
        this.f22207e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f22204b;
        ub.a0 a0Var = ub.a0.f21526a;
        int i11 = this.f22207e;
        Object obj3 = this.f22210h;
        Object obj4 = this.f22209g;
        Object obj5 = this.f22208f;
        switch (i10) {
            case 0:
                ((Number) obj2).intValue();
                f1.f fVar = cg.j.f4050a;
                int iD = x0.v.D(i11 | 1);
                j1.q qVar = this.f22205c;
                boolean z10 = this.f22206d;
                vb.w.a((cg.f0) obj5, qVar, z10, (f) obj4, (w.k) obj3, (x0.o) obj, iD);
                break;
            default:
                ((Number) obj2).intValue();
                int iD2 = x0.v.D(i11 | 1);
                j1.q qVar2 = this.f22205c;
                ((e0) obj5).b((l0) obj4, qVar2, (a0) obj3, this.f22206d, (x0.o) obj, iD2);
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e0 e0Var, l0 l0Var, j1.q qVar, a0 a0Var, boolean z10, int i10) {
        super(2);
        this.f22208f = e0Var;
        this.f22209g = l0Var;
        this.f22205c = qVar;
        this.f22210h = a0Var;
        this.f22206d = z10;
        this.f22207e = i10;
    }
}
