package m4;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f14291a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14294d;

    static {
        int i10 = p4.c0.f16548a;
        f14292b = Integer.toString(0, 36);
        f14293c = Integer.toString(1, 36);
        f14294d = Integer.toString(2, 36);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, f1 f1Var, h1 h1Var, int i11, boolean z10) {
        int i12 = f(i10, f1Var, false).f14203c;
        if (m(i12, h1Var, 0L).f14276o != i10) {
            return i10 + 1;
        }
        int iE = e(i12, i11, z10);
        if (iE == -1) {
            return -1;
        }
        return m(iE, h1Var, 0L).f14275n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof i1) {
                i1 i1Var = (i1) obj;
                if (i1Var.o() == o() && i1Var.h() == h()) {
                    h1 h1Var = new h1();
                    f1 f1Var = new f1();
                    h1 h1Var2 = new h1();
                    f1 f1Var2 = new f1();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= o()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= h()) {
                                    int iA = a(true);
                                    if (iA == i1Var.a(true) && (iC = c(true)) == i1Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == i1Var.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i11, f1Var, true).equals(i1Var.f(i11, f1Var2, true))) {
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            if (!m(i10, h1Var, 0L).equals(i1Var.m(i10, h1Var2, 0L))) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract f1 f(int i10, f1 f1Var, boolean z10);

    public f1 g(Object obj, f1 f1Var) {
        return f(b(obj), f1Var, true);
    }

    public abstract int h();

    public int hashCode() {
        h1 h1Var = new h1();
        f1 f1Var = new f1();
        int iO = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            iO = (iO * 31) + m(i10, h1Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            iH = (iH * 31) + f(i11, f1Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(h1 h1Var, f1 f1Var, int i10, long j10) {
        Pair pairJ = j(h1Var, f1Var, i10, j10, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(h1 h1Var, f1 f1Var, int i10, long j10, long j11) {
        p4.c.f(i10, o());
        m(i10, h1Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = h1Var.f14273l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = h1Var.f14275n;
        f(i11, f1Var, false);
        while (i11 < h1Var.f14276o && f1Var.f14205e != j10) {
            int i12 = i11 + 1;
            if (f(i12, f1Var, false).f14205e > j10) {
                break;
            }
            i11 = i12;
        }
        f(i11, f1Var, true);
        long jMin = j10 - f1Var.f14205e;
        long j12 = f1Var.f14204d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = f1Var.f14202b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i10);

    public abstract h1 m(int i10, h1 h1Var, long j10);

    public final void n(int i10, h1 h1Var) {
        m(i10, h1Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
