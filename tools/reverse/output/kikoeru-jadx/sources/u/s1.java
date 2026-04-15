package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u1 f21082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long f21083h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(u1 u1Var, long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f21080e = i10;
        this.f21082g = u1Var;
        this.f21083h = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21080e) {
            case 0:
                return new s1(this.f21082g, this.f21083h, cVar, 0);
            case 1:
                return new s1(this.f21082g, this.f21083h, cVar, 1);
            case 2:
                return new s1(this.f21082g, this.f21083h, cVar, 2);
            default:
                s1 s1Var = new s1(this.f21082g, cVar);
                s1Var.f21083h = ((p1.b) obj).f16481a;
                return s1Var;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f21080e) {
            case 0:
                return ((s1) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((s1) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((s1) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                long j10 = ((p1.b) obj).f16481a;
                s1 s1Var = new s1(this.f21082g, (yb.c) obj2);
                s1Var.f21083h = j10;
                return s1Var.u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f21080e) {
            case 0:
                int i10 = this.f21081f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    c2 c2Var = this.f21082g.D;
                    long j10 = this.f21083h;
                    this.f21081f = 1;
                    Object objC = c2Var.c(j10, false, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 1:
                int i11 = this.f21081f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    c2 c2Var2 = this.f21082g.D;
                    b9.c cVar = new b9.c(this.f21083h, null, 1);
                    this.f21081f = 1;
                    Object objF = c2Var2.f(s.v0.f19293b, cVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 2:
                int i12 = this.f21081f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    c2 c2Var3 = this.f21082g.D;
                    long j11 = this.f21083h;
                    this.f21081f = 1;
                    Object objC2 = c2Var3.c(j11, true, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objC2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i13 = this.f21081f;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                long j12 = this.f21083h;
                c2 c2Var4 = this.f21082g.D;
                this.f21081f = 1;
                Object objA = androidx.compose.foundation.gestures.a.a(c2Var4, j12, this);
                zb.a aVar4 = zb.a.f26667a;
                return objA == aVar4 ? aVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(u1 u1Var, yb.c cVar) {
        super(2, cVar);
        this.f21080e = 3;
        this.f21082g = u1Var;
    }
}
