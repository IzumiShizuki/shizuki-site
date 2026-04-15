package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f25163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f25164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, n0 n0Var, int i10) {
        super(1);
        this.f25162b = i10;
        this.f25163c = l0Var;
        this.f25164d = n0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int iW;
        int iV;
        int iW2;
        int iV2;
        switch (this.f25162b) {
            case 0:
                g2.g1 g1Var = (g2.g1) obj;
                if (g1Var != null) {
                    this.f25164d.getClass();
                    iW = g1Var.W();
                    iV = g1Var.V();
                } else {
                    iW = 0;
                    iV = 0;
                }
                new o.k(o.k.a(iW, iV));
                this.f25163c.getClass();
                break;
            default:
                g2.g1 g1Var2 = (g2.g1) obj;
                if (g1Var2 != null) {
                    this.f25164d.getClass();
                    iW2 = g1Var2.W();
                    iV2 = g1Var2.V();
                } else {
                    iW2 = 0;
                    iV2 = 0;
                }
                new o.k(o.k.a(iW2, iV2));
                this.f25163c.getClass();
                break;
        }
        return ub.a0.f21526a;
    }
}
