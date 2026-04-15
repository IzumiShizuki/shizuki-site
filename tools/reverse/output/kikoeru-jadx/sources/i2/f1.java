package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f8696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, int i10) {
        super(0);
        this.f8695b = i10;
        this.f8696c = g1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f8695b) {
            case 0:
                g1 g1Var = this.f8696c;
                q1.o oVar = g1Var.G;
                jc.l.b(oVar);
                g1Var.G0(oVar, g1Var.F);
                break;
            default:
                g1 g1Var2 = this.f8696c.f8704s;
                if (g1Var2 != null) {
                    g1Var2.T0();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
