package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d7 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.q f12866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f12867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f12869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s.o f12870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f12872g;

    public d7(float f10, float f11, long j10, f1.f fVar, j1.q qVar, q1.l0 l0Var, s.o oVar) {
        this.f12866a = qVar;
        this.f12867b = l0Var;
        this.f12868c = j10;
        this.f12869d = f10;
        this.f12870e = oVar;
        this.f12871f = f11;
        this.f12872g = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zN = oVar.N(iIntValue & 1, (iIntValue & 3) != 2);
        ub.a0 a0Var = ub.a0.f21526a;
        if (!zN) {
            oVar.Q();
            return a0Var;
        }
        j1.q qVarQ = android.support.v4.media.session.b.q(this.f12866a, this.f12867b, android.support.v4.media.session.b.r(this.f12868c, (r1) oVar.j(x2.f13883a), this.f12869d, oVar), this.f12870e, this.f12871f);
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            objK = new l3(6);
            oVar.h0(objK);
        }
        j1.q qVarA = q2.m.a(qVarQ, false, (ic.k) objK);
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = c7.f12806a;
            oVar.h0(objK2);
        }
        j1.q qVarA2 = c2.e0.a(qVarA, a0Var, (PointerInputEventHandler) objK2);
        g2.v0 v0VarD = y.p.d(j1.c.f9662a, true);
        int iQ = x0.v.q(oVar);
        x0.j1 j1VarL = oVar.l();
        j1.q qVarC = j1.a.c(qVarA2, oVar);
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
            j2.h0.s(iQ, oVar, iQ, hVar);
        }
        x0.v.A(i2.j.f8735d, qVarC, oVar);
        this.f12872g.q(oVar, 0);
        oVar.p(true);
        return a0Var;
    }
}
