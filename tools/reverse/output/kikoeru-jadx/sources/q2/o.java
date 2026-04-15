package q2;

import g2.n1;
import i2.g1;
import i2.j0;
import i2.y1;
import java.util.ArrayList;
import java.util.List;
import o.k0;
import q.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.p f17636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f17638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f17639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f17641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17642g;

    public o(j1.p pVar, boolean z10, j0 j0Var, k kVar) {
        this.f17636a = pVar;
        this.f17637b = z10;
        this.f17638c = j0Var;
        this.f17639d = kVar;
        this.f17642g = j0Var.f8743b;
    }

    public static /* synthetic */ List j(int i10, o oVar) {
        return oVar.i((i10 & 1) != 0 ? !oVar.f17637b : false, (i10 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final p1.c a(g1 g1Var) {
        ?? F;
        o oVarL = l();
        if (oVarL == null) {
            return p1.c.f16482e;
        }
        j1.p pVar = oVarL.f17638c.F.f8667f;
        if ((pVar.f9693d & 8) != 0) {
            loop0: while (pVar != null) {
                if ((pVar.f9692c & 8) != 0) {
                    F = pVar;
                    ?? eVar = 0;
                    while (F != 0) {
                        if (F instanceof y1) {
                            if (((y1) F).h()) {
                                break loop0;
                            }
                        } else if ((F.f9692c & 8) != 0 && (F instanceof i2.n)) {
                            j1.p pVar2 = ((i2.n) F).f8789p;
                            int i10 = 0;
                            F = F;
                            eVar = eVar;
                            while (pVar2 != null) {
                                if ((pVar2.f9692c & 8) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        F = pVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new z0.e(new j1.p[16]);
                                        }
                                        if (F != 0) {
                                            eVar.b(F);
                                            F = 0;
                                        }
                                        eVar.b(pVar2);
                                    }
                                }
                                pVar2 = pVar2.f9695f;
                                F = F;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        F = i2.f.f(eVar);
                    }
                }
                if ((pVar.f9693d & 8) == 0) {
                    break;
                }
                pVar = pVar.f9695f;
            }
            F = 0;
        } else {
            F = 0;
        }
        y1 y1Var = (y1) F;
        g1 g1VarV = y1Var != null ? i2.f.v(y1Var, 8) : null;
        return g1VarV == null ? oVarL.a(g1Var) : g1VarV.s(g1Var, true);
    }

    public final o b(h hVar, ic.k kVar) {
        k kVar2 = new k();
        kVar2.f17632c = false;
        kVar2.f17633d = false;
        kVar.a(kVar2);
        o oVar = new o(new n(kVar), false, new j0(this.f17642g + (hVar != null ? 1000000000 : 2000000000), true), kVar2);
        oVar.f17640e = true;
        oVar.f17641f = this;
        return oVar;
    }

    public final void c(j0 j0Var, ArrayList arrayList) {
        z0.e eVarY = j0Var.y();
        Object[] objArr = eVarY.f26372a;
        int i10 = eVarY.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            j0 j0Var2 = (j0) objArr[i11];
            if (j0Var2.I() && !j0Var2.Q) {
                if (j0Var2.F.d(8)) {
                    arrayList.add(r.a(j0Var2, this.f17637b));
                } else {
                    c(j0Var2, arrayList);
                }
            }
        }
    }

    public final g1 d() {
        if (!this.f17640e) {
            y1 y1VarF = f();
            return y1VarF != null ? i2.f.v(y1VarF, 8) : this.f17638c.F.f8664c;
        }
        o oVarL = l();
        if (oVarL != null) {
            return oVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (oVar.n()) {
                arrayList2.add(oVar);
            } else if (!oVar.f17639d.f17633d) {
                oVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final y1 f() {
        ?? F;
        boolean z10 = this.f17639d.f17632c;
        j0 j0Var = this.f17638c;
        ?? r52 = 0;
        r52 = 0;
        r52 = 0;
        r52 = 0;
        if (z10) {
            j1.p pVar = j0Var.F.f8667f;
            if ((pVar.f9693d & 8) != 0) {
                F = 0;
                while (pVar != null) {
                    if ((pVar.f9692c & 8) != 0) {
                        ?? F2 = pVar;
                        ?? eVar = 0;
                        while (F2 != 0) {
                            if (F2 instanceof y1) {
                                y1 y1Var = (y1) F2;
                                if (y1Var.h()) {
                                    if (y1Var.k0()) {
                                        return y1Var;
                                    }
                                    if (F == 0) {
                                        F = y1Var;
                                    }
                                }
                            } else if ((F2.f9692c & 8) != 0 && (F2 instanceof i2.n)) {
                                j1.p pVar2 = ((i2.n) F2).f8789p;
                                int i10 = 0;
                                F2 = F2;
                                eVar = eVar;
                                while (pVar2 != null) {
                                    if ((pVar2.f9692c & 8) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            F2 = pVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new z0.e(new j1.p[16]);
                                            }
                                            if (F2 != 0) {
                                                eVar.b(F2);
                                                F2 = 0;
                                            }
                                            eVar.b(pVar2);
                                        }
                                    }
                                    pVar2 = pVar2.f9695f;
                                    F2 = F2;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F2 = i2.f.f(eVar);
                        }
                    }
                    if ((pVar.f9693d & 8) == 0) {
                        break;
                    }
                    pVar = pVar.f9695f;
                    F = F;
                }
                r52 = F;
            }
        } else {
            j1.p pVar3 = j0Var.F.f8667f;
            if ((pVar3.f9693d & 8) != 0) {
                loop3: while (pVar3 != null) {
                    if ((pVar3.f9692c & 8) != 0) {
                        F = pVar3;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof y1) {
                                if (((y1) F).h()) {
                                    r52 = F;
                                }
                            } else if ((F.f9692c & 8) != 0 && (F instanceof i2.n)) {
                                j1.p pVar4 = ((i2.n) F).f8789p;
                                int i11 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (pVar4 != null) {
                                    if ((pVar4.f9692c & 8) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            F = pVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar4);
                                        }
                                    }
                                    pVar4 = pVar4.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = i2.f.f(eVar2);
                        }
                    }
                    if ((pVar3.f9693d & 8) == 0) {
                        break;
                    }
                    pVar3 = pVar3.f9695f;
                }
            }
        }
        return (y1) r52;
    }

    public final p1.c g() {
        g1 g1VarD = d();
        if (g1VarD != null) {
            if (!g1VarD.M0().f9703n) {
                g1VarD = null;
            }
            if (g1VarD != null) {
                return n1.i(g1VarD).s(g1VarD, true);
            }
        }
        return p1.c.f16482e;
    }

    public final p1.c h() {
        g1 g1VarD = d();
        if (g1VarD != null) {
            if (!g1VarD.M0().f9703n) {
                g1VarD = null;
            }
            if (g1VarD != null) {
                return n1.g(g1VarD);
            }
        }
        return p1.c.f16482e;
    }

    public final List i(boolean z10, boolean z11) {
        if (!z10 && this.f17639d.f17633d) {
            return vb.r.f22819a;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final k k() {
        boolean zN = n();
        k kVar = this.f17639d;
        if (!zN) {
            return kVar;
        }
        k kVarI = kVar.i();
        p(new ArrayList(), kVarI);
        return kVarI;
    }

    public final o l() {
        j0 j0VarV;
        o oVar = this.f17641f;
        if (oVar != null) {
            return oVar;
        }
        j0 j0Var = this.f17638c;
        boolean z10 = this.f17637b;
        if (z10) {
            j0VarV = j0Var.v();
            while (j0VarV != null) {
                k kVarX = j0VarV.x();
                if (kVarX != null && kVarX.f17632c) {
                    break;
                }
                j0VarV = j0VarV.v();
            }
            j0VarV = null;
        } else {
            j0VarV = null;
        }
        if (j0VarV == null) {
            j0 j0VarV2 = j0Var.v();
            while (true) {
                if (j0VarV2 == null) {
                    j0VarV = null;
                    break;
                }
                if (j0VarV2.F.d(8)) {
                    j0VarV = j0VarV2;
                    break;
                }
                j0VarV2 = j0VarV2.v();
            }
        }
        if (j0VarV == null) {
            return null;
        }
        return r.a(j0VarV, z10);
    }

    public final k m() {
        return this.f17639d;
    }

    public final boolean n() {
        return this.f17637b && this.f17639d.f17632c;
    }

    public final boolean o() {
        if (this.f17640e || !j(4, this).isEmpty()) {
            return false;
        }
        j0 j0VarV = this.f17638c.v();
        while (true) {
            if (j0VarV == null) {
                j0VarV = null;
                break;
            }
            k kVarX = j0VarV.x();
            if (kVarX != null && kVarX.f17632c) {
                break;
            }
            j0VarV = j0VarV.v();
        }
        return j0VarV == null;
    }

    public final void p(ArrayList arrayList, k kVar) {
        if (this.f17639d.f17633d) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            o oVar = (o) arrayList.get(size2);
            if (!oVar.n()) {
                kVar.k(oVar.f17639d);
                oVar.p(arrayList, kVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z10) {
        if (this.f17640e) {
            return vb.r.f22819a;
        }
        c(this.f17638c, arrayList);
        if (z10) {
            k kVar = this.f17639d;
            k0 k0Var = kVar.f17630a;
            Object objG = k0Var.g(t.f17693x);
            if (objG == null) {
                objG = null;
            }
            h hVar = (h) objG;
            if (hVar != null && kVar.f17632c && !arrayList.isEmpty()) {
                arrayList.add(b(hVar, new a0(4, hVar)));
            }
            w wVar = t.f17670a;
            if (k0Var.c(wVar) && !arrayList.isEmpty() && kVar.f17632c) {
                Object objG2 = k0Var.g(wVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) vb.m.a0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new c0.e(1, str)));
                }
            }
        }
        return arrayList;
    }
}
