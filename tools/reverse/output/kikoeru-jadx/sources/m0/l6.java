package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a6 f13242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f13243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f13245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ic.a f13246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(a6 a6Var, float f10, float f11, float f12, ic.a aVar, yb.c cVar) {
        super(2, cVar);
        this.f13242f = a6Var;
        this.f13243g = f10;
        this.f13244h = f11;
        this.f13245i = f12;
        this.f13246j = aVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new l6(this.f13242f, this.f13243g, this.f13244h, this.f13245i, this.f13246j, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((l6) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f13241e;
        ub.a0 a0Var = ub.a0.f21526a;
        if (i10 == 0) {
            ub.a.f(obj);
            this.f13241e = 1;
            float f10 = t6.f13667a;
            o6 o6Var = new o6(this.f13243g, this.f13244h, this.f13245i, null);
            Object objD = this.f13242f.d(s.v0.f19292a, o6Var, this);
            zb.a aVar = zb.a.f26667a;
            if (objD != aVar) {
                objD = a0Var;
            }
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        ic.a aVar2 = this.f13246j;
        if (aVar2 != null) {
            aVar2.b();
        }
        return a0Var;
    }
}
