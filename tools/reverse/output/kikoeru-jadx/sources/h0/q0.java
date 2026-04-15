package h0;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f7813a = new n0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c2.a f7814b = new c2.a(1008);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2.a f7815c = new c2.a(1022);

    /* JADX WARN: Removed duplicated region for block: B:134:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r27, j1.q r28, t2.l0 r29, int r30, boolean r31, int r32, int r33, q1.r r34, x0.o r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.a(java.lang.String, j1.q, t2.l0, int, boolean, int, int, q1.r, x0.o, int, int):void");
    }

    public static final void b(String str, j1.q qVar, t2.l0 l0Var, int i10, boolean z10, int i11, int i12, x0.o oVar, int i13) {
        int i14;
        oVar.Y(-1186827822);
        if ((i13 & 6) == 0) {
            i14 = (oVar.f(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= oVar.f(l0Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= oVar.h(null) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= oVar.d(i10) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= oVar.g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i14 |= oVar.d(i11) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= oVar.d(i12) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        if (oVar.N(i15 & 1, (38347923 & i15) != 38347922)) {
            a(str, qVar, l0Var, i10, z10, i11, i12, null, oVar, i15 & 268435454, 512);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m(str, qVar, l0Var, i10, z10, i11, i12, i13);
        }
    }

    public static final void c(l0.s0 s0Var, f1.f fVar, x0.o oVar, int i10) {
        f1.f fVar2;
        x0.o oVar2;
        oVar.Y(605522716);
        int i11 = (oVar.h(s0Var) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new t.l();
                oVar.h0(objK);
            }
            t.l lVar = (t.l) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new n(lVar, 1);
                oVar.h0(objK2);
            }
            fVar2 = fVar;
            oVar2 = oVar;
            n7.b0.b(lVar, (ic.a) objK2, new b0.o1(25, lVar, s0Var), null, false, null, fVar2, oVar2, 1572918, 56);
        } else {
            fVar2 = fVar;
            oVar2 = oVar;
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new o(s0Var, fVar2, i10);
        }
    }

    public static final void d(l0.l1 l1Var, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        oVar.Y(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(l1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(fVar) ? 32 : 16;
        }
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new t.l();
                oVar.h0(objK);
            }
            t.l lVar = (t.l) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.m(oVar);
                oVar.h0(objK2);
            }
            hf.y yVar = (hf.y) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = x0.v.v(new z0(0));
                oVar.h0(objK3);
            }
            x0.w0 w0Var = (x0.w0) objK3;
            Object objK4 = oVar.K();
            if (objK4 == r0Var) {
                objK4 = new n(lVar, 0);
                oVar.h0(objK4);
            }
            ic.a aVar = (ic.a) objK4;
            cg.b bVar = new cg.b(w0Var, lVar, l1Var, 9);
            boolean zI = l1Var.i();
            boolean zH = oVar.h(yVar) | oVar.h(l1Var);
            Object objK5 = oVar.K();
            if (zH || objK5 == r0Var) {
                objK5 = new a0.o(yVar, w0Var, l1Var, 3);
                oVar.h0(objK5);
            }
            n7.b0.b(lVar, aVar, bVar, null, zI, (ic.a) objK5, fVar, oVar, ((i11 << 15) & 3670016) | 54, 8);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.l0(l1Var, fVar, i10, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x056f A[PHI: r12 r34
      0x056f: PHI (r12v34 y2.j) = (r12v21 y2.j), (r12v35 y2.j) binds: [B:270:0x056d, B:267:0x0562] A[DONT_GENERATE, DONT_INLINE]
      0x056f: PHI (r34v3 o1.i) = (r34v1 o1.i), (r34v4 o1.i) binds: [B:270:0x056d, B:267:0x0562] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x058d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0812 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x092e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(y2.y r67, ic.k r68, j1.q r69, t2.l0 r70, y2.g0 r71, ic.k r72, w.k r73, q1.n0 r74, boolean r75, int r76, int r77, y2.j r78, h0.s0 r79, boolean r80, boolean r81, f1.f r82, x0.o r83, int r84, int r85) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.e(y2.y, ic.k, j1.q, t2.l0, y2.g0, ic.k, w.k, q1.n0, boolean, int, int, y2.j, h0.s0, boolean, boolean, f1.f, x0.o, int, int):void");
    }

    public static final void f(j1.q qVar, l0.l1 l1Var, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(-20551815);
        int i11 = (oVar.f(qVar) ? 4 : 2) | i10 | (oVar.h(l1Var) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, true);
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
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            d(l1Var, fVar, oVar, (i11 >> 3) & 126);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0.c(qVar, l1Var, fVar, i10, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(l0.l1 r16, x0.o r17, int r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.g(l0.l1, x0.o, int):void");
    }

    public static final void h(l0.l1 l1Var, boolean z10, x0.o oVar, int i10) {
        int i11;
        r1 r1VarD;
        oVar.Y(626339208);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(l1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.g(z10) ? 32 : 16;
        }
        if (!oVar.N(i11 & 1, (i11 & 19) != 18)) {
            oVar.Q();
        } else if (z10) {
            oVar.W(-1290924834);
            u0 u0Var = l1Var.f11528d;
            t2.i0 i0Var = null;
            if (u0Var != null && (r1VarD = u0Var.d()) != null) {
                t2.i0 i0Var2 = r1VarD.f7827a;
                u0 u0Var2 = l1Var.f11528d;
                if (!(u0Var2 != null ? u0Var2.f7872p : true)) {
                    i0Var = i0Var2;
                }
            }
            if (i0Var == null) {
                oVar.W(-1290601288);
            } else {
                oVar.W(-1290601287);
                if (t2.k0.b(l1Var.k().f25435b)) {
                    oVar.W(-1684179174);
                    oVar.p(false);
                } else {
                    oVar.W(-1685230508);
                    int iP = l1Var.f11526b.p((int) (l1Var.k().f25435b >> 32));
                    int iP2 = l1Var.f11526b.p((int) (l1Var.k().f25435b & 4294967295L));
                    e3.j jVarA = i0Var.a(iP);
                    e3.j jVarA2 = i0Var.a(Math.max(iP2 - 1, 0));
                    u0 u0Var3 = l1Var.f11528d;
                    if (u0Var3 == null || !((Boolean) u0Var3.f7869m.getValue()).booleanValue()) {
                        oVar.W(-1684548198);
                        oVar.p(false);
                    } else {
                        oVar.W(-1684812473);
                        l0.u0.g(true, jVarA, l1Var, oVar, ((i11 << 6) & 896) | 6);
                        oVar.p(false);
                    }
                    u0 u0Var4 = l1Var.f11528d;
                    if (u0Var4 == null || !((Boolean) u0Var4.f7870n.getValue()).booleanValue()) {
                        oVar.W(-1684200998);
                        oVar.p(false);
                    } else {
                        oVar.W(-1684464312);
                        l0.u0.g(false, jVarA2, l1Var, oVar, ((i11 << 6) & 896) | 6);
                        oVar.p(false);
                    }
                    oVar.p(false);
                }
                u0 u0Var5 = l1Var.f11528d;
                if (u0Var5 != null) {
                    x0.e1 e1Var = u0Var5.f7868l;
                    if (!jc.l.a(l1Var.f11545u.f25434a.f20320b, l1Var.k().f25434a.f20320b)) {
                        e1Var.setValue(Boolean.FALSE);
                    }
                    if (u0Var5.b()) {
                        if (((Boolean) e1Var.getValue()).booleanValue()) {
                            l1Var.p();
                        } else {
                            l1Var.l();
                        }
                    }
                }
            }
            oVar.p(false);
            oVar.p(false);
        } else {
            oVar.W(651160447);
            oVar.p(false);
            l1Var.l();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0(l1Var, z10, i10);
        }
    }

    public static final void i(u0 u0Var) {
        y2.c0 c0Var = u0Var.f7861e;
        if (c0Var != null) {
            u0Var.f7878v.a(y2.y.a((y2.y) u0Var.f7860d.f22364b, null, 0L, 3));
            y2.z zVar = c0Var.f25399a;
            AtomicReference atomicReference = zVar.f25438b;
            while (true) {
                if (atomicReference.compareAndSet(c0Var, null)) {
                    zVar.f25437a.c();
                    break;
                } else if (atomicReference.get() != c0Var) {
                    break;
                }
            }
        }
        u0Var.f7861e = null;
    }

    public static final p1.c j(f3.c cVar, int i10, y2.d0 d0Var, t2.i0 i0Var, boolean z10, int i11) {
        p1.c cVarC = i0Var != null ? i0Var.c(d0Var.f25402b.p(i10)) : p1.c.f16482e;
        float f10 = cVarC.f16483a;
        int iA0 = cVar.a0(f1.f7628a);
        return p1.c.a(cVarC, z10 ? (i11 - f10) - iA0 : f10, z10 ? i11 - f10 : iA0 + f10, 0.0f, 10);
    }

    public static final boolean k(int i10, KeyEvent keyEvent) {
        return ((int) (a2.c.L(keyEvent) >> 32)) == i10;
    }

    public static final void l(y2.z zVar, u0 u0Var, y2.y yVar, y2.j jVar, y2.r rVar) {
        v2.e eVar = u0Var.f7860d;
        x xVar = u0Var.f7878v;
        x xVar2 = u0Var.f7879w;
        jc.y yVar2 = new jc.y();
        cg.b bVar = new cg.b(eVar, xVar, yVar2, 4);
        y2.t tVar = zVar.f25437a;
        tVar.d(yVar, jVar, bVar, xVar2);
        y2.c0 c0Var = new y2.c0(zVar, tVar);
        zVar.f25438b.set(c0Var);
        yVar2.f10838a = c0Var;
        u0Var.f7861e = c0Var;
        u(u0Var, yVar, rVar);
    }

    public static final int m(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final Object n(c2.x xVar, c1 c1Var, yb.c cVar) {
        Object objK = hf.a0.k(new f7.o(xVar, c1Var, (yb.c) null), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v0, types: [c7.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int o(int r12, java.lang.String r13) {
        /*
            boolean r0 = c4.k.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            c4.k r0 = c4.k.a()
            int r3 = r0.c()
            if (r3 != r1) goto L13
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L89
            int r3 = r0.c()
            r4 = 0
            if (r3 != r1) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L81
            java.lang.String r1 = "charSequence cannot be null"
            n7.b0.g(r13, r1)
            c4.f r0 = r0.f3379e
            c7.e1 r5 = r0.f3365b
            r5.getClass()
            r0 = -1
            if (r12 < 0) goto L36
            int r1 = r13.length()
            if (r12 < r1) goto L38
        L36:
            r6 = r13
            goto L77
        L38:
            boolean r1 = r13 instanceof android.text.Spanned
            if (r1 == 0) goto L54
            r1 = r13
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r3 = r12 + 1
            java.lang.Class<c4.x> r6 = c4.x.class
            java.lang.Object[] r3 = r1.getSpans(r12, r3, r6)
            c4.x[] r3 = (c4.x[]) r3
            int r6 = r3.length
            if (r6 <= 0) goto L54
            r3 = r3[r4]
            int r1 = r1.getSpanEnd(r3)
            r6 = r13
            goto L78
        L54:
            int r1 = r12 + (-16)
            int r7 = java.lang.Math.max(r4, r1)
            int r1 = r13.length()
            int r3 = r12 + 16
            int r8 = java.lang.Math.min(r1, r3)
            c4.r r11 = new c4.r
            r11.<init>(r12)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            r6 = r13
            java.lang.Object r13 = r5.O(r6, r7, r8, r9, r10, r11)
            c4.r r13 = (c4.r) r13
            int r1 = r13.f3392c
            goto L78
        L77:
            r1 = -1
        L78:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            if (r1 != r0) goto L7f
            goto L8a
        L7f:
            r2 = r13
            goto L8a
        L81:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        L89:
            r6 = r13
        L8a:
            if (r2 == 0) goto L91
            int r12 = r2.intValue()
            return r12
        L91:
            java.text.BreakIterator r13 = java.text.BreakIterator.getCharacterInstance()
            r13.setText(r6)
            int r12 = r13.following(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.o(int, java.lang.String):int");
    }

    public static final int p(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int q(CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int r(int r4, java.lang.String r5) {
        /*
            boolean r0 = c4.k.d()
            r1 = 0
            if (r0 == 0) goto L13
            c4.k r0 = c4.k.a()
            int r2 = r0.c()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2a
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.b(r5, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            int r4 = r1.intValue()
            return r4
        L31:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.r(int, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[PHI: r1 r4 r8 r9
      0x009e: PHI (r1v3 int) = (r1v1 int), (r1v9 int) binds: [B:20:0x0054, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r4v2 ??) = (r4v0 ??), (r4v10 ??) binds: [B:20:0x0054, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r8v3 l0.l1) = (r8v0 l0.l1), (r8v14 l0.l1) binds: [B:20:0x0054, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r9v10 int) = (r9v6 int), (r9v19 int) binds: [B:20:0x0054, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(l0.l1 r8, ac.c r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.q0.s(l0.l1, ac.c):java.lang.Object");
    }

    public static final float t(t2.i0 i0Var, int i10) {
        if (i10 < 0) {
            return 0.0f;
        }
        t2.h0 h0Var = i0Var.f20344a;
        t2.n nVar = i0Var.f20345b;
        if (h0Var.f20326a.f20320b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(nVar.d(i10), Math.min(nVar.f20367b - 1, nVar.f20371f - 1));
        if (i10 > nVar.c(iMin, false)) {
            return 0.0f;
        }
        nVar.m(iMin);
        ArrayList arrayList = nVar.f20373h;
        t2.p pVar = (t2.p) arrayList.get(t2.c0.e(iMin, arrayList));
        t2.a aVar = pVar.f20377a;
        int i11 = iMin - pVar.f20380d;
        u2.k kVar = aVar.f20257d;
        return kVar.e(i11) - kVar.g(i11);
    }

    public static final void u(u0 u0Var, y2.y yVar, y2.r rVar) {
        h1.g gVarD = h1.t.d();
        ic.k kVarE = gVarD != null ? gVarD.e() : null;
        h1.g gVarG = h1.t.g(gVarD);
        try {
            r1 r1VarD = u0Var.d();
            if (r1VarD == null) {
                return;
            }
            y2.c0 c0Var = u0Var.f7861e;
            if (c0Var == null) {
                return;
            }
            g2.c0 c0VarC = u0Var.c();
            if (c0VarC == null) {
                return;
            }
            v(yVar, u0Var.f7857a, r1VarD.f7827a, c0VarC, c0Var, u0Var.b(), rVar);
        } finally {
            h1.t.k(gVarD, gVarG, kVarE);
        }
    }

    public static void v(y2.y yVar, b1 b1Var, t2.i0 i0Var, g2.c0 c0Var, y2.c0 c0Var2, boolean z10, y2.r rVar) {
        if (z10) {
            int iP = rVar.p(t2.k0.d(yVar.f25435b));
            p1.c cVarB = iP < i0Var.f20344a.f20326a.f20320b.length() ? i0Var.b(iP) : iP != 0 ? i0Var.b(iP - 1) : new p1.c(0.0f, 0.0f, 1.0f, (int) (g1.a(b1Var.f7590b, b1Var.f7595g, b1Var.f7596h, g1.f7631a, 1) & 4294967295L));
            float f10 = cVarB.f16484b;
            float f11 = cVarB.f16483a;
            long jH = c0Var.H((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
            p1.c cVarF = n7.b0.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jH & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jH >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.f16485c - f11)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f16486d - f10)) & 4294967295L));
            if (jc.l.a((y2.c0) c0Var2.f25399a.f25438b.get(), c0Var2)) {
                c0Var2.f25400b.h(cVarF);
            }
        }
    }

    public static final void w(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            x.a.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        x.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
