package q9;

import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f18024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0 f18025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f18026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o oVar, r0 r0Var, w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f18022e = i10;
        this.f18024g = oVar;
        this.f18025h = r0Var;
        this.f18026i = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f18022e) {
            case 0:
                return new j(this.f18024g, this.f18025h, this.f18026i, cVar, 0);
            default:
                return new j(this.f18024g, this.f18025h, this.f18026i, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f18022e) {
        }
        return ((j) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f18022e) {
            case 0:
                int i10 = this.f18023f;
                w0 w0Var = this.f18026i;
                if (i10 == 0) {
                    ub.a.f(obj);
                    w0Var.setValue(Boolean.TRUE);
                    this.f18024g.w(this.f18025h.w(), true);
                    this.f18023f = 1;
                    Object objL = hf.a0.l(1000L, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                w0Var.setValue(Boolean.FALSE);
                return ub.a0.f21526a;
            default:
                int i11 = this.f18023f;
                w0 w0Var2 = this.f18026i;
                if (i11 == 0) {
                    ub.a.f(obj);
                    w0Var2.setValue(Boolean.TRUE);
                    this.f18024g.w(this.f18025h.w(), true);
                    this.f18023f = 1;
                    Object objL2 = hf.a0.l(1000L, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objL2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                w0Var2.setValue(Boolean.FALSE);
                return ub.a0.f21526a;
        }
    }
}
