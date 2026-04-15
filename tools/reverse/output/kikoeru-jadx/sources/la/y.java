package la;

import bg.e1;
import m0.d9;
import m0.e9;
import m0.j1;
import m0.r3;
import m0.z8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f12150b;

    public /* synthetic */ y(e1 e1Var, int i10) {
        this.f12149a = i10;
        this.f12150b = e1Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        w1.f fVarB;
        w1.f fVarB2;
        int i10 = this.f12149a;
        j1.n nVar = j1.n.f9689a;
        ub.a0 a0Var = ub.a0.f21526a;
        e1 e1Var = this.f12150b;
        int i11 = 2;
        switch (i10) {
            case 0:
                int i12 = e1Var.f2875i;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    r3.b(i12 == 1 ? n7.d.s() : nh.a.v(), null, androidx.compose.foundation.layout.c.j(nVar, 15), i12 == 1 ? ja.a.f10792i : ja.a.f10793j, oVar, 432, 0);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    x0.v.a(j1.f13125a.a(new q1.q(ja.a.f10793j)), f1.g.f(-1558425980, new y(e1Var, 3), oVar2), oVar2, 56);
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9675n, oVar3, 48);
                    int iQ = x0.v.q(oVar3);
                    x0.j1 j1VarL = oVar3.l();
                    j1.q qVarC = j1.a.c(nVar, oVar3);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar);
                    } else {
                        oVar3.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA, oVar3);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar3);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar3, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar3);
                    if (e1Var.f2875i == 1) {
                        fVarB = n7.d.s();
                    } else {
                        fVarB = n7.e.f15470l;
                        if (fVarB == null) {
                            w1.e eVar = new w1.e("Filled.ThumbUpOffAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i13 = w1.g0.f23208a;
                            q1.n0 n0Var = new q1.n0(q1.q.f17569b);
                            hd.q0 q0Var = new hd.q0((byte) 0, 6);
                            q0Var.u(13.11f, 5.72f);
                            q0Var.t(-0.57f, 2.89f);
                            q0Var.n(-0.12f, 0.59f, 0.04f, 1.2f, 0.42f, 1.66f);
                            q0Var.n(0.38f, 0.46f, 0.94f, 0.73f, 1.54f, 0.73f);
                            q0Var.q(20.0f);
                            q0Var.z(1.08f);
                            q0Var.s(17.43f, 18.0f);
                            q0Var.q(9.34f);
                            q0Var.n(-0.18f, 0.0f, -0.34f, -0.16f, -0.34f, -0.34f);
                            q0Var.y(9.82f);
                            q0Var.t(4.11f, -4.1f);
                            q0Var.u(14.0f, 2.0f);
                            q0Var.s(7.59f, 8.41f);
                            q0Var.m(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f);
                            q0Var.z(7.83f);
                            q0Var.m(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f);
                            q0Var.r(8.1f);
                            q0Var.n(0.71f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f);
                            q0Var.t(2.67f, -6.15f);
                            q0Var.n(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f);
                            q0Var.y(11.0f);
                            q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            q0Var.r(-5.5f);
                            q0Var.t(0.92f, -4.65f);
                            q0Var.n(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f);
                            q0Var.n(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f);
                            q0Var.s(14.0f, 2.0f);
                            q0Var.l();
                            q0Var.u(4.0f, 9.0f);
                            q0Var.q(2.0f);
                            q0Var.z(11.0f);
                            q0Var.r(2.0f);
                            q0Var.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                            q0Var.z(-9.0f);
                            q0Var.n(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                            q0Var.l();
                            w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                            fVarB = eVar.b();
                            n7.e.f15470l = fVarB;
                        }
                    }
                    r3.b(fVarB, "ThumbUp", null, 0L, oVar3, 48, 12);
                    z8.b(String.valueOf(e1Var.f2871e), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar3.j(e9.f12960b)).f12889l, oVar3, 0, 0, 65534);
                    oVar3.p(true);
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    y.v vVarA2 = y.u.a(y.k.f25158c, j1.c.f9675n, oVar4, 48);
                    int iQ2 = x0.v.q(oVar4);
                    x0.j1 j1VarL2 = oVar4.l();
                    j1.q qVarC2 = j1.a.c(nVar, oVar4);
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
                    if (e1Var.f2875i == 2) {
                        fVarB2 = nh.a.v();
                    } else {
                        fVarB2 = nh.b.f15905l;
                        if (fVarB2 == null) {
                            w1.e eVar2 = new w1.e("Filled.ThumbDownOffAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i14 = w1.g0.f23208a;
                            q1.n0 n0Var2 = new q1.n0(q1.q.f17569b);
                            hd.q0 q0Var2 = new hd.q0((byte) 0, 6);
                            q0Var2.u(10.89f, 18.28f);
                            q0Var2.t(0.57f, -2.89f);
                            q0Var2.n(0.12f, -0.59f, -0.04f, -1.2f, -0.42f, -1.66f);
                            q0Var2.n(-0.38f, -0.46f, -0.94f, -0.73f, -1.54f, -0.73f);
                            q0Var2.s(4.0f, 13.0f);
                            q0Var2.z(-1.08f);
                            q0Var2.s(6.57f, 6.0f);
                            q0Var2.r(8.09f);
                            q0Var2.n(0.18f, 0.0f, 0.34f, 0.16f, 0.34f, 0.34f);
                            q0Var2.z(7.84f);
                            q0Var2.t(-4.11f, 4.1f);
                            q0Var2.u(10.0f, 22.0f);
                            q0Var2.t(6.41f, -6.41f);
                            q0Var2.n(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
                            q0Var2.s(17.0f, 6.34f);
                            q0Var2.m(17.0f, 5.05f, 15.95f, 4.0f, 14.66f, 4.0f);
                            q0Var2.r(-8.1f);
                            q0Var2.n(-0.71f, 0.0f, -1.36f, 0.37f, -1.72f, 0.97f);
                            q0Var2.t(-2.67f, 6.15f);
                            q0Var2.n(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f);
                            q0Var2.s(2.0f, 13.0f);
                            q0Var2.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            q0Var2.r(5.5f);
                            q0Var2.t(-0.92f, 4.65f);
                            q0Var2.n(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f);
                            q0Var2.n(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f);
                            q0Var2.s(10.0f, 22.0f);
                            q0Var2.l();
                            q0Var2.u(20.0f, 15.0f);
                            q0Var2.r(2.0f);
                            q0Var2.s(22.0f, 4.0f);
                            q0Var2.r(-2.0f);
                            q0Var2.n(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                            q0Var2.z(9.0f);
                            q0Var2.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                            q0Var2.l();
                            w1.e.a(eVar2, q0Var2.f8447b, 0, n0Var2);
                            fVarB2 = eVar2.b();
                            nh.b.f15905l = fVarB2;
                        }
                    }
                    r3.b(fVarB2, "ThumbDown", null, 0L, oVar4, 48, 12);
                    z8.b(String.valueOf(e1Var.f2872f), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar4.j(e9.f12960b)).f12889l, oVar4, 0, 0, 65534);
                    oVar4.p(true);
                }
                break;
            default:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    x0.v.a(j1.f13125a.a(new q1.q(ja.a.f10792i)), f1.g.f(339069901, new y(e1Var, i11), oVar5), oVar5, 56);
                }
                break;
        }
        return a0Var;
    }
}
