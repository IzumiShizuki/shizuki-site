package v7;

import ef.n;
import ef.o;
import java.util.Locale;
import jc.l;
import ud.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22774g;

    public f(int i10, int i11, String str, String str2, String str3, boolean z10) {
        l.e(str, "name");
        l.e(str2, "type");
        this.f22768a = str;
        this.f22769b = str2;
        this.f22770c = z10;
        this.f22771d = i10;
        this.f22772e = str3;
        this.f22773f = i11;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        l.d(upperCase, "toUpperCase(...)");
        this.f22774g = n.n0(upperCase, "INT", false) ? 3 : (n.n0(upperCase, "CHAR", false) || n.n0(upperCase, "CLOB", false) || n.n0(upperCase, "TEXT", false)) ? 2 : n.n0(upperCase, "BLOB", false) ? 5 : (n.n0(upperCase, "REAL", false) || n.n0(upperCase, "FLOA", false) || n.n0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                boolean z10 = this.f22771d > 0;
                f fVar = (f) obj;
                int i10 = fVar.f22773f;
                if (z10 == (fVar.f22771d > 0) && l.a(this.f22768a, fVar.f22768a) && this.f22770c == fVar.f22770c) {
                    String str = fVar.f22772e;
                    int i11 = this.f22773f;
                    String str2 = this.f22772e;
                    if ((i11 != 1 || i10 != 2 || str2 == null || s.l(str2, str)) && ((i11 != 2 || i10 != 1 || str == null || s.l(str, str2)) && ((i11 == 0 || i11 != i10 || (str2 == null ? str == null : s.l(str2, str))) && this.f22774g == fVar.f22774g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f22768a.hashCode() * 31) + this.f22774g) * 31) + (this.f22770c ? 1231 : 1237)) * 31) + this.f22771d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f22768a);
        sb.append("',\n            |   type = '");
        sb.append(this.f22769b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f22774g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f22770c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f22771d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f22772e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return o.Y(o.a0(sb.toString()));
    }
}
