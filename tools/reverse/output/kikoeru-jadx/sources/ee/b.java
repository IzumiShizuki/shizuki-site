package ee;

import android.view.View;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import cg.m0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.c0;
import e7.u;
import f7.p;
import g2.v0;
import j1.q;
import j2.h0;
import m0.l3;
import m0.p3;
import m0.u5;
import m0.v5;
import m0.x5;
import ub.a0;
import x0.n2;
import x0.o;
import x0.r0;
import x0.v;
import x0.w0;
import y.i1;
import y.j1;
import y.l1;
import y.r1;
import y.u1;
import y.w;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6522c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f6520a = i10;
        this.f6521b = obj;
        this.f6522c = obj2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f6520a;
        r0 r0Var = x0.k.f24334a;
        a0 a0Var = a0.f21526a;
        Object obj3 = this.f6521b;
        Object obj4 = this.f6522c;
        switch (i10) {
            case 0:
                break;
            case 1:
                o oVar = (o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && oVar.z()) {
                    oVar.Q();
                } else {
                    ((p) obj3).f6788g.g((e7.j) obj4, oVar, 0);
                }
                break;
            case 2:
                o oVar2 = (o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && oVar2.z()) {
                    oVar2.Q();
                } else {
                    a2.c.m((g1.c) obj3, (f1.f) obj4, oVar2, 0);
                }
                break;
            case 3:
                o oVar3 = (o) obj;
                e7.j jVar = (e7.j) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && oVar3.z()) {
                    oVar3.Q();
                } else {
                    u uVar = jVar.f6334b;
                    jc.l.c(uVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((f7.h) uVar).f6763f.l((q.h) obj4, jVar, oVar3, 0);
                }
                break;
            case 4:
                o oVar4 = (o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar4.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar4.Q();
                } else {
                    q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
                    h2.g gVar = u1.f25267a;
                    q qVarA = q2.m.a(androidx.compose.foundation.layout.c.b(j1.a.a(qVarC, new m0(10, (r1) obj3)), 0.0f, m0.r0.f13540b, 1), false, f0.a.f6605b);
                    f1.f fVar = (f1.f) obj4;
                    j1 j1VarA = i1.a(y.k.f25161f, j1.c.f9671j, oVar4, 6);
                    int iQ = v.q(oVar4);
                    x0.j1 j1VarL = oVar4.l();
                    q qVarC2 = j1.a.c(qVarA, oVar4);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar4.a0();
                    if (oVar4.S) {
                        oVar4.k(iVar);
                    } else {
                        oVar4.k0();
                    }
                    v.A(i2.j.f8738g, j1VarA, oVar4);
                    v.A(i2.j.f8737f, j1VarL, oVar4);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar4, iQ, hVar);
                    }
                    v.A(i2.j.f8735d, qVarC2, oVar4);
                    fVar.g(l1.f25167a, oVar4, 6);
                    oVar4.p(true);
                }
                break;
            case 5:
                o oVar5 = (o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar5.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    ((f1.f) obj3).g(Float.valueOf(((Number) ((n2) obj4).getValue()).floatValue()), oVar5, 0);
                }
                break;
            case 6:
                o oVar6 = (o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!oVar6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    ((ic.o) obj3).g(((x5) obj4).f13892a, oVar6, 0);
                }
                break;
            case 7:
                o oVar7 = (o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!oVar7.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar7.Q();
                } else {
                    ((f1.f) obj3).g((u5) obj4, oVar7, 6);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o oVar8 = (o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!oVar8.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar8.Q();
                } else {
                    v.a(v5.f13759a.a((c0) obj3), (f1.f) obj4, oVar8, 8);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                o oVar9 = (o) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (!oVar9.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar9.Q();
                } else {
                    oVar9.W(1082136060);
                    ((f1.f) obj3).g((w) obj4, oVar9, 0);
                    oVar9.p(false);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                o oVar10 = (o) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                s0.i iVar2 = (s0.i) obj3;
                if (!oVar10.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    oVar10.Q();
                } else {
                    Object objK = oVar10.K();
                    Object obj5 = objK;
                    if (objK == r0Var) {
                        l3 l3Var = new l3(28);
                        oVar10.h0(l3Var);
                        obj5 = l3Var;
                    }
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((ic.k) obj5, false);
                    boolean zH = oVar10.h(iVar2);
                    Object objK2 = oVar10.K();
                    Object obj6 = objK2;
                    if (zH || objK2 == r0Var) {
                        s0.c cVar = new s0.c(iVar2, true ? 1 : 0);
                        oVar10.h0(cVar);
                        obj6 = cVar;
                    }
                    q qVarI = g8.a.i(androidx.compose.ui.layout.a.e(appendedSemanticsElement, (ic.k) obj6), ((Boolean) iVar2.f19335q.getValue()).booleanValue() ? 1.0f : 0.0f);
                    ic.n nVar = (ic.n) ((w0) obj4).getValue();
                    Object objK3 = oVar10.K();
                    Object obj7 = objK3;
                    if (objK3 == r0Var) {
                        s0.f fVar2 = s0.f.f19323a;
                        oVar10.h0(fVar2);
                        obj7 = fVar2;
                    }
                    v0 v0Var = (v0) obj7;
                    int iQ2 = v.q(oVar10);
                    x0.j1 j1VarL2 = oVar10.l();
                    q qVarC3 = j1.a.c(qVarI, oVar10);
                    i2.k.f8771g0.getClass();
                    i2.i iVar3 = i2.j.f8733b;
                    oVar10.a0();
                    if (oVar10.S) {
                        oVar10.k(iVar3);
                    } else {
                        oVar10.k0();
                    }
                    v.A(i2.j.f8738g, v0Var, oVar10);
                    v.A(i2.j.f8737f, j1VarL2, oVar10);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar10.S || !jc.l.a(oVar10.K(), Integer.valueOf(iQ2))) {
                        h0.s(iQ2, oVar10, iQ2, hVar2);
                    }
                    v.A(i2.j.f8735d, qVarC3, oVar10);
                    nVar.q(oVar10, 0);
                    oVar10.p(true);
                }
                break;
            default:
                o oVar11 = (o) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                View view = (View) obj4;
                if (!oVar11.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oVar11.Q();
                } else {
                    uh.j jVar2 = (uh.j) obj3;
                    boolean zH2 = oVar11.h(view);
                    Object objK4 = oVar11.K();
                    if (zH2 || objK4 == r0Var) {
                        objK4 = new bd.a(27, view);
                        oVar11.h0(objK4);
                    }
                    ic.k kVar = (ic.k) objK4;
                    boolean zH3 = oVar11.h(view);
                    Object objK5 = oVar11.K();
                    if (zH3 || objK5 == r0Var) {
                        objK5 = new bd.e(29, view);
                        oVar11.h0(objK5);
                    }
                    q qVarE = ud.n.e(jVar2, kVar, (ic.a) objK5, 3);
                    Object objK6 = oVar11.K();
                    if (objK6 == r0Var) {
                        objK6 = u9.d.f21461a;
                        oVar11.h0(objK6);
                    }
                    p3.a((ic.a) objK6, qVarE, false, u9.j.f21485a, oVar11, 24582, 12);
                }
                break;
        }
        return a0Var;
    }
}
