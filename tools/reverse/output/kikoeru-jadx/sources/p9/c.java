package p9;

import a9.u;
import b0.d0;
import ba.h0;
import ba.k;
import ba.k0;
import c0.z;
import f1.g;
import g2.v0;
import hf.y;
import i2.h;
import i2.i;
import i2.j;
import ic.n;
import java.util.List;
import jc.l;
import m0.v5;
import q.m1;
import q.t1;
import q1.q;
import ub.a0;
import x0.j1;
import x0.o;
import x0.v;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg.f f16946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f16947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f16948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f16949f;

    public /* synthetic */ c(List list, fg.f fVar, y yVar, k0 k0Var, z zVar, int i10) {
        this.f16944a = i10;
        this.f16945b = list;
        this.f16946c = fVar;
        this.f16947d = yVar;
        this.f16948e = k0Var;
        this.f16949f = zVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f16944a) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = this.f16945b;
                    fg.f fVar = this.f16946c;
                    v5.a(null, null, g.f(1278608942, new h0(16, list, fVar), oVar), g.f(1447752717, new c(list, fVar, this.f16947d, this.f16948e, this.f16949f, 1), oVar), null, null, 0, false, null, 0.0f, 0L, 0L, 0L, q.f17574g, 0L, g.f(-1967722219, new k(8, list, fVar), oVar), oVar, 3456);
                    m1 m1Var = (m1) oVar.j(u.f263a);
                    j1.q qVarB = m1Var.b(j1.n.f9689a, new d0(26, m1Var), t1.f17456c);
                    v0 v0VarD = p.d(j1.c.f9662a, false);
                    int iQ = v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(qVarB, oVar);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    v.A(j.f8738g, v0VarD, oVar);
                    v.A(j.f8737f, j1VarL, oVar);
                    h hVar = j.f8741j;
                    if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    v.A(j.f8735d, qVarC, oVar);
                    n nVar = ((f) list.get(((Number) fVar.getValue()).intValue())).f16958f;
                    if (nVar == null) {
                        oVar.W(1348809356);
                    } else {
                        oVar.W(1983172629);
                        nVar.q(oVar, 0);
                    }
                    oVar.p(false);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
            default:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m1 m1Var2 = (m1) oVar2.j(u.f263a);
                    j1.q qVarB2 = m1Var2.b(j1.n.f9689a, new d0(26, m1Var2), t1.f17456c);
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                    int iQ2 = v.q(oVar2);
                    j1 j1VarL2 = oVar2.l();
                    j1.q qVarC2 = j1.a.c(qVarB2, oVar2);
                    i2.k.f8771g0.getClass();
                    i iVar2 = j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar2);
                    } else {
                        oVar2.k0();
                    }
                    v.A(j.f8738g, vVarA, oVar2);
                    v.A(j.f8737f, j1VarL2, oVar2);
                    h hVar2 = j.f8741j;
                    if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar2, iQ2, hVar2);
                    }
                    v.A(j.f8735d, qVarC2, oVar2);
                    a2.c.k(null, oVar2, 0, 1);
                    y yVar = this.f16947d;
                    boolean zH = oVar2.h(yVar);
                    k0 k0Var = this.f16948e;
                    boolean zH2 = zH | oVar2.h(k0Var);
                    z zVar = this.f16949f;
                    boolean zF = zH2 | oVar2.f(zVar);
                    Object objK = oVar2.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new ba.i(yVar, k0Var, zVar, 10);
                        oVar2.h0(objK);
                    }
                    a.a(this.f16945b, this.f16946c, (ic.k) objK, oVar2, 48);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
