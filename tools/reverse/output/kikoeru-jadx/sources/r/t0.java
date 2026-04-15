package r;

import m0.j7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends ac.i implements ic.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f18579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1 f18580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f18581j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Object obj, Object obj2, w0 w0Var, q1 q1Var, float f10, yb.c cVar) {
        super(1, cVar);
        this.f18577f = obj;
        this.f18578g = obj2;
        this.f18579h = w0Var;
        this.f18580i = q1Var;
        this.f18581j = f10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        q1 q1Var = this.f18580i;
        float f10 = this.f18581j;
        return new t0(this.f18577f, this.f18578g, this.f18579h, q1Var, f10, (yb.c) obj).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f18576e;
        if (i10 == 0) {
            ub.a.f(obj);
            j7 j7Var = new j7(this.f18577f, this.f18578g, this.f18579h, this.f18580i, this.f18581j, null);
            this.f18576e = 1;
            Object objK = hf.a0.k(j7Var, this);
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
        return ub.a0.f21526a;
    }
}
