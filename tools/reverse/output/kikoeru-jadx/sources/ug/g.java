package ug;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f21779n = new g(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f21780o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f21793m;

    static {
        int i10 = ff.a.f7057d;
        ff.c cVar = ff.c.SECONDS;
        long jH = ff.a.h(ff.f.m(Integer.MAX_VALUE, cVar), cVar);
        if (jH < 0) {
            throw new IllegalArgumentException(j2.h0.i(jH, "maxStale < 0: ").toString());
        }
        f21780o = new g(false, false, -1, -1, false, false, false, jH > 2147483647L ? Integer.MAX_VALUE : (int) jH, -1, true, false, false, null);
    }

    public g(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f21781a = z10;
        this.f21782b = z11;
        this.f21783c = i10;
        this.f21784d = i11;
        this.f21785e = z12;
        this.f21786f = z13;
        this.f21787g = z14;
        this.f21788h = i12;
        this.f21789i = i13;
        this.f21790j = z15;
        this.f21791k = z16;
        this.f21792l = z17;
        this.f21793m = str;
    }

    public final String toString() {
        String str = this.f21793m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21781a) {
            sb.append("no-cache, ");
        }
        if (this.f21782b) {
            sb.append("no-store, ");
        }
        int i10 = this.f21783c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f21784d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f21785e) {
            sb.append("private, ");
        }
        if (this.f21786f) {
            sb.append("public, ");
        }
        if (this.f21787g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f21788h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f21789i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.f21790j) {
            sb.append("only-if-cached, ");
        }
        if (this.f21791k) {
            sb.append("no-transform, ");
        }
        if (this.f21792l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        jc.l.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        this.f21793m = string;
        return string;
    }
}
