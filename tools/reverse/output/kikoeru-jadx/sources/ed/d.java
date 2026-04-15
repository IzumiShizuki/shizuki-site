package ed;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f6489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f6490d;

    static {
        jc.a0 a0Var = jc.z.f10839a;
        int i10 = 0;
        List listX = ud.b.x(a0Var.b(Boolean.TYPE), a0Var.b(Byte.TYPE), a0Var.b(Character.TYPE), a0Var.b(Double.TYPE), a0Var.b(Float.TYPE), a0Var.b(Integer.TYPE), a0Var.b(Long.TYPE), a0Var.b(Short.TYPE));
        f6487a = listX;
        List<pc.c> list = listX;
        ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
        for (pc.c cVar : list) {
            arrayList.add(new ub.k(g8.a.E(cVar), g8.a.F(cVar)));
        }
        f6488b = vb.w.A(arrayList);
        List<pc.c> list2 = f6487a;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list2, 10));
        for (pc.c cVar2 : list2) {
            arrayList2.add(new ub.k(g8.a.F(cVar2), g8.a.E(cVar2)));
        }
        f6489c = vb.w.A(arrayList2);
        List listX2 = ud.b.x(ic.a.class, ic.k.class, ic.n.class, ic.o.class, ic.p.class, ic.q.class, ic.r.class, ic.s.class, ic.t.class, ic.u.class, ic.b.class, ic.c.class, sc.g.class, ic.d.class, ic.e.class, ic.f.class, ic.g.class, ic.h.class, ic.i.class, ic.j.class, ic.l.class, ic.m.class, sc.g.class);
        ArrayList arrayList3 = new ArrayList(vb.n.K(listX2, 10));
        for (Object obj : listX2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            arrayList3.add(new ub.k((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f6490d = vb.w.A(arrayList3);
    }

    public static final be.b a(Class cls) {
        jc.l.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            be.c cVar = new be.c(cls.getName());
            return new be.b(cVar.b(), f0.U(cVar.f2744a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(be.e.e(cls.getSimpleName()));
        }
        be.c cVar2 = new be.c(cls.getName());
        return new be.b(cVar2.b(), cVar2.f2744a.g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        jc.l.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return ef.u.i0(cls.getName(), '.', '/');
            }
            return "L" + ef.u.i0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        jc.l.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return vb.r.f22819a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return df.m.g0(new df.i(df.m.b0(type, c.f6481b), c.f6482c, df.p.f6004i));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        jc.l.d(actualTypeArguments, "getActualTypeArguments(...)");
        return vb.l.M0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        jc.l.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        jc.l.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
