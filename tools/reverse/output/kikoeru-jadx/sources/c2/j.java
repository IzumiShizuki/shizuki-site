package c2;

import i2.g1;
import i2.u1;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.p f3288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2.b f3289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.s f3290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g1 f3291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f3292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3295j;

    public j(j1.p pVar) {
        this.f3288c = pVar;
        d2.b bVar = new d2.b((byte) 0, 0);
        bVar.f5450c = new long[2];
        this.f3289d = bVar;
        this.f3290e = new o.s(2);
        this.f3294i = true;
        this.f3295j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030a  */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(o.s r53, g2.c0 r54, b7.n r55, boolean r56) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.j.a(o.s, g2.c0, b7.n, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // c2.k
    public final void b(b7.n nVar) {
        super.b(nVar);
        l lVar = this.f3292g;
        if (lVar == null) {
            return;
        }
        this.f3293h = this.f3294i;
        ?? r12 = lVar.f3309a;
        int size = ((Collection) r12).size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) r12.get(i10);
            boolean z10 = tVar.f3325d;
            long j10 = tVar.f3322a;
            boolean zB = nVar.b(j10);
            boolean z11 = this.f3294i;
            if ((!z10 && !zB) || (!z10 && !z11)) {
                this.f3289d.e(j10);
            }
        }
        this.f3294i = false;
        this.f3295j = lVar.f3313e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        z0.e eVar = this.f3307a;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j) objArr[i11]).c();
        }
        ?? F = this.f3288c;
        ?? eVar2 = 0;
        while (F != 0) {
            if (F instanceof u1) {
                ((u1) F).z();
            } else if ((F.f9692c & 16) != 0 && (F instanceof i2.n)) {
                j1.p pVar = ((i2.n) F).f8789p;
                int i12 = 0;
                F = F;
                eVar2 = eVar2;
                while (pVar != null) {
                    if ((pVar.f9692c & 16) != 0) {
                        i12++;
                        eVar2 = eVar2;
                        if (i12 == 1) {
                            F = pVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new z0.e(new j1.p[16]);
                            }
                            if (F != 0) {
                                eVar2.b(F);
                                F = 0;
                            }
                            eVar2.b(pVar);
                        }
                    }
                    pVar = pVar.f9695f;
                    F = F;
                    eVar2 = eVar2;
                }
                if (i12 == 1) {
                }
            }
            F = i2.f.f(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(b7.n nVar) {
        o.s sVar = this.f3290e;
        boolean z10 = false;
        z10 = false;
        if (sVar.i() != 0) {
            j1.p pVar = this.f3288c;
            if (pVar.f9703n) {
                l lVar = this.f3292g;
                jc.l.b(lVar);
                g1 g1Var = this.f3291f;
                jc.l.b(g1Var);
                long j10 = g1Var.f7182c;
                ?? F = pVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof u1) {
                        ((u1) F).j(lVar, m.f3316c, j10);
                    } else if ((F.f9692c & 16) != 0 && (F instanceof i2.n)) {
                        j1.p pVar2 = ((i2.n) F).f8789p;
                        int i10 = 0;
                        F = F;
                        eVar = eVar;
                        while (pVar2 != null) {
                            if ((pVar2.f9692c & 16) != 0) {
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
                if (pVar.f9703n) {
                    z0.e eVar2 = this.f3307a;
                    Object[] objArr = eVar2.f26372a;
                    int i11 = eVar2.f26374c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((j) objArr[i12]).d(nVar);
                    }
                }
                z10 = true;
            }
        }
        b(nVar);
        sVar.b();
        this.f3291f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(b7.n nVar, boolean z10) {
        if (this.f3290e.i() == 0) {
            return false;
        }
        ?? F = this.f3288c;
        if (!F.f9703n) {
            return false;
        }
        l lVar = this.f3292g;
        jc.l.b(lVar);
        g1 g1Var = this.f3291f;
        jc.l.b(g1Var);
        long j10 = g1Var.f7182c;
        ?? F2 = F;
        ?? eVar = 0;
        while (F2 != 0) {
            if (F2 instanceof u1) {
                ((u1) F2).j(lVar, m.f3314a, j10);
            } else if ((F2.f9692c & 16) != 0 && (F2 instanceof i2.n)) {
                j1.p pVar = ((i2.n) F2).f8789p;
                int i10 = 0;
                F2 = F2;
                eVar = eVar;
                while (pVar != null) {
                    if ((pVar.f9692c & 16) != 0) {
                        i10++;
                        eVar = eVar;
                        if (i10 == 1) {
                            F2 = pVar;
                        } else {
                            if (eVar == 0) {
                                eVar = new z0.e(new j1.p[16]);
                            }
                            if (F2 != 0) {
                                eVar.b(F2);
                                F2 = 0;
                            }
                            eVar.b(pVar);
                        }
                    }
                    pVar = pVar.f9695f;
                    F2 = F2;
                    eVar = eVar;
                }
                if (i10 == 1) {
                }
            }
            F2 = i2.f.f(eVar);
        }
        if (F.f9703n) {
            z0.e eVar2 = this.f3307a;
            Object[] objArr = eVar2.f26372a;
            int i11 = eVar2.f26374c;
            for (int i12 = 0; i12 < i11; i12++) {
                j jVar = (j) objArr[i12];
                jc.l.b(this.f3291f);
                jVar.e(nVar, z10);
            }
        }
        if (F.f9703n) {
            ?? eVar3 = 0;
            while (F != 0) {
                if (F instanceof u1) {
                    ((u1) F).j(lVar, m.f3315b, j10);
                } else if ((F.f9692c & 16) != 0 && (F instanceof i2.n)) {
                    j1.p pVar2 = ((i2.n) F).f8789p;
                    int i13 = 0;
                    F = F;
                    eVar3 = eVar3;
                    while (pVar2 != null) {
                        if ((pVar2.f9692c & 16) != 0) {
                            i13++;
                            eVar3 = eVar3;
                            if (i13 == 1) {
                                F = pVar2;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new z0.e(new j1.p[16]);
                                }
                                if (F != 0) {
                                    eVar3.b(F);
                                    F = 0;
                                }
                                eVar3.b(pVar2);
                            }
                        }
                        pVar2 = pVar2.f9695f;
                        F = F;
                        eVar3 = eVar3;
                    }
                    if (i13 == 1) {
                    }
                }
                F = i2.f.f(eVar3);
            }
        }
        return true;
    }

    public final void f(long j10, o.g0 g0Var) {
        d2.b bVar = this.f3289d;
        if (bVar.c(j10) && g0Var.f(this) < 0) {
            bVar.e(j10);
            this.f3290e.h(j10);
        }
        z0.e eVar = this.f3307a;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((j) objArr[i11]).f(j10, g0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f3288c + ", children=" + this.f3307a + ", pointerIds=" + this.f3289d + ')';
    }
}
