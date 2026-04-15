package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f9923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(int i10, ic.n nVar) {
        super(1);
        this.f9922b = i10;
        switch (i10) {
            case 1:
                r.v1 v1Var = r.w1.f18620a;
                this.f9923c = nVar;
                super(1);
                break;
            default:
                this.f9923c = nVar;
                break;
        }
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f9922b;
        ub.a0 a0Var = ub.a0.f21526a;
        ic.n nVar = this.f9923c;
        switch (i10) {
            case 0:
                nVar.q((q1.o) obj, null);
                break;
            default:
                r.i iVar = (r.i) obj;
                Object value = iVar.f18451e.getValue();
                r.v1 v1Var = r.w1.f18620a;
                nVar.q(value, Float.valueOf(((r.l) iVar.f18452f).f18474a));
                break;
        }
        return a0Var;
    }
}
