package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends h1.g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24303c;

    public f2(long j10, int i10) {
        super(j10);
        this.f24303c = i10;
    }

    @Override // h1.g0
    public final void a(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f24303c = ((f2) g0Var).f24303c;
    }

    @Override // h1.g0
    public final h1.g0 b() {
        return c(h1.n.k().g());
    }

    @Override // h1.g0
    public final h1.g0 c(long j10) {
        return new f2(j10, this.f24303c);
    }
}
