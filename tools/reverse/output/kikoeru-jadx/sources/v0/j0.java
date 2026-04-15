package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ long f22243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f22244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, yb.c cVar) {
        super(3, cVar);
        this.f22244f = l0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j10 = ((p1.b) obj2).f16481a;
        j0 j0Var = new j0(this.f22244f, (yb.c) obj3);
        j0Var.f22243e = j10;
        ub.a0 a0Var = ub.a0.f21526a;
        j0Var.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        long j10 = this.f22243e;
        l0 l0Var = this.f22244f;
        l0Var.f22267l.f((l0Var.f22262g ? l0Var.f22261f.e() - p1.b.e(j10) : p1.b.e(j10)) - l0Var.f22266k.e());
        return ub.a0.f21526a;
    }
}
