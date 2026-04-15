package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w.k f13266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h1.s f13267h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(w.k kVar, h1.s sVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f13264e = i10;
        this.f13266g = kVar;
        this.f13267h = sVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13264e) {
            case 0:
                return new m1(this.f13266g, this.f13267h, cVar, 0);
            case 1:
                return new m1(this.f13266g, this.f13267h, cVar, 1);
            case 2:
                return new m1(this.f13266g, this.f13267h, cVar, 2);
            default:
                return new m1(this.f13266g, this.f13267h, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f13264e) {
        }
        return ((m1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f13264e) {
            case 0:
                int i10 = this.f13265f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return ub.a0.f21526a;
                }
                ub.a.f(obj);
                lf.o0 o0Var = this.f13266g.f22978a;
                l1 l1Var = new l1(this.f13267h, 0);
                this.f13265f = 1;
                o0Var.getClass();
                lf.o0.m(o0Var, l1Var, this);
                return zb.a.f26667a;
            case 1:
                int i11 = this.f13265f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return ub.a0.f21526a;
                }
                ub.a.f(obj);
                lf.o0 o0Var2 = this.f13266g.f22978a;
                l1 l1Var2 = new l1(this.f13267h, 1);
                this.f13265f = 1;
                o0Var2.getClass();
                lf.o0.m(o0Var2, l1Var2, this);
                return zb.a.f26667a;
            case 2:
                int i12 = this.f13265f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return ub.a0.f21526a;
                }
                ub.a.f(obj);
                lf.o0 o0Var3 = this.f13266g.f22978a;
                l1 l1Var3 = new l1(this.f13267h, 2);
                this.f13265f = 1;
                o0Var3.getClass();
                lf.o0.m(o0Var3, l1Var3, this);
                return zb.a.f26667a;
            default:
                int i13 = this.f13265f;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return ub.a0.f21526a;
                }
                ub.a.f(obj);
                lf.o0 o0Var4 = this.f13266g.f22978a;
                l1 l1Var4 = new l1(this.f13267h, 3);
                this.f13265f = 1;
                o0Var4.getClass();
                lf.o0.m(o0Var4, l1Var4, this);
                return zb.a.f26667a;
        }
    }
}
