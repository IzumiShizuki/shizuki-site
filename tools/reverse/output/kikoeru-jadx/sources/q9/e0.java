package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f17992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0 f17993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(String str, r0 r0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f17990e = i10;
        this.f17992g = str;
        this.f17993h = r0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f17990e) {
            case 0:
                return new e0(this.f17992g, this.f17993h, cVar, 0);
            default:
                return new e0(this.f17992g, this.f17993h, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f17990e) {
        }
        return ((e0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        Object objQ;
        Object objS;
        switch (this.f17990e) {
            case 0:
                int i10 = this.f17991f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f17991f = 1;
                    objQ = r0.f18084g.q(this.f17992g, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objQ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objQ = ((ub.n) obj).f21546a;
                }
                if (!(objQ instanceof ub.m)) {
                    this.f17993h.x();
                }
                return ub.a0.f21526a;
            default:
                int i11 = this.f17991f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f17991f = 1;
                    objS = r0.f18084g.s(this.f17992g, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objS == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objS = ((ub.n) obj).f21546a;
                }
                if (!(objS instanceof ub.m)) {
                    this.f17993h.x();
                }
                return ub.a0.f21526a;
        }
    }
}
