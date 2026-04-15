package m0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13042d;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f13039a = i10;
        this.f13040b = obj;
        this.f13041c = obj2;
        this.f13042d = obj3;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        double d10;
        r.c cVar;
        Object obj4;
        int i10;
        switch (this.f13039a) {
            case 0:
                y.k1 k1Var = (y.k1) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                j1.g gVar = j1.c.f9672k;
                ic.n nVar = (ic.n) this.f13040b;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(k1Var) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (nVar == null) {
                        oVar.W(-1394361313);
                        y.d.d(i0.f13082c, oVar);
                        oVar.p(false);
                        d10 = 0.5d;
                    } else {
                        oVar.W(-1394295686);
                        j1.q qVar = i0.f13083d;
                        y.j1 j1VarA = y.i1.a(y.k.f25156a, gVar, oVar, 48);
                        int iQ = x0.v.q(oVar);
                        x0.j1 j1VarL = oVar.l();
                        j1.q qVarC = j1.a.c(qVar, oVar);
                        i2.k.f8771g0.getClass();
                        i2.i iVar = i2.j.f8733b;
                        oVar.a0();
                        d10 = 0.5d;
                        if (oVar.S) {
                            oVar.k(iVar);
                        } else {
                            oVar.k0();
                        }
                        x0.v.A(i2.j.f8738g, j1VarA, oVar);
                        x0.v.A(i2.j.f8737f, j1VarL, oVar);
                        i2.h hVar = i2.j.f8741j;
                        if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                            j2.h0.s(iQ, oVar, iQ, hVar);
                        }
                        x0.v.A(i2.j.f8735d, qVarC, oVar);
                        x0.z zVar = h1.f13043a;
                        long j10 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                        x0.v.a(zVar.a(Float.valueOf((!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.87f : 1.0f)), nVar, oVar, 8);
                        oVar.p(true);
                        oVar.p(false);
                    }
                    j1.q qVarA = k1Var.a(androidx.compose.foundation.layout.c.f556b, 1.0f);
                    f1.f fVar = (f1.f) this.f13041c;
                    y.j1 j1VarA2 = y.i1.a(y.k.f25156a, gVar, oVar, 48);
                    int iQ2 = x0.v.q(oVar);
                    x0.j1 j1VarL2 = oVar.l();
                    j1.q qVarC2 = j1.a.c(qVarA, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar2);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA2, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL2, oVar);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar, iQ2, hVar2);
                    }
                    x0.v.A(i2.j.f8735d, qVarC2, oVar);
                    z8.a(((d9) oVar.j(e9.f12960b)).f12883f, f1.g.f(1206983395, new g0(fVar, 0), oVar), oVar, 48);
                    oVar.p(true);
                    x0.z zVar2 = h1.f13043a;
                    long j11 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar2.a(Float.valueOf((!((b1) oVar.j(c1.f12773a)).j() ? ((double) q1.h0.r(j11)) < d10 : ((double) q1.h0.r(j11)) > d10) ? 0.6f : 0.74f)), f1.g.f(-1033635954, new g0((f1.f) this.f13042d, 1), oVar), oVar, 56);
                } else {
                    oVar.Q();
                }
                break;
            default:
                ic.n nVar2 = (ic.n) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                String str = (String) this.f13042d;
                Object obj5 = (g3) this.f13041c;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar2.h(nVar2) ? 4 : 2;
                }
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i11 = h3.a.a((ArrayList) this.f13040b).size() != 1 ? 75 : 0;
                    Object u1Var = new r.u1(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, i11, r.w.f18601d);
                    yb.c cVar2 = null;
                    boolean zH = oVar2.h(null) | oVar2.h(obj5);
                    Object objK = oVar2.K();
                    Object obj6 = x0.k.f24334a;
                    if (zH || objK == obj6) {
                        objK = new androidx.lifecycle.n0(19, obj5);
                        oVar2.h0(objK);
                    }
                    Object obj7 = (ic.a) objK;
                    Object objK2 = oVar2.K();
                    if (objK2 == obj6) {
                        objK2 = r.d.a(0.0f);
                        oVar2.h0(objK2);
                    }
                    r.c cVar3 = (r.c) objK2;
                    Boolean bool = Boolean.TRUE;
                    boolean zH2 = oVar2.h(cVar3) | oVar2.g(true) | oVar2.h(u1Var) | oVar2.f(obj7);
                    Object objK3 = oVar2.K();
                    if (zH2 || objK3 == obj6) {
                        cVar = cVar3;
                        obj4 = obj6;
                        i10 = TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE;
                        objK3 = new b0.x(cVar, u1Var, obj7, cVar2, 24);
                        oVar2.h0(objK3);
                    } else {
                        cVar = cVar3;
                        obj4 = obj6;
                        i10 = TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE;
                    }
                    x0.v.e((ic.n) objK3, bool, oVar2);
                    r.k kVar = cVar.f18333c;
                    Object u1Var2 = new r.u1(i10, i11, r.w.f18598a);
                    Object objK4 = oVar2.K();
                    if (objK4 == obj4) {
                        objK4 = r.d.a(0.8f);
                        oVar2.h0(objK4);
                    }
                    r.c cVar4 = (r.c) objK4;
                    boolean zH3 = oVar2.h(cVar4) | oVar2.g(true) | oVar2.h(u1Var2);
                    Object objK5 = oVar2.K();
                    if (zH3 || objK5 == obj4) {
                        objK5 = new lf.w0(cVar4, u1Var2, cVar2, 4);
                        oVar2.h0(objK5);
                    }
                    x0.v.e((ic.n) objK5, bool, oVar2);
                    r.k kVar2 = cVar4.f18333c;
                    float fFloatValue = ((Number) kVar2.f18468b.getValue()).floatValue();
                    float fFloatValue2 = ((Number) kVar2.f18468b.getValue()).floatValue();
                    float fFloatValue3 = ((Number) kVar.f18468b.getValue()).floatValue();
                    long j12 = q1.p0.f17566b;
                    long j13 = q1.w.f17581a;
                    j1.q qVarB = androidx.compose.ui.graphics.a.b(j1.n.f9689a, fFloatValue, fFloatValue2, fFloatValue3, 0.0f, j12, q1.h0.f17515a, false, j13, j13);
                    boolean zG = oVar2.g(true) | oVar2.f(str) | oVar2.h(null);
                    Object objK6 = oVar2.K();
                    if (zG || objK6 == obj4) {
                        objK6 = new a9.j(8, str);
                        oVar2.h0(objK6);
                    }
                    j1.q qVarA2 = q2.m.a(qVarB, false, (ic.k) objK6);
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ3 = x0.v.q(oVar2);
                    x0.j1 j1VarL3 = oVar2.l();
                    j1.q qVarC3 = j1.a.c(qVarA2, oVar2);
                    i2.k.f8771g0.getClass();
                    ic.a aVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(aVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar2);
                    x0.v.A(i2.j.f8737f, j1VarL3, oVar2);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ3))) {
                        j2.h0.s(iQ3, oVar2, iQ3, hVar3);
                    }
                    x0.v.A(i2.j.f8735d, qVarC3, oVar2);
                    nVar2.q(oVar2, Integer.valueOf(iIntValue2 & 14));
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
