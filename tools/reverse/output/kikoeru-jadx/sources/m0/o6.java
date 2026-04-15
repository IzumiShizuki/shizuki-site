package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f13400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f13402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(float f10, float f11, float f12, yb.c cVar) {
        super(2, cVar);
        this.f13400g = f10;
        this.f13401h = f11;
        this.f13402i = f12;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        o6 o6Var = new o6(this.f13400g, this.f13401h, this.f13402i, cVar);
        o6Var.f13399f = obj;
        return o6Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((o6) o((v) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f13398e;
        if (i10 == 0) {
            ub.a.f(obj);
            v vVar = (v) this.f13399f;
            jc.v vVar2 = new jc.v();
            float f10 = this.f13400g;
            vVar2.f10835a = f10;
            r.c cVarA = r.d.a(f10);
            Float f11 = new Float(this.f13401h);
            r.u1 u1Var = t6.f13673g;
            Float f12 = new Float(this.f13402i);
            n6 n6Var = new n6(vVar, vVar2, 0);
            this.f13398e = 1;
            Object objC = cVarA.c(f11, u1Var, f12, n6Var, this);
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
    }
}
