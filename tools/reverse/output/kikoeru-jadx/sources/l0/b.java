package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f11423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f11424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j10, boolean z10, j1.q qVar, o oVar) {
        super(2);
        this.f11421b = j10;
        this.f11422c = z10;
        this.f11423d = qVar;
        this.f11424e = oVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.r0 r0Var = x0.k.f24334a;
            o oVar2 = this.f11424e;
            boolean z10 = this.f11422c;
            long j10 = this.f11421b;
            if (j10 != 9205357640488583168L) {
                oVar.W(-837626688);
                y.o0 o0Var = z10 ? y.d.f25106b : y.d.f25105a;
                j1.q qVarI = androidx.compose.foundation.layout.c.i(this.f11423d, f3.h.b(j10), f3.h.a(j10), 0.0f, 0.0f, 12);
                y.j1 j1VarA = y.i1.a(o0Var, j1.c.f9671j, oVar, 0);
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
                x0.v.A(i2.j.f8738g, j1VarA, oVar);
                x0.v.A(i2.j.f8737f, j1VarL, oVar);
                i2.h hVar = i2.j.f8741j;
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                    j2.h0.s(iQ, oVar, iQ, hVar);
                }
                x0.v.A(i2.j.f8735d, qVarC, oVar);
                boolean zH = oVar.h(oVar2);
                Object objK = oVar.K();
                if (zH || objK == r0Var) {
                    objK = new a(oVar2, 0);
                    oVar.h0(objK);
                }
                u0.e(j1.n.f9689a, (ic.a) objK, z10, oVar, 6);
                oVar.p(true);
                oVar.p(false);
            } else {
                oVar.W(-836697680);
                boolean zH2 = oVar.h(oVar2);
                Object objK2 = oVar.K();
                if (zH2 || objK2 == r0Var) {
                    objK2 = new a(oVar2, 1);
                    oVar.h0(objK2);
                }
                u0.e(this.f11423d, (ic.a) objK2, z10, oVar, 0);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
