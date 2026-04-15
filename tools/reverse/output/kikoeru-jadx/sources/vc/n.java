package vc;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final be.c A;
    public static final be.c B;
    public static final be.c C;
    public static final be.c D;
    public static final be.c E;
    public static final be.c F;
    public static final be.c G;
    public static final be.c H;
    public static final be.c I;
    public static final be.c J;
    public static final be.c K;
    public static final be.c L;
    public static final be.c M;
    public static final be.c N;
    public static final be.c O;
    public static final be.c P;
    public static final be.d Q;
    public static final be.b R;
    public static final be.b S;
    public static final be.b T;
    public static final be.b U;
    public static final be.b V;
    public static final be.c W;
    public static final be.c X;
    public static final be.c Y;
    public static final be.c Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final be.c f22866a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final be.c f22868b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final be.c f22870c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final be.d f22871d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final HashSet f22872d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final be.d f22873e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final HashSet f22874e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final be.d f22875f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final HashMap f22876f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final be.d f22877g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final HashMap f22878g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final be.d f22879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final be.d f22880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final be.d f22881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final be.c f22882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final be.c f22883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final be.c f22884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final be.c f22885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final be.c f22886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final be.c f22887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final be.c f22888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final be.c f22889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final be.c f22890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final be.c f22891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final be.c f22892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final be.c f22893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final be.c f22894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final be.c f22895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final be.c f22896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final be.c f22897z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.d f22865a = d("Any").f2744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be.d f22867b = d("Nothing").f2744a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final be.d f22869c = d("Cloneable").f2744a;

    static {
        d("Suppress");
        f22871d = d("Unit").f2744a;
        f22873e = d("CharSequence").f2744a;
        f22875f = d("String").f2744a;
        f22877g = d("Array").f2744a;
        f22879h = d("Boolean").f2744a;
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        f22880i = d("Number").f2744a;
        f22881j = d("Enum").f2744a;
        d("Function");
        f22882k = d("Throwable");
        f22883l = d("Comparable");
        be.c cVar = o.f22911n;
        cVar.a(be.e.e("IntRange"));
        cVar.a(be.e.e("LongRange"));
        f22884m = d("Deprecated");
        d("DeprecatedSinceKotlin");
        f22885n = d("DeprecationLevel");
        f22886o = d("ReplaceWith");
        f22887p = d("ExtensionFunctionType");
        f22888q = d("ContextFunctionTypeParams");
        be.c cVarD = d("ParameterName");
        f22889r = cVarD;
        lc.b.X(cVarD);
        f22890s = d("Annotation");
        be.c cVarA = a("Target");
        f22891t = cVarA;
        lc.b.X(cVarA);
        f22892u = a("AnnotationTarget");
        f22893v = a("AnnotationRetention");
        be.c cVarA2 = a("Retention");
        f22894w = cVarA2;
        lc.b.X(cVarA2);
        lc.b.X(a("Repeatable"));
        f22895x = a("MustBeDocumented");
        f22896y = d("UnsafeVariance");
        d("PublishedApi");
        o.f22912o.a(be.e.e("AccessibleLateinitPropertyLiteral"));
        be.c cVar2 = new be.c("kotlin.internal.PlatformDependent");
        f22897z = cVar2;
        lc.b.X(cVar2);
        A = b("Iterator");
        B = b("Iterable");
        C = b("Collection");
        D = b("List");
        E = b("ListIterator");
        F = b("Set");
        be.c cVarB = b("Map");
        G = cVarB;
        H = cVarB.a(be.e.e("Entry"));
        I = b("MutableIterator");
        J = b("MutableIterable");
        K = b("MutableCollection");
        L = b("MutableList");
        M = b("MutableListIterator");
        N = b("MutableSet");
        be.c cVarB2 = b("MutableMap");
        O = cVarB2;
        P = cVarB2.a(be.e.e("MutableEntry"));
        Q = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        be.d dVarE = e("KProperty");
        e("KMutableProperty");
        R = lc.b.X(dVarE.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        be.c cVarD2 = d("UByte");
        be.c cVarD3 = d("UShort");
        be.c cVarD4 = d("UInt");
        be.c cVarD5 = d("ULong");
        S = lc.b.X(cVarD2);
        T = lc.b.X(cVarD3);
        U = lc.b.X(cVarD4);
        V = lc.b.X(cVarD5);
        W = d("UByteArray");
        X = d("UShortArray");
        Y = d("UIntArray");
        Z = d("ULongArray");
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        f22866a0 = c("AtomicIntArray");
        f22868b0 = c("AtomicLongArray");
        f22870c0 = c("AtomicArray");
        int length = k.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (k kVar : k.values()) {
            hashSet.add(kVar.f22856a);
        }
        f22872d0 = hashSet;
        int length2 = k.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (k kVar2 : k.values()) {
            hashSet2.add(kVar2.f22857b);
        }
        f22874e0 = hashSet2;
        int length3 = k.values().length;
        HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (k kVar3 : k.values()) {
            String strB = kVar3.f22856a.b();
            jc.l.d(strB, "asString(...)");
            map.put(d(strB).f2744a, kVar3);
        }
        f22876f0 = map;
        int length4 = k.values().length;
        HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (k kVar4 : k.values()) {
            String strB2 = kVar4.f22857b.b();
            jc.l.d(strB2, "asString(...)");
            map2.put(d(strB2).f2744a, kVar4);
        }
        f22878g0 = map2;
    }

    public static be.c a(String str) {
        return o.f22909l.a(be.e.e(str));
    }

    public static be.c b(String str) {
        return o.f22910m.a(be.e.e(str));
    }

    public static be.c c(String str) {
        return o.f22913p.a(be.e.e(str));
    }

    public static be.c d(String str) {
        return o.f22908k.a(be.e.e(str));
    }

    public static final be.d e(String str) {
        return o.f22906i.a(be.e.e(str)).f2744a;
    }
}
