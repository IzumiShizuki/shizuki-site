package ee;

import androidx.media3.exoplayer.offline.u;
import bd.a0;
import bd.n0;
import bd.p0;
import bd.r0;
import bd.y0;
import bd.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import se.j0;
import se.w;
import yc.k0;
import yc.o;
import yc.q0;
import yc.t;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6535b = vb.m.G0(ServiceLoader.load(f.class, f.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6537d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te.c f6538a;

    static {
        c cVar = new c();
        f6537d = cVar;
        f6536c = new l(cVar);
    }

    public l(te.c cVar) {
        if (cVar != null) {
            this.f6538a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.l.a(int):void");
    }

    public static boolean b(w wVar, w wVar2, j0 j0Var) {
        if (wVar == null) {
            a(44);
            throw null;
        }
        if (wVar2 == null) {
            a(45);
            throw null;
        }
        if (se.c.l(wVar) && se.c.l(wVar2)) {
            return true;
        }
        return se.d.h(j0Var, wVar.x(), wVar2.x());
    }

    public static void c(yc.c cVar, LinkedHashSet linkedHashSet) {
        if (cVar == null) {
            a(17);
            throw null;
        }
        if (cVar.j() != 2) {
            linkedHashSet.add(cVar);
            return;
        }
        if (cVar.A().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + cVar);
        }
        Iterator it = cVar.A().iterator();
        while (it.hasNext()) {
            c((yc.c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(yc.b bVar) {
        a0 a0VarV0 = bVar.v0();
        ArrayList arrayList = new ArrayList();
        if (a0VarV0 != null) {
            arrayList.add(a0VarV0.b());
        }
        Iterator it = bVar.o0().iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).b());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x018c, code lost:
    
        if (r1 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018e, code lost:
    
        r1 = yc.o.f26132h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0191, code lost:
    
        r1 = yc.o.f26131g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0193, code lost:
    
        r12 = ((yc.c) s(r11, new ee.i(0))).F0(r12, r0, r1);
        r13.p(r12, r11);
        r13.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a9, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.Collection r11, yc.e r12, ee.m r13) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.l.e(java.util.Collection, yc.e, ee.m):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, ic.k kVar, ic.k kVar2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        yc.b bVar = (yc.b) kVar.a(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            yc.b bVar2 = (yc.b) kVar.a(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(bVar, bVar2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    kVar2.a(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static k i(yc.b bVar, yc.b bVar2) {
        boolean z10;
        if (bVar == null) {
            a(38);
            throw null;
        }
        if (bVar2 == null) {
            a(39);
            throw null;
        }
        boolean z11 = bVar instanceof t;
        if ((z11 && !(bVar2 instanceof t)) || (((z10 = bVar instanceof k0)) && !(bVar2 instanceof k0))) {
            return k.c("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return k.c("Name mismatch");
        }
        k kVarC = (bVar.v0() == null) != (bVar2.v0() == null) ? k.c("Receiver presence mismatch") : bVar.o0().size() != bVar2.o0().size() ? k.c("Value parameter number mismatch") : null;
        if (kVarC != null) {
            return kVarC;
        }
        return null;
    }

    public static int j(yc.b bVar, yc.b bVar2) {
        l lVar = f6536c;
        int iB = lVar.l(bVar2, bVar, null).b();
        int iB2 = lVar.m(bVar, bVar2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(yc.b bVar, yc.b bVar2) {
        if (bVar == null) {
            a(65);
            throw null;
        }
        if (bVar2 == null) {
            a(66);
            throw null;
        }
        w wVarN = bVar.n();
        w wVarN2 = bVar2.n();
        if (!p(bVar, bVar2)) {
            return false;
        }
        j0 j0VarF = f6536c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof t) {
            return o(bVar, wVarN, bVar2, wVarN2, j0VarF);
        }
        if (!(bVar instanceof k0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        k0 k0Var = (k0) bVar;
        k0 k0Var2 = (k0) bVar2;
        r0 r0VarE = k0Var.e();
        r0 r0VarE2 = k0Var2.e();
        if ((r0VarE == null || r0VarE2 == null) ? true : p(r0VarE, r0VarE2)) {
            return (k0Var.u0() && k0Var2.u0()) ? se.d.h(j0VarF, wVarN.x(), wVarN2.x()) : (k0Var.u0() || !k0Var2.u0()) && o(bVar, wVarN, bVar2, wVarN2, j0VarF);
        }
        return false;
    }

    public static boolean o(yc.b bVar, w wVar, yc.b bVar2, w wVar2, j0 j0Var) {
        if (bVar == null) {
            a(71);
            throw null;
        }
        if (wVar == null) {
            a(72);
            throw null;
        }
        if (bVar2 == null) {
            a(73);
            throw null;
        }
        if (wVar2 == null) {
            a(74);
            throw null;
        }
        return se.d.n(se.d.f19934a, j0Var, wVar.x(), wVar2.x());
    }

    public static boolean p(yc.b bVar, yc.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = o.b(bVar.f(), bVar2.f());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(yc.b bVar, yc.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        c cVar = c.f6523a;
        if (!zEquals && cVar.c(bVar.a(), bVar2.a(), false)) {
            return true;
        }
        yc.b bVarA = bVar2.a();
        int i10 = e.f6524a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(bVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.c(bVarA, (yc.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(yc.c cVar, ic.k kVar) {
        ld.o oVar;
        ld.o oVarF;
        ld.o oVar2;
        if (cVar == null) {
            a(105);
            throw null;
        }
        for (yc.c cVar2 : cVar.A()) {
            if (cVar2.f() == o.f26131g) {
                r(cVar2, kVar);
            }
        }
        if (cVar.f() != o.f26131g) {
            return;
        }
        Collection<yc.c> collectionA = cVar.A();
        if (collectionA == null) {
            a(107);
            throw null;
        }
        if (collectionA.isEmpty()) {
            oVarF = o.f26134j;
        } else {
            Iterator it = collectionA.iterator();
            loop3: while (true) {
                oVar = null;
                while (it.hasNext()) {
                    ld.o oVarF2 = ((yc.c) it.next()).f();
                    if (oVar != null) {
                        Integer numB = o.b(oVarF2, oVar);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    oVar = oVarF2;
                }
            }
            if (oVar == null) {
                oVarF = null;
                break;
            }
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                Integer numB2 = o.b(oVar, ((yc.c) it2.next()).f());
                if (numB2 == null || numB2.intValue() < 0) {
                    oVarF = null;
                    break;
                }
            }
            oVarF = oVar;
        }
        if (oVarF == null) {
            oVarF = null;
            break;
        }
        if (cVar.j() == 2) {
            for (yc.c cVar3 : collectionA) {
                if (cVar3.s() != x.f26158e && !cVar3.f().equals(oVarF)) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = o.f(oVarF.f12236a.c());
        }
        if (oVarF == null) {
            if (kVar != null) {
                kVar.a(cVar);
            }
            oVar2 = o.f26129e;
        } else {
            oVar2 = oVarF;
        }
        if (cVar instanceof p0) {
            p0 p0Var = (p0) cVar;
            if (oVar2 == null) {
                p0.U0(20);
                throw null;
            }
            p0Var.f2642j = oVar2;
            Iterator it3 = ((k0) cVar).N().iterator();
            while (it3.hasNext()) {
                r((yc.j0) it3.next(), oVarF == null ? null : kVar);
            }
            return;
        }
        if (cVar instanceof z) {
            z zVar = (z) cVar;
            if (oVar2 != null) {
                zVar.f2722l = oVar2;
                return;
            } else {
                z.U0(10);
                throw null;
            }
        }
        n0 n0Var = (n0) cVar;
        n0Var.f2622k = oVar2;
        if (oVar2 != n0Var.D1().f()) {
            n0Var.f2616e = false;
        }
    }

    public static Object s(Collection collection, ic.k kVar) {
        Object next;
        if (collection.size() == 1) {
            Object objX = vb.m.X(collection);
            if (objX != null) {
                return objX;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(vb.n.K(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(kVar.a(it.next()));
        }
        Object objX2 = vb.m.X(collection);
        yc.b bVar = (yc.b) kVar.a(objX2);
        for (Object obj : collection) {
            yc.b bVar2 = (yc.b) kVar.a(obj);
            if (bVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(bVar2, (yc.b) it2.next())) {
                    break;
                }
            }
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                objX2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objX2 != null) {
                return objX2;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objX3 = vb.m.X(arrayList);
            if (objX3 != null) {
                return objX3;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!se.c.m(((yc.b) kVar.a(next)).n())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objX4 = vb.m.X(arrayList);
        if (objX4 != null) {
            return objX4;
        }
        a(82);
        throw null;
    }

    public final j0 f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        te.c cVar = this.f6538a;
        if (zIsEmpty) {
            return new u((HashMap) null, cVar).Y0();
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((q0) list.get(i10)).Q(), ((q0) list2.get(i10)).Q());
        }
        return new u(map, cVar).Y0();
    }

    public final void h(be.e eVar, Collection collection, Collection collection2, yc.e eVar2, m mVar) {
        Integer numB;
        if (eVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (eVar2 == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                if (linkedHashSet.size() >= 2) {
                    yc.k kVarY = ((yc.c) linkedHashSet.iterator().next()).y();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            if (((yc.c) it2.next()).y() != kVarY) {
                                LinkedList<yc.c> linkedList = new LinkedList(linkedHashSet);
                                while (!linkedList.isEmpty()) {
                                    linkedList.isEmpty();
                                    yc.c cVar = null;
                                    for (yc.c cVar2 : linkedList) {
                                        if (cVar == null || ((numB = o.b(cVar.f(), cVar2.f())) != null && numB.intValue() < 0)) {
                                            cVar = cVar2;
                                        }
                                    }
                                    jc.l.b(cVar);
                                    e(g(cVar, linkedList, new i(1), new j(i10, mVar, cVar)), eVar2, mVar);
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    e(Collections.singleton((yc.c) it3.next()), eVar2, mVar);
                }
                return;
            }
            yc.c cVar3 = (yc.c) it.next();
            if (cVar3 == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i11 = bf.j.f2808c;
            bf.j jVarE = bf.m.e();
            Iterator it4 = collection.iterator();
            while (it4.hasNext()) {
                yc.c cVar4 = (yc.c) it4.next();
                int iB = l(cVar4, cVar3, eVar2).b();
                boolean z10 = !o.e(cVar4.f()) && o.c(o.f26136l, cVar4, cVar3) == null;
                int iB2 = w0.c.b(iB);
                if (iB2 == 0) {
                    if (z10) {
                        jVarE.add(cVar4);
                    }
                    arrayList.add(cVar4);
                } else if (iB2 == 2) {
                    if (z10) {
                        mVar.d(cVar4, cVar3);
                    }
                    arrayList.add(cVar4);
                }
            }
            mVar.p(cVar3, jVarE);
            linkedHashSet.removeAll(arrayList);
        }
    }

    public final k l(yc.b bVar, yc.b bVar2, yc.e eVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, eVar, false);
        }
        a(20);
        throw null;
    }

    public final k m(yc.b bVar, yc.b bVar2, yc.e eVar, boolean z10) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        k kVarN = n(bVar, bVar2, z10);
        boolean z11 = kVarN.b() == 1;
        List<f> list = f6535b;
        for (f fVar : list) {
            if (fVar.a() != 1 && (!z11 || fVar.a() != 2)) {
                int iB = w0.c.b(fVar.b(bVar, bVar2, eVar));
                if (iB == 0) {
                    z11 = true;
                } else if (iB == 1) {
                    return k.c("External condition");
                }
            }
        }
        if (!z11) {
            return kVarN;
        }
        for (f fVar2 : list) {
            if (fVar2.a() == 1) {
                int iB2 = w0.c.b(fVar2.b(bVar, bVar2, eVar));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + fVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return k.c("External condition");
                }
            }
        }
        k kVar = k.f6532c;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r15.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ee.k n(yc.b r19, yc.b r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.l.n(yc.b, yc.b, boolean):ee.k");
    }
}
