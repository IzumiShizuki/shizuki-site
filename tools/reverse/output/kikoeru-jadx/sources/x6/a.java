package x6;

import java.util.regex.Pattern;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f24782c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f24783d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f24784a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f24785b = new StringBuilder();

    public static String a(s sVar, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int i10 = sVar.f16612b;
        int i11 = sVar.f16613c;
        while (i10 < i11 && !z10) {
            char c3 = (char) sVar.f16611a[i10];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb.append(c3);
            }
        }
        sVar.H(i10 - sVar.f16612b);
        return sb.toString();
    }

    public static String b(s sVar, StringBuilder sb) {
        c(sVar);
        if (sVar.a() == 0) {
            return null;
        }
        String strA = a(sVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) sVar.u());
    }

    public static void c(s sVar) {
        while (true) {
            for (boolean z10 = true; sVar.a() > 0 && z10; z10 = false) {
                int i10 = sVar.f16612b;
                byte[] bArr = sVar.f16611a;
                byte b10 = bArr[i10];
                char c3 = (char) b10;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    sVar.H(1);
                } else {
                    int i11 = sVar.f16613c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            sVar.H(i11 - sVar.f16612b);
                        }
                    }
                }
            }
            return;
        }
    }
}
