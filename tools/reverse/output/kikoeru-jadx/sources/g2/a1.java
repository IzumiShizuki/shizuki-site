package g2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.n0 f7156a;

    public a1(y.n0 n0Var) {
        this.f7156a = n0Var;
    }

    @Override // g2.v0
    public final int c(y yVar, List list, int i10) {
        ArrayList arrayListK = i2.f.k(yVar);
        y.n0 n0Var = this.f7156a;
        y.l0 l0Var = n0Var.f25196f;
        List list2 = (List) vb.m.b0(1, arrayListK);
        u0 u0Var = list2 != null ? (u0) vb.m.a0(list2) : null;
        List list3 = (List) vb.m.b0(2, arrayListK);
        l0Var.a(u0Var, list3 != null ? (u0) vb.m.a0(list3) : null, f3.b.b(0, i10, 7));
        List list4 = (List) vb.m.a0(arrayListK);
        if (list4 == null) {
            list4 = vb.r.f22819a;
        }
        int iA0 = yVar.a0(n0Var.f25193c);
        int size = list4.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iT = ((u0) list4.get(i11)).t(i10) + iA0;
            int i14 = i11 + 1;
            if (i14 - i12 == Integer.MAX_VALUE || i14 == list4.size()) {
                iMax = Math.max(iMax, (i13 + iT) - iA0);
                i12 = i11;
                i13 = 0;
            } else {
                i13 += iT;
            }
            i11 = i14;
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && jc.l.a(this.f7156a, ((a1) obj).f7156a);
    }

    @Override // g2.v0
    public final int f(y yVar, List list, int i10) {
        int[] iArr;
        List list2;
        long j10;
        int i11;
        long jA;
        int i12;
        o.k kVar;
        ArrayList arrayListK = i2.f.k(yVar);
        y.n0 n0Var = this.f7156a;
        y.l0 l0Var = n0Var.f25196f;
        int i13 = 1;
        List list3 = (List) vb.m.b0(1, arrayListK);
        u0 u0Var = list3 != null ? (u0) vb.m.a0(list3) : null;
        List list4 = (List) vb.m.b0(2, arrayListK);
        int i14 = 0;
        l0Var.a(u0Var, list4 != null ? (u0) vb.m.a0(list4) : null, f3.b.b(0, i10, 7));
        List list5 = (List) vb.m.a0(arrayListK);
        if (list5 == null) {
            list5 = vb.r.f22819a;
        }
        int iA0 = yVar.a0(n0Var.f25193c);
        int iA02 = yVar.a0(n0Var.f25195e);
        y.l0 l0Var2 = n0Var.f25196f;
        long jA2 = o.k.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        for (int i15 = 0; i15 < size3; i15++) {
            u0 u0Var2 = (u0) list5.get(i15);
            int iM = u0Var2.m(i10);
            iArr2[i15] = iM;
            iArr3[i15] = u0Var2.L(iM);
        }
        if (Integer.MAX_VALUE < list5.size()) {
            l0Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            l0Var2.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i16 += iArr2[i17];
        }
        int size4 = ((list5.size() - 1) * iA0) + i16;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i18 = iArr3[0];
        oc.c it = new oc.d(1, size2 - 1, 1).iterator();
        while (it.f16312c) {
            int i19 = iArr3[it.nextInt()];
            if (i18 < i19) {
                i18 = i19;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr2[0];
        oc.c it2 = new oc.d(1, size - 1, 1).iterator();
        while (it2.f16312c) {
            int i21 = iArr2[it2.nextInt()];
            if (i20 < i21) {
                i20 = i21;
            }
        }
        int i22 = size4;
        while (i20 <= i22 && i18 != i10) {
            int i23 = (i20 + i22) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                jA = jA2;
                j10 = jA;
                iArr = iArr2;
            } else {
                y.h0 h0Var = new y.h0(l0Var2, f3.b.a(i14, i23, i14, Integer.MAX_VALUE), iA0, iA02);
                u0 u0Var3 = (u0) vb.m.b0(i14, list5);
                int i24 = u0Var3 != null ? iArr3[i14] : 0;
                if (u0Var3 != null) {
                    i14 = iArr2[i14];
                }
                iArr = iArr2;
                int i25 = 0;
                if (h0Var.b(list5.size() > i13, 0, o.k.a(i23, Integer.MAX_VALUE), u0Var3 == null ? null : new o.k(o.k.a(i14, i24)), 0, 0, 0, false, false).f25130b) {
                    l0Var2.getClass();
                    list2 = list5;
                    jA = jA2;
                    j10 = jA;
                } else {
                    int size5 = list6.size();
                    int i26 = i23;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    while (true) {
                        if (i28 >= size5) {
                            list2 = list5;
                            j10 = jA2;
                            i11 = i29;
                            break;
                        }
                        int i32 = i26 - i14;
                        int i33 = i28 + 1;
                        int iMax = Math.max(i27, i24);
                        u0 u0Var4 = (u0) vb.m.b0(i33, list5);
                        i24 = u0Var4 != null ? iArr3[i33] : 0;
                        if (u0Var4 != null) {
                            list2 = list5;
                            i12 = iArr[i33] + iA0;
                        } else {
                            list2 = list5;
                            i12 = 0;
                        }
                        boolean z10 = i28 + 2 < list2.size();
                        int i34 = i33 - i31;
                        int i35 = i30;
                        long jA3 = o.k.a(i32, Integer.MAX_VALUE);
                        if (u0Var4 == null) {
                            j10 = jA2;
                            kVar = null;
                        } else {
                            j10 = jA2;
                            kVar = new o.k(o.k.a(i12, i24));
                        }
                        y.g0 g0VarB = h0Var.b(z10, i34, jA3, kVar, i35, i25, iMax, false, false);
                        if (g0VarB.f25129a) {
                            int i36 = iMax + iA02 + i25;
                            h0Var.a(g0VarB, u0Var4 != null, i35, i36, i32, i34);
                            i12 -= iA0;
                            i30 = i35 + 1;
                            if (g0VarB.f25130b) {
                                i25 = i36;
                                i11 = i33;
                                break;
                            }
                            i26 = i23;
                            i25 = i36;
                            i31 = i33;
                            i27 = 0;
                        } else {
                            i26 = i32;
                            i30 = i35;
                            i27 = iMax;
                        }
                        i14 = i12;
                        list5 = list2;
                        i28 = i33;
                        i29 = i28;
                        jA2 = j10;
                    }
                    jA = o.k.a(i25 - iA02, i11);
                }
            }
            i18 = (int) (jA >> 32);
            int i37 = (int) (jA & 4294967295L);
            if (i18 > i10 || i37 < iMin) {
                i20 = i23 + 1;
                if (i20 > i22) {
                    return i20;
                }
            } else {
                if (i18 >= i10) {
                    return i23;
                }
                i22 = i23 - 1;
            }
            size4 = i23;
            iArr2 = iArr;
            list5 = list2;
            jA2 = j10;
            i13 = 1;
            i14 = 0;
        }
        return size4;
    }

    @Override // g2.v0
    public final int g(y yVar, List list, int i10) {
        ArrayList arrayListK = i2.f.k(yVar);
        y.n0 n0Var = this.f7156a;
        y.l0 l0Var = n0Var.f25196f;
        List list2 = (List) vb.m.b0(1, arrayListK);
        u0 u0Var = list2 != null ? (u0) vb.m.a0(list2) : null;
        List list3 = (List) vb.m.b0(2, arrayListK);
        l0Var.a(u0Var, list3 != null ? (u0) vb.m.a0(list3) : null, f3.b.b(i10, 0, 13));
        List list4 = (List) vb.m.a0(arrayListK);
        if (list4 == null) {
            list4 = vb.r.f22819a;
        }
        return y.n0.c(list4, i10, yVar.a0(n0Var.f25193c), yVar.a0(n0Var.f25195e), n0Var.f25196f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        u0 u0Var;
        u0 u0Var2;
        y.n0 n0Var;
        int i10;
        g1 g1Var;
        o.k kVar;
        y.g0 g0Var;
        int i11;
        int i12;
        u0 u0Var3;
        long j11;
        o.k kVar2;
        Integer num;
        int i13;
        o.k kVar3;
        y.g0 g0Var2;
        Integer numValueOf;
        int i14;
        long jA;
        long jA2;
        g1 g1VarV;
        ArrayList arrayListK = i2.f.k(x0Var);
        y.n0 n0Var2 = this.f7156a;
        y.l0 l0Var = n0Var2.f25196f;
        boolean zIsEmpty = arrayListK.isEmpty();
        vb.s sVar = vb.s.f22820a;
        if (!zIsEmpty) {
            if (f3.a.g(j10) != 0) {
                List list2 = (List) vb.m.Y(arrayListK);
                if (list2.isEmpty()) {
                    return x0Var.b0(0, 0, sVar, y.n.f25188g);
                }
                List list3 = (List) vb.m.b0(1, arrayListK);
                u0 u0Var4 = list3 != null ? (u0) vb.m.a0(list3) : null;
                List list4 = (List) vb.m.b0(2, arrayListK);
                u0 u0Var5 = list4 != null ? (u0) vb.m.a0(list4) : null;
                list2.size();
                l0Var.getClass();
                y.x0 x0Var2 = y.x0.f25284a;
                long jP = y.d.p(y.d.i(10, y.d.h(j10, x0Var2)));
                if (u0Var4 != null) {
                    y.d.m(u0Var4, n0Var2, jP, new y.k0(l0Var, n0Var2, 0));
                }
                if (u0Var5 != null) {
                    y.d.m(u0Var5, n0Var2, jP, new y.k0(l0Var, n0Var2, 1));
                }
                Iterator it = list2.iterator();
                float f10 = n0Var2.f25193c;
                float f11 = n0Var2.f25195e;
                long jH = y.d.h(j10, x0Var2);
                y.l0 l0Var2 = n0Var2.f25196f;
                z0.e eVar = new z0.e(new w0[16]);
                int iH = f3.a.h(jH);
                int iJ = f3.a.j(jH);
                int iG = f3.a.g(jH);
                o.y yVar = o.n.f16024a;
                o.y yVar2 = new o.y();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(x0Var.Q(f10));
                int iCeil2 = (int) Math.ceil(x0Var.Q(f11));
                long jA3 = f3.b.a(0, iH, 0, iG);
                long jP2 = y.d.p(y.d.i(14, jA3));
                if (it.hasNext()) {
                    try {
                        u0Var = (u0) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        u0Var = null;
                    }
                    u0Var2 = u0Var;
                } else {
                    u0Var2 = null;
                }
                if (u0Var2 != null) {
                    if (y.d.k(y.d.j(u0Var2)) == 0.0f) {
                        y.d.j(u0Var2);
                        g1VarV = u0Var2.v(jP2);
                        n0Var = n0Var2;
                        jA2 = o.k.a(g1VarV.W(), g1VarV.V());
                    } else {
                        n0Var = n0Var2;
                        int iM = u0Var2.m(Integer.MAX_VALUE);
                        jA2 = o.k.a(iM, u0Var2.L(iM));
                        g1VarV = null;
                    }
                    i10 = iCeil;
                    kVar = new o.k(jA2);
                    g1Var = g1VarV;
                } else {
                    n0Var = n0Var2;
                    i10 = iCeil;
                    g1Var = null;
                    kVar = null;
                }
                g1 g1Var2 = g1Var;
                Integer numValueOf2 = kVar != null ? Integer.valueOf((int) (kVar.f15994a >> 32)) : null;
                Integer numValueOf3 = kVar != null ? Integer.valueOf((int) (kVar.f15994a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                y.h0 h0Var = new y.h0(l0Var2, jH, i10, iCeil2);
                int i15 = i10;
                o.k kVar4 = kVar;
                y.g0 g0VarB = h0Var.b(it.hasNext(), 0, o.k.a(iH, iG), kVar4, 0, 0, 0, false, false);
                if (g0VarB.f25130b) {
                    g0Var = g0VarB;
                    h0Var.a(g0Var, kVar4 != null, -1, 0, iH, 0);
                } else {
                    g0Var = g0VarB;
                }
                int[] iArrCopyOf = iArr2;
                int i16 = iJ;
                Integer num2 = numValueOf3;
                y.g0 g0Var3 = g0Var;
                g1 g1VarV2 = g1Var2;
                Integer num3 = numValueOf2;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = i15;
                u0 u0Var6 = u0Var2;
                int[] iArrCopyOf2 = iArr;
                int i24 = 0;
                int i25 = 0;
                int i26 = iH;
                while (!g0Var3.f25130b && u0Var6 != null) {
                    jc.l.b(num3);
                    int iIntValue = num3.intValue();
                    jc.l.b(num2);
                    int iIntValue2 = num2.intValue();
                    int i27 = i25;
                    int i28 = i19 + iIntValue;
                    int iMax = Math.max(i17, iIntValue2);
                    int i29 = i26 - iIntValue;
                    int i30 = i18 + 1;
                    l0Var2.getClass();
                    arrayList.add(u0Var6);
                    yVar2.h(i18, g1VarV2);
                    int i31 = i30 - i20;
                    if (it.hasNext()) {
                        try {
                            u0Var3 = (u0) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            u0Var3 = null;
                        }
                        u0Var6 = u0Var3;
                    } else {
                        u0Var6 = null;
                    }
                    if (u0Var6 != null) {
                        if (y.d.k(y.d.j(u0Var6)) == 0.0f) {
                            y.d.j(u0Var6);
                            g1VarV2 = u0Var6.v(jP2);
                            j11 = jP2;
                            jA = o.k.a(g1VarV2.W(), g1VarV2.V());
                        } else {
                            j11 = jP2;
                            int iM2 = u0Var6.m(Integer.MAX_VALUE);
                            g1VarV2 = null;
                            jA = o.k.a(iM2, u0Var6.L(iM2));
                        }
                        kVar2 = new o.k(jA);
                    } else {
                        j11 = jP2;
                        g1VarV2 = null;
                        kVar2 = null;
                    }
                    Integer numValueOf4 = kVar2 != null ? Integer.valueOf(((int) (kVar2.f15994a >> 32)) + i23) : null;
                    Integer numValueOf5 = kVar2 != null ? Integer.valueOf((int) (kVar2.f15994a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i32 = i21;
                    long jA4 = o.k.a(i29, iG);
                    if (kVar2 == null) {
                        num = numValueOf5;
                        i13 = i29;
                        kVar3 = null;
                    } else {
                        jc.l.b(numValueOf4);
                        int iIntValue3 = numValueOf4.intValue();
                        jc.l.b(numValueOf5);
                        num = numValueOf5;
                        i13 = i29;
                        kVar3 = new o.k(o.k.a(iIntValue3, num.intValue()));
                    }
                    y.g0 g0VarB2 = h0Var.b(zHasNext, i31, jA4, kVar3, i32, i22, iMax, false, false);
                    if (g0VarB2.f25129a) {
                        int iMin = Math.min(Math.max(i16, i28), iH);
                        int i33 = i22 + iMax;
                        g0Var2 = g0VarB2;
                        h0Var.a(g0Var2, kVar2 != null, i32, i33, i13, i31);
                        int i34 = i27 + 1;
                        if (iArrCopyOf.length < i34) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i34, (iArrCopyOf.length * 3) / 2));
                            jc.l.d(iArrCopyOf, "copyOf(...)");
                        }
                        iArrCopyOf[i27] = iMax;
                        i25 = i27 + 1;
                        iG = (iG - i33) - iCeil2;
                        int i35 = i24 + 1;
                        if (iArrCopyOf2.length < i35) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i35, (iArrCopyOf2.length * 3) / 2));
                            jc.l.d(iArrCopyOf2, "copyOf(...)");
                        }
                        iArrCopyOf2[i24] = i30;
                        i24++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i23) : null;
                        i21 = i32 + 1;
                        i22 = i33 + iCeil2;
                        i16 = iMin;
                        i20 = i30;
                        i13 = iH;
                        i14 = 0;
                        iMax = 0;
                    } else {
                        g0Var2 = g0VarB2;
                        numValueOf = numValueOf4;
                        i14 = i28;
                        i25 = i27;
                        i21 = i32;
                    }
                    num3 = numValueOf;
                    i18 = i30;
                    num2 = num;
                    i26 = i13;
                    g0Var3 = g0Var2;
                    i17 = iMax;
                    i19 = i14;
                    jP2 = j11;
                }
                int i36 = i25;
                int size = arrayList.size();
                g1[] g1VarArr = new g1[size];
                for (int i37 = 0; i37 < size; i37++) {
                    g1VarArr[i37] = yVar2.b(i37);
                }
                int[] iArr3 = new int[i24];
                int[] iArr4 = new int[i24];
                int iMax2 = i16;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                while (i39 < i24) {
                    int[] iArr5 = iArrCopyOf;
                    int i41 = iArrCopyOf2[i39];
                    if (i39 < 0 || i39 >= (i12 = i36)) {
                        p.a.d("Index must be between 0 and size");
                        throw null;
                    }
                    i36 = i12;
                    int i42 = i23;
                    w0 w0VarL = y.d.l(n0Var, iMax2, f3.a.i(jA3), f3.a.h(jA3), iArr5[i39], i42, x0Var, arrayList, g1VarArr, i38, i41, iArr3, i39);
                    int iH2 = w0VarL.h();
                    int iB = w0VarL.b();
                    iArr4[i39] = iB;
                    i40 += iB;
                    iMax2 = Math.max(iMax2, iH2);
                    eVar.b(w0VarL);
                    i39++;
                    i38 = i41;
                    iArrCopyOf = iArr5;
                    iArrCopyOf2 = iArrCopyOf2;
                    i24 = i24;
                    i23 = i42;
                }
                y.n0 n0Var3 = n0Var;
                if (eVar.f26374c == 0) {
                    iMax2 = 0;
                    i11 = 0;
                } else {
                    i11 = i40;
                }
                y.h hVar = n0Var3.f25192b;
                int iA0 = ((eVar.f26374c - 1) * x0Var.a0(hVar.a())) + i11;
                int i43 = f3.a.i(jH);
                int iG2 = f3.a.g(jH);
                if (iA0 < i43) {
                    iA0 = i43;
                }
                if (iA0 <= iG2) {
                    iG2 = iA0;
                }
                hVar.c(x0Var, iG2, iArr4, iArr3);
                int iJ2 = f3.a.j(jH);
                int iH3 = f3.a.h(jH);
                if (iMax2 < iJ2) {
                    iMax2 = iJ2;
                }
                if (iMax2 <= iH3) {
                    iH3 = iMax2;
                }
                return x0Var.b0(iH3, iG2, sVar, new i2.e1(1, eVar));
            }
            l0Var.getClass();
        }
        return x0Var.b0(0, 0, sVar, y.n.f25187f);
    }

    public final int hashCode() {
        return this.f7156a.hashCode();
    }

    @Override // g2.v0
    public final int i(y yVar, List list, int i10) {
        ArrayList arrayListK = i2.f.k(yVar);
        y.n0 n0Var = this.f7156a;
        y.l0 l0Var = n0Var.f25196f;
        List list2 = (List) vb.m.b0(1, arrayListK);
        u0 u0Var = list2 != null ? (u0) vb.m.a0(list2) : null;
        List list3 = (List) vb.m.b0(2, arrayListK);
        l0Var.a(u0Var, list3 != null ? (u0) vb.m.a0(list3) : null, f3.b.b(i10, 0, 13));
        List list4 = (List) vb.m.a0(arrayListK);
        if (list4 == null) {
            list4 = vb.r.f22819a;
        }
        return y.n0.c(list4, i10, yVar.a0(n0Var.f25193c), yVar.a0(n0Var.f25195e), n0Var.f25196f);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f7156a + ')';
    }
}
