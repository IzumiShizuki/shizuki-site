package aa;

import ba.z;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import fa.t;
import fa.v;
import hd.q0;
import i2.i;
import i2.j;
import ic.n;
import j1.q;
import j2.h0;
import java.util.Timer;
import jc.l;
import m0.b3;
import m0.d9;
import m0.e9;
import m0.f4;
import m0.p3;
import m0.r3;
import m0.t6;
import m0.z8;
import n7.b0;
import q1.n0;
import q1.p0;
import u3.x0;
import ub.a0;
import w1.g0;
import x0.j1;
import x0.k;
import x0.o;
import x0.o2;
import x0.r0;
import x0.w0;
import y.i1;
import y.u;
import z9.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f289b;

    public /* synthetic */ g(w0 w0Var) {
        this.f288a = 2;
        v vVar = v.f7039a;
        this.f289b = w0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        o oVar;
        w1.f fVarB;
        long j10;
        int i10 = this.f288a;
        int i11 = 5;
        j1.n nVar = j1.n.f9689a;
        int i12 = 20;
        int i13 = 7;
        r0 r0Var = k.f24334a;
        int i14 = 3;
        a0 a0Var = a0.f21526a;
        w0 w0Var = this.f289b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(w0Var, (o) obj, x0.v.D(7));
                break;
            case 1:
                o oVar2 = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar2.Q();
                } else {
                    boolean zF = oVar2.f(w0Var);
                    Object objK = oVar2.K();
                    if (zF || objK == r0Var) {
                        objK = new f(w0Var, 6);
                        oVar2.h0(objK);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK, null, false, null, z.f2520f, oVar2, 805306368, 510);
                }
                break;
            case 2:
                v vVar = v.f7039a;
                o oVar3 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    q qVarC = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar3, 0);
                    int iQ = x0.v.q(oVar3);
                    j1 j1VarL = oVar3.l();
                    q qVarC2 = j1.a.c(qVarC, oVar3);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar3.a0();
                    if (oVar3.S) {
                        oVar3.k(iVar);
                    } else {
                        oVar3.k0();
                    }
                    i2.h hVar = j.f8738g;
                    x0.v.A(hVar, vVarA, oVar3);
                    i2.h hVar2 = j.f8737f;
                    x0.v.A(hVar2, j1VarL, oVar3);
                    i2.h hVar3 = j.f8741j;
                    if (oVar3.S || !l.a(oVar3.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar3, iQ, hVar3);
                    }
                    i2.h hVar4 = j.f8735d;
                    x0.v.A(hVar4, qVarC2, oVar3);
                    if (((Timer) v.f7045g.getValue()) == null) {
                        oVar3.W(-1968300211);
                        q qVarC3 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                        y.j1 j1VarA = i1.a(y.k.f25161f, j1.c.f9671j, oVar3, 6);
                        int iQ2 = x0.v.q(oVar3);
                        j1 j1VarL2 = oVar3.l();
                        q qVarC4 = j1.a.c(qVarC3, oVar3);
                        oVar3.a0();
                        if (oVar3.S) {
                            oVar3.k(iVar);
                        } else {
                            oVar3.k0();
                        }
                        x0.v.A(hVar, j1VarA, oVar3);
                        x0.v.A(hVar2, j1VarL2, oVar3);
                        if (oVar3.S || !l.a(oVar3.K(), Integer.valueOf(iQ2))) {
                            h0.s(iQ2, oVar3, iQ2, hVar3);
                        }
                        x0.v.A(hVar4, qVarC4, oVar3);
                        String strG = na.q.g(R.string.duration);
                        o2 o2Var = e9.f12960b;
                        z8.b(strG, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar3.j(o2Var)).f12889l, oVar3, 0, 0, 65534);
                        oVar = oVar3;
                        z8.b(na.q.h(R.string.timer_after_minutes, Integer.valueOf((int) ((Number) w0Var.getValue()).floatValue())), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(o2Var)).f12889l, oVar3, 0, 0, 65534);
                        oVar.p(true);
                        float fFloatValue = ((Number) w0Var.getValue()).floatValue();
                        oc.a aVar = new oc.a(1.0f, 120.0f);
                        q qVarC5 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                        Object objK2 = oVar.K();
                        if (objK2 == r0Var) {
                            objK2 = new d(w0Var, 5);
                            oVar.h0(objK2);
                        }
                        t6.b(fFloatValue, (ic.k) objK2, qVarC5, false, aVar, 0, null, null, oVar, 432, 488);
                        oVar.p(false);
                    } else {
                        oVar = oVar3;
                        oVar.W(-1967429855);
                        z8.b(" ", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(e9.f12960b)).f12889l, oVar, 6, 0, 65534);
                        t.b(0, oVar);
                        oVar.p(false);
                    }
                    g0.f fVar = g0.g.f7122a;
                    g0.d dVar = new g0.d(20);
                    g0.f fVar2 = new g0.f(dVar, dVar, dVar, dVar);
                    q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 10);
                    boolean zH = oVar.h(vVar);
                    Object objK3 = oVar.K();
                    if (zH || objK3 == r0Var) {
                        objK3 = new f(w0Var);
                        oVar.h0(objK3);
                    }
                    android.support.v4.media.session.b.b((ic.a) objK3, qVarJ, false, null, fVar2, null, null, null, f1.g.f(-2067216794, new b(21), oVar), oVar, 805306416, 476);
                    oVar.p(true);
                }
                break;
            case 3:
                o oVar4 = (o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    boolean zF2 = oVar4.f(w0Var);
                    Object objK4 = oVar4.K();
                    if (zF2 || objK4 == r0Var) {
                        objK4 = new f(w0Var, 16);
                        oVar4.h0(objK4);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK4, null, false, null, ha.b.f8253b, oVar4, 805306368, 510);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                la.l.o(w0Var, (o) obj, x0.v.D(1));
                break;
            case 5:
                w0Var.setValue(new p0(f4.c((f3.k) obj, (f3.k) obj2)));
                break;
            case 6:
                w0Var.setValue(new p0(f4.c((f3.k) obj, (f3.k) obj2)));
                break;
            case 7:
                o oVar5 = (o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar5.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar5.Q();
                } else {
                    Boolean bool = (Boolean) w0Var.getValue();
                    bool.booleanValue();
                    b0.c(bool, null, null, null, f1.g.f(524976802, new ba.l(i13, w0Var), oVar5), oVar5, 24576, 14);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                o oVar6 = (o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!oVar6.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    oVar6.Q();
                } else {
                    boolean zF3 = oVar6.f(w0Var);
                    Object objK5 = oVar6.K();
                    if (zF3 || objK5 == r0Var) {
                        objK5 = new f(w0Var, 29);
                        oVar6.h0(objK5);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK5, null, false, null, m9.e.f15006k, oVar6, 805306368, 510);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((Integer) obj2).getClass();
                ma.f.a(w0Var, (o) obj, x0.v.D(1));
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((Integer) obj2).getClass();
                ma.f.a(w0Var, (o) obj, x0.v.D(1));
                break;
            case 11:
                o oVar7 = (o) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!oVar7.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    oVar7.Q();
                } else {
                    q qVarC6 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.j1 j1VarA2 = i1.a(y.k.f25157b, j1.c.f9671j, oVar7, 6);
                    int iQ3 = x0.v.q(oVar7);
                    j1 j1VarL3 = oVar7.l();
                    q qVarC7 = j1.a.c(qVarC6, oVar7);
                    i2.k.f8771g0.getClass();
                    i iVar2 = j.f8733b;
                    oVar7.a0();
                    if (oVar7.S) {
                        oVar7.k(iVar2);
                    } else {
                        oVar7.k0();
                    }
                    x0.v.A(j.f8738g, j1VarA2, oVar7);
                    x0.v.A(j.f8737f, j1VarL3, oVar7);
                    i2.h hVar5 = j.f8741j;
                    if (oVar7.S || !l.a(oVar7.K(), Integer.valueOf(iQ3))) {
                        h0.s(iQ3, oVar7, iQ3, hVar5);
                    }
                    x0.v.A(j.f8735d, qVarC7, oVar7);
                    boolean zF4 = oVar7.f(w0Var);
                    Object objK6 = oVar7.K();
                    if (zF4 || objK6 == r0Var) {
                        objK6 = new ma.c(w0Var, i14);
                        oVar7.h0(objK6);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK6, null, false, null, p9.a.f16934e, oVar7, 805306368, 510);
                    boolean zF5 = oVar7.f(w0Var);
                    Object objK7 = oVar7.K();
                    if (zF5 || objK7 == r0Var) {
                        objK7 = new ma.c(w0Var, 4);
                        oVar7.h0(objK7);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK7, null, false, null, p9.a.f16935f, oVar7, 805306368, 510);
                    boolean zF6 = oVar7.f(w0Var);
                    Object objK8 = oVar7.K();
                    if (zF6 || objK8 == r0Var) {
                        objK8 = new ma.c(w0Var, i11);
                        oVar7.h0(objK8);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK8, null, false, null, p9.a.f16936g, oVar7, 805306368, 510);
                    oVar7.p(true);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                p9.a.d(w0Var, (o) obj, x0.v.D(7));
                break;
            case 13:
                o oVar8 = (o) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!oVar8.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    oVar8.Q();
                } else {
                    if (((Boolean) w0Var.getValue()).booleanValue()) {
                        fVarB = b0.m();
                    } else {
                        fVarB = x0.f21349g;
                        if (fVarB == null) {
                            w1.e eVar = new w1.e("Filled.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i15 = g0.f23208a;
                            n0 n0Var = new n0(q1.q.f17569b);
                            q0 q0VarH = h0.h(16.5f, 3.0f);
                            q0VarH.n(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
                            q0VarH.m(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
                            q0VarH.m(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
                            q0VarH.n(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
                            q0VarH.s(12.0f, 21.35f);
                            q0VarH.t(1.45f, -1.32f);
                            q0VarH.m(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
                            q0VarH.m(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
                            q0VarH.l();
                            q0VarH.u(12.1f, 18.55f);
                            q0VarH.t(-0.1f, 0.1f);
                            q0VarH.t(-0.1f, -0.1f);
                            q0VarH.m(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
                            q0VarH.m(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
                            q0VarH.n(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
                            q0VarH.r(1.87f);
                            q0VarH.m(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
                            q0VarH.n(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
                            q0VarH.n(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
                            q0VarH.l();
                            w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                            fVarB = eVar.b();
                            x0.f21349g = fVarB;
                        }
                    }
                    if (((Boolean) w0Var.getValue()).booleanValue()) {
                        oVar8.W(-708574224);
                        oVar8.p(false);
                        j10 = q1.q.f17572e;
                    } else {
                        oVar8.W(-708572332);
                        j10 = ((q1.q) oVar8.j(m0.j1.f13125a)).f17577a;
                        oVar8.p(false);
                    }
                    r3.b(fVarB, "Favorite", null, j10, oVar8, 48, 4);
                }
                break;
            case 14:
                o oVar9 = (o) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!oVar9.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oVar9.Q();
                } else {
                    b3.f12721a.a(((Boolean) w0Var.getValue()).booleanValue(), null, oVar9, 0);
                }
                break;
            case 15:
                o oVar10 = (o) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!oVar10.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    oVar10.Q();
                } else {
                    boolean zF7 = oVar10.f(w0Var);
                    Object objK9 = oVar10.K();
                    if (zF7 || objK9 == r0Var) {
                        objK9 = new ma.c(w0Var, 14);
                        oVar10.h0(objK9);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK9, null, false, null, q9.a.f17940m, oVar10, 805306368, 510);
                }
                break;
            case 16:
                o oVar11 = (o) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!oVar11.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    oVar11.Q();
                } else {
                    boolean zF8 = oVar11.f(w0Var);
                    Object objK10 = oVar11.K();
                    if (zF8 || objK10 == r0Var) {
                        objK10 = new ma.c(w0Var, 8);
                        oVar11.h0(objK10);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK10, null, false, null, q9.a.f17946s, oVar11, 805306368, 510);
                }
                break;
            case 17:
                o oVar12 = (o) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!oVar12.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    oVar12.Q();
                } else {
                    Object objK11 = oVar12.K();
                    if (objK11 == r0Var) {
                        objK11 = new ma.c(w0Var, 19);
                        oVar12.h0(objK11);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK11, null, false, null, s9.d.f19676e, oVar12, 805306374, 510);
                }
                break;
            case 18:
                o oVar13 = (o) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!oVar13.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    oVar13.Q();
                } else {
                    Object objK12 = oVar13.K();
                    if (objK12 == r0Var) {
                        objK12 = new ma.c(w0Var, 23);
                        oVar13.h0(objK12);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK12, null, false, null, s9.d.f19684m, oVar13, 805306374, 510);
                }
                break;
            case 19:
                o oVar14 = (o) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!oVar14.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    oVar14.Q();
                } else {
                    Object objK13 = oVar14.K();
                    if (objK13 == r0Var) {
                        objK13 = new ma.c(w0Var, i12);
                        oVar14.h0(objK13);
                    }
                    p3.a((ic.a) objK13, null, false, s9.d.f19674c, oVar14, 24582, 14);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                t9.e.a(w0Var, (o) obj, x0.v.D(7));
                break;
            case 21:
                o oVar15 = (o) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!oVar15.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    oVar15.Q();
                } else {
                    boolean zF9 = oVar15.f(w0Var);
                    Object objK14 = oVar15.K();
                    if (zF9 || objK14 == r0Var) {
                        objK14 = new ma.c(w0Var, 25);
                        oVar15.h0(objK14);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK14, null, false, null, t9.i.f20589d, oVar15, 805306368, 510);
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                t9.e.a(w0Var, (o) obj, x0.v.D(7));
                break;
            case 23:
                o oVar16 = (o) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!oVar16.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    oVar16.Q();
                } else {
                    b3.f12721a.a(((Boolean) w0Var.getValue()).booleanValue(), null, oVar16, 0);
                }
                break;
            case 24:
                o oVar17 = (o) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!oVar17.N(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    oVar17.Q();
                } else {
                    boolean zF10 = oVar17.f(w0Var);
                    Object objK15 = oVar17.K();
                    if (zF10 || objK15 == r0Var) {
                        objK15 = new w9.d(w0Var, 3);
                        oVar17.h0(objK15);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK15, null, false, null, z8.a.f26512b, oVar17, 805306368, 510);
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                m.e(w0Var, (o) obj, x0.v.D(1));
                break;
            default:
                ((Integer) obj2).getClass();
                m.e(w0Var, (o) obj, x0.v.D(1));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ g(w0 w0Var, int i10) {
        this.f288a = i10;
        this.f289b = w0Var;
    }

    public /* synthetic */ g(w0 w0Var, int i10, int i11) {
        this.f288a = i11;
        this.f289b = w0Var;
    }
}
