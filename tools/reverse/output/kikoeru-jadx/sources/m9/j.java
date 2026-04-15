package m9;

import hf.y;
import lf.p0;
import lf.s;
import ub.a0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f15029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f15030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(c cVar, w0 w0Var, yb.c cVar2, int i10) {
        super(2, cVar2);
        this.f15027e = i10;
        this.f15030h = cVar;
        this.f15029g = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15027e) {
            case 0:
                return new j(this.f15030h, this.f15029g, cVar, 0);
            case 1:
                return new j(this.f15029g, this.f15030h, cVar);
            default:
                return new j(this.f15030h, this.f15029g, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f15027e) {
        }
        return ((j) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f15027e) {
            case 0:
                int i10 = this.f15028f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    String str = (String) this.f15029g.getValue();
                    this.f15028f = 1;
                    Object objW = this.f15030h.w(str, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objW == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            case 1:
                int i11 = this.f15028f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    w0 w0Var = this.f15029g;
                    i7.n nVarB = v.B(new aa.f(w0Var, 27));
                    c cVar = this.f15030h;
                    i7.n nVar = new i7.n(3, new i7.n(4, new lf.k(new g1.d(23), new s(nVarB, cVar, 3), null)));
                    j jVar = new j(cVar, w0Var, null, 0);
                    this.f15028f = 1;
                    Object objH = p0.h(nVar, jVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objH == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            default:
                int i12 = this.f15028f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    String str2 = (String) this.f15029g.getValue();
                    this.f15028f = 1;
                    Object objW2 = this.f15030h.w(str2, this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objW2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w0 w0Var, c cVar, yb.c cVar2) {
        super(2, cVar2);
        this.f15027e = 1;
        this.f15029g = w0Var;
        this.f15030h = cVar;
    }
}
