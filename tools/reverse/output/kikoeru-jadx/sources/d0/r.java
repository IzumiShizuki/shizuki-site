package d0;

import s.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f5395g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(d dVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f5393e = i10;
        this.f5395g = dVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f5393e) {
            case 0:
                return new r(this.f5395g, cVar, 0);
            case 1:
                return new r(this.f5395g, cVar, 1);
            default:
                return new r(this.f5395g, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f5393e) {
        }
        return ((r) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objF;
        Object objF2;
        int i10 = this.f5393e;
        d dVar = this.f5395g;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                int i11 = this.f5394f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f5394f = 1;
                    float f10 = j0.f5359a;
                    if (dVar.j() - 1 < 0 || (objF = dVar.f(dVar.j() - 1, r.d.q(7, null), this)) != aVar) {
                        objF = a0Var;
                    }
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            case 1:
                int i12 = this.f5394f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    this.f5394f = 1;
                    float f11 = j0.f5359a;
                    if (dVar.j() + 1 >= dVar.l() || (objF2 = dVar.f(dVar.j() + 1, r.d.q(7, null), this)) != aVar) {
                        objF2 = a0Var;
                    }
                    if (objF2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            default:
                int i13 = this.f5394f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    this.f5394f = 1;
                    Object objR = f0.r(dVar, v0.f19292a, new a0.c0(2, null, 14), this);
                    if (objR != aVar) {
                        objR = a0Var;
                    }
                    if (objR == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
        }
    }
}
