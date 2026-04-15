package vc;

import b0.w1;
import bd.h0;
import bd.j0;
import bd.q0;
import bd.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.p2;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import se.a0;
import se.u0;
import se.w;
import se.x0;
import yc.d0;
import yc.f0;
import yc.k0;
import yc.t;
import yc.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final be.e f22839e = be.e.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.i f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.e f22842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.l f22843d;

    public i(re.l lVar) {
        this.f22843d = lVar;
        lVar.a(new f(this, 0));
        this.f22841b = new re.i(lVar, new f(this, 1));
        this.f22842c = lVar.b(new g(this, 0));
    }

    public static boolean A(w wVar, be.d dVar) {
        if (wVar == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return H(wVar.t(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(w wVar, be.d dVar) {
        if (dVar != null) {
            return A(wVar, dVar) && !wVar.u();
        }
        a(135);
        throw null;
    }

    public static boolean C(t tVar) {
        if (tVar.a().getAnnotations().f(n.f22884m)) {
            return true;
        }
        if (!(tVar instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) tVar;
        boolean zU0 = k0Var.u0();
        q0 q0VarD = k0Var.d();
        r0 r0VarE = k0Var.e();
        if (q0VarD == null || !C(q0VarD)) {
            return false;
        }
        if (zU0) {
            return r0VarE != null && C(r0VarE);
        }
        return true;
    }

    public static boolean D(w wVar, be.d dVar) {
        if (wVar == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !wVar.u() && A(wVar, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(w wVar) {
        if (wVar != null) {
            return A(wVar, n.f22867b) && !u0.e(wVar);
        }
        a(136);
        throw null;
    }

    public static boolean F(w wVar) {
        if (wVar.u()) {
            return false;
        }
        yc.h hVarH = wVar.t().h();
        return (hVarH instanceof yc.e) && t((yc.e) hVarH) != null;
    }

    public static boolean G(w wVar) {
        return D(wVar, n.f22875f);
    }

    public static boolean H(se.k0 k0Var, be.d dVar) {
        if (k0Var == null) {
            a(TinkerReport.KEY_APPLIED_UPGRADE_FAIL);
            throw null;
        }
        if (dVar != null) {
            yc.h hVarH = k0Var.h();
            return (hVarH instanceof yc.e) && b((yc.e) hVarH, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean I(yc.h hVar) {
        if (hVar == null) {
            a(10);
            throw null;
        }
        for (yc.k kVarY = hVar; kVarY != null; kVarY = kVarY.y()) {
            if (kVarY instanceof d0) {
                be.c cVar = ((j0) ((d0) kVarY)).f2596e;
                be.e eVar = o.f22907j;
                cVar.getClass();
                jc.l.e(eVar, "segment");
                return cVar.f2744a.h(eVar);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.i.a(int):void");
    }

    public static boolean b(yc.e eVar, be.d dVar) {
        if (eVar == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return eVar.getName().equals(dVar.g()) && dVar.equals(ee.e.g(eVar));
        }
        a(104);
        throw null;
    }

    public static k r(yc.h hVar) {
        if (hVar == null) {
            a(77);
            throw null;
        }
        if (n.f22874e0.contains(hVar.getName())) {
            return (k) n.f22878g0.get(ee.e.g(hVar));
        }
        return null;
    }

    public static k t(yc.e eVar) {
        if (n.f22872d0.contains(eVar.getName())) {
            return (k) n.f22876f0.get(ee.e.g(eVar));
        }
        return null;
    }

    public static boolean x(w wVar) {
        if (wVar != null) {
            return A(wVar, n.f22865a);
        }
        a(139);
        throw null;
    }

    public static boolean y(w wVar) {
        if (wVar != null) {
            return A(wVar, n.f22877g);
        }
        a(88);
        throw null;
    }

    public static boolean z(yc.k kVar) {
        if (kVar != null) {
            return ee.e.i(kVar, pe.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ub.h] */
    public final void c() {
        be.e eVar = f22839e;
        jc.l.e(eVar, "moduleName");
        re.l lVar = this.f22843d;
        h0 h0Var = new h0(eVar, lVar, this, 48);
        this.f22840a = h0Var;
        c.f22830a.getClass();
        c cVar = (c) b.f22829b.getValue();
        h0 h0Var2 = this.f22840a;
        Iterable iterableM = m();
        ad.d dVarP = p();
        ad.b bVarD = d();
        ((pe.b) cVar).getClass();
        jc.l.e(h0Var2, "builtInsModule");
        jc.l.e(iterableM, "classDescriptorFactories");
        jc.l.e(dVarP, "platformDependentDeclarationFilter");
        jc.l.e(bVarD, "additionalClassPartsProvider");
        Set<be.c> set = o.f22914q;
        jc.l.e(set, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (be.c cVar2 : set) {
            pe.a.f17104m.getClass();
            String strA = pe.a.a(cVar2);
            jc.l.e(strA, "p0");
            InputStream inputStreamF = pe.d.F(strA);
            pe.c cVarG = inputStreamF != null ? n7.e.g(cVar2, lVar, h0Var2, inputStreamF) : null;
            if (cVarG != null) {
                arrayList.add(cVarG);
            }
        }
        f0 f0Var = new f0(arrayList);
        w1 w1Var = new w1(lVar, h0Var2);
        p2 p2Var = new p2(f0Var);
        pe.a aVar = pe.a.f17104m;
        oe.i iVar = new oe.i(lVar, h0Var2, p2Var, new m0.w(h0Var2, w1Var, aVar), f0Var, iterableM, w1Var, bVarD, dVarP, aVar.f15801a, null, new g5.w(lVar), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pe.c) it.next()).E1(iVar);
        }
        h0Var.f2580h = f0Var;
        h0 h0Var3 = this.f22840a;
        h0Var3.getClass();
        h0Var3.f2579g = new bd.f0(vb.l.M0(new h0[]{h0Var3}));
    }

    public ad.b d() {
        return ad.a.f308b;
    }

    public final a0 e() {
        a0 a0VarE = k("Any").E();
        if (a0VarE != null) {
            return a0VarE;
        }
        a(51);
        throw null;
    }

    public final w f(w wVar) {
        if (wVar == null) {
            a(68);
            throw null;
        }
        w wVarG = g(wVar);
        if (wVarG != null) {
            return wVarG;
        }
        throw new IllegalStateException("not array: " + wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final se.w g(se.w r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L92
            boolean r1 = y(r5)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r1 = r5.q()
            int r1 = r1.size()
            r3 = 1
            if (r1 == r3) goto L17
            goto L91
        L17:
            java.util.List r5 = r5.q()
            java.lang.Object r5 = r5.get(r2)
            se.n0 r5 = (se.n0) r5
            se.w r5 = r5.b()
            return r5
        L26:
            se.w0 r5 = se.u0.g(r5, r2)
            re.i r1 = r4.f22841b
            java.lang.Object r1 = r1.b()
            vc.h r1 = (vc.h) r1
            java.util.HashMap r1 = r1.f22838b
            java.lang.Object r1 = r1.get(r5)
            se.w r1 = (se.w) r1
            if (r1 == 0) goto L3d
            return r1
        L3d:
            int r1 = ee.e.f6524a
            se.k0 r1 = r5.t()
            yc.h r1 = r1.h()
            if (r1 != 0) goto L4b
            r1 = r0
            goto L4f
        L4b:
            yc.y r1 = ee.e.e(r1)
        L4f:
            if (r1 == 0) goto L91
            se.k0 r5 = r5.t()
            yc.h r5 = r5.h()
            if (r5 != 0) goto L5d
        L5b:
            r5 = r0
            goto L8e
        L5d:
            java.util.Set r2 = vc.s.f22926a
            be.e r2 = r5.getName()
            java.lang.String r3 = "name"
            jc.l.e(r2, r3)
            java.util.LinkedHashSet r3 = vc.s.f22929d
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L71
            goto L5b
        L71:
            be.b r5 = ie.d.f(r5)
            if (r5 != 0) goto L78
            goto L5b
        L78:
            java.util.HashMap r2 = vc.s.f22927b
            java.lang.Object r5 = r2.get(r5)
            be.b r5 = (be.b) r5
            if (r5 != 0) goto L83
            goto L5b
        L83:
            yc.e r5 = yc.v.d(r1, r5)
            if (r5 != 0) goto L8a
            goto L5b
        L8a:
            se.a0 r5 = r5.E()
        L8e:
            if (r5 == 0) goto L91
            return r5
        L91:
            return r0
        L92:
            r5 = 70
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.i.g(se.w):se.w");
    }

    public final a0 h(w wVar) {
        if (wVar != null) {
            return i(x0.INVARIANT, wVar, zc.g.f26696a);
        }
        a(83);
        throw null;
    }

    public final a0 i(x0 x0Var, w wVar, zc.h hVar) {
        if (wVar != null) {
            return se.c.u(se.c.E(hVar), k("Array"), Collections.singletonList(new se.f0(wVar, x0Var)));
        }
        a(79);
        throw null;
    }

    public final yc.e j(be.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        yc.e eVarJ = v.j(l(), cVar);
        if (eVarJ != null) {
            return eVarJ;
        }
        a(13);
        throw null;
    }

    public final yc.e k(String str) {
        if (str != null) {
            return (yc.e) this.f22842c.a(be.e.e(str));
        }
        a(14);
        throw null;
    }

    public final h0 l() {
        this.f22840a.getClass();
        h0 h0Var = this.f22840a;
        if (h0Var != null) {
            return h0Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new wc.a(this.f22843d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final a0 n() {
        a0 a0VarE = k("Nothing").E();
        if (a0VarE != null) {
            return a0VarE;
        }
        a(49);
        throw null;
    }

    public final a0 o() {
        a0 a0VarD = e().z(true);
        if (a0VarD != null) {
            return a0VarD;
        }
        a(52);
        throw null;
    }

    public ad.d p() {
        return ad.a.f310d;
    }

    public final a0 q(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        a0 a0Var = (a0) ((h) this.f22841b.b()).f22837a.get(kVar);
        if (a0Var != null) {
            return a0Var;
        }
        a(74);
        throw null;
    }

    public final a0 s(k kVar) {
        if (kVar == null) {
            a(54);
            throw null;
        }
        a0 a0VarE = k(kVar.f22856a.b()).E();
        if (a0VarE != null) {
            return a0VarE;
        }
        a(55);
        throw null;
    }

    public final a0 u() {
        a0 a0VarE = k("String").E();
        if (a0VarE != null) {
            return a0VarE;
        }
        a(66);
        throw null;
    }

    public final yc.e v(int i10) {
        return j(o.f22903f.a(be.e.e(wc.j.f23508c.f23510b + i10)));
    }

    public final a0 w() {
        a0 a0VarE = k("Unit").E();
        if (a0VarE != null) {
            return a0VarE;
        }
        a(65);
        throw null;
    }
}
