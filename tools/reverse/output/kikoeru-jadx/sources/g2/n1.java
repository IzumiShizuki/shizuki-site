package g2;

import x0.q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f7244a = new b1(5);

    public static final void a(f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(441837433);
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new t0();
                oVar.h0(objK);
            }
            t0 t0Var = (t0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = k.f7218d;
                oVar.h0(objK2);
            }
            ic.a aVar = (ic.a) objK2;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            if (oVar.S) {
                oVar.b(new q2(0), ub.a0.f21526a);
            }
            x0.v.A(m.f7235d, t0Var, oVar);
            fVar.g(t0Var, oVar, 48);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.r1(fVar, i10, 2);
        }
    }

    public static final void b(q1 q1Var, j1.q qVar, ic.n nVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(q1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(nVar) ? 256 : 128;
        }
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            long j10 = oVar.T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            x0.n nVarX = x0.v.x(oVar);
            j1.q qVarC = j1.a.c(qVar, oVar);
            x0.j1 j1VarL = oVar.l();
            i2.i iVar = i2.i.f8726d;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(q1Var.f7279c, q1Var, oVar);
            x0.v.A(q1Var.f7280d, nVarX, oVar);
            x0.v.A(q1Var.f7281e, nVar, oVar);
            i2.k.f8771g0.getClass();
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(i12))) {
                j2.h0.s(i12, oVar, i12, hVar);
            }
            oVar.p(true);
            if (oVar.z()) {
                oVar.W(-1259216055);
                oVar.p(false);
            } else {
                oVar.W(-1259274676);
                boolean zH = oVar.h(q1Var);
                Object objK = oVar.K();
                if (zH || objK == x0.k.f24334a) {
                    objK = new b0.d0(8, q1Var);
                    oVar.h0(objK);
                }
                x0.v.h((ic.a) objK, oVar);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(q1Var, qVar, nVar, i10, 1);
        }
    }

    public static final void c(j1.q qVar, ic.n nVar, x0.o oVar, int i10, int i11) {
        int i12;
        oVar.Y(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= oVar.h(nVar) ? 32 : 16;
        }
        if (oVar.N(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new q1(b1.f7160b);
                oVar.h0(objK);
            }
            b((q1) objK, qVar, nVar, oVar, (i12 << 3) & 1008);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m1(qVar, nVar, i10, i11);
        }
    }

    public static final float d(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float e(g2.f1 r6, boolean r7, g2.v[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.c(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n1.e(g2.f1, boolean, g2.v[], float):float");
    }

    public static final p1.c f(c0 c0Var) {
        c0 c0VarB = c0Var.B();
        return c0VarB != null ? c0VarB.s(c0Var, true) : new p1.c(0.0f, 0.0f, (int) (c0Var.k() >> 32), (int) (c0Var.k() & 4294967295L));
    }

    public static final p1.c g(c0 c0Var) {
        c0 c0VarI = i(c0Var);
        float fK = (int) (c0VarI.k() >> 32);
        float fK2 = (int) (c0VarI.k() & 4294967295L);
        p1.c cVarS = c0VarI.s(c0Var, true);
        float f10 = cVarS.f16483a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fK) {
            f10 = fK;
        }
        float f11 = cVarS.f16484b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fK2) {
            f11 = fK2;
        }
        float f12 = cVarS.f16485c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fK) {
            fK = f12;
        }
        float f13 = cVarS.f16486d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fK2) {
            fK2 = f14;
        }
        if (f10 == fK || f11 == fK2) {
            return p1.c.f16482e;
        }
        long jC = c0VarI.c((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        long jC2 = c0VarI.c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
        long jC3 = c0VarI.c((((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK2)) & 4294967295L));
        long jC4 = c0VarI.c((((long) Float.floatToRawIntBits(fK2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jC2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jC & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jC2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jC4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & jC3));
        return new p1.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static final c0 i(c0 c0Var) {
        c0 c0Var2;
        c0 c0VarB = c0Var.B();
        while (true) {
            c0 c0Var3 = c0VarB;
            c0Var2 = c0Var;
            c0Var = c0Var3;
            if (c0Var == null) {
                break;
            }
            c0VarB = c0Var.B();
        }
        i2.g1 g1Var = c0Var2 instanceof i2.g1 ? (i2.g1) c0Var2 : null;
        if (g1Var == null) {
            return c0Var2;
        }
        i2.g1 g1Var2 = g1Var.f8704s;
        while (true) {
            i2.g1 g1Var3 = g1Var2;
            i2.g1 g1Var4 = g1Var;
            g1Var = g1Var3;
            if (g1Var == null) {
                return g1Var4;
            }
            g1Var2 = g1Var.f8704s;
        }
    }

    public static final i2.r0 j(i2.r0 r0Var) {
        i2.j0 j0VarV = r0Var.f8831o.f8700o;
        while (true) {
            i2.j0 j0VarV2 = j0VarV.v();
            if ((j0VarV2 != null ? j0VarV2.f8749h : null) == null) {
                i2.r0 r0VarK0 = j0VarV.F.f8665d.K0();
                jc.l.b(r0VarK0);
                return r0VarK0;
            }
            i2.j0 j0VarV3 = j0VarV.v();
            i2.j0 j0Var = j0VarV3 != null ? j0VarV3.f8749h : null;
            jc.l.b(j0Var);
            if (j0Var.f8748g) {
                j0VarV = j0VarV.v();
                jc.l.b(j0VarV);
            } else {
                i2.j0 j0VarV4 = j0VarV.v();
                jc.l.b(j0VarV4);
                j0VarV = j0VarV4.f8749h;
                jc.l.b(j0VarV);
            }
        }
    }

    public static final f1.f k(j1.q qVar) {
        return new f1.f(new e0(qVar, 0), -511438721, true);
    }

    public static final long l(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) * Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
