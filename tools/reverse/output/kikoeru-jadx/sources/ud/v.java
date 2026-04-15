package ud;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v f21604i = new v(new v(null, 2047), 2012);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f21607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f21609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f21610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21612h;

    public v(boolean z10, boolean z11, v vVar, boolean z12, v vVar2, v vVar3, boolean z13, boolean z14) {
        this.f21605a = z10;
        this.f21606b = z11;
        this.f21607c = vVar;
        this.f21608d = z12;
        this.f21609e = vVar2;
        this.f21610f = vVar3;
        this.f21611g = z13;
        this.f21612h = z14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(v vVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        v vVar2 = (i10 & 32) != 0 ? null : vVar;
        this(z10, z11, vVar2, true, vVar2, vVar2, (i10 & 512) == 0, (i10 & 1024) == 0);
    }
}
