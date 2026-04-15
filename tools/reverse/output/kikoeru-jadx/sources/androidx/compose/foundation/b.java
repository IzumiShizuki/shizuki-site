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
public final class b extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, String str, ic.a aVar) {
        super(3);
        this.f491b = z10;
        this.f492c = str;
        this.f493d = aVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        k kVar;
        q qVarE;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(-756081143);
        m0 m0Var = (m0) oVar.j(f.f507a);
        boolean z10 = m0Var instanceof r0;
        if (z10) {
            oVar.W(617653824);
            oVar.p(false);
            kVar = null;
        } else {
            oVar.W(617786442);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = t0.I(oVar);
            }
            kVar = (k) objK;
            oVar.p(false);
        }
        k kVar2 = kVar;
        boolean z11 = this.f491b;
        String str = this.f492c;
        ic.a aVar = this.f493d;
        if (z10) {
            qVarE = new ClickableElement(kVar2, (r0) m0Var, z11, str, null, aVar);
        } else if (m0Var == null) {
            qVarE = new ClickableElement(kVar2, null, z11, str, null, aVar);
        } else {
            n nVar = n.f9689a;
            qVarE = kVar2 != null ? f.a(nVar, kVar2, m0Var).e(new ClickableElement(kVar2, null, z11, str, null, aVar)) : j1.a.a(nVar, new c(m0Var, z11, str, null, aVar));
        }
        oVar.p(false);
        return qVarE;
    }
}
