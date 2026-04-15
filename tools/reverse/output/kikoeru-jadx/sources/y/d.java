package y;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f25105a = new o0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f25106b = new o0(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25107c = 9;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f25108d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f25109e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25110f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f25111g = 15;

    public static final void a(j1.q qVar, j1.d dVar, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        Object obj;
        oVar.Y(1781813501);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i12 |= oVar.h(fVar) ? 2048 : 1024;
        }
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            j1.h hVar = j1.c.f9662a;
            g2.v0 v0VarD = p.d(hVar, false);
            boolean zF = oVar.f(v0VarD) | ((i12 & 7168) == 2048);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                objK = new b0.i0(20, v0VarD, fVar);
                oVar.h0(objK);
            }
            g2.n1.c(qVar, (ic.n) objK, oVar, i12 & 14, 0);
            obj = hVar;
        } else {
            oVar.Q();
            obj = dVar;
        }
        Object obj2 = obj;
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(qVar, obj2, (ub.e) fVar, i10, 8);
        }
    }

    public static final void b(j1.q qVar, f fVar, h hVar, j1.g gVar, int i10, int i11, f1.f fVar2, x0.o oVar, int i12) {
        int i13;
        int i14;
        int i15;
        oVar.Y(-2070229740);
        if ((i12 & 6) == 0) {
            i13 = (oVar.f(qVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= oVar.f(fVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= oVar.f(hVar) ? 256 : 128;
        }
        int i16 = i13 | 224256;
        if ((i12 & 1572864) == 0) {
            i16 |= oVar.h(fVar2) ? 1048576 : 524288;
        }
        if (oVar.N(i16 & 1, (599187 & i16) != 599186)) {
            gVar = j1.c.f9671j;
            c(qVar, fVar, hVar, o0.f25202b, fVar2, oVar, (i16 & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | ((i16 << 3) & 29360128));
            i14 = Integer.MAX_VALUE;
            i15 = Integer.MAX_VALUE;
        } else {
            oVar.Q();
            i14 = i10;
            i15 = i11;
        }
        j1.g gVar2 = gVar;
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i0(qVar, fVar, hVar, gVar2, i14, i15, fVar2, i12);
        }
    }

    public static final void c(j1.q qVar, f fVar, h hVar, o0 o0Var, f1.f fVar2, x0.o oVar, int i10) {
        int i11;
        Object obj;
        boolean z10;
        Object obj2;
        j1.g gVar = j1.c.f9671j;
        oVar.Y(-218661582);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(fVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(hVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(gVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.d(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            obj = o0Var;
            i11 |= oVar.f(obj) ? 1048576 : 524288;
        } else {
            obj = o0Var;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= oVar.h(fVar2) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if (oVar.N(i12 & 1, (i12 & 4793491) != 4793490)) {
            int i13 = i12 & 3670016;
            boolean z11 = i13 == 1048576;
            Object objK = oVar.K();
            Object obj3 = x0.k.f24334a;
            if (z11 || objK == obj3) {
                obj.getClass();
                objK = new l0();
                oVar.h0(objK);
            }
            l0 l0Var = (l0) objK;
            int i14 = i12 >> 3;
            boolean zF = ((((57344 & i14) ^ 24576) > 16384 && oVar.d(Integer.MAX_VALUE)) || (i14 & 24576) == 16384) | ((((i14 & 14) ^ 6) > 4 && oVar.f(fVar)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && oVar.f(hVar)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && oVar.f(gVar)) || (i14 & 384) == 256) | ((((i14 & 7168) ^ 3072) > 2048 && oVar.d(Integer.MAX_VALUE)) || (i14 & 3072) == 2048) | oVar.f(l0Var);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj3) {
                Object n0Var = new n0(fVar, hVar, fVar.a(), new z(gVar), hVar.a(), l0Var);
                oVar.h0(n0Var);
                objK2 = n0Var;
            }
            n0 n0Var2 = (n0) objK2;
            boolean z12 = (i13 == 1048576) | ((i12 & 29360128) == 8388608) | ((i12 & 458752) == 131072);
            Object objK3 = oVar.K();
            if (z12 || objK3 == obj3) {
                ArrayList arrayList = new ArrayList();
                z10 = true;
                arrayList.add(new f1.f(new b0.r1(fVar2), 702094978, true));
                o0Var.getClass();
                oVar.h0(arrayList);
                obj2 = arrayList;
            } else {
                z10 = true;
                obj2 = objK3;
            }
            f1.f fVar3 = new f1.f(new cg.d(2, (List) obj2), 1271844412, z10);
            boolean zF2 = oVar.f(n0Var2);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == obj3) {
                objK4 = new g2.a1(n0Var2);
                oVar.h0(objK4);
            }
            g2.v0 v0Var = (g2.v0) objK4;
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0Var, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar2 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar2);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            fVar3.q(oVar, 0);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q.e0(qVar, fVar, hVar, o0Var, fVar2, i10);
        }
    }

    public static final void d(j1.q qVar, x0.o oVar) {
        o oVar2 = o.f25200c;
        int iQ = x0.v.q(oVar);
        j1.q qVarC = j1.a.c(qVar, oVar);
        x0.j1 j1VarL = oVar.l();
        i2.k.f8771g0.getClass();
        i2.i iVar = i2.j.f8733b;
        c7.e1 e1Var = oVar.f24375a;
        oVar.a0();
        if (oVar.S) {
            oVar.k(iVar);
        } else {
            oVar.k0();
        }
        x0.v.A(i2.j.f8738g, oVar2, oVar);
        x0.v.A(i2.j.f8737f, j1VarL, oVar);
        x0.v.A(i2.j.f8735d, qVarC, oVar);
        i2.h hVar = i2.j.f8741j;
        if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
            j2.h0.s(iQ, oVar, iQ, hVar);
        }
        oVar.p(true);
    }

    public static e0 e(float f10) {
        return new e0(f10, 0, 0, 0);
    }

    public static final t0 g(c cVar, x0.o oVar) {
        return new t0(cVar, (f3.c) oVar.j(j2.l1.f9866h));
    }

    public static long h(long j10, x0 x0Var) {
        x0 x0Var2 = x0.f25284a;
        return f3.b.a(x0Var == x0Var2 ? f3.a.j(j10) : f3.a.i(j10), x0Var == x0Var2 ? f3.a.h(j10) : f3.a.g(j10), x0Var == x0Var2 ? f3.a.i(j10) : f3.a.j(j10), x0Var == x0Var2 ? f3.a.g(j10) : f3.a.h(j10));
    }

    public static long i(int i10, long j10) {
        return f3.b.a(0, f3.a.h(j10), (i10 & 4) != 0 ? f3.a.i(j10) : 0, f3.a.g(j10));
    }

    public static final h1 j(g2.u0 u0Var) {
        Object objA = u0Var.A();
        if (objA instanceof h1) {
            return (h1) objA;
        }
        return null;
    }

    public static final float k(h1 h1Var) {
        if (h1Var != null) {
            return h1Var.f25135a;
        }
        return 0.0f;
    }

    public static final g2.w0 l(g1 g1Var, int i10, int i11, int i12, int i13, int i14, g2.x0 x0Var, List list, g2.g1[] g1VarArr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        float f10;
        long j10;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j11 = i14;
        int i22 = i16 - i15;
        int[] iArr2 = new int[i22];
        int i23 = i15;
        int iMax = 0;
        int i24 = 0;
        int i25 = 0;
        int iMin = 0;
        float f11 = 0.0f;
        while (i23 < i16) {
            g2.u0 u0Var = (g2.u0) list2.get(i23);
            float fK = k(j(u0Var));
            if (fK > 0.0f) {
                f11 += fK;
                i24++;
                j10 = j11;
                i19 = i23;
            } else {
                int i26 = i12 - i25;
                g2.g1 g1VarV = g1VarArr[i23];
                j10 = j11;
                if (g1VarV == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i24;
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i19 = i23;
                        i20 = i24;
                        i21 = i26 < 0 ? 0 : i26;
                    }
                    g1VarV = u0Var.v(g1Var.e(0, i21, i13, false));
                } else {
                    i19 = i23;
                    i20 = i24;
                }
                g2.g1 g1Var2 = g1VarV;
                int iJ = g1Var.j(g1Var2);
                int iB = g1Var.b(g1Var2);
                iArr2[i19 - i15] = iJ;
                int i27 = i26 - iJ;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i14, i27);
                i25 += iJ + iMin;
                iMax = Math.max(iMax, iB);
                g1VarArr[i19] = g1Var2;
                i24 = i20;
            }
            i23 = i19 + 1;
            j11 = j10;
        }
        long j12 = j11;
        int i28 = i24;
        if (i28 == 0) {
            i25 -= iMin;
            i18 = 0;
        } else {
            long j13 = ((long) (i28 - 1)) * j12;
            long jRound = ((long) ((i12 != Integer.MAX_VALUE ? i12 : i10) - i25)) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i29 = i15; i29 < i16; i29++) {
                jRound -= (long) Math.round(k(j((g2.u0) list2.get(i29))) * f12);
            }
            int i30 = i15;
            int i31 = iMax;
            int i32 = 0;
            while (i30 < i16) {
                if (g1VarArr[i30] == null) {
                    g2.u0 u0Var2 = (g2.u0) list2.get(i30);
                    f10 = f12;
                    h1 h1VarJ = j(u0Var2);
                    float fK2 = k(h1VarJ);
                    if (fK2 <= 0.0f) {
                        z.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j14 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fK2 * f10) + iSignum);
                    g2.g1 g1VarV2 = u0Var2.v(g1Var.e((!(h1VarJ != null ? h1VarJ.f25136b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iJ2 = g1Var.j(g1VarV2);
                    int iB2 = g1Var.b(g1VarV2);
                    iArr2[i30 - i15] = iJ2;
                    i32 += iJ2;
                    int iMax3 = Math.max(i31, iB2);
                    g1VarArr[i30] = g1VarV2;
                    i31 = iMax3;
                    jRound = j14;
                } else {
                    f10 = f12;
                }
                i30++;
                list2 = list;
                f12 = f10;
            }
            i18 = (int) (((long) i32) + j13);
            int i33 = i12 - i25;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i33) {
                i18 = i33;
            }
            iMax = i31;
        }
        int i34 = i18 + i25;
        if (i34 < 0) {
            i34 = 0;
        }
        int iMax4 = Math.max(i34, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr3 = new int[i22];
        g1Var.d(iMax4, iArr2, iArr3, x0Var);
        return g1Var.a(g1VarArr, x0Var, iArr3, iMax4, iMax5, iArr, i17, i15, i16);
    }

    public static final void m(g2.u0 u0Var, n0 n0Var, long j10, ic.k kVar) {
        if (k(j(u0Var)) != 0.0f) {
            n0Var.getClass();
            u0Var.L(u0Var.m(Integer.MAX_VALUE));
            return;
        }
        j(u0Var);
        g2.g1 g1VarV = u0Var.v(j10);
        kVar.a(g1VarV);
        n0Var.getClass();
        g1VarV.W();
        g1VarV.V();
    }

    public static final j1.q n(j1.q qVar) {
        return j1.a.a(qVar, new v1(3, 1));
    }

    public static final j1.q o(j1.q qVar) {
        return j1.a.a(qVar, new v1(3, 2));
    }

    public static final long p(long j10) {
        return f3.b.a(f3.a.j(j10), f3.a.h(j10), f3.a.i(j10), f3.a.g(j10));
    }

    public static final u0 q(p3.b bVar) {
        return new u0(bVar.f16525a, bVar.f16526b, bVar.f16527c, bVar.f16528d);
    }

    public static final void r(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract int f(int i10, f3.m mVar);
}
