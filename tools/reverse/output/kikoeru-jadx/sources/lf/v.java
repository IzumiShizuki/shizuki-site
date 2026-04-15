package lf;

/* JADX INFO: loaded from: classes.dex */
public final class v extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f12504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12505g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p pVar, yb.c cVar) {
        super(cVar);
        this.f12504f = pVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12502d = obj;
        this.f12503e |= Integer.MIN_VALUE;
        return this.f12504f.b(null, this);
    }
}
