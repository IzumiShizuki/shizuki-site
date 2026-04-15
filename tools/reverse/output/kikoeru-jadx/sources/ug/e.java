package ug;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends lh.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f21773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.v f21774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a0.v vVar, lh.f0 f0Var) {
        super(f0Var);
        this.f21773b = fVar;
        this.f21774c = vVar;
    }

    @Override // lh.n, lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f fVar = this.f21773b;
        a0.v vVar = this.f21774c;
        synchronized (fVar) {
            if (vVar.f152a) {
                return;
            }
            vVar.f152a = true;
            super.close();
            ((b5.d0) this.f21774c.f153b).e();
        }
    }
}
