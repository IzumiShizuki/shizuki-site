package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.d1 f13685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.o f13686c;

    public /* synthetic */ u0(y.d1 d1Var, ic.o oVar, int i10) {
        this.f13684a = i10;
        this.f13685b = d1Var;
        this.f13686c = oVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13684a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j1.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.a(j1.n.f9689a, s0.f13583b, s0.f13584c), this.f13685b);
                    y.j1 j1VarA = y.i1.a(y.k.f25159d, j1.c.f9672k, oVar, 54);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(qVarI, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    this.f13686c.g(y.l1.f25167a, oVar, 6);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z8.a(((d9) oVar2.j(e9.f12960b)).f12888k, f1.g.f(165539859, new u0(this.f13685b, this.f13686c, 0), oVar2), oVar2, 48);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
