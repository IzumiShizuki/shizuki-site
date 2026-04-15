package q9;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f17983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.s0 f17985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i7.s0 s0Var, yb.c cVar) {
        super(cVar);
        this.f17985f = s0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f17983d = obj;
        this.f17984e |= Integer.MIN_VALUE;
        return this.f17985f.n(null, this);
    }
}
