package cg;

import hf.r1;
import u.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f4100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v vVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4097e = i10;
        this.f4100h = vVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f4097e) {
            case 0:
                q qVar = new q(this.f4100h, cVar, 0);
                qVar.f4099g = obj;
                return qVar;
            case 1:
                q qVar2 = new q(this.f4100h, cVar, 1);
                qVar2.f4099g = obj;
                return qVar2;
            default:
                q qVar3 = new q(this.f4100h, cVar, 2);
                qVar3.f4099g = obj;
                return qVar3;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f4097e) {
            case 0:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            case 1:
                return ((q) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
            default:
                return ((q) o((c2.x) obj, (yb.c) obj2)).u(ub.a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        hf.y yVar;
        hf.y yVar2;
        r1 r1Var;
        int i10 = this.f4097e;
        v vVar = this.f4100h;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        switch (i10) {
            case 0:
                int i11 = this.f4098f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    yVar = (hf.y) this.f4099g;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (hf.y) this.f4099g;
                    ub.a.f(obj);
                }
                while (hf.a0.v(yVar)) {
                    vVar.Y();
                    this.f4099g = yVar;
                    this.f4098f = 1;
                    if (hf.a0.l(1000L, this) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            case 1:
                int i12 = this.f4098f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    yVar2 = (hf.y) this.f4099g;
                    this.f4099g = yVar2;
                    this.f4098f = 1;
                    if (hf.a0.l(4000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar2 = (hf.y) this.f4099g;
                    ub.a.f(obj);
                }
                if (hf.a0.v(yVar2) && (r1Var = vVar.f4129r) != null && r1Var.b()) {
                    vVar.f4116e.setValue(Boolean.FALSE);
                }
                return a0Var;
            default:
                int i13 = this.f4098f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    c2.x xVar = (c2.x) this.f4099g;
                    b0 b0Var = new b0(vVar, 5);
                    y yVar3 = new y(vVar, 3);
                    y yVar4 = new y(vVar, 4);
                    this.f4098f = 1;
                    float f10 = u.e0.f20881a;
                    Object objE = w1.e(xVar, new d0.g(b0Var, yVar3, yVar4, null, 3), this);
                    if (objE != aVar) {
                        objE = a0Var;
                    }
                    if (objE == aVar) {
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
