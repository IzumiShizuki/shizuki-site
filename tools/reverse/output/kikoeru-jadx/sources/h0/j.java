package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7692b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f7693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f7694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f7695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.g0 f7696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.k f7697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.k f7698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1.n0 f7699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f7700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f7703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f7704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f7705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f1.f f7706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7710t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, ic.k kVar, j1.q qVar, boolean z10, boolean z11, t2.l0 l0Var, t0 t0Var, s0 s0Var, boolean z12, int i10, int i11, y2.g0 g0Var, ic.k kVar2, w.k kVar3, q1.n0 n0Var, f1.f fVar, int i12, int i13) {
        super(2);
        this.f7709s = str;
        this.f7693c = kVar;
        this.f7694d = qVar;
        this.f7700j = z10;
        this.f7704n = z11;
        this.f7695e = l0Var;
        this.f7710t = t0Var;
        this.f7703m = s0Var;
        this.f7705o = z12;
        this.f7701k = i10;
        this.f7702l = i11;
        this.f7696f = g0Var;
        this.f7697g = kVar2;
        this.f7698h = kVar3;
        this.f7699i = n0Var;
        this.f7706p = fVar;
        this.f7707q = i12;
        this.f7708r = i13;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        switch (this.f7692b) {
            case 0:
                ((Number) obj2).intValue();
                k.a((String) this.f7709s, this.f7693c, this.f7694d, this.f7700j, this.f7704n, this.f7695e, (t0) this.f7710t, this.f7703m, this.f7705o, this.f7701k, this.f7702l, this.f7696f, this.f7697g, this.f7698h, this.f7699i, this.f7706p, oVar, x0.v.D(this.f7707q | 1), x0.v.D(this.f7708r));
                break;
            default:
                ((Number) obj2).intValue();
                q0.e((y2.y) this.f7709s, this.f7693c, this.f7694d, this.f7695e, this.f7696f, this.f7697g, this.f7698h, this.f7699i, this.f7700j, this.f7701k, this.f7702l, (y2.j) this.f7710t, this.f7703m, this.f7704n, this.f7705o, this.f7706p, oVar, x0.v.D(this.f7707q | 1), x0.v.D(this.f7708r));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y2.y yVar, ic.k kVar, j1.q qVar, t2.l0 l0Var, y2.g0 g0Var, ic.k kVar2, w.k kVar3, q1.n0 n0Var, boolean z10, int i10, int i11, y2.j jVar, s0 s0Var, boolean z11, boolean z12, f1.f fVar, int i12, int i13) {
        super(2);
        this.f7709s = yVar;
        this.f7693c = kVar;
        this.f7694d = qVar;
        this.f7695e = l0Var;
        this.f7696f = g0Var;
        this.f7697g = kVar2;
        this.f7698h = kVar3;
        this.f7699i = n0Var;
        this.f7700j = z10;
        this.f7701k = i10;
        this.f7702l = i11;
        this.f7710t = jVar;
        this.f7703m = s0Var;
        this.f7704n = z11;
        this.f7705o = z12;
        this.f7706p = fVar;
        this.f7707q = i12;
        this.f7708r = i13;
    }
}
