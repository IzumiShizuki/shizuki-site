package d6;

import j2.h0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m4.k0;
import m4.m0;
import m4.o0;
import m4.q;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f5481h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f5474a = i10;
        this.f5475b = str;
        this.f5476c = str2;
        this.f5477d = i11;
        this.f5478e = i12;
        this.f5479f = i13;
        this.f5480g = i14;
        this.f5481h = bArr;
    }

    public static a d(s sVar) {
        int iG = sVar.g();
        String strP = o0.p(sVar.s(sVar.g(), StandardCharsets.US_ASCII));
        String strS = sVar.s(sVar.g(), StandardCharsets.UTF_8);
        int iG2 = sVar.g();
        int iG3 = sVar.g();
        int iG4 = sVar.g();
        int iG5 = sVar.g();
        int iG6 = sVar.g();
        byte[] bArr = new byte[iG6];
        sVar.e(bArr, 0, iG6);
        return new a(iG, strP, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // m4.m0
    public final void b(k0 k0Var) {
        k0Var.a(this.f5481h, this.f5474a);
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5474a == aVar.f5474a && this.f5475b.equals(aVar.f5475b) && this.f5476c.equals(aVar.f5476c) && this.f5477d == aVar.f5477d && this.f5478e == aVar.f5478e && this.f5479f == aVar.f5479f && this.f5480g == aVar.f5480g && Arrays.equals(this.f5481h, aVar.f5481h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5481h) + ((((((((h0.e(h0.e((527 + this.f5474a) * 31, 31, this.f5475b), 31, this.f5476c) + this.f5477d) * 31) + this.f5478e) * 31) + this.f5479f) * 31) + this.f5480g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f5475b + ", description=" + this.f5476c;
    }
}
