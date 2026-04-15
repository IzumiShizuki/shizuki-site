package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f21005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f21006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f21007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(n0 n0Var, long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f21003e = i10;
        this.f21006h = n0Var;
        this.f21007i = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21003e) {
            case 0:
                m0 m0Var = new m0(this.f21006h, this.f21007i, cVar, 0);
                m0Var.f21005g = obj;
                return m0Var;
            default:
                m0 m0Var2 = new m0(this.f21006h, this.f21007i, cVar, 1);
                m0Var2.f21005g = obj;
                return m0Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f21003e) {
        }
        return ((m0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f21003e;
        ub.a0 a0Var = ub.a0.f21526a;
        long j10 = this.f21007i;
        zb.a aVar = zb.a.f26667a;
        n0 n0Var = this.f21006h;
        switch (i10) {
            case 0:
                int i11 = this.f21004f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                hf.y yVar = (hf.y) this.f21005g;
                ic.o oVar = n0Var.B;
                p1.b bVar = new p1.b(j10);
                this.f21004f = 1;
                return oVar.g(yVar, bVar, this) == aVar ? aVar : a0Var;
            default:
                int i12 = this.f21004f;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                hf.y yVar2 = (hf.y) this.f21005g;
                ic.o oVar2 = n0Var.C;
                long jF = f3.q.f(n0Var.D ? -1.0f : 1.0f, j10);
                e1 e1Var = n0Var.f21014z;
                i7.k kVar = l0.f20995a;
                Float f10 = new Float(e1Var == e1.f20882a ? f3.q.c(jF) : f3.q.b(jF));
                this.f21004f = 1;
                return oVar2.g(yVar2, f10, this) == aVar ? aVar : a0Var;
        }
    }
}
