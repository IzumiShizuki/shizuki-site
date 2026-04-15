package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.i0 f13941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.o1 f13943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f13944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1.q f13945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f13946f;

    public y2(r.i0 i0Var, x0.w0 w0Var, s.o1 o1Var, d3 d3Var, j1.q qVar, f1.f fVar) {
        this.f13941a = i0Var;
        this.f13942b = w0Var;
        this.f13943c = o1Var;
        this.f13944d = d3Var;
        this.f13945e = qVar;
        this.f13946f = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            d3 d3Var = this.f13944d;
            f3.c cVar = d3Var.f12851a;
            f4.a(this.f13941a, this.f13942b, this.f13943c, androidx.compose.foundation.layout.c.n(androidx.compose.foundation.layout.c.f(this.f13945e, 0.0f, cVar.I(d3Var.f12852b.e()), 1), cVar.I(d3Var.f12853c.e())), this.f13946f, oVar, 48);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
