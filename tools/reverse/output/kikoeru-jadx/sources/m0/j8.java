package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j8 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f13151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13153d;

    public j8(float f10, x1 x1Var, boolean z10, ic.n nVar) {
        this.f13150a = f10;
        this.f13151b = x1Var;
        this.f13152c = z10;
        this.f13153d = nVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j1.q qVar = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(qVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            j1.q qVarI = g8.a.i(qVar, this.f13150a);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarI, oVar);
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
            oVar.W(264799724);
            x1 x1Var = this.f13151b;
            x0.w0 w0VarY = x0.v.y(new q1.q(this.f13152c ? x1Var.f13881t : x1Var.f13882u), oVar);
            oVar.p(false);
            m8.b(((q1.q) w0VarY.getValue()).f17577a, ((d9) oVar.j(e9.f12960b)).f12884g, this.f13153d, oVar, 0, 4);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
