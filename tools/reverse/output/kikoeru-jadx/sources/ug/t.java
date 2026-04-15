package ug;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f21874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21876h;

    public t(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, String str5, String str6) {
        this.f21869a = str;
        this.f21870b = str2;
        this.f21871c = str3;
        this.f21872d = str4;
        this.f21873e = i10;
        this.f21874f = arrayList;
        this.f21875g = str5;
        this.f21876h = str6;
    }

    public final String a() {
        if (this.f21871c.length() == 0) {
            return "";
        }
        int length = this.f21869a.length() + 3;
        String str = this.f21876h;
        String strSubstring = str.substring(ef.n.v0(str, ':', length, 4) + 1, ef.n.v0(str, '@', 0, 6));
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f21869a.length() + 3;
        String str = this.f21876h;
        int iV0 = ef.n.v0(str, '/', length, 4);
        String strSubstring = str.substring(iV0, wg.e.f(str, iV0, str.length(), "?#"));
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f21869a.length() + 3;
        String str = this.f21876h;
        int iV0 = ef.n.v0(str, '/', length, 4);
        int iF = wg.e.f(str, iV0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iV0 < iF) {
            int i10 = iV0 + 1;
            int iE = wg.e.e(str, '/', i10, iF);
            String strSubstring = str.substring(i10, iE);
            jc.l.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iV0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f21874f == null) {
            return null;
        }
        String str = this.f21876h;
        int iV0 = ef.n.v0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iV0, wg.e.e(str, '#', iV0, str.length()));
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f21870b.length() == 0) {
            return "";
        }
        int length = this.f21869a.length() + 3;
        String str = this.f21876h;
        String strSubstring = str.substring(length, wg.e.f(str, length, str.length(), ":@"));
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && jc.l.a(((t) obj).f21876h, this.f21876h);
    }

    public final boolean f() {
        return jc.l.a(this.f21869a, "https");
    }

    public final s g() {
        s sVar = new s();
        String str = this.f21869a;
        sVar.f21861a = str;
        sVar.f21862b = e();
        sVar.f21863c = a();
        sVar.f21864d = this.f21872d;
        jc.l.e(str, "scheme");
        int i10 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i11 = this.f21873e;
        sVar.f21865e = i11 != i10 ? i11 : -1;
        ArrayList arrayList = sVar.f21866f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        sVar.f21867g = strD != null ? s.e(kh.a.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.f21875g != null) {
            String str2 = this.f21876h;
            strSubstring = str2.substring(ef.n.v0(str2, '#', 0, 6) + 1);
            jc.l.d(strSubstring, "substring(...)");
        }
        sVar.f21868h = strSubstring;
        return sVar;
    }

    public final String h() {
        s sVar;
        try {
            sVar = new s();
            sVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            sVar = null;
        }
        jc.l.b(sVar);
        sVar.f21862b = kh.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", TinkerReport.KEY_APPLIED_DEXOPT_FORMAT);
        sVar.f21863c = kh.a.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", TinkerReport.KEY_APPLIED_DEXOPT_FORMAT);
        return sVar.b().f21876h;
    }

    public final int hashCode() {
        return this.f21876h.hashCode();
    }

    public final URI i() {
        String strReplaceAll;
        s sVarG = g();
        ArrayList arrayList = sVarG.f21866f;
        String str = sVarG.f21864d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            jc.l.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            jc.l.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        sVarG.f21864d = strReplaceAll;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, kh.a.a((String) arrayList.get(i10), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = sVarG.f21867g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = (String) arrayList2.get(i11);
                arrayList2.set(i11, str2 != null ? kh.a.a(str2, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str3 = sVarG.f21868h;
        sVarG.f21868h = str3 != null ? kh.a.a(str3, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = sVarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                jc.l.d(patternCompile2, "compile(...)");
                jc.l.e(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                jc.l.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                jc.l.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String toString() {
        return this.f21876h;
    }
}
