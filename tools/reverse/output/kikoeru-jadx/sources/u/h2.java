package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f20939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(i1 i1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f20938e = i10;
        this.f20939f = i1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20938e) {
            case 0:
                return new h2(this.f20939f, cVar, 0);
            case 1:
                return new h2(this.f20939f, cVar, 1);
            case 2:
                return new h2(this.f20939f, cVar, 2);
            case 3:
                return new h2(this.f20939f, cVar, 3);
            case 4:
                return new h2(this.f20939f, cVar, 4);
            case 5:
                return new h2(this.f20939f, cVar, 5);
            case 6:
                return new h2(this.f20939f, cVar, 6);
            default:
                return new h2(this.f20939f, cVar, 7);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f20938e) {
            case 0:
                h2 h2Var = (h2) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                h2Var.u(a0Var);
                return a0Var;
            case 1:
                h2 h2Var2 = (h2) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                h2Var2.u(a0Var2);
                return a0Var2;
            case 2:
                h2 h2Var3 = (h2) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                h2Var3.u(a0Var3);
                return a0Var3;
            case 3:
                h2 h2Var4 = (h2) o(yVar, cVar);
                ub.a0 a0Var4 = ub.a0.f21526a;
                h2Var4.u(a0Var4);
                return a0Var4;
            case 4:
                h2 h2Var5 = (h2) o(yVar, cVar);
                ub.a0 a0Var5 = ub.a0.f21526a;
                h2Var5.u(a0Var5);
                return a0Var5;
            case 5:
                h2 h2Var6 = (h2) o(yVar, cVar);
                ub.a0 a0Var6 = ub.a0.f21526a;
                h2Var6.u(a0Var6);
                return a0Var6;
            case 6:
                h2 h2Var7 = (h2) o(yVar, cVar);
                ub.a0 a0Var7 = ub.a0.f21526a;
                h2Var7.u(a0Var7);
                return a0Var7;
            default:
                h2 h2Var8 = (h2) o(yVar, cVar);
                ub.a0 a0Var8 = ub.a0.f21526a;
                h2Var8.u(a0Var8);
                return a0Var8;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f20938e;
        ub.a0 a0Var = ub.a0.f21526a;
        i1 i1Var = this.f20939f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                i1Var.c();
                break;
            case 1:
                ub.a.f(obj);
                i1Var.d();
                break;
            case 2:
                ub.a.f(obj);
                i1Var.d();
                break;
            case 3:
                ub.a.f(obj);
                i1Var.c();
                break;
            case 4:
                ub.a.f(obj);
                i1Var.d();
                break;
            case 5:
                ub.a.f(obj);
                i1Var.d();
                break;
            case 6:
                ub.a.f(obj);
                i1Var.c();
                break;
            default:
                ub.a.f(obj);
                i1Var.d();
                break;
        }
        return a0Var;
    }
}
