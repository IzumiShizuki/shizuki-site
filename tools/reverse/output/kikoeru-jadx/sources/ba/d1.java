package ba;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f2329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lf.g f2330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(b1 b1Var, yb.c cVar) {
        super(cVar);
        this.f2329f = b1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f2327d = obj;
        this.f2328e |= Integer.MIN_VALUE;
        return this.f2329f.n(null, this);
    }
}
