package e7;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ef.l f6373m = new ef.l("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ef.l f6374n = new ef.l("\\{(.+?)\\}");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ef.l f6375o = new ef.l("http[s]?://");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ef.l f6376p = new ef.l(".*");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ef.l f6377q = new ef.l("([^/]*?|)");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ef.l f6378r = new ef.l("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.p f6382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ub.p f6383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f6387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ub.p f6389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6390l;

    public r(String str) {
        this.f6379a = str;
        ArrayList arrayList = new ArrayList();
        this.f6380b = arrayList;
        final int i10 = 0;
        this.f6382d = ub.a.d(new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i10) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i11 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i12 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i11);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i12) {
                                        String strSubstring = str6.substring(i12, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i12 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i11 = 1;
                                }
                                if (i12 < str6.length()) {
                                    String strSubstring2 = str6.substring(i12);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i11 = 1;
        this.f6383e = ub.a.d(new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i11) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i12 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i12) {
                                        String strSubstring = str6.substring(i12, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i12 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i12 < str6.length()) {
                                    String strSubstring2 = str6.substring(i12);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i12 = 2;
        ic.a aVar = new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i12) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        ub.i iVar = ub.i.f21541b;
        this.f6384f = ub.a.c(iVar, aVar);
        final int i13 = 3;
        this.f6386h = ub.a.c(iVar, new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i13) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i14 = 4;
        this.f6387i = ub.a.c(iVar, new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i14) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i15 = 5;
        this.f6388j = ub.a.c(iVar, new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i15) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i16 = 6;
        this.f6389k = ub.a.d(new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i16) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i17 = 7;
        ub.a.d(new ic.a(this) { // from class: e7.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6368b;

            {
                this.f6368b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, ub.h] */
            /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                List list;
                switch (i17) {
                    case 0:
                        String str2 = this.f6368b.f6381c;
                        if (str2 != null) {
                            return new ef.l(0, str2);
                        }
                        return null;
                    case 1:
                        String str3 = this.f6368b.f6379a;
                        return Boolean.valueOf(str3 != null && r.f6378r.d(str3));
                    case 2:
                        r rVar = this.f6368b;
                        String str4 = rVar.f6379a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) rVar.f6383e.getValue()).booleanValue()) {
                            jc.l.b(str4);
                            Uri uri = Uri.parse(str4);
                            jc.l.d(uri, "parse(...)");
                            for (String str5 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str5);
                                int i112 = 1;
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str5 + " must only be present once in " + str4 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str6 = (String) vb.m.a0(queryParameters);
                                if (str6 == null) {
                                    rVar.f6385g = true;
                                    str6 = str5;
                                }
                                ef.j jVarA = ef.l.a(r.f6374n, str6);
                                q qVar = new q();
                                int i122 = 0;
                                while (jVarA != null) {
                                    ef.h hVarI = jVarA.f6573c.i(i112);
                                    jc.l.b(hVarI);
                                    qVar.f6372b.add(hVarI.f6567a);
                                    if (jVarA.b().f16307a > i122) {
                                        String strSubstring = str6.substring(i122, jVarA.b().f16307a);
                                        jc.l.d(strSubstring, "substring(...)");
                                        String strQuote = Pattern.quote(strSubstring);
                                        jc.l.d(strQuote, "quote(...)");
                                        sb.append(strQuote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i122 = jVarA.b().f16308b + 1;
                                    jVarA = jVarA.c();
                                    i112 = 1;
                                }
                                if (i122 < str6.length()) {
                                    String strSubstring2 = str6.substring(i122);
                                    jc.l.d(strSubstring2, "substring(...)");
                                    String strQuote2 = Pattern.quote(strSubstring2);
                                    jc.l.d(strQuote2, "quote(...)");
                                    sb.append(strQuote2);
                                }
                                sb.append("$");
                                String string = sb.toString();
                                jc.l.d(string, "toString(...)");
                                qVar.f6371a = r.h(string);
                                linkedHashMap.put(str5, qVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = this.f6368b.f6379a;
                        if (str7 != null) {
                            Uri uri2 = Uri.parse(str7);
                            jc.l.d(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Uri uri3 = Uri.parse(str7);
                                jc.l.d(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                jc.l.b(fragment);
                                r.a(fragment, arrayList2, sb2);
                                return new ub.k(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        ub.k kVar = (ub.k) this.f6368b.f6386h.getValue();
                        return (kVar == null || (list = (List) kVar.f21543a) == null) ? new ArrayList() : list;
                    case 5:
                        ub.k kVar2 = (ub.k) this.f6368b.f6386h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.f21544b;
                        }
                        return null;
                    case 6:
                        String str8 = (String) this.f6368b.f6388j.getValue();
                        if (str8 != null) {
                            return new ef.l(0, str8);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        ef.l lVar = f6373m;
        lVar.getClass();
        if (!lVar.f6576a.matcher(str).find()) {
            String strPattern = f6375o.f6576a.pattern();
            jc.l.d(strPattern, "pattern(...)");
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        jc.l.d(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        jc.l.d(matcher, "matcher(...)");
        boolean z10 = false;
        ef.j jVarE = pc.f0.e(matcher, 0, str);
        if (jVarE != null) {
            String strSubstring = str.substring(0, jVarE.b().f16307a);
            jc.l.d(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            ef.l lVar2 = f6376p;
            lVar2.getClass();
            if (!lVar2.f6576a.matcher(sb).find()) {
                ef.l lVar3 = f6377q;
                lVar3.getClass();
                if (!lVar3.f6576a.matcher(sb).find()) {
                    z10 = true;
                }
            }
            this.f6390l = z10;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        this.f6381c = h(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i10 = 0;
        for (ef.j jVarA = ef.l.a(f6374n, str); jVarA != null; jVarA = jVarA.c()) {
            ef.h hVarI = jVarA.f6573c.i(1);
            jc.l.b(hVarI);
            arrayList.add(hVarI.f6567a);
            if (jVarA.b().f16307a > i10) {
                String strSubstring = str.substring(i10, jVarA.b().f16307a);
                jc.l.d(strSubstring, "substring(...)");
                String strQuote = Pattern.quote(strSubstring);
                jc.l.d(strQuote, "quote(...)");
                sb.append(strQuote);
            }
            String strPattern = f6377q.f6576a.pattern();
            jc.l.d(strPattern, "pattern(...)");
            sb.append(strPattern);
            i10 = jVarA.b().f16308b + 1;
        }
        if (i10 < str.length()) {
            String strSubstring2 = str.substring(i10);
            jc.l.d(strSubstring2, "substring(...)");
            String strQuote2 = Pattern.quote(strSubstring2);
            jc.l.d(strQuote2, "quote(...)");
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, h hVar) {
        if (hVar == null) {
            ua.j.u(bundle, str, str2);
            return;
        }
        k0 k0Var = hVar.f6327a;
        jc.l.e(str, "key");
        k0Var.e(bundle, str, k0Var.d(str2));
    }

    public static String h(String str) {
        return (ef.n.n0(str, "\\Q", false) && ef.n.n0(str, "\\E", false)) ? ef.u.h0(str, ".*", "\\E.*\\Q", false) : ef.n.n0(str, "\\.\\*", false) ? ef.u.h0(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f6379a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(str);
        jc.l.d(uri2, "parse(...)");
        List<String> list = pathSegments;
        List<String> pathSegments2 = uri2.getPathSegments();
        jc.l.e(list, "<this>");
        jc.l.e(pathSegments2, "other");
        Set setJ0 = vb.m.J0(list);
        setJ0.retainAll(vb.m.T(pathSegments2));
        return setJ0.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ub.h] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f6384f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            vb.m.P(arrayList, ((q) it.next()).f6372b);
        }
        return vb.m.q0(vb.m.q0(this.f6380b, arrayList), (List) this.f6387i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, ub.h] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        ef.j jVarC;
        ef.j jVarC2;
        String strDecode;
        jc.l.e(uri, "deepLink");
        jc.l.e(linkedHashMap, "arguments");
        ef.l lVar = (ef.l) this.f6382d.getValue();
        if (lVar != null && (jVarC = lVar.c(uri.toString())) != null) {
            int i10 = 0;
            Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
            if (e(jVarC, bundleC, linkedHashMap) && (!((Boolean) this.f6383e.getValue()).booleanValue() || f(uri, bundleC, linkedHashMap))) {
                String fragment = uri.getFragment();
                ef.l lVar2 = (ef.l) this.f6389k.getValue();
                if (lVar2 != null && (jVarC2 = lVar2.c(String.valueOf(fragment))) != null) {
                    List list = (List) this.f6387i.getValue();
                    ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        String str = (String) obj;
                        ef.h hVarI = jVarC2.f6573c.i(i11);
                        if (hVarI != null) {
                            strDecode = Uri.decode(hVarI.f6567a);
                            jc.l.d(strDecode, "decode(...)");
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleC, str, strDecode, (h) linkedHashMap.get(str));
                            arrayList.add(ub.a0.f21526a);
                            i10 = i11;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (g.e(linkedHashMap, new p(0, bundleC)).isEmpty()) {
                    return bundleC;
                }
            }
        }
        return null;
    }

    public final boolean e(ef.j jVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.f6380b;
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            String strDecode = null;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            String str = (String) obj;
            ef.h hVarI = jVar.f6573c.i(i11);
            if (hVarI != null) {
                strDecode = Uri.decode(hVarI.f6567a);
                jc.l.d(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (h) map.get(str));
                arrayList2.add(ub.a0.f21526a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        return jc.l.a(this.f6379a, ((r) obj).f6379a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.r.f(android.net.Uri, android.os.Bundle, java.util.Map):boolean");
    }

    public final int hashCode() {
        String str = this.f6379a;
        return (str != null ? str.hashCode() : 0) * 961;
    }
}
