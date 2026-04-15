package sc;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.c f19799a = new be.c("kotlin.jvm.JvmStatic");

    public static final u a(pc.b bVar) {
        u uVar = bVar instanceof u ? (u) bVar : null;
        if (uVar != null) {
            return uVar;
        }
        k0 k0VarB = b(bVar);
        return k0VarB != null ? k0VarB : c(bVar);
    }

    public static final k0 b(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var != null) {
            return k0Var;
        }
        jc.j jVar = obj instanceof jc.j ? (jc.j) obj : null;
        pc.b bVarF = jVar != null ? jVar.f() : null;
        if (bVarF instanceof k0) {
            return (k0) bVarF;
        }
        return null;
    }

    public static final q1 c(Object obj) {
        q1 q1Var = obj instanceof q1 ? (q1) obj : null;
        if (q1Var != null) {
            return q1Var;
        }
        jc.t tVar = obj instanceof jc.t ? (jc.t) obj : null;
        pc.b bVarF = tVar != null ? tVar.f() : null;
        if (bVarF instanceof q1) {
            return (q1) bVarF;
        }
        return null;
    }

    public static final List d(yc.b bVar) {
        Annotation annotationI;
        jc.l.e(bVar, "<this>");
        zc.h<zc.b> annotations = bVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (zc.b bVar2 : annotations) {
            yc.m0 m0VarM = bVar2.m();
            if (m0VarM instanceof dd.a) {
                annotationI = ((dd.a) m0VarM).f5864a;
            } else if (m0VarM instanceof dd.g) {
                ed.s sVar = ((dd.g) m0VarM).f5873a;
                ed.e eVar = sVar instanceof ed.e ? (ed.e) sVar : null;
                annotationI = eVar != null ? eVar.f6495a : null;
            } else {
                annotationI = i(bVar2);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        return l(arrayList);
    }

    public static final Object e(Type type) {
        jc.l.e(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final yc.b f(Class cls, ce.m mVar, yd.f fVar, bd.f0 f0Var, yd.a aVar, ic.n nVar) {
        List list;
        jc.l.e(cls, "moduleAnchor");
        jc.l.e(mVar, "proto");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(aVar, "metadataVersion");
        dd.f fVarA = y1.a(cls);
        if (mVar instanceof wd.b0) {
            list = ((wd.b0) mVar).f23557i;
        } else {
            if (!(mVar instanceof wd.j0)) {
                throw new IllegalStateException(("Unsupported message: " + mVar).toString());
            }
            list = ((wd.j0) mVar).f23784i;
        }
        List list2 = list;
        oe.i iVar = fVarA.f5871a;
        yc.y yVar = iVar.f16365b;
        yd.i iVar2 = yd.i.f26206b;
        jc.l.b(list2);
        return (yc.b) nVar.q(new oe.t(new oe.k(iVar, fVar, yVar, f0Var, iVar2, aVar, null, null, list2)), mVar);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, ub.h] */
    public static final boolean g(v1 v1Var) {
        pc.d dVarC = v1Var.c();
        d0 d0Var = dVarC instanceof d0 ? (d0) dVarC : null;
        if (d0Var == null || !d0Var.w()) {
            return false;
        }
        hd.l0 l0Var = (hd.l0) ((a0) d0Var.f19787c.getValue()).f19743c.getValue();
        return (l0Var != null ? l0Var.f8416m : null) == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, be.b bVar, int i10) {
        jc.l.e(bVar, "kotlinClassId");
        String str = xc.d.f24905a;
        be.b bVarF = xc.d.f(bVar.a().f2744a);
        if (bVarF == null) {
            bVarF = bVar;
        }
        if (!bVarF.equals(bVar)) {
            classLoader = ed.d.d(ub.a0.class);
        }
        String str2 = bVarF.f2740a.f2744a.f2747a;
        String str3 = bVarF.f2741b.f2744a.f2747a;
        if (jc.l.a(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(ef.u.i0(str3, '.', '$'));
        if (i10 > 0) {
            sb.append(";");
        }
        return android.support.v4.media.session.b.a0(classLoader, sb.toString());
    }

    public static final Annotation i(zc.b bVar) {
        yc.e eVarD = ie.d.d(bVar);
        Class clsJ = eVarD != null ? j(eVarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.c().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            be.e eVar = (be.e) entry.getKey();
            ge.g gVar = (ge.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            jc.l.d(classLoader, "getClassLoader(...)");
            Object objK = k(gVar, classLoader);
            ub.k kVar = objK != null ? new ub.k(eVar.b(), objK) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Map mapA = vb.w.A(arrayList);
        Set setKeySet = mapA.keySet();
        ArrayList arrayList2 = new ArrayList(vb.n.K(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) nh.b.n(clsJ, mapA, arrayList2);
    }

    public static final Class j(yc.e eVar) {
        jc.l.e(eVar, "<this>");
        yc.m0 m0VarM = eVar.m();
        jc.l.d(m0VarM, "getSource(...)");
        if (m0VarM instanceof ud.r) {
            return ((ud.r) m0VarM).f21601a.f5866a;
        }
        if (m0VarM instanceof dd.g) {
            ed.s sVar = ((dd.g) m0VarM).f5873a;
            jc.l.c(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ed.o) sVar).f6508a;
        }
        be.b bVarF = ie.d.f(eVar);
        if (bVarF == null) {
            return null;
        }
        return h(ed.d.d(eVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(ge.g gVar, ClassLoader classLoader) {
        se.w wVar;
        Class clsH;
        if (gVar instanceof ge.a) {
            return i((zc.b) ((ge.a) gVar).f7527a);
        }
        int i10 = 0;
        if (gVar instanceof ge.b) {
            ge.b bVar = (ge.b) gVar;
            ge.x xVar = bVar instanceof ge.x ? (ge.x) bVar : null;
            if (xVar != null && (wVar = xVar.f7536c) != null) {
                Object obj = bVar.f7527a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(vb.n.K(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((ge.g) it.next(), classLoader));
                }
                be.e eVar = vc.i.f22839e;
                yc.h hVarH = wVar.t().h();
                vc.k kVarR = hVarH == null ? null : vc.i.r(hVarH);
                switch (kVarR == null ? -1 : e2.f19794a[kVarR.ordinal()]) {
                    case -1:
                        if (!vc.i.y(wVar)) {
                            throw new IllegalStateException(("Not an array type: " + wVar).toString());
                        }
                        se.w wVarB = ((se.n0) vb.m.x0(wVar.q())).b();
                        jc.l.d(wVarB, "getType(...)");
                        yc.h hVarH2 = wVarB.t().h();
                        yc.e eVar2 = hVarH2 instanceof yc.e ? (yc.e) hVarH2 : null;
                        if (eVar2 == null) {
                            throw new IllegalStateException(("Not a class type: " + wVarB).toString());
                        }
                        if (vc.i.G(wVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                jc.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i10] = obj2;
                                i10++;
                            }
                            return strArr;
                        }
                        if (vc.i.b(eVar2, vc.n.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i10 < size2) {
                                Object obj3 = arrayList.get(i10);
                                jc.l.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i10] = obj3;
                                i10++;
                            }
                            return clsArr;
                        }
                        be.b bVarF = ie.d.f(eVar2);
                        if (bVarF != null && (clsH = h(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            jc.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i10 < size3) {
                                objArr[i10] = arrayList.get(i10);
                                i10++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new ce.j0();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            jc.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            jc.l.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            jc.l.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            jc.l.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            jc.l.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            jc.l.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            jc.l.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        return jArr;
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            jc.l.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof ge.i) {
            ub.k kVar = (ub.k) ((ge.i) gVar).f7527a;
            be.b bVar2 = (be.b) kVar.f21543a;
            be.e eVar3 = (be.e) kVar.f21544b;
            Class clsH2 = h(classLoader, bVar2, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, eVar3.b());
            }
        } else {
            if (!(gVar instanceof ge.s)) {
                if ((gVar instanceof ge.j) || (gVar instanceof ge.u)) {
                    return null;
                }
                return gVar.b();
            }
            ge.r rVar = (ge.r) ((ge.s) gVar).f7527a;
            if (rVar instanceof ge.q) {
                ge.f fVar = ((ge.q) rVar).f7535a;
                return h(classLoader, fVar.f7525a, fVar.f7526b);
            }
            if (!(rVar instanceof ge.p)) {
                throw new ce.j0();
            }
            yc.h hVarH3 = ((ge.p) rVar).f7534a.t().h();
            yc.e eVar4 = hVarH3 instanceof yc.e ? (yc.e) hVarH3 : null;
            if (eVar4 != null) {
                return j(eVar4);
            }
        }
        return null;
    }

    public static final List l(ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        List listW;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (g8.a.D(g8.a.y((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        Class clsD = g8.a.D(g8.a.y(annotation));
                        if (!clsD.getSimpleName().equals("Container") || clsD.getAnnotation(jc.b0.class) == null) {
                            listW = ud.b.w(annotation);
                        } else {
                            Object objInvoke = clsD.getDeclaredMethod("value", null).invoke(annotation, null);
                            jc.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listW = vb.l.c0((Annotation[]) objInvoke);
                        }
                        vb.m.P(arrayList2, listW);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}
