package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f17286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f17287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g2.g1[] g1VarArr, g gVar, int i10, int i11) {
        super(1);
        this.f17286b = g1VarArr;
        this.f17287c = gVar;
        this.f17288d = i10;
        this.f17289e = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g2.f1 f1Var = (g2.f1) obj;
        for (g2.g1 g1Var : this.f17286b) {
            if (g1Var != null) {
                long jA = this.f17287c.f17295a.f17361b.a((((long) g1Var.f7180a) << 32) | (((long) g1Var.f7181b) & 4294967295L), (((long) this.f17289e) & 4294967295L) | (((long) this.f17288d) << 32), f3.m.f6667a);
                f1Var.h(g1Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return ub.a0.f21526a;
    }
}
