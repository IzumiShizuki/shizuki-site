package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f7270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, int i10) {
        super(2);
        this.f7269b = i10;
        this.f7270c = q1Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7269b) {
            case 0:
                this.f7270c.a().f7254b = (x0.r) obj2;
                break;
            case 1:
                p0 p0VarA = this.f7270c.a();
                ((i2.j0) obj).g0(new m0(p0VarA, (ic.n) obj2, p0VarA.f7268p));
                break;
            default:
                i2.j0 j0Var = (i2.j0) obj;
                q1 q1Var = this.f7270c;
                t1 t1Var = q1Var.f7277a;
                p0 p0Var = j0Var.H;
                if (p0Var == null) {
                    p0Var = new p0(j0Var, t1Var);
                    j0Var.H = p0Var;
                }
                q1Var.f7278b = p0Var;
                q1Var.a().d();
                p0 p0VarA2 = q1Var.a();
                if (p0VarA2.f7255c != t1Var) {
                    p0VarA2.f7255c = t1Var;
                    p0VarA2.e(false);
                    i2.j0.Y(p0VarA2.f7253a, false, 7);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
