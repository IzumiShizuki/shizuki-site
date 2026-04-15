package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f13078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f13079c;

    public i(f1.f fVar, ic.n nVar) {
        this.f13077a = 3;
        this.f13079c = fVar;
        this.f13078b = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13077a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ic.n nVar = this.f13078b;
                    if (nVar == null) {
                        oVar.W(690531395);
                    } else {
                        oVar.W(-254819458);
                        nVar.q(oVar, 0);
                    }
                    oVar.p(false);
                    this.f13079c.q(oVar, 0);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f10 = 8;
                    j1.q qVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), f10, 2);
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ = x0.v.q(oVar2);
                    x0.j1 j1VarL = oVar2.l();
                    j1.q qVarC = j1.a.c(qVarK, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar2);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar2);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar2, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar2);
                    k.c(f10, 12, f1.g.f(-1975681962, new i(this.f13078b, this.f13079c, 0), oVar2), oVar2, 438);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    this.f13078b.q(oVar3, 0);
                    this.f13079c.q(oVar3, 0);
                } else {
                    oVar3.Q();
                }
                break;
            default:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    this.f13079c.q(oVar4, 0);
                    ic.n nVar2 = this.f13078b;
                    jc.l.b(nVar2);
                    nVar2.q(oVar4, 0);
                } else {
                    oVar4.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ i(ic.n nVar, f1.f fVar, int i10) {
        this.f13077a = i10;
        this.f13078b = nVar;
        this.f13079c = fVar;
    }
}
