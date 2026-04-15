package ua;

import androidx.compose.foundation.layout.LayoutWeightElement;
import g2.e0;
import ic.o;
import j1.n;
import j1.q;
import j2.l1;
import j2.z2;
import jc.m;
import ub.a0;
import x0.r0;
import x0.w0;
import x0.y1;
import y.t;
import y.u;
import y.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta.c f21506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f21508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ta.c cVar, int i10, ic.k kVar) {
        super(3);
        this.f21506b = cVar;
        this.f21507c = i10;
        this.f21508d = kVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        jc.l.e((t) obj, "$this$BoxWithConstraints");
        if ((iIntValue & 81) == 16 && oVar.z()) {
            oVar.Q();
        } else {
            float f10 = 16;
            n nVar = n.f9689a;
            q qVarC = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.j(nVar, f10).e(androidx.compose.foundation.layout.c.f556b), 1.0f);
            oVar.X(-483455358);
            v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            oVar.X(-1323940314);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            f3.m mVar = (f3.m) oVar.j(l1.f9872n);
            z2 z2Var = (z2) oVar.j(l1.f9877s);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            f1.f fVar = new f1.f(new e0(qVarC, 1), -2123382363, true);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            oVar.f24399y = false;
            x0.v.A(i2.j.f8738g, vVarA, oVar);
            x0.v.A(i2.j.f8736e, cVar, oVar);
            x0.v.A(i2.j.f8739h, mVar, oVar);
            x0.v.A(i2.j.f8740i, z2Var, oVar);
            oVar.f24399y = oVar.f24400z >= 0;
            fVar.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            oVar.X(-1163856341);
            w0 w0VarY = x0.v.y(this.f21506b, oVar);
            w0 w0VarY2 = x0.v.y(this.f21508d, oVar);
            q qVarC2 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            if (0.8f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            q qVarE = qVarC2.e(new LayoutWeightElement(0.8f, true));
            ta.c cVar2 = (ta.c) w0VarY.getValue();
            oVar.X(1157296644);
            boolean zF = oVar.f(w0VarY2);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (zF || objK == r0Var) {
                objK = new cg.c(w0VarY2, 7);
                oVar.h0(objK);
            }
            oVar.p(false);
            j.c((this.f21507c << 6) & 7168, (ic.k) objK, qVarE, cVar2, oVar);
            q qVarC3 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.a.n(nVar, 0.0f, f10, 0.0f, 0.0f, 13), 1.0f);
            if (0.2f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            q qVarE2 = qVarC3.e(new LayoutWeightElement(0.2f, true));
            oVar.X(511388516);
            boolean zF2 = oVar.f(w0VarY2) | oVar.f(w0VarY);
            Object objK2 = oVar.K();
            if (zF2 || objK2 == r0Var) {
                objK2 = new eg.c(w0VarY2, w0VarY, 1);
                oVar.h0(objK2);
            }
            oVar.p(false);
            nd.h.a(0, (ic.k) objK2, qVarE2, (ta.c) w0VarY.getValue(), oVar);
            oVar.p(false);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        return a0.f21526a;
    }
}
