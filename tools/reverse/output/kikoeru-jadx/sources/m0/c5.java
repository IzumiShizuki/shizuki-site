package m0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f12796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.d1 f12799d;

    public c5(ic.k kVar, boolean z10, float f10, y.d1 d1Var) {
        this.f12796a = kVar;
        this.f12797b = z10;
        this.f12798c = f10;
        this.f12799d = d1Var;
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
        int iIntValue3 = obj5 != null ? ((Number) nVar.q(obj5, Integer.valueOf(android.support.v4.media.session.b.M(this.f12798c, i11, i10)))).intValue() : 0;
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
                return a5.c(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) nVar.q(obj8, Integer.valueOf(i11))).intValue() : 0, this.f12798c, f3.b.b(0, 0, 15), yVar.a(), this.f12799d);
            }
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    public final int b(g2.y yVar, List list, int i10, ic.n nVar) {
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
                return a5.d(iIntValue4, iIntValue3, iIntValue, iIntValue2, u0Var4 != null ? ((Number) nVar.q(u0Var4, Integer.valueOf(i10))).intValue() : 0, this.f12798c, f3.b.b(0, 0, 15), yVar.a(), this.f12799d);
            }
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        return b(yVar, list, i10, new ka.h(16));
    }

    @Override // g2.v0
    public final int f(g2.y yVar, List list, int i10) {
        return b(yVar, list, i10, new ka.h(17));
    }

    @Override // g2.v0
    public final int g(g2.y yVar, List list, int i10) {
        return a(yVar, list, i10, new ka.h(15));
    }

    @Override // g2.v0
    public final g2.w0 h(final g2.x0 x0Var, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        long jFloatToRawIntBits;
        List list2;
        String str;
        Object obj4;
        final c5 c5Var = this;
        y.d1 d1Var = c5Var.f12799d;
        int iA0 = x0Var.a0(d1Var.a());
        long jA = f3.a.a(j10, 0, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj), "Leading")) {
                break;
            }
            i10++;
        }
        g2.u0 u0Var = (g2.u0) obj;
        g2.g1 g1VarV = u0Var != null ? u0Var.v(jA) : null;
        float f10 = m8.f13298a;
        int i11 = g1VarV != null ? g1VarV.f7180a : 0;
        int size2 = list3.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        g2.u0 u0Var2 = (g2.u0) obj2;
        g2.g1 g1VarV2 = u0Var2 != null ? u0Var2.v(f3.b.i(-i11, 0, jA)) : null;
        int i13 = i11 + (g1VarV2 != null ? g1VarV2.f7180a : 0);
        int iA02 = x0Var.a0(d1Var.d(x0Var.getLayoutDirection())) + x0Var.a0(d1Var.b(x0Var.getLayoutDirection()));
        int i14 = -i13;
        int i15 = -iA0;
        long jI = f3.b.i(android.support.v4.media.session.b.M(c5Var.f12798c, i14 - iA02, -iA02), i15, jA);
        int size3 = list3.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i16);
            if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj3), "Label")) {
                break;
            }
            i16++;
        }
        g2.u0 u0Var3 = (g2.u0) obj3;
        g2.g1 g1VarV3 = u0Var3 != null ? u0Var3.v(jI) : null;
        if (g1VarV3 != null) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(g1VarV3.f7180a)) << 32) | (((long) Float.floatToRawIntBits(g1VarV3.f7181b)) & 4294967295L);
        } else {
            jFloatToRawIntBits = 0;
        }
        c5Var.f12796a.a(new p1.e(jFloatToRawIntBits));
        long jA2 = f3.a.a(f3.b.i(i14, i15 - Math.max((g1VarV3 != null ? g1VarV3.f7181b : 0) / 2, x0Var.a0(d1Var.c())), j10), 0, 0, 0, 0, 11);
        int size4 = list3.size();
        int i17 = 0;
        while (true) {
            String str2 = "Collection contains no element matching the predicate.";
            if (i17 >= size4) {
                h3.a.c("Collection contains no element matching the predicate.");
                throw new ce.j0();
            }
            g2.u0 u0Var4 = (g2.u0) list.get(i17);
            if (jc.l.a(androidx.compose.ui.layout.a.a(u0Var4), "TextField")) {
                final g2.g1 g1VarV4 = u0Var4.v(jA2);
                long jA3 = f3.a.a(jA2, 0, 0, 0, 0, 14);
                List list4 = list;
                int size5 = list4.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        list2 = list4;
                        str = str2;
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i18);
                    list2 = list4;
                    str = str2;
                    if (jc.l.a(androidx.compose.ui.layout.a.a((g2.u0) obj4), "Hint")) {
                        break;
                    }
                    i18++;
                    list4 = list2;
                    str2 = str;
                }
                g2.u0 u0Var5 = (g2.u0) obj4;
                final g2.g1 g1VarV5 = u0Var5 != null ? u0Var5.v(jA3) : null;
                int i19 = g1VarV != null ? g1VarV.f7180a : 0;
                int i20 = g1VarV2 != null ? g1VarV2.f7180a : 0;
                final g2.g1 g1Var = g1VarV2;
                final int iD = a5.d(i19, i20, g1VarV4.f7180a, g1VarV3 != null ? g1VarV3.f7180a : 0, g1VarV5 != null ? g1VarV5.f7180a : 0, c5Var.f12798c, j10, x0Var.a(), c5Var.f12799d);
                final int iC = a5.c(g1VarV != null ? g1VarV.f7181b : 0, g1Var != null ? g1Var.f7181b : 0, g1VarV4.f7181b, g1VarV3 != null ? g1VarV3.f7181b : 0, g1VarV5 != null ? g1VarV5.f7181b : 0, c5Var.f12798c, j10, x0Var.a(), c5Var.f12799d);
                int size6 = list2.size();
                int i21 = 0;
                while (i21 < size6) {
                    g2.u0 u0Var6 = (g2.u0) list.get(i21);
                    if (jc.l.a(androidx.compose.ui.layout.a.a(u0Var6), "border")) {
                        final g2.g1 g1VarV6 = u0Var6.v(f3.b.a(iD != Integer.MAX_VALUE ? iD : 0, iD, iC != Integer.MAX_VALUE ? iC : 0, iC));
                        final g2.g1 g1Var2 = g1VarV;
                        final g2.g1 g1Var3 = g1VarV3;
                        return x0Var.b0(iD, iC, vb.s.f22820a, new ic.k() { // from class: m0.b5
                            @Override // ic.k
                            public final Object a(Object obj5) {
                                g2.f1 f1Var = (g2.f1) obj5;
                                c5 c5Var2 = c5Var;
                                float f11 = c5Var2.f12798c;
                                boolean z10 = c5Var2.f12797b;
                                g2.x0 x0Var2 = x0Var;
                                float fA = x0Var2.a();
                                f3.m layoutDirection = x0Var2.getLayoutDirection();
                                y.d1 d1Var2 = c5Var2.f12799d;
                                float f12 = a5.f12653a;
                                int iR = lc.b.R(d1Var2.c() * fA);
                                int iR2 = lc.b.R(androidx.compose.foundation.layout.a.e(d1Var2, layoutDirection) * fA);
                                float f13 = m8.f13299b * fA;
                                int i22 = iC;
                                g2.g1 g1Var4 = g1Var2;
                                if (g1Var4 != null) {
                                    g2.f1.k(f1Var, g1Var4, 0, Math.round((1 + 0.0f) * ((i22 - g1Var4.f7181b) / 2.0f)));
                                }
                                g2.g1 g1Var5 = g1Var;
                                if (g1Var5 != null) {
                                    g2.f1.k(f1Var, g1Var5, iD - g1Var5.f7180a, Math.round((1 + 0.0f) * ((i22 - g1Var5.f7181b) / 2.0f)));
                                }
                                g2.g1 g1Var6 = g1Var3;
                                if (g1Var6 != null) {
                                    g2.f1.k(f1Var, g1Var6, lc.b.R(g1Var4 == null ? 0.0f : (1 - f11) * (g1Var4.f7180a - f13)) + iR2, android.support.v4.media.session.b.M(f11, z10 ? Math.round((1 + 0.0f) * ((i22 - g1Var6.f7181b) / 2.0f)) : iR, -(g1Var6.f7181b / 2)));
                                }
                                g2.f1.k(f1Var, g1VarV4, g1Var4 != null ? g1Var4.f7180a : 0, Math.max(z10 ? Math.round((1 + 0.0f) * ((i22 - r2.f7181b) / 2.0f)) : iR, (g1Var6 != null ? g1Var6.f7181b : 0) / 2));
                                g2.g1 g1Var7 = g1VarV5;
                                if (g1Var7 != null) {
                                    if (z10) {
                                        iR = Math.round((1 + 0.0f) * ((i22 - g1Var7.f7181b) / 2.0f));
                                    }
                                    g2.f1.k(f1Var, g1Var7, g1Var4 != null ? g1Var4.f7180a : 0, Math.max(iR, (g1Var6 != null ? g1Var6.f7181b : 0) / 2));
                                }
                                g2.f1.j(f1Var, g1VarV6, 0L);
                                return ub.a0.f21526a;
                            }
                        });
                    }
                    i21++;
                    c5Var = this;
                    g1VarV = g1VarV;
                    g1VarV3 = g1VarV3;
                    g1VarV5 = g1VarV5;
                }
                h3.a.c(str);
                throw new ce.j0();
            }
            i17++;
            c5Var = this;
            g1VarV = g1VarV;
            g1VarV3 = g1VarV3;
        }
    }

    @Override // g2.v0
    public final int i(g2.y yVar, List list, int i10) {
        return a(yVar, list, i10, new ka.h(18));
    }
}
