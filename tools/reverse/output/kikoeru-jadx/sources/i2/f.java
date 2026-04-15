package i2;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f8687a = new d(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f8688b = new m1(1);

    public static final View A(m mVar) {
        if (!((j1.p) mVar).f9690a.f9703n) {
            f2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) m0.a(y(mVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [i2.d2, i2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ic.k] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void B(d2 d2Var, ic.k kVar) {
        d1 d1Var;
        j1.p pVar = (j1.p) d2Var;
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar2 = pVar.f9690a.f9694e;
        j0 j0VarY = y(d2Var);
        while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f9692c & 262144) != 0) {
                        ?? F = pVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            boolean zBooleanValue = true;
                            if (F instanceof d2) {
                                d2 d2Var2 = (d2) F;
                                if (jc.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) kVar.a(d2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F.f9692c & 262144) != 0) && (F instanceof n)) {
                                    j1.p pVar3 = ((n) F).f8789p;
                                    int i10 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f9692c & 262144) != 0) {
                                            i10++;
                                            eVar = eVar;
                                            if (i10 == 1) {
                                                F = pVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f9695f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    pVar2 = pVar2.f9694e;
                }
            }
            j0VarY = j0VarY.v();
            pVar2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [i2.d2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ic.k] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void C(d2 d2Var, ic.k kVar) {
        j1.p pVar = (j1.p) d2Var;
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.e eVar = new z0.e(new j1.p[16]);
        j1.p pVar2 = pVar.f9690a;
        j1.p pVar3 = pVar2.f9695f;
        if (pVar3 == null) {
            b(eVar, pVar2);
        } else {
            eVar.b(pVar3);
        }
        while (true) {
            int i10 = eVar.f26374c;
            if (i10 == 0) {
                return;
            }
            j1.p pVar4 = (j1.p) eVar.k(i10 - 1);
            if ((pVar4.f9693d & 262144) != 0) {
                for (j1.p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f9695f) {
                    if ((pVar5.f9692c & 262144) != 0) {
                        ?? F = pVar5;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof d2) {
                                d2 d2Var2 = (d2) F;
                                c2 c2Var = (jc.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) ? (c2) kVar.a(d2Var2) : c2.f8657a;
                                if (c2Var == c2.f8659c) {
                                    return;
                                }
                                if (c2Var == c2.f8658b) {
                                    break;
                                }
                            } else if ((F.f9692c & 262144) != 0 && (F instanceof n)) {
                                j1.p pVar6 = ((n) F).f8789p;
                                int i11 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (pVar6 != null) {
                                    if ((pVar6.f9692c & 262144) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            F = pVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = f(eVar2);
                        }
                    }
                }
            }
            b(eVar, pVar4);
        }
    }

    public static final long a(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static final void b(z0.e eVar, j1.p pVar) {
        z0.e eVarZ = y(pVar).z();
        int i10 = eVarZ.f26374c - 1;
        Object[] objArr = eVarZ.f26372a;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                eVar.b(((j0) objArr[i10]).F.f8667f);
                i10--;
            }
        }
    }

    public static final int c(q0 q0Var, g2.t tVar) {
        q0 q0VarQ0 = q0Var.q0();
        if (q0VarQ0 == null) {
            f2.a.b("Child of " + q0Var + " cannot be null when calculating alignment line");
        }
        if (q0Var.u0().i().containsKey(tVar)) {
            Integer num = (Integer) q0Var.u0().i().get(tVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iR = q0VarQ0.R(tVar);
            if (iR != Integer.MIN_VALUE) {
                q0VarQ0.f8823j = true;
                q0Var.f8824k = true;
                q0Var.A0();
                q0VarQ0.f8823j = false;
                q0Var.f8824k = false;
                return iR + ((int) (tVar instanceof g2.t ? q0VarQ0.w0() & 4294967295L : q0VarQ0.w0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        a2 a2Var = y(cVar).F.f8666e;
        jc.l.c(a2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return a2Var.f8646o;
    }

    public static final j1.p e(m mVar, int i10) {
        j1.p pVar = ((j1.p) mVar).f9690a.f9695f;
        if (pVar == null || (pVar.f9693d & i10) == 0) {
            return null;
        }
        while (pVar != null) {
            int i11 = pVar.f9692c;
            if ((i11 & 2) != 0) {
                return null;
            }
            if ((i11 & i10) != 0) {
                return pVar;
            }
            pVar = pVar.f9695f;
        }
        return null;
    }

    public static final j1.p f(z0.e eVar) {
        int i10;
        if (eVar == null || (i10 = eVar.f26374c) == 0) {
            return null;
        }
        return (j1.p) eVar.k(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z g(j1.p pVar) {
        if ((pVar.f9692c & 2) != 0) {
            if (pVar instanceof z) {
                return (z) pVar;
            }
            if (pVar instanceof n) {
                j1.p pVar2 = ((n) pVar).f8789p;
                while (pVar2 != 0) {
                    if (pVar2 instanceof z) {
                        return (z) pVar2;
                    }
                    pVar2 = (!(pVar2 instanceof n) || (pVar2.f9692c & 2) == 0) ? pVar2.f9695f : ((n) pVar2).f8789p;
                }
            }
        }
        return null;
    }

    public static final int h(long j10, long j11) {
        boolean zQ = q(j10);
        if (zQ != q(j11)) {
            return zQ ? -1 : 1;
        }
        return (Math.min(l(j10), l(j11)) >= 0.0f && p(j10) != p(j11)) ? p(j10) ? -1 : 1 : (int) Math.signum(l(j10) - l(j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(l lVar, x0.m1 m1Var) {
        if (!((j1.p) lVar).f9690a.f9703n) {
            f2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        f1.k kVar = (f1.k) y(lVar).B;
        kVar.getClass();
        return x0.v.w(kVar, m1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [i2.d2, i2.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final d2 j(d2 d2Var) {
        d1 d1Var;
        j1.p pVar = (j1.p) d2Var;
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar2 = pVar.f9690a.f9694e;
        j0 j0VarY = y(d2Var);
        while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f9692c & 262144) != 0) {
                        ?? F = pVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof d2) {
                                d2 d2Var2 = (d2) F;
                                if (jc.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) {
                                    return d2Var2;
                                }
                            } else if ((F.f9692c & 262144) != 0 && (F instanceof n)) {
                                j1.p pVar3 = ((n) F).f8789p;
                                int i10 = 0;
                                F = F;
                                eVar = eVar;
                                while (pVar3 != null) {
                                    if ((pVar3.f9692c & 262144) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            F = pVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar.b(F);
                                                F = 0;
                                            }
                                            eVar.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f9695f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    pVar2 = pVar2.f9694e;
                }
            }
            j0VarY = j0VarY.v();
            pVar2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
        }
        return null;
    }

    public static final ArrayList k(g2.y yVar) {
        jc.l.c(yVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        j0 j0VarT0 = ((q0) yVar).t0();
        boolean zR = r(j0VarT0);
        List listO = j0VarT0.o();
        z0.b bVar = (z0.b) listO;
        ArrayList arrayList = new ArrayList(bVar.f26366a.f26374c);
        int size = listO.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = (j0) bVar.get(i10);
            arrayList.add(zR ? j0Var.l() : j0Var.m());
        }
        return arrayList;
    }

    public static final float l(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(p pVar) {
        if (((j1.p) pVar).f9690a.f9703n) {
            v(pVar, 1).T0();
        }
    }

    public static final void n(z zVar) {
        y(zVar).E();
    }

    public static final void o(y1 y1Var) {
        y(y1Var).G();
    }

    public static final boolean p(long j10) {
        return (j10 & 2) != 0;
    }

    public static final boolean q(long j10) {
        return (j10 & 1) != 0;
    }

    public static final boolean r(j0 j0Var) {
        int iOrdinal = j0Var.G.f8793d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new ce.j0();
                }
                j0 j0VarV = j0Var.v();
                if (j0VarV != null) {
                    return r(j0VarV);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean s(j0 j0Var) {
        if (j0Var.f8749h == null) {
            return false;
        }
        j0 j0VarV = j0Var.v();
        return (j0VarV != null ? j0VarV.f8749h : null) == null || j0Var.G.f8791b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(j1.p pVar, ic.a aVar) {
        l1 l1Var = pVar.f9696g;
        if (l1Var == null) {
            l1Var = new l1((k1) pVar);
            pVar.f9696g = l1Var;
        }
        ((j2.v) z(pVar)).getSnapshotObserver().a(l1Var, e.f8676g, aVar);
    }

    public static final void u(m mVar) {
        k1.b bVar;
        j0 j0VarY = y(mVar);
        if (j0VarY.f8761t) {
            return;
        }
        j2.v vVar = (j2.v) m0.a(j0VarY);
        if (!j2.v.e() || (bVar = vVar.F) == null) {
            return;
        }
        bVar.f10986d.f18730a.N(j0VarY.f8743b, new fa.s(1, bVar, j0VarY));
    }

    public static final g1 v(m mVar, int i10) {
        g1 g1Var = ((j1.p) mVar).f9690a.f9697h;
        jc.l.b(g1Var);
        if (g1Var.M0() != mVar || !h1.g(i10)) {
            return g1Var;
        }
        g1 g1Var2 = g1Var.f8703r;
        jc.l.b(g1Var2);
        return g1Var2;
    }

    public static final q1.v w(j1.p pVar) {
        return ((j2.v) z(pVar)).getGraphicsContext();
    }

    public static final g1 x(m mVar) {
        if (!((j1.p) mVar).f9690a.f9703n) {
            f2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        g1 g1VarV = v(mVar, 2);
        if (!g1VarV.M0().f9703n) {
            f2.a.b("LayoutCoordinates is not attached.");
        }
        return g1VarV;
    }

    public static final j0 y(m mVar) {
        g1 g1Var = ((j1.p) mVar).f9690a.f9697h;
        if (g1Var != null) {
            return g1Var.f8700o;
        }
        throw j2.h0.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final p1 z(m mVar) {
        p1 p1Var = y(mVar).f8755n;
        if (p1Var != null) {
            return p1Var;
        }
        throw j2.h0.g("This node does not have an owner.");
    }
}
