package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ float f13259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, float f10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f13257e = i10;
        this.f13260h = obj;
        this.f13259g = f10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13257e) {
            case 0:
                return new m((x) this.f13260h, this.f13259g, cVar, 0);
            case 1:
                return new m((c2) this.f13260h, this.f13259g, cVar, 1);
            case 2:
                m mVar = new m((p2.c) this.f13260h, cVar);
                mVar.f13259g = ((Number) obj).floatValue();
                return mVar;
            default:
                return new m((t0.j) this.f13260h, this.f13259g, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13257e) {
            case 0:
                return ((m) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((m) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 2:
                return ((m) o(Float.valueOf(((Number) obj).floatValue()), (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((m) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f13257e) {
            case 0:
                int i10 = this.f13258f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    x xVar = (x) this.f13260h;
                    float f10 = this.f13259g;
                    this.f13258f = 1;
                    Object objH = xVar.h(f10, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objH == aVar) {
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
                int i11 = this.f13258f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                c2 c2Var = (c2) this.f13260h;
                float f11 = this.f13259g;
                this.f13258f = 1;
                Object objB = c2Var.f12783j.b(new n7(c2Var, f11), this);
                zb.a aVar2 = zb.a.f26667a;
                if (objB != aVar2) {
                    objB = a0Var;
                }
                return objB == aVar2 ? aVar2 : a0Var;
            case 2:
                p2.c cVar = (p2.c) this.f13260h;
                int i12 = this.f13258f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    float f12 = this.f13259g;
                    Object objG = cVar.f16507a.f17639d.f17630a.g(q2.j.f17608e);
                    if (objG == null) {
                        objG = null;
                    }
                    ic.n nVar = (ic.n) objG;
                    if (nVar == null) {
                        throw j2.h0.g("Required value was null.");
                    }
                    p1.b bVar = new p1.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
                    this.f13258f = 1;
                    obj = nVar.q(bVar, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((p1.b) obj).f16481a & 4294967295L)));
            default:
                int i13 = this.f13258f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    t0.j jVar = (t0.j) this.f13260h;
                    s.y0 y0Var = jVar.f20131i;
                    t0.i iVar = new t0.i(jVar, this.f13259g, null);
                    this.f13258f = 1;
                    y0Var.getClass();
                    Object objK = hf.a0.k(new ea.f(s.v0.f19292a, y0Var, iVar, null, 5), this);
                    zb.a aVar4 = zb.a.f26667a;
                    if (objK == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p2.c cVar, yb.c cVar2) {
        super(2, cVar2);
        this.f13257e = 2;
        this.f13260h = cVar;
    }
}
