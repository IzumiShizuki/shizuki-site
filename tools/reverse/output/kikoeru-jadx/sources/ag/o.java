package ag;

import java.util.List;
import q.t0;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class o {
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f350g;

    public o(int i10, String str, List list, int i11, int i12, List list2, String str2, String str3) {
        if (15 != (i10 & 15)) {
            z0.i(i10, 15, m.f343b);
            throw null;
        }
        this.f344a = str;
        this.f345b = list;
        this.f346c = i11;
        this.f347d = i12;
        if ((i10 & 16) == 0) {
            this.f348e = vb.r.f22819a;
        } else {
            this.f348e = list2;
        }
        if ((i10 & 32) == 0) {
            this.f349f = null;
        } else {
            this.f349f = str2;
        }
        if ((i10 & 64) == 0) {
            this.f350g = null;
        } else {
            this.f350g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jc.l.a(this.f344a, oVar.f344a) && jc.l.a(this.f345b, oVar.f345b) && this.f346c == oVar.f346c && this.f347d == oVar.f347d && jc.l.a(this.f348e, oVar.f348e) && jc.l.a(this.f349f, oVar.f349f) && jc.l.a(this.f350g, oVar.f350g);
    }

    public final int hashCode() {
        int iZ = t0.z((((t0.z(this.f344a.hashCode() * 31, 31, this.f345b) + this.f346c) * 31) + this.f347d) * 31, 31, this.f348e);
        String str = this.f349f;
        int iHashCode = (iZ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f350g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularBean(keyword=");
        sb.append(this.f344a);
        sb.append(", localSubtitledWorks=");
        sb.append(this.f345b);
        sb.append(", page=");
        sb.append(this.f346c);
        sb.append(", subtitle=");
        sb.append(this.f347d);
        sb.append(", withPlaylistStatus=");
        sb.append(this.f348e);
        sb.append(", recommenderUuid=");
        sb.append(this.f349f);
        sb.append(", itemId=");
        return t0.E(sb, this.f350g, ')');
    }

    public o(String str, List list, int i10, int i11, String str2, String str3, int i12) {
        str2 = (i12 & 32) != 0 ? null : str2;
        str3 = (i12 & 64) != 0 ? null : str3;
        this.f344a = str;
        this.f345b = list;
        this.f346c = i10;
        this.f347d = i11;
        this.f348e = vb.r.f22819a;
        this.f349f = str2;
        this.f350g = str3;
    }
}
