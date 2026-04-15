package na;

import j2.h0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class z {
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15786r;

    public /* synthetic */ z(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z10) {
        if (262143 != (i10 & 262143)) {
            z0.i(i10, 262143, x.f15768a.a());
            throw null;
        }
        this.f15769a = str;
        this.f15770b = i11;
        this.f15771c = str2;
        this.f15772d = str3;
        this.f15773e = str4;
        this.f15774f = str5;
        this.f15775g = str6;
        this.f15776h = str7;
        this.f15777i = str8;
        this.f15778j = str9;
        this.f15779k = str10;
        this.f15780l = str11;
        this.f15781m = str12;
        this.f15782n = str13;
        this.f15783o = str14;
        this.f15784p = str15;
        this.f15785q = str16;
        this.f15786r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return jc.l.a(this.f15769a, zVar.f15769a) && this.f15770b == zVar.f15770b && jc.l.a(this.f15771c, zVar.f15771c) && jc.l.a(this.f15772d, zVar.f15772d) && jc.l.a(this.f15773e, zVar.f15773e) && jc.l.a(this.f15774f, zVar.f15774f) && jc.l.a(this.f15775g, zVar.f15775g) && jc.l.a(this.f15776h, zVar.f15776h) && jc.l.a(this.f15777i, zVar.f15777i) && jc.l.a(this.f15778j, zVar.f15778j) && jc.l.a(this.f15779k, zVar.f15779k) && jc.l.a(this.f15780l, zVar.f15780l) && jc.l.a(this.f15781m, zVar.f15781m) && jc.l.a(this.f15782n, zVar.f15782n) && jc.l.a(this.f15783o, zVar.f15783o) && jc.l.a(this.f15784p, zVar.f15784p) && jc.l.a(this.f15785q, zVar.f15785q) && this.f15786r == zVar.f15786r;
    }

    public final int hashCode() {
        return h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(((this.f15769a.hashCode() * 31) + this.f15770b) * 31, 31, this.f15771c), 31, this.f15772d), 31, this.f15773e), 31, this.f15774f), 31, this.f15775g), 31, this.f15776h), 31, this.f15777i), 31, this.f15778j), 31, this.f15779k), 31, this.f15780l), 31, this.f15781m), 31, this.f15782n), 31, this.f15783o), 31, this.f15784p), 31, this.f15785q) + (this.f15786r ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Uploader(login=");
        sb.append(this.f15769a);
        sb.append(", id=");
        sb.append(this.f15770b);
        sb.append(", node_id=");
        h0.w(sb, this.f15771c, ", avatar_url=", this.f15772d, ", gravatar_id=");
        h0.w(sb, this.f15773e, ", url=", this.f15774f, ", html_url=");
        h0.w(sb, this.f15775g, ", followers_url=", this.f15776h, ", following_url=");
        h0.w(sb, this.f15777i, ", gists_url=", this.f15778j, ", starred_url=");
        h0.w(sb, this.f15779k, ", subscriptions_url=", this.f15780l, ", organizations_url=");
        h0.w(sb, this.f15781m, ", repos_url=", this.f15782n, ", events_url=");
        h0.w(sb, this.f15783o, ", received_events_url=", this.f15784p, ", type=");
        sb.append(this.f15785q);
        sb.append(", site_admin=");
        sb.append(this.f15786r);
        sb.append(")");
        return sb.toString();
    }
}
