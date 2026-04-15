package h0;

import u.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2.x f7606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f7607h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(c2.x xVar, c1 c1Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f7604e = i10;
        this.f7606g = xVar;
        this.f7607h = c1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f7604e) {
            case 0:
                return new d0(this.f7606g, this.f7607h, cVar, 0);
            case 1:
                return new d0(this.f7606g, this.f7607h, cVar, 1);
            default:
                return new d0(this.f7606g, this.f7607h, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f7604e) {
        }
        return ((d0) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f7604e) {
            case 0:
                int i10 = this.f7605f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f7605f = 1;
                    Object objN = q0.n(this.f7606g, this.f7607h, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objN == aVar) {
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
                int i11 = this.f7605f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                this.f7605f = 1;
                Object objE = w1.e(this.f7606g, new x0(0, this.f7607h, (yb.c) null), this);
                zb.a aVar2 = zb.a.f26667a;
                if (objE != aVar2) {
                    objE = a0Var;
                }
                return objE == aVar2 ? aVar2 : a0Var;
            default:
                int i12 = this.f7605f;
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                this.f7605f = 1;
                c1 c1Var = this.f7607h;
                Object objF = u.e0.f(this.f7606g, new v0(c1Var, 0), new w0(c1Var, 0), new w0(c1Var, 1), new cg.d(6, c1Var), this);
                zb.a aVar3 = zb.a.f26667a;
                if (objF != aVar3) {
                    objF = a0Var2;
                }
                return objF == aVar3 ? aVar3 : a0Var2;
        }
    }
}
