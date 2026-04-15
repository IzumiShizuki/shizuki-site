package g2;

import i2.c2;
import i2.d2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.z f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f7251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7252c;

    public o0(p0 p0Var, Object obj) {
        this.f7251b = p0Var;
        this.f7252c = obj;
        int[] iArr = o.o.f16027a;
        this.f7250a = new o.z();
    }

    @Override // g2.o1
    public final void a() {
        p0 p0Var = this.f7251b;
        i2.j0 j0Var = p0Var.f7253a;
        p0Var.d();
        i2.j0 j0Var2 = (i2.j0) p0Var.f7262j.k(this.f7252c);
        if (j0Var2 != null) {
            if (p0Var.f7267o <= 0) {
                f2.a.b("No pre-composed items to dispose");
            }
            int i10 = ((z0.b) j0Var.o()).f26366a.i(j0Var2);
            if (i10 < ((z0.b) j0Var.o()).f26366a.f26374c - p0Var.f7267o) {
                f2.a.b("Item is not in pre-composed item range");
            }
            p0Var.f7266n++;
            p0Var.f7267o--;
            i0 i0Var = (i0) p0Var.f7258f.g(j0Var2);
            if (i0Var != null) {
                i0Var.getClass();
            }
            int i11 = (((z0.b) j0Var.o()).f26366a.f26374c - p0Var.f7267o) - p0Var.f7266n;
            j0Var.f8758q = true;
            j0Var.M(i10, i11, 1);
            j0Var.f8758q = false;
            p0Var.c(i11);
        }
    }

    @Override // g2.o1
    public final int b() {
        i2.j0 j0Var = (i2.j0) this.f7251b.f7262j.g(this.f7252c);
        if (j0Var != null) {
            return ((z0.b) j0Var.n()).f26366a.f26374c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [b0.u1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // g2.o1
    public final void c(b0.u1 u1Var) {
        i2.d1 d1Var;
        j1.p pVar;
        c2 c2Var;
        i2.j0 j0Var = (i2.j0) this.f7251b.f7262j.g(this.f7252c);
        if (j0Var == null || (d1Var = j0Var.F) == null || (pVar = d1Var.f8667f) == null) {
            return;
        }
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.e eVar = new z0.e(new j1.p[16]);
        j1.p pVar2 = pVar.f9690a;
        j1.p pVar3 = pVar2.f9695f;
        if (pVar3 == null) {
            i2.f.b(eVar, pVar2);
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
                                d2 d2Var = (d2) F;
                                boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(d2Var.k());
                                c2 c2Var2 = c2.f8658b;
                                if (zEquals) {
                                    u1Var.a(d2Var);
                                    c2Var = c2Var2;
                                } else {
                                    c2Var = c2.f8657a;
                                }
                                if (c2Var == c2.f8659c) {
                                    return;
                                }
                                if (c2Var == c2Var2) {
                                    break;
                                }
                            } else if ((F.f9692c & 262144) != 0 && (F instanceof i2.n)) {
                                j1.p pVar6 = ((i2.n) F).f8789p;
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
                            F = i2.f.f(eVar2);
                        }
                    }
                }
            }
            i2.f.b(eVar, pVar4);
        }
    }

    @Override // g2.o1
    public final void d(int i10, long j10) {
        p0 p0Var = this.f7251b;
        i2.j0 j0Var = (i2.j0) p0Var.f7262j.g(this.f7252c);
        if (j0Var == null || !j0Var.I()) {
            return;
        }
        int i11 = ((z0.b) j0Var.n()).f26366a.f26374c;
        if (i10 < 0 || i10 >= i11) {
            f2.a.d("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (j0Var.J()) {
            f2.a.a("Pre-measure called on node that is not placed");
        }
        i2.j0 j0Var2 = p0Var.f7253a;
        j0Var2.f8758q = true;
        ((j2.v) i2.m0.a(j0Var)).z((i2.j0) ((z0.b) j0Var.n()).get(i10), j10);
        j0Var2.f8758q = false;
        this.f7250a.a(i10);
    }
}
