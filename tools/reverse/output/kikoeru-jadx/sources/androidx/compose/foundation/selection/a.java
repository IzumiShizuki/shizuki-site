package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import ic.o;
import j1.n;
import j1.q;
import jc.m;
import q.t0;
import q2.h;
import s.m0;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, h hVar, ic.a aVar) {
        super(3);
        this.f609b = z10;
        this.f610c = hVar;
        this.f611d = aVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        k kVar;
        q qVarE;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(-2124609672);
        m0 m0Var = (m0) oVar.j(f.f507a);
        boolean z10 = m0Var instanceof r0;
        if (z10) {
            oVar.W(-1412174474);
            oVar.p(false);
            kVar = null;
        } else {
            oVar.W(-1412041856);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = t0.I(oVar);
            }
            kVar = (k) objK;
            oVar.p(false);
        }
        k kVar2 = kVar;
        boolean z11 = this.f609b;
        h hVar = this.f610c;
        ic.a aVar = this.f611d;
        if (z10) {
            qVarE = new SelectableElement(z11, kVar2, (r0) m0Var, true, hVar, aVar);
        } else if (m0Var == null) {
            qVarE = new SelectableElement(z11, kVar2, null, true, hVar, aVar);
        } else {
            n nVar = n.f9689a;
            qVarE = kVar2 != null ? f.a(nVar, kVar2, m0Var).e(new SelectableElement(z11, kVar2, null, true, hVar, aVar)) : j1.a.a(nVar, new b(m0Var, z11, true, hVar, aVar));
        }
        oVar.p(false);
        return qVarE;
    }
}
