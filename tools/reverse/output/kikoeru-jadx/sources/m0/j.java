package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.f f13113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.q f13114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f13115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13119g;

    public j(f1.f fVar, j1.q qVar, ic.n nVar, ic.n nVar2, q1.l0 l0Var, long j10, long j11) {
        this.f13113a = fVar;
        this.f13114b = qVar;
        this.f13115c = nVar;
        this.f13116d = nVar2;
        this.f13117e = l0Var;
        this.f13118f = j10;
        this.f13119g = j11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            k.b(this.f13113a, this.f13114b, this.f13115c, this.f13116d, this.f13117e, this.f13118f, this.f13119g, oVar, 0);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
