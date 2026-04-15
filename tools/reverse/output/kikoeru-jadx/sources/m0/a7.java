package m0;

import androidx.compose.foundation.layout.HorizontalAlignElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12661c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12664f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12659a = 30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12660b = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12662d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12663e = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12665g = 12;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12666h = 48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f12667i = 68;

    static {
        float f10 = 8;
        f12661c = f10;
        f12664f = f10;
    }

    public static final void a(f1.f fVar, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(-1534293206);
        int i11 = (oVar.h(fVar) ? 4 : 2) | i10 | (oVar.h(nVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
            float f10 = f12662d;
            float f11 = f12660b;
            float f12 = f12661c;
            j1.q qVarN = androidx.compose.foundation.layout.a.n(qVarC, f11, 0.0f, f12, f10, 2);
            y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarN, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, vVarA, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC2, oVar);
            j1.q qVarN2 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.o(), 0.0f, 0.0f, f12, 0.0f, 11);
            j1.h hVar5 = j1.c.f9662a;
            g2.v0 v0VarD = y.p.d(hVar5, false);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC3 = j1.a.c(qVarN2, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC3, oVar);
            fVar.q(oVar, Integer.valueOf(i11 & 14));
            oVar.p(true);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(j1.c.f9676o);
            g2.v0 v0VarD2 = y.p.d(hVar5, false);
            int iQ3 = x0.v.q(oVar);
            x0.j1 j1VarL3 = oVar.l();
            j1.q qVarC4 = j1.a.c(horizontalAlignElement, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD2, oVar);
            x0.v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                j2.h0.s(iQ3, oVar, iQ3, hVar3);
            }
            x0.v.A(hVar4, qVarC4, oVar);
            nVar.q(oVar, Integer.valueOf((i11 >> 3) & 14));
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x6(fVar, nVar, i10, 1);
        }
    }

    public static final void b(f1.f fVar, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(1302703572);
        int i11 = (oVar.h(fVar) ? 4 : 2) | i10 | (oVar.h(nVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            j1.n nVar2 = j1.n.f9689a;
            j1.q qVarN = androidx.compose.foundation.layout.a.n(nVar2, f12660b, 0.0f, f12661c, 0.0f, 10);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new d(2);
                oVar.h0(objK);
            }
            g2.v0 v0Var = (g2.v0) objK;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarN, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, v0Var, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar);
            j1.q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.ui.layout.a.c(nVar2, "text"), 0.0f, f12663e, 1);
            j1.h hVar5 = j1.c.f9662a;
            g2.v0 v0VarD = y.p.d(hVar5, false);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarL, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar);
            fVar.q(oVar, Integer.valueOf(i11 & 14));
            oVar.p(true);
            j1.q qVarC3 = androidx.compose.ui.layout.a.c(nVar2, "action");
            g2.v0 v0VarD2 = y.p.d(hVar5, false);
            int iQ3 = x0.v.q(oVar);
            x0.j1 j1VarL3 = oVar.l();
            j1.q qVarC4 = j1.a.c(qVarC3, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD2, oVar);
            x0.v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                j2.h0.s(iQ3, oVar, iQ3, hVar3);
            }
            x0.v.A(hVar4, qVarC4, oVar);
            nVar.q(oVar, Integer.valueOf((i11 >> 3) & 14));
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x6(fVar, nVar, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final j1.q r23, final ic.n r24, final boolean r25, q1.l0 r26, final long r27, final long r29, float r31, final f1.f r32, x0.o r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a7.c(j1.q, ic.n, boolean, q1.l0, long, long, float, f1.f, x0.o, int, int):void");
    }

    public static final void d(final j1.q qVar, final q1.l0 l0Var, final long j10, final long j11, final long j12, final float f10, x0.o oVar, final int i10) {
        int i11;
        oVar.Y(258660814);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? oVar.f(null) : oVar.h(null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i12 = i11 | 1456;
        }
        if ((i10 & 24576) == 0) {
            i12 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= 524288;
        }
        int i13 = 12582912 | i12;
        if (!oVar.N(i13 & 1, (4793491 & i13) != 4793490)) {
            oVar.Q();
            x0.p1 p1VarR = oVar.r();
            if (p1VarR != null) {
                p1VarR.f24421d = new ic.n() { // from class: m0.v6
                    @Override // ic.n
                    public final Object q(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a7.d(qVar, l0Var, j10, j11, j12, f10, (x0.o) obj, x0.v.D(i10 | 1));
                        return ub.a0.f21526a;
                    }
                };
                return;
            }
            return;
        }
        oVar.S();
        if ((i10 & 1) == 0 || oVar.x()) {
            g0.f fVar = ((y5) oVar.j(z5.f13997a)).f13961a;
            x0.o2 o2Var = c1.f12773a;
            q1.h0.l(q1.q.b(0.8f, ((b1) oVar.j(o2Var)).e()), ((b1) oVar.j(o2Var)).i());
            ((b1) oVar.j(o2Var)).i();
            b1 b1Var = (b1) oVar.j(o2Var);
            if (b1Var.j()) {
                q1.h0.l(q1.q.b(0.6f, b1Var.i()), b1Var.f());
            } else {
                b1Var.g();
            }
        } else {
            oVar.Q();
        }
        oVar.q();
        throw null;
    }

    public static final void e(f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(343813818);
        int i11 = (oVar.h(fVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = d.f12828c;
                oVar.h0(objK);
            }
            g2.v0 v0Var = (g2.v0) objK;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.n nVar = j1.n.f9689a;
            j1.q qVarC = j1.a.c(nVar, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, v0Var, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar);
            j1.q qVarK = androidx.compose.foundation.layout.a.k(nVar, f12660b, f12663e);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarK, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar);
            fVar.q(oVar, Integer.valueOf(i11 & 14));
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.r(i10, 11, fVar);
        }
    }
}
