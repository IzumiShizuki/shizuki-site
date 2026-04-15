package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f19201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f19203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, int i10, g2.g1 g1Var) {
        super(1);
        this.f19201b = l1Var;
        this.f19202c = i10;
        this.f19203d = g1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g2.f1 f1Var = (g2.f1) obj;
        l1 l1Var = this.f19201b;
        int iE = l1Var.f19217o.f19241a.e();
        if (iE < 0) {
            iE = 0;
        }
        int i10 = this.f19202c;
        if (iE > i10) {
            iE = i10;
        }
        int i11 = -iE;
        boolean z10 = l1Var.f19218p;
        int i12 = z10 ? 0 : i11;
        if (!z10) {
            i11 = 0;
        }
        f1Var.f7178a = true;
        g2.f1.l(f1Var, this.f19203d, i12, i11);
        f1Var.f7178a = false;
        return ub.a0.f21526a;
    }
}
