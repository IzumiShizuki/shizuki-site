package ug;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f21719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f21721d;

    public a0(v vVar, int i10, byte[] bArr) {
        this.f21719b = vVar;
        this.f21720c = i10;
        this.f21721d = bArr;
    }

    @Override // ug.b0
    public final long a() {
        return this.f21720c;
    }

    @Override // ug.b0
    public final v b() {
        return this.f21719b;
    }

    @Override // ug.b0
    public final void c(lh.a0 a0Var) {
        if (a0Var.f12543c) {
            throw new IllegalStateException("closed");
        }
        a0Var.f12542b.Y(this.f21721d, this.f21720c);
        a0Var.b();
    }
}
