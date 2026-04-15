package u6;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21436e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f21442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f21443l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f21446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f21447p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f21449r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f21451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f21452u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21437f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21438g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21439h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21440i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21441j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21444m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21445n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21448q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f21450s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f21434c && gVar.f21434c) {
                this.f21433b = gVar.f21433b;
                this.f21434c = true;
            }
            if (this.f21439h == -1) {
                this.f21439h = gVar.f21439h;
            }
            if (this.f21440i == -1) {
                this.f21440i = gVar.f21440i;
            }
            if (this.f21432a == null && (str = gVar.f21432a) != null) {
                this.f21432a = str;
            }
            if (this.f21437f == -1) {
                this.f21437f = gVar.f21437f;
            }
            if (this.f21438g == -1) {
                this.f21438g = gVar.f21438g;
            }
            if (this.f21445n == -1) {
                this.f21445n = gVar.f21445n;
            }
            if (this.f21446o == null && (alignment2 = gVar.f21446o) != null) {
                this.f21446o = alignment2;
            }
            if (this.f21447p == null && (alignment = gVar.f21447p) != null) {
                this.f21447p = alignment;
            }
            if (this.f21448q == -1) {
                this.f21448q = gVar.f21448q;
            }
            if (this.f21441j == -1) {
                this.f21441j = gVar.f21441j;
                this.f21442k = gVar.f21442k;
            }
            if (this.f21449r == null) {
                this.f21449r = gVar.f21449r;
            }
            if (this.f21450s == Float.MAX_VALUE) {
                this.f21450s = gVar.f21450s;
            }
            if (this.f21451t == null) {
                this.f21451t = gVar.f21451t;
            }
            if (this.f21452u == null) {
                this.f21452u = gVar.f21452u;
            }
            if (!this.f21436e && gVar.f21436e) {
                this.f21435d = gVar.f21435d;
                this.f21436e = true;
            }
            if (this.f21444m != -1 || (i10 = gVar.f21444m) == -1) {
                return;
            }
            this.f21444m = i10;
        }
    }
}
