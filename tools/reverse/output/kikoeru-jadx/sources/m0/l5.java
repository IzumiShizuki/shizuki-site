package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.z f13235a = new x0.z(new i9.f(12));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m5 f13236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m5 f13237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0.e f13238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u0.e f13239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u0.e f13240f;

    static {
        long j10 = q1.q.f17575h;
        f13236b = new m5(true, Float.NaN, j10);
        f13237c = new m5(false, Float.NaN, j10);
        f13238d = new u0.e(0.16f, 0.24f, 0.08f, 0.24f);
        f13239e = new u0.e(0.08f, 0.12f, 0.04f, 0.12f);
        f13240f = new u0.e(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static m5 a(float f10, int i10, long j10, boolean z10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            j10 = q1.q.f17575h;
        }
        return (f3.f.a(f10, Float.NaN) && q1.q.c(j10, q1.q.f17575h)) ? z10 ? f13236b : f13237c : new m5(z10, f10, j10);
    }
}
