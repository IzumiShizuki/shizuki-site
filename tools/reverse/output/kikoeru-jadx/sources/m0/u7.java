package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u7 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f13706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(x0.w0 w0Var, x0.w0 w0Var2, x0.w0 w0Var3, yb.c cVar) {
        super(2, cVar);
        this.f13707f = w0Var;
        this.f13708g = w0Var2;
        this.f13709h = w0Var3;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        u7 u7Var = new u7(this.f13707f, this.f13708g, this.f13709h, cVar);
        u7Var.f13706e = ((Boolean) obj).booleanValue();
        return u7Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        u7 u7Var = (u7) o(bool, (yb.c) obj2);
        ub.a0 a0Var = ub.a0.f21526a;
        u7Var.u(a0Var);
        return a0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        boolean z10 = this.f13706e;
        float f10 = v7.f13768a;
        if (((Boolean) this.f13707f.getValue()).booleanValue() != z10) {
            ic.k kVar = (ic.k) this.f13708g.getValue();
            if (kVar != null) {
                kVar.a(Boolean.valueOf(z10));
            }
            this.f13709h.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
        }
        return ub.a0.f21526a;
    }
}
