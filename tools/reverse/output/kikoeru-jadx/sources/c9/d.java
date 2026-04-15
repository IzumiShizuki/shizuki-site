package c9;

import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f3797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3800m;

    public d(int i10, long j10, long j11, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, String str6, String str7, String str8) {
        l.e(str, "sourceId");
        l.e(str2, "releaseTime");
        l.e(str3, "tags");
        l.e(str4, "vas");
        l.e(str5, "circle");
        l.e(str6, "icon");
        l.e(str7, "name");
        l.e(str8, "workJson");
        this.f3788a = i10;
        this.f3789b = j10;
        this.f3790c = j11;
        this.f3791d = str;
        this.f3792e = str2;
        this.f3793f = str3;
        this.f3794g = str4;
        this.f3795h = str5;
        this.f3796i = z10;
        this.f3797j = z11;
        this.f3798k = str6;
        this.f3799l = str7;
        this.f3800m = str8;
    }

    public static d a(d dVar, int i10, String str, int i11) {
        int i12 = (i11 & 1) != 0 ? dVar.f3788a : i10;
        long j10 = dVar.f3789b;
        long j11 = dVar.f3790c;
        String str2 = (i11 & 8) != 0 ? dVar.f3791d : str;
        String str3 = dVar.f3792e;
        String str4 = dVar.f3793f;
        String str5 = dVar.f3794g;
        String str6 = dVar.f3795h;
        boolean z10 = dVar.f3796i;
        boolean z11 = dVar.f3797j;
        String str7 = dVar.f3798k;
        String str8 = dVar.f3799l;
        String str9 = dVar.f3800m;
        l.e(str2, "sourceId");
        l.e(str3, "releaseTime");
        l.e(str4, "tags");
        l.e(str5, "vas");
        l.e(str6, "circle");
        l.e(str7, "icon");
        l.e(str8, "name");
        l.e(str9, "workJson");
        return new d(i12, j10, j11, str2, str3, str4, str5, str6, z10, z11, str7, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3788a == dVar.f3788a && this.f3789b == dVar.f3789b && this.f3790c == dVar.f3790c && l.a(this.f3791d, dVar.f3791d) && l.a(this.f3792e, dVar.f3792e) && l.a(this.f3793f, dVar.f3793f) && l.a(this.f3794g, dVar.f3794g) && l.a(this.f3795h, dVar.f3795h) && this.f3796i == dVar.f3796i && this.f3797j == dVar.f3797j && l.a(this.f3798k, dVar.f3798k) && l.a(this.f3799l, dVar.f3799l) && l.a(this.f3800m, dVar.f3800m);
    }

    public final int hashCode() {
        int i10 = this.f3788a * 31;
        long j10 = this.f3789b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3790c;
        return this.f3800m.hashCode() + h0.e(h0.e((((h0.e(h0.e(h0.e(h0.e(h0.e((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31, this.f3791d), 31, this.f3792e), 31, this.f3793f), 31, this.f3794g), 31, this.f3795h) + (this.f3796i ? 1231 : 1237)) * 31) + (this.f3797j ? 1231 : 1237)) * 31, 31, this.f3798k), 31, this.f3799l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryBean(id=");
        sb.append(this.f3788a);
        sb.append(", timestamp=");
        sb.append(this.f3789b);
        sb.append(", rj=");
        sb.append(this.f3790c);
        sb.append(", sourceId=");
        h0.w(sb, this.f3791d, ", releaseTime=", this.f3792e, ", tags=");
        h0.w(sb, this.f3793f, ", vas=", this.f3794g, ", circle=");
        sb.append(this.f3795h);
        sb.append(", nsfw=");
        sb.append(this.f3796i);
        sb.append(", has_subtitle=");
        sb.append(this.f3797j);
        sb.append(", icon=");
        sb.append(this.f3798k);
        sb.append(", name=");
        sb.append(this.f3799l);
        sb.append(", workJson=");
        sb.append(this.f3800m);
        sb.append(")");
        return sb.toString();
    }
}
