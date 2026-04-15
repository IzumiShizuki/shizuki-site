package m0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13667a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13668b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13669c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13670d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f13671e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j1.q f13672f = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.o(j1.n.f9689a, 144, 2), 0.0f, 48, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r.u1 f13673g = new r.u1(100, (r.v) null, 6);

    public static final void a(final ic.k kVar, final oc.a aVar, final oc.a aVar2, final x0.w0 w0Var, float f10, x0.o oVar, final int i10) {
        final float f11;
        final x0.w0 w0Var2;
        final oc.a aVar3;
        final oc.a aVar4;
        final ic.k kVar2;
        oVar.Y(-743965752);
        int i11 = (oVar.h(kVar) ? 4 : 2) | i10 | (oVar.f(aVar) ? 32 : 16) | (oVar.f(aVar2) ? 256 : 128) | (oVar.c(f10) ? 16384 : 8192);
        if (oVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32) | ((57344 & i11) == 16384) | ((i11 & 896) == 256);
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                f11 = f10;
                ic.a aVar5 = new ic.a() { // from class: m0.d6
                    @Override // ic.a
                    public final Object b() {
                        oc.a aVar6 = aVar;
                        float f12 = (aVar6.f16306b - aVar6.f16305a) / 1000;
                        float fFloatValue = ((Number) kVar.a(Float.valueOf(f11))).floatValue();
                        x0.w0 w0Var3 = w0Var;
                        if (Math.abs(fFloatValue - ((Number) w0Var3.getValue()).floatValue()) > f12) {
                            float fFloatValue2 = ((Number) ((Comparable) w0Var3.getValue())).floatValue();
                            oc.a aVar7 = aVar2;
                            if (fFloatValue2 >= aVar7.f16305a && fFloatValue2 <= aVar7.f16306b) {
                                w0Var3.setValue(Float.valueOf(fFloatValue));
                            }
                        }
                        return ub.a0.f21526a;
                    }
                };
                aVar4 = aVar;
                kVar2 = kVar;
                w0Var2 = w0Var;
                aVar3 = aVar2;
                oVar.h0(aVar5);
                objK = aVar5;
            } else {
                f11 = f10;
                w0Var2 = w0Var;
                aVar3 = aVar2;
                aVar4 = aVar;
                kVar2 = kVar;
            }
            x0.v.h((ic.a) objK, oVar);
        } else {
            f11 = f10;
            w0Var2 = w0Var;
            aVar3 = aVar2;
            aVar4 = aVar;
            kVar2 = kVar;
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            final float f12 = f11;
            p1VarR.f24421d = new ic.n(aVar4, aVar3, w0Var2, f12, i10) { // from class: m0.e6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ oc.a f12927b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ oc.a f12928c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ x0.w0 f12929d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f12930e;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(3073);
                    t6.a(this.f12926a, this.f12927b, this.f12928c, this.f12929d, this.f12930e, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final float r27, final ic.k r28, final j1.q r29, boolean r30, oc.a r31, int r32, ic.a r33, m0.v1 r34, x0.o r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.t6.b(float, ic.k, j1.q, boolean, oc.a, int, ic.a, m0.v1, x0.o, int, int):void");
    }

    public static final void c(final boolean z10, final float f10, final List list, final v1 v1Var, final float f11, final w.k kVar, final j1.q qVar, x0.o oVar, final int i10) {
        x0.o oVar2 = oVar;
        oVar2.Y(1679682785);
        int i11 = i10 | (oVar2.g(z10) ? 4 : 2) | (oVar2.c(f10) ? 32 : 16) | (oVar2.h(list) ? 256 : 128) | (oVar2.f(v1Var) ? 2048 : 1024) | (oVar2.c(f11) ? 16384 : 8192) | (oVar2.f(kVar) ? 131072 : 65536) | (oVar2.f(qVar) ? 1048576 : 524288);
        if (oVar2.N(i11 & 1, (599187 & i11) != 599186)) {
            j1.q qVarE = qVar.e(f13672f);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarE, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar2);
            x0.v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            f3.c cVar = (f3.c) oVar2.j(j2.l1.f9866h);
            float fQ = cVar.Q(f13671e);
            float f12 = f13667a;
            float fQ2 = cVar.Q(f12);
            float f13 = f12 * 2;
            float fJ = cVar.J(f11) * f10;
            int i12 = i11 >> 6;
            int i13 = i11 << 9;
            e(androidx.compose.foundation.layout.c.f557c, v1Var, z10, f10, list, fQ2, fQ, oVar2, (i13 & 458752) | (i12 & 112) | 3078 | ((i11 << 6) & 896) | (i13 & 57344));
            d(fJ, kVar, v1Var, z10, f13, oVar, (i12 & 7168) | 1572918 | ((i11 << 3) & 57344) | ((i11 << 15) & 458752));
            oVar2 = oVar;
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(z10, f10, list, v1Var, f11, kVar, qVar, i10) { // from class: m0.f6

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f12990a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f12991b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f12992c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v1 f12993d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f12994e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ w.k f12995f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ j1.q f12996g;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(1);
                    t6.c(this.f12990a, this.f12991b, this.f12992c, this.f12993d, this.f12994e, this.f12995f, this.f12996g, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void d(final float f10, final w.k kVar, final v1 v1Var, final boolean z10, final float f11, x0.o oVar, final int i10) {
        int i11;
        oVar.Y(428907178);
        int i12 = i10 & 6;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f554a;
        if (i12 == 0) {
            i11 = (oVar.f(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i10 & 48;
        j1.n nVar = j1.n.f9689a;
        if (i13 == 0) {
            i11 |= oVar.f(nVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.c(f10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.f(kVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.f(v1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar.c(f11) ? 1048576 : 524288;
        }
        if (oVar.N(i11 & 1, (599187 & i11) != 599186)) {
            j1.q qVarA = bVar.a(androidx.compose.foundation.layout.a.n(nVar, f10, 0.0f, 0.0f, 0.0f, 14), j1.c.f9665d);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarA, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
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
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = new h1.s();
                oVar.h0(objK);
            }
            h1.s sVar = (h1.s) objK;
            boolean z11 = (i11 & 7168) == 2048;
            Object objK2 = oVar.K();
            if (z11 || objK2 == obj) {
                objK2 = new m1(kVar, sVar, null, 1);
                oVar.h0(objK2);
            }
            x0.v.e((ic.n) objK2, kVar, oVar);
            float f12 = !sVar.isEmpty() ? f13670d : f13669c;
            j1.q qVarH = androidx.compose.foundation.a.h(androidx.compose.foundation.f.a(androidx.compose.foundation.layout.c.k(nVar, f11, f11), kVar, l5.a(f13668b, 4, 0L, false)), kVar);
            if (!z10) {
                f12 = 0;
            }
            g0.f fVar = g0.g.f7122a;
            j1.q qVarU = lc.b.U(qVarH, f12, fVar, false, 24);
            v1Var.getClass();
            oVar.W(-1733795637);
            x0.w0 w0VarY = x0.v.y(new q1.q(z10 ? v1Var.f13722a : v1Var.f13723b), oVar);
            oVar.p(false);
            y.d.d(androidx.compose.foundation.a.b(qVarU, ((q1.q) w0VarY.getValue()).f17577a, fVar), oVar);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.g6
                @Override // ic.n
                public final Object q(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    t6.d(f10, kVar, v1Var, z10, f11, (x0.o) obj2, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void e(final j1.q qVar, final v1 v1Var, final boolean z10, final float f10, final List list, final float f11, final float f12, x0.o oVar, final int i10) {
        int i11;
        final float f13;
        oVar.Y(1833126050);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(v1Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.c(0.0f) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.c(f10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(list) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            f13 = f11;
            i11 |= oVar.c(f13) ? 1048576 : 524288;
        } else {
            f13 = f11;
        }
        if ((12582912 & i10) == 0) {
            i11 |= oVar.c(f12) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if (oVar.N(i12 & 1, (4793491 & i12) != 4793490)) {
            final x0.w0 w0VarB = v1Var.b(z10, false, oVar);
            final x0.w0 w0VarB2 = v1Var.b(z10, true, oVar);
            final x0.w0 w0VarA = v1Var.a(z10, false, oVar);
            final x0.w0 w0VarA2 = v1Var.a(z10, true, oVar);
            boolean zF = ((i12 & 3670016) == 1048576) | oVar.f(w0VarB) | ((29360128 & i12) == 8388608) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048) | oVar.f(w0VarB2) | oVar.h(list) | oVar.f(w0VarA) | oVar.f(w0VarA2);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                ic.k kVar = new ic.k() { // from class: m0.h6
                    @Override // ic.k
                    public final Object a(Object obj) {
                        long j10;
                        long j11;
                        s1.d dVar = (s1.d) obj;
                        boolean z11 = dVar.getLayoutDirection() == f3.m.f6668b;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.c0() & 4294967295L));
                        float f14 = f13;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() >> 32)) - f14;
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                        if (z11) {
                            j11 = jFloatToRawIntBits;
                            j10 = jFloatToRawIntBits2;
                        } else {
                            j10 = jFloatToRawIntBits;
                            j11 = j10;
                        }
                        if (!z11) {
                            j11 = jFloatToRawIntBits2;
                        }
                        long j12 = ((q1.q) w0VarB.getValue()).f17577a;
                        float f15 = f12;
                        dVar.w(j12, j10, j11, f15, (496 & 16) != 0 ? 0 : 1);
                        int i13 = (int) (j10 >> 32);
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
                        int i14 = (int) (j11 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i14) - Float.intBitsToFloat(i13);
                        float f16 = f10;
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((fIntBitsToFloat4 * f16) + fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L)))) & 4294967295L);
                        float fIntBitsToFloat5 = ((Float.intBitsToFloat(i14) - Float.intBitsToFloat(i13)) * 0.0f) + Float.intBitsToFloat(i13);
                        long j13 = j10;
                        long j14 = j11;
                        dVar.w(((q1.q) w0VarB2.getValue()).f17577a, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32), jFloatToRawIntBits3, f15, (496 & 16) != 0 ? 0 : 1);
                        List list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float fFloatValue = ((Number) obj2).floatValue();
                            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f16 || fFloatValue < 0.0f);
                            Object arrayList = linkedHashMap.get(boolValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(boolValueOf, arrayList);
                            }
                            ((List) arrayList).add(obj2);
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(list3.size());
                            int size = list3.size();
                            int i15 = 0;
                            while (i15 < size) {
                                arrayList2.add(new p1.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (u3.x0.w(j13, j14, ((Number) list3.get(i15)).floatValue()) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.c0() & 4294967295L)))) & 4294967295L)));
                                i15++;
                                it = it;
                                list3 = list3;
                            }
                            Iterator it2 = it;
                            dVar.Z(arrayList2, ((q1.q) (zBooleanValue ? w0VarA : w0VarA2).getValue()).f17577a, f15);
                            it = it2;
                        }
                        return ub.a0.f21526a;
                    }
                };
                oVar.h0(kVar);
                objK = kVar;
            }
            nh.b.a(i12 & 14, (ic.k) objK, qVar, oVar);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.i6
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t6.e(qVar, v1Var, z10, f10, list, f11, f12, (x0.o) obj, x0.v.D(i10 | 1));
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
