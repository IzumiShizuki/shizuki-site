package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p7 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f13466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2 f13467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(float f10, c2 c2Var, yb.c cVar) {
        super(2, cVar);
        this.f13466f = f10;
        this.f13467g = c2Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        p7 p7Var = new p7(this.f13466f, this.f13467g, cVar);
        p7Var.f13465e = obj;
        return p7Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        p7 p7Var = (p7) o((v) obj, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        p7Var.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        ((v) this.f13465e).a(this.f13466f - this.f13467g.f12780g.e());
        return ub.a0.f21526a;
    }
}
