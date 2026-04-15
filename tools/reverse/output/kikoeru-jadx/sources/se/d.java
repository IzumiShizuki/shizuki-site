package se;

import b0.w1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19934a = new d();

    public static final boolean b(te.b bVar, ve.e eVar) {
        jc.l.e(bVar, "c");
        if (!bVar.A(eVar)) {
            if (!(eVar instanceof ve.c)) {
                return false;
            }
            te.i iVarK = bVar.K((ve.c) eVar);
            jc.l.e(iVarK, "<this>");
            ve.d dVarO = ud.s.o(bVar, bVar.Z(iVarK));
            if (dVarO == null || !bVar.A(bVar.U(dVarO))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(te.b bVar, j0 j0Var, ve.e eVar, ve.e eVar2, boolean z10) {
        jc.l.e(bVar, "c");
        Collection<ve.d> collectionU = bVar.u(eVar);
        if ((collectionU instanceof Collection) && collectionU.isEmpty()) {
            return false;
        }
        for (ve.d dVar : collectionU) {
            if (jc.l.a(ud.s.B(bVar, dVar), ud.s.C(bVar, eVar2))) {
                return true;
            }
            if (z10 && n(f19934a, j0Var, eVar2, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(j0 j0Var, te.b bVar, ve.e eVar, ve.h hVar) {
        c cVarF;
        i0 i0Var = i0.f19956c;
        jc.l.e(bVar, "c");
        bVar.u0(eVar, hVar);
        if (bVar.c0(hVar) || !bVar.k(eVar)) {
            if (!bVar.s0(hVar)) {
                bf.g gVar = new bf.g();
                j0Var.c();
                te.b bVar2 = j0Var.f19961c;
                ArrayDeque arrayDeque = j0Var.f19965g;
                jc.l.b(arrayDeque);
                bf.j jVar = j0Var.f19966h;
                jc.l.b(jVar);
                arrayDeque.push(eVar);
                while (!arrayDeque.isEmpty()) {
                    ve.e eVar2 = (ve.e) arrayDeque.pop();
                    jc.l.b(eVar2);
                    if (jVar.add(eVar2)) {
                        ve.e eVarP0 = bVar.p0(eVar2);
                        if (eVarP0 == null) {
                            eVarP0 = eVar2;
                        }
                        if (bVar.n(ud.s.C(bVar, eVarP0), hVar)) {
                            gVar.add(eVarP0);
                            cVarF = i0Var;
                        } else {
                            cVarF = bVar.w(eVarP0) == 0 ? i0.f19955b : bVar2.F(eVarP0);
                        }
                        if (cVarF.equals(i0Var)) {
                            cVarF = null;
                        }
                        if (cVarF != null) {
                            Iterator it = bVar2.z(bVar2.R(eVar2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(cVarF.F(j0Var, (ve.d) it.next()));
                            }
                        }
                    }
                }
                j0Var.a();
                return gVar;
            }
            if (bVar.n(ud.s.C(bVar, eVar), hVar)) {
                a0 a0VarP0 = bVar.p0(eVar);
                if (a0VarP0 != null) {
                    eVar = a0VarP0;
                }
                return ud.b.w(eVar);
            }
        }
        return vb.r.f22819a;
    }

    public static List e(j0 j0Var, te.b bVar, ve.e eVar, ve.h hVar) {
        int i10;
        List listD = d(j0Var, bVar, eVar, hVar);
        if (listD.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                ve.g gVarB = ud.s.b(bVar, (ve.e) obj);
                int iD = bVar.D(gVarB);
                while (true) {
                    if (i10 >= iD) {
                        arrayList.add(obj);
                        break;
                    }
                    ve.d dVarO = ud.s.o(bVar, bVar.K0(gVarB, i10));
                    i10 = (dVarO != null ? bVar.G0(dVarO) : null) == null ? i10 + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listD;
    }

    public static boolean h(j0 j0Var, ve.d dVar, ve.d dVar2) {
        jc.l.e(dVar, "a");
        jc.l.e(dVar2, "b");
        te.b bVar = j0Var.f19961c;
        if (dVar == dVar2) {
            return true;
        }
        if (l(bVar, dVar) && l(bVar, dVar2)) {
            w0 w0VarD = j0Var.d(j0Var.e(dVar));
            w0 w0VarD2 = j0Var.d(j0Var.e(dVar2));
            a0 a0VarV0 = bVar.v0(w0VarD);
            if (!bVar.n(bVar.q0(w0VarD), bVar.q0(w0VarD2))) {
                return false;
            }
            if (bVar.w(a0VarV0) == 0) {
                return bVar.m0(w0VarD) || bVar.m0(w0VarD2) || bVar.e0(a0VarV0) == bVar.e0(bVar.v0(w0VarD2));
            }
        }
        d dVar3 = f19934a;
        return n(dVar3, j0Var, dVar, dVar2) && n(dVar3, j0Var, dVar2, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r8 = ud.s.B(r7, r8);
        jc.l.e(r8, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        return r7.w0(r8, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yc.q0 k(te.b r7, ve.d r8, ve.e r9) {
        /*
            java.lang.String r0 = "c"
            jc.l.e(r7, r0)
            int r0 = r7.w(r8)
            r1 = 0
            r2 = 0
        Lb:
            r3 = 0
            if (r2 >= r0) goto L6b
            se.n0 r4 = r7.n0(r8, r2)
            java.lang.String r5 = "<this>"
            jc.l.e(r4, r5)
            boolean r6 = r7.a0(r4)
            if (r6 != 0) goto L1e
            r3 = r4
        L1e:
            if (r3 == 0) goto L68
            ve.d r3 = ud.s.o(r7, r3)
            if (r3 != 0) goto L27
            goto L68
        L27:
            ve.e r4 = ud.s.t(r7, r3)
            boolean r4 = r7.C0(r4)
            if (r4 == 0) goto L3d
            ve.e r4 = ud.s.t(r7, r9)
            boolean r4 = r7.C0(r4)
            if (r4 == 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            boolean r6 = r3.equals(r9)
            if (r6 != 0) goto L5c
            if (r4 == 0) goto L55
            ve.h r4 = ud.s.B(r7, r3)
            ve.h r6 = ud.s.B(r7, r9)
            boolean r4 = jc.l.a(r4, r6)
            if (r4 == 0) goto L55
            goto L5c
        L55:
            yc.q0 r3 = k(r7, r3, r9)
            if (r3 == 0) goto L68
            return r3
        L5c:
            ve.h r8 = ud.s.B(r7, r8)
            jc.l.e(r8, r5)
            yc.q0 r7 = r7.w0(r8, r2)
            return r7
        L68:
            int r2 = r2 + 1
            goto Lb
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: se.d.k(te.b, ve.d, ve.e):yc.q0");
    }

    public static boolean l(te.b bVar, ve.d dVar) {
        ve.h hVarB = ud.s.B(bVar, dVar);
        jc.l.e(hVarB, "<this>");
        if (!bVar.L(hVarB)) {
            return false;
        }
        bVar.o(dVar);
        return (bVar.M0(dVar) || bVar.J0(dVar) || bVar.s(dVar)) ? false : true;
    }

    public static boolean m(j0 j0Var, te.b bVar, ve.g gVar, ve.e eVar) {
        boolean zN;
        jc.l.e(bVar, "c");
        jc.l.e(gVar, "capturedSubArguments");
        ve.h hVarC = ud.s.C(bVar, eVar);
        int iD = bVar.D(gVar);
        int iU = ud.s.u(bVar, hVarC);
        if (iD == iU && iD == bVar.w(eVar)) {
            for (int i10 = 0; i10 < iU; i10++) {
                n0 n0VarN0 = bVar.n0(eVar, i10);
                ve.d dVarO = ud.s.o(bVar, n0VarN0);
                if (dVarO != null) {
                    n0 n0VarK0 = bVar.K0(gVar, i10);
                    jc.l.e(n0VarK0, "<this>");
                    bVar.R0(n0VarK0);
                    ve.d dVarO2 = ud.s.o(bVar, n0VarK0);
                    jc.l.b(dVarO2);
                    ve.j jVarY = bVar.Y(bVar.w0(hVarC, i10));
                    ve.j jVarR0 = bVar.R0(n0VarN0);
                    ve.j jVar = ve.j.f22960d;
                    if (jVarY == jVar) {
                        jVarY = jVarR0;
                    } else if (jVarR0 != jVar && jVarY != jVarR0) {
                        jVarY = null;
                    }
                    if (jVarY == null) {
                        return j0Var.f19959a;
                    }
                    if (jVarY == jVar) {
                        o(bVar, dVarO2, dVarO);
                        o(bVar, dVarO, dVarO2);
                    }
                    int i11 = j0Var.f19964f;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + dVarO2).toString());
                    }
                    j0Var.f19964f = i11 + 1;
                    int iOrdinal = jVarY.ordinal();
                    d dVar = f19934a;
                    if (iOrdinal == 0) {
                        zN = n(dVar, j0Var, dVarO, dVarO2);
                    } else if (iOrdinal == 1) {
                        zN = n(dVar, j0Var, dVarO2, dVarO);
                    } else {
                        if (iOrdinal != 2) {
                            throw new ce.j0();
                        }
                        zN = h(j0Var, dVarO2, dVarO);
                    }
                    j0Var.f19964f--;
                    if (!zN) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(d dVar, j0 j0Var, ve.d dVar2, ve.d dVar3) {
        jc.l.e(dVar2, "subType");
        jc.l.e(dVar3, "superType");
        if (dVar2 == dVar3) {
            return true;
        }
        if (!j0Var.b(dVar2, dVar3)) {
            return false;
        }
        return f19934a.f(j0Var, j0Var.f19961c, dVar2, dVar3);
    }

    public static void o(te.b bVar, ve.d dVar, ve.d dVar2) {
        ve.e eVarC = ud.s.c(bVar, dVar);
        if (eVarC instanceof ve.c) {
            ve.c cVar = (ve.c) eVarC;
            if (bVar.P(cVar)) {
                return;
            }
            te.i iVarK = bVar.K(cVar);
            jc.l.e(iVarK, "<this>");
            n0 n0VarZ = bVar.Z(iVarK);
            jc.l.e(n0VarZ, "<this>");
            if (bVar.a0(n0VarZ) && bVar.r(cVar) == ve.b.f22956a) {
                ud.s.B(bVar, dVar2);
            }
        }
    }

    public static l p(w0 w0Var, boolean z10) {
        boolean zE;
        jc.l.e(w0Var, "type");
        if (w0Var instanceof l) {
            return (l) w0Var;
        }
        w0Var.t();
        if ((w0Var.t().h() instanceof yc.q0) || (w0Var instanceof te.h)) {
            yc.h hVarH = w0Var.t().h();
            bd.w0 w0Var2 = hVarH instanceof bd.w0 ? (bd.w0) hVarH : null;
            zE = true;
            if (w0Var2 == null || w0Var2.f2681l) {
                zE = (z10 && (w0Var.t().h() instanceof yc.q0)) ? u0.e(w0Var) : true ^ c.i(te.e.f20726b.a(), c.n(w0Var), i0.f19955b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (w0Var instanceof q) {
            q qVar = (q) w0Var;
            jc.l.a(qVar.f19978b.t(), qVar.f19979c.t());
        }
        return new l(c.n(w0Var).z(false), z10);
    }

    public void a(zc.h hVar, zc.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((zc.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((zc.b) it2.next()).a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0277 A[EDGE_INSN: B:332:0x0277->B:156:0x0277 BREAK  A[LOOP:11: B:146:0x0254->B:334:0x0254]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(se.j0 r20, te.b r21, ve.d r22, ve.d r23) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se.d.f(se.j0, te.b, ve.d, ve.d):boolean");
    }

    public p0 g(k0 k0Var, List list) {
        jc.l.e(k0Var, "typeConstructor");
        jc.l.e(list, "arguments");
        List listO = k0Var.o();
        jc.l.d(listO, "getParameters(...)");
        yc.q0 q0Var = (yc.q0) vb.m.i0(listO);
        if (q0Var == null || !q0Var.x0()) {
            return new t((yc.q0[]) listO.toArray(new yc.q0[0]), (n0[]) list.toArray(new n0[0]), false);
        }
        List listO2 = k0Var.o();
        jc.l.d(listO2, "getParameters(...)");
        List list2 = listO2;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((yc.q0) it.next()).Q());
        }
        return new g0(1, vb.w.A(vb.m.M0(arrayList, list)));
    }

    public a0 i(w1 w1Var, h0 h0Var, boolean z10, int i10, boolean z11) {
        h0 h0VarU;
        yc.p0 p0Var = (yc.p0) w1Var.f1396d;
        n0 n0VarJ = j(new f0(((qe.s) p0Var).F1(), x0.INVARIANT), w1Var, null, i10);
        w wVarB = n0VarJ.b();
        jc.l.d(wVarB, "getType(...)");
        a0 a0VarB = c.b(wVarB);
        if (c.l(a0VarB)) {
            return a0VarB;
        }
        n0VarJ.a();
        a(a0VarB.getAnnotations(), h.a(h0Var));
        if (!c.l(a0VarB)) {
            if (c.l(a0VarB)) {
                h0VarU = a0VarB.r();
            } else {
                h0 h0VarR = a0VarB.r();
                m0.w wVar = h0.f19950b;
                jc.l.e(h0VarR, "other");
                if (h0Var.isEmpty() && h0VarR.isEmpty()) {
                    h0VarU = h0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) wVar.f13782b).values();
                    jc.l.d(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        g gVar = (g) h0Var.f26214a.get(iIntValue);
                        g gVar2 = (g) h0VarR.f26214a.get(iIntValue);
                        if (gVar != null) {
                            if (gVar2 != null) {
                                gVar = new g(ua.l.I(gVar.f19945a, gVar2.f19945a));
                            }
                            gVar2 = gVar;
                        } else if (gVar2 == null) {
                            gVar2 = null;
                        } else if (gVar != null) {
                            gVar2 = new g(ua.l.I(gVar2.f19945a, gVar.f19945a));
                        }
                        bf.m.a(arrayList, gVar2);
                    }
                    h0VarU = m0.w.u(arrayList);
                }
            }
            a0VarB = c.s(a0VarB, null, h0VarU, 1);
        }
        a0 a0VarI = u0.i(a0VarB, z10);
        if (!z11) {
            return a0VarI;
        }
        bd.g gVar3 = ((bd.h) p0Var).f2574h;
        jc.l.d(gVar3, "getTypeConstructor(...)");
        return c.H(a0VarI, c.w((List) w1Var.f1397e, le.n.f12335b, h0Var, gVar3, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 j(n0 n0Var, w1 w1Var, yc.q0 q0Var, int i10) {
        x0 x0VarE0;
        zc.a aVar = (yc.p0) w1Var.f1396d;
        if (i10 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((bd.p) aVar).getName());
        }
        if (n0Var.c()) {
            jc.l.b(q0Var);
            return u0.j(q0Var);
        }
        w wVarB = n0Var.b();
        jc.l.d(wVarB, "getType(...)");
        k0 k0VarT = wVarB.t();
        jc.l.e(k0VarT, "constructor");
        yc.h hVarH = k0VarT.h();
        n0 n0Var2 = hVarH instanceof yc.q0 ? (n0) ((Map) w1Var.f1394b).get(hVarH) : null;
        x0 x0Var = x0.INVARIANT;
        if (n0Var2 == null) {
            a0 a0VarB = c.b(n0Var.b().x());
            if (!c.l(a0VarB) && u0.c(a0VarB, we.a.f24076c, null)) {
                k0 k0VarT2 = a0VarB.t();
                yc.h hVarH2 = k0VarT2.h();
                k0VarT2.o().size();
                a0VarB.q().size();
                if (!(hVarH2 instanceof yc.q0)) {
                    int i11 = 0;
                    if (hVarH2 instanceof yc.p0) {
                        yc.p0 p0Var = (yc.p0) hVarH2;
                        if (w1Var.U(p0Var)) {
                            String str = ((bd.p) p0Var).getName().f2751a;
                            jc.l.d(str, "toString(...)");
                            return new f0(ue.l.c(ue.k.RECURSIVE_TYPE_ALIAS, str), x0Var);
                        }
                        List listQ = a0VarB.q();
                        ArrayList arrayList = new ArrayList(vb.n.K(listQ, 10));
                        for (Object obj : listQ) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                ud.b.H();
                                throw null;
                            }
                            arrayList.add(j((n0) obj, w1Var, (yc.q0) k0VarT2.o().get(i11), i10 + 1));
                            i11 = i12;
                        }
                        return new f0(c.H(i(c.f(w1Var, p0Var, arrayList), a0VarB.r(), a0VarB.u(), i10 + 1, false), q(a0VarB, w1Var, i10)), n0Var.a());
                    }
                    a0 a0VarQ = q(a0VarB, w1Var, i10);
                    r0.d(a0VarQ);
                    for (Object obj2 : a0VarQ.q()) {
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        n0 n0Var3 = (n0) obj2;
                        if (!n0Var3.c()) {
                            w wVarB2 = n0Var3.b();
                            jc.l.d(wVarB2, "getType(...)");
                            if (!u0.c(wVarB2, we.a.f24075b, null)) {
                            }
                        }
                        i11 = i13;
                    }
                    return new f0(a0VarQ, n0Var.a());
                }
            }
            return n0Var;
        }
        if (n0Var2.c()) {
            jc.l.b(q0Var);
            return u0.j(q0Var);
        }
        w0 w0VarX = n0Var2.b().x();
        x0 x0VarA = n0Var2.a();
        jc.l.d(x0VarA, "getProjectionKind(...)");
        x0 x0VarA2 = n0Var.a();
        jc.l.d(x0VarA2, "getProjectionKind(...)");
        if (x0VarA2 != x0VarA && x0VarA2 != x0Var && x0VarA == x0Var) {
            x0VarA = x0VarA2;
        }
        if (q0Var == null || (x0VarE0 = q0Var.e0()) == null) {
            x0VarE0 = x0Var;
        }
        if (x0VarE0 == x0VarA || x0VarE0 == x0Var || x0VarA != x0Var) {
            x0Var = x0VarA;
        }
        a(wVarB.getAnnotations(), w0VarX.getAnnotations());
        a0 a0VarI = u0.i(c.b(w0VarX), wVarB.u());
        h0 h0VarR = wVarB.r();
        if (!c.l(a0VarI)) {
            if (c.l(a0VarI)) {
                h0VarR = a0VarI.r();
            } else {
                h0 h0VarR2 = a0VarI.r();
                h0VarR.getClass();
                m0.w wVar = h0.f19950b;
                jc.l.e(h0VarR2, "other");
                if (!h0VarR.isEmpty() || !h0VarR2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) wVar.f13782b).values();
                    jc.l.d(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        g gVar = (g) h0VarR.f26214a.get(iIntValue);
                        g gVar2 = (g) h0VarR2.f26214a.get(iIntValue);
                        if (gVar != null) {
                            if (gVar2 != null) {
                                gVar = new g(ua.l.I(gVar.f19945a, gVar2.f19945a));
                            }
                            gVar2 = gVar;
                        } else if (gVar2 == null) {
                            gVar2 = null;
                        } else if (gVar != null) {
                            gVar2 = new g(ua.l.I(gVar2.f19945a, gVar.f19945a));
                        }
                        bf.m.a(arrayList2, gVar2);
                    }
                    h0VarR = m0.w.u(arrayList2);
                }
            }
            a0VarI = c.s(a0VarI, null, h0VarR, 1);
        }
        return new f0(a0VarI, x0Var);
    }

    public a0 q(a0 a0Var, w1 w1Var, int i10) {
        k0 k0VarT = a0Var.t();
        List listQ = a0Var.q();
        ArrayList arrayList = new ArrayList(vb.n.K(listQ, 10));
        int i11 = 0;
        for (Object obj : listQ) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ud.b.H();
                throw null;
            }
            n0 n0Var = (n0) obj;
            n0 n0VarJ = j(n0Var, w1Var, (yc.q0) k0VarT.o().get(i11), i10 + 1);
            if (!n0VarJ.c()) {
                n0VarJ = new f0(u0.h(n0VarJ.b(), n0Var.b().u()), n0VarJ.a());
            }
            arrayList.add(n0VarJ);
            i11 = i12;
        }
        return c.s(a0Var, arrayList, null, 2);
    }
}
