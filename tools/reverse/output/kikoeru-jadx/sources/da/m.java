package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f5737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5738h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(m0 m0Var, long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5735e = i10;
        this.f5737g = m0Var;
        this.f5738h = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5735e) {
            case 0:
                return new m(this.f5737g, this.f5738h, cVar, 0);
            case 1:
                return new m(this.f5737g, this.f5738h, cVar, 1);
            case 2:
                return new m(this.f5737g, this.f5738h, cVar, 2);
            case 3:
                return new m(this.f5737g, this.f5738h, cVar, 3);
            case 4:
                return new m(this.f5737g, this.f5738h, cVar, 4);
            default:
                return new m(this.f5737g, this.f5738h, cVar, 5);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5735e) {
        }
        return ((m) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        int i10 = this.f5735e;
        long j10 = this.f5738h;
        m0 m0Var = this.f5737g;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                int i11 = this.f5736f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f5736f = 1;
                    if (m0Var.x(j10, this, false) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            case 1:
                int i12 = this.f5736f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    this.f5736f = 1;
                    if (m0Var.x(j10, this, true) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            case 2:
                int i13 = this.f5736f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    this.f5736f = 1;
                    if (m0Var.x(j10, this, true) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            case 3:
                int i14 = this.f5736f;
                if (i14 == 0) {
                    ub.a.f(obj);
                    this.f5736f = 1;
                    if (m0Var.x(j10, this, true) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            case 4:
                int i15 = this.f5736f;
                if (i15 == 0) {
                    ub.a.f(obj);
                    this.f5736f = 1;
                    pf.e eVar = hf.l0.f8566a;
                    Object objH = hf.a0.H(pf.d.f17138c, new b9.a(m0Var, j10, (yb.c) null), this);
                    if (objH != aVar) {
                        objH = a0Var;
                    }
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            default:
                int i16 = this.f5736f;
                if (i16 == 0) {
                    ub.a.f(obj);
                    b bVarZ = m0Var.z();
                    this.f5736f = 1;
                    Object objF0 = m0.f0(bVarZ, "RJ" + j10, this);
                    if (objF0 != aVar) {
                        objF0 = a0Var;
                    }
                    if (objF0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
        }
    }
}
