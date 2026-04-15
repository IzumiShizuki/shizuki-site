package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x4 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f13889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f13890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13891e;

    public x4(boolean z10, boolean z11, w.k kVar, x1 x1Var, q1.l0 l0Var) {
        this.f13887a = z10;
        this.f13888b = z11;
        this.f13889c = kVar;
        this.f13890d = x1Var;
        this.f13891e = l0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            d8.f12873a.a(this.f13887a, this.f13888b, this.f13889c, this.f13890d, this.f13891e, 0.0f, 0.0f, oVar, 12582912);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
