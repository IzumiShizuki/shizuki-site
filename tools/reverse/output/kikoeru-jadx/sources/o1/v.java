package o1;

import android.os.Trace;
import b0.s1;
import i2.d1;
import i2.j0;
import i2.k1;
import j2.l1;
import jc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends j1.p implements i2.l, k1, h2.e, i2.m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ic.n f16132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16135r;

    public v(int i10, ic.n nVar, int i11) {
        i10 = (i11 & 1) != 0 ? 1 : i10;
        this.f16132o = (i11 & 2) != 0 ? null : nVar;
        this.f16135r = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void B0(u uVar, u uVar2) {
        d1 d1Var;
        ic.n nVar;
        k kVar = (k) ((j2.v) i2.f.z(this)).getFocusOwner();
        v vVar = kVar.f16104h;
        if (!uVar.equals(uVar2) && (nVar = this.f16132o) != null) {
            nVar.q(uVar, uVar2);
        }
        j1.p pVar = this.f9690a;
        if (!pVar.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar2 = this.f9690a;
        j0 j0VarY = i2.f.y(this);
        while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 5120) != 0) {
                while (pVar2 != null) {
                    int i10 = pVar2.f9692c;
                    if ((i10 & 5120) != 0) {
                        if (pVar2 != pVar && (i10 & 1024) != 0) {
                            return;
                        }
                        if ((i10 & 4096) != 0) {
                            ?? F = pVar2;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof e) {
                                    e eVar2 = (e) F;
                                    if (vVar == kVar.f16104h) {
                                        eVar2.o(uVar2);
                                    }
                                } else if ((F.f9692c & 4096) != 0 && (F instanceof i2.n)) {
                                    j1.p pVar3 = ((i2.n) F).f8789p;
                                    int i11 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f9692c & 4096) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                F = i2.f.f(eVar);
                            }
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
    /* JADX WARN: Type inference failed for: r6v10, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final n C0() {
        boolean z10;
        d1 d1Var;
        n nVar = new n();
        nVar.f16109a = true;
        r rVar = r.f16122b;
        nVar.f16110b = rVar;
        nVar.f16111c = rVar;
        nVar.f16112d = rVar;
        nVar.f16113e = rVar;
        nVar.f16114f = rVar;
        nVar.f16115g = rVar;
        nVar.f16116h = rVar;
        nVar.f16117i = rVar;
        nVar.f16118j = m.f16105c;
        nVar.f16119k = m.f16106d;
        int i10 = this.f16135r;
        if (i10 == 1) {
            z10 = true;
        } else if (i10 == 0) {
            z10 = !(((z1.a) ((z1.c) ((z1.b) i2.f.i(this, l1.f9871m))).f26377a.getValue()).f26376a == 1);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z10 = false;
        }
        nVar.f16109a = z10;
        j1.p pVar = this.f9690a;
        if (!pVar.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar2 = this.f9690a;
        j0 j0VarY = i2.f.y(this);
        loop0: while (j0VarY != null) {
            if ((j0VarY.F.f8667f.f9693d & 3072) != 0) {
                while (pVar2 != null) {
                    int i11 = pVar2.f9692c;
                    if ((i11 & 3072) != 0) {
                        if (pVar2 != pVar && (i11 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i11 & 2048) != 0) {
                            ?? F = pVar2;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof p) {
                                    ((p) F).Y(nVar);
                                } else if ((F.f9692c & 2048) != 0 && (F instanceof i2.n)) {
                                    j1.p pVar3 = ((i2.n) F).f8789p;
                                    int i12 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (pVar3 != null) {
                                        if ((pVar3.f9692c & 2048) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
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
                                    if (i12 == 1) {
                                    }
                                }
                                F = i2.f.f(eVar);
                            }
                        }
                    }
                    pVar2 = pVar2.f9694e;
                }
            }
            j0VarY = j0VarY.v();
            pVar2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
        }
        return nVar;
    }

    public final u D0() {
        k kVar;
        v vVar;
        d1 d1Var;
        boolean z10 = this.f9703n;
        u uVar = u.f16130d;
        if (!z10 || (vVar = (kVar = (k) ((j2.v) i2.f.z(this)).getFocusOwner()).f16104h) == null) {
            return uVar;
        }
        if (this == vVar) {
            kVar.getClass();
            return u.f16127a;
        }
        if (vVar.f9703n) {
            if (!vVar.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar = vVar.f9690a.f9694e;
            j0 j0VarY = i2.f.y(vVar);
            while (j0VarY != null) {
                if ((j0VarY.F.f8667f.f9693d & 1024) != 0) {
                    while (pVar != null) {
                        if ((pVar.f9692c & 1024) != 0) {
                            j1.p pVarF = pVar;
                            z0.e eVar = null;
                            while (pVarF != null) {
                                if (pVarF instanceof v) {
                                    if (this == ((v) pVarF)) {
                                        return u.f16128b;
                                    }
                                } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                    int i10 = 0;
                                    for (j1.p pVar2 = ((i2.n) pVarF).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                        if ((pVar2.f9692c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                pVarF = pVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    eVar.b(pVarF);
                                                    pVarF = null;
                                                }
                                                eVar.b(pVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                pVarF = i2.f.f(eVar);
                            }
                        }
                        pVar = pVar.f9694e;
                    }
                }
                j0VarY = j0VarY.v();
                pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
            }
        }
        return uVar;
    }

    public final void E0() {
        int iOrdinal = D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ce.j0();
                }
                return;
            }
        }
        y yVar = new y();
        i2.f.t(this, new s1(13, yVar, this));
        Object obj = yVar.f10838a;
        if (obj == null) {
            jc.l.k("focusProperties");
            throw null;
        }
        if (((l) obj).a()) {
            return;
        }
        ((k) ((j2.v) i2.f.z(this)).getFocusOwner()).b(true, 8, true);
    }

    public final boolean F0(int i10) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zV = false;
            if (!C0().f16109a) {
                Trace.endSection();
                return false;
            }
            int iOrdinal = f.u(this, i10).ordinal();
            if (iOrdinal == 0) {
                zV = f.v(this);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    zV = true;
                } else if (iOrdinal != 3) {
                    throw new ce.j0();
                }
            }
            return zV;
        } finally {
            Trace.endSection();
        }
    }

    @Override // h2.e
    public final /* synthetic */ a2.c K() {
        return h2.b.f8105d;
    }

    @Override // i2.k1
    public final void W() {
        E0();
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // h2.f
    public final /* synthetic */ Object s(h2.g gVar) {
        return a0.c.a(this, gVar);
    }

    @Override // j1.p
    public final void t0() {
        int iOrdinal = D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ce.j0();
                }
                return;
            }
        }
        k kVar = (k) ((j2.v) i2.f.z(this)).getFocusOwner();
        kVar.b(true, 8, false);
        kVar.f16100d.a();
    }

    @Override // j1.p
    public final void v0() {
        if (D0().b()) {
            ((k) ((j2.v) i2.f.z(this)).getFocusOwner()).b(true, 8, true);
        }
    }
}
