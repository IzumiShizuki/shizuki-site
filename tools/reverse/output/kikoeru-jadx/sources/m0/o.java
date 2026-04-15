package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.i implements ic.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ u f13366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ a4 f13367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f13369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f13370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, float f10, yb.c cVar) {
        super(4, cVar);
        this.f13369i = xVar;
        this.f13370j = f10;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        o oVar = new o(this.f13369i, this.f13370j, (yb.c) obj4);
        oVar.f13366f = (u) obj;
        oVar.f13367g = (a4) obj2;
        oVar.f13368h = obj3;
        return oVar.u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f13365e;
        if (i10 == 0) {
            ub.a.f(obj);
            u uVar = this.f13366f;
            float fC = this.f13367g.c(this.f13368h);
            if (!Float.isNaN(fC)) {
                jc.v vVar = new jc.v();
                x xVar = this.f13369i;
                float fE = Float.isNaN(xVar.f13854j.e()) ? 0.0f : xVar.f13854j.e();
                vVar.f10835a = fE;
                r.j jVar = xVar.f13847c;
                ba.h0 h0Var = new ba.h0(13, uVar, vVar);
                this.f13366f = null;
                this.f13367g = null;
                this.f13365e = 1;
                Object objC = r.d.c(fE, fC, this.f13370j, jVar, h0Var, this);
                zb.a aVar = zb.a.f26667a;
                if (objC == aVar) {
                    return aVar;
                }
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
