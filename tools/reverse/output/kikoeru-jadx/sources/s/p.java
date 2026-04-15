package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ u.i1 f19251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long f19252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f19253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(d dVar, yb.c cVar, int i10) {
        super(3, cVar);
        this.f19249e = i10;
        this.f19253i = dVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        u.i1 i1Var = (u.i1) obj;
        p1.b bVar = (p1.b) obj2;
        switch (this.f19249e) {
            case 0:
                long j10 = bVar.f16481a;
                p pVar = new p((q) this.f19253i, (yb.c) obj3, 0);
                pVar.f19251g = i1Var;
                pVar.f19252h = j10;
                return pVar.u(ub.a0.f21526a);
            default:
                long j11 = bVar.f16481a;
                p pVar2 = new p((w) this.f19253i, (yb.c) obj3, 1);
                pVar2.f19251g = i1Var;
                pVar2.f19252h = j11;
                return pVar2.u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objK;
        Object objK2;
        switch (this.f19249e) {
            case 0:
                int i10 = this.f19250f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                u.i1 i1Var = this.f19251g;
                long j10 = this.f19252h;
                q qVar = (q) this.f19253i;
                if (!qVar.f19123u) {
                    return a0Var;
                }
                this.f19250f = 1;
                w.k kVar = qVar.f19119q;
                zb.a aVar = zb.a.f26667a;
                if (kVar == null || (objK = hf.a0.k(new a(i1Var, j10, kVar, qVar, null), this)) != aVar) {
                    objK = a0Var;
                }
                return objK == aVar ? aVar : a0Var;
            default:
                int i11 = this.f19250f;
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                u.i1 i1Var2 = this.f19251g;
                long j11 = this.f19252h;
                w wVar = (w) this.f19253i;
                if (!wVar.f19123u) {
                    return a0Var2;
                }
                this.f19250f = 1;
                w.k kVar2 = wVar.f19119q;
                zb.a aVar2 = zb.a.f26667a;
                if (kVar2 == null || (objK2 = hf.a0.k(new a(i1Var2, j11, kVar2, wVar, null), this)) != aVar2) {
                    objK2 = a0Var2;
                }
                return objK2 == aVar2 ? aVar2 : a0Var2;
        }
    }
}
