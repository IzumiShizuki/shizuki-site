package lf;

/* JADX INFO: loaded from: classes.dex */
public final class y extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f12526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i7.s0 f12527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, yb.c cVar) {
        super(cVar);
        this.f12526f = sVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12524d = obj;
        this.f12525e |= Integer.MIN_VALUE;
        return this.f12526f.b(null, this);
    }
}
