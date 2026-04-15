package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x7 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.q f13896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.r0 f13898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f13900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f13901f;

    public x7(j1.q qVar, boolean z10, m5 m5Var, boolean z11, ic.a aVar, f1.f fVar) {
        this.f13896a = qVar;
        this.f13897b = z10;
        this.f13898c = m5Var;
        this.f13899d = z11;
        this.f13900e = aVar;
        this.f13901f = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            j1.q qVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.selection.c.a(this.f13896a, this.f13897b, this.f13898c, this.f13899d, new q2.h(4), this.f13900e), 1.0f);
            y.v vVarA = y.u.a(y.k.f25159d, j1.c.f9675n, oVar, 54);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarC, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, vVarA, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            this.f13901f.g(y.w.f25274a, oVar, 6);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
