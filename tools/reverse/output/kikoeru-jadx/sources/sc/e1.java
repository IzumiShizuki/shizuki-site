package sc;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f19793b;

    public /* synthetic */ e1(g1 g1Var, int i10) {
        this.f19792a = i10;
        this.f19793b = g1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19792a) {
            case 0:
                return new f1(this.f19793b);
            default:
                return this.f19793b.u();
        }
    }
}
