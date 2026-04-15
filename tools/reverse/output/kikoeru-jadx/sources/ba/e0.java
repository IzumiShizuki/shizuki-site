package ba;

import java.util.List;
import m0.z8;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2340d;

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i10) {
        this.f2337a = i10;
        this.f2338b = obj;
        this.f2339c = obj2;
        this.f2340d = obj3;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f2337a) {
            case 0:
                y.d1 d1Var = (y.d1) this.f2338b;
                List list = ((k0) this.f2339c).f2400b;
                z0 z0Var = (z0) this.f2340d;
                int iIntValue = ((Integer) obj2).intValue();
                x0.o oVar = (x0.o) obj3;
                ((Integer) obj4).getClass();
                jc.l.e((d0.x) obj, "$this$HorizontalPager");
                j1.n nVar = j1.n.f9689a;
                if (iIntValue == 0) {
                    oVar.W(2069525615);
                    z.f(d1Var, (c0.z) list.get(iIntValue), "MAIN_PAGE_DEFAULT", z0Var, nVar, oVar, 384, 0);
                    oVar.p(false);
                } else if (iIntValue == 1) {
                    oVar.W(2069533071);
                    z.f(d1Var, (c0.z) list.get(iIntValue), "MAIN_PAGE_POPULAR", z0Var, nVar, oVar, 384, 0);
                    oVar.p(false);
                } else {
                    if (iIntValue != 2) {
                        oVar.W(2069547951);
                        oVar.p(false);
                        throw new IllegalStateException(("no page " + iIntValue).toString());
                    }
                    oVar.W(2069540529);
                    z.f(d1Var, (c0.z) list.get(iIntValue), "MAIN_PAGE_RECOMMEND", z0Var, nVar, oVar, 384, 0);
                    oVar.p(false);
                }
                return ub.a0.f21526a;
            case 1:
                x0.w0 w0Var = (x0.w0) this.f2338b;
                x0.w0 w0Var2 = (x0.w0) this.f2339c;
                x0.w0 w0Var3 = (x0.w0) this.f2340d;
                p1.b bVar = (p1.b) obj;
                p1.b bVar2 = (p1.b) obj2;
                float fFloatValue = ((Float) obj3).floatValue();
                ((Float) obj4).getClass();
                float fFloatValue2 = ((Number) w0Var.getValue()).floatValue() * fFloatValue;
                if (fFloatValue2 < 1.0f) {
                    fFloatValue2 = 1.0f;
                }
                w0Var.setValue(Float.valueOf(fFloatValue2));
                long jI = p1.b.i(p1.b.j(fFloatValue, ((p1.b) w0Var2.getValue()).f16481a), bVar2.f16481a);
                long jH = p1.b.h(p1.b.b(2.0f, ((p1.b) w0Var3.getValue()).f16481a), bVar.f16481a);
                float f10 = 1;
                w0Var2.setValue(new p1.b(p1.b.i(jI, p1.b.j(fFloatValue - f10, jH))));
                long j10 = p1.b.j(((Number) w0Var.getValue()).floatValue() - f10, p1.b.b(2.0f, ((p1.b) w0Var3.getValue()).f16481a));
                int i10 = (int) (j10 >> 32);
                int i11 = (int) (j10 & 4294967295L);
                w0Var2.setValue(new p1.b((((long) Float.floatToRawIntBits(nh.b.j(Float.intBitsToFloat((int) (((p1.b) w0Var2.getValue()).f16481a >> 32)), -Float.intBitsToFloat(i10), Float.intBitsToFloat(i10)))) << 32) | (((long) Float.floatToRawIntBits(nh.b.j(Float.intBitsToFloat((int) (((p1.b) w0Var2.getValue()).f16481a & 4294967295L)), -Float.intBitsToFloat(i11), Float.intBitsToFloat(i11)))) & 4294967295L)));
                return ub.a0.f21526a;
            case 2:
                hf.y yVar = (hf.y) this.f2338b;
                q9.r0 r0Var = (q9.r0) this.f2339c;
                String str = (String) this.f2340d;
                bg.p pVar = (bg.p) obj2;
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                jc.l.e((a0.d) obj, "$this$items");
                if (pVar != null) {
                    String str2 = pVar.f2938b;
                    jc.y yVar2 = new jc.y();
                    Object objK = oVar2.K();
                    x0.r0 r0Var2 = x0.k.f24334a;
                    if (objK == r0Var2) {
                        objK = x0.v.v(Boolean.FALSE);
                        oVar2.h0(objK);
                    }
                    x0.w0 w0Var4 = (x0.w0) objK;
                    yVar2.f10838a = w0Var4;
                    boolean zH = oVar2.h(yVar) | oVar2.h(r0Var);
                    Object objK2 = oVar2.K();
                    if (zH || objK2 == r0Var2) {
                        objK2 = new q9.x(3, yVar, r0Var);
                        oVar2.h0(objK2);
                    }
                    ic.k kVar = (ic.k) objK2;
                    boolean zH2 = oVar2.h(yVar) | oVar2.h(r0Var);
                    Object objK3 = oVar2.K();
                    if (zH2 || objK3 == r0Var2) {
                        objK3 = new q9.x(0, yVar, r0Var);
                        oVar2.h0(objK3);
                    }
                    int i12 = iIntValue2 & 112;
                    q9.w.d(w0Var4, pVar, kVar, (ic.k) objK3, oVar2, i12);
                    Object objK4 = oVar2.K();
                    if (objK4 == r0Var2) {
                        objK4 = x0.v.v(Boolean.FALSE);
                        oVar2.h0(objK4);
                    }
                    x0.w0 w0Var5 = (x0.w0) objK4;
                    String strA = na.o.a(pVar);
                    boolean zH3 = oVar2.h(yVar) | oVar2.h(r0Var) | oVar2.h(pVar);
                    Object objK5 = oVar2.K();
                    if (zH3 || objK5 == r0Var2) {
                        objK5 = new q9.y(yVar, r0Var, pVar);
                        oVar2.h0(objK5);
                    }
                    q9.w.c(w0Var5, strA, (ic.a) objK5, oVar2, 6);
                    Object objK6 = oVar2.K();
                    if (objK6 == r0Var2) {
                        objK6 = x0.v.v(Boolean.FALSE);
                        oVar2.h0(objK6);
                    }
                    x0.w0 w0Var6 = (x0.w0) objK6;
                    q9.a.f(w0Var6, pVar, oVar2, 6 | i12);
                    w1.f fVarW = pVar.a() ? nh.b.w() : nh.a.p();
                    String strA2 = na.o.a(pVar);
                    int i13 = pVar.f2946j;
                    String str3 = pVar.f2943g;
                    if (str3.length() == 0) {
                        str3 = null;
                    }
                    boolean zA = jc.l.a(r0Var.w(), pVar);
                    boolean zA2 = jc.l.a(str2, str);
                    boolean z10 = !jc.l.a(str2, str);
                    boolean zH4 = oVar2.h(r0Var) | oVar2.h(pVar) | oVar2.h(yVar);
                    Object objK7 = oVar2.K();
                    if (zH4 || objK7 == r0Var2) {
                        objK7 = new q9.y(r0Var, pVar, yVar);
                        oVar2.h0(objK7);
                    }
                    ic.a aVar = (ic.a) objK7;
                    String str4 = str3;
                    androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(24, yVar2);
                    Object objK8 = oVar2.K();
                    if (objK8 == r0Var2) {
                        objK8 = new ma.c(w0Var5, 15);
                        oVar2.h0(objK8);
                    }
                    ic.a aVar2 = (ic.a) objK8;
                    Object objK9 = oVar2.K();
                    if (objK9 == r0Var2) {
                        objK9 = new ma.c(w0Var6, 16);
                        oVar2.h0(objK9);
                    }
                    q9.a.c(fVarW, strA2, str4, zA, i13, aVar, zA2, n0Var, z10, aVar2, (ic.a) objK9, oVar2, 805306368, 6, 0);
                }
                return ub.a0.f21526a;
            default:
                fg.f fVar = (fg.f) this.f2338b;
                fg.f fVar2 = (fg.f) this.f2339c;
                s9.a aVar3 = (s9.a) this.f2340d;
                final c9.a aVar4 = (c9.a) obj2;
                x0.o oVar3 = (x0.o) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                jc.l.e((a0.d) obj, "$this$items");
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= oVar3.f(aVar4) ? 32 : 16;
                }
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    oVar3.Q();
                } else if (aVar4 != null) {
                    boolean z11 = (iIntValue3 & 112) == 32;
                    Object objK10 = oVar3.K();
                    if (z11 || objK10 == x0.k.f24334a) {
                        objK10 = new c((Object) aVar4, (Object) fVar, (Object) fVar2, 23);
                        oVar3.h0(objK10);
                    }
                    j1.q qVarD = androidx.compose.foundation.a.d(j1.n.f9689a, null, (ic.a) objK10, 7);
                    final int i14 = 0;
                    f1.f fVarF = f1.g.f(1105373120, new ic.n() { // from class: s9.b
                        @Override // ic.n
                        public final Object q(Object obj5, Object obj6) {
                            switch (i14) {
                                case 0:
                                    o oVar4 = (o) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        z8.b(aVar4.f3767b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                    } else {
                                        oVar4.Q();
                                    }
                                    break;
                                default:
                                    o oVar5 = (o) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        z8.b(aVar4.f3768c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                                    } else {
                                        oVar5.Q();
                                    }
                                    break;
                            }
                            return a0.f21526a;
                        }
                    }, oVar3);
                    f1.f fVarF2 = f1.g.f(-718050045, new ha.c(aVar4, fVar, fVar2, aVar3, 2), oVar3);
                    final int i15 = 1;
                    android.support.v4.media.session.b.g(qVarD, s9.d.f19680i, fVarF, false, null, fVarF2, f1.g.f(1537453764, new ic.n() { // from class: s9.b
                        @Override // ic.n
                        public final Object q(Object obj5, Object obj6) {
                            switch (i15) {
                                case 0:
                                    o oVar4 = (o) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                        z8.b(aVar4.f3767b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                                    } else {
                                        oVar4.Q();
                                    }
                                    break;
                                default:
                                    o oVar5 = (o) obj5;
                                    int iIntValue5 = ((Integer) obj6).intValue();
                                    if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                        z8.b(aVar4.f3768c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                                    } else {
                                        oVar5.Q();
                                    }
                                    break;
                            }
                            return a0.f21526a;
                        }
                    }, oVar3), oVar3, 1769904, 24);
                }
                return ub.a0.f21526a;
        }
    }
}
