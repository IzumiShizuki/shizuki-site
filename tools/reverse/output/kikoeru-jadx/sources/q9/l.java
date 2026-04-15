package q9;

import m0.t2;
import m0.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f18037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r0 r0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f18035e = i10;
        this.f18037g = r0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f18035e) {
            case 0:
                return new l(this.f18037g, cVar, 0);
            case 1:
                return new l(this.f18037g, cVar, 1);
            case 2:
                return new l(this.f18037g, cVar, 2);
            case 3:
                return new l(this.f18037g, cVar, 3);
            default:
                return new l(this.f18037g, cVar, 4);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f18035e) {
        }
        return ((l) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f18035e) {
            case 0:
                int i10 = this.f18036f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                t2 t2Var = this.f18037g.f18085b;
                this.f18036f = 1;
                m0.x xVar = t2Var.f13649a;
                Object objR = a.a.r(xVar, u2.f13691b, xVar.f13855k.e(), this);
                zb.a aVar = zb.a.f26667a;
                if (objR != aVar) {
                    objR = a0Var;
                }
                return objR == aVar ? aVar : a0Var;
            case 1:
                int i11 = this.f18036f;
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                t2 t2Var2 = this.f18037g.f18085b;
                this.f18036f = 1;
                m0.x xVar2 = t2Var2.f13649a;
                Object objR2 = a.a.r(xVar2, u2.f13691b, xVar2.f13855k.e(), this);
                zb.a aVar2 = zb.a.f26667a;
                if (objR2 != aVar2) {
                    objR2 = a0Var2;
                }
                return objR2 == aVar2 ? aVar2 : a0Var2;
            case 2:
                int i12 = this.f18036f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    t2 t2Var3 = this.f18037g.f18085b;
                    this.f18036f = 1;
                    Object objA = t2Var3.a(this);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 3:
                int i13 = this.f18036f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    t2 t2Var4 = this.f18037g.f18085b;
                    this.f18036f = 1;
                    Object objA2 = t2Var4.a(this);
                    zb.a aVar4 = zb.a.f26667a;
                    if (objA2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                int i14 = this.f18036f;
                if (i14 == 0) {
                    ub.a.f(obj);
                    t2 t2Var5 = this.f18037g.f18085b;
                    this.f18036f = 1;
                    Object objA3 = t2Var5.a(this);
                    zb.a aVar5 = zb.a.f26667a;
                    if (objA3 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
        }
    }
}
