package ba;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f2297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lf.g f2298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2299h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, yb.c cVar) {
        super(cVar);
        this.f2297f = b1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f2295d = obj;
        this.f2296e |= Integer.MIN_VALUE;
        return this.f2297f.n(null, this);
    }
}
