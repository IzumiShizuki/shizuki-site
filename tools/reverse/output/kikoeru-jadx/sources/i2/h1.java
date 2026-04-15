package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o.f0 f8724a;

    static {
        o.f0 f0Var = o.p0.f16030a;
        f8724a = new o.f0();
    }

    public static final void a(j1.p pVar, int i10, int i11) {
        if (!(pVar instanceof n)) {
            b(pVar, i10 & pVar.f9692c, i11);
            return;
        }
        n nVar = (n) pVar;
        int i12 = nVar.f8788o;
        b(pVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (j1.p pVar2 = nVar.f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
            a(pVar2, i13, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(j1.p pVar, int i10, int i11) {
        if (i11 != 0 || pVar.o0()) {
            if ((i10 & 2) != 0 && (pVar instanceof z)) {
                f.n((z) pVar);
                if (i11 == 2) {
                    f.v(pVar, 2).Z0();
                }
            }
            if ((i10 & 128) != 0 && (pVar instanceof y) && i11 != 2) {
                f.y(pVar).E();
            }
            if ((i10 & 256) != 0 && (pVar instanceof q)) {
                if (i11 == 1) {
                    j0 j0VarY = f.y(pVar);
                    j0VarY.e0(j0VarY.P + 1);
                } else if (i11 == 2) {
                    f.y(pVar).e0(r0.P - 1);
                }
                if (i11 != 2) {
                    j0 j0VarY2 = f.y(pVar);
                    if (j0VarY2.P != 0 && !j0VarY2.p() && !j0VarY2.r() && !j0VarY2.O) {
                        j2.v vVar = (j2.v) m0.a(j0VarY2);
                        androidx.media3.exoplayer.offline.u uVar = vVar.P.f8901e;
                        uVar.getClass();
                        if (j0VarY2.P > 0) {
                            ((z0.e) uVar.f968b).b(j0VarY2);
                            j0VarY2.O = true;
                        }
                        vVar.K(null);
                    }
                }
            }
            if ((i10 & 4) != 0 && (pVar instanceof p)) {
                f.m((p) pVar);
            }
            if ((i10 & 8) != 0 && (pVar instanceof y1)) {
                f.y(pVar).f8759r = true;
            }
            if ((i10 & 64) != 0 && (pVar instanceof s1)) {
                n0 n0Var = f.y((s1) pVar).G;
                n0Var.f8805p.f8920r = true;
                v0 v0Var = n0Var.f8806q;
                if (v0Var != null) {
                    v0Var.f8878w = true;
                }
            }
            if ((i10 & 2048) != 0 && (pVar instanceof o1.p)) {
                o1.p pVar2 = (o1.p) pVar;
                g.f8698b = null;
                pVar2.Y(g.f8697a);
                if (g.f8698b != null) {
                    j1.p pVar3 = (j1.p) pVar2;
                    if (!pVar3.f9690a.f9703n) {
                        f2.a.b("visitChildren called on an unattached node");
                    }
                    z0.e eVar = new z0.e(new j1.p[16]);
                    j1.p pVar4 = pVar3.f9690a;
                    j1.p pVar5 = pVar4.f9695f;
                    if (pVar5 == null) {
                        f.b(eVar, pVar4);
                    } else {
                        eVar.b(pVar5);
                    }
                    while (true) {
                        int i12 = eVar.f26374c;
                        if (i12 == 0) {
                            break;
                        }
                        j1.p pVarF = (j1.p) eVar.k(i12 - 1);
                        if ((pVarF.f9693d & 1024) == 0) {
                            f.b(eVar, pVarF);
                        } else {
                            while (true) {
                                if (pVarF == null) {
                                    break;
                                }
                                if ((pVarF.f9692c & 1024) != 0) {
                                    z0.e eVar2 = null;
                                    while (pVarF != null) {
                                        if (pVarF instanceof o1.v) {
                                            o1.v vVar2 = (o1.v) pVarF;
                                            o1.g gVar = ((o1.k) ((j2.v) f.z(vVar2)).getFocusOwner()).f16100d;
                                            if (gVar.f16090c.a(vVar2)) {
                                                gVar.a();
                                            }
                                        } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof n)) {
                                            int i13 = 0;
                                            for (j1.p pVar6 = ((n) pVarF).f8789p; pVar6 != null; pVar6 = pVar6.f9695f) {
                                                if ((pVar6.f9692c & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        pVarF = pVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new z0.e(new j1.p[16]);
                                                        }
                                                        if (pVarF != null) {
                                                            eVar2.b(pVarF);
                                                            pVarF = null;
                                                        }
                                                        eVar2.b(pVar6);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        pVarF = f.f(eVar2);
                                    }
                                } else {
                                    pVarF = pVarF.f9695f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) == 0 || !(pVar instanceof o1.e)) {
                return;
            }
            o1.e eVar3 = (o1.e) pVar;
            o1.g gVar2 = ((o1.k) ((j2.v) f.z(eVar3)).getFocusOwner()).f16100d;
            if (gVar2.f16091d.a(eVar3)) {
                gVar2.a();
            }
        }
    }

    public static final void c(j1.p pVar) {
        if (!pVar.f9703n) {
            f2.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(pVar, -1, 0);
    }

    public static final int d(j1.o oVar) {
        int i10 = oVar instanceof g2.f0 ? 3 : 1;
        if (oVar instanceof s.p0) {
            i10 |= 4;
        }
        if (oVar instanceof q2.l) {
            i10 |= 8;
        }
        if (oVar instanceof c2.z) {
            i10 |= 16;
        }
        if ((oVar instanceof h2.c) || (oVar instanceof y.s0)) {
            i10 |= 32;
        }
        if (oVar instanceof b0.e) {
            i10 |= 256;
        }
        if (oVar instanceof q.i) {
            i10 |= 64;
        }
        return oVar instanceof n2.a ? 524288 | i10 : i10;
    }

    public static final int e(j1.p pVar) {
        int i10 = pVar.f9692c;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = pVar.getClass();
        o.f0 f0Var = f8724a;
        int iD = f0Var.d(cls);
        if (iD >= 0) {
            return f0Var.f15955c[iD];
        }
        int i11 = pVar instanceof z ? 3 : 1;
        if (pVar instanceof p) {
            i11 |= 4;
        }
        if (pVar instanceof y1) {
            i11 |= 8;
        }
        if (pVar instanceof u1) {
            i11 |= 16;
        }
        if (pVar instanceof h2.e) {
            i11 |= 32;
        }
        if (pVar instanceof s1) {
            i11 |= 64;
        }
        if (pVar instanceof y) {
            i11 |= 128;
        }
        if (pVar instanceof q) {
            i11 |= 256;
        }
        if (pVar instanceof q.e1) {
            i11 |= 512;
        }
        if (pVar instanceof o1.v) {
            i11 |= 1024;
        }
        if (pVar instanceof o1.p) {
            i11 |= 2048;
        }
        if (pVar instanceof o1.e) {
            i11 |= 4096;
        }
        if (pVar instanceof a2.d) {
            i11 |= 8192;
        }
        if (pVar instanceof e2.a) {
            i11 |= 16384;
        }
        if (pVar instanceof l) {
            i11 |= 32768;
        }
        if (pVar instanceof d2) {
            i11 |= 262144;
        }
        if (pVar instanceof n2.a) {
            i11 |= 524288;
        }
        f0Var.h(i11, cls);
        return i11;
    }

    public static final int f(j1.p pVar) {
        if (!(pVar instanceof n)) {
            return e(pVar);
        }
        n nVar = (n) pVar;
        int iF = nVar.f8788o;
        for (j1.p pVar2 = nVar.f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
            iF |= f(pVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
