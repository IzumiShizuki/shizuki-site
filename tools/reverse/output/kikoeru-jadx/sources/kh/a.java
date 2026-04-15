package kh;

import ef.n;
import java.io.EOFException;
import jc.l;
import lh.f;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11391a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i10, int i11, String str2, int i12) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z10 = (i12 & 8) == 0;
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        boolean z13 = (i12 & 64) == 0;
        l.e(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || n.o0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z12)))) {
                f fVar = new f();
                fVar.j0(i13, iCharCount, str);
                f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i14 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fVar.k0("+");
                        } else if (iCodePointAt2 == 43 && z12) {
                            fVar.k0(z10 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i14 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z13) && !n.o0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z10 && (!z11 || b(iCharCount, length, str))))) {
                                    fVar.l0(iCodePointAt2);
                                }
                            }
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.l0(iCodePointAt2);
                            while (!fVar2.i()) {
                                byte b10 = fVar2.readByte();
                                fVar.e0(37);
                                char[] cArr = f11391a;
                                fVar.e0(cArr[((b10 & 255) >> 4) & 15]);
                                fVar.e0(cArr[b10 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                }
                return fVar.L();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean b(int i10, int i11, String str) {
        l.e(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && e.m(str.charAt(i10 + 1)) != -1 && e.m(str.charAt(i12)) != -1;
    }

    public static String c(int i10, int i11, int i12, String str) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z10 = (i12 & 4) == 0;
        l.e(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                f fVar = new f();
                fVar.j0(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iM = e.m(str.charAt(iCharCount + 1));
                        int iM2 = e.m(str.charAt(i13));
                        if (iM == -1 || iM2 == -1) {
                            fVar.l0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fVar.e0((iM << 4) + iM2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        fVar.e0(32);
                        iCharCount++;
                    } else {
                        fVar.l0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return fVar.L();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        l.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
