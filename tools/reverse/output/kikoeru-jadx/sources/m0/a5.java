package m0;

import androidx.compose.material.MinimumInteractiveModifier;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12653a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f12654b = lc.b.C(8);

    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r73, final ic.k r74, j1.q r75, boolean r76, boolean r77, t2.l0 r78, final ic.n r79, ic.n r80, ic.n r81, ic.n r82, boolean r83, y2.g0 r84, h0.t0 r85, h0.s0 r86, boolean r87, int r88, int r89, q1.l0 r90, m0.x1 r91, x0.o r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instruction units count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a5.a(java.lang.String, ic.k, j1.q, boolean, boolean, t2.l0, ic.n, ic.n, ic.n, ic.n, boolean, y2.g0, h0.t0, h0.s0, boolean, int, int, q1.l0, m0.x1, x0.o, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v22, types: [int] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v68 */
    public static final void b(final j1.q qVar, ic.n nVar, ic.o oVar, ic.n nVar2, final ic.n nVar3, final ic.n nVar4, final boolean z10, final float f10, final ic.k kVar, final f1.f fVar, y.d1 d1Var, x0.o oVar2, final int i10) {
        int i11;
        ic.n nVar5;
        ic.o oVar3;
        boolean z11;
        ?? r15;
        boolean z12;
        final ic.n nVar6 = nVar2;
        final y.d1 d1Var2 = d1Var;
        j1.h hVar = j1.c.f9666e;
        oVar2.Y(36320288);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.h(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.h(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.h(nVar6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar2.h(nVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar2.h(nVar4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar2.g(z10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= oVar2.c(f10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= oVar2.h(kVar) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= oVar2.h(fVar) ? 536870912 : 268435456;
        }
        int i12 = i11;
        char c3 = oVar2.f(d1Var2) ? (char) 4 : (char) 2;
        if (oVar2.N(i12 & 1, ((i11 & 306783379) == 306783378 && (c3 & 3) == 2) ? false : true)) {
            boolean z13 = ((i12 & 234881024) == 67108864) | ((i12 & 3670016) == 1048576) | ((i12 & 29360128) == 8388608) | ((c3 & 14) == 4);
            Object objK = oVar2.K();
            if (z13 || objK == x0.k.f24334a) {
                objK = new c5(kVar, z10, f10, d1Var2);
                oVar2.h0(objK);
            }
            c5 c5Var = (c5) objK;
            f3.m mVar = (f3.m) oVar2.j(j2.l1.f9872n);
            int iQ = x0.v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVar, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            i2.h hVar2 = i2.j.f8738g;
            x0.v.A(hVar2, c5Var, oVar2);
            i2.h hVar3 = i2.j.f8737f;
            x0.v.A(hVar3, j1VarL, oVar2);
            i2.h hVar4 = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar2, iQ, hVar4);
            }
            i2.h hVar5 = i2.j.f8735d;
            x0.v.A(hVar5, qVarC, oVar2);
            fVar.q(oVar2, Integer.valueOf((i12 >> 27) & 14));
            j1.n nVar7 = j1.n.f9689a;
            if (nVar3 != null) {
                oVar2.W(1336978507);
                j1.q qVarC2 = androidx.compose.ui.layout.a.c(nVar7, "Leading");
                x0.o2 o2Var = t3.f13651a;
                j1.q qVarE = qVarC2.e(MinimumInteractiveModifier.f666a);
                g2.v0 v0VarD = y.p.d(hVar, false);
                int iQ2 = x0.v.q(oVar2);
                x0.j1 j1VarL2 = oVar2.l();
                j1.q qVarC3 = j1.a.c(qVarE, oVar2);
                oVar2.a0();
                if (oVar2.S) {
                    oVar2.k(iVar);
                } else {
                    oVar2.k0();
                }
                x0.v.A(hVar2, v0VarD, oVar2);
                x0.v.A(hVar3, j1VarL2, oVar2);
                if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                    j2.h0.s(iQ2, oVar2, iQ2, hVar4);
                }
                x0.v.A(hVar5, qVarC3, oVar2);
                nVar3.q(oVar2, Integer.valueOf((i12 >> 12) & 14));
                oVar2.p(true);
                z11 = false;
                oVar2.p(false);
            } else {
                z11 = false;
                oVar2.W(1337224523);
                oVar2.p(false);
            }
            if (nVar4 != null) {
                oVar2.W(1337267241);
                j1.q qVarC4 = androidx.compose.ui.layout.a.c(nVar7, "Trailing");
                x0.o2 o2Var2 = t3.f13651a;
                j1.q qVarE2 = qVarC4.e(MinimumInteractiveModifier.f666a);
                g2.v0 v0VarD2 = y.p.d(hVar, z11);
                int iQ3 = x0.v.q(oVar2);
                x0.j1 j1VarL3 = oVar2.l();
                j1.q qVarC5 = j1.a.c(qVarE2, oVar2);
                oVar2.a0();
                if (oVar2.S) {
                    oVar2.k(iVar);
                } else {
                    oVar2.k0();
                }
                x0.v.A(hVar2, v0VarD2, oVar2);
                x0.v.A(hVar3, j1VarL3, oVar2);
                if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ3))) {
                    j2.h0.s(iQ3, oVar2, iQ3, hVar4);
                }
                x0.v.A(hVar5, qVarC5, oVar2);
                nVar4.q(oVar2, Integer.valueOf((i12 >> 15) & 14));
                oVar2.p(true);
                r15 = 0;
                oVar2.p(false);
            } else {
                oVar2.W(1337515179);
                oVar2.p(z11);
                r15 = z11;
            }
            d1Var2 = d1Var;
            float fE = androidx.compose.foundation.layout.a.e(d1Var2, mVar);
            float fD = androidx.compose.foundation.layout.a.d(d1Var2, mVar);
            if (nVar3 != null) {
                fE -= m8.f13299b;
                float f11 = (float) r15;
                if (fE < f11) {
                    fE = f11;
                }
            }
            float f12 = fE;
            if (nVar4 != null) {
                fD -= m8.f13299b;
                float f13 = (float) r15;
                if (fD < f13) {
                    fD = f13;
                }
            }
            j1.q qVarN = androidx.compose.foundation.layout.a.n(nVar7, f12, 0.0f, fD, 0.0f, 10);
            if (oVar != null) {
                oVar2.W(1338367152);
                oVar3 = oVar;
                oVar3.g(androidx.compose.ui.layout.a.c(nVar7, "Hint").e(qVarN), oVar2, Integer.valueOf((i12 >> 3) & 112));
                oVar2.p(false);
            } else {
                oVar3 = oVar;
                oVar2.W(1338454603);
                oVar2.p(false);
            }
            j1.q qVarE3 = androidx.compose.ui.layout.a.c(nVar7, "TextField").e(qVarN);
            j1.h hVar6 = j1.c.f9662a;
            g2.v0 v0VarD3 = y.p.d(hVar6, true);
            int iQ4 = x0.v.q(oVar2);
            x0.j1 j1VarL4 = oVar2.l();
            j1.q qVarC6 = j1.a.c(qVarE3, oVar2);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(hVar2, v0VarD3, oVar2);
            x0.v.A(hVar3, j1VarL4, oVar2);
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ4))) {
                j2.h0.s(iQ4, oVar2, iQ4, hVar4);
            }
            x0.v.A(hVar5, qVarC6, oVar2);
            nVar5 = nVar;
            nVar5.q(oVar2, Integer.valueOf((i12 >> 3) & 14));
            oVar2.p(true);
            if (nVar2 != null) {
                oVar2.W(1338685429);
                j1.q qVarC7 = androidx.compose.ui.layout.a.c(nVar7, "Label");
                g2.v0 v0VarD4 = y.p.d(hVar6, false);
                int iQ5 = x0.v.q(oVar2);
                x0.j1 j1VarL5 = oVar2.l();
                j1.q qVarC8 = j1.a.c(qVarC7, oVar2);
                oVar2.a0();
                if (oVar2.S) {
                    oVar2.k(iVar);
                } else {
                    oVar2.k0();
                }
                x0.v.A(hVar2, v0VarD4, oVar2);
                x0.v.A(hVar3, j1VarL5, oVar2);
                if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ5))) {
                    j2.h0.s(iQ5, oVar2, iQ5, hVar4);
                }
                x0.v.A(hVar5, qVarC8, oVar2);
                nVar6 = nVar2;
                nVar6.q(oVar2, Integer.valueOf((i12 >> 9) & 14));
                z12 = true;
                oVar2.p(true);
                oVar2.p(false);
            } else {
                nVar6 = nVar2;
                z12 = true;
                oVar2.W(1338768075);
                oVar2.p(false);
            }
            oVar2.p(z12);
        } else {
            nVar5 = nVar;
            oVar3 = oVar;
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            final ic.n nVar8 = nVar5;
            final ic.o oVar4 = oVar3;
            p1VarR.f24421d = new ic.n() { // from class: m0.w4
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a5.b(qVar, nVar8, oVar4, nVar6, nVar3, nVar4, z10, f10, kVar, fVar, d1Var2, (x0.o) obj, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final int c(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, y.d1 d1Var) {
        int iMax = Math.max(i12, Math.max(i14, android.support.v4.media.session.b.M(f10, i13, 0)));
        float fC = d1Var.c() * f11;
        return f3.b.f(Math.max(i10, Math.max(i11, lc.b.R(android.support.v4.media.session.b.L(fC, Math.max(fC, i13 / 2.0f), f10) + iMax + (d1Var.a() * f11)))), j10);
    }

    public static final int d(int i10, int i11, int i12, int i13, int i14, float f10, long j10, float f11, y.d1 d1Var) {
        int iMax = Math.max(i12, Math.max(android.support.v4.media.session.b.M(f10, i13, 0), i14)) + i10 + i11;
        f3.m mVar = f3.m.f6667a;
        return f3.b.g(Math.max(iMax, lc.b.R((i13 + ((d1Var.d(mVar) + d1Var.b(mVar)) * f11)) * f10)), j10);
    }
}
