package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f19181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f19179e = i10;
        this.f19181g = j0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f19179e) {
            case 0:
                return new i0(this.f19181g, cVar, 0);
            default:
                return new i0(this.f19181g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f19179e) {
        }
        return ((i0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f19179e) {
            case 0:
                int i10 = this.f19180f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f19180f = 1;
                    Object objB0 = j0.B0(this.f19181g, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i11 = this.f19180f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f19180f = 1;
                    Object objC0 = j0.C0(this.f19181g, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objC0 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }
}
