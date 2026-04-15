package la;

import y.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12083a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f12086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.q f12087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f12088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12091i;

    public /* synthetic */ r(long j10, long j11, float f10, y.d1 d1Var, r1 r1Var, j1.q qVar, f1.f fVar, int i10) {
        this.f12084b = j10;
        this.f12085c = j11;
        this.f12086d = f10;
        this.f12090h = d1Var;
        this.f12091i = r1Var;
        this.f12087e = qVar;
        this.f12088f = fVar;
        this.f12089g = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12083a) {
            case 0:
                ((Integer) obj2).getClass();
                t.b(this.f12087e, (q1.l0) this.f12090h, this.f12084b, this.f12085c, (s.o) this.f12091i, this.f12086d, this.f12088f, (x0.o) obj, x0.v.D(this.f12089g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m0.i0.a(this.f12084b, this.f12085c, this.f12086d, (y.d1) this.f12090h, (r1) this.f12091i, this.f12087e, this.f12088f, (x0.o) obj, x0.v.D(this.f12089g | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ r(j1.q qVar, q1.l0 l0Var, long j10, long j11, s.o oVar, float f10, f1.f fVar, int i10) {
        this.f12087e = qVar;
        this.f12090h = l0Var;
        this.f12084b = j10;
        this.f12085c = j11;
        this.f12091i = oVar;
        this.f12086d = f10;
        this.f12088f = fVar;
        this.f12089g = i10;
    }
}
