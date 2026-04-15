package sc;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f19843b;

    public /* synthetic */ o1(p1 p1Var, int i10) {
        this.f19842a = i10;
        this.f19843b = p1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19842a) {
            case 0:
                p1 p1Var = this.f19843b;
                bd.r0 r0VarE = p1Var.v().r().e();
                return r0VarE == null ? ee.m.g(p1Var.v().r(), zc.g.f26696a) : r0VarE;
            default:
                return u3.x0.c(this.f19843b, false);
        }
    }
}
