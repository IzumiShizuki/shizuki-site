package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22492c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22493d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22495f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22496g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22499j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22498i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f22500k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22501l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22494e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22497h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22502m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22503n = -9223372036854775807L;

    public h(long j10, long j11) {
        this.f22490a = j10;
        this.f22491b = j11;
    }

    public final void a() {
        long j10;
        long j11 = this.f22492c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f22493d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f22495f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f22496g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f22494e == j10) {
            return;
        }
        this.f22494e = j10;
        this.f22497h = j10;
        this.f22502m = -9223372036854775807L;
        this.f22503n = -9223372036854775807L;
        this.f22501l = -9223372036854775807L;
    }
}
