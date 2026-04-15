package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1 f11524f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(l1 l1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f11523e = i10;
        this.f11524f = l1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f11523e) {
            case 0:
                return new k1(this.f11524f, cVar, 0);
            case 1:
                return new k1(this.f11524f, cVar, 1);
            default:
                return new k1(this.f11524f, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f11523e) {
            case 0:
                k1 k1Var = (k1) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                k1Var.u(a0Var);
                return a0Var;
            case 1:
                k1 k1Var2 = (k1) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                k1Var2.u(a0Var2);
                return a0Var2;
            default:
                k1 k1Var3 = (k1) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                k1Var3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f11523e) {
            case 0:
                ub.a.f(obj);
                this.f11524f.b(true);
                break;
            case 1:
                ub.a.f(obj);
                this.f11524f.d();
                break;
            default:
                ub.a.f(obj);
                this.f11524f.m();
                break;
        }
        return ub.a0.f21526a;
    }
}
