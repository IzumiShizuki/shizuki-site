package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ u.i1 f13518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ long f13519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f13520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f13521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n2 f13523k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(boolean z10, float f10, x0.w0 w0Var, x0.n2 n2Var, yb.c cVar) {
        super(3, cVar);
        this.f13520h = z10;
        this.f13521i = f10;
        this.f13522j = w0Var;
        this.f13523k = n2Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j10 = ((p1.b) obj2).f16481a;
        x0.w0 w0Var = this.f13522j;
        x0.n2 n2Var = this.f13523k;
        q6 q6Var = new q6(this.f13520h, this.f13521i, w0Var, n2Var, (yb.c) obj3);
        q6Var.f13518f = (u.i1) obj;
        q6Var.f13519g = j10;
        return q6Var.u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        float fIntBitsToFloat;
        int i10 = this.f13517e;
        x0.w0 w0Var = this.f13522j;
        try {
            if (i10 == 0) {
                ub.a.f(obj);
                u.i1 i1Var = this.f13518f;
                long j10 = this.f13519g;
                if (this.f13520h) {
                    fIntBitsToFloat = this.f13521i - Float.intBitsToFloat((int) (j10 >> 32));
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                }
                w0Var.setValue(new Float(fIntBitsToFloat - ((Number) this.f13523k.getValue()).floatValue()));
                this.f13517e = 1;
                Object objB = i1Var.b(this);
                zb.a aVar = zb.a.f26667a;
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ub.a.f(obj);
            }
        } catch (u.t0 unused) {
            w0Var.setValue(new Float(0.0f));
        }
        return ub.a0.f21526a;
    }
}
