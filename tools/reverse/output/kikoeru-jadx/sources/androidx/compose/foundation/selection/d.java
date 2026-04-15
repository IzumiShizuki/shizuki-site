package androidx.compose.foundation.selection;

import androidx.compose.foundation.f;
import ic.o;
import j1.n;
import j1.q;
import jc.m;
import q.t0;
import q2.h;
import s.m0;
import x0.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2.a f618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m0 m0Var, s2.a aVar, boolean z10, h hVar, ic.a aVar2) {
        super(3);
        this.f617b = m0Var;
        this.f618c = aVar;
        this.f619d = z10;
        this.f620e = hVar;
        this.f621f = aVar2;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(-1525724089);
        Object objK = oVar.K();
        if (objK == k.f24334a) {
            objK = t0.I(oVar);
        }
        w.k kVar = (w.k) objK;
        q qVarE = f.a(n.f9689a, kVar, this.f617b).e(new TriStateToggleableElement(this.f618c, kVar, null, this.f619d, this.f620e, this.f621f));
        oVar.p(false);
        return qVarE;
    }
}
