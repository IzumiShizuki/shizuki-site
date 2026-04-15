package a0;

import g2.v0;
import q.m1;
import x0.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f64b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f65c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(f1.f fVar, int i10) {
        super(4);
        this.f64b = i10;
        this.f65c = fVar;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        switch (this.f64b) {
            case 0:
                d dVar = (d) obj;
                ((Number) obj2).intValue();
                x0.o oVar = (x0.o) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(dVar) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    this.f65c.g(dVar, oVar, Integer.valueOf(iIntValue & 14));
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                c0.h hVar = (c0.h) obj;
                ((Number) obj2).intValue();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar2.f(hVar) ? 4 : 2;
                }
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    this.f65c.g(hVar, oVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    oVar2.Q();
                }
                break;
            default:
                m1 m1Var = (m1) obj;
                j1.q qVar = (j1.q) obj2;
                x0.o oVar3 = (x0.o) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i10 = (oVar3.f(m1Var) ? 4 : 2) | iIntValue3;
                } else {
                    i10 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i10 |= oVar3.f(qVar) ? 32 : 16;
                }
                if (oVar3.N(i10 & 1, (i10 & 147) != 146)) {
                    v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ = x0.v.q(oVar3);
                    j1 j1VarL = oVar3.l();
                    j1.q qVarC = j1.a.c(qVar, oVar3);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar);
                    } else {
                        oVar3.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar3);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar3);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar3, iQ, hVar2);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar3);
                    this.f65c.g(m1Var, oVar3, Integer.valueOf(i10 & 14));
                    oVar3.p(true);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
