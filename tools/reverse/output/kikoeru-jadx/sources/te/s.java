package te;

import c0.x;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import se.a0;
import se.h0;
import se.k0;
import se.v;
import se.w;
import se.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f20752a = new s();

    public static ArrayList a(AbstractCollection abstractCollection, ic.n nVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    a0 a0Var2 = (a0) it2.next();
                    if (a0Var2 != a0Var) {
                        jc.l.b(a0Var2);
                        jc.l.b(a0Var);
                        if (((Boolean) nVar.q(a0Var2, a0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [se.h0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, se.h0, ye.d] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18, types: [se.a0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, se.a0, se.w] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final a0 b(ArrayList arrayList) {
        a0 a0Var;
        a0 a0VarB;
        arrayList.size();
        ArrayList<a0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0 a0Var2 = (a0) it.next();
            if (a0Var2.t() instanceof v) {
                Collection collectionI = a0Var2.t().i();
                jc.l.d(collectionI, "getSupertypes(...)");
                Collection<w> collection = collectionI;
                ArrayList arrayList3 = new ArrayList(vb.n.K(collection, 10));
                for (w wVar : collection) {
                    jc.l.b(wVar);
                    a0 a0VarG = se.c.G(wVar);
                    if (a0Var2.u()) {
                        a0VarG = a0VarG.z(true);
                    }
                    arrayList3.add(a0VarG);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(a0Var2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        r rVarA = r.f20747a;
        while (it2.hasNext()) {
            rVarA = rVarA.a((w0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (a0 a0VarZ : arrayList2) {
            if (rVarA == r.f20750d) {
                if (a0VarZ instanceof h) {
                    h hVar = (h) a0VarZ;
                    a0VarZ = new h(hVar.f20729b, hVar.f20730c, hVar.f20731d, hVar.f20732e, hVar.f20733f, true);
                }
                jc.l.e(a0VarZ, "<this>");
                a0 a0VarP = se.d.p(a0VarZ, false);
                a0VarZ = (a0VarP == null && (a0VarP = se.c.p(a0VarZ)) == null) ? a0VarZ.z(false) : a0VarP;
            }
            linkedHashSet.add(a0VarZ);
        }
        ArrayList arrayList4 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a0) it3.next()).r());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (true) {
            a0Var = null;
            if (!it4.hasNext()) {
                break;
            }
            h0 h0Var = (h0) it4.next();
            next = (h0) next;
            next.getClass();
            m0.w wVar2 = h0.f19950b;
            jc.l.e(h0Var, "other");
            if (!next.isEmpty() || !h0Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) wVar2.f13782b).values();
                jc.l.d(collectionValues, "<get-values>(...)");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    se.g gVar = (se.g) next.f26214a.get(iIntValue);
                    se.g gVar2 = (se.g) h0Var.f26214a.get(iIntValue);
                    if (gVar != null) {
                        if (!jc.l.a(gVar2, gVar)) {
                            gVar = null;
                        }
                        gVar2 = gVar;
                    } else if (gVar2 == null || !jc.l.a(gVar, gVar2)) {
                        gVar2 = null;
                    }
                    bf.m.a(arrayList5, gVar2);
                }
                next = m0.w.u(arrayList5);
            }
        }
        h0 h0Var2 = (h0) next;
        if (linkedHashSet.size() == 1) {
            a0VarB = (a0) vb.m.w0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new x(2, this, s.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 5));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    a0 a0Var3 = (a0) it6.next();
                    next2 = (a0) next2;
                    if (next2 != 0 && a0Var3 != null) {
                        k0 k0VarT = next2.t();
                        k0 k0VarT2 = a0Var3.t();
                        boolean z10 = k0VarT instanceof ge.n;
                        if (z10 && (k0VarT2 instanceof ge.n)) {
                            Set set = ((ge.n) k0VarT).f7532a;
                            Set set2 = ((ge.n) k0VarT2).f7532a;
                            jc.l.e(set, "<this>");
                            jc.l.e(set2, "other");
                            Set setJ0 = vb.m.J0(set);
                            vb.m.P(setJ0, set2);
                            ge.n nVar = new ge.n(setJ0);
                            h0.f19950b.getClass();
                            h0 h0Var3 = h0.f19951c;
                            jc.l.e(h0Var3, "attributes");
                            next2 = se.c.w(vb.r.f22819a, ue.l.a(ue.h.f21622c, true, "unknown integer literal type"), h0Var3, nVar, false);
                        } else if (z10) {
                            if (((ge.n) k0VarT).f7532a.contains(a0Var3)) {
                                next2 = a0Var3;
                            }
                        } else if (!(k0VarT2 instanceof ge.n) || !((ge.n) k0VarT2).f7532a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                a0Var = (a0) next2;
            }
            if (a0Var != null) {
                a0VarB = a0Var;
            } else {
                k.f20742b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new x(2, j.f20741b, l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 6));
                arrayListA2.isEmpty();
                a0VarB = arrayListA2.size() < 2 ? (a0) vb.m.w0(arrayListA2) : new v(linkedHashSet).b();
            }
        }
        return a0VarB.C(h0Var2);
    }
}
