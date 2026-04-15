package wg;

import ef.n;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import jc.l;
import lh.h;
import lh.w;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f24227a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f24228b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.e.<clinit>():void");
    }

    public static final void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void b(Closeable closeable) {
        l.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void c(lh.l lVar, y yVar) throws IOException {
        l.e(lVar, "<this>");
        try {
            IOException iOException = null;
            for (y yVar2 : lVar.u(yVar)) {
                try {
                    if (lVar.y(yVar2).f12584b) {
                        c(lVar, yVar2);
                    }
                    lVar.n(yVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(xg.f fVar, y yVar) {
        l.e(fVar, "<this>");
        l.e(yVar, "path");
        try {
            fVar.n(yVar);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(String str, char c3, int i10, int i11) {
        l.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, String str2) {
        l.e(str, "<this>");
        while (i10 < i11) {
            if (n.o0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        l.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int h(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (l.g(cCharAt, 31) <= 0 || l.g(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int i(int i10, int i11, String str) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int j(int i10, int i11, String str) {
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        l.e(strArr, "<this>");
        l.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        l.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int m(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final int n(h hVar) {
        l.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final int o(int i10, String str) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String p(int i10, int i11, String str) {
        int i12 = i(i10, i11, str);
        String strSubstring = str.substring(i12, j(i12, i11, str));
        l.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
