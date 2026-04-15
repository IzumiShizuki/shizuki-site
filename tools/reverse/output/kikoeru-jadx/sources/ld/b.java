package ld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f12182c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.n f12183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12184b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String str = aVar.f12176a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, aVar);
            }
        }
        f12182c = linkedHashMap;
    }

    public b(b7.n nVar) {
        this.f12183a = nVar;
    }

    public static ArrayList a(Object obj, boolean z10) {
        zc.b bVar = (zc.b) obj;
        jc.l.e(bVar, "<this>");
        Map mapC = bVar.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapC.entrySet()) {
            vb.m.P(arrayList, (!z10 || jc.l.a((be.e) entry.getKey(), w.f12258b)) ? j((ge.g) entry.getValue()) : vb.r.f22819a);
        }
        return arrayList;
    }

    public static Object c(Object obj, be.c cVar) {
        for (Object obj2 : e(obj)) {
            if (jc.l.a(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static be.c d(Object obj) {
        zc.b bVar = (zc.b) obj;
        jc.l.e(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        zc.h annotations;
        zc.b bVar = (zc.b) obj;
        jc.l.e(bVar, "<this>");
        yc.e eVarD = ie.d.d(bVar);
        return (eVarD == null || (annotations = eVarD.getAnnotations()) == null) ? vb.r.f22819a : annotations;
    }

    public static boolean f(Object obj, be.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (jc.l.a(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(ge.g gVar) {
        if (!(gVar instanceof ge.b)) {
            return gVar instanceof ge.i ? ud.b.w(((ge.i) gVar).f7529c.c()) : vb.r.f22819a;
        }
        Iterable iterable = (Iterable) ((ge.b) gVar).f7527a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            vb.m.P(arrayList, j((ge.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ld.t b(ld.t r17, zc.h r18) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.b.b(ld.t, zc.h):ld.t");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r9.equals("NEVER") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r9.equals("MAYBE") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final td.h g(java.lang.Object r9, boolean r10) {
        /*
            r8 = this;
            be.c r0 = d(r9)
            r1 = 0
            if (r0 != 0) goto L9
            goto L8f
        L9:
            b7.n r2 = r8.f12183a
            java.lang.Object r2 = r2.f1986d
            bd.a r2 = (bd.a) r2
            java.lang.Object r2 = r2.a(r0)
            ld.a0 r2 = (ld.a0) r2
            r2.getClass()
            ld.a0 r3 = ld.a0.f12177b
            if (r2 != r3) goto L1d
            return r1
        L1d:
            java.util.Set r3 = ld.x.f12284k
            boolean r3 = r3.contains(r0)
            td.g r4 = td.g.f20682c
            r5 = 0
            if (r3 == 0) goto L29
            goto L81
        L29:
            java.util.Set r3 = ld.x.f12285l
            boolean r3 = r3.contains(r0)
            td.g r6 = td.g.f20681b
            if (r3 == 0) goto L35
        L33:
            r4 = r6
            goto L81
        L35:
            java.util.Set r3 = ld.x.f12286m
            boolean r3 = r3.contains(r0)
            td.g r7 = td.g.f20680a
            if (r3 == 0) goto L41
        L3f:
            r4 = r7
            goto L81
        L41:
            be.c r3 = ld.x.f12280g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8f
            java.util.ArrayList r9 = a(r9, r5)
            java.lang.Object r9 = vb.m.Z(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L81
            int r0 = r9.hashCode()
            switch(r0) {
                case 73135176: goto L78;
                case 74175084: goto L6f;
                case 433141802: goto L66;
                case 1933739535: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L8f
        L5d:
            java.lang.String r0 = "ALWAYS"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L8f
            goto L81
        L66:
            java.lang.String r0 = "UNKNOWN"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L3f
            goto L8f
        L6f:
            java.lang.String r0 = "NEVER"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L33
            goto L8f
        L78:
            java.lang.String r0 = "MAYBE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L33
            goto L8f
        L81:
            td.h r9 = new td.h
            ld.a0 r0 = ld.a0.f12178c
            if (r2 != r0) goto L88
            goto L8a
        L88:
            if (r10 == 0) goto L8b
        L8a:
            r5 = 1
        L8b:
            r9.<init>(r4, r5)
            return r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.b.g(java.lang.Object, boolean):td.h");
    }

    public final a0 h(Object obj) {
        String str;
        u uVar = (u) this.f12183a.f1985c;
        a0 a0Var = (a0) uVar.f12253c.get(d(obj));
        if (a0Var != null) {
            return a0Var;
        }
        Object objC = c(obj, x.f12289p);
        if (objC == null || (str = (String) vb.m.Z(a(objC, false))) == null) {
            return null;
        }
        a0 a0Var2 = uVar.f12252b;
        if (a0Var2 != null) {
            return a0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return a0.f12177b;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return a0.f12179d;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return a0.f12178c;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        jc.l.e(obj, "annotation");
        if (!((u) this.f12183a.f1985c).f12254d) {
            if (vb.m.S(x.f12283j, d(obj)) || f(obj, x.f12277d)) {
                return obj;
            }
            if (f(obj, x.f12278e)) {
                yc.e eVarD = ie.d.d((zc.b) obj);
                jc.l.b(eVarD);
                ConcurrentHashMap concurrentHashMap = this.f12184b;
                Object obj2 = concurrentHashMap.get(eVarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                    if (objI != null) {
                        break;
                    }
                }
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(eVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
