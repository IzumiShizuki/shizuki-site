package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f22014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, y yVar, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f22013e = z10;
        this.f22014f = yVar;
        this.f22015g = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new l(this.f22013e, this.f22014f, this.f22015g, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        l lVar = (l) o((hf.y) obj, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        lVar.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        boolean z10 = this.f22013e;
        Object obj2 = this.f22015g;
        y yVar = this.f22014f;
        if (z10) {
            yVar.f22086q.add(obj2);
        } else {
            yVar.f22086q.remove(obj2);
        }
        return ub.a0.f21526a;
    }
}
