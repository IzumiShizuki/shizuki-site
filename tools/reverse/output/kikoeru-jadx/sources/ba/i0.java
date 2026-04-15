package ba;

import u.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0.d f2385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(d0.d dVar, int i10, yb.c cVar, int i11) {
        super(2, cVar);
        this.f2383e = i11;
        this.f2385g = dVar;
        this.f2386h = i10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2383e) {
            case 0:
                return new i0(this.f2385g, this.f2386h, cVar, 0);
            default:
                return new i0(this.f2385g, this.f2386h, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2383e) {
            case 0:
                return ((i0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((i0) o((k1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f2383e) {
            case 0:
                int i10 = this.f2384f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f2384f = 1;
                    Object objF = this.f2385g.f(this.f2386h, r.d.q(7, null), this);
                    zb.a aVar = zb.a.f26667a;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i11 = this.f2384f;
                ub.a0 a0Var = ub.a0.f21526a;
                d0.d dVar = this.f2385g;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f2384f = 1;
                    Object objH = dVar.f5330w.h(this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objH != aVar2) {
                        objH = a0Var;
                    }
                    if (objH == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                double d10 = 0.0f;
                if (-0.5d > d10 || d10 > 0.5d) {
                    x.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                dVar.s(0.0f, dVar.i(this.f2386h), true);
                return a0Var;
        }
    }
}
