package e;

import i7.e0;
import ic.o;
import jc.u;
import ub.a0;
import v0.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, yb.c cVar) {
        super(3, cVar);
        this.f6026e = i10;
        this.f6027f = obj;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f6026e) {
            case 0:
                int i10 = 0;
                i iVar = new i(i10, (u) this.f6027f, (yb.c) obj3);
                a0 a0Var = a0.f21526a;
                iVar.u(a0Var);
                return a0Var;
            case 1:
                int i11 = 1;
                i iVar2 = new i(i11, (e0) this.f6027f, (yb.c) obj3);
                a0 a0Var2 = a0.f21526a;
                iVar2.u(a0Var2);
                return a0Var2;
            default:
                ((Number) obj2).floatValue();
                int i12 = 2;
                i iVar3 = new i(i12, (l0) this.f6027f, (yb.c) obj3);
                a0 a0Var3 = a0.f21526a;
                iVar3.u(a0Var3);
                return a0Var3;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f6026e;
        a0 a0Var = a0.f21526a;
        Object obj2 = this.f6027f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                ((u) obj2).f10834a = true;
                break;
            case 1:
                ub.a.f(obj);
                ((e0) obj2).getClass();
                break;
            default:
                ub.a.f(obj);
                ((l0) obj2).f22265j.b();
                break;
        }
        return a0Var;
    }
}
