package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18555e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(m0.x xVar, Object obj, ic.p pVar, yb.c cVar) {
        super(1, cVar);
        this.f18559i = xVar;
        this.f18558h = obj;
        this.f18557g = pVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f18555e) {
            case 0:
                return new r0((q1) this.f18559i, (w0) this.f18557g, this.f18558h, cVar).u(ub.a0.f21526a);
            case 1:
                return new r0((w0) this.f18557g, this.f18558h, (q1) this.f18559i, cVar).u(ub.a0.f21526a);
            default:
                return new r0((m0.x) this.f18559i, this.f18558h, (ic.p) this.f18557g, cVar).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f18555e) {
            case 0:
                q1 q1Var = (q1) this.f18559i;
                int i10 = this.f18556f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    f7.w wVar = new f7.w((w0) this.f18557g, this.f18558h, q1Var, (yb.c) null);
                    this.f18556f = 1;
                    Object objK = hf.a0.k(wVar, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                q1Var.i();
                return ub.a0.f21526a;
            case 1:
                q1 q1Var2 = (q1) this.f18559i;
                w0 w0Var = (w0) this.f18557g;
                int i11 = this.f18556f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    w0Var.H1();
                    x0.e1 e1Var = w0Var.f18604b;
                    w0Var.f18614l = Long.MIN_VALUE;
                    w0Var.K1(0.0f);
                    Object value = w0Var.f18605c.getValue();
                    Object obj2 = this.f18558h;
                    float f10 = obj2.equals(value) ? -4.0f : obj2.equals(e1Var.getValue()) ? -5.0f : -3.0f;
                    q1Var2.p(obj2);
                    q1Var2.n(0L);
                    e1Var.setValue(obj2);
                    w0Var.K1(0.0f);
                    w0Var.x1(obj2);
                    q1Var2.j(f10);
                    if (f10 == -3.0f) {
                        this.f18556f = 1;
                        Object objF1 = w0.F1(w0Var, this);
                        zb.a aVar2 = zb.a.f26667a;
                        if (objF1 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                q1Var2.i();
                return ub.a0.f21526a;
            default:
                m0.x xVar = (m0.x) this.f18559i;
                int i12 = this.f18556f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    xVar.f13856l.setValue(this.f18558h);
                    m0.r rVar = new m0.r(xVar, 4);
                    b0.x xVar2 = new b0.x((ic.p) this.f18557g, xVar, (yb.c) null, 21);
                    this.f18556f = 1;
                    Object objP = a.a.p(rVar, xVar2, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objP == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(w0 w0Var, Object obj, q1 q1Var, yb.c cVar) {
        super(1, cVar);
        this.f18557g = w0Var;
        this.f18558h = obj;
        this.f18559i = q1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q1 q1Var, w0 w0Var, Object obj, yb.c cVar) {
        super(1, cVar);
        this.f18559i = q1Var;
        this.f18557g = w0Var;
        this.f18558h = obj;
    }
}
