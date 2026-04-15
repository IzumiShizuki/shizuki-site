package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends vb.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f16069b;

    public w0(v0 v0Var) {
        this.f16069b = v0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16068a < this.f16069b.g();
    }

    @Override // vb.v
    public final int nextInt() {
        int i10 = this.f16068a;
        this.f16068a = i10 + 1;
        return this.f16069b.e(i10);
    }
}
