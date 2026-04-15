package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8576a;

    public p0(boolean z10) {
        this.f8576a = z10;
    }

    @Override // hf.a1
    public final boolean b() {
        return this.f8576a;
    }

    @Override // hf.a1
    public final m1 d() {
        return null;
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("Empty{"), this.f8576a ? "Active" : "New", '}');
    }
}
