package da;

import bg.a2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2 f5707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(a2 a2Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5706e = i10;
        this.f5707f = a2Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5706e) {
            case 0:
                return new i0(this.f5707f, cVar, 0);
            default:
                return new i0(this.f5707f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5706e) {
            case 0:
                i0 i0Var = (i0) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                i0Var.u(a0Var);
                return a0Var;
            default:
                i0 i0Var2 = (i0) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                i0Var2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f5706e) {
            case 0:
                ub.a.f(obj);
                d9.o oVarT = a9.i.c().t();
                c9.d dVarX = a.a.X(this.f5707f, 0);
                oVarT.getClass();
                ua.l.W(oVarT.f5585a, false, true, new d9.n(oVarT, dVarX, 2));
                break;
            default:
                ub.a.f(obj);
                h9.d.f8241a.setValue(this.f5707f);
                break;
        }
        return ub.a0.f21526a;
    }
}
