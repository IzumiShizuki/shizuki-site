package ff;

import ef.n;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f7056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7057d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7058a;

    static {
        int i10 = b.f7059a;
        f7055b = f.e(4611686018427387903L);
        f7056c = f.e(-4611686018427387903L);
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return f.e(nh.b.l(j14, -4611686018427387903L, 4611686018427387903L));
        }
        return f.g((j14 * j12) + (j11 - (j13 * j12)));
    }

    public static final void b(StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strC0 = n.C0(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strC0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strC0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb.append((CharSequence) strC0, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strC0, 0, i15);
            }
        }
        sb.append(str);
    }

    public static int c(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return l.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return j10 < 0 ? -i10 : i10;
    }

    public static final long d(long j10) {
        return ((((int) j10) & 1) != 1 || f(j10)) ? h(j10, c.MILLISECONDS) : j10 >> 1;
    }

    public static final int e(long j10) {
        if (f(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? ((j10 >> 1) % ((long) 1000)) * ((long) 1000000) : (j10 >> 1) % ((long) 1000000000));
    }

    public static final boolean f(long j10) {
        return j10 == f7055b || j10 == f7056c;
    }

    public static final long g(long j10, long j11) {
        if (f(j10)) {
            if (!f(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        return i10 == 0 ? (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? f.e(j12 / ((long) 1000000)) : f.g(j12) : f.f(j12);
    }

    public static final long h(long j10, c cVar) {
        l.e(cVar, "unit");
        if (j10 == f7055b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f7056c) {
            return Long.MIN_VALUE;
        }
        return f.c(j10 >> 1, (((int) j10) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, cVar);
    }

    public static final long i(long j10) {
        long j11 = ((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1));
        int i10 = b.f7059a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f7058a, ((a) obj).f7058a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f7058a == ((a) obj).f7058a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7058a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        long j10;
        int iH;
        long jI = this.f7058a;
        if (jI == 0) {
            return "0s";
        }
        if (jI == f7055b) {
            return "Infinity";
        }
        if (jI == f7056c) {
            return "-Infinity";
        }
        int i10 = 0;
        boolean z10 = jI < 0;
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append('-');
        }
        if (jI < 0) {
            jI = i(jI);
        }
        long jH = h(jI, c.DAYS);
        int iH2 = f(jI) ? 0 : (int) (h(jI, c.HOURS) % ((long) 24));
        if (f(jI)) {
            j10 = 0;
            iH = 0;
        } else {
            j10 = 0;
            iH = (int) (h(jI, c.MINUTES) % ((long) 60));
        }
        int iH3 = f(jI) ? 0 : (int) (h(jI, c.SECONDS) % ((long) 60));
        int iE = e(jI);
        boolean z11 = jH != j10;
        boolean z12 = iH2 != 0;
        boolean z13 = iH != 0;
        boolean z14 = (iH3 == 0 && iE == 0) ? false : true;
        if (z11) {
            sb.append(jH);
            sb.append('d');
            i10 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('h');
            i10 = i11;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('m');
            i10 = i12;
        }
        if (z14) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z11 || z12 || z13) {
                b(sb, iH3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (z10 && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
