package androidx.media3.exoplayer.offline;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f899h;

    public d(o oVar, int i10, long j10, long j11, int i11) {
        this(oVar, i10, j10, j11, -1L, i11, 0, new n());
    }

    public d(o oVar, int i10, long j10, long j11, long j12, int i11, int i12, n nVar) {
        nVar.getClass();
        boolean z10 = false;
        p4.c.c((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            p4.c.c(z10);
        }
        this.f892a = oVar;
        this.f893b = i10;
        this.f894c = j10;
        this.f895d = j11;
        this.f896e = j12;
        this.f897f = i11;
        this.f898g = i12;
        this.f899h = nVar;
    }
}
