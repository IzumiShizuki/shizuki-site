package s;

import b0.s1;
import i2.d2;
import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends i2.n implements y1, i2.q, i2.l, i2.k1, d2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z0 f19105x = new z0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public w.k f19106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ic.k f19107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w.f f19108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b0.v0 f19109t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i2.g1 f19110u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o1.v f19111v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r2.a f19112w;

    public b0(w.k kVar, int i10, de.h hVar) {
        this.f19106q = kVar;
        this.f19107r = hVar;
        o1.v vVar = new o1.v(i10, new c0.x(2, this, b0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 4), 4);
        B0(vVar);
        this.f19111v = vVar;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    public final void E0(w.k kVar, w.j jVar) {
        if (!this.f9703n) {
            kVar.b(jVar);
            return;
        }
        hf.d1 d1Var = (hf.d1) ((nf.d) n0()).f15823a.R(hf.v.f8599b);
        hf.a0.y(n0(), null, null, new q.q(kVar, jVar, d1Var != null ? d1Var.B(new r.p1(6, kVar, jVar)) : null, null, 5), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
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
    /* JADX WARN: Type inference failed for: r6v6 */
    public final c0 F0() {
        d2 d2Var;
        i2.d1 d1Var;
        if (this.f9703n) {
            if (!this.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar = this.f9690a.f9694e;
            i2.j0 j0VarY = i2.f.y(this);
            loop0: while (true) {
                if (j0VarY == null) {
                    d2Var = null;
                    break;
                }
                if ((j0VarY.F.f8667f.f9693d & 262144) != 0) {
                    while (pVar != null) {
                        if ((pVar.f9692c & 262144) != 0) {
                            ?? F = pVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof d2) {
                                    d2Var = (d2) F;
                                    if (c0.f19116p.equals(d2Var.k())) {
                                        break loop0;
                                    }
                                } else if ((F.f9692c & 262144) != 0 && (F instanceof i2.n)) {
                                    j1.p pVar2 = ((i2.n) F).f8789p;
                                    int i10 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar2 != null) {
                                        if ((pVar2.f9692c & 262144) != 0) {
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
                        pVar = pVar.f9694e;
                    }
                }
                j0VarY = j0VarY.v();
                pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
            }
            if (d2Var instanceof c0) {
                return (c0) d2Var;
            }
        }
        return null;
    }

    public final void G0(w.k kVar) {
        w.f fVar;
        if (jc.l.a(this.f19106q, kVar)) {
            return;
        }
        w.k kVar2 = this.f19106q;
        if (kVar2 != null && (fVar = this.f19108s) != null) {
            kVar2.b(new w.g(fVar));
        }
        this.f19108s = null;
        this.f19106q = kVar;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        boolean zB = this.f19111v.D0().b();
        pc.u[] uVarArr = q2.v.f17698a;
        q2.w wVar = q2.t.f17680k;
        pc.u uVar = q2.v.f17698a[4];
        wVar.a(kVar, Boolean.valueOf(zB));
        if (this.f19112w == null) {
            this.f19112w = new r2.a(3, this);
        }
        kVar.l(q2.j.f17625v, new q2.a(null, this.f19112w));
    }

    @Override // i2.k1
    public final void W() {
        jc.y yVar = new jc.y();
        i2.f.t(this, new s1(16, yVar, this));
        b0.v0 v0Var = (b0.v0) yVar.f10838a;
        if (this.f19111v.D0().b()) {
            b0.v0 v0Var2 = this.f19109t;
            if (v0Var2 != null) {
                v0Var2.b();
            }
            if (v0Var != null) {
                v0Var.a();
            } else {
                v0Var = null;
            }
            this.f19109t = v0Var;
        }
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.d2
    public final Object k() {
        return f19105x;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // i2.q
    public final void u(i2.g1 g1Var) {
        c0 c0VarF0;
        this.f19110u = g1Var;
        if (this.f19111v.D0().b()) {
            if (!g1Var.M0().f9703n) {
                c0 c0VarF02 = F0();
                if (c0VarF02 != null) {
                    c0VarF02.B0(null);
                    return;
                }
                return;
            }
            i2.g1 g1Var2 = this.f19110u;
            if (g1Var2 == null || !g1Var2.M0().f9703n || (c0VarF0 = F0()) == null) {
                return;
            }
            c0VarF0.B0(this.f19110u);
        }
    }

    @Override // j1.p
    public final void v0() {
        b0.v0 v0Var = this.f19109t;
        if (v0Var != null) {
            v0Var.b();
        }
        this.f19109t = null;
    }
}
