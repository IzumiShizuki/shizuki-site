package l0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import j2.v2;
import j2.z2;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.c f11643a = new p1.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static q1.f f11644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q1.b f11645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s1.b f11646d;

    public static final void a(o oVar, j1.d dVar, f1.f fVar, x0.o oVar2, int i10) {
        int i11;
        oVar2.Y(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? oVar2.f(oVar) : oVar2.h(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.f(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.h(fVar) ? 256 : 128;
        }
        boolean z10 = true;
        if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !oVar2.f(oVar))) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objK = oVar2.K();
            if (z12 || objK == x0.k.f24334a) {
                objK = new k(dVar, oVar);
                oVar2.h0(objK);
            }
            j3.j.a((k) objK, null, new j3.y(false, j3.z.f10198a, false), fVar, oVar2, ((i11 << 3) & 7168) | 384, 2);
        } else {
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l0(oVar, dVar, fVar, i10, 3);
        }
    }

    public static final void b(j1.q qVar, f1.f fVar, x0.o oVar, int i10, int i11) {
        int i12;
        f1.f fVar2;
        x0.o oVar2;
        oVar.Y(-1075498320);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (oVar.f(qVar) ? 4 : 2) | i10;
        }
        if (oVar.N(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            j1.q qVar2 = qVar;
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v(null);
                oVar.h0(objK);
            }
            x0.w0 w0Var = (x0.w0) objK;
            r rVar = (r) w0Var.getValue();
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new cg.c(w0Var, 5);
                oVar.h0(objK2);
            }
            fVar2 = fVar;
            oVar2 = oVar;
            c(qVar2, rVar, (ic.k) objK2, fVar2, oVar2, (i12 & 14) | 3456);
            qVar = qVar2;
        } else {
            fVar2 = fVar;
            oVar2 = oVar;
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.l0(qVar, fVar2, i10, i11);
        }
    }

    public static final void c(j1.q qVar, r rVar, ic.k kVar, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(2078139907);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(kVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(fVar) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            a1 a1Var = (a1) g1.l.d(new Object[0], a1.f11409l, b0.f11425c, oVar, 3072, 4);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = new s0(a1Var);
                oVar.h0(objK);
            }
            s0 s0Var = (s0) objK;
            Object obj2 = (j2.g1) oVar.j(j2.l1.f9864f);
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = x0.v.m(oVar);
                oVar.h0(objK2);
            }
            Object obj3 = (hf.y) objK2;
            s0Var.f11615e = (y1.a) oVar.j(j2.l1.f9870l);
            boolean zF = oVar.f(obj3) | oVar.f(obj2);
            Object objK3 = oVar.K();
            if (zF || objK3 == obj) {
                objK3 = new b0.o1(23, obj3, obj2);
                oVar.h0(objK3);
            }
            s0Var.f11616f = (ic.k) objK3;
            s0Var.f11617g = (v2) oVar.j(j2.l1.f9875q);
            s0Var.f11614d = new b0.o1(24, s0Var, kVar);
            s0Var.m(rVar);
            da.a0 a0Var = new da.a0(3, s0Var, new x(s0Var, 3));
            j1.q qVarA = j1.n.f9689a;
            j1.q qVarA2 = androidx.compose.ui.input.key.a.a(c2.e0.a(androidx.compose.foundation.a.g(androidx.compose.ui.focus.a.c(androidx.compose.ui.focus.a.b(androidx.compose.ui.layout.a.d(c2.e0.a(qVarA, ub.a0.f21526a, a0Var), new z(s0Var, 4)), s0Var.f11618h), new z(s0Var, 5)), true, null), 8675309, new h0(new z(s0Var, 6), 0)), new z(s0Var, 7));
            if (s0Var.d() != null && s0Var.g()) {
                r rVarE = s0Var.e();
                if (!(rVarE != null ? jc.l.a(rVarE.f11602a, rVarE.f11603b) : true) && s.u0.a()) {
                    qVarA = j1.a.a(qVarA, new cg.m0(5, s0Var));
                }
            }
            f(qVar.e(qVarA2.e(qVarA)), f1.g.f(-1869667463, new y(s0Var, a1Var, fVar), oVar), oVar, 48);
            boolean zH = oVar.h(s0Var);
            Object objK4 = oVar.K();
            if (zH || objK4 == obj) {
                objK4 = new z(s0Var, 0);
                oVar.h0(objK4);
            }
            x0.v.c(s0Var, (ic.k) objK4, oVar);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a0(qVar, rVar, kVar, fVar, i10);
        }
    }

    public static final void d(o oVar, boolean z10, e3.j jVar, boolean z11, long j10, float f10, SuspendPointerInputElement suspendPointerInputElement, x0.o oVar2, int i10) {
        int i11;
        long j11;
        int i12;
        long j12;
        boolean z12;
        oVar2.Y(-466280168);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? oVar2.f(oVar) : oVar2.h(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.f(jVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.g(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= oVar2.f(suspendPointerInputElement) ? 1048576 : 524288;
        }
        if (oVar2.N(i11 & 1, (533651 & i11) != 533650)) {
            oVar2.S();
            if ((i10 & 1) == 0 || oVar2.x()) {
                i12 = i11 & (-57345);
                j12 = 9205357640488583168L;
            } else {
                oVar2.Q();
                i12 = i11 & (-57345);
                j12 = j10;
            }
            oVar2.q();
            e3.j jVar2 = e3.j.f6079b;
            e3.j jVar3 = e3.j.f6078a;
            if (z10) {
                float f11 = k0.f11520a;
                z12 = (jVar == jVar3 && !z11) || (jVar == jVar2 && z11);
            } else {
                float f12 = k0.f11520a;
                z12 = !((jVar == jVar3 && !z11) || (jVar == jVar2 && z11));
            }
            j1.e eVar = z12 ? j1.a.f9660b : j1.a.f9659a;
            int i13 = i12 & 14;
            boolean zG = (i13 == 4 || ((i12 & 8) != 0 && oVar2.h(oVar))) | ((i12 & 112) == 32) | oVar2.g(z12);
            Object objK = oVar2.K();
            if (zG || objK == x0.k.f24334a) {
                objK = new e(oVar, z10, z12);
                oVar2.h0(objK);
            }
            long j13 = j12;
            j1.e eVar2 = eVar;
            j11 = j13;
            a(oVar, eVar2, f1.g.f(1365123137, new c((z2) oVar2.j(j2.l1.f9877s), j11, z12, q2.m.a(suspendPointerInputElement, false, (ic.k) objK), oVar), oVar2), oVar2, i13 | 384);
        } else {
            oVar2.Q();
            j11 = j10;
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d(oVar, z10, jVar, z11, j11, f10, suspendPointerInputElement, i10);
        }
    }

    public static final void e(j1.q qVar, ic.a aVar, boolean z10, x0.o oVar, int i10) {
        int i11;
        oVar.Y(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (oVar.h(aVar) ? 32 : 16) | (oVar.g(z10) ? 256 : 128);
        if (oVar.N(i12 & 1, (i12 & 147) != 146)) {
            y.d.d(j1.a.a(androidx.compose.foundation.layout.c.k(qVar, k0.f11520a, k0.f11521b), new g(aVar, z10, 0)), oVar);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l(qVar, aVar, z10, i10);
        }
    }

    public static final void f(j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(-2105228848);
        int i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVar, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, c1.f11436a, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            fVar.q(oVar, 6);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new d1(qVar, fVar, i10, 0);
        }
    }

    public static final void g(boolean z10, e3.j jVar, l1 l1Var, x0.o oVar, int i10) {
        int i11;
        h0.r1 r1VarD;
        oVar.Y(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (oVar.g(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(jVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(l1Var) ? 256 : 128;
        }
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            int i12 = i11 & 14;
            boolean zF = (i12 == 4) | oVar.f(l1Var);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (zF || objK == obj) {
                objK = new r0(l1Var, z10);
                oVar.h0(objK);
            }
            h0.c1 c1Var = (h0.c1) objK;
            boolean zH = oVar.h(l1Var) | (i12 == 4);
            Object objK2 = oVar.K();
            if (zH || objK2 == obj) {
                objK2 = new m1(l1Var, z10);
                oVar.h0(objK2);
            }
            o oVar2 = (o) objK2;
            boolean zF2 = t2.k0.f(l1Var.k().f25435b);
            int i13 = (int) (z10 ? l1Var.k().f25435b >> 32 : l1Var.k().f25435b & 4294967295L);
            h0.u0 u0Var = l1Var.f11528d;
            float fT = (u0Var == null || (r1VarD = u0Var.d()) == null) ? 0.0f : h0.q0.t(r1VarD.f7827a, i13);
            boolean zH2 = oVar.h(c1Var);
            Object objK3 = oVar.K();
            if (zH2 || objK3 == obj) {
                objK3 = new w(c1Var, 1);
                oVar.h0(objK3);
            }
            d(oVar2, z10, jVar, zF2, 0L, fT, new SuspendPointerInputElement(c1Var, null, null, (PointerInputEventHandler) objK3, 6), oVar, (i11 << 3) & 1008);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.l(z10, jVar, l1Var, i10);
        }
    }

    public static final r h(l0 l0Var, h hVar) {
        boolean z10 = l0Var.g() == i.f11496a;
        return new r(m(l0Var.j(), z10, true, l0Var.k(), hVar), m(l0Var.f(), z10, false, l0Var.e(), hVar), z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(c2.i0 r6, ac.a r7) {
        /*
            boolean r0 = r7 instanceof l0.d0
            if (r0 == 0) goto L13
            r0 = r7
            l0.d0 r0 = (l0.d0) r0
            int r1 = r0.f11447f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11447f = r1
            goto L18
        L13:
            l0.d0 r0 = new l0.d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11446e
            int r1 = r0.f11447f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            c2.i0 r6 = r0.f11445d
            ub.a.f(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            ub.a.f(r7)
        L32:
            r0.f11445d = r6
            r0.f11447f = r2
            c2.m r7 = c2.m.f3315b
            java.lang.Object r7 = r6.b(r7, r0)
            zb.a r1 = zb.a.f26667a
            if (r7 != r1) goto L41
            return r1
        L41:
            c2.l r7 = (c2.l) r7
            java.lang.Object r1 = r7.f3309a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L4d:
            if (r4 >= r3) goto L5f
            java.lang.Object r5 = r1.get(r4)
            c2.t r5 = (c2.t) r5
            boolean r5 = c2.s.a(r5)
            if (r5 != 0) goto L5c
            goto L32
        L5c:
            int r4 = r4 + 1
            goto L4d
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.u0.i(c2.i0, ac.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(c2.i0 r18, l0.l r19, ah.j r20, c2.l r21, ac.a r22) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.u0.j(c2.i0, l0.l, ah.j, c2.l, ac.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r14 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(c2.i0 r11, h0.c1 r12, c2.l r13, ac.a r14) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.u0.k(c2.i0, h0.c1, c2.l, ac.a):java.lang.Object");
    }

    public static final q l(l0 l0Var, p pVar, q qVar) {
        int i10 = l0Var.a() ? pVar.f11587c : pVar.f11588d;
        int iK = l0Var.a() ? l0Var.k() : l0Var.e();
        int i11 = pVar.f11586b;
        t2.i0 i0Var = pVar.f11590f;
        int i12 = pVar.f11589e;
        if (iK != i11) {
            return pVar.a(i10);
        }
        v vVar = new v(pVar, i10);
        ub.i iVar = ub.i.f21541b;
        ub.h hVarC = ub.a.c(iVar, vVar);
        ub.h hVarC2 = ub.a.c(iVar, new u(pVar, i10, l0Var.a() ? pVar.f11588d : pVar.f11587c, l0Var, hVarC));
        if (pVar.f11585a != qVar.f11598c) {
            return (q) hVarC2.getValue();
        }
        if (i10 == i12) {
            return qVar;
        }
        if (((Number) hVarC.getValue()).intValue() != i0Var.f20345b.d(i12)) {
            return (q) hVarC2.getValue();
        }
        int i13 = qVar.f11597b;
        long j10 = i0Var.j(i13);
        boolean zA = l0Var.a();
        if (i12 != -1) {
            if (i10 != i12) {
                if (!(zA ^ (pVar.b() == i.f11496a))) {
                }
            }
            return pVar.a(i10);
        }
        int i14 = t2.k0.f20357c;
        return (i13 == ((int) (j10 >> 32)) || i13 == ((int) (j10 & 4294967295L))) ? (q) hVarC2.getValue() : pVar.a(i10);
    }

    public static final q m(p pVar, boolean z10, boolean z11, int i10, h hVar) {
        long j10;
        int i11 = z11 ? pVar.f11587c : pVar.f11588d;
        if (i10 != pVar.f11586b) {
            return pVar.a(i11);
        }
        long jA = hVar.a(pVar, i11);
        if (z10 ^ z11) {
            int i12 = t2.k0.f20357c;
            j10 = jA >> 32;
        } else {
            int i13 = t2.k0.f20357c;
            j10 = 4294967295L & jA;
        }
        return pVar.a((int) j10);
    }

    public static final j n(j jVar, j jVar2, m0 m0Var, long j10, q qVar) {
        if (qVar == null) {
            return x(jVar, jVar2);
        }
        int iCompare = m0Var.f11560f.compare(Long.valueOf(qVar.f11598c), Long.valueOf(j10));
        return iCompare < 0 ? j.f11507a : iCompare > 0 ? j.f11509c : j.f11508b;
    }

    public static final q o(q qVar, p pVar, int i10) {
        return new q(pVar.f11590f.a(i10), i10, qVar.f11598c);
    }

    public static final boolean p(p1.c cVar, long j10) {
        float f10 = cVar.f16483a;
        float f11 = cVar.f16485c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (f10 > fIntBitsToFloat || fIntBitsToFloat > f11) {
            return false;
        }
        float f12 = cVar.f16484b;
        float f13 = cVar.f16486d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return f12 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f13;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q1.f q(n1.c r26, float r27) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.u0.q(n1.c, float):q1.f");
    }

    public static final long r(s0 s0Var, long j10, q qVar) {
        g2.c0 c0Var;
        long jB;
        long j11;
        t2.n nVar;
        int iD;
        float fJ;
        t2.n nVar2;
        int iD2;
        t2.n nVar3;
        int iD3;
        float fB;
        t2.n nVar4;
        int iD4;
        n nVarC = s0Var.c(qVar);
        if (nVarC == null || (c0Var = s0Var.f11621k) == null) {
            return 9205357640488583168L;
        }
        k0.g gVar = nVarC.f11570c;
        g2.c0 c0VarC = nVarC.c();
        if (c0VarC == null) {
            return 9205357640488583168L;
        }
        int i10 = qVar.f11597b;
        t2.i0 i0Var = (t2.i0) gVar.b();
        if (i10 > (i0Var == null ? 0 : nVarC.b(i0Var))) {
            return 9205357640488583168L;
        }
        p1.b bVar = (p1.b) s0Var.f11627q.getValue();
        jc.l.b(bVar);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarC.o(c0Var, bVar.f16481a) >> 32));
        t2.i0 i0Var2 = (t2.i0) gVar.b();
        if (i0Var2 == null) {
            jB = t2.k0.f20356b;
        } else {
            t2.n nVar5 = i0Var2.f20345b;
            int iB = nVarC.b(i0Var2);
            if (iB < 1) {
                jB = t2.k0.f20356b;
            } else {
                int iD5 = nVar5.d(nh.b.k(i10, 0, iB - 1));
                jB = t2.c0.b(i0Var2.g(iD5), nVar5.c(iD5, true));
            }
        }
        if (t2.k0.b(jB)) {
            t2.i0 i0Var3 = (t2.i0) gVar.b();
            fJ = (i0Var3 != null && (iD4 = (nVar4 = i0Var3.f20345b).d(i10)) < nVar4.f20371f) ? i0Var3.e(iD4) : -1.0f;
            j11 = 4294967295L;
        } else {
            j11 = 4294967295L;
            int i11 = (int) (jB >> 32);
            t2.i0 i0Var4 = (t2.i0) gVar.b();
            float fE = (i0Var4 != null && (iD2 = (nVar2 = i0Var4.f20345b).d(i11)) < nVar2.f20371f) ? i0Var4.e(iD2) : -1.0f;
            int i12 = ((int) (jB & 4294967295L)) - 1;
            t2.i0 i0Var5 = (t2.i0) gVar.b();
            float f10 = (i0Var5 != null && (iD = (nVar = i0Var5.f20345b).d(i12)) < nVar.f20371f) ? i0Var5.f(iD) : -1.0f;
            fJ = nh.b.j(fIntBitsToFloat, Math.min(fE, f10), Math.max(fE, f10));
        }
        if (fJ == -1.0f) {
            return 9205357640488583168L;
        }
        if (!f3.l.b(j10, 0L) && Math.abs(fIntBitsToFloat - fJ) > ((int) (j10 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        t2.i0 i0Var6 = (t2.i0) gVar.b();
        if (i0Var6 != null && (iD3 = (nVar3 = i0Var6.f20345b).d(i10)) < nVar3.f20371f) {
            float f11 = nVar3.f(iD3);
            fB = ((nVar3.b(iD3) - f11) / 2) + f11;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return c0Var.o(c0VarC, (((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j11));
    }

    public static final int s(long j10, t2.i0 i0Var) {
        int i10 = (int) (4294967295L & j10);
        if (Float.intBitsToFloat(i10) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        t2.n nVar = i0Var.f20345b;
        return fIntBitsToFloat >= nVar.f20370e ? i0Var.f20344a.f20326a.f20320b.length() : nVar.g(j10);
    }

    public static final long t(t2.i0 i0Var, int i10, boolean z10, boolean z11) {
        t2.n nVar = i0Var.f20345b;
        long j10 = i0Var.f20346c;
        int iD = nVar.d(i10);
        if (iD >= nVar.f20371f) {
            return 9205357640488583168L;
        }
        boolean z12 = i0Var.a(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == i0Var.h(i10);
        ArrayList arrayList = nVar.f20373h;
        nVar.l(i10);
        t2.p pVar = (t2.p) arrayList.get(i10 == ((t2.g) nVar.f20366a.f4201b).f20320b.length() ? ud.b.r(arrayList) : t2.c0.d(i10, arrayList));
        t2.a aVar = pVar.f20377a;
        int iD2 = pVar.d(i10);
        u2.k kVar = aVar.f20257d;
        return (((long) Float.floatToRawIntBits(nh.b.j(z12 ? kVar.h(iD2, false) : kVar.i(iD2, false), 0.0f, (int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(nh.b.j(nVar.b(iD), 0.0f, (int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final e3.j u(t2.i0 i0Var, int i10) {
        t2.h0 h0Var = i0Var.f20344a;
        t2.n nVar = i0Var.f20345b;
        if (h0Var.f20326a.f20320b.length() != 0) {
            int iD = nVar.d(i10);
            if ((i10 != 0 && iD == nVar.d(i10 - 1)) || (i10 != h0Var.f20326a.f20320b.length() && iD == nVar.d(i10 + 1))) {
                return i0Var.a(i10);
            }
        }
        return i0Var.h(i10);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean v(c2.l lVar) {
        ?? r52 = lVar.f3309a;
        int size = ((Collection) r52).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((c2.t) r52.get(i10)).f3330i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean w(l1 l1Var, boolean z10) {
        g2.c0 c0VarC;
        h0.u0 u0Var = l1Var.f11528d;
        if (u0Var == null || (c0VarC = u0Var.c()) == null) {
            return false;
        }
        return p(y(c0VarC), l1Var.j(z10));
    }

    public static final j x(j jVar, j jVar2) {
        int iOrdinal = jVar2.ordinal();
        j jVar3 = j.f11507a;
        if (iOrdinal != 0) {
            j jVar4 = j.f11509c;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return jVar4;
                }
                throw new ce.j0();
            }
            int iOrdinal2 = jVar.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return j.f11508b;
                }
                if (iOrdinal2 == 2) {
                    return jVar4;
                }
                throw new ce.j0();
            }
        }
        return jVar3;
    }

    public static final p1.c y(g2.c0 c0Var) {
        p1.c cVarG = g2.n1.g(c0Var);
        long jZ = c0Var.z(cVarG.d());
        float f10 = cVarG.f16485c;
        float f11 = cVarG.f16486d;
        return n7.b0.e(jZ, c0Var.z((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L)));
    }
}
