package te;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.z;
import se.a0;
import se.f0;
import se.j0;
import se.k0;
import se.n0;
import se.v;
import se.w;
import se.w0;
import se.x0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f20725a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f20726b = new e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [se.v] */
    /* JADX WARN: Type inference failed for: r0v2, types: [se.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [yc.q0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static a0 d(a0 a0Var) {
        w wVarB;
        k0 k0VarT = a0Var.t();
        ?? r32 = 0;
        if (k0VarT instanceof fe.c) {
            fe.c cVar = (fe.c) k0VarT;
            n0 n0Var = cVar.f7051a;
            n0 n0Var2 = n0Var.a() == x0.IN_VARIANCE ? n0Var : null;
            w0 w0VarX = (n0Var2 == null || (wVarB = n0Var2.b()) == null) ? null : wVarB.x();
            if (cVar.f7052b == null) {
                Collection collectionI = cVar.i();
                ArrayList arrayList = new ArrayList(vb.n.K(collectionI, 10));
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w) it.next()).x());
                }
                cVar.f7052b = new i(n0Var, new qe.e(1, arrayList), (q0) r32, 8);
            }
            i iVar = cVar.f7052b;
            jc.l.b(iVar);
            return new h(ve.b.f22956a, iVar, w0VarX, a0Var.r(), a0Var.u(), 32);
        }
        if (!(k0VarT instanceof v) || !a0Var.u()) {
            return a0Var;
        }
        ?? r0 = (v) k0VarT;
        LinkedHashSet linkedHashSet = r0.f19998b;
        ArrayList arrayList2 = new ArrayList(vb.n.K(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            arrayList2.add(ud.e.E((w) it2.next()));
            z10 = true;
        }
        if (z10) {
            w wVar = r0.f19997a;
            w0 w0VarE = wVar != null ? ud.e.E(wVar) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            v vVar = new v(linkedHashSet2);
            vVar.f19997a = w0VarE;
            r32 = vVar;
        }
        if (r32 != 0) {
            r0 = r32;
        }
        return r0.b();
    }

    @Override // te.b
    public boolean A(ve.e eVar) {
        return g.G(g.Z(eVar));
    }

    @Override // te.b
    public /* bridge */ boolean A0(ve.h hVar) {
        return g.A(hVar);
    }

    @Override // te.b
    public /* bridge */ a0 C(se.q qVar) {
        return g.b0(qVar);
    }

    @Override // te.b
    public boolean C0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = g.h(dVar);
        return (a0VarH != null ? g.e(this, b(a0VarH)) : null) != null;
    }

    @Override // te.b
    public int D(ve.g gVar) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.e) {
            return g.c((ve.d) gVar);
        }
        if (gVar instanceof ve.a) {
            return ((ve.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + z.f10839a.b(gVar.getClass())).toString());
    }

    @Override // te.b
    public /* bridge */ boolean D0(ve.h hVar) {
        return g.G(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.d E(ve.d dVar) {
        return g.d0(this, dVar);
    }

    @Override // te.b
    public /* bridge */ a F(ve.e eVar) {
        return g.X(this, eVar);
    }

    @Override // te.b
    public /* bridge */ f0 G(ve.d dVar) {
        return g.i(dVar);
    }

    @Override // te.b
    public /* bridge */ se.q G0(ve.d dVar) {
        return g.g(dVar);
    }

    @Override // te.b
    public /* bridge */ boolean H(q0 q0Var, ve.h hVar) {
        return g.y(q0Var, hVar);
    }

    @Override // te.b
    public n0 I(ve.e eVar, int i10) {
        if (i10 < 0 || i10 >= g.c(eVar)) {
            return null;
        }
        return g.p(eVar, i10);
    }

    @Override // te.b
    public /* bridge */ a0 I0(w wVar) {
        return g.h(wVar);
    }

    @Override // te.b
    public boolean J0(ve.d dVar) {
        jc.l.e(dVar, "$receiver");
        return dVar instanceof td.f;
    }

    @Override // te.b
    public /* bridge */ i K(ve.c cVar) {
        return g.a0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // te.b
    public n0 K0(ve.g gVar, int i10) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof ve.f) {
            return g.p((ve.d) gVar, i10);
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
        return g.D(hVar);
    }

    @Override // te.b
    public /* bridge */ w0 L0(ve.c cVar) {
        return g.R(cVar);
    }

    @Override // te.b
    public /* bridge */ a0 M(se.q qVar) {
        return g.Q(qVar);
    }

    @Override // te.b
    public boolean M0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = g.h(dVar);
        return (a0VarH != null ? g.f(a0VarH) : null) != null;
    }

    @Override // te.b
    public /* bridge */ w0 N0(n0 n0Var) {
        return g.t(this, n0Var);
    }

    @Override // te.b
    public boolean O0(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return g.J(q0(eVar)) && !g.K(eVar);
    }

    @Override // te.b
    public boolean P(ve.c cVar) {
        return cVar instanceof fe.a;
    }

    @Override // te.b
    public /* bridge */ k0 R(ve.e eVar) {
        return g.Z(eVar);
    }

    @Override // te.b
    public /* bridge */ ve.j R0(n0 n0Var) {
        return g.v(n0Var);
    }

    @Override // te.b
    public /* bridge */ w0 S(ve.f fVar, ve.f fVar2) {
        return g.m(this, fVar, fVar2);
    }

    @Override // te.b
    public a0 U(ve.d dVar) {
        a0 a0VarB0;
        jc.l.e(dVar, "<this>");
        se.q qVarG = g.g(dVar);
        if (qVarG != null && (a0VarB0 = g.b0(qVarG)) != null) {
            return a0VarB0;
        }
        a0 a0VarH = g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    @Override // te.b
    public /* bridge */ boolean V(ve.e eVar, ve.e eVar2) {
        return g.z(eVar, eVar2);
    }

    @Override // te.b
    public /* bridge */ boolean X(ve.c cVar) {
        return g.M(cVar);
    }

    @Override // te.b
    public /* bridge */ ve.j Y(q0 q0Var) {
        return g.w(q0Var);
    }

    @Override // te.b
    public /* bridge */ n0 Z(fe.b bVar) {
        return g.V(bVar);
    }

    public j0 a() {
        return g.l(false, this, null, 24);
    }

    @Override // te.b
    public /* bridge */ boolean a0(n0 n0Var) {
        return g.N(n0Var);
    }

    public ve.f b(ve.e eVar) {
        a0 a0Var;
        se.l lVarF = g.f(eVar);
        return (lVarF == null || (a0Var = lVarF.f19968b) == null) ? (ve.f) eVar : a0Var;
    }

    @Override // te.b
    public /* bridge */ a0 b0(se.q qVar) {
        return g.Q(qVar);
    }

    public w0 c(ve.d dVar) {
        w0 w0VarG;
        jc.l.e(dVar, "type");
        if (!(dVar instanceof w)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        w0 w0VarX = ((w) dVar).x();
        if (w0VarX instanceof a0) {
            w0VarG = d((a0) w0VarX);
        } else {
            if (!(w0VarX instanceof se.q)) {
                throw new ce.j0();
            }
            se.q qVar = (se.q) w0VarX;
            a0 a0Var = qVar.f19979c;
            a0 a0Var2 = qVar.f19978b;
            a0 a0VarD = d(a0Var2);
            a0 a0VarD2 = d(a0Var);
            w0VarG = (a0VarD == a0Var2 && a0VarD2 == a0Var) ? w0VarX : se.c.g(a0VarD, a0VarD2);
        }
        w wVarH = se.c.h(w0VarX);
        return se.c.I(w0VarG, wVarH != null ? c(wVarH) : null);
    }

    @Override // te.b
    public /* bridge */ boolean c0(ve.h hVar) {
        return g.B(hVar);
    }

    @Override // te.b
    public w0 d0(ve.d dVar) {
        return g.S(dVar);
    }

    @Override // te.b
    public /* bridge */ boolean e0(ve.d dVar) {
        return g.I(dVar);
    }

    @Override // te.b
    public /* bridge */ int f(ve.h hVar) {
        return g.T(hVar);
    }

    @Override // te.b
    public /* bridge */ a0 f0(ve.e eVar) {
        return g.c0(eVar, true);
    }

    @Override // te.b
    public vc.i g() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // te.b
    public /* bridge */ a0 g0(ve.e eVar) {
        return g.c0(eVar, false);
    }

    @Override // te.b
    public /* bridge */ boolean h0(ve.d dVar) {
        return g.E(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 i0(se.q qVar) {
        return g.b0(qVar);
    }

    @Override // te.b
    public ve.c j(ve.e eVar) {
        return g.e(this, b(eVar));
    }

    @Override // te.b
    public boolean k(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return g.B(g.Z(eVar));
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
                    throw new ce.j0();
                }
                a0Var = ((se.q) w0Var).f19978b;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return ue.l.c(ue.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        s sVar = s.f20752a;
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
        return g.e(this, a0Var);
    }

    @Override // te.b
    public boolean m0(w0 w0Var) {
        jc.l.e(w0Var, "<this>");
        return g.I(v0(w0Var)) != g.I(U(w0Var));
    }

    @Override // te.b
    public /* bridge */ boolean n(ve.h hVar, ve.h hVar2) {
        return g.b(hVar, hVar2);
    }

    @Override // te.b
    public /* bridge */ n0 n0(ve.d dVar, int i10) {
        return g.p(dVar, i10);
    }

    @Override // te.b
    public void o(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        g.g(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 p(ve.d dVar) {
        return g.h(dVar);
    }

    @Override // te.b
    public /* bridge */ a0 p0(ve.e eVar) {
        return g.j(eVar);
    }

    @Override // te.b
    public boolean q(ve.e eVar) {
        jc.l.e(eVar, "<this>");
        return g.f(eVar) != null;
    }

    @Override // te.b
    public k0 q0(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        a0 a0VarH = g.h(dVar);
        if (a0VarH == null) {
            a0VarH = v0(dVar);
        }
        return g.Z(a0VarH);
    }

    @Override // te.b
    public /* bridge */ ve.b r(ve.c cVar) {
        return g.k(cVar);
    }

    @Override // te.b
    public /* bridge */ void r0(ve.e eVar) {
        g.O(eVar);
    }

    @Override // te.b
    public boolean s(ve.d dVar) {
        jc.l.e(dVar, "<this>");
        return !jc.l.a(g.Z(v0(dVar)), g.Z(U(dVar)));
    }

    @Override // te.b
    public /* bridge */ boolean s0(ve.h hVar) {
        return g.C(hVar);
    }

    @Override // te.b
    public /* bridge */ ve.g t(ve.e eVar) {
        return g.d(eVar);
    }

    @Override // te.b
    public /* bridge */ boolean t0(ve.h hVar) {
        return g.H(hVar);
    }

    @Override // te.b
    public /* bridge */ Collection u(ve.e eVar) {
        return g.U(this, eVar);
    }

    @Override // te.b
    public /* bridge */ boolean v(ve.h hVar) {
        return g.J(hVar);
    }

    @Override // te.b
    public a0 v0(ve.d dVar) {
        a0 a0VarQ;
        jc.l.e(dVar, "<this>");
        se.q qVarG = g.g(dVar);
        if (qVarG != null && (a0VarQ = g.Q(qVarG)) != null) {
            return a0VarQ;
        }
        a0 a0VarH = g.h(dVar);
        jc.l.b(a0VarH);
        return a0VarH;
    }

    @Override // te.b
    public /* bridge */ int w(ve.d dVar) {
        return g.c(dVar);
    }

    @Override // te.b
    public /* bridge */ q0 w0(ve.h hVar, int i10) {
        return g.r(hVar, i10);
    }

    @Override // te.b
    public /* bridge */ Collection z(ve.h hVar) {
        return g.Y(hVar);
    }

    @Override // te.b
    public /* bridge */ void z0(ve.e eVar) {
        g.P(eVar);
    }

    @Override // te.b
    public void u0(ve.e eVar, ve.h hVar) {
    }
}
