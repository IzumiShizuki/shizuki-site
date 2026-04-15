package la;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7.v f12164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(f7.v vVar, yb.c cVar) {
        super(cVar);
        this.f12164f = vVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12162d = obj;
        this.f12163e |= Integer.MIN_VALUE;
        return this.f12164f.n(null, this);
    }
}
