package pd;

import b0.w1;
import bd.q0;
import bd.r0;
import bd.s0;
import bd.y0;
import c7.e1;
import j2.h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ld.f0;
import se.u0;
import se.w0;
import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f17053v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yc.e f17054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ed.o f17055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final re.i f17057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final re.i f17058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final re.i f17059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final re.i f17060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final re.j f17061u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w1 w1Var, yc.e eVar, ed.o oVar, boolean z10, n nVar) {
        super(w1Var, nVar);
        jc.l.e(w1Var, "c");
        jc.l.e(oVar, "jClass");
        this.f17054n = eVar;
        this.f17055o = oVar;
        this.f17056p = z10;
        re.o oVar2 = ((od.a) w1Var.f1395c).f16315a;
        j jVar = new j(this, w1Var);
        re.l lVar = (re.l) oVar2;
        lVar.getClass();
        this.f17057q = new re.i(lVar, jVar);
        k kVar = new k(this, 0);
        re.l lVar2 = (re.l) oVar2;
        lVar2.getClass();
        this.f17058r = new re.i(lVar2, kVar);
        j jVar2 = new j(w1Var, this);
        re.l lVar3 = (re.l) oVar2;
        lVar3.getClass();
        this.f17059s = new re.i(lVar3, jVar2);
        k kVar2 = new k(this, 1);
        re.l lVar4 = (re.l) oVar2;
        lVar4.getClass();
        this.f17060t = new re.i(lVar4, kVar2);
        this.f17061u = ((re.l) oVar2).c(new ee.j(2, this, w1Var));
    }

    public static s0 A(s0 s0Var, yc.t tVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return s0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            s0 s0Var2 = (s0) it.next();
            if (!s0Var.equals(s0Var2) && s0Var2.B == null && D(s0Var2, tVar)) {
                yc.t tVarBuild = s0Var.M0().F().build();
                jc.l.b(tVarBuild);
                return (s0) tVarBuild;
            }
        }
        return s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bd.s0 B(bd.s0 r5) {
        /*
            java.util.List r0 = r5.o0()
            java.lang.String r1 = "getValueParameters(...)"
            jc.l.d(r0, r1)
            java.lang.Object r0 = vb.m.i0(r0)
            bd.y0 r0 = (bd.y0) r0
            r2 = 0
            if (r0 == 0) goto L7c
            r3 = r0
            bd.z0 r3 = (bd.z0) r3
            se.w r3 = r3.b()
            se.k0 r3 = r3.t()
            yc.h r3 = r3.h()
            if (r3 == 0) goto L36
            be.d r3 = ie.d.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            be.c r3 = r3.i()
            goto L37
        L36:
            r3 = r2
        L37:
            be.c r4 = vc.o.f22904g
            boolean r3 = jc.l.a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7c
        L44:
            yc.s r2 = r5.M0()
            java.util.List r5 = r5.o0()
            jc.l.d(r5, r1)
            java.util.List r5 = vb.m.W(r5)
            yc.s r5 = r2.d(r5)
            bd.z0 r0 = (bd.z0) r0
            se.w r0 = r0.b()
            java.util.List r0 = r0.q()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            se.n0 r0 = (se.n0) r0
            se.w r0 = r0.b()
            yc.s r5 = r5.p(r0)
            yc.t r5 = r5.build()
            bd.s0 r5 = (bd.s0) r5
            if (r5 == 0) goto L7b
            r0 = 1
            r5.f2731u = r0
        L7b:
            return r5
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.n.B(bd.s0):bd.s0");
    }

    public static boolean D(yc.t tVar, yc.t tVar2) {
        int iB = ee.l.f6536c.n(tVar2, tVar, true).b();
        h0.y(iB, "getResult(...)");
        return iB == 1 && !a2.c.F(tVar2, tVar);
    }

    public static boolean E(s0 s0Var, s0 s0Var2) {
        int i10 = ld.c.f12190l;
        jc.l.e(s0Var, "<this>");
        if (jc.l.a(s0Var.getName().b(), "removeAt") && jc.l.a(ua.l.K(s0Var), f0.f12220g.f12189e)) {
            s0Var2 = s0Var2.a();
        }
        jc.l.b(s0Var2);
        return D(s0Var2, s0Var);
    }

    public static s0 F(k0 k0Var, String str, ic.k kVar) {
        s0 s0Var;
        Iterator it = ((Iterable) kVar.a(be.e.e(str))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.o0().size() == 0) {
                te.l lVar = te.d.f20724a;
                se.w wVar = s0Var2.f2717g;
                if (wVar == null ? false : lVar.b(wVar, k0Var.b())) {
                    s0Var = s0Var2;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static s0 H(k0 k0Var, ic.k kVar) {
        s0 s0Var;
        se.w wVar;
        String strB = k0Var.getName().b();
        jc.l.d(strB, "asString(...)");
        Iterator it = ((Iterable) kVar.a(be.e.e(ld.v.b(strB)))).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.o0().size() == 1 && (wVar = s0Var2.f2717g) != null) {
                be.e eVar = vc.i.f22839e;
                if (vc.i.D(wVar, vc.n.f22871d)) {
                    te.l lVar = te.d.f20724a;
                    List listO0 = s0Var2.o0();
                    jc.l.d(listO0, "getValueParameters(...)");
                    if (lVar.a(((y0) vb.m.x0(listO0)).b(), k0Var.b())) {
                        s0Var = s0Var2;
                    }
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    public static boolean K(s0 s0Var, yc.t tVar) {
        String strJ = ua.l.J(s0Var, 2);
        yc.t tVarA = tVar.a();
        jc.l.d(tVarA, "getOriginal(...)");
        return jc.l.a(strJ, ua.l.J(tVarA, 2)) && !D(s0Var, tVar);
    }

    public final boolean C(k0 k0Var, ic.k kVar) {
        if (nh.b.A(k0Var)) {
            return false;
        }
        s0 s0VarG = G(k0Var, kVar);
        s0 s0VarH = H(k0Var, kVar);
        if (s0VarG == null) {
            return false;
        }
        if (k0Var.u0()) {
            return s0VarH != null && s0VarH.s() == s0VarG.s();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final s0 G(k0 k0Var, ic.k kVar) {
        be.e eVar;
        q0 q0VarD = k0Var.d();
        String strB = null;
        q0 q0Var = q0VarD != null ? (q0) g8.a.I(q0VarD) : null;
        if (q0Var != null) {
            vc.i.z(q0Var);
            yc.c cVarB = ie.d.b(ie.d.k(q0Var), ld.d.f12197d);
            if (cVarB != null && (eVar = (be.e) ld.f.f12210a.get(ie.d.g(cVarB))) != null) {
                strB = eVar.b();
            }
        }
        if (strB != null && !g8.a.P(this.f17054n, q0Var)) {
            return F(k0Var, strB, kVar);
        }
        String strB2 = k0Var.getName().b();
        jc.l.d(strB2, "asString(...)");
        return F(k0Var, ld.v.a(strB2), kVar);
    }

    public final LinkedHashSet I(be.e eVar) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            vb.m.P(linkedHashSet, ((se.w) it.next()).n0().f(eVar, gd.b.f7518e));
        }
        return linkedHashSet;
    }

    public final Set J(be.e eVar) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionB = ((se.w) it.next()).n0().b(eVar, gd.b.f7518e);
            ArrayList arrayList2 = new ArrayList(vb.n.K(collectionB, 10));
            Iterator it2 = collectionB.iterator();
            while (it2.hasNext()) {
                arrayList2.add((k0) it2.next());
            }
            vb.m.P(arrayList, arrayList2);
        }
        return vb.m.K0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(bd.s0 r12) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.n.L(bd.s0):boolean");
    }

    public final void M(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        jc.l.e(((od.a) this.f17093b.f1395c).f16328n, "<this>");
        jc.l.e(this.f17054n, "scopeOwner");
    }

    public final ArrayList N(be.e eVar) {
        Collection collectionC = ((c) this.f17096e.b()).c(eVar);
        ArrayList arrayList = new ArrayList(vb.n.K(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((ed.x) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(be.e eVar) {
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            s0 s0Var = (s0) obj;
            jc.l.e(s0Var, "<this>");
            if (g8.a.I(s0Var) == null && ld.e.a(s0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // le.p, le.q
    public final yc.h a(be.e eVar, gd.b bVar) {
        re.j jVar;
        yc.e eVar2;
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        M(eVar, bVar);
        n nVar = (n) this.f17094c;
        return (nVar == null || (jVar = nVar.f17061u) == null || (eVar2 = (yc.e) jVar.a(eVar)) == null) ? (yc.h) this.f17061u.a(eVar) : eVar2;
    }

    @Override // pd.z, le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        M(eVar, bVar);
        return super.b(eVar, bVar);
    }

    @Override // pd.z, le.p, le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        M(eVar, bVar);
        return super.f(eVar, bVar);
    }

    @Override // pd.z
    public final Set h(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return ud.e.J((Set) this.f17058r.b(), ((Map) this.f17060t.b()).keySet());
    }

    @Override // pd.z
    public final Set i(le.f fVar, le.l lVar) {
        jc.l.e(fVar, "kindFilter");
        yc.e eVar = this.f17054n;
        Collection collectionI = eVar.Q().i();
        jc.l.d(collectionI, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionI.iterator();
        while (it.hasNext()) {
            vb.m.P(linkedHashSet, ((se.w) it.next()).n0().c());
        }
        re.i iVar = this.f17096e;
        linkedHashSet.addAll(((c) iVar.b()).a());
        linkedHashSet.addAll(((c) iVar.b()).e());
        linkedHashSet.addAll(h(fVar, lVar));
        w1 w1Var = this.f17093b;
        linkedHashSet.addAll(((je.a) ((od.a) w1Var.f1395c).f16338x).e(eVar, w1Var));
        return linkedHashSet;
    }

    @Override // pd.z
    public final void j(be.e eVar, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        jc.l.e(eVar, "name");
        boolean zG = this.f17055o.g();
        yc.e eVar2 = this.f17054n;
        w1 w1Var = this.f17093b;
        if (zG) {
            re.i iVar = this.f17096e;
            if (((c) iVar.b()).d(eVar) != null) {
                if (arrayList.isEmpty()) {
                    ed.a0 a0VarD = ((c) iVar.b()).d(eVar);
                    jc.l.b(a0VarD);
                    od.c cVarZ = n7.e.z(w1Var, a0VarD);
                    od.a aVar = (od.a) w1Var.f1395c;
                    nd.e eVarS1 = nd.e.S1(eVar2, cVarZ, a0VarD.c(), aVar.f16324j.c(a0VarD), true);
                    se.w wVarH0 = ((e1) w1Var.f1397e).h0(a0VarD.f(), n7.e.F(se.s0.f19985b, false, null, 6));
                    bd.a0 a0VarP = p();
                    yc.x.f26154a.getClass();
                    ld.o oVar = yc.o.f26129e;
                    vb.r rVar = vb.r.f22819a;
                    eVarS1.R1(null, a0VarP, rVar, rVar, rVar, wVarH0, yc.x.f26157d, oVar, null);
                    eVarS1.D = 1;
                    aVar.f16321g.getClass();
                    arrayList.add(eVarS1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((s0) it.next()).o0().isEmpty()) {
                            break;
                        }
                    }
                    ed.a0 a0VarD2 = ((c) iVar.b()).d(eVar);
                    jc.l.b(a0VarD2);
                    od.c cVarZ2 = n7.e.z(w1Var, a0VarD2);
                    od.a aVar2 = (od.a) w1Var.f1395c;
                    nd.e eVarS12 = nd.e.S1(eVar2, cVarZ2, a0VarD2.c(), aVar2.f16324j.c(a0VarD2), true);
                    se.w wVarH02 = ((e1) w1Var.f1397e).h0(a0VarD2.f(), n7.e.F(se.s0.f19985b, false, null, 6));
                    bd.a0 a0VarP2 = p();
                    yc.x.f26154a.getClass();
                    ld.o oVar2 = yc.o.f26129e;
                    vb.r rVar2 = vb.r.f22819a;
                    eVarS12.R1(null, a0VarP2, rVar2, rVar2, rVar2, wVarH02, yc.x.f26157d, oVar2, null);
                    eVarS12.D = 1;
                    aVar2.f16321g.getClass();
                    arrayList.add(eVarS12);
                }
            }
        }
        ((je.a) ((od.a) w1Var.f1395c).f16338x).b(eVar2, eVar, arrayList, w1Var);
    }

    @Override // pd.z
    public final c k() {
        return new a(this.f17055o, l.f17045b);
    }

    @Override // pd.z
    public final void m(LinkedHashSet linkedHashSet, be.e eVar) {
        jc.l.e(eVar, "name");
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = f0.f12214a;
        if (!f0.f12223j.contains(eVar) && !ld.e.b(eVar)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (it.hasNext()) {
                    if (((yc.t) it.next()).I()) {
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((s0) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(linkedHashSet, eVar, arrayList2, false);
            return;
        }
        int i10 = bf.j.f2808c;
        bf.j jVarE = bf.m.e();
        LinkedHashSet linkedHashSetB0 = a2.c.b0(eVar, linkedHashSetI, vb.r.f22819a, this.f17054n, oe.m.f16399m0, ((te.l) ((od.a) this.f17093b.f1395c).f16335u).f20744d);
        x(eVar, linkedHashSet, linkedHashSetB0, linkedHashSet, new de.h(1, this, n.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 4));
        x(eVar, linkedHashSet, linkedHashSetB0, jVarE, new de.h(1, this, n.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0, 5));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((s0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, eVar, vb.m.q0(arrayList3, jVarE), true);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, ub.h] */
    @Override // pd.z
    public final void n(be.e eVar, ArrayList arrayList) {
        Set setK0;
        ed.x xVar;
        jc.l.e(eVar, "name");
        boolean zIsAnnotation = this.f17055o.f6508a.isAnnotation();
        w1 w1Var = this.f17093b;
        if (zIsAnnotation && (xVar = (ed.x) vb.m.y0(((c) this.f17096e.b()).c(eVar))) != null) {
            nd.f fVarL1 = nd.f.L1(this.f17054n, n7.e.z(w1Var, xVar), gh.g.Q(xVar.e()), false, xVar.c(), ((od.a) w1Var.f1395c).f16324j.c(xVar), false);
            q0 q0VarF = ee.m.f(fVarL1, zc.g.f26696a);
            fVarL1.H1(q0VarF, null, null, null);
            jc.l.e(w1Var, "<this>");
            se.w wVarL = z.l(xVar, new w1((od.a) w1Var.f1395c, new h7.k(w1Var, fVarL1, xVar, 0), (ub.h) w1Var.f1394b));
            bd.a0 a0VarP = p();
            vb.r rVar = vb.r.f22819a;
            fVarL1.K1(wVarL, rVar, a0VarP, null, rVar);
            q0VarF.f2661m = wVarL;
            arrayList.add(fVarL1);
        }
        Set setJ = J(eVar);
        if (setJ.isEmpty()) {
            return;
        }
        int i10 = bf.j.f2808c;
        bf.j jVarE = bf.m.e();
        AbstractCollection abstractCollectionE = bf.m.e();
        y(setJ, arrayList, jVarE, new m(this, 0));
        Collection<?> collectionT = vb.m.T(jVarE);
        if (collectionT.isEmpty()) {
            setK0 = vb.m.K0(setJ);
        } else if (collectionT instanceof Set) {
            Set linkedHashSet = new LinkedHashSet();
            for (Object obj : setJ) {
                if (!((Set) collectionT).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setK0 = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(setJ);
            linkedHashSet2.removeAll(collectionT);
            setK0 = linkedHashSet2;
        }
        y(setK0, abstractCollectionE, null, new m(this, 1));
        LinkedHashSet linkedHashSetJ = ud.e.J(setJ, abstractCollectionE);
        od.a aVar = (od.a) w1Var.f1395c;
        arrayList.addAll(a2.c.b0(eVar, linkedHashSetJ, arrayList, this.f17054n, aVar.f16320f, ((te.l) aVar.f16335u).f20744d));
    }

    @Override // pd.z
    public final Set o(le.f fVar) {
        jc.l.e(fVar, "kindFilter");
        if (this.f17055o.f6508a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f17096e.b()).f());
        Collection collectionI = this.f17054n.Q().i();
        jc.l.d(collectionI, "getSupertypes(...)");
        Iterator it = collectionI.iterator();
        while (it.hasNext()) {
            vb.m.P(linkedHashSet, ((se.w) it.next()).n0().g());
        }
        return linkedHashSet;
    }

    @Override // pd.z
    public final bd.a0 p() {
        yc.e eVar = this.f17054n;
        if (eVar != null) {
            int i10 = ee.e.f6524a;
            return eVar.T0();
        }
        ee.e.a(0);
        throw null;
    }

    @Override // pd.z
    public final yc.k q() {
        return this.f17054n;
    }

    @Override // pd.z
    public final boolean r(nd.e eVar) {
        if (this.f17055o.f6508a.isAnnotation()) {
            return false;
        }
        return L(eVar);
    }

    @Override // pd.z
    public final y s(ed.x xVar, ArrayList arrayList, se.w wVar, List list) {
        jc.l.e(xVar, "method");
        ((od.a) this.f17093b.f1395c).f16319e.getClass();
        if (this.f17054n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new y(wVar, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // pd.z
    public final String toString() {
        return "Lazy Java member scope for " + this.f17055o.c();
    }

    public final void v(ArrayList arrayList, nd.b bVar, int i10, ed.x xVar, se.w wVar, se.w wVar2) {
        sd.a tVar;
        be.e eVarC = xVar.c();
        if (wVar == null) {
            u0.a(2);
            throw null;
        }
        w0 w0VarG = u0.g(wVar, false);
        Object defaultValue = xVar.f6516a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = ed.d.f6487a;
            tVar = Enum.class.isAssignableFrom(cls) ? new ed.t(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new ed.g(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new ed.h(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new ed.p(null, (Class) defaultValue) : new ed.v(null, defaultValue);
        } else {
            tVar = null;
        }
        arrayList.add(new y0(bVar, null, i10, zc.g.f26696a, eVarC, w0VarG, tVar != null, false, false, wVar2 != null ? u0.g(wVar2, false) : null, ((od.a) this.f17093b.f1395c).f16324j.c(xVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, be.e eVar, ArrayList arrayList, boolean z10) {
        od.a aVar = (od.a) this.f17093b.f1395c;
        LinkedHashSet<s0> linkedHashSetB0 = a2.c.b0(eVar, arrayList, linkedHashSet, this.f17054n, aVar.f16320f, ((te.l) aVar.f16335u).f20744d);
        if (!z10) {
            linkedHashSet.addAll(linkedHashSetB0);
            return;
        }
        ArrayList arrayListQ0 = vb.m.q0(linkedHashSet, linkedHashSetB0);
        ArrayList arrayList2 = new ArrayList(vb.n.K(linkedHashSetB0, 10));
        for (s0 s0VarA : linkedHashSetB0) {
            s0 s0Var = (s0) g8.a.J(s0VarA);
            if (s0Var != null) {
                s0VarA = A(s0VarA, s0Var, arrayListQ0);
            }
            arrayList2.add(s0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(be.e r11, java.util.LinkedHashSet r12, java.util.LinkedHashSet r13, java.util.AbstractSet r14, ic.k r15) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.n.x(be.e, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, ic.k):void");
    }

    public final void y(Set set, AbstractCollection abstractCollection, bf.j jVar, ic.k kVar) {
        s0 s0VarH;
        r0 r0VarM;
        nd.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            if (C(k0Var, kVar)) {
                s0 s0VarG = G(k0Var, kVar);
                jc.l.b(s0VarG);
                if (k0Var.u0()) {
                    s0VarH = H(k0Var, kVar);
                    jc.l.b(s0VarH);
                } else {
                    s0VarH = null;
                }
                if (s0VarH != null) {
                    s0VarH.s();
                    s0VarG.s();
                }
                yc.e eVar = this.f17054n;
                jc.l.e(eVar, "ownerDescriptor");
                nd.d dVar2 = new nd.d(eVar, zc.g.f26696a, s0VarG.s(), s0VarG.f(), s0VarH != null, k0Var.getName(), s0VarG.m(), null, 1, false, null);
                se.w wVar = s0VarG.f2717g;
                jc.l.b(wVar);
                bd.a0 a0VarP = p();
                vb.r rVar = vb.r.f22819a;
                dVar2.K1(wVar, rVar, a0VarP, null, rVar);
                q0 q0VarL = ee.m.l(dVar2, s0VarG.getAnnotations(), false, s0VarG.m());
                q0VarL.f2623l = s0VarG;
                q0VarL.G1(dVar2.b());
                if (s0VarH != null) {
                    List listO0 = s0VarH.o0();
                    jc.l.d(listO0, "getValueParameters(...)");
                    y0 y0Var = (y0) vb.m.a0(listO0);
                    if (y0Var == null) {
                        throw new AssertionError("No parameter found for " + s0VarH);
                    }
                    r0VarM = ee.m.m(dVar2, s0VarH.getAnnotations(), y0Var.getAnnotations(), false, s0VarH.f(), s0VarH.m());
                    r0VarM.f2623l = s0VarH;
                } else {
                    r0VarM = null;
                }
                dVar2.H1(q0VarL, r0VarM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (jVar != null) {
                    jVar.add(k0Var);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z10 = this.f17056p;
        yc.e eVar = this.f17054n;
        if (z10) {
            Collection collectionI = eVar.Q().i();
            jc.l.d(collectionI, "getSupertypes(...)");
            return collectionI;
        }
        ((te.l) ((od.a) this.f17093b.f1395c).f16335u).getClass();
        jc.l.e(eVar, "classDescriptor");
        Collection collectionI2 = eVar.Q().i();
        jc.l.d(collectionI2, "getSupertypes(...)");
        return collectionI2;
    }
}
