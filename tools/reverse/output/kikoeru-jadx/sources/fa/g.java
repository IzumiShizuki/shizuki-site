package fa;

import g2.v0;
import j2.h0;
import j9.f0;
import java.util.List;
import m0.b1;
import m0.c1;
import m0.z8;
import q.t0;
import ub.a0;
import x0.j1;
import x0.n2;
import x0.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f6997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n2 f7000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, boolean z10, ic.k kVar, int i10, int i11, n2 n2Var) {
        super(4);
        this.f6995b = list;
        this.f6996c = z10;
        this.f6997d = kVar;
        this.f6998e = i10;
        this.f6999f = i11;
        this.f7000g = n2Var;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        a0.d dVar = (a0.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        x0.o oVar = (x0.o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (oVar.f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= oVar.d(iIntValue) ? 32 : 16;
        }
        if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
            f0 f0Var = (f0) this.f6995b.get(iIntValue);
            oVar.W(-528552917);
            j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
            boolean z10 = this.f6996c;
            v0 v0VarD = y.p.d(z10 ? j1.c.f9666e : j1.c.f9665d, false);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarC, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            j1.q qVarI = g8.a.i(a0.c.x(dVar), ((Number) this.f7000g.getValue()).intValue() != iIntValue ? 0.32f : 1.0f);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = t0.I(oVar);
            }
            w.k kVar = (w.k) objK;
            ic.k kVar2 = this.f6997d;
            boolean zF = oVar.f(kVar2) | oVar.f(f0Var);
            Object objK2 = oVar.K();
            if (zF || objK2 == r0Var) {
                objK2 = new bd.i(4, kVar2, f0Var, false);
                oVar.h0(objK2);
            }
            z8.b(f0Var.f10695b, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.c(qVarI, kVar, null, false, null, (ic.a) objK2, 28), 0.0f, this.f6998e / 2, 1), ((b1) oVar.j(c1.f12773a)).c(), lc.b.C(this.f6999f), null, null, 0L, null, new e3.k(z10 ? 3 : 5), 0L, 0, false, 0, 0, null, oVar, 3072, 0, 130544);
            oVar.p(true);
            oVar.p(false);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
