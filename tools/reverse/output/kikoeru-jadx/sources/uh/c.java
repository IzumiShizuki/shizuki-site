package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w.b f21954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w.b bVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f21953e = i10;
        this.f21954f = bVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21953e) {
            case 0:
                return new c(this.f21954f, cVar, 0);
            case 1:
                return new c(this.f21954f, cVar, 1);
            case 2:
                return new c(this.f21954f, cVar, 2);
            default:
                return new c(this.f21954f, cVar, 3);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f21953e) {
            case 0:
                c cVar2 = (c) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                cVar2.u(a0Var);
                return a0Var;
            case 1:
                c cVar3 = (c) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                cVar3.u(a0Var2);
                return a0Var2;
            case 2:
                c cVar4 = (c) o(yVar, cVar);
                ub.a0 a0Var3 = ub.a0.f21526a;
                cVar4.u(a0Var3);
                return a0Var3;
            default:
                c cVar5 = (c) o(yVar, cVar);
                ub.a0 a0Var4 = ub.a0.f21526a;
                cVar5.u(a0Var4);
                return a0Var4;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f21953e) {
            case 0:
                ub.a.f(obj);
                break;
            case 1:
                ub.a.f(obj);
                break;
            case 2:
                ub.a.f(obj);
                break;
            default:
                ub.a.f(obj);
                break;
        }
        return ub.a0.f21526a;
    }
}
