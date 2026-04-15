package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f19115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f19114e = i10;
        this.f19115f = dVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f19114e) {
            case 0:
                return new c(this.f19115f, cVar, 0);
            default:
                return new c(this.f19115f, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f19114e) {
            case 0:
                c cVar2 = (c) o(yVar, cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                cVar2.u(a0Var);
                return a0Var;
            default:
                c cVar3 = (c) o(yVar, cVar);
                ub.a0 a0Var2 = ub.a0.f21526a;
                cVar3.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f19114e) {
            case 0:
                ub.a.f(obj);
                d dVar = this.f19115f;
                if (dVar.A == null) {
                    w.h hVar = new w.h();
                    w.k kVar = dVar.f19119q;
                    if (kVar != null) {
                        hf.a0.y(dVar.n0(), null, null, new lf.w0(kVar, hVar, null, 16), 3);
                    }
                    dVar.A = hVar;
                }
                break;
            default:
                ub.a.f(obj);
                d dVar2 = this.f19115f;
                w.h hVar2 = dVar2.A;
                if (hVar2 != null) {
                    w.i iVar = new w.i(hVar2);
                    w.k kVar2 = dVar2.f19119q;
                    yb.c cVar = null;
                    if (kVar2 != null) {
                        hf.a0.y(dVar2.n0(), null, null, new lf.w0(kVar2, iVar, cVar, 17), 3);
                    }
                    dVar2.A = null;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
