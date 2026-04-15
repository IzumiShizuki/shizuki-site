package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f9181e = i11;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f9181e) {
            case 0:
                k kVar = new k(3, (yb.c) obj3, 0);
                ub.a0 a0Var = ub.a0.f21526a;
                kVar.u(a0Var);
                return a0Var;
            case 1:
                long j10 = ((p1.b) obj2).f16481a;
                k kVar2 = new k(3, (yb.c) obj3, 1);
                ub.a0 a0Var2 = ub.a0.f21526a;
                kVar2.u(a0Var2);
                return a0Var2;
            case 2:
                ((Number) obj2).floatValue();
                k kVar3 = new k(3, (yb.c) obj3, 2);
                ub.a0 a0Var3 = ub.a0.f21526a;
                kVar3.u(a0Var3);
                return a0Var3;
            default:
                long j11 = ((p1.b) obj2).f16481a;
                k kVar4 = new k(3, (yb.c) obj3, 3);
                ub.a0 a0Var4 = ub.a0.f21526a;
                kVar4.u(a0Var4);
                return a0Var4;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f9181e;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                break;
            case 1:
                ub.a.f(obj);
                break;
            case 2:
                ub.a.f(obj);
                break;
            default:
                ub.a.f(obj);
                break;
        }
        return a0Var;
    }
}
