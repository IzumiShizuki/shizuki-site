package a0;

import s.v0;
import u.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f26f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, int i10, yb.c cVar) {
        super(2, cVar);
        this.f26f = g0Var;
        this.f27g = i10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f25e) {
            case 0:
                return new d0(this.f26f, cVar);
            default:
                return new d0(this.f26f, this.f27g, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f25e) {
            case 0:
                return ((d0) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                d0 d0Var = (d0) o((k1) obj, (yb.c) obj2);
                ub.a0 a0Var = ub.a0.f21526a;
                d0Var.u(a0Var);
                return a0Var;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f25e) {
            case 0:
                int i10 = this.f27g;
                if (i10 == 0) {
                    ub.a.f(obj);
                    c0 c0Var = new c0(2, null, 0);
                    this.f27g = 1;
                    Object objB = this.f26f.b(v0.f19292a, c0Var, this);
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
                return ub.a0.f21526a;
            default:
                ub.a.f(obj);
                this.f26f.i(this.f27g, 0, true);
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, yb.c cVar) {
        super(2, cVar);
        this.f26f = g0Var;
    }
}
