package cg;

import androidx.compose.foundation.layout.FillElement;
import g2.n1;
import x0.j1;
import x0.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v vVar, int i10) {
        super(2);
        this.f4039b = 2;
        this.f4040c = vVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f4039b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.z()) {
                    oVar.Q();
                } else {
                    v vVar = this.f4040c;
                    boolean z10 = vVar.z();
                    oVar.X(-650926512);
                    boolean zG = oVar.g(z10);
                    Object objK = oVar.K();
                    if (zG || objK == x0.k.f24334a) {
                        objK = vVar.z() ? androidx.compose.foundation.layout.c.f557c : androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), 1.7777778f, false);
                        oVar.h0(objK);
                    }
                    oVar.p(false);
                    j1.h hVar = j1.c.f9666e;
                    oVar.X(733328855);
                    y.s sVarE = y.p.e(hVar, oVar, 6);
                    oVar.X(-1323940314);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    f1.f fVarK = n1.k((j1.q) objK);
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, sVarE, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar2);
                    }
                    fVarK.g(new y1(oVar), oVar, 0);
                    oVar.X(2058660585);
                    androidx.compose.ui.viewinterop.a.b(new b0(vVar, 2), androidx.compose.foundation.layout.c.f557c, null, oVar, 48, 4);
                    oVar.p(false);
                    oVar.p(true);
                    oVar.p(false);
                    oVar.p(false);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.z()) {
                    oVar2.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                    oVar2.X(733328855);
                    y.s sVarE2 = y.p.e(j1.c.f9662a, oVar2, 0);
                    oVar2.X(-1323940314);
                    int iQ2 = x0.v.q(oVar2);
                    j1 j1VarL2 = oVar2.l();
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    f1.f fVarK2 = n1.k(fillElement);
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar2);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(i2.j.f8738g, sVarE2, oVar2);
                    x0.v.A(i2.j.f8737f, j1VarL2, oVar2);
                    i2.h hVar3 = i2.j.f8741j;
                    if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar2, iQ2, hVar3);
                    }
                    fVarK2.g(new y1(oVar2), oVar2, 0);
                    oVar2.X(2058660585);
                    oVar2.X(-1510673869);
                    ia.a.f9494a.g(this.f4040c, oVar2, 8);
                    oVar2.p(false);
                    oVar2.X(-650924743);
                    oVar2.p(false);
                    oVar2.p(false);
                    oVar2.p(true);
                    oVar2.p(false);
                    oVar2.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                g8.a.d(this.f4040c, (x0.o) obj, x0.v.D(9));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(v vVar, int i10, byte b10) {
        super(2);
        this.f4039b = i10;
        this.f4040c = vVar;
    }
}
