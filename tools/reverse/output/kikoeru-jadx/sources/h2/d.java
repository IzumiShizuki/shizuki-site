package h2;

import b0.d0;
import i2.j0;
import i2.n;
import j1.p;
import j2.v;
import java.util.HashSet;
import o.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.e f8107b = new z0.e(new i2.c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.e f8108c = new z0.e(new g[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0.e f8109d = new z0.e(new j0[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0.e f8110e = new z0.e(new g[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8111f;

    public d(v vVar) {
        this.f8106a = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public static void b(p pVar, g gVar, HashSet hashSet) {
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.e eVar = new z0.e(new p[16]);
        p pVar2 = pVar.f9690a;
        p pVar3 = pVar2.f9695f;
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
            p pVar4 = (p) eVar.k(i10 - 1);
            if ((pVar4.f9693d & 32) != 0) {
                for (p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f9695f) {
                    if ((pVar5.f9692c & 32) != 0) {
                        ?? F = pVar5;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof e) {
                                e eVar3 = (e) F;
                                if (eVar3 instanceof i2.c) {
                                    i2.c cVar = (i2.c) eVar3;
                                    if ((cVar.f8654o instanceof c) && cVar.f8656q.contains(gVar)) {
                                        hashSet.add(eVar3);
                                    }
                                }
                                if (eVar3.K().C(gVar)) {
                                    break;
                                }
                            } else if ((F.f9692c & 32) != 0 && (F instanceof n)) {
                                p pVar6 = ((n) F).f8789p;
                                int i11 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (pVar6 != null) {
                                    if ((pVar6.f9692c & 32) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            F = pVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new p[16]);
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

    public final void a() {
        if (this.f8111f) {
            return;
        }
        this.f8111f = true;
        d0 d0Var = new d0(12, this);
        g0 g0Var = this.f8106a.N0;
        if (g0Var.f(d0Var) >= 0) {
            return;
        }
        g0Var.a(d0Var);
    }
}
