package da;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import x0.j1;
import y.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f5825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f5826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf.y f5827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f5828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f5829g;

    public /* synthetic */ v0(long j10, b1 b1Var, ic.a aVar, hf.y yVar, x0.w0 w0Var, x0.w0 w0Var2, int i10) {
        this.f5823a = i10;
        this.f5824b = j10;
        this.f5825c = b1Var;
        this.f5826d = aVar;
        this.f5827e = yVar;
        this.f5828f = w0Var;
        this.f5829g = w0Var2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f5823a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    android.support.v4.media.session.b.m(gh.g.k(androidx.compose.foundation.layout.a.l(j1.n.f9689a, 20, 0.0f, 2), g0.g.a(5)), null, 0L, 0L, null, 0.0f, f1.g.f(1353447403, new v0(this.f5824b, this.f5825c, this.f5826d, this.f5827e, this.f5828f, this.f5829g, 1), oVar), oVar, 1572864, 62);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j1.n nVar = j1.n.f9689a;
                    j1.q qVarJ = androidx.compose.foundation.layout.a.j(nVar, 10);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                    int iQ = x0.v.q(oVar2);
                    j1 j1VarL = oVar2.l();
                    j1.q qVarC = j1.a.c(qVarJ, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    i2.h hVar = i2.j.f8738g;
                    x0.v.A(hVar, vVarA, oVar2);
                    i2.h hVar2 = i2.j.f8737f;
                    x0.v.A(hVar2, j1VarL, oVar2);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar2, iQ, hVar3);
                    }
                    i2.h hVar4 = i2.j.f8735d;
                    x0.v.A(hVar4, qVarC, oVar2);
                    j1.q qVarF = androidx.compose.foundation.layout.c.f(nVar, 0.0f, ((Configuration) oVar2.j(AndroidCompositionLocals_androidKt.f720a)).screenHeightDp * 0.8f, 1);
                    boolean zBooleanValue = ((Boolean) this.f5828f.getValue()).booleanValue();
                    final long j10 = this.f5824b;
                    final b1 b1Var = this.f5825c;
                    a.h(j10, b1Var, qVarF, zBooleanValue, this.f5826d, oVar2, 0);
                    Object objK = oVar2.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (objK == r0Var) {
                        objK = x0.v.v(Boolean.FALSE);
                        oVar2.h0(objK);
                    }
                    x0.w0 w0Var = (x0.w0) objK;
                    final hf.y yVar = this.f5827e;
                    boolean zH = oVar2.h(yVar) | oVar2.e(j10) | oVar2.h(b1Var);
                    Object objK2 = oVar2.K();
                    if (zH || objK2 == r0Var) {
                        objK2 = new ic.k() { // from class: da.w0
                            @Override // ic.k
                            public final Object a(Object obj3) {
                                bg.p pVar = (bg.p) obj3;
                                jc.l.e(pVar, "it");
                                hf.a0.y(yVar, null, null, new y0(pVar, j10, b1Var, null), 3);
                                return ub.a0.f21526a;
                            }
                        };
                        oVar2.h0(objK2);
                    }
                    q9.w.e(w0Var, (ic.k) objK2, oVar2, 6);
                    j1.q qVarC2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar2, 0);
                    int iQ2 = x0.v.q(oVar2);
                    j1 j1VarL2 = oVar2.l();
                    j1.q qVarC3 = j1.a.c(qVarC2, oVar2);
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(hVar, j1VarA, oVar2);
                    x0.v.A(hVar2, j1VarL2, oVar2);
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar2, iQ2, hVar3);
                    }
                    x0.v.A(hVar4, qVarC3, oVar2);
                    Object objK3 = oVar2.K();
                    if (objK3 == r0Var) {
                        objK3 = new aa.f(w0Var, 10);
                        oVar2.h0(objK3);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK3, null, false, null, a.f5629m, oVar2, 805306374, 510);
                    if (1.0f <= 0.0d) {
                        z.a.a("invalid weight; must be greater than zero");
                    }
                    y.d.d(new LayoutWeightElement(1.0f, true), oVar2);
                    x0.w0 w0Var2 = this.f5829g;
                    boolean zF = oVar2.f(w0Var2);
                    Object objK4 = oVar2.K();
                    if (zF || objK4 == r0Var) {
                        objK4 = new aa.f(w0Var2, 11);
                        oVar2.h0(objK4);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK4, null, false, null, a.f5630n, oVar2, 805306368, 510);
                    oVar2.p(true);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
