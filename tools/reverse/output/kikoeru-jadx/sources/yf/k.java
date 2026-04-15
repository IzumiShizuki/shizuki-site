package yf;

import d0.y;
import j2.h0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f26290a = new l();

    public static final h a(Number number, String str, String str2) {
        jc.l.e(str, "key");
        jc.l.e(str2, "output");
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str2, -1)));
    }

    public static final j b(Number number, String str) {
        return new j("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str, -1)));
    }

    public static final j c(uf.g gVar) {
        return new j("Value of type '" + gVar.m() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + gVar.j() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final h d(int i10, String str) {
        jc.l.e(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new h(str);
    }

    public static final h e(int i10, String str, CharSequence charSequence) {
        jc.l.e(str, "message");
        jc.l.e(charSequence, "input");
        return d(i10, str + "\nJSON input: " + ((Object) m(charSequence, i10)));
    }

    public static final uf.g f(uf.g gVar, y yVar) {
        uf.g gVarF;
        sf.a aVarA;
        jc.l.e(gVar, "<this>");
        jc.l.e(yVar, "module");
        if (!jc.l.a(gVar.j(), uf.i.f21703b)) {
            return gVar.l() ? f(gVar.s(0), yVar) : gVar;
        }
        pc.c cVarI = vb.w.i(gVar);
        uf.g gVarA = null;
        if (cVarI != null && (aVarA = yVar.a(cVarI, vb.r.f22819a)) != null) {
            gVarA = aVarA.a();
        }
        return (gVarA == null || (gVarF = f(gVarA, yVar)) == null) ? gVar : gVarF;
    }

    public static final byte g(char c3) {
        if (c3 < '~') {
            return d.f26283b[c3];
        }
        return (byte) 0;
    }

    public static final String h(uf.g gVar, xf.c cVar) {
        jc.l.e(gVar, "<this>");
        jc.l.e(cVar, "json");
        for (Annotation annotation : gVar.getAnnotations()) {
            if (annotation instanceof xf.i) {
                return ((xf.i) annotation).discriminator();
            }
        }
        return cVar.f24988a.f25009f;
    }

    public static final int i(uf.g gVar, xf.c cVar, String str) {
        jc.l.e(gVar, "<this>");
        jc.l.e(cVar, "json");
        jc.l.e(str, "name");
        n(gVar, cVar);
        int iO = gVar.o(str);
        if (iO != -3 || !cVar.f24988a.f25010g) {
            return iO;
        }
        xa.h hVar = cVar.f24990c;
        a9.d dVar = new a9.d(29, gVar, cVar);
        hVar.getClass();
        l lVar = f26290a;
        Object objJ = hVar.j(gVar, lVar);
        if (objJ == null) {
            objJ = dVar.b();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f24888a;
            Object concurrentHashMap2 = concurrentHashMap.get(gVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(gVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(lVar, objJ);
        }
        Integer num = (Integer) ((Map) objJ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(uf.g gVar, xf.c cVar, String str, String str2) {
        jc.l.e(gVar, "<this>");
        jc.l.e(cVar, "json");
        jc.l.e(str, "name");
        jc.l.e(str2, "suffix");
        int i10 = i(gVar, cVar, str);
        if (i10 != -3) {
            return i10;
        }
        throw new sf.h(gVar.m() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean k(uf.g gVar, xf.c cVar) {
        jc.l.e(gVar, "<this>");
        jc.l.e(cVar, "json");
        if (cVar.f24988a.f25005b) {
            return true;
        }
        List annotations = gVar.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof xf.q) {
                return true;
            }
        }
        return false;
    }

    public static final void l(h7.k kVar, String str) {
        kVar.p(kVar.f8197b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(CharSequence charSequence, int i10) {
        jc.l.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbP = h0.p(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbP.append(charSequence.subSequence(i11, i12).toString());
                sbP.append(str2);
                return sbP.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void n(uf.g gVar, xf.c cVar) {
        jc.l.e(gVar, "<this>");
        jc.l.e(cVar, "json");
        jc.l.a(gVar.j(), uf.k.f21705b);
    }

    public static final Object o(xf.c cVar, String str, xf.y yVar, sf.a aVar) {
        jc.l.e(cVar, "<this>");
        jc.l.e(str, "discriminator");
        return new n(cVar, yVar, str, aVar.a()).d(aVar);
    }

    public static final w p(uf.g gVar, xf.c cVar) {
        jc.l.e(gVar, "desc");
        ud.n nVarJ = gVar.j();
        if (nVarJ instanceof uf.d) {
            return w.f26338f;
        }
        if (jc.l.a(nVarJ, uf.k.f21706c)) {
            return w.f26336d;
        }
        if (!jc.l.a(nVarJ, uf.k.f21707d)) {
            return w.f26335c;
        }
        uf.g gVarF = f(gVar.s(0), cVar.f24989b);
        ud.n nVarJ2 = gVarF.j();
        if ((nVarJ2 instanceof uf.f) || jc.l.a(nVarJ2, uf.j.f21704b)) {
            return w.f26337e;
        }
        throw c(gVarF);
    }

    public static final void q(h7.k kVar, Number number) {
        h7.k.q(kVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String r(byte b10) {
        return b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == 127 ? "invalid token" : "valid token";
    }
}
