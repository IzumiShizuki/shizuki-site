package be;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import pc.f0;
import ub.k;
import vb.l;
import vb.n;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f2763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f2764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f2765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f2766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f2767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f2768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f2769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f2771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f2772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f2773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f2774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f2775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f2776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f2777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f2778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f2779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f2780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f2781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f2782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set f2783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f2784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f2785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f2786y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f2787z;

    static {
        c cVar = new c("kotlin");
        f2762a = cVar;
        c cVarA = cVar.a(e.e("reflect"));
        f2763b = cVarA;
        cVar.a(e.e("experimental"));
        c cVarA2 = cVar.a(e.e("collections"));
        f2764c = cVarA2;
        cVar.a(e.e("sequences"));
        c cVarA3 = cVar.a(e.e("ranges"));
        f2765d = cVarA3;
        c cVarA4 = cVar.a(e.e("jvm"));
        cVar.a(e.e("js"));
        cVar.a(e.e("annotations")).a(e.e("jvm"));
        cVarA4.a(e.e("internal"));
        cVarA4.a(e.e("functions"));
        c cVarA5 = cVar.a(e.e("annotation"));
        f2766e = cVarA5;
        c cVarA6 = cVar.a(e.e("internal"));
        cVarA6.a(e.e("ir"));
        c cVarA7 = cVar.a(e.e("coroutines"));
        f2767f = cVarA7;
        cVarA7.a(e.e("intrinsics"));
        f2768g = cVar.a(e.e("enums"));
        cVar.a(e.e("contracts"));
        c cVarA8 = cVar.a(e.e("concurrent")).a(e.e("atomics"));
        f2769h = cVarA8;
        cVar.a(e.e("test"));
        cVar.a(e.e("text"));
        l.N0(new c[]{cVar, cVarA2, cVarA3, cVarA5});
        l.N0(new c[]{cVar, cVarA2, cVarA3, cVarA5, cVarA, cVarA6, cVarA7, cVarA8});
        a2.c.q("Nothing");
        f2770i = a2.c.q("Unit");
        f2771j = a2.c.q("Any");
        f2772k = a2.c.q("Enum");
        a2.c.q("Annotation");
        f2773l = a2.c.q("Array");
        b bVarQ = a2.c.q("Boolean");
        f2774m = bVarQ;
        b bVarQ2 = a2.c.q("Char");
        b bVarQ3 = a2.c.q("Byte");
        b bVarQ4 = a2.c.q("Short");
        b bVarQ5 = a2.c.q("Int");
        f2775n = bVarQ5;
        b bVarQ6 = a2.c.q("Long");
        f2776o = bVarQ6;
        b bVarQ7 = a2.c.q("Float");
        b bVarQ8 = a2.c.q("Double");
        f2777p = a2.c.w(bVarQ3);
        f2778q = a2.c.w(bVarQ4);
        f2779r = a2.c.w(bVarQ5);
        f2780s = a2.c.w(bVarQ6);
        a2.c.q("CharSequence");
        f2781t = a2.c.q("String");
        a2.c.q("Throwable");
        a2.c.q("Cloneable");
        a2.c.u("KProperty");
        a2.c.u("KMutableProperty");
        a2.c.u("KProperty0");
        a2.c.u("KMutableProperty0");
        a2.c.u("KProperty1");
        a2.c.u("KMutableProperty1");
        a2.c.u("KProperty2");
        a2.c.u("KMutableProperty2");
        f2782u = a2.c.u("KFunction");
        a2.c.u("KClass");
        a2.c.u("KCallable");
        a2.c.u("KType");
        a2.c.q("Comparable");
        a2.c.q("Number");
        a2.c.q("Function");
        Set setN0 = l.N0(new b[]{bVarQ, bVarQ2, bVarQ3, bVarQ4, bVarQ5, bVarQ6, bVarQ7, bVarQ8});
        f2783v = setN0;
        l.N0(new b[]{bVarQ3, bVarQ4, bVarQ5, bVarQ6});
        Set set = setN0;
        int iT = w.t(n.K(set, 10));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        for (Object obj : set) {
            linkedHashMap.put(obj, a2.c.t(((b) obj).f()));
        }
        a2.c.s(linkedHashMap);
        Set setN02 = l.N0(new b[]{f2777p, f2778q, f2779r, f2780s});
        f2784w = setN02;
        Set set2 = setN02;
        int iT2 = w.t(n.K(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iT2 >= 16 ? iT2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, a2.c.t(((b) obj2).f()));
        }
        a2.c.s(linkedHashMap2);
        Set set3 = f2783v;
        Set set4 = f2784w;
        LinkedHashSet linkedHashSetJ = ud.e.J(set3, set4);
        b bVar = f2781t;
        ud.e.K(linkedHashSetJ, bVar);
        c cVar2 = f2767f;
        e eVarE = e.e("Continuation");
        jc.l.e(cVar2, "packageFqName");
        c cVar3 = c.f2743c;
        f0.U(eVarE).f2744a.c();
        a2.c.r("Iterator");
        a2.c.r("Iterable");
        a2.c.r("Collection");
        a2.c.r("List");
        a2.c.r("ListIterator");
        a2.c.r("Set");
        b bVarR = a2.c.r("Map");
        a2.c.r("AbstractMap");
        a2.c.r("MutableIterator");
        a2.c.r("CharIterator");
        a2.c.r("MutableIterable");
        a2.c.r("MutableCollection");
        f2785x = a2.c.r("MutableList");
        a2.c.r("MutableListIterator");
        f2786y = a2.c.r("MutableSet");
        b bVarR2 = a2.c.r("MutableMap");
        f2787z = bVarR2;
        bVarR.d(e.e("Entry"));
        bVarR2.d(e.e("MutableEntry"));
        a2.c.q("Result");
        c cVar4 = f2765d;
        e eVarE2 = e.e("IntRange");
        jc.l.e(cVar4, "packageFqName");
        f0.U(eVarE2).f2744a.c();
        e eVarE3 = e.e("LongRange");
        jc.l.e(cVar4, "packageFqName");
        f0.U(eVarE3).f2744a.c();
        e eVarE4 = e.e("CharRange");
        jc.l.e(cVar4, "packageFqName");
        f0.U(eVarE4).f2744a.c();
        c cVar5 = f2766e;
        e eVarE5 = e.e("AnnotationRetention");
        jc.l.e(cVar5, "packageFqName");
        f0.U(eVarE5).f2744a.c();
        e eVarE6 = e.e("AnnotationTarget");
        jc.l.e(cVar5, "packageFqName");
        f0.U(eVarE6).f2744a.c();
        a2.c.q("DeprecationLevel");
        A = new b(f2768g, e.e("EnumEntries"));
        b bVarP = a2.c.p("AtomicBoolean");
        b bVarP2 = a2.c.p("AtomicInt");
        b bVarP3 = a2.c.p("AtomicLong");
        a2.c.p("AtomicReference");
        k kVar = new k(f2774m, bVarP);
        b bVar2 = f2775n;
        k kVar2 = new k(bVar2, bVarP2);
        b bVar3 = f2776o;
        w.v(kVar, kVar2, new k(bVar3, bVarP3));
        a2.c.p("AtomicArray");
        w.v(new k(bVar2, a2.c.p("AtomicIntArray")), new k(bVar3, a2.c.p("AtomicLongArray")));
        ud.e.K(ud.e.K(ud.e.K(ud.e.K(ud.e.J(set3, set4), bVar), f2770i), f2771j), f2772k);
    }
}
