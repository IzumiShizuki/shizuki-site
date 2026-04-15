package ug;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ef.l f21877c = new ef.l("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ef.l f21878d = new ef.l(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f21880b;

    public v(String str, String str2, String str3, String[] strArr) {
        jc.l.e(str, "mediaType");
        jc.l.e(strArr, "parameterNamesAndValues");
        this.f21879a = str;
        this.f21880b = strArr;
    }

    public static Charset a(v vVar) {
        String str;
        String[] strArr = vVar.f21880b;
        int i10 = 0;
        int iX = gh.g.x(0, strArr.length - 1, 2);
        if (iX < 0) {
            str = null;
            break;
        }
        while (!ef.u.d0(strArr[i10], "charset", true)) {
            if (i10 == iX) {
                str = null;
                break;
            }
            i10 += 2;
        }
        str = strArr[i10 + 1];
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && jc.l.a(((v) obj).f21879a, this.f21879a);
    }

    public final int hashCode() {
        return this.f21879a.hashCode();
    }

    public final String toString() {
        return this.f21879a;
    }
}
