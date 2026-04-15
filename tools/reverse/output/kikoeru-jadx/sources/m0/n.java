package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ hf.y f13301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ float f13302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, Object obj, yb.c cVar) {
        super(3, cVar);
        this.f13300e = i10;
        this.f13303h = obj;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f13300e;
        hf.y yVar = (hf.y) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        yb.c cVar = (yb.c) obj3;
        switch (i10) {
            case 0:
                n nVar = new n(0, (x) this.f13303h, cVar);
                nVar.f13301f = yVar;
                nVar.f13302g = fFloatValue;
                ub.a0 a0Var = ub.a0.f21526a;
                nVar.u(a0Var);
                return a0Var;
            default:
                n nVar2 = new n(1, (c2) this.f13303h, cVar);
                nVar2.f13301f = yVar;
                nVar2.f13302g = fFloatValue;
                ub.a0 a0Var2 = ub.a0.f21526a;
                nVar2.u(a0Var2);
                return a0Var2;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f13300e) {
            case 0:
                ub.a.f(obj);
                hf.a0.y(this.f13301f, null, null, new m((x) this.f13303h, this.f13302g, null, 0), 3);
                break;
            default:
                ub.a.f(obj);
                hf.a0.y(this.f13301f, null, null, new m((c2) this.f13303h, this.f13302g, null, 1), 3);
                break;
        }
        return ub.a0.f21526a;
    }
}
