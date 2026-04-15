package fa;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import ce.j0;
import hd.q0;
import j2.h0;
import m0.d9;
import m0.e9;
import m0.i5;
import m0.r3;
import m0.z8;
import n7.b0;
import q1.n0;
import ub.a0;
import w1.g0;
import x0.j1;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j9.f f7033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7034b;

    public r(j9.f fVar, int i10) {
        j9.u uVar = j9.u.f10753a;
        this.f7033a = fVar;
        this.f7034b = i10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j9.f fVar;
        w1.f fVarL;
        k1 k1Var = (k1) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        jc.l.e(k1Var, "$this$DropdownMenuItem");
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(k1Var) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            j9.f fVar2 = this.f7033a;
            int iOrdinal = fVar2.f10690d.ordinal();
            if (iOrdinal == 0) {
                fVar = fVar2;
                fVarL = b0.l();
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fVarL = nh.b.f15907n;
                    if (fVarL == null) {
                        w1.e eVar = new w1.e("Filled.WifiOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = g0.f23208a;
                        fVar = fVar2;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0VarH = h0.h(22.99f, 9.0f);
                        q0VarH.m(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
                        q0VarH.t(2.52f, 2.52f);
                        q0VarH.n(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
                        q0VarH.t(2.0f, -2.0f);
                        q0VarH.l();
                        q0VarH.u(18.99f, 13.0f);
                        q0VarH.n(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
                        q0VarH.t(3.53f, 3.53f);
                        q0VarH.t(0.96f, -0.97f);
                        q0VarH.l();
                        q0VarH.u(2.0f, 3.05f);
                        q0VarH.s(5.07f, 6.1f);
                        q0VarH.m(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
                        q0VarH.t(1.99f, 2.0f);
                        q0VarH.n(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
                        q0VarH.t(2.24f, 2.24f);
                        q0VarH.m(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
                        q0VarH.z(0.01f);
                        q0VarH.s(6.99f, 15.0f);
                        q0VarH.n(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
                        q0VarH.s(18.98f, 20.0f);
                        q0VarH.t(1.27f, -1.26f);
                        q0VarH.s(3.29f, 1.79f);
                        q0VarH.s(2.0f, 3.05f);
                        q0VarH.l();
                        q0VarH.u(9.0f, 17.0f);
                        q0VarH.t(3.0f, 3.0f);
                        q0VarH.t(3.0f, -3.0f);
                        q0VarH.n(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                        q0VarH.l();
                        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                        fVarL = eVar.b();
                        nh.b.f15907n = fVarL;
                    }
                } else if (iOrdinal == 3) {
                    fVarL = nd.h.g();
                } else {
                    if (iOrdinal != 4) {
                        throw new j0();
                    }
                    fVarL = nh.a.p();
                }
                fVar = fVar2;
            } else {
                fVar = fVar2;
                fVarL = nh.a.f15891n;
                if (fVarL == null) {
                    w1.e eVar2 = new w1.e("Filled.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = g0.f23208a;
                    n0 n0Var2 = new n0(q1.q.f17569b);
                    q0 q0Var = new q0((byte) 0, 6);
                    q0Var.u(1.0f, 9.0f);
                    q0Var.t(2.0f, 2.0f);
                    q0Var.n(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, 0.0f);
                    q0Var.t(2.0f, -2.0f);
                    q0Var.m(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
                    q0Var.l();
                    q0Var.u(9.0f, 17.0f);
                    q0Var.t(3.0f, 3.0f);
                    q0Var.t(3.0f, -3.0f);
                    q0Var.n(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                    q0Var.l();
                    q0Var.u(5.0f, 13.0f);
                    q0Var.t(2.0f, 2.0f);
                    q0Var.n(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, 0.0f);
                    q0Var.t(2.0f, -2.0f);
                    q0Var.m(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
                    q0Var.l();
                    w1.e.a(eVar2, q0Var.f8447b, 0, n0Var2);
                    fVarL = eVar2.b();
                    nh.a.f15891n = fVarL;
                }
            }
            float f10 = 10;
            j1.n nVar = j1.n.f9689a;
            j1.q qVarN = androidx.compose.foundation.layout.a.n(nVar, 0.0f, 0.0f, f10, 0.0f, 11);
            y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarN, oVar);
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
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            r3.b(fVarL, null, null, 0L, oVar, 48, 12);
            z8.b(String.valueOf(fVar.f10687a), new HorizontalAlignElement(j1.c.f9675n), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(e9.f12960b)).f12889l, oVar, 0, 0, 65532);
            oVar.p(true);
            z8.b(fVar.f10688b, k1Var.a(nVar, 1.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131068);
            j9.u uVar = j9.u.f10753a;
            i5.a(this.f7034b == ((Number) j9.u.f10756d.getValue()).intValue(), androidx.compose.foundation.layout.a.n(nVar, 0.0f, 0.0f, f10, 0.0f, 11), false, null, oVar, 432, 56);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
