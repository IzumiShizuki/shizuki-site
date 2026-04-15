package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.y f24523a;

    public y(hf.y yVar) {
        this.f24523a = yVar;
    }

    @Override // x0.u1
    public final void a() {
        hf.y yVar = this.f24523a;
        if (yVar instanceof x1) {
            ((x1) yVar).b();
        } else {
            hf.a0.h(yVar, new h0(1));
        }
    }

    @Override // x0.u1
    public final void c() {
        hf.y yVar = this.f24523a;
        if (yVar instanceof x1) {
            ((x1) yVar).b();
        } else {
            hf.a0.h(yVar, new h0(1));
        }
    }

    @Override // x0.u1
    public final void d() {
    }
}
