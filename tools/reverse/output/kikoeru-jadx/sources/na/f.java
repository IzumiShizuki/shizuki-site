package na;

import j2.h0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class f {
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f15685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f15687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f15690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f15691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15692l;

    public /* synthetic */ f(int i10, String str, int i11, String str2, String str3, z zVar, String str4, String str5, int i12, int i13, String str6, String str7, String str8) {
        if (4095 != (i10 & 4095)) {
            z0.i(i10, 4095, d.f15680a.a());
            throw null;
        }
        this.f15681a = str;
        this.f15682b = i11;
        this.f15683c = str2;
        this.f15684d = str3;
        this.f15685e = zVar;
        this.f15686f = str4;
        this.f15687g = str5;
        this.f15688h = i12;
        this.f15689i = i13;
        this.f15690j = str6;
        this.f15691k = str7;
        this.f15692l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jc.l.a(this.f15681a, fVar.f15681a) && this.f15682b == fVar.f15682b && jc.l.a(this.f15683c, fVar.f15683c) && jc.l.a(this.f15684d, fVar.f15684d) && jc.l.a(this.f15685e, fVar.f15685e) && jc.l.a(this.f15686f, fVar.f15686f) && jc.l.a(this.f15687g, fVar.f15687g) && this.f15688h == fVar.f15688h && this.f15689i == fVar.f15689i && jc.l.a(this.f15690j, fVar.f15690j) && jc.l.a(this.f15691k, fVar.f15691k) && jc.l.a(this.f15692l, fVar.f15692l);
    }

    public final int hashCode() {
        return this.f15692l.hashCode() + h0.e(h0.e((((h0.e(h0.e((this.f15685e.hashCode() + h0.e(h0.e(((this.f15681a.hashCode() * 31) + this.f15682b) * 31, 31, this.f15683c), 31, this.f15684d)) * 31, 31, this.f15686f), 31, this.f15687g) + this.f15688h) * 31) + this.f15689i) * 31, 31, this.f15690j), 31, this.f15691k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset(url=");
        sb.append(this.f15681a);
        sb.append(", id=");
        sb.append(this.f15682b);
        sb.append(", node_id=");
        h0.w(sb, this.f15683c, ", name=", this.f15684d, ", uploader=");
        sb.append(this.f15685e);
        sb.append(", content_type=");
        sb.append(this.f15686f);
        sb.append(", state=");
        sb.append(this.f15687g);
        sb.append(", size=");
        sb.append(this.f15688h);
        sb.append(", download_count=");
        sb.append(this.f15689i);
        sb.append(", created_at=");
        sb.append(this.f15690j);
        sb.append(", updated_at=");
        sb.append(this.f15691k);
        sb.append(", browser_download_url=");
        sb.append(this.f15692l);
        sb.append(")");
        return sb.toString();
    }
}
