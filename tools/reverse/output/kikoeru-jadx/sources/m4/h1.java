package m4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f14252q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f14253r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i0 f14254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f14255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f14256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f14257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f14258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f14259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f14260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f14261z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14263b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f14271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14274m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14275n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14277p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14262a = f14252q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f14264c = f14254s;

    static {
        d0 d0Var;
        w wVar = new w();
        z zVar = new z();
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var = ya.a1.f25946e;
        b0 b0Var = new b0();
        e0 e0Var = e0.f14187d;
        Uri uri = Uri.EMPTY;
        p4.c.i(((Uri) zVar.f14645e) == null || ((UUID) zVar.f14644d) != null);
        a0 a0Var = null;
        if (uri != null) {
            if (((UUID) zVar.f14644d) != null) {
                a0Var = new a0(zVar);
            }
            d0Var = new d0(uri, null, a0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            d0Var = null;
        }
        f14254s = new i0("androidx.media3.common.Timeline", new y(wVar), d0Var, new c0(b0Var), l0.K, e0Var);
        f14255t = Integer.toString(1, 36);
        f14256u = Integer.toString(2, 36);
        f14257v = Integer.toString(3, 36);
        f14258w = Integer.toString(4, 36);
        f14259x = Integer.toString(5, 36);
        f14260y = Integer.toString(6, 36);
        f14261z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.f14271j != null;
    }

    public final void b(Object obj, i0 i0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, c0 c0Var, long j13, long j14, int i10, int i11, long j15) {
        this.f14262a = obj;
        this.f14264c = i0Var != null ? i0Var : f14254s;
        if (i0Var != null) {
            d0 d0Var = i0Var.f14286b;
        }
        this.f14263b = null;
        this.f14265d = obj2;
        this.f14266e = j10;
        this.f14267f = j11;
        this.f14268g = j12;
        this.f14269h = z10;
        this.f14270i = z11;
        this.f14271j = c0Var;
        this.f14273l = j13;
        this.f14274m = j14;
        this.f14275n = i10;
        this.f14276o = i11;
        this.f14277p = j15;
        this.f14272k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class.equals(obj.getClass())) {
            h1 h1Var = (h1) obj;
            if (Objects.equals(this.f14262a, h1Var.f14262a) && Objects.equals(this.f14264c, h1Var.f14264c) && Objects.equals(this.f14265d, h1Var.f14265d) && Objects.equals(this.f14271j, h1Var.f14271j) && this.f14266e == h1Var.f14266e && this.f14267f == h1Var.f14267f && this.f14268g == h1Var.f14268g && this.f14269h == h1Var.f14269h && this.f14270i == h1Var.f14270i && this.f14272k == h1Var.f14272k && this.f14273l == h1Var.f14273l && this.f14274m == h1Var.f14274m && this.f14275n == h1Var.f14275n && this.f14276o == h1Var.f14276o && this.f14277p == h1Var.f14277p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14264c.hashCode() + ((this.f14262a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f14265d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        c0 c0Var = this.f14271j;
        int iHashCode3 = (iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        long j10 = this.f14266e;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14267f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f14268g;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f14269h ? 1 : 0)) * 31) + (this.f14270i ? 1 : 0)) * 31) + (this.f14272k ? 1 : 0)) * 31;
        long j13 = this.f14273l;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f14274m;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f14275n) * 31) + this.f14276o) * 31;
        long j15 = this.f14277p;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
