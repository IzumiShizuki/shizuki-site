package lf;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.g f12393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i7.g gVar, yb.c cVar) {
        super(cVar);
        this.f12393f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12391d = obj;
        this.f12392e |= Integer.MIN_VALUE;
        return this.f12393f.n(null, this);
    }
}
