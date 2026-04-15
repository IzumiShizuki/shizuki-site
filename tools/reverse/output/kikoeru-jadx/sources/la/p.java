package la;

import m0.d9;
import m0.e9;
import m0.h1;
import m0.q1;
import m0.z8;
import x0.n1;
import y.i1;
import y.j1;
import y.l1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f12065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f12066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f12068e;

    public /* synthetic */ p(ic.n nVar, q1 q1Var, boolean z10, f1.f fVar, int i10) {
        this.f12064a = i10;
        this.f12065b = nVar;
        this.f12066c = q1Var;
        this.f12067d = z10;
        this.f12068e = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f12064a;
        ub.a0 a0Var = ub.a0.f21526a;
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    z8.a(((d9) oVar.j(e9.f12960b)).f12889l, f1.g.f(-252831493, new p(this.f12065b, this.f12066c, this.f12067d, this.f12068e, 1), oVar), oVar, 48);
                }
                break;
            default:
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    float f10 = m0.a1.f12645a;
                    j1.n nVar = j1.n.f9689a;
                    j1.q qVarB = androidx.compose.foundation.layout.c.b(nVar, 0.0f, f10, 1);
                    ic.n nVar2 = this.f12065b;
                    j1.q qVarN = androidx.compose.foundation.layout.a.n(qVarB, nVar2 == null ? t.f12099a : 0, 0.0f, t.f12099a, 0.0f, 10);
                    j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9672k, oVar, 54);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(qVarN, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
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
                    if (nVar2 != null) {
                        oVar.W(64326971);
                        y.d.d(androidx.compose.foundation.layout.c.n(nVar, t.f12100b), oVar);
                        oVar.W(1955749013);
                        q1 q1Var = this.f12066c;
                        x0.w0 w0VarY = x0.v.y(new q1.q(this.f12067d ? q1Var.f13486c : q1Var.f13489f), oVar);
                        oVar.p(false);
                        x0.v.b(new n1[]{m0.j1.f13125a.a(new q1.q(((q1.q) w0VarY.getValue()).f17577a)), h1.f13043a.a(Float.valueOf(q1.q.d(((q1.q) w0VarY.getValue()).f17577a)))}, nVar2, oVar, 8);
                        y.d.d(androidx.compose.foundation.layout.c.n(nVar, t.f12101c), oVar);
                    } else {
                        oVar.W(60979715);
                    }
                    oVar.p(false);
                    this.f12068e.g(l1.f25167a, oVar, 6);
                    oVar.p(true);
                }
                break;
        }
        return a0Var;
    }
}
