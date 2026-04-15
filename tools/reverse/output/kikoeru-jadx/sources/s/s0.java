package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f19270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, int i10) {
        super(0);
        this.f19269b = i10;
        this.f19270c = t0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19269b) {
            case 0:
                g2.c0 c0Var = (g2.c0) this.f19270c.f19279u.getValue();
                return new p1.b(c0Var != null ? c0Var.H(0L) : 9205357640488583168L);
            case 1:
                return new p1.b(this.f19270c.f19281w);
            default:
                this.f19270c.D0();
                return ub.a0.f21526a;
        }
    }
}
