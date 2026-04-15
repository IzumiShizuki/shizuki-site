package ld;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f12226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f12227b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f12226a = linkedHashMap;
        b(be.h.f2785x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(be.h.f2786y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(be.h.f2787z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        be.c cVar = new be.c("java.util.function.Function");
        b(new be.b(cVar.b(), cVar.f2744a.g()), a("java.util.function.UnaryOperator"));
        be.c cVar2 = new be.c("java.util.function.BiFunction");
        b(new be.b(cVar2.b(), cVar2.f2744a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new ub.k(((be.b) entry.getKey()).a(), ((be.b) entry.getValue()).a()));
        }
        f12227b = vb.w.A(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            be.c cVar = new be.c(str);
            arrayList.add(new be.b(cVar.b(), cVar.f2744a.g()));
        }
        return arrayList;
    }

    public static void b(be.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f12226a.put(obj, bVar);
        }
    }
}
