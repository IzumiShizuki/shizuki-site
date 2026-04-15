package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2.g0 f13952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w.k f13953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f13955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ic.n f13956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ic.n f13957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ic.n f13958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x1 f13960m;

    public /* synthetic */ y4(String str, boolean z10, boolean z11, y2.g0 g0Var, w.k kVar, boolean z12, ic.n nVar, ic.n nVar2, ic.n nVar3, ic.n nVar4, q1.l0 l0Var, x1 x1Var, int i10) {
        this.f13948a = i10;
        this.f13949b = str;
        this.f13950c = z10;
        this.f13951d = z11;
        this.f13952e = g0Var;
        this.f13953f = kVar;
        this.f13954g = z12;
        this.f13955h = nVar;
        this.f13956i = nVar2;
        this.f13957j = nVar3;
        this.f13958k = nVar4;
        this.f13959l = l0Var;
        this.f13960m = x1Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f13948a) {
            case 0:
                ic.n nVar = (ic.n) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.h(nVar) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i10 = iIntValue;
                    d8 d8Var = d8.f12873a;
                    boolean z10 = this.f13950c;
                    boolean z11 = this.f13954g;
                    w.k kVar = this.f13953f;
                    x1 x1Var = this.f13960m;
                    q1.l0 l0Var = this.f13959l;
                    d8Var.b(this.f13949b, nVar, z10, this.f13951d, this.f13952e, kVar, z11, this.f13955h, this.f13956i, this.f13957j, this.f13958k, l0Var, x1Var, null, f1.g.f(-1118701585, new x4(z10, z11, kVar, x1Var, l0Var), oVar), oVar, (i10 << 3) & 112);
                } else {
                    oVar.Q();
                }
                break;
            default:
                ic.n nVar2 = (ic.n) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar2.h(nVar2) ? 4 : 2;
                }
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    d8.f12873a.c(this.f13949b, nVar2, this.f13950c, this.f13951d, this.f13952e, this.f13953f, this.f13954g, this.f13955h, this.f13956i, this.f13957j, this.f13958k, this.f13959l, this.f13960m, null, oVar2, (iIntValue2 << 3) & 112);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
