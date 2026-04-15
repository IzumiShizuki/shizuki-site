package sc;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f19808b;

    public /* synthetic */ h1(j1 j1Var, int i10) {
        this.f19807a = i10;
        this.f19808b = j1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19807a) {
            case 0:
                return new i1(this.f19808b);
            default:
                return this.f19808b.u();
        }
    }
}
