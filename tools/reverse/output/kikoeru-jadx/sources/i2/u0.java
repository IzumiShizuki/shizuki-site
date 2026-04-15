package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f8856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f8857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, p1 p1Var, long j10) {
        super(0);
        this.f8856b = v0Var;
        this.f8857c = p1Var;
        this.f8858d = j10;
    }

    @Override // ic.a
    public final Object b() {
        r0 r0VarK0;
        n0 n0Var = this.f8856b.f8861f;
        g2.f1 placementScope = null;
        if (f.s(n0Var.f8790a) || n0Var.f8792c) {
            g1 g1Var = n0Var.a().f8704s;
            if (g1Var != null) {
                placementScope = g1Var.f8825l;
            }
        } else {
            g1 g1Var2 = n0Var.a().f8704s;
            if (g1Var2 != null && (r0VarK0 = g1Var2.K0()) != null) {
                placementScope = r0VarK0.f8825l;
            }
        }
        if (placementScope == null) {
            placementScope = ((j2.v) this.f8857c).getPlacementScope();
        }
        r0 r0VarK02 = n0Var.a().K0();
        jc.l.b(r0VarK02);
        g2.f1.j(placementScope, r0VarK02, this.f8858d);
        return ub.a0.f21526a;
    }
}
