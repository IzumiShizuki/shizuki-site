package ba;

import android.content.Context;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bg.a2;
import bg.t1;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m0.d9;
import m0.e9;
import m0.g5;
import m0.l3;
import m0.p3;
import m0.r8;
import m0.y7;
import m0.z8;
import q.m1;
import x0.d2;
import x0.n2;
import x0.o2;
import x0.p1;
import x0.v1;
import y.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2373c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.f2371a = i10;
        this.f2372b = obj;
        this.f2373c = obj2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        String str;
        final int i10;
        Object obj3;
        boolean z10;
        int i11 = this.f2371a;
        int i12 = 26;
        int i13 = 25;
        int i14 = 23;
        int i15 = 10;
        j1.q qVarI = j1.n.f9689a;
        x0.r0 r0Var = x0.k.f24334a;
        final int i16 = 2;
        final int i17 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj4 = this.f2373c;
        Object obj5 = this.f2372b;
        switch (i11) {
            case 0:
                d0.d dVar = (d0.d) obj5;
                hf.y yVar = (hf.y) obj4;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0[] c0VarArr = j0.f2395a;
                    int length = c0VarArr.length;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < length) {
                        c0 c0Var = c0VarArr[i18];
                        int i20 = i19 + 1;
                        boolean z11 = dVar.j() == i19;
                        o2 o2Var = m0.c1.f12773a;
                        long jD = ((m0.b1) oVar.j(o2Var)).d();
                        long jC = ((m0.b1) oVar.j(o2Var)).c();
                        j1.q qVarR = androidx.compose.foundation.layout.c.r(qVarI, 3);
                        boolean zH = oVar.h(yVar) | oVar.f(dVar) | oVar.d(i19);
                        Object objK = oVar.K();
                        if (zH || objK == r0Var) {
                            objK = new d0(i19, dVar, yVar);
                            oVar.h0(objK);
                        }
                        y7.a(z11, (ic.a) objK, qVarR, false, jD, jC, f1.g.f(54573347, new l(1, c0Var), oVar), oVar, 12583296);
                        i18++;
                        i19 = i20;
                    }
                } else {
                    oVar.Q();
                }
                return a0Var;
            case 1:
                ((Integer) obj2).getClass();
                j0.b((k0) obj5, (j1.q) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 2:
                Integer numValueOf = Integer.valueOf(R.mipmap.enterface);
                a2 a2Var = (a2) obj5;
                String str2 = (String) obj4;
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j1.g gVar = j1.c.f9672k;
                    j1.n nVar = j1.n.f9689a;
                    j1.q qVarC = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    j1 j1VarA = y.i1.a(y.k.f25156a, gVar, oVar2, 48);
                    int iQ = x0.v.q(oVar2);
                    x0.j1 j1VarL = oVar2.l();
                    j1.q qVarC2 = j1.a.c(qVarC, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    i2.h hVar = i2.j.f8738g;
                    x0.v.A(hVar, j1VarA, oVar2);
                    i2.h hVar2 = i2.j.f8737f;
                    x0.v.A(hVar2, j1VarL, oVar2);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar2, iQ, hVar3);
                    }
                    i2.h hVar4 = i2.j.f8735d;
                    x0.v.A(hVar4, qVarC2, oVar2);
                    float f10 = 3;
                    j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.j(nVar, 50), f10);
                    s8.h hVar5 = new s8.h((Context) oVar2.j(AndroidCompositionLocals_androidKt.f721b));
                    hVar5.f19591c = a2Var.I;
                    hVar5.a("Bearer " + a9.i.f());
                    hVar5.f19605q = numValueOf;
                    hVar5.f19606r = null;
                    hVar5.f19607s = numValueOf;
                    hVar5.f19608t = null;
                    hVar5.f19603o = numValueOf;
                    hVar5.f19604p = null;
                    hVar5.f19596h = new w8.a(100);
                    i8.n.b(hVar5.b(), a2Var.f2839v, a9.i.b(), qVarJ, null, null, g2.o.f7245a, null, null, oVar2, 12585984, 0, 8048);
                    j1.q qVarC3 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        z.a.a("invalid weight; must be greater than zero");
                    }
                    j1.q qVarJ2 = androidx.compose.foundation.layout.a.j(qVarC3.e(new LayoutWeightElement(1.0f, true)), f10);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                    int iQ2 = x0.v.q(oVar2);
                    x0.j1 j1VarL2 = oVar2.l();
                    j1.q qVarC4 = j1.a.c(qVarJ2, oVar2);
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(hVar, vVarA, oVar2);
                    x0.v.A(hVar2, j1VarL2, oVar2);
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar2, iQ2, hVar3);
                    }
                    x0.v.A(hVar4, qVarC4, oVar2);
                    o2 o2Var2 = e9.f12960b;
                    z8.b(str2, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, ((d9) oVar2.j(o2Var2)).f12884g, oVar2, 0, 3120, 55294);
                    z8.b(a2Var.f2839v, androidx.compose.foundation.layout.a.n(nVar, 0.0f, 5, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, null, 0L, 1, false, 1, 0, ((d9) oVar2.j(o2Var2)).f12890m, oVar2, 48, 3120, 55292);
                    oVar2.p(true);
                    Object objK2 = oVar2.K();
                    if (objK2 == r0Var) {
                        objK2 = x0.v.o(new a9.g(25));
                        oVar2.h0(objK2);
                    }
                    n2 n2Var = (n2) objK2;
                    Object objK3 = oVar2.K();
                    if (objK3 == r0Var) {
                        objK3 = new a9.g(26);
                        oVar2.h0(objK3);
                    }
                    p3.a((ic.a) objK3, null, false, f1.g.f(-514492599, new ca.c(n2Var, 0), oVar2), oVar2, 24582, 14);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 3:
                ((Integer) obj2).getClass();
                da.a.k((da.m0) obj5, (j1.q) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 4:
                ((Integer) obj2).getClass();
                a.a.k((List) obj5, (Collection) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 5:
                ((Integer) obj2).getClass();
                a2.c.m((g1.c) obj5, (f1.f) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 6:
                ha.g gVar2 = (ha.g) obj5;
                n2 n2Var2 = (n2) obj4;
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (!((Boolean) gVar2.f8275f.getValue()).booleanValue() || (str = (String) gVar2.f8273d.getValue()) == null) {
                        str = (String) n2Var2.getValue();
                    }
                    z8.b(str, androidx.compose.foundation.layout.c.f557c, ((m0.b1) oVar3.j(m0.c1.f12773a)).c(), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 48, 0, 131064);
                } else {
                    oVar3.Q();
                }
                return a0Var;
            case 7:
                String str3 = (String) obj5;
                ka.g gVar3 = (ka.g) obj4;
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j1.q qVarJ3 = androidx.compose.foundation.layout.a.j(qVarI, 10);
                    y.v vVarA2 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar4, 0);
                    int iQ3 = x0.v.q(oVar4);
                    x0.j1 j1VarL3 = oVar4.l();
                    j1.q qVarC5 = j1.a.c(qVarJ3, oVar4);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar4.a0();
                    if (oVar4.S) {
                        oVar4.k(iVar2);
                    } else {
                        oVar4.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA2, oVar4);
                    x0.v.A(i2.j.f8737f, j1VarL3, oVar4);
                    i2.h hVar6 = i2.j.f8741j;
                    if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ3))) {
                        j2.h0.s(iQ3, oVar4, iQ3, hVar6);
                    }
                    x0.v.A(i2.j.f8735d, qVarC5, oVar4);
                    l0.u0.b(null, f1.g.f(-1287201794, new p(5, str3), oVar4), oVar4, 48, 1);
                    boolean zF = oVar4.f(str3) | oVar4.f(gVar3);
                    Object objK4 = oVar4.K();
                    if (zF || objK4 == r0Var) {
                        objK4 = new a9.d(13, str3, gVar3);
                        oVar4.h0(objK4);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK4, new HorizontalAlignElement(j1.c.f9676o), false, null, i9.a.f9471a, oVar4, 805306368, 508);
                    oVar4.p(true);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((Integer) obj2).getClass();
                la.j.a((w.k) obj5, (x0.w0) obj4, (x0.o) obj, x0.v.D(49));
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((Integer) obj2).getClass();
                la.l.q((bg.e1) obj5, (ic.k) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                List list = (List) obj5;
                e7.a0 a0Var2 = (e7.a0) obj4;
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    j1.q qVarC6 = androidx.compose.foundation.layout.c.c(qVarI, 1.0f);
                    y.v vVarA3 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar5, 0);
                    int iQ4 = x0.v.q(oVar5);
                    x0.j1 j1VarL4 = oVar5.l();
                    j1.q qVarC7 = j1.a.c(qVarC6, oVar5);
                    i2.k.f8771g0.getClass();
                    i2.i iVar3 = i2.j.f8733b;
                    oVar5.a0();
                    if (oVar5.S) {
                        oVar5.k(iVar3);
                    } else {
                        oVar5.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA3, oVar5);
                    x0.v.A(i2.j.f8737f, j1VarL4, oVar5);
                    i2.h hVar7 = i2.j.f8741j;
                    if (oVar5.S || !jc.l.a(oVar5.K(), Integer.valueOf(iQ4))) {
                        j2.h0.s(iQ4, oVar5, iQ4, hVar7);
                    }
                    x0.v.A(i2.j.f8735d, qVarC7, oVar5);
                    oVar5.W(-101681020);
                    int i21 = 0;
                    for (Object obj6 : list) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        final t1 t1Var = (t1) obj6;
                        boolean zH2 = oVar5.h(a0Var2) | oVar5.h(t1Var);
                        Object objK5 = oVar5.K();
                        if (zH2 || objK5 == r0Var) {
                            i10 = 0;
                            a9.d dVar2 = new a9.d(18, a0Var2, t1Var, false ? 1 : 0);
                            oVar5.h0(dVar2);
                            obj3 = dVar2;
                        } else {
                            i10 = 0;
                            obj3 = objK5;
                        }
                        android.support.v4.media.session.b.g(androidx.compose.foundation.a.d(qVarI, null, (ic.a) obj3, 7), null, f1.g.f(916069218, new ic.n() { // from class: la.v0
                            @Override // ic.n
                            public final Object q(Object obj7, Object obj8) {
                                switch (i10) {
                                    case 0:
                                        x0.o oVar6 = (x0.o) obj7;
                                        int iIntValue6 = ((Integer) obj8).intValue();
                                        if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            z8.b(t1Var.f2972c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                                        } else {
                                            oVar6.Q();
                                        }
                                        break;
                                    case 1:
                                        x0.o oVar7 = (x0.o) obj7;
                                        int iIntValue7 = ((Integer) obj8).intValue();
                                        if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                            z8.b(na.w.a(t1Var.f2970a), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                                        } else {
                                            oVar7.Q();
                                        }
                                        break;
                                    default:
                                        x0.o oVar8 = (x0.o) obj7;
                                        int iIntValue8 = ((Integer) obj8).intValue();
                                        if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                            z8.b(t1Var.f2971b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                                        } else {
                                            oVar8.Q();
                                        }
                                        break;
                                }
                                return ub.a0.f21526a;
                            }
                        }, oVar5), false, f1.g.f(1183243040, new ic.n() { // from class: la.v0
                            @Override // ic.n
                            public final Object q(Object obj7, Object obj8) {
                                switch (i17) {
                                    case 0:
                                        x0.o oVar6 = (x0.o) obj7;
                                        int iIntValue6 = ((Integer) obj8).intValue();
                                        if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            z8.b(t1Var.f2972c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                                        } else {
                                            oVar6.Q();
                                        }
                                        break;
                                    case 1:
                                        x0.o oVar7 = (x0.o) obj7;
                                        int iIntValue7 = ((Integer) obj8).intValue();
                                        if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                            z8.b(na.w.a(t1Var.f2970a), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                                        } else {
                                            oVar7.Q();
                                        }
                                        break;
                                    default:
                                        x0.o oVar8 = (x0.o) obj7;
                                        int iIntValue8 = ((Integer) obj8).intValue();
                                        if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                            z8.b(t1Var.f2971b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                                        } else {
                                            oVar8.Q();
                                        }
                                        break;
                                }
                                return ub.a0.f21526a;
                            }
                        }, oVar5), null, f1.g.f(1450416862, new ic.n() { // from class: la.v0
                            @Override // ic.n
                            public final Object q(Object obj7, Object obj8) {
                                switch (i16) {
                                    case 0:
                                        x0.o oVar6 = (x0.o) obj7;
                                        int iIntValue6 = ((Integer) obj8).intValue();
                                        if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                            z8.b(t1Var.f2972c, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                                        } else {
                                            oVar6.Q();
                                        }
                                        break;
                                    case 1:
                                        x0.o oVar7 = (x0.o) obj7;
                                        int iIntValue7 = ((Integer) obj8).intValue();
                                        if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                                            z8.b(na.w.a(t1Var.f2970a), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                                        } else {
                                            oVar7.Q();
                                        }
                                        break;
                                    default:
                                        x0.o oVar8 = (x0.o) obj7;
                                        int iIntValue8 = ((Integer) obj8).intValue();
                                        if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                                            z8.b(t1Var.f2971b, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                                        } else {
                                            oVar8.Q();
                                        }
                                        break;
                                }
                                return ub.a0.f21526a;
                            }
                        }, oVar5), oVar5, 1597824, 42);
                        if (i21 != ud.b.r(list)) {
                            oVar5.W(2001919399);
                            pc.f0.b(null, 0L, 0.0f, 0.0f, oVar5, 0, 15);
                            z10 = false;
                        } else {
                            z10 = false;
                            oVar5.W(1991024480);
                        }
                        oVar5.p(z10);
                        i21 = i22;
                    }
                    oVar5.p(false);
                    y.d.d(androidx.compose.foundation.layout.c.d(qVarI, 5), oVar5);
                    oVar5.p(true);
                } else {
                    oVar5.Q();
                }
                return a0Var;
            case 11:
                f1.f fVar = (f1.f) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                x0.o oVar6 = (x0.o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    fVar.g(arrayList, oVar6, 0);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case 12:
                ((Integer) obj2).getClass();
                m0.k.a((ic.n) obj5, (ic.n) obj4, (x0.o) obj, x0.v.D(7));
                return a0Var;
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                m0.x xVar = ((m0.u) obj5).f13683a;
                xVar.f13854j.f(fFloatValue);
                xVar.f13855k.f(fFloatValue2);
                ((jc.v) obj4).f10835a = fFloatValue;
                return a0Var;
            case 14:
                ((Integer) obj2).getClass();
                na.c.b((w1.f) obj5, (ic.a) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 15:
                ((Integer) obj2).getClass();
                na.c.c((e7.a0) obj5, (ic.o) obj4, (x0.o) obj, x0.v.D(49));
                return a0Var;
            case 16:
                List list2 = (List) obj5;
                fg.f fVar2 = (fg.f) obj4;
                x0.o oVar7 = (x0.o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objK6 = oVar7.K();
                    if (objK6 == r0Var) {
                        objK6 = (Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "backgroundEnable", Boolean.FALSE);
                        objK6.getClass();
                        oVar7.h0(objK6);
                    }
                    boolean zBooleanValue = ((Boolean) objK6).booleanValue();
                    oVar7.W(382553420);
                    j1.q qVarA = j1.a.a(qVarI, new la.k(i15));
                    m1 m1Var = (m1) oVar7.j(a9.u.f263a);
                    j1.q qVarB = m1Var.b(qVarA, new b0.d0(26, m1Var), q.t1.f17456c);
                    oVar7.p(false);
                    y.v vVarA4 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar7, 0);
                    int iQ5 = x0.v.q(oVar7);
                    x0.j1 j1VarL5 = oVar7.l();
                    j1.q qVarC8 = j1.a.c(qVarB, oVar7);
                    i2.k.f8771g0.getClass();
                    i2.i iVar4 = i2.j.f8733b;
                    oVar7.a0();
                    if (oVar7.S) {
                        oVar7.k(iVar4);
                    } else {
                        oVar7.k0();
                    }
                    i2.h hVar8 = i2.j.f8738g;
                    x0.v.A(hVar8, vVarA4, oVar7);
                    i2.h hVar9 = i2.j.f8737f;
                    x0.v.A(hVar9, j1VarL5, oVar7);
                    i2.h hVar10 = i2.j.f8741j;
                    if (oVar7.S || !jc.l.a(oVar7.K(), Integer.valueOf(iQ5))) {
                        j2.h0.s(iQ5, oVar7, iQ5, hVar10);
                    }
                    i2.h hVar11 = i2.j.f8735d;
                    x0.v.A(hVar11, qVarC8, oVar7);
                    if (zBooleanValue) {
                        qVarI = g8.a.i(qVarI, 0.6f);
                    }
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ6 = x0.v.q(oVar7);
                    x0.j1 j1VarL6 = oVar7.l();
                    j1.q qVarC9 = j1.a.c(qVarI, oVar7);
                    oVar7.a0();
                    if (oVar7.S) {
                        oVar7.k(iVar4);
                    } else {
                        oVar7.k0();
                    }
                    x0.v.A(hVar8, v0VarD, oVar7);
                    x0.v.A(hVar9, j1VarL6, oVar7);
                    if (oVar7.S || !jc.l.a(oVar7.K(), Integer.valueOf(iQ6))) {
                        j2.h0.s(iQ6, oVar7, iQ6, hVar10);
                    }
                    x0.v.A(hVar11, qVarC9, oVar7);
                    ((p9.f) list2.get(((Number) fVar2.getValue()).intValue())).f16957e.q(oVar7, 0);
                    oVar7.p(true);
                    oVar7.p(true);
                } else {
                    oVar7.Q();
                }
                return a0Var;
            case 17:
                k0 k0Var = (k0) obj5;
                x0.w0 w0Var = (x0.w0) obj4;
                x0.o oVar8 = (x0.o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    y.v vVarA5 = y.u.a(y.k.f25158c, j1.c.f9674m, oVar8, 0);
                    int iQ7 = x0.v.q(oVar8);
                    x0.j1 j1VarL7 = oVar8.l();
                    j1.q qVarC10 = j1.a.c(qVarI, oVar8);
                    i2.k.f8771g0.getClass();
                    i2.i iVar5 = i2.j.f8733b;
                    oVar8.a0();
                    if (oVar8.S) {
                        oVar8.k(iVar5);
                    } else {
                        oVar8.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA5, oVar8);
                    x0.v.A(i2.j.f8737f, j1VarL7, oVar8);
                    i2.h hVar12 = i2.j.f8741j;
                    if (oVar8.S || !jc.l.a(oVar8.K(), Integer.valueOf(iQ7))) {
                        j2.h0.s(iQ7, oVar8, iQ7, hVar12);
                    }
                    x0.v.A(i2.j.f8735d, qVarC10, oVar8);
                    z.e(null, null, oVar8, 0, 3);
                    androidx.compose.animation.b.c(k0Var.f2399a.l() > 1 && ((Boolean) w0Var.getValue()).booleanValue(), new HorizontalAlignElement(j1.c.f9675n), null, null, null, f1.g.f(1739727577, new l(8, k0Var), oVar8), oVar8, 1572870, 28);
                    oVar8.p(true);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case 18:
                x0.w0 w0Var2 = (x0.w0) obj5;
                n2 n2Var3 = (n2) obj4;
                x0.o oVar9 = (x0.o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (oVar9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str4 = (String) w0Var2.getValue();
                    Object objK7 = oVar9.K();
                    if (objK7 == r0Var) {
                        objK7 = new aa.d(w0Var2, i14);
                        oVar9.h0(objK7);
                    }
                    r8.a(str4, (ic.k) objK7, null, false, null, q9.a.f17948u, null, null, null, ((String) n2Var3.getValue()) == null, null, null, null, false, 0, 0, null, null, oVar9, 1572912, 0, 1047484);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            case 19:
                ((Integer) obj2).getClass();
                q9.a.d((q9.r0) obj5, (j1.q) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 20:
                bg.p pVar = (bg.p) obj5;
                x0.w0 w0Var3 = (x0.w0) obj4;
                x0.o oVar10 = (x0.o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (oVar10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    float f11 = 5;
                    j1.q qVarM = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.c.c(qVarI, 1.0f), f11, 0, f11, f11);
                    j1 j1VarA2 = y.i1.a(y.k.f25161f, j1.c.f9671j, oVar10, 6);
                    int iQ8 = x0.v.q(oVar10);
                    x0.j1 j1VarL8 = oVar10.l();
                    j1.q qVarC11 = j1.a.c(qVarM, oVar10);
                    i2.k.f8771g0.getClass();
                    i2.i iVar6 = i2.j.f8733b;
                    oVar10.a0();
                    if (oVar10.S) {
                        oVar10.k(iVar6);
                    } else {
                        oVar10.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA2, oVar10);
                    x0.v.A(i2.j.f8737f, j1VarL8, oVar10);
                    i2.h hVar13 = i2.j.f8741j;
                    if (oVar10.S || !jc.l.a(oVar10.K(), Integer.valueOf(iQ8))) {
                        j2.h0.s(iQ8, oVar10, iQ8, hVar13);
                    }
                    x0.v.A(i2.j.f8735d, qVarC11, oVar10);
                    boolean zH3 = oVar10.h(pVar) | oVar10.f(w0Var3);
                    Object objK8 = oVar10.K();
                    if (zH3 || objK8 == r0Var) {
                        objK8 = new a9.d(i14, pVar, w0Var3);
                        oVar10.h0(objK8);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK8, null, false, null, q9.a.A, oVar10, 805306368, 510);
                    boolean zF2 = oVar10.f(w0Var3);
                    Object objK9 = oVar10.K();
                    if (zF2 || objK9 == r0Var) {
                        objK9 = new ma.c(w0Var3, 18);
                        oVar10.h0(objK9);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK9, null, false, null, q9.a.B, oVar10, 805306368, 510);
                    oVar10.p(true);
                } else {
                    oVar10.Q();
                }
                return a0Var;
            case 21:
                e7.a0 a0Var3 = (e7.a0) obj5;
                y.d1 d1Var = (y.d1) obj4;
                x0.o oVar11 = (x0.o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (oVar11.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j1.q qVarI2 = androidx.compose.foundation.layout.a.i(qVarI, d1Var);
                    Object objK10 = oVar11.K();
                    if (objK10 == r0Var) {
                        objK10 = new l3(22);
                        oVar11.h0(objK10);
                    }
                    ic.k kVar = (ic.k) objK10;
                    Object objK11 = oVar11.K();
                    if (objK11 == r0Var) {
                        objK11 = new l3(i14);
                        oVar11.h0(objK11);
                    }
                    ic.k kVar2 = (ic.k) objK11;
                    Object objK12 = oVar11.K();
                    if (objK12 == r0Var) {
                        objK12 = new l3(24);
                        oVar11.h0(objK12);
                    }
                    ic.k kVar3 = (ic.k) objK12;
                    Object objK13 = oVar11.K();
                    if (objK13 == r0Var) {
                        objK13 = new l3(i13);
                        oVar11.h0(objK13);
                    }
                    ic.k kVar4 = (ic.k) objK13;
                    Object objK14 = oVar11.K();
                    if (objK14 == r0Var) {
                        objK14 = new l3(i12);
                        oVar11.h0(objK14);
                    }
                    lc.b.e(a0Var3, "SettingsMain", qVarI2, null, kVar, kVar2, kVar3, kVar4, (ic.k) objK14, oVar11, 115015728, 536);
                } else {
                    oVar11.Q();
                }
                return a0Var;
            case 22:
                e7.a0 a0Var4 = (e7.a0) obj5;
                x0.w0 w0Var4 = (x0.w0) obj4;
                x0.o oVar12 = (x0.o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (oVar12.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zH4 = oVar12.h(a0Var4);
                    Object objK15 = oVar12.K();
                    if (zH4 || objK15 == r0Var) {
                        objK15 = new la.a0(a0Var4, w0Var4, i17);
                        oVar12.h0(objK15);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK15, null, false, null, s9.d.f19675d, oVar12, 805306368, 510);
                } else {
                    oVar12.Q();
                }
                return a0Var;
            case 23:
                f1.m mVar = (f1.m) obj5;
                d2 d2Var = (d2) obj4;
                int iIntValue13 = ((Integer) obj).intValue();
                if (obj2 instanceof x0.i) {
                    mVar.f6640f.b((x0.i) obj2);
                } else if (obj2 instanceof v1) {
                    v1 v1Var = (v1) obj2;
                    if (!(v1Var.f24513a instanceof x0.m)) {
                        x0.p.f(d2Var, iIntValue13, obj2);
                        mVar.d(v1Var);
                    }
                } else if (obj2 instanceof p1) {
                    x0.p.f(d2Var, iIntValue13, obj2);
                    ((p1) obj2).e();
                }
                return a0Var;
            case 24:
                ic.o oVar13 = (ic.o) obj5;
                y8.i iVar7 = (y8.i) obj4;
                x0.o oVar14 = (x0.o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (oVar14.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oVar13.g(iVar7, oVar14, 0);
                } else {
                    oVar14.Q();
                }
                return a0Var;
            default:
                n2 n2Var4 = (n2) obj5;
                n2 n2Var5 = (n2) obj4;
                x0.o oVar15 = (x0.o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (oVar15.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    j1.g gVar4 = j1.c.f9672k;
                    float f12 = 10;
                    j1.q qVarJ4 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(qVarI, 1.0f), f12);
                    j1 j1VarA3 = y.i1.a(y.k.f25156a, gVar4, oVar15, 48);
                    int iQ9 = x0.v.q(oVar15);
                    x0.j1 j1VarL9 = oVar15.l();
                    j1.q qVarC12 = j1.a.c(qVarJ4, oVar15);
                    i2.k.f8771g0.getClass();
                    i2.i iVar8 = i2.j.f8733b;
                    oVar15.a0();
                    if (oVar15.S) {
                        oVar15.k(iVar8);
                    } else {
                        oVar15.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA3, oVar15);
                    x0.v.A(i2.j.f8737f, j1VarL9, oVar15);
                    i2.h hVar14 = i2.j.f8741j;
                    if (oVar15.S || !jc.l.a(oVar15.K(), Integer.valueOf(iQ9))) {
                        j2.h0.s(iQ9, oVar15, iQ9, hVar14);
                    }
                    x0.v.A(i2.j.f8735d, qVarC12, oVar15);
                    g5.a(androidx.compose.foundation.layout.a.j(qVarI, f12), 0L, 0.0f, 0L, 0, oVar15, 6, 30);
                    z8.b(na.q.h(R.string.scan_info, n2Var4.getValue(), n2Var5.getValue()), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar15, 0, 0, 131070);
                    oVar15.p(true);
                } else {
                    oVar15.Q();
                }
                return a0Var;
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, int i10, int i11) {
        this.f2371a = i11;
        this.f2372b = obj;
        this.f2373c = obj2;
    }
}
