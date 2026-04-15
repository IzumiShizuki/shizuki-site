package cg;

import android.app.Activity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g2.n1;
import hd.q0;
import u3.x0;
import x0.e1;
import x0.j1;
import x0.n2;
import x0.y1;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(v vVar, int i10) {
        super(3);
        this.f4141b = i10;
        this.f4142c = vVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        w1.f fVarB;
        int i10 = this.f4141b;
        int i11 = 1;
        ub.a0 a0Var = ub.a0.f21526a;
        int i12 = 2;
        v vVar = this.f4142c;
        int i13 = 0;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                j1.n nVar = j1.n.f9689a;
                j1.q qVarK = gh.g.k(androidx.compose.foundation.layout.a.j(nVar, 4), g0.g.f7122a);
                long j10 = q1.q.f17569b;
                j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(androidx.compose.foundation.a.b(qVarK, q1.q.b(0.6f, j10), q1.h0.f17515a), null, new y(vVar, i13), 7), 8);
                oVar.X(733328855);
                y.s sVarE = y.p.e(j1.c.f9662a, oVar, 0);
                oVar.X(-1323940314);
                int iQ = x0.v.q(oVar);
                j1 j1VarL = oVar.l();
                i2.k.f8771g0.getClass();
                i2.i iVar = i2.j.f8733b;
                f1.f fVarK = n1.k(qVarJ);
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(i2.j.f8738g, sVarE, oVar);
                x0.v.A(i2.j.f8737f, j1VarL, oVar);
                i2.h hVar = i2.j.f8741j;
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                    j2.h0.s(iQ, oVar, iQ, hVar);
                }
                fVarK.g(new y1(oVar), oVar, 0);
                oVar.X(2058660585);
                if (vVar.w() == o.f4086b) {
                    fVarB = x0.f21352j;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = w1.g0.f23208a;
                        q1.n0 n0Var = new q1.n0(j10);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(18.0f, 8.0f);
                        q0Var.r(-1.0f);
                        q0Var.s(17.0f, 6.0f);
                        q0Var.n(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                        q0Var.v(7.0f, 3.24f, 7.0f, 6.0f);
                        q0Var.z(2.0f);
                        q0Var.s(6.0f, 8.0f);
                        q0Var.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        q0Var.z(10.0f);
                        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        q0Var.r(12.0f);
                        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0Var.s(20.0f, 10.0f);
                        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        q0Var.l();
                        q0Var.u(12.0f, 17.0f);
                        q0Var.n(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        q0Var.w(0.9f, -2.0f, 2.0f, -2.0f);
                        q0Var.w(2.0f, 0.9f, 2.0f, 2.0f);
                        q0Var.w(-0.9f, 2.0f, -2.0f, 2.0f);
                        q0Var.l();
                        q0Var.u(15.1f, 8.0f);
                        q0Var.s(8.9f, 8.0f);
                        q0Var.s(8.9f, 6.0f);
                        q0Var.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                        q0Var.n(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                        q0Var.z(2.0f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        x0.f21352j = fVarB;
                    }
                } else {
                    fVarB = n7.b0.f15423g;
                    if (fVarB == null) {
                        w1.e eVar2 = new w1.e("Filled.LockOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = w1.g0.f23208a;
                        q1.n0 n0Var2 = new q1.n0(j10);
                        q0 q0VarH = j2.h0.h(12.0f, 17.0f);
                        q0VarH.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0VarH.w(-0.9f, -2.0f, -2.0f, -2.0f);
                        q0VarH.w(-2.0f, 0.9f, -2.0f, 2.0f);
                        q0VarH.w(0.9f, 2.0f, 2.0f, 2.0f);
                        q0VarH.l();
                        q0VarH.u(18.0f, 8.0f);
                        q0VarH.r(-1.0f);
                        q0VarH.s(17.0f, 6.0f);
                        q0VarH.n(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                        q0VarH.v(7.0f, 3.24f, 7.0f, 6.0f);
                        q0VarH.r(1.9f);
                        q0VarH.n(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                        q0VarH.n(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                        q0VarH.z(2.0f);
                        q0VarH.s(6.0f, 8.0f);
                        q0VarH.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        q0VarH.z(10.0f);
                        q0VarH.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        q0VarH.r(12.0f);
                        q0VarH.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0VarH.s(20.0f, 10.0f);
                        q0VarH.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        q0VarH.l();
                        q0VarH.u(18.0f, 20.0f);
                        q0VarH.s(6.0f, 20.0f);
                        q0VarH.s(6.0f, 10.0f);
                        q0VarH.r(12.0f);
                        q0VarH.z(10.0f);
                        q0VarH.l();
                        w1.e.a(eVar2, q0VarH.f8447b, 0, n0Var2);
                        fVarB = eVar2.b();
                        n7.b0.f15423g = fVarB;
                    }
                }
                v0.j.b(fVarB, null, androidx.compose.foundation.layout.c.j(nVar, 18), q1.q.f17571d, oVar, 3504, 0);
                oVar.p(false);
                oVar.p(true);
                oVar.p(false);
                oVar.p(false);
                break;
            case 1:
                k1 k1Var = (k1) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                jc.l.e(k1Var, "$this$BottomControl");
                if ((iIntValue & 14) == 0) {
                    iIntValue |= oVar2.f(k1Var) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18 && oVar2.z()) {
                    oVar2.Q();
                } else {
                    e1 e1Var = vVar.f4120i;
                    e1 e1Var2 = vVar.f4123l;
                    int i16 = iIntValue & 14;
                    a.a.j(k1Var, ((Boolean) e1Var.getValue()).booleanValue(), new b0(vVar, 0), oVar2, i16);
                    long jLongValue = ((Number) vVar.f4121j.getValue()).longValue();
                    long j11 = q1.q.f17571d;
                    int i17 = i16 | 384;
                    a.a.n(k1Var, jLongValue, j11, oVar2, i17);
                    oVar2.X(-1920485573);
                    Object objK = oVar2.K();
                    if (objK == x0.k.f24334a) {
                        objK = x0.v.o(new y(vVar, i12));
                        oVar2.h0(objK);
                    }
                    oVar2.p(false);
                    a.a.m(k1Var, ((Number) e1Var2.getValue()).longValue(), ((Number) ((n2) objK).getValue()).floatValue(), null, new b0(vVar, 1), new y(vVar, i11), oVar2, i16);
                    a.a.n(k1Var, ((Number) e1Var2.getValue()).longValue(), j11, oVar2, i17);
                    oVar2.X(-1920484523);
                    oVar2.p(false);
                    Object objJ = oVar2.j(AndroidCompositionLocals_androidKt.f721b);
                    jc.l.c(objJ, "null cannot be cast to non-null type android.app.Activity");
                    a.a.f(k1Var, vVar.z(), new c0(vVar, (Activity) objJ, 0), oVar2, i16);
                }
                break;
            case 2:
                k1 k1Var2 = (k1) obj;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                jc.l.e(k1Var2, "$this$TopControl");
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= oVar3.f(k1Var2) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && oVar3.z()) {
                    oVar3.Q();
                } else {
                    Object objJ2 = oVar3.j(AndroidCompositionLocals_androidKt.f721b);
                    jc.l.c(objJ2, "null cannot be cast to non-null type android.app.Activity");
                    a.a.a(k1Var2, new f0(vVar, (Activity) objJ2, 0), oVar3, iIntValue2 & 14);
                    v0.n0.a((String) vVar.f4124m.getValue(), null, q1.q.f17571d, 0L, 0L, null, 0L, 0, false, 0, 0, null, oVar3, 384, 131066);
                }
                break;
            default:
                x0.o oVar4 = (x0.o) obj2;
                ((Number) obj3).intValue();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                a.a.o(f1.g.b(oVar4, -596720299, new z(vVar, i12)), oVar4, 6);
                break;
        }
        return a0Var;
    }
}
