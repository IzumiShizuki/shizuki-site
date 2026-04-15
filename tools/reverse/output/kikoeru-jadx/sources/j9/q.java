package j9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f10738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f10739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(List list, f fVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f10737e = i10;
        this.f10738f = list;
        this.f10739g = fVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f10737e) {
            case 0:
                return new q(this.f10738f, this.f10739g, cVar, 0);
            default:
                return new q(this.f10738f, this.f10739g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f10737e) {
            case 0:
                q qVar = (q) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                qVar.u(a0Var);
                return a0Var;
            default:
                q qVar2 = (q) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                qVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f10737e;
        ub.a0 a0Var = ub.a0.f21526a;
        f fVar = this.f10739g;
        List list = this.f10738f;
        switch (i10) {
            case 0:
                ub.a.f(obj);
                list.add(fVar);
                break;
            default:
                ub.a.f(obj);
                list.add(fVar);
                break;
        }
        return a0Var;
    }
}
