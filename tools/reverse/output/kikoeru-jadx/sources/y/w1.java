package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f25277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.x0 f25281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, int i10, g2.g1 g1Var, int i11, g2.x0 x0Var) {
        super(1);
        this.f25277b = x1Var;
        this.f25278c = i10;
        this.f25279d = g1Var;
        this.f25280e = i11;
        this.f25281f = x0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ic.n, jc.m] */
    @Override // ic.k
    public final Object a(Object obj) {
        ?? r0 = this.f25277b.f25287p;
        g2.g1 g1Var = this.f25279d;
        g2.f1.j((g2.f1) obj, g1Var, ((f3.j) r0.q(new f3.l((((long) (this.f25278c - g1Var.f7180a)) << 32) | (((long) (this.f25280e - g1Var.f7181b)) & 4294967295L)), this.f25281f.getLayoutDirection())).f6660a);
        return ub.a0.f21526a;
    }
}
