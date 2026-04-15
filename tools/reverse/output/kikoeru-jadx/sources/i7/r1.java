package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Object obj, Object obj2, yb.c cVar, int i10) {
        super(1, cVar);
        this.f9287e = i10;
        this.f9289g = obj;
        this.f9290h = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ac.i, ic.k] */
    @Override // ic.k
    public final Object a(Object obj) {
        yb.c cVar = (yb.c) obj;
        switch (this.f9287e) {
            case 0:
                return new r1((j7.a) this.f9289g, (l1) this.f9290h, cVar, 0).u(ub.a0.f21526a);
            case 1:
                return new r1((lf.g) this.f9289g, (jc.y) this.f9290h, cVar, 1).u(ub.a0.f21526a);
            case 2:
                return new r1((m0.x) this.f9289g, (ic.o) this.f9290h, cVar, 2).u(ub.a0.f21526a);
            default:
                return new r1((n7.v) this.f9289g, (ac.i) this.f9290h, cVar).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v17, types: [ac.i, ic.k] */
    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f9287e) {
            case 0:
                l1 l1Var = (l1) this.f9290h;
                j7.a aVar = (j7.a) this.f9289g;
                int i10 = this.f9288f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    r2 r2Var = l1Var.f9194b;
                    r2 r2Var2 = aVar.f10581c;
                    aVar.f10581c = r2Var;
                    if (r2Var2 instanceof q1) {
                        q1 q1Var = (q1) r2Var2;
                        if (q1Var.f9272a) {
                            r2Var.b();
                        }
                        if (q1Var.f9273b) {
                            r2Var.Q();
                        }
                    }
                    lf.f fVar = l1Var.f9193a;
                    s0 s0Var = new s0(1, aVar, l1Var);
                    this.f9288f = 1;
                    Object objB = fVar.b(s0Var, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 1:
                jc.y yVar = (jc.y) this.f9290h;
                int i11 = this.f9288f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    lf.g gVar = (lf.g) this.f9289g;
                    app.nekogram.translator.r rVar = mf.c.f15133b;
                    Object obj2 = yVar.f10838a;
                    if (obj2 == rVar) {
                        obj2 = null;
                    }
                    this.f9288f = 1;
                    Object objN = gVar.n(obj2, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objN == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                yVar.f10838a = null;
                return ub.a0.f21526a;
            case 2:
                int i12 = this.f9288f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    m0.x xVar = (m0.x) this.f9289g;
                    m0.r rVar2 = new m0.r(xVar, 3);
                    b0.x xVar2 = new b0.x((ic.o) this.f9290h, xVar, (yb.c) null, 20);
                    this.f9288f = 1;
                    Object objP = a.a.p(rVar2, xVar2, this);
                    zb.a aVar4 = zb.a.f26667a;
                    if (objP == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                n7.v vVar = (n7.v) this.f9289g;
                int i13 = this.f9288f;
                try {
                    if (i13 == 0) {
                        ub.a.f(obj);
                        vVar.a();
                        vVar.a();
                        a8.a writableDatabase = vVar.g().getWritableDatabase();
                        if (!writableDatabase.T()) {
                            nd.h.t(new n7.j(vVar.f(), null, 1));
                        }
                        if (writableDatabase.U()) {
                            writableDatabase.C();
                        } else {
                            writableDatabase.h();
                        }
                        ?? r72 = (ac.i) this.f9290h;
                        this.f9288f = 1;
                        obj = r72.a(this);
                        zb.a aVar5 = zb.a.f26667a;
                        if (obj == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ub.a.f(obj);
                    }
                    vVar.g().getWritableDatabase().A();
                    vVar.l();
                    return obj;
                } catch (Throwable th2) {
                    vVar.l();
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(n7.v vVar, ic.k kVar, yb.c cVar) {
        super(1, cVar);
        this.f9287e = 3;
        this.f9289g = vVar;
        this.f9290h = (ac.i) kVar;
    }
}
