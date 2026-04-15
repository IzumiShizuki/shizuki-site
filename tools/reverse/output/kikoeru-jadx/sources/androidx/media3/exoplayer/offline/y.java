package androidx.media3.exoplayer.offline;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements t4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f985e;

    public y(l lVar, long j10, int i10, long j11, int i11) {
        this.f981a = lVar;
        this.f982b = j10;
        this.f983c = i10;
        this.f984d = j11;
        this.f985e = i11;
    }

    public final float a() {
        long j10 = this.f982b;
        if (j10 != -1 && j10 != 0) {
            return (this.f984d * 100.0f) / j10;
        }
        int i10 = this.f983c;
        if (i10 != 0) {
            return (this.f985e * 100.0f) / i10;
        }
        return -1.0f;
    }

    @Override // t4.l
    public final void g(long j10, long j11, long j12) {
        long j13 = this.f984d + j12;
        this.f984d = j13;
        this.f981a.b(this.f982b, j13, a());
    }
}
