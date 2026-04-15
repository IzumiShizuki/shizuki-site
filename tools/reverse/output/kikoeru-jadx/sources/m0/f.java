package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12964d;

    public f(ic.n nVar, f1.f fVar, f1.f fVar2) {
        this.f12961a = 5;
        this.f12962b = nVar;
        this.f12964d = fVar;
        this.f12963c = fVar2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        f1.f fVarF;
        int i10 = this.f12961a;
        j1.n nVar = j1.n.f9689a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj3 = this.f12963c;
        Object obj4 = this.f12964d;
        Object obj5 = this.f12962b;
        int i11 = 1;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    ic.n nVar2 = (ic.n) obj5;
                    ic.n nVar3 = (ic.n) obj3;
                    f1.f fVar = (f1.f) obj4;
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(nVar, oVar);
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
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    f1.f fVarF2 = null;
                    if (nVar2 == null) {
                        oVar.W(-97968969);
                        oVar.p(false);
                        fVarF = null;
                    } else {
                        oVar.W(-97968968);
                        fVarF = f1.g.f(1737550099, new e(i11, nVar2), oVar);
                        oVar.p(false);
                    }
                    if (nVar3 == null) {
                        oVar.W(-97547524);
                    } else {
                        oVar.W(-97547523);
                        fVarF2 = f1.g.f(1265552690, new e(3, nVar3), oVar);
                    }
                    oVar.p(false);
                    k.a(fVarF, fVarF2, oVar, 6);
                    fVar.q(oVar, 0);
                    oVar.p(true);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    x0.v.a(h1.f13043a.a(Float.valueOf(q1.q.d(((q1.q) ((x0.w0) obj5).getValue()).f17577a))), f1.g.f(-869936862, new u0((y.d1) obj3, (ic.o) obj4, i11), oVar2), oVar2, 56);
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    z8.a(t2.l0.a((t2.l0) obj3, 0L, 0L, null, null, null, 0L, null, null, 0L, null, (e3.i) obj4, 15728639), (ic.n) obj5, oVar3, 0);
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    j1.q qVarX = n7.b0.x(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.a.l((j1.q) obj5, 0.0f, f4.f12979d, 1)), (s.o1) obj3, true);
                    f1.f fVar2 = (f1.f) obj4;
                    y.v vVarA2 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar4, 0);
                    int iQ2 = x0.v.q(oVar4);
                    x0.j1 j1VarL2 = oVar4.l();
                    j1.q qVarC2 = j1.a.c(qVarX, oVar4);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar4.a0();
                    if (oVar4.S) {
                        oVar4.k(iVar2);
                    } else {
                        oVar4.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA2, oVar4);
                    x0.v.A(i2.j.f8737f, j1VarL2, oVar4);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar4, iQ2, hVar2);
                    }
                    x0.v.A(i2.j.f8735d, qVarC2, oVar4);
                    fVar2.g(y.w.f25274a, oVar4, 6);
                    oVar4.p(true);
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    j1.q qVarC3 = androidx.compose.ui.layout.a.c(nVar, "border");
                    float f10 = a5.f12653a;
                    j1.q qVarC4 = androidx.compose.ui.draw.a.c(qVarC3, new d9.u(((p1.e) ((x0.w0) obj3).getValue()).f16495a, (y.d1) obj4, 4));
                    ic.n nVar4 = (ic.n) obj5;
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, true);
                    int iQ3 = x0.v.q(oVar5);
                    x0.j1 j1VarL3 = oVar5.l();
                    j1.q qVarC5 = j1.a.c(qVarC4, oVar5);
                    i2.k.f8771g0.getClass();
                    i2.i iVar3 = i2.j.f8733b;
                    oVar5.a0();
                    if (oVar5.S) {
                        oVar5.k(iVar3);
                    } else {
                        oVar5.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar5);
                    x0.v.A(i2.j.f8737f, j1VarL3, oVar5);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar5.S || !jc.l.a(oVar5.K(), Integer.valueOf(iQ3))) {
                        j2.h0.s(iQ3, oVar5, iQ3, hVar3);
                    }
                    x0.v.A(i2.j.f8735d, qVarC5, oVar5);
                    if (nVar4 == null) {
                        oVar5.W(-1295979683);
                    } else {
                        oVar5.W(235288868);
                        nVar4.q(oVar5, 0);
                    }
                    oVar5.p(false);
                    oVar5.p(true);
                }
                break;
            default:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ic.n nVar5 = (ic.n) obj5;
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    if (nVar5 != null) {
                        oVar6.W(-1206609496);
                        nVar5.q(oVar6, 0);
                    } else {
                        oVar6.W(1249824744);
                    }
                    oVar6.p(false);
                    ((f1.f) obj4).q(oVar6, 0);
                    ((f1.f) obj3).q(oVar6, 0);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ f(Object obj, Object obj2, ic.n nVar, int i10) {
        this.f12961a = i10;
        this.f12963c = obj;
        this.f12964d = obj2;
        this.f12962b = nVar;
    }

    public /* synthetic */ f(Object obj, Object obj2, ic.o oVar, int i10) {
        this.f12961a = i10;
        this.f12962b = obj;
        this.f12963c = obj2;
        this.f12964d = oVar;
    }
}
