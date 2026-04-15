package sc;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f19833b;

    public /* synthetic */ m1(n1 n1Var, int i10) {
        this.f19832a = i10;
        this.f19833b = n1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19832a) {
            case 0:
                n1 n1Var = this.f19833b;
                bd.q0 q0VarD = n1Var.v().r().d();
                return q0VarD == null ? ee.m.f(n1Var.v().r(), zc.g.f26696a) : q0VarD;
            default:
                return u3.x0.c(this.f19833b, true);
        }
    }
}
