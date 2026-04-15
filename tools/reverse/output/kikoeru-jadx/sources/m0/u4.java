package m0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f13699e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f13701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f13702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f13703i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4 f13695a = new u4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13696b = 48;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13697c = 56;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13698d = 40;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f13700f = 8;

    static {
        float f10 = 16;
        f13699e = f10;
        f13701g = f10;
        f13702h = f10;
        f13703i = f10;
    }

    public final void a(j1.q qVar, ic.n nVar, f1.f fVar, ic.n nVar2, x0.o oVar, int i10) {
        int i11;
        u4 u4Var;
        int i12;
        boolean z10;
        j1.h hVar = j1.c.f9665d;
        oVar.Y(413592998);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(fVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(nVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            u4Var = this;
            i11 |= oVar.f(u4Var) ? 16384 : 8192;
        } else {
            u4Var = this;
        }
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            j1.q qVarF = androidx.compose.foundation.layout.c.f(qVar, nVar == null ? f13696b : f13697c, 0.0f, 2);
            y.j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9671j, oVar, 0);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarF, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar2 = i2.j.f8738g;
            x0.v.A(hVar2, j1VarA, oVar);
            i2.h hVar3 = i2.j.f8737f;
            x0.v.A(hVar3, j1VarL, oVar);
            i2.h hVar4 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar4);
            }
            i2.h hVar5 = i2.j.f8735d;
            x0.v.A(hVar5, qVarC, oVar);
            if (nVar != null) {
                oVar.W(-999770394);
                VerticalAlignElement verticalAlignElement = new VerticalAlignElement();
                float f10 = f13698d;
                float f11 = f13699e;
                j1.q qVarO = androidx.compose.foundation.layout.c.o(verticalAlignElement, f11 + f10, 2);
                float f12 = f13700f;
                j1.q qVarN = androidx.compose.foundation.layout.a.n(qVarO, f11, f12, 0.0f, f12, 4);
                g2.v0 v0VarD = y.p.d(hVar, false);
                int iQ2 = x0.v.q(oVar);
                x0.j1 j1VarL2 = oVar.l();
                j1.q qVarC2 = j1.a.c(qVarN, oVar);
                oVar.a0();
                i12 = i11;
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(hVar2, v0VarD, oVar);
                x0.v.A(hVar3, j1VarL2, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                    j2.h0.s(iQ2, oVar, iQ2, hVar4);
                }
                x0.v.A(hVar5, qVarC2, oVar);
                nVar.q(oVar, Integer.valueOf((i12 >> 3) & 14));
                oVar.p(true);
                oVar.p(false);
            } else {
                i12 = i11;
                oVar.W(-999261064);
                oVar.p(false);
            }
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            j1.q qVarN2 = androidx.compose.foundation.layout.a.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).e(new VerticalAlignElement()), f13701g, 0.0f, f13702h, 0.0f, 10);
            g2.v0 v0VarD2 = y.p.d(hVar, false);
            int iQ3 = x0.v.q(oVar);
            x0.j1 j1VarL3 = oVar.l();
            j1.q qVarC3 = j1.a.c(qVarN2, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar2, v0VarD2, oVar);
            x0.v.A(hVar3, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                j2.h0.s(iQ3, oVar, iQ3, hVar4);
            }
            x0.v.A(hVar5, qVarC3, oVar);
            fVar.q(oVar, Integer.valueOf((i12 >> 6) & 14));
            oVar.p(true);
            if (nVar2 != null) {
                oVar.W(-998918452);
                j1.q qVarN3 = androidx.compose.foundation.layout.a.n(new VerticalAlignElement(), 0.0f, 0.0f, f13703i, 0.0f, 11);
                g2.v0 v0VarD3 = y.p.d(j1.c.f9662a, false);
                int iQ4 = x0.v.q(oVar);
                x0.j1 j1VarL4 = oVar.l();
                j1.q qVarC4 = j1.a.c(qVarN3, oVar);
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(hVar2, v0VarD3, oVar);
                x0.v.A(hVar3, j1VarL4, oVar);
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ4))) {
                    j2.h0.s(iQ4, oVar, iQ4, hVar4);
                }
                x0.v.A(hVar5, qVarC4, oVar);
                nVar2.q(oVar, Integer.valueOf((i12 >> 9) & 14));
                z10 = true;
                oVar.p(true);
                oVar.p(false);
            } else {
                z10 = true;
                oVar.W(-998722408);
                oVar.p(false);
            }
            oVar.p(z10);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.d(u4Var, qVar, nVar, fVar, nVar2, i10);
        }
    }
}
