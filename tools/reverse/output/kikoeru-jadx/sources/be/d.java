package be;

import ef.n;
import ef.u;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f2746e = e.g("<root>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f2748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f2749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient e f2750d;

    static {
        l.d(Pattern.compile("\\."), "compile(...)");
    }

    public d(c cVar, String str) {
        l.e(str, "fqName");
        this.f2747a = str;
        this.f2748b = cVar;
    }

    public static final List f(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        List listF = f(dVar.e());
        listF.add(dVar.g());
        return listF;
    }

    public final d a(e eVar) {
        String strB;
        l.e(eVar, "name");
        if (c()) {
            strB = eVar.b();
        } else {
            strB = this.f2747a + '.' + eVar.b();
        }
        l.b(strB);
        return new d(strB, this, eVar);
    }

    public final void b() {
        String str = this.f2747a;
        int length = str.length() - 1;
        boolean z10 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                break;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f2750d = e.d(str);
            this.f2749c = c.f2743c.f2744a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        l.d(strSubstring, "substring(...)");
        this.f2750d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        l.d(strSubstring2, "substring(...)");
        this.f2749c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.f2747a.length() == 0;
    }

    public final boolean d() {
        return this.f2748b != null || n.v0(this.f2747a, '<', 0, 6) < 0;
    }

    public final d e() {
        d dVar = this.f2749c;
        if (dVar != null) {
            return dVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        d dVar2 = this.f2749c;
        l.b(dVar2);
        return dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return l.a(this.f2747a, ((d) obj).f2747a);
        }
        return false;
    }

    public final e g() {
        e eVar = this.f2750d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.f2750d;
        l.b(eVar2);
        return eVar2;
    }

    public final boolean h(e eVar) {
        l.e(eVar, "segment");
        if (!c()) {
            String str = this.f2747a;
            int iV0 = n.v0(str, '.', 0, 6);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            int i10 = iV0;
            String strB = eVar.b();
            l.d(strB, "asString(...)");
            if (i10 == strB.length() && u.f0(this.f2747a, 0, strB, 0, i10, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2747a.hashCode();
    }

    public final c i() {
        c cVar = this.f2748b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f2748b = cVar2;
        return cVar2;
    }

    public final String toString() {
        if (!c()) {
            return this.f2747a;
        }
        String strB = f2746e.b();
        l.d(strB, "asString(...)");
        return strB;
    }

    public d(String str) {
        this.f2747a = str;
    }

    public d(String str, d dVar, e eVar) {
        this.f2747a = str;
        this.f2749c = dVar;
        this.f2750d = eVar;
    }
}
