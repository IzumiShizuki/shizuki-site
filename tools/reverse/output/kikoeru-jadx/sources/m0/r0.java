package m0;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.u1 f13539a = new r.u1(TinkerReport.KEY_LOADED_MISMATCH_DEX, r.w.f18598a, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13540b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y.e0 f13543e;

    static {
        float f10 = 12;
        f13541c = f10;
        f13542d = f10;
        float f11 = 0;
        f13543e = new y.e0(f11, f11, f11, f11);
    }

    public static final void a(final j1.q qVar, final long j10, final long j11, final float f10, final f1.f fVar, x0.o oVar, final int i10) {
        oVar.Y(783675913);
        int i11 = i10 | (oVar.f(qVar) ? 4 : 2) | (oVar.e(j10) ? 32 : 16) | (oVar.e(j11) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            int i12 = i11 << 3;
            b(f13543e, qVar, j10, j11, f10, fVar, oVar, (i12 & 7168) | (i12 & 112) | 6 | (i12 & 896) | 221184);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(j10, j11, f10, fVar, i10) { // from class: m0.j0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f13121b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f13122c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f13123d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ f1.f f13124e;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(27649);
                    r0.a(this.f13120a, this.f13121b, this.f13122c, this.f13123d, this.f13124e, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void b(y.r1 r1Var, j1.q qVar, long j10, long j11, float f10, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(-636542119);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(r1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.e(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.e(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.c(f10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            oVar.S();
            if ((i10 & 1) != 0 && !oVar.x()) {
                oVar.Q();
            }
            oVar.q();
            android.support.v4.media.session.b.m(qVar, null, j10, j11, null, f10, f1.g.f(807373717, new ee.b(4, r1Var, fVar), oVar), oVar, ((i11 >> 3) & 14) | 1572864 | (i11 & 896) | (i11 & 7168) | ((i11 << 3) & 458752), 18);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ka.p(r1Var, qVar, j10, j11, f10, fVar, i10);
        }
    }

    public static final void c(final y.k1 k1Var, final boolean z10, final ic.a aVar, final f1.f fVar, j1.q qVar, boolean z11, final ic.n nVar, boolean z12, final long j10, final long j11, x0.o oVar, final int i10) {
        int i11;
        final boolean z13;
        final boolean z14;
        j1.q qVar2;
        boolean z15;
        boolean z16;
        f1.f fVarF;
        boolean z17;
        oVar.Y(-1744464261);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(k1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(fVar) ? 2048 : 1024;
        }
        int i12 = i11 | 221184;
        if ((1572864 & i10) == 0) {
            i12 |= oVar.h(nVar) ? 1048576 : 524288;
        }
        int i13 = i12 | 113246208;
        if ((805306368 & i10) == 0) {
            i13 |= oVar.e(j10) ? 536870912 : 268435456;
        }
        int i14 = oVar.e(j11) ? 4 : 2;
        if (oVar.N(i13 & 1, ((306783379 & i13) == 306783378 && (i14 & 3) == 2) ? false : true)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                qVar2 = j1.n.f9689a;
                z15 = true;
                z16 = true;
            } else {
                oVar.Q();
                qVar2 = qVar;
                z16 = z11;
                z15 = z12;
            }
            oVar.q();
            if (nVar == null) {
                oVar.W(-229962826);
                z17 = false;
                oVar.p(false);
                fVarF = null;
            } else {
                oVar.W(-229962825);
                fVarF = f1.g.f(2120789583, new e(4, nVar), oVar);
                z17 = false;
                oVar.p(false);
            }
            int i15 = i13;
            f1.f fVar2 = fVarF;
            j1.q qVar3 = qVar2;
            j1.q qVarA = k1Var.a(androidx.compose.foundation.selection.c.a(qVar2, z10, l5.a(0.0f, 2, j10, z17), z16, new q2.h(4), aVar), 1.0f);
            g2.v0 v0VarD = y.p.d(j1.c.f9666e, z17);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarA, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            qVar = qVar3;
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            e(j10, j11, z10, f1.g.f(2011119551, new p0(z15, fVar, fVar2), oVar), oVar, ((i15 >> 27) & 14) | 3072 | ((i14 << 3) & 112) | ((i15 << 3) & 896));
            oVar.p(true);
            z14 = z15;
            z13 = z16;
        } else {
            oVar.Q();
            z13 = z11;
            z14 = z12;
        }
        final j1.q qVar4 = qVar;
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.k0
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r0.c(k1Var, z10, aVar, fVar, qVar4, z13, nVar, z14, j10, j11, (x0.o) obj, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void d(final f1.f fVar, final ic.n nVar, final float f10, x0.o oVar, final int i10) {
        boolean z10;
        oVar.Y(-1481587758);
        int i11 = i10 | (oVar.h(fVar) ? 4 : 2) | (oVar.h(nVar) ? 32 : 16) | (oVar.c(f10) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objK = oVar.K();
            if (z11 || objK == x0.k.f24334a) {
                objK = new q0(f10, nVar);
                oVar.h0(objK);
            }
            g2.v0 v0Var = (g2.v0) objK;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.n nVar2 = j1.n.f9689a;
            j1.q qVarC = j1.a.c(nVar2, oVar);
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
            j1.q qVarC2 = androidx.compose.ui.layout.a.c(nVar2, "icon");
            j1.h hVar5 = j1.c.f9662a;
            g2.v0 v0VarD = y.p.d(hVar5, false);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC3 = j1.a.c(qVarC2, oVar);
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
            if (nVar != null) {
                oVar.W(1977704767);
                j1.q qVarL = androidx.compose.foundation.layout.a.l(g8.a.i(androidx.compose.ui.layout.a.c(nVar2, "label"), f10), f13541c, 0.0f, 2);
                g2.v0 v0VarD2 = y.p.d(hVar5, false);
                int iQ3 = x0.v.q(oVar);
                x0.j1 j1VarL3 = oVar.l();
                j1.q qVarC4 = j1.a.c(qVarL, oVar);
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
                z10 = true;
                oVar.p(true);
                oVar.p(false);
            } else {
                z10 = true;
                oVar.W(1977958471);
                oVar.p(false);
            }
            oVar.p(z10);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(nVar, f10, i10) { // from class: m0.m0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ic.n f13262b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f13263c;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(1);
                    r0.d(this.f13261a, this.f13262b, this.f13263c, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void e(long j10, long j11, boolean z10, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(616920545);
        if ((i10 & 6) == 0) {
            i11 = (oVar.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.e(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(fVar) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            x0.n2 n2VarB = r.e.b(z10 ? 1.0f : 0.0f, f13539a, oVar);
            long jQ = q1.h0.q(j11, j10, ((Number) n2VarB.getValue()).floatValue());
            x0.v.b(new x0.n1[]{j1.f13125a.a(new q1.q(q1.q.b(1.0f, jQ))), h1.f13043a.a(Float.valueOf(q1.q.d(jQ)))}, f1.g.f(343660833, new ee.b(5, fVar, n2VarB), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0(j10, j11, z10, fVar, i10, 0);
        }
    }
}
