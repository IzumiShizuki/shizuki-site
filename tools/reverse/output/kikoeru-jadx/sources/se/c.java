package se;

import b0.w1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static boolean A(te.b bVar, ve.d dVar, ve.d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        a0 a0VarP = bVar.p(dVar);
        a0 a0VarP2 = bVar.p(dVar2);
        if (a0VarP != null && a0VarP2 != null) {
            return z(bVar, a0VarP, a0VarP2);
        }
        q qVarG0 = bVar.G0(dVar);
        q qVarG02 = bVar.G0(dVar2);
        return qVarG0 != null && qVarG02 != null && z(bVar, bVar.M(qVarG0), bVar.M(qVarG02)) && z(bVar, bVar.C(qVarG0), bVar.C(qVarG02));
    }

    public static r0 B(List list, p0 p0Var, yc.k kVar, ArrayList arrayList) {
        if (p0Var == null) {
            a(1);
            throw null;
        }
        if (kVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        r0 r0VarC = C(list, p0Var, kVar, arrayList, null);
        if (r0VarC != null) {
            return r0VarC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static r0 C(List list, p0 p0Var, yc.k kVar, List list2, boolean[] zArr) {
        if (p0Var == null) {
            a(6);
            throw null;
        }
        if (kVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            yc.q0 q0Var = (yc.q0) it.next();
            bd.w0 w0VarF1 = bd.w0.F1(kVar, q0Var.getAnnotations(), q0Var.Y(), q0Var.e0(), q0Var.getName(), i10, q0Var.t0());
            map.put(q0Var.Q(), new f0(w0VarF1.E()));
            map2.put(q0Var, w0VarF1);
            list2.add(w0VarF1);
            i10++;
        }
        g0 g0Var = new g0(1, map);
        r0 r0VarE = r0.e(p0Var, g0Var);
        r0 r0VarE2 = r0.e(new fe.d(p0Var, 1), g0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            yc.q0 q0Var2 = (yc.q0) it2.next();
            bd.w0 w0Var = (bd.w0) map2.get(q0Var2);
            for (w wVar : q0Var2.getUpperBounds()) {
                yc.h hVarH = wVar.t().h();
                w wVarI = (((hVarH instanceof yc.q0) && ud.e.C((yc.q0) hVarH, null, null)) ? r0VarE : r0VarE2).i(wVar, x0.OUT_VARIANCE);
                if (wVarI == null) {
                    return null;
                }
                if (wVarI != wVar && zArr != null) {
                    zArr[0] = true;
                }
                if (w0Var.f2681l) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0Var.H1());
                }
                if (!l(wVarI)) {
                    w0Var.f2680k.add(wVarI);
                }
            }
            if (w0Var.f2681l) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0Var.H1());
            }
            w0Var.f2681l = true;
        }
        return r0VarE;
    }

    public static final ve.d D(ud.h hVar, ve.d dVar, ve.d dVar2) {
        if (te.g.u(hVar.q0(dVar)) != null) {
            return te.g.K(dVar) ? hVar.l(dVar2) : dVar2;
        }
        n0 n0Var = (n0) vb.m.x0(te.g.q(dVar));
        if (p.f19976a[te.g.v(n0Var).ordinal()] == 1) {
            hVar.g();
            throw null;
        }
        w0 w0VarT = te.g.t(hVar, n0Var);
        jc.l.b(w0VarT);
        ve.d dVarD = D(hVar, w0VarT, dVar2);
        jc.l.e(dVarD, "componentType");
        if (dVarD instanceof w) {
            hVar.g();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(q.t0.F(jc.z.f10839a, hVar.getClass(), sb).toString());
    }

    public static final h0 E(zc.h hVar) {
        jc.l.e(hVar, "<this>");
        if (hVar.isEmpty()) {
            h0.f19950b.getClass();
            return h0.f19951c;
        }
        m0.w wVar = h0.f19950b;
        List listW = ud.b.w(new g(hVar));
        wVar.getClass();
        return m0.w.u(listW);
    }

    public static final a0 G(w wVar) {
        jc.l.e(wVar, "<this>");
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof q) {
            return ((q) w0VarX).f19979c;
        }
        if (w0VarX instanceof a0) {
            return (a0) w0VarX;
        }
        throw new ce.j0();
    }

    public static final a0 H(a0 a0Var, a0 a0Var2) {
        jc.l.e(a0Var, "<this>");
        jc.l.e(a0Var2, "abbreviatedType");
        return l(a0Var) ? a0Var : new a(a0Var, a0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w0 I(w0 w0Var, w wVar) {
        jc.l.e(w0Var, "<this>");
        if (w0Var instanceof v0) {
            return I(((v0) w0Var).o(), wVar);
        }
        if (wVar == null || wVar.equals(w0Var)) {
            return w0Var;
        }
        if (w0Var instanceof a0) {
            return new d0((a0) w0Var, wVar);
        }
        if (w0Var instanceof q) {
            return new s((q) w0Var, wVar);
        }
        throw new ce.j0();
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final a0 b(w wVar) {
        jc.l.e(wVar, "<this>");
        w0 w0VarX = wVar.x();
        a0 a0Var = w0VarX instanceof a0 ? (a0) w0VarX : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + wVar).toString());
    }

    public static final yc.q0 c(ud.h hVar, ve.d dVar) {
        w0 w0VarT;
        yc.q0 q0VarU = te.g.u(hVar.q0(dVar));
        if (q0VarU != null) {
            return q0VarU;
        }
        if (dVar instanceof w) {
            if (vc.i.y((w) dVar) && (w0VarT = te.g.t(hVar, (n0) vb.m.x0(te.g.q(dVar)))) != null) {
                return c(hVar, w0VarT);
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(q.t0.F(jc.z.f10839a, dVar.getClass(), sb).toString());
    }

    public static final w d(ArrayList arrayList, List list, vc.i iVar) {
        w wVarI = new r0(new g0(0, arrayList)).i((w) vb.m.Y(list), x0.OUT_VARIANCE);
        return wVarI == null ? iVar.o() : wVarI;
    }

    public static final ve.d e(ud.h hVar, ve.d dVar, HashSet hashSet) {
        ve.d dVarW;
        ve.d dVarE;
        k0 k0VarQ0 = hVar.q0(dVar);
        if (hashSet.add(k0VarQ0)) {
            yc.q0 q0VarU = te.g.u(k0VarQ0);
            int i10 = 0;
            if (q0VarU == null) {
                if (te.g.F(k0VarQ0)) {
                    List listS = te.g.s(hVar.q0(dVar));
                    List listQ = te.g.q(dVar);
                    ArrayList arrayList = new ArrayList(vb.n.K(listQ, 10));
                    for (Object obj : listQ) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        ve.d dVarT = te.g.t(hVar, (n0) obj);
                        if (dVarT == null) {
                            yc.q0 q0Var = (yc.q0) listS.get(i10);
                            hVar.getClass();
                            jc.l.e(q0Var, "$receiver");
                            dVarT = ud.e.y(q0Var);
                        }
                        arrayList.add(dVarT);
                        i10 = i11;
                    }
                    List<yc.q0> list = listS;
                    ArrayList arrayList2 = new ArrayList(vb.n.K(list, 10));
                    for (yc.q0 q0Var2 : list) {
                        jc.l.e(q0Var2, "$receiver");
                        k0 k0VarQ = q0Var2.Q();
                        jc.l.d(k0VarQ, "getTypeConstructor(...)");
                        arrayList2.add(k0VarQ);
                    }
                    Map mapA = vb.w.A(vb.m.M0(arrayList2, arrayList));
                    ArrayList arrayList3 = new ArrayList(mapA.size());
                    for (Map.Entry entry : mapA.entrySet()) {
                        ve.h hVar2 = (ve.h) entry.getKey();
                        ve.d dVar2 = (ve.d) entry.getValue();
                        jc.l.c(hVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.TypeConstructor");
                        jc.l.c(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        arrayList3.add(new ub.k((k0) hVar2, ud.e.b((w) dVar2)));
                    }
                    r0 r0Var = new r0(new g0(1, vb.w.A(arrayList3)));
                    jc.l.e(dVar, "$receiver");
                    if (!(dVar instanceof w)) {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(dVar);
                        sb.append(", ");
                        throw new IllegalArgumentException(q.t0.F(jc.z.f10839a, dVar.getClass(), sb).toString());
                    }
                    a0 a0VarH = ee.g.h((w) dVar);
                    if (a0VarH == null) {
                        dVarW = null;
                    } else {
                        yc.q0 q0VarC = c(hVar, a0VarH);
                        dVarW = q0VarC == null ? te.g.W(r0Var, a0VarH) : D(hVar, a0VarH, te.g.W(r0Var, ud.e.y(q0VarC)));
                    }
                    if (dVarW != null && (dVarE = e(hVar, dVarW, hashSet)) != null) {
                        if (!te.g.K(dVar)) {
                            return dVarE;
                        }
                        if (!te.g.K(dVarE) && (!(dVarE instanceof ve.f) || !te.g.L((ve.f) dVarE))) {
                            return hVar.l(dVarE);
                        }
                    }
                }
                return dVar;
            }
            ve.d dVarY = ud.e.y(q0VarU);
            ve.d dVarE2 = e(hVar, dVarY, hashSet);
            if (dVarE2 != null) {
                if (te.g.F(hVar.q0(dVarY)) || ((dVarY instanceof ve.f) && te.g.L((ve.f) dVarY))) {
                    i10 = 1;
                }
                return ((dVarE2 instanceof ve.f) && te.g.L((ve.f) dVarE2) && te.g.K(dVar) && i10 != 0) ? hVar.l(dVarY) : (te.g.K(dVarE2) || !te.g.I(dVar)) ? dVarE2 : hVar.l(dVarE2);
            }
        }
        return null;
    }

    public static w1 f(w1 w1Var, yc.p0 p0Var, List list) {
        List listO = ((bd.h) p0Var).f2574h.o();
        ArrayList arrayList = new ArrayList(vb.n.K(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add(((yc.q0) it.next()).a());
        }
        return new w1(w1Var, p0Var, list, vb.w.A(vb.m.M0(arrayList, list)), 18);
    }

    public static final w0 g(a0 a0Var, a0 a0Var2) {
        jc.l.e(a0Var, "lowerBound");
        jc.l.e(a0Var2, "upperBound");
        return a0Var.equals(a0Var2) ? a0Var : new r(a0Var, a0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w h(w wVar) {
        jc.l.e(wVar, "<this>");
        if (wVar instanceof v0) {
            return ((v0) wVar).c();
        }
        return null;
    }

    public static boolean i(j0 j0Var, ve.e eVar, c cVar) {
        i0 i0Var = i0.f19956c;
        jc.l.e(j0Var, "<this>");
        jc.l.e(eVar, "type");
        te.b bVar = j0Var.f19961c;
        if ((bVar.k(eVar) && !bVar.e0(eVar)) || bVar.q(eVar)) {
            return true;
        }
        j0Var.c();
        ArrayDeque arrayDeque = j0Var.f19965g;
        jc.l.b(arrayDeque);
        bf.j jVar = j0Var.f19966h;
        jc.l.b(jVar);
        arrayDeque.push(eVar);
        while (!arrayDeque.isEmpty()) {
            ve.e eVar2 = (ve.e) arrayDeque.pop();
            jc.l.b(eVar2);
            if (jVar.add(eVar2)) {
                c cVar2 = bVar.e0(eVar2) ? i0Var : cVar;
                if (cVar2.equals(i0Var)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    Iterator it = bVar.z(bVar.R(eVar2)).iterator();
                    while (it.hasNext()) {
                        ve.e eVarF = cVar2.F(j0Var, (ve.d) it.next());
                        if ((bVar.k(eVarF) && !bVar.e0(eVarF)) || bVar.q(eVarF)) {
                            j0Var.a();
                            return true;
                        }
                        arrayDeque.add(eVarF);
                    }
                }
            }
        }
        j0Var.a();
        return false;
    }

    public static final w0 j(w0 w0Var, w wVar) {
        jc.l.e(w0Var, "<this>");
        jc.l.e(wVar, "origin");
        return I(w0Var, h(wVar));
    }

    public static boolean k(j0 j0Var, ve.e eVar, ve.h hVar) {
        te.b bVar = j0Var.f19961c;
        if (bVar.O0(eVar)) {
            return true;
        }
        if (bVar.e0(eVar)) {
            return false;
        }
        if (j0Var.f19960b) {
            bVar.r0(eVar);
        }
        return bVar.n(bVar.R(eVar), hVar);
    }

    public static final boolean l(w wVar) {
        jc.l.e(wVar, "<this>");
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof ue.i) {
            return true;
        }
        return (w0VarX instanceof q) && (((q) w0VarX).D() instanceof ue.i);
    }

    public static final boolean m(w wVar) {
        jc.l.e(wVar, "<this>");
        return wVar.x() instanceof q;
    }

    public static final a0 n(w wVar) {
        jc.l.e(wVar, "<this>");
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof q) {
            return ((q) w0VarX).f19978b;
        }
        if (w0VarX instanceof a0) {
            return (a0) w0VarX;
        }
        throw new ce.j0();
    }

    public static final w0 o(w0 w0Var, boolean z10) {
        jc.l.e(w0Var, "<this>");
        l lVarP = d.p(w0Var, z10);
        if (lVarP != null) {
            return lVarP;
        }
        a0 a0VarP = p(w0Var);
        return a0VarP != null ? a0VarP : w0Var.z(false);
    }

    public static final a0 p(w0 w0Var) {
        v vVar;
        k0 k0VarT = w0Var.t();
        v vVar2 = k0VarT instanceof v ? (v) k0VarT : null;
        if (vVar2 != null) {
            LinkedHashSet<w> linkedHashSet = vVar2.f19998b;
            ArrayList arrayList = new ArrayList(vb.n.K(linkedHashSet, 10));
            boolean z10 = false;
            for (w wVarO : linkedHashSet) {
                if (u0.e(wVarO)) {
                    wVarO = o(wVarO.x(), false);
                    z10 = true;
                }
                arrayList.add(wVarO);
            }
            if (z10) {
                w wVarO2 = vVar2.f19997a;
                if (wVarO2 == null) {
                    wVarO2 = null;
                } else if (u0.e(wVarO2)) {
                    wVarO2 = o(wVarO2.x(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                vVar = new v(linkedHashSet2);
                vVar.f19997a = wVarO2;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                return vVar.b();
            }
        }
        return null;
    }

    public static final a0 q(a0 a0Var, List list, h0 h0Var) {
        jc.l.e(a0Var, "<this>");
        jc.l.e(list, "newArguments");
        jc.l.e(h0Var, "newAttributes");
        if (list.isEmpty() && h0Var == a0Var.r()) {
            return a0Var;
        }
        if (list.isEmpty()) {
            return a0Var.C(h0Var);
        }
        if (!(a0Var instanceof ue.i)) {
            return v(list, h0Var, a0Var.t(), a0Var.u());
        }
        ue.i iVar = (ue.i) a0Var;
        k0 k0Var = iVar.f21628b;
        ue.g gVar = iVar.f21629c;
        ue.k kVar = iVar.f21630d;
        boolean z10 = iVar.f21632f;
        String[] strArr = iVar.f21633g;
        return new ue.i(k0Var, gVar, kVar, list, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static w r(w wVar, List list, zc.h hVar, int i10) {
        if ((i10 & 2) != 0) {
            hVar = wVar.getAnnotations();
        }
        jc.l.e(wVar, "<this>");
        if ((list.isEmpty() || list == wVar.q()) && hVar == wVar.getAnnotations()) {
            return wVar;
        }
        h0 h0VarR = wVar.r();
        if ((hVar instanceof zc.l) && ((zc.l) hVar).isEmpty()) {
            hVar = zc.g.f26696a;
        }
        h0 h0VarT = t(h0VarR, hVar);
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof q) {
            q qVar = (q) w0VarX;
            return g(q(qVar.f19978b, list, h0VarT), q(qVar.f19979c, list, h0VarT));
        }
        if (w0VarX instanceof a0) {
            return q((a0) w0VarX, list, h0VarT);
        }
        throw new ce.j0();
    }

    public static /* synthetic */ a0 s(a0 a0Var, List list, h0 h0Var, int i10) {
        if ((i10 & 1) != 0) {
            list = a0Var.q();
        }
        if ((i10 & 2) != 0) {
            h0Var = a0Var.r();
        }
        return q(a0Var, list, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final se.h0 t(se.h0 r5, zc.h r6) {
        /*
            java.lang.String r0 = "<this>"
            jc.l.e(r5, r0)
            zc.h r0 = se.h.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            q4.k r0 = se.h.f19949b
            pc.u[] r1 = se.h.f19948a
            r2 = 0
            r1 = r1[r2]
            r0.getClass()
            java.lang.String r2 = "property"
            jc.l.e(r1, r2)
            ye.a r1 = r5.f26214a
            int r0 = r0.f17734a
            java.lang.Object r0 = r1.get(r0)
            se.g r0 = (se.g) r0
            if (r0 == 0) goto L6b
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L2e
            goto L5c
        L2e:
            ye.a r1 = r5.f26214a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r1.next()
            r4 = r3
            se.g r4 = (se.g) r4
            boolean r4 = jc.l.a(r4, r0)
            if (r4 != 0) goto L39
            r2.add(r3)
            goto L39
        L50:
            int r0 = r2.size()
            ye.a r1 = r5.f26214a
            int r1 = r1.a()
            if (r0 != r1) goto L5e
        L5c:
            r0 = r5
            goto L67
        L5e:
            m0.w r0 = se.h0.f19950b
            r0.getClass()
            se.h0 r0 = m0.w.u(r2)
        L67:
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r5 = r0
        L6b:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7c
            goto La1
        L7c:
            se.g r0 = new se.g
            r0.<init>(r6)
            m0.w r6 = se.h0.f19950b
            java.lang.Class<se.g> r1 = se.g.class
            jc.a0 r2 = jc.z.f10839a
            pc.c r1 = r2.b(r1)
            r6.getClass()
            java.lang.String r1 = r1.x()
            jc.l.b(r1)
            int r6 = r6.D(r1)
            ye.a r1 = r5.f26214a
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto La2
        La1:
            return r5
        La2:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lb2
            se.h0 r5 = new se.h0
            java.util.List r6 = ud.b.w(r0)
            r5.<init>(r6)
            return r5
        Lb2:
            java.util.List r5 = vb.m.G0(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r5 = vb.m.r0(r5, r0)
            se.h0 r5 = m0.w.u(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.c.t(se.h0, zc.h):se.h0");
    }

    public static final a0 u(h0 h0Var, yc.e eVar, List list) {
        jc.l.e(h0Var, "attributes");
        jc.l.e(eVar, "descriptor");
        jc.l.e(list, "arguments");
        k0 k0VarQ = eVar.Q();
        jc.l.d(k0VarQ, "getTypeConstructor(...)");
        return v(list, h0Var, k0VarQ, false);
    }

    public static a0 v(List list, h0 h0Var, k0 k0Var, boolean z10) {
        le.o oVarE;
        bd.e0 e0Var;
        le.o oVarC;
        le.o oVar;
        le.o oVarI;
        jc.l.e(h0Var, "attributes");
        jc.l.e(k0Var, "constructor");
        jc.l.e(list, "arguments");
        if (h0Var.isEmpty() && list.isEmpty() && !z10 && k0Var.h() != null) {
            yc.h hVarH = k0Var.h();
            jc.l.b(hVarH);
            a0 a0VarE = hVarH.E();
            jc.l.d(a0VarE, "getDefaultType(...)");
            return a0VarE;
        }
        yc.h hVarH2 = k0Var.h();
        if (hVarH2 instanceof yc.q0) {
            oVarE = ((yc.q0) hVarH2).E().n0();
        } else {
            if (hVarH2 instanceof yc.e) {
                ie.d.i(ie.d.j(hVarH2));
                boolean zIsEmpty = list.isEmpty();
                te.f fVar = te.f.f20727a;
                if (zIsEmpty) {
                    yc.e eVar = (yc.e) hVarH2;
                    e0Var = eVar instanceof bd.e0 ? (bd.e0) eVar : null;
                    if (e0Var == null || (oVarI = e0Var.i(fVar)) == null) {
                        oVarE = eVar.N0();
                        jc.l.d(oVarE, "getUnsubstitutedMemberScope(...)");
                    } else {
                        oVar = oVarI;
                    }
                } else {
                    yc.e eVar2 = (yc.e) hVarH2;
                    p0 p0VarG = l0.f19970b.g(k0Var, list);
                    e0Var = eVar2 instanceof bd.e0 ? (bd.e0) eVar2 : null;
                    if (e0Var == null || (oVarC = e0Var.c(p0VarG, fVar)) == null) {
                        oVarE = eVar2.f0(p0VarG);
                        jc.l.d(oVarE, "getMemberScope(...)");
                    } else {
                        oVar = oVarC;
                    }
                }
                return x(h0Var, k0Var, list, z10, oVar, new x(list, h0Var, k0Var, z10));
            }
            if (hVarH2 instanceof yc.p0) {
                String str = ((bd.p) ((yc.p0) hVarH2)).getName().f2751a;
                jc.l.d(str, "toString(...)");
                oVarE = ue.l.a(ue.h.f21623d, true, str);
            } else {
                if (!(k0Var instanceof v)) {
                    throw new IllegalStateException("Unsupported classifier: " + hVarH2 + " for constructor: " + k0Var);
                }
                oVarE = a2.c.E(((v) k0Var).f19998b, "member scope for intersection type");
            }
        }
        oVar = oVarE;
        return x(h0Var, k0Var, list, z10, oVar, new x(list, h0Var, k0Var, z10));
    }

    public static final a0 w(List list, le.o oVar, h0 h0Var, k0 k0Var, boolean z10) {
        jc.l.e(h0Var, "attributes");
        jc.l.e(k0Var, "constructor");
        jc.l.e(list, "arguments");
        jc.l.e(oVar, "memberScope");
        b0 b0Var = new b0(k0Var, list, z10, oVar, new x(list, oVar, h0Var, k0Var, z10));
        return h0Var.isEmpty() ? b0Var : new c0(b0Var, h0Var);
    }

    public static final a0 x(h0 h0Var, k0 k0Var, List list, boolean z10, le.o oVar, ic.k kVar) {
        jc.l.e(h0Var, "attributes");
        jc.l.e(k0Var, "constructor");
        jc.l.e(list, "arguments");
        jc.l.e(oVar, "memberScope");
        b0 b0Var = new b0(k0Var, list, z10, oVar, kVar);
        return h0Var.isEmpty() ? b0Var : new c0(b0Var, h0Var);
    }

    public static final w y(yc.q0 q0Var) {
        jc.l.e(q0Var, "<this>");
        yc.k kVarY = q0Var.y();
        jc.l.d(kVarY, "getContainingDeclaration(...)");
        if (kVarY instanceof yc.i) {
            List listO = ((yc.i) kVarY).Q().o();
            jc.l.d(listO, "getParameters(...)");
            List list = listO;
            ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k0 k0VarQ = ((yc.q0) it.next()).Q();
                jc.l.d(k0VarQ, "getTypeConstructor(...)");
                arrayList.add(k0VarQ);
            }
            List upperBounds = q0Var.getUpperBounds();
            jc.l.d(upperBounds, "getUpperBounds(...)");
            return d(arrayList, upperBounds, ie.d.e(q0Var));
        }
        if (!(kVarY instanceof yc.t)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((yc.t) kVarY).getTypeParameters();
        jc.l.d(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            k0 k0VarQ2 = ((yc.q0) it2.next()).Q();
            jc.l.d(k0VarQ2, "getTypeConstructor(...)");
            arrayList2.add(k0VarQ2);
        }
        List upperBounds2 = q0Var.getUpperBounds();
        jc.l.d(upperBounds2, "getUpperBounds(...)");
        return d(arrayList2, upperBounds2, ie.d.e(q0Var));
    }

    public static boolean z(te.b bVar, ve.e eVar, ve.e eVar2) {
        if (bVar.w(eVar) == bVar.w(eVar2) && bVar.e0(eVar) == bVar.e0(eVar2) && bVar.q(eVar) == bVar.q(eVar2) && bVar.n(bVar.R(eVar), bVar.R(eVar2))) {
            if (bVar.V(eVar, eVar2)) {
                return true;
            }
            int iW = bVar.w(eVar);
            for (int i10 = 0; i10 < iW; i10++) {
                n0 n0VarN0 = bVar.n0(eVar, i10);
                n0 n0VarN02 = bVar.n0(eVar2, i10);
                if (bVar.a0(n0VarN0) == bVar.a0(n0VarN02)) {
                    if (!bVar.a0(n0VarN0)) {
                        if (bVar.R0(n0VarN0) == bVar.R0(n0VarN02)) {
                            w0 w0VarN0 = bVar.N0(n0VarN0);
                            jc.l.b(w0VarN0);
                            w0 w0VarN02 = bVar.N0(n0VarN02);
                            jc.l.b(w0VarN02);
                            if (!A(bVar, w0VarN0, w0VarN02)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public abstract ve.e F(j0 j0Var, ve.d dVar);
}
