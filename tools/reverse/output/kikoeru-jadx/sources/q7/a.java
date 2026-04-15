package q7;

import ef.n;
import java.io.IOException;
import java.util.Locale;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements z7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8.a f17892a;

    public a(a8.a aVar) {
        l.e(aVar, "db");
        this.f17892a = aVar;
    }

    @Override // z7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g d0(String str) {
        String strSubstring;
        int i10;
        l.e(str, "sql");
        a8.a aVar = this.f17892a;
        l.e(aVar, "db");
        String upperCase = n.X0(str).toString().toUpperCase(Locale.ROOT);
        l.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i11 = -1;
        if (length >= 0) {
            int iV0 = 0;
            loop0: while (iV0 < length) {
                char cCharAt = upperCase.charAt(iV0);
                if (l.g(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iV02 = iV0 + 1;
                            if (upperCase.charAt(iV02) == '*') {
                                do {
                                    iV02 = n.v0(upperCase, '*', iV02 + 1, 4);
                                    if (iV02 >= 0) {
                                        i10 = iV02 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i10) != '/');
                                iV0 = iV02 + 2;
                            }
                        }
                        i11 = iV0;
                        break;
                    }
                    if (upperCase.charAt(iV0 + 1) == '-') {
                        iV0 = n.v0(upperCase, '\n', iV0 + 2, 4);
                        if (iV0 < 0) {
                            break;
                        }
                    } else {
                        i11 = iV0;
                        break;
                    }
                }
                iV0++;
            }
        }
        if (i11 < 0 || i11 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i11, Math.min(i11 + 3, upperCase.length()));
            l.d(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new f(aVar, str);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new f(aVar, str);
        }
        e eVar = new e(aVar, str);
        eVar.f17900d = new int[0];
        eVar.f17901e = new long[0];
        eVar.f17902f = new double[0];
        eVar.f17903g = new String[0];
        eVar.f17904h = new byte[0][];
        return eVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f17892a.close();
    }
}
