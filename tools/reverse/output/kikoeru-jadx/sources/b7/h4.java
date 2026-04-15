package b7;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m4.x0 f1819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h4 f1820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f1824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f1825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f1828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f1830v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.x0 f1831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f1839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1840j;

    static {
        m4.x0 x0Var = new m4.x0(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f1819k = x0Var;
        f1820l = new h4(x0Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        int i10 = p4.c0.f16548a;
        f1821m = Integer.toString(0, 36);
        f1822n = Integer.toString(1, 36);
        f1823o = Integer.toString(2, 36);
        f1824p = Integer.toString(3, 36);
        f1825q = Integer.toString(4, 36);
        f1826r = Integer.toString(5, 36);
        f1827s = Integer.toString(6, 36);
        f1828t = Integer.toString(7, 36);
        f1829u = Integer.toString(8, 36);
        f1830v = Integer.toString(9, 36);
    }

    public h4(m4.x0 x0Var, boolean z10, long j10, long j11, long j12, int i10, long j13, long j14, long j15, long j16) {
        p4.c.c(z10 == (x0Var.f14638h != -1));
        this.f1831a = x0Var;
        this.f1832b = z10;
        this.f1833c = j10;
        this.f1834d = j11;
        this.f1835e = j12;
        this.f1836f = i10;
        this.f1837g = j13;
        this.f1838h = j14;
        this.f1839i = j15;
        this.f1840j = j16;
    }

    public static h4 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f1821m);
        return new h4(bundle2 == null ? f1819k : m4.x0.c(bundle2), bundle.getBoolean(f1822n, false), bundle.getLong(f1823o, -9223372036854775807L), bundle.getLong(f1824p, -9223372036854775807L), bundle.getLong(f1825q, 0L), bundle.getInt(f1826r, 0), bundle.getLong(f1827s, 0L), bundle.getLong(f1828t, -9223372036854775807L), bundle.getLong(f1829u, -9223372036854775807L), bundle.getLong(f1830v, 0L));
    }

    public final h4 a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new h4(this.f1831a.b(z10, z11), z10 && this.f1832b, this.f1833c, z10 ? this.f1834d : -9223372036854775807L, z10 ? this.f1835e : 0L, z10 ? this.f1836f : 0, z10 ? this.f1837g : 0L, z10 ? this.f1838h : -9223372036854775807L, z10 ? this.f1839i : -9223372036854775807L, z10 ? this.f1840j : 0L);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        m4.x0 x0Var = this.f1831a;
        if (i10 < 3 || !f1819k.a(x0Var)) {
            bundle.putBundle(f1821m, x0Var.d(i10));
        }
        boolean z10 = this.f1832b;
        if (z10) {
            bundle.putBoolean(f1822n, z10);
        }
        long j10 = this.f1833c;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f1823o, j10);
        }
        long j11 = this.f1834d;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f1824p, j11);
        }
        long j12 = this.f1835e;
        if (i10 < 3 || j12 != 0) {
            bundle.putLong(f1825q, j12);
        }
        int i11 = this.f1836f;
        if (i11 != 0) {
            bundle.putInt(f1826r, i11);
        }
        long j13 = this.f1837g;
        if (j13 != 0) {
            bundle.putLong(f1827s, j13);
        }
        long j14 = this.f1838h;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f1828t, j14);
        }
        long j15 = this.f1839i;
        if (j15 != -9223372036854775807L) {
            bundle.putLong(f1829u, j15);
        }
        long j16 = this.f1840j;
        if (i10 >= 3 && j16 == 0) {
            return bundle;
        }
        bundle.putLong(f1830v, j16);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h4.class == obj.getClass()) {
            h4 h4Var = (h4) obj;
            if (this.f1833c == h4Var.f1833c && this.f1831a.equals(h4Var.f1831a) && this.f1832b == h4Var.f1832b && this.f1834d == h4Var.f1834d && this.f1835e == h4Var.f1835e && this.f1836f == h4Var.f1836f && this.f1837g == h4Var.f1837g && this.f1838h == h4Var.f1838h && this.f1839i == h4Var.f1839i && this.f1840j == h4Var.f1840j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1831a, Boolean.valueOf(this.f1832b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        m4.x0 x0Var = this.f1831a;
        sb.append(x0Var.f14632b);
        sb.append(", periodIndex=");
        sb.append(x0Var.f14635e);
        sb.append(", positionMs=");
        sb.append(x0Var.f14636f);
        sb.append(", contentPositionMs=");
        sb.append(x0Var.f14637g);
        sb.append(", adGroupIndex=");
        sb.append(x0Var.f14638h);
        sb.append(", adIndexInAdGroup=");
        sb.append(x0Var.f14639i);
        sb.append("}, isPlayingAd=");
        sb.append(this.f1832b);
        sb.append(", eventTimeMs=");
        sb.append(this.f1833c);
        sb.append(", durationMs=");
        sb.append(this.f1834d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.f1835e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f1836f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.f1837g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.f1838h);
        sb.append(", contentDurationMs=");
        sb.append(this.f1839i);
        sb.append(", contentBufferedPositionMs=");
        return a0.c.H(this.f1840j, "}", sb);
    }
}
