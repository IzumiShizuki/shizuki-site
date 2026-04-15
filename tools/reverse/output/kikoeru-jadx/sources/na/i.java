package na;

import j2.h0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class i {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f15708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15711r;

    public /* synthetic */ i(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z10) {
        if (262143 != (i10 & 262143)) {
            z0.i(i10, 262143, g.f15693a.a());
            throw null;
        }
        this.f15694a = str;
        this.f15695b = i11;
        this.f15696c = str2;
        this.f15697d = str3;
        this.f15698e = str4;
        this.f15699f = str5;
        this.f15700g = str6;
        this.f15701h = str7;
        this.f15702i = str8;
        this.f15703j = str9;
        this.f15704k = str10;
        this.f15705l = str11;
        this.f15706m = str12;
        this.f15707n = str13;
        this.f15708o = str14;
        this.f15709p = str15;
        this.f15710q = str16;
        this.f15711r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jc.l.a(this.f15694a, iVar.f15694a) && this.f15695b == iVar.f15695b && jc.l.a(this.f15696c, iVar.f15696c) && jc.l.a(this.f15697d, iVar.f15697d) && jc.l.a(this.f15698e, iVar.f15698e) && jc.l.a(this.f15699f, iVar.f15699f) && jc.l.a(this.f15700g, iVar.f15700g) && jc.l.a(this.f15701h, iVar.f15701h) && jc.l.a(this.f15702i, iVar.f15702i) && jc.l.a(this.f15703j, iVar.f15703j) && jc.l.a(this.f15704k, iVar.f15704k) && jc.l.a(this.f15705l, iVar.f15705l) && jc.l.a(this.f15706m, iVar.f15706m) && jc.l.a(this.f15707n, iVar.f15707n) && jc.l.a(this.f15708o, iVar.f15708o) && jc.l.a(this.f15709p, iVar.f15709p) && jc.l.a(this.f15710q, iVar.f15710q) && this.f15711r == iVar.f15711r;
    }

    public final int hashCode() {
        return h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(h0.e(((this.f15694a.hashCode() * 31) + this.f15695b) * 31, 31, this.f15696c), 31, this.f15697d), 31, this.f15698e), 31, this.f15699f), 31, this.f15700g), 31, this.f15701h), 31, this.f15702i), 31, this.f15703j), 31, this.f15704k), 31, this.f15705l), 31, this.f15706m), 31, this.f15707n), 31, this.f15708o), 31, this.f15709p), 31, this.f15710q) + (this.f15711r ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Author(login=");
        sb.append(this.f15694a);
        sb.append(", id=");
        sb.append(this.f15695b);
        sb.append(", node_id=");
        h0.w(sb, this.f15696c, ", avatar_url=", this.f15697d, ", gravatar_id=");
        h0.w(sb, this.f15698e, ", url=", this.f15699f, ", html_url=");
        h0.w(sb, this.f15700g, ", followers_url=", this.f15701h, ", following_url=");
        h0.w(sb, this.f15702i, ", gists_url=", this.f15703j, ", starred_url=");
        h0.w(sb, this.f15704k, ", subscriptions_url=", this.f15705l, ", organizations_url=");
        h0.w(sb, this.f15706m, ", repos_url=", this.f15707n, ", events_url=");
        h0.w(sb, this.f15708o, ", received_events_url=", this.f15709p, ", type=");
        sb.append(this.f15710q);
        sb.append(", site_admin=");
        sb.append(this.f15711r);
        sb.append(")");
        return sb.toString();
    }
}
