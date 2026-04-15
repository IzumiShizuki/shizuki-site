package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a1.d f8069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8070d;

    public u(long j10, a1.d dVar) {
        super(j10);
        this.f8069c = dVar;
    }

    @Override // h1.g0
    public final void a(g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        u uVar = (u) g0Var;
        synchronized (t.f8068b) {
            this.f8069c = uVar.f8069c;
            this.f8070d = uVar.f8070d;
        }
    }

    @Override // h1.g0
    public final g0 b() {
        return new u(n.k().g(), this.f8069c);
    }

    @Override // h1.g0
    public final g0 c(long j10) {
        return new u(j10, this.f8069c);
    }
}
