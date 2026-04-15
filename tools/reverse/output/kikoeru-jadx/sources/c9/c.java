package c9;

import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3787m;

    public c(int i10, long j10, long j11, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, String str6, String str7, String str8) {
        l.e(str, "sourceId");
        l.e(str2, "releaseTime");
        l.e(str3, "tags");
        l.e(str4, "vas");
        l.e(str5, "circle");
        l.e(str6, "icon");
        l.e(str7, "name");
        l.e(str8, "workJson");
        this.f3775a = i10;
        this.f3776b = j10;
        this.f3777c = j11;
        this.f3778d = str;
        this.f3779e = str2;
        this.f3780f = str3;
        this.f3781g = str4;
        this.f3782h = str5;
        this.f3783i = z10;
        this.f3784j = z11;
        this.f3785k = str6;
        this.f3786l = str7;
        this.f3787m = str8;
    }

    public static c a(c cVar, int i10, String str, int i11) {
        int i12 = (i11 & 1) != 0 ? cVar.f3775a : i10;
        long j10 = cVar.f3776b;
        long j11 = cVar.f3777c;
        String str2 = (i11 & 8) != 0 ? cVar.f3778d : str;
        String str3 = cVar.f3779e;
        String str4 = cVar.f3780f;
        String str5 = cVar.f3781g;
        String str6 = cVar.f3782h;
        boolean z10 = cVar.f3783i;
        boolean z11 = cVar.f3784j;
        String str7 = cVar.f3785k;
        String str8 = cVar.f3786l;
        String str9 = cVar.f3787m;
        l.e(str2, "sourceId");
        l.e(str3, "releaseTime");
        l.e(str4, "tags");
        l.e(str5, "vas");
        l.e(str6, "circle");
        l.e(str7, "icon");
        l.e(str8, "name");
        l.e(str9, "workJson");
        return new c(i12, j10, j11, str2, str3, str4, str5, str6, z10, z11, str7, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3775a == cVar.f3775a && this.f3776b == cVar.f3776b && this.f3777c == cVar.f3777c && l.a(this.f3778d, cVar.f3778d) && l.a(this.f3779e, cVar.f3779e) && l.a(this.f3780f, cVar.f3780f) && l.a(this.f3781g, cVar.f3781g) && l.a(this.f3782h, cVar.f3782h) && this.f3783i == cVar.f3783i && this.f3784j == cVar.f3784j && l.a(this.f3785k, cVar.f3785k) && l.a(this.f3786l, cVar.f3786l) && l.a(this.f3787m, cVar.f3787m);
    }

    public final int hashCode() {
        int i10 = this.f3775a * 31;
        long j10 = this.f3776b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3777c;
        return this.f3787m.hashCode() + h0.e(h0.e((((h0.e(h0.e(h0.e(h0.e(h0.e((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31, this.f3778d), 31, this.f3779e), 31, this.f3780f), 31, this.f3781g), 31, this.f3782h) + (this.f3783i ? 1231 : 1237)) * 31) + (this.f3784j ? 1231 : 1237)) * 31, 31, this.f3785k), 31, this.f3786l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadBean(id=");
        sb.append(this.f3775a);
        sb.append(", timestamp=");
        sb.append(this.f3776b);
        sb.append(", rj=");
        sb.append(this.f3777c);
        sb.append(", sourceId=");
        h0.w(sb, this.f3778d, ", releaseTime=", this.f3779e, ", tags=");
        h0.w(sb, this.f3780f, ", vas=", this.f3781g, ", circle=");
        sb.append(this.f3782h);
        sb.append(", nsfw=");
        sb.append(this.f3783i);
        sb.append(", has_subtitle=");
        sb.append(this.f3784j);
        sb.append(", icon=");
        sb.append(this.f3785k);
        sb.append(", name=");
        sb.append(this.f3786l);
        sb.append(", workJson=");
        sb.append(this.f3787m);
        sb.append(")");
        return sb.toString();
    }
}
