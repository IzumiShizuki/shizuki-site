package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ lf.g f9266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f9268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0 f9269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rf.c f9270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9271k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yb.c cVar, d1 d1Var, d0 d0Var) {
        super(3, cVar);
        this.f9268h = d1Var;
        this.f9269i = d0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        q0 q0Var = new q0((yb.c) obj3, this.f9268h, this.f9269i);
        q0Var.f9266f = (lf.g) obj;
        q0Var.f9267g = obj2;
        return q0Var.u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        lf.g gVar;
        int iIntValue;
        e1 e1Var;
        rf.c cVar;
        lf.o0 o0Var;
        lf.f pVar;
        d0 d0Var = this.f9269i;
        int i10 = this.f9265e;
        ub.a0 a0Var = ub.a0.f21526a;
        d1 d1Var = this.f9268h;
        zb.a aVar = zb.a.f26667a;
        try {
            if (i10 == 0) {
                ub.a.f(obj);
                gVar = this.f9266f;
                iIntValue = ((Number) this.f9267g).intValue();
                e1Var = d1Var.f9082h;
                cVar = e1Var.f9090a;
                this.f9266f = gVar;
                this.f9267g = e1Var;
                this.f9270j = cVar;
                this.f9271k = iIntValue;
                this.f9265e = 1;
                if (cVar.g(this) != aVar) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ub.a.f(obj);
                return a0Var;
            }
            iIntValue = this.f9271k;
            cVar = this.f9270j;
            e1Var = (e1) this.f9267g;
            gVar = this.f9266f;
            ub.a.f(obj);
            c7.e1 e1Var2 = e1Var.f9091b.f9129j;
            if (jc.l.a(e1Var2.w(d0Var), a0.f9029b)) {
                pVar = new n(1, new v[0]);
            } else {
                if (!(e1Var2.w(d0Var) instanceof y)) {
                    e1Var2.Y(d0Var, a0.f9030c);
                }
                cVar.b(null);
                b0.w1 w1Var = (b0.w1) d1Var.f9079e.f1208b;
                int iOrdinal = d0Var.ordinal();
                if (iOrdinal == 1) {
                    o0Var = ((w) w1Var.f1395c).f9347b;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("invalid load type for hints");
                    }
                    o0Var = ((w) w1Var.f1396d).f9347b;
                }
                pVar = new lf.p(new lf.p(o0Var, iIntValue == 0 ? 0 : 1, 0), iIntValue, 2);
            }
            this.f9266f = null;
            this.f9267g = null;
            this.f9270j = null;
            this.f9265e = 2;
            if (gVar instanceof lf.h1) {
                throw ((lf.h1) gVar).f12416a;
            }
            Object objB = pVar.b(gVar, this);
            if (objB != aVar) {
                objB = a0Var;
            }
            return objB == aVar ? aVar : a0Var;
        } finally {
            cVar.b(null);
        }
    }
}
