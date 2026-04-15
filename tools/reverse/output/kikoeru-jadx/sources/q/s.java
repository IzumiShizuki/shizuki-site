package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17437b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f17438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f17440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f17444i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j1.q qVar, v0.l0 l0Var, boolean z10, w.k kVar, f1.f fVar, f1.f fVar2, int i10) {
        super(2);
        this.f17438c = qVar;
        this.f17442g = l0Var;
        this.f17439d = z10;
        this.f17443h = kVar;
        this.f17440e = fVar;
        this.f17444i = fVar2;
        this.f17441f = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f17437b) {
            case 0:
                ((Number) obj2).intValue();
                q0 q0Var = (q0) this.f17442g;
                r0 r0Var = (r0) this.f17443h;
                String str = (String) this.f17444i;
                androidx.compose.animation.b.b(this.f17439d, this.f17438c, q0Var, r0Var, str, this.f17440e, (x0.o) obj, x0.v.D(this.f17441f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                v0.l0 l0Var = (v0.l0) this.f17442g;
                w.k kVar = (w.k) this.f17443h;
                f1.f fVar = (f1.f) this.f17444i;
                v0.k0.d(this.f17438c, l0Var, this.f17439d, kVar, this.f17440e, fVar, (x0.o) obj, x0.v.D(this.f17441f | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, j1.q qVar, q0 q0Var, r0 r0Var, String str, f1.f fVar, int i10) {
        super(2);
        this.f17439d = z10;
        this.f17438c = qVar;
        this.f17442g = q0Var;
        this.f17443h = r0Var;
        this.f17444i = str;
        this.f17440e = fVar;
        this.f17441f = i10;
    }
}
