package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg.p f17998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0 f17999h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(bg.p pVar, r0 r0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f17996e = i10;
        this.f17998g = pVar;
        this.f17999h = r0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f17996e) {
            case 0:
                return new f0(this.f17998g, this.f17999h, cVar, 0);
            case 1:
                return new f0(this.f17998g, this.f17999h, cVar, 1);
            default:
                return new f0(this.f17998g, this.f17999h, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f17996e) {
        }
        return ((f0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        Object objP;
        Object objX;
        Object objP2;
        switch (this.f17996e) {
            case 0:
                int i10 = this.f17997f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f17997f = 1;
                    objP = r0.f18084g.p(this.f17998g, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objP == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objP = ((ub.n) obj).f21546a;
                }
                if (!(objP instanceof ub.m)) {
                    this.f17999h.x();
                }
                return ub.a0.f21526a;
            case 1:
                int i11 = this.f17997f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    String str = this.f17998g.f2937a;
                    this.f17997f = 1;
                    objX = r0.f18084g.x(str, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objX == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objX = ((ub.n) obj).f21546a;
                }
                if (!(objX instanceof ub.m)) {
                    this.f17999h.x();
                }
                return ub.a0.f21526a;
            default:
                int i12 = this.f17997f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    this.f17997f = 1;
                    objP2 = r0.f18084g.p(this.f17998g, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objP2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    objP2 = ((ub.n) obj).f21546a;
                }
                if (!(objP2 instanceof ub.m)) {
                    this.f17999h.x();
                }
                return ub.a0.f21526a;
        }
    }
}
