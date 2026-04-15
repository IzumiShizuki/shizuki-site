package da;

import m0.d9;
import m0.e9;
import m0.r3;
import m0.z8;
import x0.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1.f f5788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5789c;

    public /* synthetic */ r0(w1.f fVar, int i10, int i11) {
        this.f5787a = i11;
        this.f5788b = fVar;
        this.f5789c = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        x0.o oVar = (x0.o) obj;
        switch (this.f5787a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9675n, oVar, 48);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(j1.n.f9689a, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    r3.b(this.f5788b, null, null, 0L, oVar, 48, 12);
                    int i10 = this.f5789c;
                    if (i10 != -1) {
                        oVar.W(91402074);
                        z10 = false;
                        z8.b(String.valueOf(i10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(e9.f12960b)).f12889l, oVar, 0, 0, 65534);
                        oVar = oVar;
                    } else {
                        z10 = false;
                        oVar.W(82267955);
                    }
                    oVar.p(z10);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y.v vVarA2 = y.u.a(y.k.f25158c, j1.c.f9675n, oVar, 48);
                    int iQ2 = x0.v.q(oVar);
                    j1 j1VarL2 = oVar.l();
                    j1.q qVarC2 = j1.a.c(j1.n.f9689a, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar2);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA2, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL2, oVar);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar, iQ2, hVar2);
                    }
                    x0.v.A(i2.j.f8735d, qVarC2, oVar);
                    r3.b(this.f5788b, null, null, 0L, oVar, 48, 12);
                    int i11 = this.f5789c;
                    if (i11 != -1) {
                        oVar.W(-1061736896);
                        z11 = false;
                        z8.b(String.valueOf(i11), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((d9) oVar.j(e9.f12960b)).f12889l, oVar, 0, 0, 65534);
                        oVar = oVar;
                    } else {
                        z11 = false;
                        oVar.W(-1070860103);
                    }
                    oVar.p(z11);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
