package r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f18645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f18646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f18647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f18648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18649e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f18645a = (((long) 0) & 4294967295L) | j11;
        f18646b = (((long) 1) & 4294967295L) | j11;
        f18647c = j11 | (((long) 2) & 4294967295L);
        f18648d = (j10 & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return a(j10, f18645a) ? "Rgb" : a(j10, f18646b) ? "Xyz" : a(j10, f18647c) ? "Lab" : a(j10, f18648d) ? "Cmyk" : "Unknown";
    }
}
