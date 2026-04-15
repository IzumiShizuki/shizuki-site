package cg;

import hf.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f4112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4111e = i10;
        this.f4112f = vVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f4111e) {
            case 0:
                return new u(this.f4112f, cVar, 0);
            case 1:
                return new u(this.f4112f, cVar, 1);
            default:
                return new u(this.f4112f, cVar, 2);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f4111e) {
            case 0:
                u uVar = (u) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                uVar.u(a0Var);
                return a0Var;
            case 1:
                u uVar2 = (u) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                uVar2.u(a0Var2);
                return a0Var2;
            default:
                u uVar3 = (u) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                uVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f4111e;
        yb.c cVar = null;
        ub.a0 a0Var = ub.a0.f21526a;
        v vVar = this.f4112f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                r1 r1Var = vVar.f4130s;
                if (r1Var == null || !r1Var.b()) {
                    r1 r1Var2 = vVar.f4130s;
                    if (r1Var2 != null) {
                        r1Var2.g(null);
                    }
                    vVar.f4130s = hf.a0.y(androidx.lifecycle.m0.h(vVar), null, null, new q(vVar, cVar, 0), 3);
                }
                break;
            case 1:
                ub.a.f(obj);
                r1 r1Var3 = vVar.f4130s;
                if (r1Var3 != null) {
                    r1Var3.g(null);
                }
                vVar.f4130s = null;
                break;
            default:
                ub.a.f(obj);
                vVar.f4131t.setScaleType(6);
                break;
        }
        return a0Var;
    }
}
