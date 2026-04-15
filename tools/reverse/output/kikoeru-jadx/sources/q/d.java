package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17260b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r.q1 f17261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f17262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f17263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ub.e f17265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(r.q1 q1Var, ic.k kVar, j1.q qVar, q0 q0Var, r0 r0Var, f1.f fVar, int i10) {
        super(2);
        this.f17261c = q1Var;
        this.f17265g = (jc.m) kVar;
        this.f17262d = qVar;
        this.f17266h = q0Var;
        this.f17267i = r0Var;
        this.f17263e = fVar;
        this.f17264f = i10;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ic.k, jc.m] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f17260b) {
            case 0:
                ((Number) obj2).intValue();
                ic.k kVar = (ic.k) this.f17265g;
                j1.d dVar = (j1.d) this.f17267i;
                ic.k kVar2 = (ic.k) this.f17266h;
                androidx.compose.animation.a.a(this.f17261c, this.f17262d, kVar, dVar, kVar2, this.f17263e, (x0.o) obj, x0.v.D(this.f17264f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ?? r22 = (jc.m) this.f17265g;
                q0 q0Var = (q0) this.f17266h;
                r0 r0Var = (r0) this.f17267i;
                androidx.compose.animation.b.d(this.f17261c, r22, this.f17262d, q0Var, r0Var, this.f17263e, (x0.o) obj, x0.v.D(this.f17264f | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r.q1 q1Var, j1.q qVar, ic.k kVar, j1.d dVar, ic.k kVar2, f1.f fVar, int i10) {
        super(2);
        this.f17261c = q1Var;
        this.f17262d = qVar;
        this.f17265g = kVar;
        this.f17267i = dVar;
        this.f17266h = kVar2;
        this.f17263e = fVar;
        this.f17264f = i10;
    }
}
