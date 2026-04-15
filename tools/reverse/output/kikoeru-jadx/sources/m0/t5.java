package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s4 f13656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.e0 f13657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f13661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f13662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f13663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1.f f13664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ic.o f13665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x5 f13666k;

    public t5(s4 s4Var, y.e0 e0Var, long j10, long j11, int i10, f1.f fVar, f1.f fVar2, ic.n nVar, f1.f fVar3, ic.o oVar, x5 x5Var) {
        this.f13656a = s4Var;
        this.f13657b = e0Var;
        this.f13658c = j10;
        this.f13659d = j11;
        this.f13660e = i10;
        this.f13661f = fVar;
        this.f13662g = fVar2;
        this.f13663h = nVar;
        this.f13664i = fVar3;
        this.f13665j = oVar;
        this.f13666k = x5Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j1.q qVar = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(qVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            s4 s4Var = this.f13656a;
            boolean zF = oVar.f(s4Var);
            y.e0 e0Var = this.f13657b;
            boolean zF2 = zF | oVar.f(e0Var);
            Object objK = oVar.K();
            if (zF2 || objK == x0.k.f24334a) {
                objK = new ba.q0(14, s4Var, e0Var);
                oVar.h0(objK);
            }
            h2.g gVar = y.u1.f25267a;
            android.support.v4.media.session.b.m(j1.a.a(qVar, new u.x((ic.k) objK, 1)), null, this.f13658c, this.f13659d, null, 0.0f, f1.g.f(-1761194824, new s5(this.f13660e, this.f13661f, this.f13662g, this.f13663h, this.f13656a, this.f13664i, this.f13665j, this.f13666k), oVar), oVar, 1572864, 50);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
