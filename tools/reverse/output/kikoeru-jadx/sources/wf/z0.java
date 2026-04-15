package wf;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf.g[] f24216a = new uf.g[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sf.a[] f24217b = new sf.a[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f24218c = new Object();

    public static final f0 a(String str, sf.a aVar) {
        return new f0(str, new g0(aVar));
    }

    public static final Set b(uf.g gVar) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof l) {
            return ((l) gVar).a();
        }
        HashSet hashSet = new HashSet(gVar.p());
        int iP = gVar.p();
        for (int i10 = 0; i10 < iP; i10++) {
            hashSet.add(gVar.q(i10));
        }
        return hashSet;
    }

    public static final uf.g[] c(List list) {
        uf.g[] gVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (uf.g[]) list.toArray(new uf.g[0])) == null) ? f24216a : gVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final sf.a d(pc.c r16, sf.a... r17) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.z0.d(pc.c, sf.a[]):sf.a");
    }

    public static final int e(uf.g gVar, uf.g[] gVarArr) {
        jc.l.e(gVarArr, "typeParams");
        int iHashCode = (gVar.m().hashCode() * 31) + Arrays.hashCode(gVarArr);
        int iP = gVar.p();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iP > 0)) {
                break;
            }
            int i11 = iP - 1;
            int i12 = i10 * 31;
            String strM = gVar.s(gVar.p() - iP).m();
            if (strM != null) {
                iHashCode2 = strM.hashCode();
            }
            i10 = i12 + iHashCode2;
            iP = i11;
        }
        int iP2 = gVar.p();
        int iHashCode3 = 1;
        while (true) {
            if (!(iP2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iP2 - 1;
            int i14 = iHashCode3 * 31;
            ud.n nVarJ = gVar.s(gVar.p() - iP2).j();
            iHashCode3 = i14 + (nVarJ != null ? nVarJ.hashCode() : 0);
            iP2 = i13;
        }
    }

    public static final sf.a f(Object obj, sf.a... aVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = sf.a.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (objInvoke instanceof sf.a) {
                return (sf.a) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean g(pc.c cVar) {
        jc.l.e(cVar, "<this>");
        return g8.a.D(cVar).isInterface();
    }

    public static final pc.c h(pc.v vVar) {
        pc.d dVarC = vVar.c();
        if (dVarC instanceof pc.c) {
            return (pc.c) dVarC;
        }
        if (!(dVarC instanceof pc.w)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + dVarC);
        }
        throw new IllegalArgumentException("Captured type parameter " + dVarC + " from generic non-reified function. Such functionality cannot be supported because " + dVarC + " is erased, either specify serializer explicitly or make calling function inline with reified " + dVarC + '.');
    }

    public static final void i(int i10, int i11, uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(gVar.q(i13));
            }
            i12 >>>= 1;
        }
        throw new sf.b(gVar.m(), arrayList);
    }

    public static final void j(String str, pc.c cVar) {
        String string;
        jc.l.e(cVar, "baseClass");
        String str2 = "in the polymorphic scope of '" + cVar.y() + '\'';
        if (str == null) {
            string = a0.c.G('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sb = new StringBuilder("Serializer for subclass '");
            sb.append(str);
            sb.append("' is not found ");
            sb.append(str2);
            sb.append(".\nCheck if class with serial name '");
            j2.h0.w(sb, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb.append(cVar.y());
            sb.append("' has to be sealed and '@Serializable'.");
            string = sb.toString();
        }
        throw new sf.h(string);
    }

    public static final String k(uf.g gVar) {
        return vb.m.f0(nh.b.E(0, gVar.p()), ", ", gVar.m() + '(', ")", new e7.y(19, gVar), 24);
    }
}
