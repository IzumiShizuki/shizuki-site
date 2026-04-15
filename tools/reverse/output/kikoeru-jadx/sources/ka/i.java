package ka;

import hf.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f11267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(g gVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f11266e = i10;
        this.f11267f = gVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f11266e) {
            case 0:
                return new i(this.f11267f, cVar, 0);
            default:
                return new i(this.f11267f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f11266e) {
            case 0:
                i iVar = (i) o(yVar, cVar);
                a0 a0Var = a0.f21526a;
                iVar.u(a0Var);
                return a0Var;
            default:
                i iVar2 = (i) o(yVar, cVar);
                a0 a0Var2 = a0.f21526a;
                iVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f11266e;
        a0 a0Var = a0.f21526a;
        g gVar = this.f11267f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                j.f11269b.remove(gVar);
                break;
            default:
                ub.a.f(obj);
                j.f11269b.add(gVar);
                break;
        }
        return a0Var;
    }
}
