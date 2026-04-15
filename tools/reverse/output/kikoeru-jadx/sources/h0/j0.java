package h0;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f7713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i10, int i11, t2.l0 l0Var) {
        super(3);
        this.f7711b = i10;
        this.f7712c = i11;
        this.f7713d = l0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(408240218);
        int i10 = this.f7711b;
        int i11 = this.f7712c;
        q0.w(i10, i11);
        j1.n nVar = j1.n.f9689a;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            oVar.p(false);
            return nVar;
        }
        f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
        x2.d dVar = (x2.d) oVar.j(j2.l1.f9869k);
        f3.m mVar = (f3.m) oVar.j(j2.l1.f9872n);
        t2.l0 l0Var = this.f7713d;
        boolean zF = oVar.f(l0Var) | oVar.f(mVar);
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (zF || objK == r0Var) {
            objK = t2.c0.h(l0Var, mVar);
            oVar.h0(objK);
        }
        t2.l0 l0Var2 = (t2.l0) objK;
        boolean zF2 = oVar.f(dVar) | oVar.f(l0Var2);
        Object objK2 = oVar.K();
        if (zF2 || objK2 == r0Var) {
            t2.d0 d0Var = l0Var2.f20362a;
            x2.n nVar2 = d0Var.f20298f;
            x2.k kVar = d0Var.f20295c;
            if (kVar == null) {
                kVar = x2.k.f24562d;
            }
            x2.i iVar = d0Var.f20296d;
            int i12 = iVar != null ? iVar.f24558a : 0;
            x2.j jVar = d0Var.f20297e;
            objK2 = ((x2.e) dVar).b(nVar2, kVar, i12, jVar != null ? jVar.f24559a : 65535);
            oVar.h0(objK2);
        }
        n2 n2Var = (n2) objK2;
        boolean zF3 = oVar.f(n2Var.getValue()) | oVar.f(cVar) | oVar.f(dVar) | oVar.f(l0Var) | oVar.f(mVar);
        Object objK3 = oVar.K();
        if (zF3 || objK3 == r0Var) {
            objK3 = Integer.valueOf((int) (g1.a(l0Var2, cVar, dVar, g1.f7631a, 1) & 4294967295L));
            oVar.h0(objK3);
        }
        int iIntValue = ((Number) objK3).intValue();
        boolean zF4 = oVar.f(n2Var.getValue()) | oVar.f(cVar) | oVar.f(dVar) | oVar.f(l0Var) | oVar.f(mVar);
        Object objK4 = oVar.K();
        if (zF4 || objK4 == r0Var) {
            StringBuilder sb = new StringBuilder();
            String str = g1.f7631a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objK4 = Integer.valueOf((int) (g1.a(l0Var2, cVar, dVar, sb.toString(), 2) & 4294967295L));
            oVar.h0(objK4);
        }
        int iIntValue2 = ((Number) objK4).intValue() - iIntValue;
        Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
        j1.q qVarE = androidx.compose.foundation.layout.c.e(nVar, numValueOf != null ? cVar.I(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? cVar.I(numValueOf2.intValue()) : Float.NaN);
        oVar.p(false);
        return qVarE;
    }
}
