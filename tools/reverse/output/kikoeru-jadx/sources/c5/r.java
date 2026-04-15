package c5;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3557f;

    public r(int i10, int i11, String str, String str2, String str3, String str4) {
        this.f3552a = i10;
        this.f3553b = i11;
        this.f3554c = str;
        this.f3555d = str2;
        this.f3556e = str3;
        this.f3557f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f3552a == rVar.f3552a && this.f3553b == rVar.f3553b && TextUtils.equals(this.f3554c, rVar.f3554c) && TextUtils.equals(this.f3555d, rVar.f3555d) && TextUtils.equals(this.f3556e, rVar.f3556e) && TextUtils.equals(this.f3557f, rVar.f3557f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f3552a * 31) + this.f3553b) * 31;
        String str = this.f3554c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3555d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3556e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3557f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
