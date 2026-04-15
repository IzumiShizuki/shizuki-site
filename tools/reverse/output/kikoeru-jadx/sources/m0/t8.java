package m0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t8 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.d1 f13682c;

    public t8(boolean z10, float f10, y.d1 d1Var) {
        this.f13680a = z10;
        this.f13681b = f10;
        this.f13682c = d1Var;
    }

    public static int b(List list, int i10, ic.n nVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj5 = list.get(i11);
            if (jc.l.a(m8.c((g2.u0) obj5), "TextField")) {
                int iIntValue = ((Number) nVar.q(obj5, Integer.valueOf(i10))).intValue();
                int size2 = list2.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (jc.l.a(m8.c((g2.u0) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                g2.u0 u0Var = (g2.u0) obj2;
                int iIntValue2 = u0Var != null ? ((Number) nVar.q(u0Var, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (jc.l.a(m8.c((g2.u0) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                g2.u0 u0Var2 = (g2.u0) obj3;
                int iIntValue3 = u0Var2 != null ? ((Number) nVar.q(u0Var2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (jc.l.a(m8.c((g2.u0) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                g2.u0 u0Var3 = (g2.u0) obj4;
                int iIntValue4 = u0Var3 != null ? ((Number) nVar.q(u0Var3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i15);
                    if (jc.l.a(m8.c((g2.u0) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i15++;
                }
                g2.u0 u0Var4 = (g2.u0) obj;
                int iIntValue5 = u0Var4 != null ? ((Number) nVar.q(u0Var4, Integer.valueOf(i10))).intValue() : 0;
                long jB = f3.b.b(0, 0, 15);
                float f10 = r8.f13576a;
                return f3.b.g(Math.max(iIntValue, Math.max(iIntValue2, iIntValue5)) + iIntValue4 + iIntValue3, jB);
            }
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    public final int a(g2.y yVar, List list, int i10, ic.n nVar) {
        Object obj;
        Object obj2;
        int i11;
        int iIntValue;
        Object obj3;
        int iIntValue2;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i12 = 0;
        while (true) {
            obj = null;
            if (i12 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (jc.l.a(m8.c((g2.u0) obj2), "Leading")) {
                break;
            }
            i12++;
        }
        g2.u0 u0Var = (g2.u0) obj2;
        if (u0Var != null) {
            int iT = u0Var.t(Integer.MAX_VALUE);
            if (i10 == Integer.MAX_VALUE) {
                i11 = i10;
            } else {
                i11 = i10 - iT;
                if (i11 < 0) {
                    i11 = 0;
                }
            }
            iIntValue = ((Number) nVar.q(u0Var, Integer.valueOf(i10))).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (jc.l.a(m8.c((g2.u0) obj3), "Trailing")) {
                break;
            }
            i13++;
        }
        g2.u0 u0Var2 = (g2.u0) obj3;
        if (u0Var2 != null) {
            int iT2 = u0Var2.t(Integer.MAX_VALUE);
            if (i11 != Integer.MAX_VALUE && (i11 = i11 - iT2) < 0) {
                i11 = 0;
            }
            iIntValue2 = ((Number) nVar.q(u0Var2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (jc.l.a(m8.c((g2.u0) obj4), "Label")) {
                break;
            }
            i14++;
        }
        Object obj5 = (g2.u0) obj4;
        int iIntValue3 = obj5 != null ? ((Number) nVar.q(obj5, Integer.valueOf(i11))).intValue() : 0;
        int size4 = list2.size();
        for (int i15 = 0; i15 < size4; i15++) {
            Object obj6 = list.get(i15);
            if (jc.l.a(m8.c((g2.u0) obj6), "TextField")) {
                int iIntValue4 = ((Number) nVar.q(obj6, Integer.valueOf(i11))).intValue();
                int size5 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i16);
                    if (jc.l.a(m8.c((g2.u0) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i16++;
                }
                Object obj8 = (g2.u0) obj;
                return r8.d(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) nVar.q(obj8, Integer.valueOf(i11))).intValue() : 0, f3.b.b(0, 0, 15), yVar.a(), this.f13682c);
            }
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        return b(list, i10, new ka.h(20));
    }

    @Override // g2.v0
    public final int f(g2.y yVar, List list, int i10) {
        return b(list, i10, new ka.h(23));
    }

    @Override // g2.v0
    public final int g(g2.y yVar, List list, int i10) {
        return a(yVar, list, i10, new ka.h(21));
    }

    @Override // g2.v0
    public final g2.w0 h(final g2.x0 x0Var, List list, long j10) {
        Object obj;
        Object obj2;
        List list2;
        int i10;
        g2.g1 g1VarV;
        int i11;
        Object obj3;
        int iR;
        Object obj4;
        final t8 t8Var = this;
        List list3 = list;
        y.d1 d1Var = t8Var.f13682c;
        final int iA0 = x0Var.a0(d1Var.c());
        int iA02 = x0Var.a0(d1Var.a());
        final int iA03 = x0Var.a0(r8.f13578c);
        long jA = f3.a.a(j10, 0, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i12);
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj), "Leading")) {
                break;
            }
            i12++;
        }
        g2.u0 u0Var = (g2.u0) obj;
        final g2.g1 g1VarV2 = u0Var != null ? u0Var.v(jA) : null;
        float f10 = m8.f13298a;
        int i13 = g1VarV2 != null ? g1VarV2.f7180a : 0;
        int size2 = list4.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list3.get(i14);
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj2), "Trailing")) {
                break;
            }
            i14++;
        }
        g2.u0 u0Var2 = (g2.u0) obj2;
        if (u0Var2 != null) {
            list2 = list4;
            i10 = i13;
            g1VarV = u0Var2.v(f3.b.i(-i13, 0, jA));
        } else {
            list2 = list4;
            i10 = i13;
            g1VarV = null;
        }
        int i15 = -iA02;
        int i16 = -((g1VarV != null ? g1VarV.f7180a : 0) + i10);
        long jI = f3.b.i(i16, i15, jA);
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                i11 = iA02;
                obj3 = null;
                break;
            }
            obj3 = list3.get(i17);
            i11 = iA02;
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj3), "Label")) {
                break;
            }
            i17++;
            iA02 = i11;
        }
        g2.u0 u0Var3 = (g2.u0) obj3;
        final g2.g1 g1VarV3 = u0Var3 != null ? u0Var3.v(jI) : null;
        if (g1VarV3 != null) {
            iR = g1VarV3.R(g2.c.f7163b);
            if (iR == Integer.MIN_VALUE) {
                iR = g1VarV3.f7181b;
            }
        } else {
            iR = 0;
        }
        final int iMax = Math.max(iR, iA0);
        int i18 = iR;
        long jI2 = f3.b.i(i16, g1VarV3 != null ? (i15 - iA03) - iMax : (-iA0) - i11, f3.a.a(j10, 0, 0, 0, 0, 11));
        int size4 = list2.size();
        int i19 = 0;
        while (i19 < size4) {
            g2.u0 u0Var4 = (g2.u0) list3.get(i19);
            if (jc.l.a(androidx.compose.ui.layout.a.a(u0Var4), "TextField")) {
                final g2.g1 g1VarV4 = u0Var4.v(jI2);
                long jA2 = f3.a.a(jI2, 0, 0, 0, 0, 14);
                int size5 = list3.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list3.get(i20);
                    if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj4), "Hint")) {
                        break;
                    }
                    i20++;
                    list3 = list;
                }
                g2.u0 u0Var5 = (g2.u0) obj4;
                final g2.g1 g1VarV5 = u0Var5 != null ? u0Var5.v(jA2) : null;
                final int iG = f3.b.g(Math.max(g1VarV4.f7180a, Math.max(g1VarV3 != null ? g1VarV3.f7180a : 0, g1VarV5 != null ? g1VarV5.f7180a : 0)) + (g1VarV2 != null ? g1VarV2.f7180a : 0) + (g1VarV != null ? g1VarV.f7180a : 0), j10);
                final int iD = r8.d(g1VarV4.f7181b, g1VarV3 != null, iMax, g1VarV2 != null ? g1VarV2.f7181b : 0, g1VarV != null ? g1VarV.f7181b : 0, g1VarV5 != null ? g1VarV5.f7181b : 0, j10, x0Var.a(), t8Var.f13682c);
                final int i21 = i18;
                final g2.g1 g1Var = g1VarV;
                return x0Var.b0(iG, iD, vb.s.f22820a, new ic.k() { // from class: m0.s8
                    @Override // ic.k
                    public final Object a(Object obj5) {
                        int i22;
                        t8 t8Var2 = t8Var;
                        boolean z10 = t8Var2.f13680a;
                        g2.f1 f1Var = (g2.f1) obj5;
                        g2.g1 g1Var2 = g1VarV3;
                        int i23 = iG;
                        int i24 = iD;
                        g2.g1 g1Var3 = g1VarV4;
                        g2.g1 g1Var4 = g1VarV5;
                        g2.g1 g1Var5 = g1VarV2;
                        g2.g1 g1Var6 = g1Var;
                        g2.x0 x0Var2 = x0Var;
                        if (g1Var2 != null) {
                            int i25 = iA0 - i21;
                            if (i25 < 0) {
                                i25 = 0;
                            }
                            int i26 = iMax + iA03;
                            float f11 = t8Var2.f13681b;
                            float fA = x0Var2.a();
                            float f12 = r8.f13576a;
                            if (g1Var5 != null) {
                                g2.f1.k(f1Var, g1Var5, 0, Math.round((1 + 0.0f) * ((i24 - g1Var5.f7181b) / 2.0f)));
                            }
                            if (g1Var6 != null) {
                                g2.f1.k(f1Var, g1Var6, i23 - g1Var6.f7180a, Math.round((1 + 0.0f) * ((i24 - g1Var6.f7181b) / 2.0f)));
                            }
                            int iRound = (z10 ? Math.round((1 + 0.0f) * ((i24 - g1Var2.f7181b) / 2.0f)) : lc.b.R(m8.f13298a * fA)) - lc.b.R((r0 - i25) * f11);
                            float f13 = m8.f13298a;
                            g2.f1.k(f1Var, g1Var2, g1Var5 != null ? g1Var5.f7180a : 0, iRound);
                            g2.f1.k(f1Var, g1Var3, g1Var5 != null ? g1Var5.f7180a : 0, i26);
                            if (g1Var4 != null) {
                                g2.f1.k(f1Var, g1Var4, g1Var5 != null ? g1Var5.f7180a : 0, i26);
                            }
                        } else {
                            float fA2 = x0Var2.a();
                            y.d1 d1Var2 = t8Var2.f13682c;
                            float f14 = r8.f13576a;
                            int iR2 = lc.b.R(d1Var2.c() * fA2);
                            if (g1Var5 != null) {
                                i22 = 0;
                                g2.f1.k(f1Var, g1Var5, 0, Math.round((1 + 0.0f) * ((i24 - g1Var5.f7181b) / 2.0f)));
                            } else {
                                i22 = 0;
                            }
                            if (g1Var6 != null) {
                                g2.f1.k(f1Var, g1Var6, i23 - g1Var6.f7180a, Math.round((1 + 0.0f) * ((i24 - g1Var6.f7181b) / 2.0f)));
                            }
                            int iRound2 = z10 ? Math.round((1 + 0.0f) * ((i24 - g1Var3.f7181b) / 2.0f)) : iR2;
                            float f15 = m8.f13298a;
                            g2.f1.k(f1Var, g1Var3, g1Var5 != null ? g1Var5.f7180a : 0, iRound2);
                            if (g1Var4 != null) {
                                if (z10) {
                                    iR2 = Math.round((1 + 0.0f) * ((i24 - g1Var4.f7181b) / 2.0f));
                                }
                                if (g1Var5 != null) {
                                    i22 = g1Var5.f7180a;
                                }
                                g2.f1.k(f1Var, g1Var4, i22, iR2);
                            }
                        }
                        return ub.a0.f21526a;
                    }
                });
            }
            i19++;
            i18 = i18;
            g1VarV = g1VarV;
            t8Var = this;
            list3 = list;
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    @Override // g2.v0
    public final int i(g2.y yVar, List list, int i10) {
        return a(yVar, list, i10, new ka.h(22));
    }
}
