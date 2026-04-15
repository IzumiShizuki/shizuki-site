package pf;

import hf.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f17152c = new l();

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        e.f17140d.f17142c.g(runnable, true, false);
    }

    @Override // hf.u
    public final void f0(yb.h hVar, Runnable runnable) {
        e.f17140d.f17142c.g(runnable, true, true);
    }

    @Override // hf.u
    public final u h0(int i10) {
        nf.b.a(i10);
        return i10 >= k.f17149d ? this : super.h0(i10);
    }

    @Override // hf.u
    public final String toString() {
        return "Dispatchers.IO";
    }
}
