package m0;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12977b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12979d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12982g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12978c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12980e = 112;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12981f = 280;

    static {
        float f10 = 8;
        f12976a = f10;
        float f11 = 48;
        f12977b = f11;
        f12979d = f10;
        f12982g = f11;
    }

    public static final void a(r.i0 i0Var, x0.w0 w0Var, s.o1 o1Var, j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        x0.w0 w0Var2;
        r.v vVar;
        r.u1 u1VarR;
        oVar.Y(1077393800);
        int i11 = i10 | (oVar.f(i0Var) ? 4 : 2) | (oVar.f(o1Var) ? 256 : 128) | (oVar.f(qVar) ? 2048 : 1024) | (oVar.h(fVar) ? 16384 : 8192);
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            r.q1 q1VarE = r.t1.e(i0Var, "DropDownMenu", oVar, (i11 & 14) | 48, 0);
            r.v1 v1Var = r.w1.f18620a;
            androidx.lifecycle.q qVar2 = q1VarE.f18539a;
            x0.e1 e1Var = q1VarE.f18542d;
            boolean zBooleanValue = ((Boolean) qVar2.b1()).booleanValue();
            oVar.W(-1833869404);
            float f10 = zBooleanValue ? 1.0f : 0.8f;
            oVar.p(false);
            Float fValueOf = Float.valueOf(f10);
            boolean zBooleanValue2 = ((Boolean) e1Var.getValue()).booleanValue();
            oVar.W(-1833869404);
            float f11 = zBooleanValue2 ? 1.0f : 0.8f;
            oVar.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            r.k1 k1VarF = q1VarE.f();
            oVar.W(445475263);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (k1VarF.b(bool, bool2)) {
                u1VarR = r.d.r(TinkerReport.KEY_APPLIED_EXCEPTION, 0, r.w.f18599b, 2);
                vVar = null;
            } else {
                vVar = null;
                u1VarR = r.d.r(1, 74, null, 4);
            }
            r.u1 u1Var = u1VarR;
            oVar.p(false);
            r.v vVar2 = vVar;
            r.m1 m1VarD = r.t1.d(q1VarE, fValueOf, fValueOf2, u1Var, v1Var, oVar, 0);
            boolean zBooleanValue3 = ((Boolean) q1VarE.f18539a.b1()).booleanValue();
            oVar.W(-1578341192);
            float f12 = zBooleanValue3 ? 1.0f : 0.0f;
            oVar.p(false);
            Float fValueOf3 = Float.valueOf(f12);
            boolean zBooleanValue4 = ((Boolean) e1Var.getValue()).booleanValue();
            oVar.W(-1578341192);
            float f13 = zBooleanValue4 ? 1.0f : 0.0f;
            oVar.p(false);
            Float fValueOf4 = Float.valueOf(f13);
            r.k1 k1VarF2 = q1VarE.f();
            oVar.W(701003475);
            r.u1 u1VarR2 = k1VarF2.b(bool, bool2) ? r.d.r(30, 0, vVar2, 6) : r.d.r(75, 0, vVar2, 6);
            oVar.p(false);
            r.m1 m1VarD2 = r.t1.d(q1VarE, fValueOf3, fValueOf4, u1VarR2, v1Var, oVar, 0);
            boolean zF = oVar.f(m1VarD) | oVar.f(m1VarD2);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                w0Var2 = w0Var;
                objK = new ba.i(w0Var2, m1VarD, m1VarD2);
                oVar.h0(objK);
            } else {
                w0Var2 = w0Var;
            }
            g8.a.a(androidx.compose.ui.graphics.a.a(j1.n.f9689a, (ic.k) objK), null, 0L, f12976a, f1.g.f(-707086267, new f((Object) qVar, (Object) o1Var, (ic.o) fVar, 3), oVar), oVar, 1769472, 30);
        } else {
            w0Var2 = w0Var;
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d4(i0Var, w0Var2, o1Var, qVar, fVar, i10);
        }
    }

    public static final void b(ic.a aVar, j1.q qVar, boolean z10, y.d1 d1Var, w.k kVar, ic.o oVar, x0.o oVar2, int i10) {
        int i11;
        w.k kVar2;
        oVar2.Y(-674391690);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.f(d1Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            kVar2 = kVar;
            i11 |= oVar2.f(kVar2) ? 16384 : 8192;
        } else {
            kVar2 = kVar;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar2.h(oVar) ? 131072 : 65536;
        }
        if (oVar2.N(i11 & 1, (74899 & i11) != 74898)) {
            j1.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.c(qVar, kVar2, l5.a(0.0f, 6, 0L, true), z10, null, aVar, 24), 1.0f), f12980e, f12982g, 8), d1Var);
            y.j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9672k, oVar2, 48);
            int iQ = x0.v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarI, oVar2);
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
            z8.a(((d9) oVar2.j(e9.f12960b)).f12884g, f1.g.f(-77738101, new e4(z10, oVar), oVar2), oVar2, 48);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new la.t0(aVar, qVar, z10, d1Var, kVar, oVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(f3.k r10, f3.k r11) {
        /*
            int r0 = r11.f6662a
            int r1 = r11.f6665d
            int r2 = r11.f6664c
            int r3 = r11.f6663b
            int r4 = r10.f6664c
            int r5 = r10.f6663b
            int r6 = r10.f6665d
            int r7 = r10.f6662a
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            if (r0 < r4) goto L17
        L15:
            r10 = 0
            goto L35
        L17:
            if (r2 > r7) goto L1c
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L35
        L1c:
            int r4 = r2 - r0
            if (r4 != 0) goto L21
            goto L15
        L21:
            int r4 = java.lang.Math.max(r7, r0)
            int r10 = r10.f6664c
            int r10 = java.lang.Math.min(r10, r2)
            int r10 = r10 + r4
            int r10 = r10 / 2
            int r10 = r10 - r0
            float r10 = (float) r10
            int r0 = r11.f6662a
            int r2 = r2 - r0
            float r0 = (float) r2
            float r10 = r10 / r0
        L35:
            if (r3 < r6) goto L39
        L37:
            r8 = 0
            goto L57
        L39:
            if (r1 > r5) goto L3c
            goto L57
        L3c:
            int r0 = r11.a()
            if (r0 != 0) goto L43
            goto L37
        L43:
            int r0 = java.lang.Math.max(r5, r3)
            int r1 = java.lang.Math.min(r6, r1)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r1 = r1 - r3
            float r0 = (float) r1
            int r11 = r11.a()
            float r11 = (float) r11
            float r8 = r0 / r11
        L57:
            long r10 = q1.h0.i(r10, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f4.c(f3.k, f3.k):long");
    }
}
