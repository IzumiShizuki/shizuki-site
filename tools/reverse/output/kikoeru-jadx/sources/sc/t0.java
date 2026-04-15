package sc;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f19876b;

    public /* synthetic */ t0(x0 x0Var, int i10) {
        this.f19875a = i10;
        this.f19876b = x0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19875a) {
            case 0:
                return new w0(this.f19876b);
            default:
                return g8.a.s(this.f19876b.f19912b);
        }
    }
}
