package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends h1.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24316c;

    public h2(long j10, Object obj) {
        super(j10);
        this.f24316c = obj;
    }

    @Override // h1.g0
    public final void a(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f24316c = ((h2) g0Var).f24316c;
    }

    @Override // h1.g0
    public final h1.g0 b() {
        return new h2(h1.n.k().g(), this.f24316c);
    }

    @Override // h1.g0
    public final h1.g0 c(long j10) {
        return new h2(h1.n.k().g(), this.f24316c);
    }
}
