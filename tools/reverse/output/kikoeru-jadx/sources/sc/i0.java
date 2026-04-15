package sc;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 implements jc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.l f19810a = new ef.l("<v#(\\d+)>");

    public static void c(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        Class cls;
        cls = jc.g.class;
        boolean zA = jc.l.a(vb.m.i0(arrayList2), cls);
        List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls2 = Integer.TYPE;
            jc.l.d(cls2, "TYPE");
            arrayList.add(cls2);
        }
        arrayList.add(z10 ? jc.g.class : Object.class);
    }

    public static Method l(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class clsA0;
        Method methodL;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodP = p(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodL = l(superclass, str, clsArr, cls2, z10)) != null) {
            return methodL;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        jc.l.d(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            jc.l.b(cls3);
            Method methodL2 = l(cls3, str, clsArr, cls2, z10);
            if (methodL2 != null) {
                return methodL2;
            }
            if (z10 && (clsA0 = android.support.v4.media.session.b.a0(ed.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodP2 = p(clsA0, str, clsArr, cls2);
                if (methodP2 != null) {
                    return methodP2;
                }
            }
        }
        return null;
    }

    public static Constructor o(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method p(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (jc.l.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            jc.l.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (jc.l.a(method.getName(), str) && jc.l.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method d(String str, String str2, boolean z10) {
        jc.l.e(str, "name");
        jc.l.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(b());
        }
        m0.w wVarM = m(str2, true);
        c(arrayList, (ArrayList) wVarM.f13782b, false);
        Class clsJ = j();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) wVarM.f13783c;
        jc.l.b(cls);
        return l(clsJ, strConcat, clsArr, cls, z10);
    }

    public final Method e(String str, String str2) {
        Method methodL;
        jc.l.e(str, "name");
        jc.l.e(str2, "desc");
        if (str.equals("<init>")) {
            return null;
        }
        m0.w wVarM = m(str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) wVarM.f13782b).toArray(new Class[0]);
        Class cls = (Class) wVarM.f13783c;
        jc.l.b(cls);
        Method methodL2 = l(j(), str, clsArr, cls, false);
        if (methodL2 != null) {
            return methodL2;
        }
        if (!j().isInterface() || (methodL = l(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodL;
    }

    public abstract Collection f();

    public abstract Collection g(be.e eVar);

    public abstract yc.k0 h(int i10);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection i(le.o r9, sc.g0 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            jc.l.e(r9, r0)
            sc.h0 r0 = new sc.h0
            r1 = 7
            r0.<init>(r1, r8)
            r1 = 3
            r2 = 0
            java.util.Collection r9 = a.a.E(r9, r2, r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L1c:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r9.next()
            yc.k r3 = (yc.k) r3
            boolean r4 = r3 instanceof yc.c
            if (r4 == 0) goto L58
            r4 = r3
            yc.c r4 = (yc.c) r4
            ld.o r5 = r4.f()
            ld.o r6 = yc.o.f26132h
            boolean r5 = jc.l.a(r5, r6)
            if (r5 != 0) goto L58
            int r4 = r4.j()
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            sc.g0 r5 = sc.g0.f19800a
            if (r10 != r5) goto L4c
            goto L4d
        L4c:
            r6 = 0
        L4d:
            if (r4 != r6) goto L58
            ub.a0 r4 = ub.a0.f21526a
            java.lang.Object r3 = r3.a0(r0, r4)
            sc.u r3 = (sc.u) r3
            goto L59
        L58:
            r3 = r2
        L59:
            if (r3 == 0) goto L1c
            r1.add(r3)
            goto L1c
        L5f:
            java.util.List r9 = vb.m.G0(r1)
            java.util.Collection r9 = (java.util.Collection) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.i0.i(le.o, sc.g0):java.util.Collection");
    }

    public Class j() {
        Class clsB = b();
        List list = ed.d.f6487a;
        jc.l.e(clsB, "<this>");
        Class cls = (Class) ed.d.f6489c.get(clsB);
        return cls == null ? b() : cls;
    }

    public abstract Collection k(be.e eVar);

    public final m0.w m(String str, boolean z10) {
        int iV0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (ef.n.o0("VZCBSIFJD", cCharAt)) {
                iV0 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new hc.a("Unknown type prefix in the method signature: ".concat(str));
                }
                iV0 = ef.n.v0(str, ';', i10, 4) + 1;
            }
            arrayList.add(n(i10, iV0, str));
            i10 = iV0;
        }
        return new m0.w(19, arrayList, z10 ? n(i10 + 1, str.length(), str) : null);
    }

    public final Class n(int i10, int i11, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = ed.d.d(b());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            jc.l.d(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(ef.u.i0(strSubstring, '/', '.'));
            jc.l.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            jc.l.d(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsN = n(i10 + 1, i11, str);
            be.c cVar = f2.f19799a;
            jc.l.e(clsN, "<this>");
            return Array.newInstance((Class<?>) clsN, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new hc.a("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
