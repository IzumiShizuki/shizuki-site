package ef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import q.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends u {
    public static int A0(CharSequence charSequence, char c3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = s0(charSequence);
        }
        jc.l.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, i10);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(vb.l.H0(cArr), i10);
        }
        int iS0 = s0(charSequence);
        if (i10 > iS0) {
            i10 = iS0;
        }
        while (-1 < i10) {
            if (gh.g.v(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static int B0(String str, int i10, int i11, String str2) {
        if ((i11 & 2) != 0) {
            i10 = s0(str);
        }
        jc.l.e(str, "<this>");
        jc.l.e(str2, "string");
        return str.lastIndexOf(str2, i10);
    }

    public static String C0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        jc.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static df.j D0(CharSequence charSequence, String[] strArr) {
        return new df.j(charSequence, new a9.r(3, vb.l.c0(strArr)));
    }

    public static final boolean E0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        jc.l.e(charSequence, "<this>");
        jc.l.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!gh.g.v(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String F0(String str, String str2) {
        jc.l.e(str, "<this>");
        if (!u.k0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String G0(String str, String str2) {
        jc.l.e(str, "<this>");
        if (!r0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder H0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        jc.l.e(charSequence, "<this>");
        jc.l.e(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i10);
            sb.append(charSequence2);
            sb.append(charSequence, i11, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static String I0(String str, oc.d dVar) {
        jc.l.e(str, "<this>");
        if (dVar.isEmpty()) {
            return "";
        }
        String strSubstring = str.substring(dVar.f16307a, dVar.f16308b + 1);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List J0(CharSequence charSequence, String str) {
        int iT0 = t0(charSequence, str, 0, false);
        if (iT0 == -1) {
            return ud.b.w(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iT0).toString());
            length = str.length() + iT0;
            iT0 = t0(charSequence, str, length, false);
        } while (iT0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List K0(CharSequence charSequence, String[] strArr) {
        jc.l.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return J0(charSequence, str);
            }
        }
        df.j jVarD0 = D0(charSequence, strArr);
        ArrayList arrayList = new ArrayList(vb.n.K(new df.o(0, jVarD0), 10));
        Iterator it = jVarD0.iterator();
        while (it.hasNext()) {
            arrayList.add(N0(charSequence, (oc.d) it.next()));
        }
        return arrayList;
    }

    public static List L0(String str, char[] cArr) {
        jc.l.e(str, "<this>");
        if (cArr.length == 1) {
            return J0(str, String.valueOf(cArr[0]));
        }
        df.j jVar = new df.j(str, new a9.r(2, cArr));
        ArrayList arrayList = new ArrayList(vb.n.K(new df.o(0, jVar), 10));
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            arrayList.add(N0(str, (oc.d) it.next()));
        }
        return arrayList;
    }

    public static boolean M0(char c3, String str) {
        return str.length() > 0 && gh.g.v(str.charAt(0), c3, false);
    }

    public static final String N0(CharSequence charSequence, oc.d dVar) {
        jc.l.e(charSequence, "<this>");
        jc.l.e(dVar, "range");
        return charSequence.subSequence(dVar.f16307a, dVar.f16308b + 1).toString();
    }

    public static String O0(char c3, String str, String str2) {
        int iV0 = v0(str, c3, 0, 6);
        if (iV0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iV0 + 1, str.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String str, String str2) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "delimiter");
        jc.l.e(str, "missingDelimiterValue");
        int iW0 = w0(str, str2, 0, false, 6);
        if (iW0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iW0, str.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(char c3, String str, String str2) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "missingDelimiterValue");
        int iA0 = A0(str, c3, 0, 6);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA0 + 1, str.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(String str, String str2) {
        jc.l.e(str, "<this>");
        jc.l.e(str, "missingDelimiterValue");
        int iB0 = B0(str, 0, 6, str2);
        if (iB0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iB0, str.length());
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(char c3, String str) {
        jc.l.e(str, "<this>");
        jc.l.e(str, "missingDelimiterValue");
        int iV0 = v0(str, c3, 0, 6);
        if (iV0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iV0);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T0(String str, String str2) {
        jc.l.e(str, "<this>");
        jc.l.e(str, "missingDelimiterValue");
        int iW0 = w0(str, str2, 0, false, 6);
        if (iW0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iW0);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U0(char c3, String str, String str2) {
        jc.l.e(str, "<this>");
        jc.l.e(str2, "missingDelimiterValue");
        int iA0 = A0(str, c3, 0, 6);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iA0);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V0(String str, String str2, String str3) {
        jc.l.e(str, "<this>");
        jc.l.e(str3, "missingDelimiterValue");
        int iB0 = B0(str, 0, 6, str2);
        if (iB0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iB0);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String W0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence X0(CharSequence charSequence) {
        jc.l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zE = gh.g.E(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zE) {
                    break;
                }
                length--;
            } else if (zE) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static String Y0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        jc.l.e(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i11]) {
                        break;
                    }
                    i11++;
                }
                if (!(i11 >= 0)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean n0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        jc.l.e(charSequence, "<this>");
        jc.l.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (w0(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (u0(charSequence, charSequence2, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean o0(CharSequence charSequence, char c3) {
        jc.l.e(charSequence, "<this>");
        return v0(charSequence, c3, 0, 2) >= 0;
    }

    public static String p0(int i10, String str) {
        jc.l.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean q0(char c3, String str) {
        jc.l.e(str, "<this>");
        return str.length() > 0 && gh.g.v(str.charAt(s0(str)), c3, false);
    }

    public static boolean r0(CharSequence charSequence, String str) {
        jc.l.e(charSequence, "<this>");
        return charSequence instanceof String ? u.c0((String) charSequence, str, false) : E0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int s0(CharSequence charSequence) {
        jc.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int t0(CharSequence charSequence, String str, int i10, boolean z10) {
        jc.l.e(charSequence, "<this>");
        jc.l.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? u0(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int u0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        oc.b bVar;
        CharSequence charSequence3 = charSequence2;
        int i12 = i10;
        int i13 = i11;
        if (z11) {
            int iS0 = s0(charSequence);
            if (i12 > iS0) {
                i12 = iS0;
            }
            if (i13 < 0) {
                i13 = 0;
            }
            bVar = new oc.b(i12, i13, -1);
        } else {
            if (i12 < 0) {
                i12 = 0;
            }
            int length = charSequence.length();
            if (i13 > length) {
                i13 = length;
            }
            bVar = new oc.d(i12, i13, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i14 = bVar.f16309c;
        int i15 = bVar.f16308b;
        int i16 = bVar.f16307a;
        if (z12 && (charSequence3 instanceof String)) {
            if ((i14 > 0 && i16 <= i15) || (i14 < 0 && i15 <= i16)) {
                int i17 = i16;
                while (true) {
                    String str = (String) charSequence3;
                    if (!u.f0(str, 0, (String) charSequence, i17, str.length(), z10)) {
                        if (i17 == i15) {
                            break;
                        }
                        i17 += i14;
                    } else {
                        return i17;
                    }
                }
            }
        } else if ((i14 > 0 && i16 <= i15) || (i14 < 0 && i15 <= i16)) {
            int i18 = i16;
            while (!E0(charSequence3, 0, charSequence, i18, charSequence3.length(), z10)) {
                if (i18 != i15) {
                    i18 += i14;
                    charSequence3 = charSequence2;
                }
            }
            return i18;
        }
        return -1;
    }

    public static int v0(CharSequence charSequence, char c3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        jc.l.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c3}, i10, false) : ((String) charSequence).indexOf(c3, i10);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t0(charSequence, str, i10, z10);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        jc.l.e(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(vb.l.H0(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iS0 = s0(charSequence);
        if (i10 > iS0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c3 : cArr) {
                if (gh.g.v(c3, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iS0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean y0(CharSequence charSequence) {
        jc.l.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!gh.g.E(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static char z0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(s0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
