package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5661i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(m0 m0Var, long j10, boolean z10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5657e = i10;
        this.f5659g = m0Var;
        this.f5660h = j10;
        this.f5661i = z10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5657e) {
            case 0:
                return new c0((m0) this.f5659g, this.f5660h, this.f5661i, cVar, 0);
            case 1:
                return new c0((m0) this.f5659g, this.f5660h, this.f5661i, cVar, 1);
            default:
                return new c0(this.f5661i, (i3.h) this.f5659g, this.f5660h, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5657e) {
        }
        return ((c0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f5657e) {
            case 0:
                int i10 = this.f5658f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                m0 m0Var = (m0) this.f5659g;
                this.f5658f = 1;
                Object objH = m0Var.H(this.f5660h, this, this.f5661i);
                zb.a aVar = zb.a.f26667a;
                return objH == aVar ? aVar : objH;
            case 1:
                int i11 = this.f5658f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                m0 m0Var2 = (m0) this.f5659g;
                this.f5658f = 1;
                Object objG = m0Var2.G(this.f5660h, this, this.f5661i);
                zb.a aVar2 = zb.a.f26667a;
                return objG == aVar2 ? aVar2 : objG;
            default:
                i3.h hVar = (i3.h) this.f5659g;
                int i12 = this.f5658f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    boolean z10 = this.f5661i;
                    zb.a aVar3 = zb.a.f26667a;
                    if (z10) {
                        b2.d dVar = hVar.f8950a;
                        this.f5658f = 2;
                        obj = dVar.a(this.f5660h, 0L, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        ((f3.q) obj).getClass();
                    } else {
                        b2.d dVar2 = hVar.f8950a;
                        this.f5658f = 1;
                        obj = dVar2.a(0L, this.f5660h, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        ((f3.q) obj).getClass();
                    }
                } else if (i12 == 1) {
                    ub.a.f(obj);
                    ((f3.q) obj).getClass();
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    ((f3.q) obj).getClass();
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z10, i3.h hVar, long j10, yb.c cVar) {
        super(2, cVar);
        this.f5657e = 2;
        this.f5661i = z10;
        this.f5659g = hVar;
        this.f5660h = j10;
    }
}
