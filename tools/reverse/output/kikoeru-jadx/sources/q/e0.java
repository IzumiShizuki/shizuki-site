package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17276b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f17282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j1.q qVar, y.f fVar, y.h hVar, y.o0 o0Var, f1.f fVar2, int i10) {
        super(2);
        this.f17280f = qVar;
        this.f17277c = fVar;
        this.f17278d = hVar;
        this.f17281g = o0Var;
        this.f17282h = fVar2;
        this.f17279e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f17276b) {
            case 0:
                ((Number) obj2).intValue();
                n7.b0.d((r.q1) this.f17277c, (j1.q) this.f17280f, (r.x) this.f17278d, (ic.k) this.f17281g, (f1.f) this.f17282h, (x0.o) obj, x0.v.D(this.f17279e | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                r.q1 q1Var = (r.q1) this.f17277c;
                r.m1 m1Var = (r.m1) this.f17280f;
                r.x xVar = (r.x) this.f17278d;
                r.t1.a(q1Var, m1Var, this.f17281g, this.f17282h, xVar, (x0.o) obj, x0.v.D(this.f17279e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                y.d.c((j1.q) this.f17280f, (y.f) this.f17277c, (y.h) this.f17278d, (y.o0) this.f17281g, (f1.f) this.f17282h, (x0.o) obj, x0.v.D(this.f17279e | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r.q1 q1Var, j1.q qVar, r.x xVar, ic.k kVar, f1.f fVar, int i10) {
        super(2);
        this.f17277c = q1Var;
        this.f17280f = qVar;
        this.f17278d = xVar;
        this.f17281g = kVar;
        this.f17282h = fVar;
        this.f17279e = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r.q1 q1Var, r.m1 m1Var, Object obj, Object obj2, r.x xVar, int i10) {
        super(2);
        this.f17277c = q1Var;
        this.f17280f = m1Var;
        this.f17281g = obj;
        this.f17282h = obj2;
        this.f17278d = xVar;
        this.f17279e = i10;
    }
}
