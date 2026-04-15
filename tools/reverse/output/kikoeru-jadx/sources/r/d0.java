package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ float f18368e;

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        d0 d0Var = new d0(2, cVar);
        d0Var.f18368e = ((Number) obj).floatValue();
        return d0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((d0) o(Float.valueOf(((Number) obj).floatValue()), (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        return Boolean.valueOf(this.f18368e > 0.0f);
    }
}
