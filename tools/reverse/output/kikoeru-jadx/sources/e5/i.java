package e5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.n f6200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f6203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6205k;

    public i(String str, h hVar, long j10, int i10, long j11, m4.n nVar, String str2, String str3, long j12, long j13, boolean z10) {
        this.f6195a = str;
        this.f6196b = hVar;
        this.f6197c = j10;
        this.f6198d = i10;
        this.f6199e = j11;
        this.f6200f = nVar;
        this.f6201g = str2;
        this.f6202h = str3;
        this.f6203i = j12;
        this.f6204j = j13;
        this.f6205k = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l10 = (Long) obj;
        long jLongValue = l10.longValue();
        long j10 = this.f6199e;
        if (j10 > jLongValue) {
            return 1;
        }
        return j10 < l10.longValue() ? -1 : 0;
    }
}
