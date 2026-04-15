package ef;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends t {
    public static boolean c0(String str, String str2, boolean z10) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "suffix");
        return !z10 ? str.endsWith(str2) : f0(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean d0(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void e0(String str) {
        throw new NumberFormatException(a0.c.G('\'', "Invalid number format: '", str));
    }

    public static boolean f0(String str, int i10, String str2, int i11, int i12, boolean z10) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String g0(int i10, String str) {
        jc.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        jc.l.b(string);
        return string;
    }

    public static String h0(String str, String str2, String str3, boolean z10) {
        jc.l.e(str, "<this>");
        int i10 = 0;
        int iT0 = n.t0(str, str2, 0, z10);
        if (iT0 < 0) {
            return str;
        }
        int length = str2.length();
        int i11 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i10, iT0);
            sb.append(str3);
            i10 = iT0 + length;
            if (iT0 >= str.length()) {
                break;
            }
            iT0 = n.t0(str, str2, iT0 + i11, z10);
        } while (iT0 > 0);
        sb.append((CharSequence) str, i10, str.length());
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public static String i0(String str, char c3, char c10) {
        jc.l.e(str, "<this>");
        String strReplace = str.replace(c3, c10);
        jc.l.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean j0(String str, int i10, String str2, boolean z10) {
        jc.l.e(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : f0(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean k0(String str, String str2, boolean z10) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : f0(str, 0, str2, 0, str2.length(), z10);
    }

    public static Integer l0(String str) {
        boolean z10;
        int i10;
        int i11;
        jc.l.e(str, "<this>");
        gh.g.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (jc.l.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long m0(String str) {
        boolean z10;
        jc.l.e(str, "<this>");
        gh.g.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (jc.l.g(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                i10 = 1;
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j10 / ((long) 10);
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * ((long) 10);
            long j14 = iDigit;
            if (j13 < j10 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
