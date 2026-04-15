package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements n2, p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1786c;

    public /* synthetic */ g2(Object obj, long j10, int i10) {
        this.f1784a = i10;
        this.f1785b = obj;
        this.f1786c = j10;
    }

    @Override // b7.n2
    public void b(t1 t1Var) {
        switch (this.f1784a) {
            case 0:
                ((o2) this.f1785b).f2008g.f1693t.d0((int) this.f1786c);
                break;
            default:
                ((o2) this.f1785b).f2008g.f1693t.c0(this.f1786c);
                break;
        }
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        return c2Var.p(t1Var, ya.i0.u((m4.i0) this.f1785b), 0, this.f1786c);
    }
}
