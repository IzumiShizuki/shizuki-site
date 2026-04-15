package m0;

import androidx.compose.foundation.layout.FillElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f13012b;

    public /* synthetic */ g0(f1.f fVar, int i10) {
        this.f13011a = i10;
        this.f13012b = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13011a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x0.z zVar = h1.f13043a;
                    long j10 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar.a(Float.valueOf((!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.87f : 1.0f)), this.f13012b, oVar, 8);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f556b;
                    y.j1 j1VarA = y.i1.a(y.k.f25157b, j1.c.f9672k, oVar2, 54);
                    int iQ = x0.v.q(oVar2);
                    x0.j1 j1VarL = oVar2.l();
                    j1.q qVarC = j1.a.c(fillElement, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA, oVar2);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar2);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar2, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar2);
                    this.f13012b.g(y.l1.f25167a, oVar2, 6);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j1.n nVar = j1.n.f9689a;
                    float f10 = n3.f13320a;
                    j1.q qVarA = androidx.compose.foundation.layout.c.a(nVar, f10, f10);
                    g2.v0 v0VarD = y.p.d(j1.c.f9666e, false);
                    int iQ2 = x0.v.q(oVar3);
                    x0.j1 j1VarL2 = oVar3.l();
                    j1.q qVarC2 = j1.a.c(qVarA, oVar3);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar2);
                    } else {
                        oVar3.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar3);
                    x0.v.A(i2.j.f8737f, j1VarL2, oVar3);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar3, iQ2, hVar2);
                    }
                    x0.v.A(i2.j.f8735d, qVarC2, oVar3);
                    this.f13012b.q(oVar3, 0);
                    oVar3.p(true);
                } else {
                    oVar3.Q();
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z8.a(((d9) oVar4.j(e9.f12960b)).f12888k, f1.g.f(-1686273317, new g0(this.f13012b, 2), oVar4), oVar4, 48);
                } else {
                    oVar4.Q();
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar5, 0);
                    int iQ3 = x0.v.q(oVar5);
                    x0.j1 j1VarL3 = oVar5.l();
                    j1.q qVarC3 = j1.a.c(j1.n.f9689a, oVar5);
                    i2.k.f8771g0.getClass();
                    i2.i iVar3 = i2.j.f8733b;
                    oVar5.a0();
                    if (oVar5.S) {
                        oVar5.k(iVar3);
                    } else {
                        oVar5.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA, oVar5);
                    x0.v.A(i2.j.f8737f, j1VarL3, oVar5);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar5.S || !jc.l.a(oVar5.K(), Integer.valueOf(iQ3))) {
                        j2.h0.s(iQ3, oVar5, iQ3, hVar3);
                    }
                    x0.v.A(i2.j.f8735d, qVarC3, oVar5);
                    this.f13012b.g(y.w.f25274a, oVar5, 6);
                    oVar5.p(true);
                } else {
                    oVar5.Q();
                }
                break;
            case 5:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.W(-478191429);
                    this.f13012b.q(oVar6, 0);
                    oVar6.p(false);
                } else {
                    oVar6.Q();
                }
                break;
            default:
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x0.v.a(j2.l1.f9872n.a(f3.m.f6667a), f1.g.f(1437088585, new g0(this.f13012b, 5), oVar7), oVar7, 56);
                } else {
                    oVar7.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
