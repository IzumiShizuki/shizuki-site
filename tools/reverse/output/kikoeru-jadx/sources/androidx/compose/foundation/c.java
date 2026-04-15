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
public final class c extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m0 m0Var, boolean z10, String str, h hVar, ic.a aVar) {
        super(3);
        this.f494b = m0Var;
        this.f495c = z10;
        this.f496d = str;
        this.f497e = hVar;
        this.f498f = aVar;
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
        q qVarE = f.a(n.f9689a, kVar, this.f494b).e(new ClickableElement(kVar, null, this.f495c, this.f496d, this.f497e, this.f498f));
        oVar.p(false);
        return qVarE;
    }
}
