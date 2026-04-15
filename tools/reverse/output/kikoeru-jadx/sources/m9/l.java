package m9;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.g f15036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i7.g gVar, yb.c cVar) {
        super(cVar);
        this.f15036f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15034d = obj;
        this.f15035e |= Integer.MIN_VALUE;
        return this.f15036f.n(null, this);
    }
}
