package m0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p4 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i7.p2 f13450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4(i7.p2 p2Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f13448e = i10;
        this.f13450g = p2Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13448e) {
            case 0:
                return new p4(this.f13450g, cVar, 0);
            case 1:
                return new p4(this.f13450g, cVar, 1);
            case 2:
                return new p4(this.f13450g, cVar, 2);
            default:
                return new p4(this.f13450g, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f13448e) {
        }
        return ((p4) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objJ;
        Object objJ2;
        switch (this.f13448e) {
            case 0:
                int i10 = this.f13449f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f13449f = 1;
                    Object objX = this.f13450g.x(this);
                    zb.a aVar = zb.a.f26667a;
                    if (objX == aVar) {
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
                int i11 = this.f13449f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    this.f13449f = 1;
                    Object objX2 = this.f13450g.x(this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objX2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            case 2:
                int i12 = this.f13449f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                this.f13449f = 1;
                i7.p2 p2Var = this.f13450g;
                Map map = ((x) p2Var.f9258a).d().f12652a;
                r4 r4Var = r4.f13549b;
                boolean zContainsKey = map.containsKey(r4Var);
                zb.a aVar3 = zb.a.f26667a;
                if (!zContainsKey || (objJ = i7.p2.j(p2Var, r4Var, this)) != aVar3) {
                    objJ = a0Var;
                }
                return objJ == aVar3 ? aVar3 : a0Var;
            default:
                int i13 = this.f13449f;
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var2;
                }
                ub.a.f(obj);
                this.f13449f = 1;
                i7.p2 p2Var2 = this.f13450g;
                Map map2 = ((x) p2Var2.f9258a).d().f12652a;
                r4 r4Var2 = r4.f13550c;
                boolean zContainsKey2 = map2.containsKey(r4Var2);
                zb.a aVar4 = zb.a.f26667a;
                if (!zContainsKey2 || (objJ2 = i7.p2.j(p2Var2, r4Var2, this)) != aVar4) {
                    objJ2 = a0Var2;
                }
                return objJ2 == aVar4 ? aVar4 : a0Var2;
        }
    }
}
