package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q8 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.y f13527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.g0 f13530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.k f13531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.n f13532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.n f13533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f13534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x1 f13536j;

    public q8(y2.y yVar, boolean z10, boolean z11, y2.g0 g0Var, w.k kVar, ic.n nVar, ic.n nVar2, ic.n nVar3, q1.l0 l0Var, x1 x1Var) {
        this.f13527a = yVar;
        this.f13528b = z10;
        this.f13529c = z11;
        this.f13530d = g0Var;
        this.f13531e = kVar;
        this.f13532f = nVar;
        this.f13533g = nVar2;
        this.f13534h = nVar3;
        this.f13535i = l0Var;
        this.f13536j = x1Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        ic.n nVar = (ic.n) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.h(nVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            d8.f12873a.c(this.f13527a.f25434a.f20320b, nVar, this.f13528b, this.f13529c, this.f13530d, this.f13531e, false, null, this.f13532f, this.f13533g, this.f13534h, this.f13535i, this.f13536j, null, oVar, (iIntValue << 3) & 112);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
