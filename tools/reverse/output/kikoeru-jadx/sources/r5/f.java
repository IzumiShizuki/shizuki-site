package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18814d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18818h;

    public f(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f18811a = j10;
        this.f18812b = j11;
        this.f18815e = j12;
        this.f18816f = j13;
        this.f18817g = j14;
        this.f18813c = j15;
        this.f18818h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return p4.c0.j(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
