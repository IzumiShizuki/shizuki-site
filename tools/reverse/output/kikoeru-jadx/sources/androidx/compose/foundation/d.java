package androidx.compose.foundation;

import ic.o;
import j1.n;
import j1.q;
import jc.m;
import q.t0;
import s.m0;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ic.a aVar, ic.a aVar2, ic.a aVar3) {
        super(3);
        this.f499b = aVar;
        this.f500c = aVar2;
        this.f501d = aVar3;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        k kVar;
        q qVarE;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(-1534186401);
        m0 m0Var = (m0) oVar.j(f.f507a);
        boolean z10 = m0Var instanceof r0;
        if (z10) {
            oVar.W(-1726068379);
            oVar.p(false);
            kVar = null;
        } else {
            oVar.W(-1725935761);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = t0.I(oVar);
            }
            kVar = (k) objK;
            oVar.p(false);
        }
        k kVar2 = kVar;
        ic.a aVar = this.f499b;
        ic.a aVar2 = this.f500c;
        ic.a aVar3 = this.f501d;
        if (z10) {
            qVarE = new CombinedClickableElement(aVar3, aVar, aVar2, null, (r0) m0Var, kVar2);
        } else if (m0Var == null) {
            qVarE = new CombinedClickableElement(aVar3, aVar, aVar2, null, null, kVar2);
        } else {
            n nVar = n.f9689a;
            qVarE = kVar2 != null ? f.a(nVar, kVar2, m0Var).e(new CombinedClickableElement(aVar3, aVar, aVar2, null, null, kVar2)) : j1.a.a(nVar, new e(m0Var, null, aVar3, aVar, aVar2));
        }
        oVar.p(false);
        return qVarE;
    }
}
