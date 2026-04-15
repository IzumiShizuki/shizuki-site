package m4;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f14083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f14084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f14085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f14086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f14087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f14088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f14089v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f14093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0[] f14094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f14095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f14096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f14097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f14100k;

    static {
        int i10 = p4.c0.f16548a;
        f14079l = Integer.toString(0, 36);
        f14080m = Integer.toString(1, 36);
        f14081n = Integer.toString(2, 36);
        f14082o = Integer.toString(3, 36);
        f14083p = Integer.toString(4, 36);
        f14084q = Integer.toString(5, 36);
        f14085r = Integer.toString(6, 36);
        f14086s = Integer.toString(7, 36);
        f14087t = Integer.toString(8, 36);
        f14088u = Integer.toString(9, 36);
        f14089v = Integer.toString(10, 36);
    }

    public a(long j10, int i10, int i11, int[] iArr, i0[] i0VarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
        Uri uri;
        int i12 = 0;
        p4.c.c(iArr.length == i0VarArr.length);
        this.f14090a = j10;
        this.f14091b = i10;
        this.f14092c = i11;
        this.f14095f = iArr;
        this.f14094e = i0VarArr;
        this.f14096g = jArr;
        this.f14098i = j11;
        this.f14099j = z10;
        this.f14093d = new Uri[i0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f14093d;
            if (i12 >= uriArr.length) {
                this.f14097h = strArr;
                this.f14100k = z11;
                return;
            }
            i0 i0Var = i0VarArr[i12];
            if (i0Var == null) {
                uri = null;
            } else {
                d0 d0Var = i0Var.f14286b;
                d0Var.getClass();
                uri = d0Var.f14178a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f14095f;
            if (i12 >= iArr.length || this.f14099j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14090a == aVar.f14090a && this.f14091b == aVar.f14091b && this.f14092c == aVar.f14092c && Arrays.equals(this.f14094e, aVar.f14094e) && Arrays.equals(this.f14095f, aVar.f14095f) && Arrays.equals(this.f14096g, aVar.f14096g) && this.f14098i == aVar.f14098i && this.f14099j == aVar.f14099j && Arrays.equals(this.f14097h, aVar.f14097h) && this.f14100k == aVar.f14100k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.f14091b * 31) + this.f14092c) * 31;
        long j10 = this.f14090a;
        int iHashCode = (Arrays.hashCode(this.f14096g) + ((Arrays.hashCode(this.f14095f) + ((Arrays.hashCode(this.f14094e) + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j11 = this.f14098i;
        return ((((((iHashCode + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f14099j ? 1 : 0)) * 31) + Arrays.hashCode(this.f14097h)) * 31) + (this.f14100k ? 1 : 0);
    }
}
