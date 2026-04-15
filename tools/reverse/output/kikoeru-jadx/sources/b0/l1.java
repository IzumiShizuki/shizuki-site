package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1292e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(int i10, j9.f fVar, yb.c cVar) {
        super(2, cVar);
        j9.u uVar = j9.u.f10753a;
        this.f1294g = i10;
        this.f1295h = fVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        int i10 = this.f1292e;
        Object obj2 = this.f1295h;
        int i11 = this.f1294g;
        switch (i10) {
            case 0:
                return new l1((m1) obj2, i11, cVar);
            default:
                j9.u uVar = j9.u.f10753a;
                return new l1(i11, (j9.f) obj2, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f1292e) {
        }
        return ((l1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objB;
        switch (this.f1292e) {
            case 0:
                int i10 = this.f1293f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    i1 i1Var = ((m1) this.f1295h).f1304p;
                    this.f1293f = 1;
                    Object objF = i1Var.f(this.f1294g, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objF == aVar) {
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
                int i11 = this.f1293f;
                ub.a0 a0Var = ub.a0.f21526a;
                try {
                    if (i11 == 0) {
                        ub.a.f(obj);
                        j9.u uVar = j9.u.f10753a;
                        int i12 = this.f1294g;
                        j9.f fVar = (j9.f) this.f1295h;
                        this.f1293f = 1;
                        Object objH = uVar.h(i12, fVar, this);
                        zb.a aVar2 = zb.a.f26667a;
                        if (objH == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ub.a.f(obj);
                    }
                    objB = a0Var;
                    break;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = ub.n.a(objB);
                if (thA == null) {
                    return a0Var;
                }
                thA.printStackTrace();
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, int i10, yb.c cVar) {
        super(2, cVar);
        this.f1295h = m1Var;
        this.f1294g = i10;
    }
}
