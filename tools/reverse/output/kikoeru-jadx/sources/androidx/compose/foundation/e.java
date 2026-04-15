package androidx.compose.foundation;

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
public final class e extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.a f505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m0 m0Var, h hVar, ic.a aVar, ic.a aVar2, ic.a aVar3) {
        super(3);
        this.f502b = m0Var;
        this.f503c = hVar;
        this.f504d = aVar;
        this.f505e = aVar2;
        this.f506f = aVar3;
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
        q qVarE = f.a(n.f9689a, kVar, this.f502b).e(new CombinedClickableElement(this.f504d, this.f505e, this.f506f, this.f503c, null, kVar));
        oVar.p(false);
        return qVarE;
    }
}
