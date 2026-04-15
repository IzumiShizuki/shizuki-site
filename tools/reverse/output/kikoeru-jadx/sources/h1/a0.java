package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1.c f7979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7981e;

    public a0(long j10, b1.c cVar) {
        super(j10);
        this.f7979c = cVar;
    }

    @Override // h1.g0
    public final void a(g0 g0Var) {
        synchronized (t.f8067a) {
            jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f7979c = ((a0) g0Var).f7979c;
            this.f7980d = ((a0) g0Var).f7980d;
            this.f7981e = ((a0) g0Var).f7981e;
        }
    }

    @Override // h1.g0
    public final g0 b() {
        return c(n.k().g());
    }

    @Override // h1.g0
    public final g0 c(long j10) {
        return new a0(j10, this.f7979c);
    }
}
