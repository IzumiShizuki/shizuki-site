package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f14609h = new x(new w());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14610i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14611j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14612k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14613l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14614m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14615n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14616o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14623g;

    public x(w wVar) {
        this.f14617a = p4.c0.c0(wVar.f14604a);
        this.f14619c = p4.c0.c0(wVar.f14605b);
        this.f14618b = wVar.f14604a;
        this.f14620d = wVar.f14605b;
        this.f14621e = wVar.f14606c;
        this.f14622f = wVar.f14607d;
        this.f14623g = wVar.f14608e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f14618b == xVar.f14618b && this.f14620d == xVar.f14620d && this.f14621e == xVar.f14621e && this.f14622f == xVar.f14622f && this.f14623g == xVar.f14623g;
    }

    public final int hashCode() {
        long j10 = this.f14618b;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f14620d;
        return ((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f14621e ? 1 : 0)) * 31) + (this.f14622f ? 1 : 0)) * 31) + (this.f14623g ? 1 : 0);
    }
}
