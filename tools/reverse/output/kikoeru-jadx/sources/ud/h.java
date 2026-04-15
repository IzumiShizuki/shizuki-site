package ud;

import ce.j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.z;
import q.t0;
import se.a0;
import se.f0;
import se.k0;
import se.n0;
import se.w;
import se.w0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements oe.n, te.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f21583a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f21584b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f21585c = new h();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static m b(String str) {
        je.c cVar;
        jc.l.e(str, "representation");
        char cCharAt = str.charAt(0);
        je.c[] cVarArrValues = je.c.values();
        int length = cVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i10];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (cVar != null) {
            return new l(cVar);
        }
        if (cCharAt == 'V') {
            return new l(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            jc.l.d(strSubstring, "substring(...)");
            return new j(b(strSubstring));
        }
        if (cCharAt == 'L') {
            ef.n.q0(';', str);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        jc.l.d(strSubstring2, "substring(...)");
        return new k(strSubstring2);
    }

    public static k d(String str) {
        jc.l.e(str, "internalName");
        return new k(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        jc.l.e(str, "internalName");
        jc.l.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet h(String str, String... strArr) {
        jc.l.e(strArr, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet i(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String y(m mVar) {
        String strC;
        jc.l.e(mVar, "type");
        if (mVar instanceof j) {
            return "[" + y(((j) mVar).f21589i);
        }
        if (mVar instanceof l) {
            je.c cVar = ((l) mVar).f21591i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (mVar instanceof k) {
            return t0.E(new StringBuilder("L"), ((k) mVar).f21590i, ';');
        }
        throw new j0();
    }

    @Override // te.b
    public boolean A(ve.e eVar) {
        return te.g.G(te.g.Z(eVar));
    }

    @Override // te.b
    public /* bridge */ boolean A0(ve.h hVar) {
        return te.g.A(hVar);
    }

    @Override // te.b
    public /* bridge */ a0 C(se.q qVar) {
        return te.g.b0(qVar);
    }

    @Override // te.b
    public boolean C0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = te.g.h(dVar);
        return (a0VarH != null ? te.g.e(this, x(a0VarH)) : null) != null;
    }

    @Override // te.b
    public int D(ve.g gVar) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.e) {
            return te.g.c((ve.d) gVar);
        }
        if (gVar instanceof ve.a) {
            return ((ve.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + z.f10839a.b(gVar.getClass())).toString());
    }

    @Override // te.b
    public /* bridge */ boolean D0(ve.h hVar) {
        return te.g.G(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.d E(ve.d dVar) {
        return te.g.d0(this, dVar);
    }

    @Override // te.b
    public /* bridge */ te.a F(ve.e eVar) {
        return te.g.X(this, eVar);
    }

    @Override // te.b
    public /* bridge */ f0 G(ve.d dVar) {
        return te.g.i(dVar);
    }

    @Override // te.b
    public /* bridge */ se.q G0(ve.d dVar) {
        return te.g.g(dVar);
    }

    @Override // te.b
    public /* bridge */ boolean H(q0 q0Var, ve.h hVar) {
        return te.g.y(q0Var, hVar);
    }

    @Override // te.b
    public n0 I(ve.e eVar, int i10) {
        if (i10 < 0 || i10 >= te.g.c(eVar)) {
            return null;
        }
        return te.g.p(eVar, i10);
    }

    @Override // te.b
    public /* bridge */ a0 I0(w wVar) {
        return te.g.h(wVar);
    }

    @Override // te.b
    public boolean J0(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        return dVar instanceof td.f;
    }

    @Override // te.b
    public /* bridge */ te.i K(ve.c cVar) {
        return te.g.a0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // te.b
    public n0 K0(ve.g gVar, int i10) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.f) {
            return te.g.p((ve.d) gVar, i10);
        }
        if (gVar instanceof ve.a) {
            E e10 = ((ve.a) gVar).get(i10);
            jc.l.d(e10, "get(...)");
            return (n0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + z.f10839a.b(gVar.getClass())).toString());
    }

    @Override // te.b
    public /* bridge */ boolean L(ve.h hVar) {
        return te.g.D(hVar);
    }

    @Override // te.b
    public /* bridge */ w0 L0(ve.c cVar) {
        return te.g.R(cVar);
    }

    @Override // te.b
    public /* bridge */ a0 M(se.q qVar) {
        return te.g.Q(qVar);
    }

    @Override // te.b
    public boolean M0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = te.g.h(dVar);
        return (a0VarH != null ? te.g.f(a0VarH) : null) != null;
    }

    @Override // te.b
    public /* bridge */ w0 N0(n0 n0Var) {
        return te.g.t(this, n0Var);
    }

    @Override // te.b
    public boolean O0(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.J(q0(eVar)) && !te.g.K(eVar);
    }

    @Override // te.b
    public boolean P(ve.c cVar) {
        return cVar instanceof fe.a;
    }

    @Override // te.b
    public /* bridge */ k0 R(ve.e eVar) {
        return te.g.Z(eVar);
    }

    @Override // te.b
    public /* bridge */ ve.j R0(n0 n0Var) {
        return te.g.v(n0Var);
    }

    @Override // te.b
    public /* bridge */ w0 S(ve.f fVar, ve.f fVar2) {
        return te.g.m(this, fVar, fVar2);
    }

    @Override // te.b
    public a0 U(ve.d dVar) {
        a0 a0VarB0;
        jc.l.e(dVar, "<this>");
        se.q qVarG = te.g.g(dVar);
        if (qVarG != null && (a0VarB0 = te.g.b0(qVarG)) != null) {
            return a0VarB0;
        }
        a0 a0VarH = te.g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    @Override // te.b
    public /* bridge */ boolean V(ve.e eVar, ve.e eVar2) {
        return te.g.z(eVar, eVar2);
    }

    @Override // te.b
    public /* bridge */ boolean X(ve.c cVar) {
        return te.g.M(cVar);
    }

    @Override // te.b
    public /* bridge */ ve.j Y(q0 q0Var) {
        return te.g.w(q0Var);
    }

    @Override // te.b
    public /* bridge */ n0 Z(fe.b bVar) {
        return te.g.V(bVar);
    }

    @Override // te.b
    public /* bridge */ boolean a0(n0 n0Var) {
        return te.g.N(n0Var);
    }

    @Override // te.b
    public /* bridge */ a0 b0(se.q qVar) {
        return te.g.Q(qVar);
    }

    @Override // oe.n
    public w c(wd.t0 t0Var, String str, a0 a0Var, a0 a0Var2) {
        jc.l.e(t0Var, "proto");
        jc.l.e(str, "flexibleId");
        jc.l.e(a0Var, "lowerBound");
        jc.l.e(a0Var2, "upperBound");
        if (str.equals("kotlin.jvm.PlatformType")) {
            return t0Var.l(zd.j.f26809g) ? new qd.h(a0Var, a0Var2) : se.c.g(a0Var, a0Var2);
        }
        return ue.l.c(ue.k.ERROR_FLEXIBLE_TYPE, str, a0Var.toString(), a0Var2.toString());
    }

    @Override // te.b
    public /* bridge */ boolean c0(ve.h hVar) {
        return te.g.B(hVar);
    }

    @Override // te.b
    public w0 d0(ve.d dVar) {
        return te.g.S(dVar);
    }

    @Override // te.b
    public /* bridge */ boolean e0(ve.d dVar) {
        return te.g.I(dVar);
    }

    @Override // te.b
    public /* bridge */ int f(ve.h hVar) {
        return te.g.T(hVar);
    }

    @Override // te.b
    public /* bridge */ a0 f0(ve.e eVar) {
        return te.g.c0(eVar, true);
    }

    @Override // te.b
    public vc.i g() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // te.b
    public /* bridge */ a0 g0(ve.e eVar) {
        return te.g.c0(eVar, false);
    }

    @Override // te.b
    public /* bridge */ boolean h0(ve.d dVar) {
        return te.g.E(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 i0(se.q qVar) {
        return te.g.b0(qVar);
    }

    @Override // te.b
    public ve.c j(ve.e eVar) {
        return te.g.e(this, x(eVar));
    }

    @Override // te.b
    public boolean k(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.B(te.g.Z(eVar));
    }

    public ve.d l(ve.d dVar) {
        a0 a0VarC0;
        jc.l.e(dVar, "<this>");
        a0 a0VarH = te.g.h(dVar);
        return (a0VarH == null || (a0VarC0 = te.g.c0(a0VarH, true)) == null) ? dVar : a0VarC0;
    }

    @Override // te.b
    public w0 l0(ArrayList arrayList) {
        a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (w0) vb.m.w0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            z10 = z10 || se.c.l(w0Var);
            if (w0Var instanceof a0) {
                a0Var = (a0) w0Var;
            } else {
                if (!(w0Var instanceof se.q)) {
                    throw new j0();
                }
                a0Var = ((se.q) w0Var).f19978b;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return ue.l.c(ue.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        te.s sVar = te.s.f20752a;
        if (!z11) {
            return sVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(se.c.G((w0) it2.next()));
        }
        return se.c.g(sVar.b(arrayList2), sVar.b(arrayList3));
    }

    @Override // te.b
    public /* bridge */ ve.c m(a0 a0Var) {
        return te.g.e(this, a0Var);
    }

    @Override // te.b
    public boolean m0(w0 w0Var) {
        jc.l.e(w0Var, "<this>");
        return te.g.I(v0(w0Var)) != te.g.I(U(w0Var));
    }

    @Override // te.b
    public /* bridge */ boolean n(ve.h hVar, ve.h hVar2) {
        return te.g.b(hVar, hVar2);
    }

    @Override // te.b
    public /* bridge */ n0 n0(ve.d dVar, int i10) {
        return te.g.p(dVar, i10);
    }

    @Override // te.b
    public void o(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        te.g.g(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 p(ve.d dVar) {
        return te.g.h(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 p0(ve.e eVar) {
        return te.g.j(eVar);
    }

    @Override // te.b
    public boolean q(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return te.g.f(eVar) != null;
    }

    @Override // te.b
    public k0 q0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = te.g.h(dVar);
        if (a0VarH == null) {
            a0VarH = v0(dVar);
        }
        return te.g.Z(a0VarH);
    }

    @Override // te.b
    public /* bridge */ ve.b r(ve.c cVar) {
        return te.g.k(cVar);
    }

    @Override // te.b
    public /* bridge */ void r0(ve.e eVar) {
        te.g.O(eVar);
    }

    @Override // te.b
    public boolean s(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        return !jc.l.a(te.g.Z(v0(dVar)), te.g.Z(U(dVar)));
    }

    @Override // te.b
    public /* bridge */ boolean s0(ve.h hVar) {
        return te.g.C(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.g t(ve.e eVar) {
        return te.g.d(eVar);
    }

    @Override // te.b
    public /* bridge */ boolean t0(ve.h hVar) {
        return te.g.H(hVar);
    }

    @Override // te.b
    public /* bridge */ Collection u(ve.e eVar) {
        return te.g.U(this, eVar);
    }

    @Override // te.b
    public /* bridge */ boolean v(ve.h hVar) {
        return te.g.J(hVar);
    }

    @Override // te.b
    public a0 v0(ve.d dVar) {
        a0 a0VarQ;
        jc.l.e(dVar, "<this>");
        se.q qVarG = te.g.g(dVar);
        if (qVarG != null && (a0VarQ = te.g.Q(qVarG)) != null) {
            return a0VarQ;
        }
        a0 a0VarH = te.g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    @Override // te.b
    public /* bridge */ int w(ve.d dVar) {
        return te.g.c(dVar);
    }

    @Override // te.b
    public /* bridge */ q0 w0(ve.h hVar, int i10) {
        return te.g.r(hVar, i10);
    }

    public ve.f x(ve.e eVar) {
        a0 a0Var;
        se.l lVarF = te.g.f(eVar);
        return (lVarF == null || (a0Var = lVarF.f19968b) == null) ? (ve.f) eVar : a0Var;
    }

    @Override // te.b
    public /* bridge */ Collection z(ve.h hVar) {
        return te.g.Y(hVar);
    }

    @Override // te.b
    public /* bridge */ void z0(ve.e eVar) {
        te.g.P(eVar);
    }

    @Override // te.b
    public void u0(ve.e eVar, ve.h hVar) {
    }
}
