package ae;

import ef.u;
import j2.h0;
import java.util.LinkedHashMap;
import java.util.List;
import jc.l;
import q.t0;
import vb.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f313a = m.f0(ud.b.x('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f314b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listX = ud.b.x("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iX = gh.g.x(0, listX.size() - 1, 2);
        if (iX >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f313a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listX.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb.toString(), listX.get(i11));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(h0.n(sb2, (String) listX.get(i10), "Array"), "[" + ((String) listX.get(i11)));
                if (i10 == iX) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f313a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : ud.b.x("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : ud.b.x("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, h0.x("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String strB = t0.B(i12, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f313a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, strB, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : ud.b.x("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, h0.j(str5, ".Companion"), f313a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f314b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f313a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        l.e(str, "classId");
        String str2 = (String) f314b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + u.i0(str, '.', '$') + ';';
    }
}
