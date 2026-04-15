package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f1858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1859c;

    public /* synthetic */ i2(o2 o2Var, int i10, int i11) {
        this.f1857a = i11;
        this.f1858b = o2Var;
        this.f1859c = i10;
    }

    @Override // b7.n2
    public final void b(t1 t1Var) {
        switch (this.f1857a) {
            case 0:
                this.f1858b.f2008g.f1693t.n0(x.q(this.f1859c));
                break;
            default:
                this.f1858b.f2008g.f1693t.o0(x.s(this.f1859c));
                break;
        }
    }
}
