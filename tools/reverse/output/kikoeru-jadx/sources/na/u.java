package na;

import j2.h0;
import java.util.List;
import q.t0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class u {
    public static final t Companion = new t();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ub.h[] f15742s = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, ub.a.c(ub.i.f21540a, new i9.f(25)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f15748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f15756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f15757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f15758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f15760r;

    public /* synthetic */ u(int i10, String str, String str2, String str3, String str4, int i11, i iVar, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, List list, String str11, String str12, String str13) {
        if (262143 != (i10 & 262143)) {
            z0.i(i10, 262143, s.f15741a.a());
            throw null;
        }
        this.f15743a = str;
        this.f15744b = str2;
        this.f15745c = str3;
        this.f15746d = str4;
        this.f15747e = i11;
        this.f15748f = iVar;
        this.f15749g = str5;
        this.f15750h = str6;
        this.f15751i = str7;
        this.f15752j = str8;
        this.f15753k = z10;
        this.f15754l = z11;
        this.f15755m = str9;
        this.f15756n = str10;
        this.f15757o = list;
        this.f15758p = str11;
        this.f15759q = str12;
        this.f15760r = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return jc.l.a(this.f15743a, uVar.f15743a) && jc.l.a(this.f15744b, uVar.f15744b) && jc.l.a(this.f15745c, uVar.f15745c) && jc.l.a(this.f15746d, uVar.f15746d) && this.f15747e == uVar.f15747e && jc.l.a(this.f15748f, uVar.f15748f) && jc.l.a(this.f15749g, uVar.f15749g) && jc.l.a(this.f15750h, uVar.f15750h) && jc.l.a(this.f15751i, uVar.f15751i) && jc.l.a(this.f15752j, uVar.f15752j) && this.f15753k == uVar.f15753k && this.f15754l == uVar.f15754l && jc.l.a(this.f15755m, uVar.f15755m) && jc.l.a(this.f15756n, uVar.f15756n) && jc.l.a(this.f15757o, uVar.f15757o) && jc.l.a(this.f15758p, uVar.f15758p) && jc.l.a(this.f15759q, uVar.f15759q) && jc.l.a(this.f15760r, uVar.f15760r);
    }

    public final int hashCode() {
        return this.f15760r.hashCode() + h0.e(h0.e(t0.z(h0.e(h0.e((((h0.e(h0.e(h0.e(h0.e((this.f15748f.hashCode() + ((h0.e(h0.e(h0.e(this.f15743a.hashCode() * 31, 31, this.f15744b), 31, this.f15745c), 31, this.f15746d) + this.f15747e) * 31)) * 31, 31, this.f15749g), 31, this.f15750h), 31, this.f15751i), 31, this.f15752j) + (this.f15753k ? 1231 : 1237)) * 31) + (this.f15754l ? 1231 : 1237)) * 31, 31, this.f15755m), 31, this.f15756n), 31, this.f15757o), 31, this.f15758p), 31, this.f15759q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GithubBean(url=");
        sb.append(this.f15743a);
        sb.append(", assets_url=");
        sb.append(this.f15744b);
        sb.append(", upload_url=");
        h0.w(sb, this.f15745c, ", html_url=", this.f15746d, ", id=");
        sb.append(this.f15747e);
        sb.append(", author=");
        sb.append(this.f15748f);
        sb.append(", node_id=");
        h0.w(sb, this.f15749g, ", tag_name=", this.f15750h, ", target_commitish=");
        h0.w(sb, this.f15751i, ", name=", this.f15752j, ", draft=");
        sb.append(this.f15753k);
        sb.append(", prerelease=");
        sb.append(this.f15754l);
        sb.append(", created_at=");
        h0.w(sb, this.f15755m, ", published_at=", this.f15756n, ", assets=");
        sb.append(this.f15757o);
        sb.append(", tarball_url=");
        sb.append(this.f15758p);
        sb.append(", zipball_url=");
        sb.append(this.f15759q);
        sb.append(", body=");
        sb.append(this.f15760r);
        sb.append(")");
        return sb.toString();
    }
}
