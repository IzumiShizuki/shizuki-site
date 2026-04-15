package bd;

import android.view.View;
import b0.w1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sc.r1;
import sc.s1;
import sc.v1;
import sc.y1;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2566b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f2565a = i10;
        this.f2566b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [se.r0] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v3, types: [bd.z] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [bd.a0] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [bd.l, java.lang.Object] */
    @Override // ic.a
    public final Object b() throws Throwable {
        ?? r14;
        l lVarH;
        List list;
        qe.s sVar;
        ?? r15;
        Throwable th2;
        ?? arrayList;
        ge.i iVar;
        zc.m mVar;
        ge.b bVarA;
        int i10 = this.f2565a;
        vb.r rVar = vb.r.f22819a;
        vb.s sVar2 = vb.s.f22820a;
        int i11 = 10;
        int iHashCode = 0;
        Throwable th3 = null;
        Object obj = this.f2566b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                qe.s sVar3 = (qe.s) hVar;
                yc.e eVarD1 = sVar3.D1();
                if (eVarD1 == null) {
                    return rVar;
                }
                Collection<??> collectionT = eVarD1.T();
                jc.l.d(collectionT, "getConstructors(...)");
                ArrayList arrayList2 = new ArrayList();
                for (?? r82 : collectionT) {
                    k0 k0Var = v0.G;
                    re.o oVar = hVar.f2571e;
                    jc.l.b(r82);
                    k0Var.getClass();
                    jc.l.e(oVar, "storageManager");
                    Object objD = sVar3.D1() == null ? th3 : se.r0.d(sVar3.E1());
                    if (objD == null || (lVarH = r82.h((r14 = objD))) == null) {
                        sVar = sVar3;
                        Throwable th4 = th3;
                        th2 = th4;
                        r15 = th4;
                    } else {
                        zc.h annotations = ((androidx.lifecycle.q) r82).getAnnotations();
                        z zVar = (z) r82;
                        int iJ = zVar.j();
                        j2.h0.y(iJ, "getKind(...)");
                        yc.m0 m0VarM = hVar.m();
                        Throwable th5 = th3;
                        jc.l.d(m0VarM, "getSource(...)");
                        v0 v0Var = new v0(oVar, hVar, lVarH, null, annotations, iJ, m0VarM);
                        List listO0 = zVar.o0();
                        if (listO0 == null) {
                            z.U0(28);
                            throw th5;
                        }
                        ArrayList arrayListH1 = z.H1(v0Var, listO0, r14, false, false, null);
                        if (arrayListH1 == null) {
                            sVar = sVar3;
                            r15 = th5;
                            th2 = th5;
                        } else {
                            se.a0 a0VarH = se.c.H(se.c.n(lVarH.f2717g.x()), sVar3.E());
                            a0 a0Var = zVar.f2720j;
                            se.x0 x0Var = se.x0.INVARIANT;
                            zc.f fVar = zc.g.f26696a;
                            ?? K = a0Var != null ? ee.m.k(v0Var, r14.g(a0Var.b(), x0Var), fVar) : th5;
                            yc.e eVarD12 = sVar3.D1();
                            if (eVarD12 != null) {
                                List listZ0 = zVar.z0();
                                jc.l.d(listZ0, "getContextReceiverParameters(...)");
                                List list2 = listZ0;
                                ArrayList arrayList3 = new ArrayList(vb.n.K(list2, i11));
                                int i12 = 0;
                                for (Object obj2 : list2) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        ud.b.H();
                                        throw th5;
                                    }
                                    a0 a0Var2 = (a0) obj2;
                                    se.w wVarG = r14.g(a0Var2.b(), x0Var);
                                    me.d dVarD1 = a0Var2.D1();
                                    jc.l.c(dVarD1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                    qe.s sVar4 = sVar3;
                                    me.a aVar = new me.a(eVarD12, wVarG, ((me.a) dVarD1).B1());
                                    ef.l lVar = be.f.f2753a;
                                    arrayList3.add(new a0(eVarD12, aVar, fVar, be.e.e(be.f.f2754b + '_' + i12)));
                                    i12 = i13;
                                    sVar3 = sVar4;
                                }
                                list = arrayList3;
                            } else {
                                list = rVar;
                            }
                            sVar = sVar3;
                            ?? r152 = v0Var;
                            r152.I1(K, null, list, hVar.L(), arrayListH1, a0VarH, yc.x.f26155b, hVar.f2572f);
                            r15 = r152;
                            th2 = th5;
                        }
                    }
                    if (r15 != 0) {
                        arrayList2.add(r15);
                    }
                    th3 = th2;
                    sVar3 = sVar;
                    i11 = 10;
                }
                return arrayList2;
            case 1:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                i iVar2 = (i) obj;
                sb.append(((be.e) iVar2.f2585b).b());
                return a2.c.E(((k) iVar2.f2586c).getUpperBounds(), sb.toString());
            case 2:
                u uVar = (u) obj;
                HashSet hashSet = new HashSet();
                for (be.e eVar : (Set) uVar.f2675e.f2678i.b()) {
                    gd.b bVar = gd.b.f7519f;
                    hashSet.addAll(uVar.f(eVar, bVar));
                    hashSet.addAll(uVar.b(eVar, bVar));
                }
                return hashSet;
            case 3:
                return (List) ((x0) obj).f2684l.getValue();
            case 4:
                de.m mVar2 = ((de.i) obj).f5909a;
                de.m mVar3 = new de.m();
                Field[] declaredFields = de.m.class.getDeclaredFields();
                jc.l.d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj3 = field.get(mVar2);
                        de.l lVar2 = obj3 instanceof de.l ? (de.l) obj3 : null;
                        if (lVar2 != null) {
                            String name = field.getName();
                            jc.l.d(name, "getName(...)");
                            ef.u.k0(name, "is", false);
                            pc.c cVarB = jc.z.f10839a.b(de.m.class);
                            field.getName();
                            String name2 = field.getName();
                            jc.l.d(name2, "getName(...)");
                            if (name2.length() > 0) {
                                Character.toUpperCase(name2.charAt(0));
                                jc.l.d(name2.substring(1), "substring(...)");
                            }
                            ((jc.e) cVarB).b();
                            field.set(mVar3, new de.l(lVar2.f5929a, mVar3));
                        }
                    }
                }
                de.i iVar3 = de.i.f5906c;
                mVar3.L.b(ud.e.J(mVar3.m(), ud.b.x(vc.n.f22887p, vc.n.f22888q)), de.m.Y[36]);
                mVar3.f5931a = true;
                return new de.i(mVar3);
            case 5:
                se.w wVarB = ((se.n0) obj).b();
                jc.l.d(wVarB, "getType(...)");
                return wVarB;
            case 6:
                ld.u uVar2 = (ld.u) obj;
                wb.b bVarL = ud.b.l();
                bVarL.add(uVar2.f12251a.f12181a);
                ld.a0 a0Var3 = uVar2.f12252b;
                if (a0Var3 != null) {
                    bVarL.add("under-migration:".concat(a0Var3.f12181a));
                }
                for (Map.Entry entry : uVar2.f12253c.entrySet()) {
                    bVarL.add("@" + entry.getKey() + ':' + ((ld.a0) entry.getValue()).f12181a);
                }
                return (String[]) ud.b.g(bVarL).toArray(new String[0]);
            case 7:
                le.h hVar2 = (le.h) obj;
                List listH = hVar2.h();
                List list3 = listH;
                ArrayList arrayList4 = new ArrayList(3);
                c cVar = hVar2.f12322b;
                Collection collectionI = cVar.Q().i();
                jc.l.d(collectionI, "getSupertypes(...)");
                ArrayList arrayList5 = new ArrayList();
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    vb.m.P(arrayList5, a.a.E(((se.w) it.next()).n0(), null, 3));
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList5) {
                    if (obj4 instanceof yc.c) {
                        arrayList6.add(obj4);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : arrayList6) {
                    be.e name3 = ((yc.c) obj5).getName();
                    Object arrayList7 = linkedHashMap.get(name3);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap.put(name3, arrayList7);
                    }
                    ((List) arrayList7).add(obj5);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    jc.l.d(key, "component1(...)");
                    be.e eVar2 = (be.e) key;
                    List list4 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj6 : list4) {
                        Boolean boolValueOf = Boolean.valueOf(((yc.c) obj6) instanceof yc.t);
                        Object arrayList8 = linkedHashMap2.get(boolValueOf);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList8);
                        }
                        ((List) arrayList8).add(obj6);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list5 = (List) entry3.getValue();
                        ee.l lVar3 = ee.l.f6536c;
                        List list6 = list5;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj7 : listH) {
                                if (jc.l.a(((p) ((yc.t) obj7)).getName(), eVar2)) {
                                    arrayList.add(obj7);
                                }
                            }
                        } else {
                            arrayList = rVar;
                        }
                        lVar3.h(eVar2, list6, (Collection) arrayList, cVar, new le.g(arrayList4, hVar2));
                    }
                }
                return vb.m.q0(list3, bf.m.d(arrayList4));
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                se.p0 p0VarF = ((se.r0) obj).f();
                p0VarF.getClass();
                return new se.r0(p0VarF);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                le.t tVar = (le.t) obj;
                return tVar.h(a.a.E(tVar.f12344b, null, 3));
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                Object obj8 = md.e.f15110a;
                sd.a aVar2 = ((md.i) obj).f15104d;
                ed.t tVar2 = aVar2 instanceof ed.t ? (ed.t) aVar2 : null;
                if (tVar2 == null || (mVar = (zc.m) md.e.f15111b.get(be.e.e(tVar2.f6513b.name()).b())) == null) {
                    iVar = null;
                } else {
                    be.c cVar2 = vc.n.f22893v;
                    jc.l.e(cVar2, "topLevelFqName");
                    iVar = new ge.i(new be.b(cVar2.b(), cVar2.f2744a.g()), be.e.e(mVar.name()));
                }
                Map mapU = iVar != null ? vb.w.u(new ub.k(md.c.f15107c, iVar)) : null;
                return mapU == null ? sVar2 : mapU;
            case 11:
                sd.a aVar3 = ((md.j) obj).f15104d;
                if (aVar3 instanceof ed.h) {
                    Object obj9 = md.e.f15110a;
                    bVarA = md.e.a(((ed.h) aVar3).a());
                } else if (aVar3 instanceof ed.t) {
                    Object obj10 = md.e.f15110a;
                    bVarA = md.e.a(ud.b.w(aVar3));
                } else {
                    bVarA = null;
                }
                Map mapU2 = bVarA != null ? vb.w.u(new ub.k(md.c.f15106b, bVarA)) : null;
                return mapU2 == null ? sVar2 : mapU2;
            case 12:
                Set setKeySet = ((LinkedHashMap) ((pe.c) obj).f17107i.f1394b).keySet();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj11 : setKeySet) {
                    be.b bVar2 = (be.b) obj11;
                    if (!bVar2.g() && !oe.g.f16360c.contains(bVar2)) {
                        arrayList9.add(obj11);
                    }
                }
                ArrayList arrayList10 = new ArrayList(vb.n.K(arrayList9, 10));
                Iterator it2 = arrayList9.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(((be.b) it2.next()).f());
                }
                return arrayList10;
            case 13:
                pd.d dVar = (pd.d) obj;
                pd.p pVar = dVar.f17004c;
                Collection collectionValues = ((Map) n7.b0.r(pVar.f17067i, pd.p.f17064m[0])).values();
                ArrayList arrayList11 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    qe.p pVarA = ((od.a) dVar.f17003b.f1395c).f16318d.a(pVar, (dd.c) it3.next());
                    if (pVarA != null) {
                        arrayList11.add(pVarA);
                    }
                }
                return (le.o[]) g8.a.S(arrayList11).toArray(new le.o[0]);
            case 14:
                HashSet hashSet2 = new HashSet();
                qe.h hVar3 = (qe.h) ((w1) obj).f1394b;
                pd.h hVar4 = hVar3.f18179n;
                oe.k kVar = hVar3.f18177l;
                wd.k kVar2 = hVar3.f18170e;
                Iterator it4 = hVar4.i().iterator();
                while (it4.hasNext()) {
                    for (yc.k kVar3 : a.a.E(((se.w) it4.next()).n0(), null, 3)) {
                        if ((kVar3 instanceof s0) || (kVar3 instanceof yc.k0)) {
                            hashSet2.add(((yc.c) kVar3).getName());
                        }
                    }
                }
                List list7 = kVar2.f23817q;
                jc.l.d(list7, "getFunctionList(...)");
                Iterator it5 = list7.iterator();
                while (it5.hasNext()) {
                    hashSet2.add(u3.x0.r(kVar.f16391b, ((wd.b0) it5.next()).f23554f));
                }
                List list8 = kVar2.f23818r;
                jc.l.d(list8, "getPropertyList(...)");
                Iterator it6 = list8.iterator();
                while (it6.hasNext()) {
                    hashSet2.add(u3.x0.r(kVar.f16391b, ((wd.j0) it6.next()).f23781f));
                }
                return ud.e.J(hashSet2, hashSet2);
            case 15:
                qe.o oVar2 = (qe.o) obj;
                Set setN = oVar2.n();
                if (setN == null) {
                    return null;
                }
                return ud.e.J(ud.e.J(oVar2.m(), oVar2.f18208c.f18199c.keySet()), setN);
            case 16:
                qe.t tVar3 = (qe.t) obj;
                oe.k kVar4 = tVar3.f18223k;
                return vb.m.G0(kVar4.f16390a.f16368e.c(tVar3.f18224l, kVar4.f16391b));
            case 17:
                return y1.a(((sc.i0) obj).b());
            case 18:
                return new sc.l0((sc.m0) obj);
            case 19:
                return new sc.n0((sc.o0) obj);
            case 20:
                return new sc.p0((sc.q0) obj);
            case 21:
                return new sc.r0((sc.s0) obj);
            case 22:
                return new r1((s1) obj);
            case 23:
                List upperBounds = ((sc.w1) obj).f19906a.getUpperBounds();
                jc.l.d(upperBounds, "getUpperBounds(...)");
                List list9 = upperBounds;
                ArrayList arrayList12 = new ArrayList(vb.n.K(list9, 10));
                Iterator it7 = list9.iterator();
                while (it7.hasNext()) {
                    arrayList12.add(new v1((se.w) it7.next(), null));
                }
                return arrayList12;
            case 24:
                return new se.e(((se.f) obj).b());
            case 25:
                return se.c.y((yc.q0) ((se.f0) obj).f19943b);
            case 26:
                return ue.l.c(ue.k.CANNOT_COMPUTE_ERASED_BOUND, ((m0.w) obj).toString());
            case 27:
                for (Map.Entry entry4 : ((Map) obj).entrySet()) {
                    String str = (String) entry4.getKey();
                    Object value = entry4.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            case 28:
                ic.a aVar4 = ((te.i) obj).f20736b;
                if (aVar4 != null) {
                    return (List) aVar4.b();
                }
                return null;
            default:
                u3.s.a((View) obj, 13);
                return ub.a0.f21526a;
        }
    }
}
