package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l7 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13247e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.j f13251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13252j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(float f10, r.j jVar, jc.v vVar, yb.c cVar) {
        super(2, cVar);
        this.f13250h = f10;
        this.f13251i = jVar;
        this.f13252j = vVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13247e) {
            case 0:
                l7 l7Var = new l7((c2) this.f13252j, this.f13250h, this.f13251i, cVar);
                l7Var.f13249g = obj;
                return l7Var;
            default:
                l7 l7Var2 = new l7(this.f13250h, this.f13251i, (jc.v) this.f13252j, cVar);
                l7Var2.f13249g = obj;
                return l7Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13247e) {
            case 0:
                return ((l7) o((v) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((l7) o((u.k1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f13247e) {
            case 0:
                c2 c2Var = (c2) this.f13252j;
                x0.e1 e1Var = c2Var.f12777d;
                x0.e1 e1Var2 = c2Var.f12781h;
                int i10 = this.f13248f;
                try {
                    if (i10 == 0) {
                        ub.a.f(obj);
                        v vVar = (v) this.f13249g;
                        jc.v vVar2 = new jc.v();
                        vVar2.f10835a = c2Var.f12780g.e();
                        float f10 = this.f13250h;
                        e1Var2.setValue(new Float(f10));
                        e1Var.setValue(Boolean.TRUE);
                        r.c cVarA = r.d.a(vVar2.f10835a);
                        Float f11 = new Float(f10);
                        r.j jVar = this.f13251i;
                        n6 n6Var = new n6(vVar, vVar2, 1);
                        this.f13248f = 1;
                        obj = r.c.d(cVarA, f11, jVar, n6Var, this, 4);
                        zb.a aVar = zb.a.f26667a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ub.a.f(obj);
                    }
                    e1Var2.setValue(null);
                    e1Var.setValue(Boolean.FALSE);
                    return ub.a0.f21526a;
                } catch (Throwable th2) {
                    e1Var2.setValue(null);
                    e1Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            default:
                int i11 = this.f13248f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    int i12 = 18;
                    b0.i0 i0Var = new b0.i0(i12, (jc.v) this.f13252j, (u.k1) this.f13249g);
                    this.f13248f = 1;
                    Object objE = r.d.e(0.0f, this.f13250h, this.f13251i, i0Var, this, 4);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(c2 c2Var, float f10, r.j jVar, yb.c cVar) {
        super(2, cVar);
        this.f13252j = c2Var;
        this.f13250h = f10;
        this.f13251i = jVar;
    }
}
