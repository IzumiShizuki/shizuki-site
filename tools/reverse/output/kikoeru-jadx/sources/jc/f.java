package jc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements pc.c, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f10826b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10827a;

    static {
        int i10 = 0;
        List listX = ud.b.x(ic.a.class, ic.k.class, ic.n.class, ic.o.class, ic.p.class, ic.q.class, ic.r.class, ic.s.class, ic.t.class, ic.u.class, ic.b.class, ic.c.class, sc.g.class, ic.d.class, ic.e.class, ic.f.class, ic.g.class, ic.h.class, ic.i.class, ic.j.class, ic.l.class, ic.m.class, sc.g.class);
        ArrayList arrayList = new ArrayList(vb.n.K(listX, 10));
        for (Object obj : listX) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            arrayList.add(new ub.k((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f10826b = vb.w.A(arrayList);
    }

    public f(Class cls) {
        l.e(cls, "jClass");
        this.f10827a = cls;
    }

    @Override // jc.e
    public final Class b() {
        return this.f10827a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && g8.a.E(this).equals(g8.a.E((pc.c) obj));
    }

    @Override // pc.c
    public final List getTypeParameters() {
        throw new hc.a();
    }

    @Override // pc.c
    public final int hashCode() {
        return g8.a.E(this).hashCode();
    }

    public final String toString() {
        return this.f10827a.toString() + " (Kotlin reflection is not available)";
    }

    @Override // pc.c
    public final boolean w() {
        throw new hc.a();
    }

    @Override // pc.c
    public final String x() {
        String strF;
        Class cls = this.f10827a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strF2 = l.f(cls.getName());
            return strF2 == null ? cls.getCanonicalName() : strF2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strF = l.f(componentType.getName())) != null) {
            strConcat = strF.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // pc.c
    public final String y() {
        String strJ;
        Class cls = this.f10827a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strJ2 = l.j(cls.getName());
                return strJ2 == null ? cls.getSimpleName() : strJ2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strJ = l.j(componentType.getName())) != null) {
                strConcat = strJ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ef.n.P0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return ef.n.O0('$', simpleName, simpleName);
        }
        return ef.n.P0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // pc.c
    public final boolean z(Object obj) {
        Class clsE = this.f10827a;
        l.e(clsE, "jClass");
        Map map = f10826b;
        l.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return c0.d(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = g8.a.E(g8.a.H(clsE));
        }
        return clsE.isInstance(obj);
    }
}
