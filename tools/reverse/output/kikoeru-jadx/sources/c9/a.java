package c9;

import j2.h0;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3771f;

    public a(int i10, String str, String str2, String str3, String str4, long j10) {
        l.e(str, "server");
        l.e(str2, "username");
        l.e(str3, "password");
        l.e(str4, "token");
        this.f3766a = i10;
        this.f3767b = str;
        this.f3768c = str2;
        this.f3769d = str3;
        this.f3770e = str4;
        this.f3771f = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3766a == aVar.f3766a && l.a(this.f3767b, aVar.f3767b) && l.a(this.f3768c, aVar.f3768c) && l.a(this.f3769d, aVar.f3769d) && l.a(this.f3770e, aVar.f3770e) && this.f3771f == aVar.f3771f;
    }

    public final int hashCode() {
        int iE = h0.e(h0.e(h0.e(h0.e(this.f3766a * 31, 31, this.f3767b), 31, this.f3768c), 31, this.f3769d), 31, this.f3770e);
        long j10 = this.f3771f;
        return iE + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountBean(id=");
        sb.append(this.f3766a);
        sb.append(", server=");
        sb.append(this.f3767b);
        sb.append(", username=");
        h0.w(sb, this.f3768c, ", password=", this.f3769d, ", token=");
        sb.append(this.f3770e);
        sb.append(", timestamp=");
        sb.append(this.f3771f);
        sb.append(")");
        return sb.toString();
    }
}
