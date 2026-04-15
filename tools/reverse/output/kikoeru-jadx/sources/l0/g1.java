package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11488e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f11490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11491h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, boolean z10, yb.c cVar) {
        super(2, cVar);
        this.f11491h = l1Var;
        this.f11490g = z10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f11488e) {
            case 0:
                return new g1((l1) this.f11491h, this.f11490g, cVar);
            default:
                return new g1(this.f11490g, (m0.x) this.f11491h, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f11488e) {
        }
        return ((g1) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f11488e) {
            case 0:
                l1 l1Var = (l1) this.f11491h;
                int i10 = this.f11489f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i10 == 0) {
                    ub.a.f(obj);
                    if (t2.k0.b(l1Var.k().f25435b)) {
                        return a0Var;
                    }
                    j2.g1 g1Var = l1Var.f11532h;
                    if (g1Var != null) {
                        j2.f1 f1VarZ = ua.l.Z(ud.e.z(l1Var.k()));
                        this.f11489f = 1;
                        ((j2.h) g1Var).a(f1VarZ);
                        zb.a aVar = zb.a.f26667a;
                        if (a0Var == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                if (!this.f11490g) {
                    return a0Var;
                }
                int iD = t2.k0.d(l1Var.k().f25435b);
                l1Var.f11527c.a(l1.c(l1Var.k().f25434a, t2.c0.b(iD, iD)));
                l1Var.o(h0.i0.f7679a);
                return a0Var;
            default:
                m0.x xVar = (m0.x) this.f11491h;
                int i11 = this.f11489f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    boolean zBooleanValue = ((Boolean) xVar.f13851g.getValue()).booleanValue();
                    boolean z10 = this.f11490g;
                    if (z10 != zBooleanValue) {
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        this.f11489f = 1;
                        Object objR = a.a.r(xVar, boolValueOf, xVar.f13855k.e(), this);
                        zb.a aVar2 = zb.a.f26667a;
                        if (objR == aVar2) {
                            return aVar2;
                        }
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
    public g1(boolean z10, m0.x xVar, yb.c cVar) {
        super(2, cVar);
        this.f11490g = z10;
        this.f11491h = xVar;
    }
}
