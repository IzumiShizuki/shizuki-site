package d0;

import b0.o1;
import b0.q0;
import b0.u0;
import g2.r1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import u.e1;
import x0.a1;
import x0.b1;
import x0.w0;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f5403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f5404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f5405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f5406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.a f5407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j1.g f5408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.k f5409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hf.y f5410j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d dVar, d1 d1Var, float f10, k kVar, pc.r rVar, ic.a aVar, j1.g gVar, v.k kVar2, hf.y yVar) {
        super(2);
        this.f5402b = dVar;
        this.f5403c = d1Var;
        this.f5404d = f10;
        this.f5405e = kVar;
        this.f5406f = rVar;
        this.f5407g = aVar;
        this.f5408h = gVar;
        this.f5409i = kVar2;
        this.f5410j = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r56v8 */
    /* JADX WARN: Type inference failed for: r56v9, types: [java.util.List] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        long j10;
        j1.g gVar;
        int i10;
        d dVar;
        int i11;
        long j11;
        int i12;
        int i13;
        e1 e1Var;
        q0 q0Var;
        j1.g gVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        q0 q0Var2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        j jVar;
        vb.j jVar2;
        int i26;
        int i27;
        long j12;
        int i28;
        int i29;
        ArrayList arrayList;
        int i30;
        int i31;
        int i32;
        List arrayList2;
        int i33;
        ArrayList arrayList3;
        int i34;
        int i35;
        int i36;
        r1 r1Var;
        int i37;
        ArrayList arrayList4;
        ?? arrayList5;
        Object obj3;
        w wVar;
        vb.j jVar3;
        int i38;
        int i39;
        int i40;
        ArrayList arrayList6;
        int i41;
        int i42;
        ArrayList arrayList7;
        v vVar = this;
        j1.f fVar = j1.c.f9675n;
        q0 q0Var3 = (q0) obj;
        long j13 = ((f3.a) obj2).f6651a;
        d dVar2 = vVar.f5402b;
        dVar2.C.getValue();
        e1 e1Var2 = e1.f20883b;
        n7.d.e(j13, e1Var2);
        f3.m layoutDirection = q0Var3.f1337b.getLayoutDirection();
        d1 d1Var = vVar.f5403c;
        int iA0 = q0Var3.f1337b.a0(androidx.compose.foundation.layout.a.e(d1Var, layoutDirection));
        int iA02 = q0Var3.f1337b.a0(androidx.compose.foundation.layout.a.d(d1Var, q0Var3.f1337b.getLayoutDirection()));
        int iA03 = q0Var3.f1337b.a0(d1Var.c());
        float fA = d1Var.a();
        r1 r1Var2 = q0Var3.f1337b;
        int iA04 = r1Var2.a0(fA) + iA03;
        int i43 = iA02 + iA0;
        int i44 = i43 - iA0;
        long jI = f3.b.i(-i43, -iA04, j13);
        dVar2.f5324q = q0Var3;
        int iA05 = r1Var2.a0(vVar.f5404d);
        int iH = f3.a.h(j13) - i43;
        int i45 = i43;
        int i46 = iA04;
        long j14 = (((long) iA0) << 32) | (((long) iA03) & 4294967295L);
        vVar.f5405e.getClass();
        int i47 = iH < 0 ? 0 : iH;
        q0 q0Var4 = q0Var3;
        long j15 = j14;
        e1 e1Var3 = e1Var2;
        dVar2.f5333z = f3.b.b(i47, f3.a.g(jI), 5);
        t tVar = (t) vVar.f5406f.b();
        v.k kVar = vVar.f5409i;
        h1.g gVarD = h1.t.d();
        ic.k kVarE = gVarD != null ? gVarD.e() : null;
        h1.g gVarG = h1.t.g(gVarD);
        try {
            int iJ = dVar2.j();
            int i48 = i47;
            y yVar = dVar2.f5311d;
            int iH2 = b0.g0.h(iJ, tVar, yVar.f5434e);
            if (iJ != iH2) {
                j10 = jI;
                ((b1) yVar.f5432c).f(iH2);
                ((u0) yVar.f5435f).a(iJ);
            } else {
                j10 = jI;
            }
            dVar2.j();
            float fE = ((a1) yVar.f5433d).e();
            dVar2.l();
            kVar.getClass();
            float f10 = 0;
            int i49 = i48 + iA05;
            int iR = lc.b.R(f10 - (fE * i49));
            h1.t.k(gVarD, gVarG, kVarE);
            List listF = b0.g0.f(tVar, dVar2.A, dVar2.f5329v);
            int iIntValue = ((Number) vVar.f5407g.b()).intValue();
            w0 w0Var = dVar2.B;
            if (iA0 < 0) {
                x.a.a("negative beforeContentPadding");
            }
            if (i44 < 0) {
                x.a.a("negative afterContentPadding");
            }
            int i50 = i49 < 0 ? 0 : i49;
            vb.s sVar = vb.s.f22820a;
            t tVar2 = tVar;
            v.k kVar2 = vVar.f5409i;
            hf.y yVar2 = vVar.f5410j;
            if (iIntValue <= 0) {
                w wVar2 = new w(i48, iA05, i44, -iA0, iH + i44, kVar2, r1Var2.b0(f3.b.g(f3.a.j(j10) + i45, j13), f3.b.f(f3.a.i(j10) + i46, j13), sVar, c.f5280d), yVar2);
                dVar = dVar2;
                r1Var = r1Var2;
                wVar = wVar2;
            } else {
                long j16 = j10;
                int i51 = i48;
                long jB = f3.b.b(i51, f3.a.g(j16), 5);
                while (iH2 > 0 && iR > 0) {
                    iH2--;
                    iR -= i50;
                }
                int i52 = iR * (-1);
                if (iH2 >= iIntValue) {
                    iH2 = iIntValue - 1;
                    i52 = 0;
                }
                vb.j jVar4 = new vb.j();
                int i53 = -iA0;
                int i54 = i53 + (iA05 < 0 ? iA05 : 0);
                int i55 = i52 + i54;
                int iMax = 0;
                while (true) {
                    gVar = vVar.f5408h;
                    i10 = i54;
                    if (i55 >= 0 || iH2 <= 0) {
                        break;
                    }
                    int i56 = iH2 - 1;
                    t tVar3 = tVar2;
                    int i57 = iA05;
                    int i58 = i51;
                    long j17 = jB;
                    q0 q0Var5 = q0Var4;
                    e1 e1Var4 = e1Var3;
                    long j18 = j15;
                    j jVarX = g8.a.x(q0Var5, i56, j17, tVar3, j18, e1Var4, fVar, gVar, r1Var2.getLayoutDirection(), false, i58);
                    jVar4.add(0, jVarX);
                    iMax = Math.max(iMax, jVarX.f5355j);
                    i55 += i50;
                    dVar2 = dVar2;
                    tVar2 = tVar3;
                    vVar = this;
                    iH2 = i56;
                    jB = j17;
                    i54 = i10;
                    listF = listF;
                    w0Var = w0Var;
                    iA0 = iA0;
                    e1Var3 = e1Var4;
                    i45 = i45;
                    i49 = i49;
                    r1Var2 = r1Var2;
                    i46 = i46;
                    iIntValue = iIntValue;
                    q0Var4 = q0Var5;
                    j15 = j18;
                    i51 = i58;
                    iA05 = i57;
                }
                t tVar4 = tVar2;
                dVar = dVar2;
                int i59 = i55;
                List list = listF;
                w0 w0Var2 = w0Var;
                int i60 = i49;
                int i61 = iA05;
                e1 e1Var5 = e1Var3;
                int i62 = i50;
                int i63 = i51;
                long j19 = jB;
                q0 q0Var6 = q0Var4;
                int i64 = iMax;
                int i65 = i46;
                r1 r1Var3 = r1Var2;
                long j20 = j15;
                int i66 = i45;
                int i67 = iIntValue;
                int i68 = iA0;
                vb.j jVar5 = jVar4;
                int i69 = i10;
                if (i59 < i69) {
                    i59 = i69;
                }
                int i70 = i59 - i69;
                int i71 = iH + i44;
                int i72 = i71 < 0 ? 0 : i71;
                q0 q0Var7 = q0Var6;
                int i73 = -i70;
                int i74 = i70;
                j1.g gVar3 = gVar;
                int i75 = iH2;
                int i76 = 0;
                boolean z10 = false;
                while (true) {
                    i11 = i69;
                    if (i76 >= jVar5.f22816c) {
                        break;
                    }
                    if (i73 >= i72) {
                        jVar5.i(i76);
                        i69 = i11;
                        z10 = true;
                    } else {
                        i75++;
                        i73 += i62;
                        i76++;
                        i69 = i11;
                    }
                }
                int i77 = i73;
                int i78 = i64;
                int i79 = i67;
                int i80 = i75;
                int i81 = iH2;
                while (true) {
                    if (i80 >= i79) {
                        j11 = j19;
                        i12 = i77;
                        i13 = i79;
                        e1Var = e1Var5;
                        q0Var = q0Var7;
                        gVar2 = gVar3;
                        i14 = i78;
                        break;
                    }
                    if (i77 >= i72 && i77 > 0 && !jVar5.isEmpty()) {
                        j11 = j19;
                        i12 = i77;
                        e1Var = e1Var5;
                        q0Var = q0Var7;
                        gVar2 = gVar3;
                        i14 = i78;
                        i13 = i79;
                        break;
                    }
                    e1 e1Var6 = e1Var5;
                    int i82 = i77;
                    int i83 = i79;
                    q0 q0Var8 = q0Var7;
                    j1.g gVar4 = gVar3;
                    int iMax2 = i78;
                    int i84 = i72;
                    j jVarX2 = g8.a.x(q0Var8, i80, j19, tVar4, j20, e1Var6, fVar, gVar4, r1Var3.getLayoutDirection(), false, i63);
                    int i85 = i83 - 1;
                    int i86 = i82 + (i80 == i85 ? i63 : i62);
                    long j21 = j19;
                    int i87 = i11;
                    if (i86 > i87 || i80 == i85) {
                        iMax2 = Math.max(iMax2, jVarX2.f5355j);
                        jVar5.addLast(jVarX2);
                    } else {
                        i74 -= i62;
                        i81 = i80 + 1;
                        z10 = true;
                    }
                    i78 = iMax2;
                    i80++;
                    i79 = i83;
                    i77 = i86;
                    i11 = i87;
                    e1Var5 = e1Var6;
                    gVar3 = gVar4;
                    i72 = i84;
                    q0Var7 = q0Var8;
                    j19 = j21;
                }
                int i88 = iH;
                if (i12 < i88) {
                    int i89 = i88 - i12;
                    int i90 = i12 + i89;
                    int i91 = i68;
                    int iMax3 = i14;
                    int i92 = i74 - i89;
                    while (i92 < i91 && i81 > 0) {
                        i81--;
                        j jVarX3 = g8.a.x(q0Var, i81, j11, tVar4, j20, e1Var, fVar, gVar2, r1Var3.getLayoutDirection(), false, i63);
                        jVar5.add(0, jVarX3);
                        iMax3 = Math.max(iMax3, jVarX3.f5355j);
                        i92 += i62;
                        i91 = i91;
                        i88 = i88;
                        i80 = i80;
                    }
                    int i93 = i92;
                    i16 = i88;
                    i17 = i80;
                    i15 = i91;
                    q0Var2 = q0Var;
                    int i94 = iMax3;
                    if (i93 < 0) {
                        i18 = i94;
                        i19 = i90 + i93;
                        i20 = i81;
                        i21 = 0;
                    } else {
                        i18 = i94;
                        i19 = i90;
                        i20 = i81;
                        i21 = i93;
                    }
                } else {
                    i15 = i68;
                    i16 = i88;
                    i17 = i80;
                    q0Var2 = q0Var;
                    i18 = i14;
                    i19 = i12;
                    i20 = i81;
                    i21 = i74;
                }
                if (i21 < 0) {
                    x.a.a("invalid currentFirstPageScrollOffset");
                }
                int i95 = -i21;
                j jVar6 = (j) jVar5.first();
                if (i15 > 0 || i61 < 0) {
                    int iA = jVar5.a();
                    j jVar7 = jVar6;
                    int i96 = 0;
                    while (i96 < iA && i21 != 0) {
                        int i97 = iA;
                        i22 = i62;
                        i23 = i21;
                        if (i22 > i21 || i96 == ud.b.r(jVar5)) {
                            break;
                        }
                        i21 = i23 - i22;
                        i96++;
                        jVar7 = (j) jVar5.get(i96);
                        i62 = i22;
                        iA = i97;
                    }
                    i22 = i62;
                    i23 = i21;
                    i24 = i23;
                    jVar6 = jVar7;
                    i62 = i22;
                } else {
                    i24 = i21;
                }
                int iMax4 = Math.max(0, i20);
                int i98 = i20 - 1;
                if (iMax4 <= i98) {
                    int i99 = i98;
                    ArrayList arrayList8 = null;
                    while (true) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        int i100 = i99;
                        jVar2 = jVar5;
                        i26 = i62;
                        i27 = i61;
                        i28 = i19;
                        arrayList7 = arrayList8;
                        i29 = iMax4;
                        jVar = jVar6;
                        i25 = i95;
                        j12 = j11;
                        arrayList7.add(g8.a.x(q0Var2, i100, j12, tVar4, j20, e1Var, fVar, gVar2, q0Var2.f1337b.getLayoutDirection(), false, i63));
                        if (i100 == i29) {
                            break;
                        }
                        i99 = i100 - 1;
                        iMax4 = i29;
                        j11 = j12;
                        arrayList8 = arrayList7;
                        i19 = i28;
                        jVar6 = jVar;
                        jVar5 = jVar2;
                        i61 = i27;
                        i62 = i26;
                        i95 = i25;
                    }
                    arrayList = arrayList7;
                } else {
                    i25 = i95;
                    jVar = jVar6;
                    jVar2 = jVar5;
                    i26 = i62;
                    i27 = i61;
                    j12 = j11;
                    i28 = i19;
                    i29 = iMax4;
                    arrayList = null;
                }
                List list2 = list;
                int size = list2.size();
                int i101 = 0;
                while (i101 < size) {
                    int i102 = size;
                    int iIntValue2 = ((Number) list.get(i101)).intValue();
                    if (iIntValue2 < i29) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        i41 = i29;
                        ArrayList arrayList9 = arrayList;
                        i42 = i101;
                        arrayList9.add(g8.a.x(q0Var2, iIntValue2, j12, tVar4, j20, e1Var, fVar, gVar2, q0Var2.f1337b.getLayoutDirection(), false, i63));
                        arrayList = arrayList9;
                    } else {
                        i41 = i29;
                        i42 = i101;
                    }
                    i101 = i42 + 1;
                    i29 = i41;
                    size = i102;
                }
                vb.r rVar = vb.r.f22819a;
                List list3 = arrayList == null ? rVar : arrayList;
                List list4 = list3;
                int size2 = list4.size();
                List list5 = rVar;
                int iMax5 = i18;
                int i103 = 0;
                while (i103 < size2) {
                    iMax5 = Math.max(iMax5, ((j) list3.get(i103)).f5355j);
                    i103++;
                    list3 = list3;
                }
                List list6 = list3;
                int i104 = ((j) jVar2.last()).f5346a;
                int iMin = Math.min(i104, i13 - 1);
                int i105 = i104 + 1;
                if (i105 <= iMin) {
                    ArrayList arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        i31 = iMax5;
                        arrayList6 = arrayList10;
                        i30 = i13;
                        i32 = iMin;
                        arrayList6.add(g8.a.x(q0Var2, i105, j12, tVar4, j20, e1Var, fVar, gVar2, q0Var2.f1337b.getLayoutDirection(), false, i63));
                        if (i105 == i32) {
                            break;
                        }
                        i105++;
                        arrayList10 = arrayList6;
                        iMin = i32;
                        iMax5 = i31;
                        i13 = i30;
                    }
                    arrayList2 = arrayList6;
                } else {
                    i30 = i13;
                    i31 = iMax5;
                    i32 = iMin;
                    arrayList2 = null;
                }
                int size3 = list2.size();
                int i106 = 0;
                while (i106 < size3) {
                    int iIntValue3 = ((Number) list.get(i106)).intValue();
                    int i107 = size3;
                    if (i32 + 1 <= iIntValue3) {
                        i38 = i30;
                        if (iIntValue3 < i38) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            i40 = i32;
                            List list7 = arrayList2;
                            i39 = i106;
                            list7.add(g8.a.x(q0Var2, iIntValue3, j12, tVar4, j20, e1Var, fVar, gVar2, q0Var2.f1337b.getLayoutDirection(), false, i63));
                            arrayList2 = list7;
                        } else {
                            i40 = i32;
                            i39 = i106;
                        }
                    } else {
                        i38 = i30;
                        i39 = i106;
                        i40 = i32;
                    }
                    i106 = i39 + 1;
                    i32 = i40;
                    i30 = i38;
                    size3 = i107;
                }
                int i108 = i30;
                if (arrayList2 == null) {
                    arrayList2 = list5;
                }
                List list8 = arrayList2;
                int size4 = list8.size();
                int iMax6 = i31;
                for (int i109 = 0; i109 < size4; i109++) {
                    iMax6 = Math.max(iMax6, ((j) arrayList2.get(i109)).f5355j);
                }
                j jVar8 = jVar;
                boolean z11 = jc.l.a(jVar8, jVar2.first()) && list6.isEmpty() && arrayList2.isEmpty();
                int i110 = i28;
                int iG = f3.b.g(i110, j16);
                int iF = f3.b.f(iMax6, j16);
                int i111 = i16;
                boolean z12 = i110 < Math.min(iG, i111);
                if (!z12 || i25 == 0) {
                    i33 = i25;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i33 = i25;
                    sb.append(i33);
                    x.a.c(sb.toString());
                }
                ArrayList arrayList11 = new ArrayList(arrayList2.size() + list6.size() + jVar2.a());
                if (z12) {
                    if (!list6.isEmpty() || !arrayList2.isEmpty()) {
                        x.a.a("No extra pages");
                    }
                    int iA2 = jVar2.a();
                    int[] iArr = new int[iA2];
                    for (int i112 = 0; i112 < iA2; i112++) {
                        iArr[i112] = i63;
                    }
                    int[] iArr2 = new int[iA2];
                    i34 = i63;
                    i35 = i27;
                    arrayList3 = arrayList11;
                    i36 = iG;
                    new y.g(r1Var3.I(i35), false, null).b(q0Var2, i36, iArr, f3.m.f6667a, iArr2);
                    oc.d dVarW0 = vb.l.w0(iArr2);
                    int i113 = dVarW0.f16307a;
                    int i114 = dVarW0.f16308b;
                    int i115 = dVarW0.f16309c;
                    if ((i115 <= 0 || i113 > i114) && (i115 >= 0 || i114 > i113)) {
                        r1Var = r1Var3;
                    } else {
                        while (true) {
                            int i116 = iArr2[i113];
                            int i117 = i115;
                            jVar3 = jVar2;
                            int[] iArr3 = iArr2;
                            j jVar9 = (j) jVar3.get(i113);
                            jVar9.b(i116, i36, iF);
                            arrayList3.add(jVar9);
                            if (i113 == i114) {
                                break;
                            }
                            i113 += i117;
                            iArr2 = iArr3;
                            jVar2 = jVar3;
                            i115 = i117;
                        }
                        r1Var = r1Var3;
                        jVar2 = jVar3;
                    }
                } else {
                    Collection collection = list8;
                    arrayList3 = arrayList11;
                    i34 = i63;
                    vb.j jVar10 = jVar2;
                    i35 = i27;
                    i36 = iG;
                    r1Var = r1Var3;
                    int size5 = list4.size();
                    int i118 = i33;
                    int i119 = i118;
                    int i120 = 0;
                    while (i120 < size5) {
                        Collection collection2 = collection;
                        int i121 = i120;
                        j jVar11 = (j) list6.get(i120);
                        int i122 = i119 - i60;
                        jVar11.b(i122, i36, iF);
                        arrayList3.add(jVar11);
                        i120 = i121 + 1;
                        i119 = i122;
                        collection = collection2;
                    }
                    Collection collection3 = collection;
                    int iA3 = jVar10.a();
                    int i123 = i118;
                    int i124 = 0;
                    while (i124 < iA3) {
                        vb.j jVar12 = jVar10;
                        j jVar13 = (j) jVar10.get(i124);
                        jVar13.b(i123, i36, iF);
                        arrayList3.add(jVar13);
                        i123 += i60;
                        i124++;
                        jVar10 = jVar12;
                    }
                    jVar2 = jVar10;
                    int size6 = collection3.size();
                    for (int i125 = 0; i125 < size6; i125++) {
                        j jVar14 = (j) arrayList2.get(i125);
                        jVar14.b(i123, i36, iF);
                        arrayList3.add(jVar14);
                        i123 += i60;
                    }
                }
                if (z11) {
                    i37 = i36;
                    arrayList4 = arrayList3;
                } else {
                    ArrayList arrayList12 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    int i126 = 0;
                    while (i126 < size7) {
                        Object obj4 = arrayList3.get(i126);
                        j jVar15 = (j) obj4;
                        int i127 = i36;
                        int i128 = size7;
                        if (jVar15.f5346a >= ((j) jVar2.first()).f5346a && jVar15.f5346a <= ((j) jVar2.last()).f5346a) {
                            arrayList12.add(obj4);
                        }
                        i126++;
                        size7 = i128;
                        i36 = i127;
                    }
                    i37 = i36;
                    arrayList4 = arrayList12;
                }
                if (list6.isEmpty()) {
                    arrayList5 = list5;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    int i129 = 0;
                    while (i129 < size8) {
                        Object obj5 = arrayList3.get(i129);
                        int i130 = size8;
                        if (((j) obj5).f5346a < ((j) jVar2.first()).f5346a) {
                            arrayList5.add(obj5);
                        }
                        i129++;
                        size8 = i130;
                    }
                }
                ?? r22 = arrayList5;
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList13 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    int i131 = 0;
                    ?? r23 = arrayList5;
                    while (i131 < size9) {
                        Object obj6 = arrayList3.get(i131);
                        ?? r56 = r23;
                        if (((j) obj6).f5346a > ((j) jVar2.last()).f5346a) {
                            arrayList13.add(obj6);
                        }
                        i131++;
                        r23 = r56;
                    }
                    list5 = arrayList13;
                    r22 = r23;
                }
                ?? r562 = r22;
                if (arrayList4.isEmpty()) {
                    obj3 = null;
                } else {
                    Object obj7 = arrayList4.get(0);
                    int i132 = ((j) obj7).f5357l;
                    kVar2.getClass();
                    float f11 = -Math.abs(i132 - f10);
                    int iR2 = ud.b.r(arrayList4);
                    if (1 <= iR2) {
                        int i133 = 1;
                        while (true) {
                            Object obj8 = arrayList4.get(i133);
                            float f12 = -Math.abs(((j) obj8).f5357l - f10);
                            if (Float.compare(f11, f12) < 0) {
                                f11 = f12;
                                obj7 = obj8;
                            }
                            if (i133 == iR2) {
                                break;
                            }
                            i133++;
                        }
                    }
                    obj3 = obj7;
                }
                j jVar16 = (j) obj3;
                kVar2.getClass();
                int i134 = i26;
                wVar = new w(arrayList4, i34, i35, i44, e1Var, i53, i71, jVar8, jVar16, i134 == 0 ? 0.0f : nh.b.j((0 - (jVar16 != null ? jVar16.f5357l : 0)) / i134, -0.5f, 0.5f), i24, i17 < i108 || i110 > i111, kVar2, r1Var.b0(f3.b.g(i37 + i66, j13), f3.b.f(iF + i65, j13), sVar, new o1(5, w0Var2, arrayList3)), z10, r562, list5, yVar2);
            }
            dVar.h(wVar, r1Var.O(), false);
            return wVar;
        } catch (Throwable th2) {
            h1.t.k(gVarD, gVarG, kVarE);
            throw th2;
        }
    }
}
