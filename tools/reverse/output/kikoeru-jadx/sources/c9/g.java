package c9;

import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3821g;

    public g(int i10, long j10, String str, String str2, String str3, String str4, String str5) {
        l.e(str, "sourceId");
        l.e(str2, "name");
        l.e(str3, "docName");
        l.e(str4, "documentUri");
        l.e(str5, "zipInnerPath");
        this.f3815a = i10;
        this.f3816b = j10;
        this.f3817c = str;
        this.f3818d = str2;
        this.f3819e = str3;
        this.f3820f = str4;
        this.f3821g = str5;
    }

    public static g a(g gVar, int i10, String str, int i11) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f3815a;
        }
        int i12 = i10;
        long j10 = gVar.f3816b;
        if ((i11 & 4) != 0) {
            str = gVar.f3817c;
        }
        String str2 = str;
        String str3 = gVar.f3818d;
        String str4 = gVar.f3819e;
        String str5 = gVar.f3820f;
        String str6 = gVar.f3821g;
        l.e(str2, "sourceId");
        l.e(str3, "name");
        l.e(str4, "docName");
        l.e(str5, "documentUri");
        l.e(str6, "zipInnerPath");
        return new g(i12, j10, str2, str3, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3815a == gVar.f3815a && this.f3816b == gVar.f3816b && l.a(this.f3817c, gVar.f3817c) && l.a(this.f3818d, gVar.f3818d) && l.a(this.f3819e, gVar.f3819e) && l.a(this.f3820f, gVar.f3820f) && l.a(this.f3821g, gVar.f3821g);
    }

    public final int hashCode() {
        int i10 = this.f3815a * 31;
        long j10 = this.f3816b;
        return this.f3821g.hashCode() + h0.e(h0.e(h0.e(h0.e((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f3817c), 31, this.f3818d), 31, this.f3819e), 31, this.f3820f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManualLRCBean(id=");
        sb.append(this.f3815a);
        sb.append(", rj=");
        sb.append(this.f3816b);
        h0.w(sb, ", sourceId=", this.f3817c, ", name=", this.f3818d);
        h0.w(sb, ", docName=", this.f3819e, ", documentUri=", this.f3820f);
        sb.append(", zipInnerPath=");
        sb.append(this.f3821g);
        sb.append(")");
        return sb.toString();
    }
}
