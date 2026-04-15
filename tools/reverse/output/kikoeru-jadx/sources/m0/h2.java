package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13044a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f13045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f13046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f13047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f13050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f13051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f13052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f13053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ic.o f13055l;

    public /* synthetic */ h2(f1.f fVar, j1.q qVar, t2 t2Var, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, f1.f fVar2, int i10) {
        this.f13045b = fVar;
        this.f13046c = qVar;
        this.f13047d = t2Var;
        this.f13048e = z10;
        this.f13049f = l0Var;
        this.f13050g = f10;
        this.f13051h = j10;
        this.f13052i = j11;
        this.f13053j = j12;
        this.f13055l = fVar2;
        this.f13054k = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13044a) {
            case 0:
                ((Integer) obj2).getClass();
                int iD = x0.v.D(this.f13054k | 1);
                s2.a(this.f13055l, this.f13046c, this.f13047d, this.f13048e, this.f13049f, this.f13050g, this.f13051h, this.f13052i, this.f13053j, this.f13045b, (x0.o) obj, iD);
                break;
            default:
                ((Integer) obj2).getClass();
                int iD2 = x0.v.D(this.f13054k | 1);
                q9.a.g(this.f13045b, this.f13046c, this.f13047d, this.f13048e, this.f13049f, this.f13050g, this.f13051h, this.f13052i, this.f13053j, (f1.f) this.f13055l, (x0.o) obj, iD2);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ h2(ic.o oVar, j1.q qVar, t2 t2Var, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, f1.f fVar, int i10) {
        this.f13055l = oVar;
        this.f13046c = qVar;
        this.f13047d = t2Var;
        this.f13048e = z10;
        this.f13049f = l0Var;
        this.f13050g = f10;
        this.f13051h = j10;
        this.f13052i = j11;
        this.f13053j = j12;
        this.f13045b = fVar;
        this.f13054k = i10;
    }
}
