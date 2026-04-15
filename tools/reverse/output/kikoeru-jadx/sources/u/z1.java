package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f21151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.x f21152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f21155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c2 f21156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ jc.x f21157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f21158l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c2 c2Var, jc.x xVar, long j10, yb.c cVar) {
        super(2, cVar);
        this.f21156j = c2Var;
        this.f21157k = xVar;
        this.f21158l = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        z1 z1Var = new z1(this.f21156j, this.f21157k, this.f21158l, cVar);
        z1Var.f21155i = obj;
        return z1Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((z1) o((a2) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        c2 c2Var;
        jc.x xVar;
        long j10;
        c2 c2Var2;
        int i10 = this.f21154h;
        e1 e1Var = e1.f20883b;
        if (i10 == 0) {
            ub.a.f(obj);
            a2 a2Var = (a2) this.f21155i;
            c2Var = this.f21156j;
            y1 y1Var = new y1(c2Var, a2Var);
            p0 p0Var = c2Var.f20846c;
            jc.x xVar2 = this.f21157k;
            long j11 = xVar2.f10837a;
            e1 e1Var2 = c2Var.f20847d;
            long j12 = this.f21158l;
            float fD = c2Var.d(e1Var2 == e1Var ? f3.q.b(j12) : f3.q.c(j12));
            this.f21155i = c2Var;
            this.f21151e = c2Var;
            this.f21152f = xVar2;
            this.f21153g = j11;
            this.f21154h = 1;
            obj = p0Var.a(y1Var, fD, this);
            zb.a aVar = zb.a.f26667a;
            if (obj == aVar) {
                return aVar;
            }
            xVar = xVar2;
            j10 = j11;
            c2Var2 = c2Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f21153g;
            xVar = this.f21152f;
            c2Var = this.f21151e;
            c2Var2 = (c2) this.f21155i;
            ub.a.f(obj);
        }
        float fD2 = c2Var2.d(((Number) obj).floatValue());
        xVar.f10837a = c2Var.f20847d == e1Var ? f3.q.a(j10, fD2, 0.0f, 2) : f3.q.a(j10, 0.0f, fD2, 1);
        return ub.a0.f21526a;
    }
}
