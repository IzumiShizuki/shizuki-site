package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f7569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, j1.q qVar) {
        super(2);
        this.f7568b = j10;
        this.f7569c = qVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j10 = this.f7568b;
            if (j10 != 9205357640488583168L) {
                oVar.W(1828931592);
                j1.q qVarI = androidx.compose.foundation.layout.c.i(this.f7569c, f3.h.b(j10), f3.h.a(j10), 0.0f, 0.0f, 12);
                g2.v0 v0VarD = y.p.d(j1.c.f9663b, false);
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
                e.b(null, oVar, 0, 1);
                oVar.p(true);
                oVar.p(false);
            } else {
                oVar.W(1829298756);
                e.b(this.f7569c, oVar, 0, 0);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
