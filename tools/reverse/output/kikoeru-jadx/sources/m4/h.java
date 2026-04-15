package m4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f14224h = new h(1, 2, 3, null, -1, -1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14230n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14237g;

    static {
        int i10 = p4.c0.f16548a;
        f14225i = Integer.toString(0, 36);
        f14226j = Integer.toString(1, 36);
        f14227k = Integer.toString(2, 36);
        f14228l = Integer.toString(3, 36);
        f14229m = Integer.toString(4, 36);
        f14230n = Integer.toString(5, 36);
    }

    public h(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f14231a = i10;
        this.f14232b = i11;
        this.f14233c = i12;
        this.f14234d = bArr;
        this.f14235e = i13;
        this.f14236f = i14;
    }

    public static String a(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? q.t0.B(i10, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? q.t0.B(i10, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? q.t0.B(i10, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(h hVar) {
        if (hVar == null) {
            return true;
        }
        int i10 = hVar.f14231a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = hVar.f14232b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = hVar.f14233c;
        if ((i12 != -1 && i12 != 3) || hVar.f14234d != null) {
            return false;
        }
        int i13 = hVar.f14236f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = hVar.f14235e;
        return i14 == -1 || i14 == 8;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f14231a == -1 || this.f14232b == -1 || this.f14233c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f14231a == hVar.f14231a && this.f14232b == hVar.f14232b && this.f14233c == hVar.f14233c && Arrays.equals(this.f14234d, hVar.f14234d) && this.f14235e == hVar.f14235e && this.f14236f == hVar.f14236f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14237g == 0) {
            this.f14237g = ((((Arrays.hashCode(this.f14234d) + ((((((527 + this.f14231a) * 31) + this.f14232b) * 31) + this.f14233c) * 31)) * 31) + this.f14235e) * 31) + this.f14236f;
        }
        return this.f14237g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f14231a));
        sb.append(", ");
        sb.append(a(this.f14232b));
        sb.append(", ");
        sb.append(c(this.f14233c));
        sb.append(", ");
        sb.append(this.f14234d != null);
        sb.append(", ");
        String str2 = "NA";
        int i10 = this.f14235e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i11 = this.f14236f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return j2.h0.n(sb, str2, ")");
    }
}
