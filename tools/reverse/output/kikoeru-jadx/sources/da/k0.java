package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f5723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(m0 m0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5722e = i10;
        this.f5723f = m0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5722e) {
            case 0:
                return new k0(this.f5723f, cVar, 0);
            default:
                return new k0(this.f5723f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5722e) {
            case 0:
                k0 k0Var = (k0) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                k0Var.u(a0Var);
                return a0Var;
            default:
                k0 k0Var2 = (k0) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                k0Var2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f5722e) {
            case 0:
                ub.a.f(obj);
                m0 m0Var = this.f5723f;
                m0Var.f5751n.setValue(Boolean.FALSE);
                m0Var.f5752o = false;
                break;
            default:
                ub.a.f(obj);
                this.f5723f.f5751n.setValue(Boolean.valueOf(!((Boolean) r3.f5751n.getValue()).booleanValue()));
                break;
        }
        return ub.a0.f21526a;
    }
}
