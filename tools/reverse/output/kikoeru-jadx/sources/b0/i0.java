package b0;

import android.app.Activity;
import android.view.OrientationEventListener;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.u2;
import j2.t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        super(2);
        this.f1266b = i10;
        this.f1267c = obj;
        this.f1268d = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v25, types: [ic.k, jc.m] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f1266b;
        x0.r0 r0Var = x0.k.f24334a;
        int i11 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj3 = this.f1267c;
        Object obj4 = this.f1268d;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                k0 k0Var = (k0) obj3;
                j0 j0Var = (j0) obj4;
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0 n0Var = (n0) k0Var.f1282b.b();
                    int iD = j0Var.f1273c;
                    Object obj5 = j0Var.f1271a;
                    if ((iD >= n0Var.a() || !n0Var.b(iD).equals(obj5)) && (iD = n0Var.d(obj5)) != -1) {
                        j0Var.f1273c = iD;
                    }
                    int i12 = iD;
                    if (i12 != -1) {
                        oVar.W(-660404355);
                        g0.d(n0Var, k0Var.f1281a, i12, j0Var.f1271a, oVar, 0);
                        oVar.p(false);
                    } else {
                        oVar.W(-660169871);
                        oVar.p(false);
                    }
                    boolean zH = oVar.h(j0Var);
                    Object objK = oVar.K();
                    if (zH || objK == r0Var) {
                        objK = new a0.f0(i11, j0Var);
                        oVar.h0(objK);
                    }
                    x0.v.c(obj5, (ic.k) objK, oVar);
                } else {
                    oVar.Q();
                }
                return a0Var;
            case 1:
                return (g2.w0) ((ic.n) obj4).q(new q0((k0) obj3, (g2.r1) obj), new f3.a(((f3.a) obj2).f6651a));
            case 2:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((f1.f) obj3).g((q1) obj4, oVar2, 0);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 3:
                ((Number) obj2).intValue();
                a.a.b((y.e1) obj3, (f1.f) obj4, (x0.o) obj, x0.v.D(49));
                return a0Var;
            case 4:
                ((Number) obj2).intValue();
                android.support.v4.media.session.b.d((cg.v) obj3, (j1.q) obj4, (x0.o) obj, x0.v.D(3081));
                return a0Var;
            case 5:
                int iIntValue3 = ((Number) obj2).intValue();
                jc.l.e((OrientationEventListener) obj, "<anonymous parameter 0>");
                cg.v vVar = (cg.v) obj3;
                Activity activity = (Activity) obj4;
                vVar.getClass();
                cg.p pVar = vVar.f4114c;
                vVar.V(false);
                vVar.T(false);
                if (vVar.w() == cg.o.f4085a && !((Boolean) vVar.f4125n.getValue()).booleanValue()) {
                    if (iIntValue3 == -1) {
                        vVar.f4133v = -1;
                    } else {
                        cg.p pVar2 = cg.p.f4095b;
                        cg.p pVar3 = cg.p.f4094a;
                        if (iIntValue3 > 350 || iIntValue3 < 10) {
                            if (activity.getRequestedOrientation() != 0 || vVar.f4133v != 0) {
                                vVar.f4133v = 0;
                                if ((pVar != pVar3 || cg.v.x(activity)) && pVar != pVar2 && cg.v.x(activity)) {
                                    vVar.G(false, false, activity);
                                }
                            }
                        } else if (81 > iIntValue3 || iIntValue3 >= 100) {
                            if (261 <= iIntValue3 && iIntValue3 < 280 && (activity.getRequestedOrientation() != 1 || vVar.f4133v != 270)) {
                                vVar.f4133v = 270;
                                if ((pVar != pVar3 || cg.v.x(activity)) && pVar != pVar2 && cg.v.x(activity)) {
                                    vVar.G(true, false, activity);
                                }
                            }
                        } else if (activity.getRequestedOrientation() != 1 || vVar.f4133v != 90) {
                            vVar.f4133v = 90;
                            if ((pVar != pVar3 || cg.v.x(activity)) && pVar != pVar2 && cg.v.x(activity)) {
                                vVar.G(true, true, activity);
                            }
                        }
                    }
                }
                return a0Var;
            case 6:
                androidx.lifecycle.o oVar3 = (androidx.lifecycle.o) obj2;
                cg.v vVar2 = (cg.v) obj4;
                jc.l.e((androidx.lifecycle.x) obj, "<anonymous parameter 0>");
                jc.l.e(oVar3, "event");
                int i13 = cg.i0.f4049a[oVar3.ordinal()];
                if (i13 == 1) {
                    ((wa.a) obj3).a(!vVar2.z());
                } else if (i13 == 2) {
                    ((androidx.lifecycle.q) vVar2.f4113b).p1();
                }
                return a0Var;
            case 7:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                jc.v vVar3 = (jc.v) obj3;
                vVar3.f10835a += ((a0.w) obj4).f158b.a(fFloatValue - vVar3.f10835a);
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Boolean bool = (Boolean) ((g2.i0) obj3).f7205f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    ic.n nVar = (ic.n) obj4;
                    oVar4.Z(bool);
                    boolean zG = oVar4.g(zBooleanValue);
                    if (zBooleanValue) {
                        nVar.q(oVar4, 0);
                    } else {
                        if (oVar4.f24386l != 0) {
                            x0.p.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!oVar4.S) {
                            if (zG) {
                                x0.z1 z1Var = oVar4.G;
                                int i14 = z1Var.f24535g;
                                int i15 = z1Var.f24536h;
                                y0.b bVar = oVar4.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f25297b.f25294a.J(y0.i.f25322d);
                                x0.p.a(i14, i15, oVar4.f24393s);
                                oVar4.G.t();
                            } else {
                                oVar4.P();
                            }
                        }
                    }
                    if (oVar4.f24399y && oVar4.G.f24537i == oVar4.f24400z) {
                        oVar4.f24400z = -1;
                        oVar4.f24399y = false;
                    }
                    oVar4.p(false);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                q1.o oVar5 = (q1.o) obj;
                t1.b bVar2 = (t1.b) obj2;
                i2.g1 g1Var = (i2.g1) obj3;
                i2.j0 j0Var2 = g1Var.f8700o;
                if (j0Var2.J()) {
                    g1Var.G = oVar5;
                    g1Var.F = bVar2;
                    i2.r1 snapshotObserver = ((j2.v) i2.m0.a(j0Var2)).getSnapshotObserver();
                    q1.i0 i0Var = i2.g1.M;
                    snapshotObserver.a(g1Var, i2.e.f8674e, (i2.f1) obj4);
                    g1Var.J = false;
                } else {
                    g1Var.J = true;
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                i7.w wVar = (i7.w) obj;
                i7.w wVar2 = (i7.w) obj2;
                u2 u2Var = (u2) obj4;
                jc.l.e(wVar, "prependHint");
                jc.l.e(wVar2, "appendHint");
                if (((i7.d0) obj3) == i7.d0.f9072b) {
                    wVar.f9346a = u2Var;
                    if (u2Var != null) {
                        wVar.f9347b.j(u2Var);
                    }
                } else {
                    wVar2.f9346a = u2Var;
                    if (u2Var != null) {
                        wVar2.f9347b.j(u2Var);
                    }
                }
                return a0Var;
            case 11:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((j2.v) obj3, (ic.n) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 12:
                x0.o oVar6 = (x0.o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                j3.u uVar = (j3.u) obj3;
                if (oVar6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objK2 = oVar6.K();
                    if (objK2 == r0Var) {
                        objK2 = j3.c.f10118f;
                        oVar6.h0(objK2);
                    }
                    AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((ic.k) objK2, false);
                    boolean zH2 = oVar6.h(uVar);
                    Object objK3 = oVar6.K();
                    if (zH2 || objK3 == r0Var) {
                        objK3 = new j3.h(uVar, 1);
                        oVar6.h0(objK3);
                    }
                    j1.q qVarI = g8.a.i(androidx.compose.ui.layout.a.e(appendedSemanticsElement, (ic.k) objK3), uVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    ic.n nVar2 = (ic.n) ((x0.w0) obj4).getValue();
                    Object objK4 = oVar6.K();
                    if (objK4 == r0Var) {
                        objK4 = j3.e.f10127c;
                        oVar6.h0(objK4);
                    }
                    g2.v0 v0Var = (g2.v0) objK4;
                    long j10 = oVar6.T;
                    int i16 = (int) (j10 ^ (j10 >>> 32));
                    x0.j1 j1VarL = oVar6.l();
                    j1.q qVarC = j1.a.c(qVarI, oVar6);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar6.a0();
                    if (oVar6.S) {
                        oVar6.k(iVar);
                    } else {
                        oVar6.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0Var, oVar6);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar6);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar6.S || !jc.l.a(oVar6.K(), Integer.valueOf(i16))) {
                        j2.h0.s(i16, oVar6, i16, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar6);
                    nVar2.q(oVar6, 0);
                    oVar6.p(true);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case 13:
                int iIntValue6 = ((Number) obj).intValue();
                q2.o oVar7 = (q2.o) obj2;
                l1.c cVar = (l1.c) obj4;
                if (!((t2) obj3).f10011b.b(oVar7.f17642g)) {
                    cVar.l(iIntValue6, oVar7);
                    cVar.f11682h.e(a0Var);
                }
                return a0Var;
            case 14:
                ((Number) obj2).intValue();
                ((t.g) obj3).a((t.c) obj4, (x0.o) obj, x0.v.D(1));
                return a0Var;
            case 15:
                ((Number) obj2).intValue();
                t.m.a((t.c) obj3, (f1.f) obj4, (x0.o) obj, x0.v.D(385));
                return a0Var;
            case 16:
                x0.o oVar8 = (x0.o) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (oVar8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    t.c cVar2 = (t.c) obj3;
                    t.m.a(cVar2, f1.g.f(1156688164, new cg.d0((ic.k) obj4, cVar2), oVar8), oVar8, 384);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case 17:
                long j11 = ((p1.b) obj2).f16481a;
                lc.b.j((d2.e) obj3, (c2.t) obj);
                kf.f fVar = ((u.k0) obj4).f20979u;
                if (fVar != null) {
                    fVar.e(new u.m(j11));
                }
                return a0Var;
            case 18:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                jc.v vVar4 = (jc.v) obj3;
                float f10 = vVar4.f10835a;
                vVar4.f10835a = ((u.k1) obj4).a(fFloatValue2 - f10) + f10;
                return a0Var;
            case 19:
                x0.o oVar9 = (x0.o) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (oVar9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ((f1.f) obj3).g((y.t) obj4, oVar9, 0);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            default:
                g2.r1 r1Var = (g2.r1) obj;
                long j12 = ((f3.a) obj2).f6651a;
                return ((g2.v0) obj3).h(r1Var, r1Var.P(new f1.f(new i0(19, (f1.f) obj4, new y.t(r1Var, j12)), -1945019079, true), a0Var), j12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(ic.k kVar, t.c cVar) {
        super(2);
        this.f1266b = 16;
        this.f1267c = cVar;
        this.f1268d = (jc.m) kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f1266b = i11;
        this.f1267c = obj;
        this.f1268d = obj2;
    }
}
