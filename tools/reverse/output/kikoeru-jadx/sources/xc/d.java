package xc;

import ef.u;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final be.b f24909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final be.c f24910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final be.b f24911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f24912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f24913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f24914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f24915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f24916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f24917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f24918n;

    static {
        StringBuilder sb = new StringBuilder();
        wc.g gVar = wc.g.f23505c;
        sb.append(gVar.f23509a);
        sb.append('.');
        sb.append(gVar.f23510b);
        f24905a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        wc.h hVar = wc.h.f23506c;
        sb2.append(hVar.f23509a);
        sb2.append('.');
        sb2.append(hVar.f23510b);
        f24906b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        wc.j jVar = wc.j.f23508c;
        sb3.append(jVar.f23509a);
        sb3.append('.');
        sb3.append(jVar.f23510b);
        f24907c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        wc.i iVar = wc.i.f23507c;
        sb4.append(iVar.f23509a);
        sb4.append('.');
        sb4.append(iVar.f23510b);
        f24908d = sb4.toString();
        be.b bVarX = lc.b.X(new be.c("kotlin.jvm.functions.FunctionN"));
        f24909e = bVarX;
        f24910f = bVarX.a();
        f24911g = be.h.f2782u;
        d(Class.class);
        f24912h = new HashMap();
        f24913i = new HashMap();
        f24914j = new HashMap();
        f24915k = new HashMap();
        f24916l = new HashMap();
        f24917m = new HashMap();
        be.b bVarX2 = lc.b.X(vc.n.B);
        be.c cVar = vc.n.J;
        be.c cVar2 = bVarX2.f2740a;
        c cVar3 = new c(d(Iterable.class), bVarX2, new be.b(cVar2, a.a.W(cVar, cVar2), false));
        be.b bVarX3 = lc.b.X(vc.n.A);
        be.c cVar4 = vc.n.I;
        be.c cVar5 = bVarX3.f2740a;
        c cVar6 = new c(d(Iterator.class), bVarX3, new be.b(cVar5, a.a.W(cVar4, cVar5), false));
        be.b bVarX4 = lc.b.X(vc.n.C);
        be.c cVar7 = vc.n.K;
        be.c cVar8 = bVarX4.f2740a;
        c cVar9 = new c(d(Collection.class), bVarX4, new be.b(cVar8, a.a.W(cVar7, cVar8), false));
        be.b bVarX5 = lc.b.X(vc.n.D);
        be.c cVar10 = vc.n.L;
        be.c cVar11 = bVarX5.f2740a;
        c cVar12 = new c(d(List.class), bVarX5, new be.b(cVar11, a.a.W(cVar10, cVar11), false));
        be.b bVarX6 = lc.b.X(vc.n.F);
        be.c cVar13 = vc.n.N;
        be.c cVar14 = bVarX6.f2740a;
        c cVar15 = new c(d(Set.class), bVarX6, new be.b(cVar14, a.a.W(cVar13, cVar14), false));
        be.b bVarX7 = lc.b.X(vc.n.E);
        be.c cVar16 = vc.n.M;
        be.c cVar17 = bVarX7.f2740a;
        c cVar18 = new c(d(ListIterator.class), bVarX7, new be.b(cVar17, a.a.W(cVar16, cVar17), false));
        be.c cVar19 = vc.n.G;
        be.b bVarX8 = lc.b.X(cVar19);
        be.c cVar20 = vc.n.O;
        be.c cVar21 = bVarX8.f2740a;
        c cVar22 = new c(d(Map.class), bVarX8, new be.b(cVar21, a.a.W(cVar20, cVar21), false));
        be.b bVarD = lc.b.X(cVar19).d(vc.n.H.f2744a.g());
        be.c cVar23 = vc.n.P;
        be.c cVar24 = bVarD.f2740a;
        List<c> listX = ud.b.x(cVar3, cVar6, cVar9, cVar12, cVar15, cVar18, cVar22, new c(d(Map.Entry.class), bVarD, new be.b(cVar24, a.a.W(cVar23, cVar24), false)));
        f24918n = listX;
        c(Object.class, vc.n.f22865a);
        c(String.class, vc.n.f22875f);
        c(CharSequence.class, vc.n.f22873e);
        b(Throwable.class, vc.n.f22882k);
        c(Cloneable.class, vc.n.f22869c);
        c(Number.class, vc.n.f22880i);
        b(Comparable.class, vc.n.f22883l);
        c(Enum.class, vc.n.f22881j);
        b(Annotation.class, vc.n.f22890s);
        for (c cVar25 : listX) {
            be.b bVar = cVar25.f24902a;
            be.b bVar2 = cVar25.f24903b;
            be.b bVar3 = cVar25.f24904c;
            a(bVar, bVar2);
            f24913i.put(bVar3.a().f2744a, bVar);
            f24916l.put(bVar3, bVar2);
            f24917m.put(bVar2, bVar3);
            be.c cVarA = bVar2.a();
            be.c cVarA2 = bVar3.a();
            f24914j.put(bVar3.a().f2744a, cVarA);
            f24915k.put(cVarA.f2744a, cVarA2);
        }
        for (je.c cVar26 : je.c.values()) {
            be.c cVar27 = cVar26.f10863d;
            if (cVar27 == null) {
                je.c.a(15);
                throw null;
            }
            be.b bVar4 = new be.b(cVar27.b(), cVar27.f2744a.g());
            vc.k kVarD = cVar26.d();
            jc.l.d(kVarD, "getPrimitiveType(...)");
            be.c cVarA3 = vc.o.f22908k.a(kVarD.f22856a);
            a(bVar4, new be.b(cVarA3.b(), cVarA3.f2744a.g()));
        }
        for (be.b bVar5 : vc.d.f22831a) {
            be.c cVar28 = new be.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            a(new be.b(cVar28.b(), cVar28.f2744a.g()), bVar5.d(be.g.f2756b));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            be.c cVar29 = new be.c(t0.B(i10, "kotlin.jvm.functions.Function"));
            a(new be.b(cVar29.b(), cVar29.f2744a.g()), new be.b(vc.o.f22908k, be.e.e("Function" + i10)));
            f24913i.put(new be.c(f24906b + i10).f2744a, f24911g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            wc.i iVar2 = wc.i.f23507c;
            f24913i.put(new be.c((iVar2.f23509a + '.' + iVar2.f23510b) + i11).f2744a, f24911g);
        }
        be.c cVar30 = new be.c("kotlin.concurrent.atomics.AtomicInt");
        be.b bVarD2 = d(AtomicInteger.class);
        HashMap map = f24913i;
        map.put(cVar30.f2744a, bVarD2);
        map.put(new be.c("kotlin.concurrent.atomics.AtomicLong").f2744a, d(AtomicLong.class));
        map.put(new be.c("kotlin.concurrent.atomics.AtomicBoolean").f2744a, d(AtomicBoolean.class));
        map.put(new be.c("kotlin.concurrent.atomics.AtomicReference").f2744a, d(AtomicReference.class));
        map.put(new be.c("kotlin.concurrent.atomics.AtomicIntArray").f2744a, d(AtomicIntegerArray.class));
        map.put(new be.c("kotlin.concurrent.atomics.AtomicLongArray").f2744a, d(AtomicLongArray.class));
        map.put(new be.c("kotlin.concurrent.atomics.AtomicArray").f2744a, d(AtomicReferenceArray.class));
        map.put(vc.n.f22867b.i().f2744a, d(Void.class));
    }

    public static void a(be.b bVar, be.b bVar2) {
        f24912h.put(bVar.a().f2744a, bVar2);
        f24913i.put(bVar2.a().f2744a, bVar);
    }

    public static void b(Class cls, be.c cVar) {
        be.b bVarD = d(cls);
        jc.l.e(cVar, "topLevelFqName");
        a(bVarD, new be.b(cVar.b(), cVar.f2744a.g()));
    }

    public static void c(Class cls, be.d dVar) {
        b(cls, dVar.i());
    }

    public static be.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(be.e.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        jc.l.d(canonicalName, "getCanonicalName(...)");
        be.c cVar = new be.c(canonicalName);
        return new be.b(cVar.b(), cVar.f2744a.g());
    }

    public static boolean e(be.d dVar, String str) {
        Integer numL0;
        String str2 = dVar.f2747a;
        if (u.k0(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            jc.l.d(strSubstring, "substring(...)");
            if (!ef.n.M0('0', strSubstring) && (numL0 = u.l0(strSubstring)) != null && numL0.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static be.b f(be.d dVar) {
        jc.l.e(dVar, "kotlinFqName");
        return (e(dVar, f24905a) || e(dVar, f24907c)) ? f24909e : (e(dVar, f24906b) || e(dVar, f24908d)) ? f24911g : (be.b) f24913i.get(dVar);
    }
}
