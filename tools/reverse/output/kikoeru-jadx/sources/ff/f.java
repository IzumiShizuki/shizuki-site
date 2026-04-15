package ff;

import com.tencent.bugly.BuglyStrategy;
import ef.n;
import ef.u;
import ic.k;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7072a = {1, 10, 100, 1000, 10000, BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7073b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7074c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7075d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        c cVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i10 = a.f7057d;
        char cCharAt2 = str.charAt(0);
        int i11 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z10 = i11 > 0 && n.M0('-', str);
        if (length <= i11) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i11) != 'P') {
            throw new IllegalArgumentException();
        }
        int i12 = i11 + 1;
        if (i12 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long jG = 0;
        boolean z11 = false;
        while (i12 < length) {
            if (str.charAt(i12) != 'T') {
                int i13 = i12;
                while (i13 < str.length() && (('0' <= (cCharAt = str.charAt(i13)) && cCharAt < ':') || n.o0("+-.", cCharAt))) {
                    i13++;
                }
                String strSubstring = str.substring(i12, i13);
                l.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i12;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i14 = length2 + 1;
                if (z11) {
                    if (cCharAt3 == 'H') {
                        cVar = c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iV0 = n.v0(strSubstring, '.', 0, 6);
                if (cVar != c.SECONDS || iV0 <= 0) {
                    jG = a.g(jG, n(l(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iV0);
                    l.d(strSubstring2, "substring(...)");
                    long jG2 = a.g(jG, n(l(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iV0);
                    l.d(strSubstring3, "substring(...)");
                    double d10 = Double.parseDouble(strSubstring3);
                    double dB = b(d10, cVar, c.NANOSECONDS);
                    if (Double.isNaN(dB)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jS = lc.b.S(dB);
                    jG = a.g(jG2, (-4611686018426999999L > jS || jS >= 4611686018427000000L) ? f(lc.b.S(b(d10, cVar, c.MILLISECONDS))) : g(jS));
                }
                cVar2 = cVar;
                i12 = i14;
            } else {
                if (z11 || (i12 = i12 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z11 = true;
            }
        }
        return z10 ? a.i(jG) : jG;
    }

    public static final double b(double d10, c cVar, c cVar2) {
        l.e(cVar2, "targetUnit");
        long jConvert = cVar2.f7067a.convert(1L, cVar.f7067a);
        return jConvert > 0 ? d10 * jConvert : d10 / r9.convert(1L, r10);
    }

    public static final long c(long j10, c cVar, c cVar2) {
        l.e(cVar, "sourceUnit");
        l.e(cVar2, "targetUnit");
        return cVar2.f7067a.convert(j10, cVar.f7067a);
    }

    public static final long d(long j10, c cVar, c cVar2) {
        l.e(cVar, "sourceUnit");
        l.e(cVar2, "targetUnit");
        return cVar2.f7067a.convert(j10, cVar.f7067a);
    }

    public static final long e(long j10) {
        long j11 = (j10 << 1) + 1;
        int i10 = a.f7057d;
        int i11 = b.f7059a;
        return j11;
    }

    public static final long f(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? e(nh.b.l(j10, -4611686018427387903L, 4611686018427387903L)) : g(j10 * ((long) 1000000));
    }

    public static final long g(long j10) {
        long j11 = j10 << 1;
        int i10 = a.f7057d;
        int i11 = b.f7059a;
        return j11;
    }

    public static final void h(StringBuilder sb, StringBuilder sb2, int i10) {
        if (i10 < 10) {
            sb.append('0');
        }
        sb2.append(i10);
    }

    public static final g i(String str, String str2, int i10, k kVar) {
        char cCharAt = str.charAt(i10);
        if (((Boolean) kVar.a(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return j(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i10);
    }

    public static final g j(String str, String str2) {
        return new g(0, str2 + " when parsing an Instant from \"" + o(64, str) + '\"', str);
    }

    public static final int k(int i10, String str) {
        return (str.charAt(i10 + 1) - '0') + ((str.charAt(i10) - '0') * 10);
    }

    public static final long l(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !n.o0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!u.k0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(n.p0(1, str));
    }

    public static final long m(int i10, c cVar) {
        l.e(cVar, "unit");
        return cVar.compareTo(c.SECONDS) <= 0 ? g(d(i10, cVar, c.NANOSECONDS)) : n(i10, cVar);
    }

    public static final long n(long j10, c cVar) {
        l.e(cVar, "unit");
        c cVar2 = c.NANOSECONDS;
        long jD = d(4611686018426999999L, cVar2, cVar);
        return ((-jD) > j10 || j10 > jD) ? e(nh.b.l(c(j10, cVar, c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : g(d(j10, cVar, cVar2));
    }

    public static final String o(int i10, String str) {
        if (str.length() <= i10) {
            return str.toString();
        }
        return str.subSequence(0, i10).toString() + "...";
    }
}
