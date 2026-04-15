package o1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import b0.d0;
import ce.j0;
import g2.n1;
import i2.d1;
import i2.g1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16087a = new int[2];

    public static final boolean A(int i10, cg.b bVar, v vVar, p1.c cVar) {
        v vVarH;
        z0.e eVar = new z0.e(new v[16]);
        if (!vVar.f9690a.f9703n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.e eVar2 = new z0.e(new j1.p[16]);
        j1.p pVar = vVar.f9690a;
        j1.p pVar2 = pVar.f9695f;
        if (pVar2 == null) {
            i2.f.b(eVar2, pVar);
        } else {
            eVar2.b(pVar2);
        }
        while (true) {
            int i11 = eVar2.f26374c;
            if (i11 == 0) {
                break;
            }
            j1.p pVarF = (j1.p) eVar2.k(i11 - 1);
            if ((pVarF.f9693d & 1024) == 0) {
                i2.f.b(eVar2, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f9692c & 1024) != 0) {
                        z0.e eVar3 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof v) {
                                v vVar2 = (v) pVarF;
                                if (vVar2.f9703n) {
                                    eVar.b(vVar2);
                                }
                            } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                int i12 = 0;
                                for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                    if ((pVar3.f9692c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new z0.e(new j1.p[16]);
                                            }
                                            if (pVarF != null) {
                                                eVar3.b(pVarF);
                                                pVarF = null;
                                            }
                                            eVar3.b(pVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            pVarF = i2.f.f(eVar3);
                        }
                    } else {
                        pVarF = pVarF.f9695f;
                    }
                }
            }
        }
        while (eVar.f26374c != 0 && (vVarH = h(eVar, cVar, i10)) != null) {
            if (vVarH.C0().f16109a) {
                return ((Boolean) bVar.a(vVarH)).booleanValue();
            }
            if (l(i10, bVar, vVarH, cVar)) {
                return true;
            }
            eVar.j(vVarH);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(o1.v r12, o1.v r13, int r14, cg.b r15) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.B(o1.v, o1.v, int, cg.b):boolean");
    }

    public static final Integer C(int i10) {
        if (i10 == 5) {
            return 33;
        }
        if (i10 == 6) {
            return 130;
        }
        if (i10 == 3) {
            return 17;
        }
        if (i10 == 4) {
            return 66;
        }
        if (i10 == 1) {
            return 2;
        }
        return i10 == 2 ? 1 : null;
    }

    public static final d D(int i10) {
        if (i10 == 1) {
            return new d(2);
        }
        if (i10 == 2) {
            return new d(1);
        }
        if (i10 == 17) {
            return new d(3);
        }
        if (i10 == 33) {
            return new d(5);
        }
        if (i10 == 66) {
            return new d(4);
        }
        if (i10 != 130) {
            return null;
        }
        return new d(6);
    }

    public static final Boolean E(int i10, cg.b bVar, v vVar, p1.c cVar) {
        int iOrdinal = vVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                v vVarN = n(vVar);
                if (vVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = vVarN.D0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolE = E(i10, bVar, vVarN, cVar);
                        if (!jc.l.a(boolE, Boolean.FALSE)) {
                            return boolE;
                        }
                        if (cVar == null) {
                            if (vVarN.D0() != u.f16128b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            v vVarG = g(vVarN);
                            if (vVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = j(vVarG);
                        }
                        return Boolean.valueOf(l(i10, bVar, vVar, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new j0();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = j(vVarN);
                }
                return Boolean.valueOf(l(i10, bVar, vVar, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return vVar.C0().f16109a ? (Boolean) bVar.a(vVar) : cVar == null ? Boolean.valueOf(i(vVar, i10, bVar)) : Boolean.valueOf(A(i10, bVar, vVar, cVar));
                }
                throw new j0();
            }
        }
        return Boolean.valueOf(i(vVar, i10, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(o1.v r7, cg.b r8) {
        /*
            o1.u r0 = r7.D0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = w(r7, r8)
            if (r0 != 0) goto L7d
            o1.n r0 = r7.C0()
            boolean r0 = r0.f16109a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.a(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = 0
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            ce.j0 r7 = new ce.j0
            r7.<init>()
            throw r7
        L37:
            o1.v r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            o1.u r6 = r0.D0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            ce.j0 r7 = new ce.j0
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            o1.n r7 = r0.C0()
            boolean r7 = r7.f16109a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.a(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = w(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.a(o1.v, cg.b):boolean");
    }

    public static final boolean b(p1.c cVar, p1.c cVar2, p1.c cVar3, int i10) {
        float f10;
        float f11;
        boolean zC = c(i10, cVar3, cVar);
        float f12 = cVar3.f16484b;
        float f13 = cVar3.f16486d;
        float f14 = cVar3.f16483a;
        float f15 = cVar3.f16485c;
        float f16 = cVar.f16486d;
        float f17 = cVar.f16484b;
        float f18 = cVar.f16485c;
        float f19 = cVar.f16483a;
        if (zC || !c(i10, cVar2, cVar)) {
            return false;
        }
        if (i10 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i10 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i10 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        if (i10 == 3) {
            f10 = f19 - cVar2.f16485c;
        } else if (i10 == 4) {
            f10 = cVar2.f16483a - f18;
        } else if (i10 == 5) {
            f10 = f17 - cVar2.f16486d;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f16484b - f16;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (i10 == 3) {
            f11 = f19 - f14;
        } else if (i10 == 4) {
            f11 = f15 - f18;
        } else if (i10 == 5) {
            f11 = f17 - f12;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f10 < f11;
    }

    public static final boolean c(int i10, p1.c cVar, p1.c cVar2) {
        if (i10 == 3 || i10 == 4) {
            return cVar.f16486d > cVar2.f16484b && cVar.f16484b < cVar2.f16486d;
        }
        if (i10 == 5 || i10 == 6) {
            return cVar.f16485c > cVar2.f16483a && cVar.f16483a < cVar2.f16485c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final p1.c d(View view, j2.v vVar) {
        int[] iArr = f16087a;
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        vVar.getLocationInWindow(iArr);
        float f10 = i10 - iArr[0];
        float f11 = i11 - iArr[1];
        return new p1.c(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean e(v vVar, boolean z10) {
        int iOrdinal = vVar.D0().ordinal();
        u uVar = u.f16130d;
        if (iOrdinal == 0) {
            ((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).g(null);
            vVar.B0(u.f16127a, uVar);
            return true;
        }
        if (iOrdinal == 1) {
            v vVarN = n(vVar);
            if (!(vVarN != null ? e(vVarN, z10) : true)) {
                return false;
            }
            vVar.B0(u.f16128b, uVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new j0();
        }
        if (z10) {
            ((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).g(null);
            vVar.B0(u.f16129c, uVar);
        }
        return z10;
    }

    public static final void f(v vVar, z0.e eVar) {
        if (!vVar.f9690a.f9703n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.e eVar2 = new z0.e(new j1.p[16]);
        j1.p pVar = vVar.f9690a;
        j1.p pVar2 = pVar.f9695f;
        if (pVar2 == null) {
            i2.f.b(eVar2, pVar);
        } else {
            eVar2.b(pVar2);
        }
        while (true) {
            int i10 = eVar2.f26374c;
            if (i10 == 0) {
                return;
            }
            j1.p pVarF = (j1.p) eVar2.k(i10 - 1);
            if ((pVarF.f9693d & 1024) == 0) {
                i2.f.b(eVar2, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f9692c & 1024) != 0) {
                        z0.e eVar3 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof v) {
                                v vVar2 = (v) pVarF;
                                if (vVar2.f9703n && !i2.f.y(vVar2).Q) {
                                    if (vVar2.C0().f16109a) {
                                        eVar.b(vVar2);
                                    } else {
                                        f(vVar2, eVar);
                                    }
                                }
                            } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                int i11 = 0;
                                for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                    if ((pVar3.f9692c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new z0.e(new j1.p[16]);
                                            }
                                            if (pVarF != null) {
                                                eVar3.b(pVarF);
                                                pVarF = null;
                                            }
                                            eVar3.b(pVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            pVarF = i2.f.f(eVar3);
                        }
                    } else {
                        pVarF = pVarF.f9695f;
                    }
                }
            }
        }
    }

    public static final v g(v vVar) {
        v vVar2 = ((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).f16104h;
        if (vVar2 == null || !vVar2.f9703n) {
            return null;
        }
        return vVar2;
    }

    public static final v h(z0.e eVar, p1.c cVar, int i10) {
        p1.c cVarH;
        if (i10 == 3) {
            cVarH = cVar.h((cVar.f16485c - cVar.f16483a) + 1, 0.0f);
        } else if (i10 == 4) {
            cVarH = cVar.h(-((cVar.f16485c - cVar.f16483a) + 1), 0.0f);
        } else if (i10 == 5) {
            cVarH = cVar.h(0.0f, (cVar.f16486d - cVar.f16484b) + 1);
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarH = cVar.h(0.0f, -((cVar.f16486d - cVar.f16484b) + 1));
        }
        Object[] objArr = eVar.f26372a;
        int i11 = eVar.f26374c;
        v vVar = null;
        for (int i12 = 0; i12 < i11; i12++) {
            v vVar2 = (v) objArr[i12];
            if (r(vVar2)) {
                p1.c cVarJ = j(vVar2);
                if (o(cVarJ, cVarH, cVar, i10)) {
                    vVar = vVar2;
                    cVarH = cVarJ;
                }
            }
        }
        return vVar;
    }

    public static final boolean i(v vVar, int i10, ic.k kVar) {
        p1.c cVar;
        z0.e eVar = new z0.e(new v[16]);
        f(vVar, eVar);
        int i11 = eVar.f26374c;
        if (i11 <= 1) {
            v vVar2 = (v) (i11 == 0 ? null : eVar.f26372a[0]);
            if (vVar2 != null) {
                return ((Boolean) kVar.a(vVar2)).booleanValue();
            }
        } else {
            if (i10 == 7) {
                i10 = 4;
            }
            if (i10 == 4 || i10 == 6) {
                p1.c cVarJ = j(vVar);
                float f10 = cVarJ.f16483a;
                float f11 = cVarJ.f16484b;
                cVar = new p1.c(f10, f11, f10, f11);
            } else {
                if (i10 != 3 && i10 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                p1.c cVarJ2 = j(vVar);
                float f12 = cVarJ2.f16485c;
                float f13 = cVarJ2.f16486d;
                cVar = new p1.c(f12, f13, f12, f13);
            }
            v vVarH = h(eVar, cVar, i10);
            if (vVarH != null) {
                return ((Boolean) kVar.a(vVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final p1.c j(v vVar) {
        g1 g1Var = vVar.f9697h;
        return g1Var != null ? n1.i(g1Var).s(g1Var, false) : p1.c.f16482e;
    }

    public static final boolean k(v vVar, cg.b bVar) {
        int iOrdinal = vVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                v vVarN = n(vVar);
                if (vVarN != null) {
                    return k(vVarN, bVar) || m(vVar, vVarN, 1, bVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return vVar.C0().f16109a ? ((Boolean) bVar.a(vVar)).booleanValue() : x(vVar, bVar);
                }
                throw new j0();
            }
        }
        return x(vVar, bVar);
    }

    public static final boolean l(int i10, cg.b bVar, v vVar, p1.c cVar) {
        if (A(i10, bVar, vVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(vVar, i10, new x(((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).f16104h, vVar, cVar, i10, bVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(v vVar, v vVar2, int i10, cg.b bVar) {
        if (B(vVar, vVar2, i10, bVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(vVar, i10, new x(((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).f16104h, vVar, vVar2, i10, bVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o1.v n(o1.v r8) {
        /*
            j1.p r0 = r8.f9690a
            boolean r0 = r0.f9703n
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            f2.a.b(r0)
        L10:
            z0.e r0 = new z0.e
            r2 = 16
            j1.p[] r3 = new j1.p[r2]
            r0.<init>(r3)
            j1.p r8 = r8.f9690a
            j1.p r3 = r8.f9695f
            if (r3 != 0) goto L23
            i2.f.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f26374c
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            j1.p r8 = (j1.p) r8
            int r3 = r8.f9693d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            i2.f.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f9692c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof o1.v
            r5 = 1
            if (r4 == 0) goto L6e
            o1.v r8 = (o1.v) r8
            j1.p r4 = r8.f9690a
            boolean r4 = r4.f9703n
            if (r4 == 0) goto La4
            o1.u r4 = r8.D0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            ce.j0 r8 = new ce.j0
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f9692c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof i2.n
            if (r4 == 0) goto La4
            r4 = r8
            i2.n r4 = (i2.n) r4
            j1.p r4 = r4.f8789p
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f9692c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            z0.e r3 = new z0.e
            j1.p[] r7 = new j1.p[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            j1.p r4 = r4.f9695f
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            j1.p r8 = i2.f.f(r3)
            goto L45
        La9:
            j1.p r8 = r8.f9695f
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.n(o1.v):o1.v");
    }

    public static final boolean o(p1.c cVar, p1.c cVar2, p1.c cVar3, int i10) {
        if (!p(i10, cVar, cVar3)) {
            return false;
        }
        if (p(i10, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i10)) {
            return !b(cVar3, cVar2, cVar, i10) && q(i10, cVar3, cVar) < q(i10, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i10, p1.c cVar, p1.c cVar2) {
        float f10 = cVar.f16484b;
        float f11 = cVar.f16486d;
        float f12 = cVar.f16483a;
        float f13 = cVar.f16485c;
        if (i10 == 3) {
            float f14 = cVar2.f16485c;
            float f15 = cVar2.f16483a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i10 == 4) {
            float f16 = cVar2.f16483a;
            float f17 = cVar2.f16485c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i10 == 5) {
            float f18 = cVar2.f16486d;
            float f19 = cVar2.f16484b;
            return (f18 > f11 || f19 >= f11) && f19 > f10;
        }
        if (i10 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f20 = cVar2.f16484b;
        float f21 = cVar2.f16486d;
        return (f20 < f10 || f21 <= f10) && f21 < f11;
    }

    public static final long q(int i10, p1.c cVar, p1.c cVar2) {
        float f10;
        float f11;
        float f12 = cVar2.f16484b;
        float f13 = cVar2.f16486d;
        float f14 = cVar2.f16483a;
        float f15 = cVar2.f16485c;
        if (i10 == 3) {
            f10 = cVar.f16483a - f15;
        } else if (i10 == 4) {
            f10 = f14 - cVar.f16485c;
        } else if (i10 == 5) {
            f10 = cVar.f16484b - f13;
        } else {
            if (i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - cVar.f16486d;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j10 = (long) f10;
        if (i10 == 3 || i10 == 4) {
            float f16 = cVar.f16484b;
            float f17 = 2;
            f11 = (((cVar.f16486d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i10 != 5 && i10 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f16483a;
            float f19 = 2;
            f11 = (((cVar.f16485c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j11 = (long) f11;
        return (j11 * j11) + (((long) 13) * j10 * j10);
    }

    public static final boolean r(v vVar) {
        i2.j0 j0Var;
        g1 g1Var;
        i2.j0 j0Var2;
        g1 g1Var2 = vVar.f9697h;
        return (g1Var2 == null || (j0Var = g1Var2.f8700o) == null || !j0Var.J() || (g1Var = vVar.f9697h) == null || (j0Var2 = g1Var.f8700o) == null || !j0Var2.I()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ic.k, jc.m] */
    public static final b s(v vVar, int i10) {
        int iOrdinal = vVar.D0().ordinal();
        b bVar = b.f16080a;
        if (iOrdinal != 0) {
            b bVar2 = b.f16081b;
            if (iOrdinal == 1) {
                v vVarN = n(vVar);
                if (vVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarS = s(vVarN, i10);
                if (bVarS == bVar) {
                    bVarS = null;
                }
                if (bVarS != null) {
                    return bVarS;
                }
                if (vVar.f16133p) {
                    return bVar;
                }
                vVar.f16133p = true;
                try {
                    n nVarC0 = vVar.C0();
                    a aVar = new a(i10);
                    i focusOwner = ((j2.v) i2.f.z(vVar)).getFocusOwner();
                    v vVar2 = ((k) focusOwner).f16104h;
                    nVarC0.f16119k.a(aVar);
                    v vVar3 = ((k) focusOwner).f16104h;
                    if (!aVar.f16079b) {
                        return (vVar2 == vVar3 || vVar3 == null) ? bVar : r.f16124d == r.f16123c ? bVar2 : b.f16082c;
                    }
                    r rVar = r.f16122b;
                    return bVar2;
                } finally {
                    vVar.f16133p = false;
                }
            }
            if (iOrdinal == 2) {
                return bVar2;
            }
            if (iOrdinal != 3) {
                throw new j0();
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ic.k, jc.m] */
    public static final b t(v vVar, int i10) {
        if (!vVar.f16134q) {
            vVar.f16134q = true;
            try {
                n nVarC0 = vVar.C0();
                a aVar = new a(i10);
                i focusOwner = ((j2.v) i2.f.z(vVar)).getFocusOwner();
                v vVar2 = ((k) focusOwner).f16104h;
                nVarC0.f16118j.a(aVar);
                v vVar3 = ((k) focusOwner).f16104h;
                boolean z10 = aVar.f16079b;
                b bVar = b.f16081b;
                if (z10) {
                    r rVar = r.f16122b;
                    return bVar;
                }
                if (vVar2 != vVar3 && vVar3 != null) {
                    return r.f16124d == r.f16123c ? bVar : b.f16082c;
                }
            } finally {
                vVar.f16134q = false;
            }
        }
        return b.f16080a;
    }

    public static final b u(v vVar, int i10) {
        j1.p pVarF;
        d1 d1Var;
        int iOrdinal = vVar.D0().ordinal();
        b bVar = b.f16080a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                v vVarN = n(vVar);
                if (vVarN != null) {
                    return s(vVarN, i10);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new j0();
                }
                if (!vVar.f9690a.f9703n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                j1.p pVar = vVar.f9690a.f9694e;
                i2.j0 j0VarY = i2.f.y(vVar);
                loop0: while (true) {
                    if (j0VarY == null) {
                        pVarF = null;
                        break;
                    }
                    if ((j0VarY.F.f8667f.f9693d & 1024) != 0) {
                        while (pVar != null) {
                            if ((pVar.f9692c & 1024) != 0) {
                                pVarF = pVar;
                                z0.e eVar = null;
                                while (pVarF != null) {
                                    if (pVarF instanceof v) {
                                        break loop0;
                                    }
                                    if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                        int i11 = 0;
                                        for (j1.p pVar2 = ((i2.n) pVarF).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                            if ((pVar2.f9692c & 1024) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
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
                v vVar2 = (v) pVarF;
                if (vVar2 == null) {
                    return bVar;
                }
                int iOrdinal2 = vVar2.D0().ordinal();
                if (iOrdinal2 == 0) {
                    return t(vVar2, i10);
                }
                if (iOrdinal2 == 1) {
                    return u(vVar2, i10);
                }
                if (iOrdinal2 == 2) {
                    return b.f16081b;
                }
                if (iOrdinal2 != 3) {
                    throw new j0();
                }
                b bVarU = u(vVar2, i10);
                b bVar2 = bVarU != bVar ? bVarU : null;
                return bVar2 == null ? t(vVar2, i10) : bVar2;
            }
        }
        return bVar;
    }

    public static final boolean v(v vVar) {
        z0.e eVar;
        d1 d1Var;
        d1 d1Var2;
        k kVar = (k) ((j2.v) i2.f.z(vVar)).getFocusOwner();
        v vVar2 = kVar.f16104h;
        u uVarD0 = vVar.D0();
        if (vVar2 == vVar) {
            vVar.B0(uVarD0, uVarD0);
            return true;
        }
        int i10 = 0;
        if (vVar2 == null && !((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).f16097a.J()) {
            return false;
        }
        if (vVar2 != null) {
            eVar = new z0.e(new v[16]);
            if (!vVar2.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar = vVar2.f9690a.f9694e;
            i2.j0 j0VarY = i2.f.y(vVar2);
            while (j0VarY != null) {
                if ((j0VarY.F.f8667f.f9693d & 1024) != 0) {
                    while (pVar != null) {
                        if ((pVar.f9692c & 1024) != 0) {
                            j1.p pVarF = pVar;
                            z0.e eVar2 = null;
                            while (pVarF != null) {
                                if (pVarF instanceof v) {
                                    eVar.b((v) pVarF);
                                } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                    int i11 = 0;
                                    for (j1.p pVar2 = ((i2.n) pVarF).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                        if ((pVar2.f9692c & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                pVarF = pVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    eVar2.b(pVarF);
                                                    pVarF = null;
                                                }
                                                eVar2.b(pVar2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                pVarF = i2.f.f(eVar2);
                            }
                        }
                        pVar = pVar.f9694e;
                    }
                }
                j0VarY = j0VarY.v();
                pVar = (j0VarY == null || (d1Var2 = j0VarY.F) == null) ? null : d1Var2.f8666e;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new v[16];
        if (!vVar.f9690a.f9703n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        j1.p pVar3 = vVar.f9690a.f9694e;
        i2.j0 j0VarY2 = i2.f.y(vVar);
        boolean z10 = true;
        int i12 = 0;
        while (j0VarY2 != null) {
            if ((j0VarY2.F.f8667f.f9693d & 1024) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f9692c & 1024) != 0) {
                        j1.p pVarF2 = pVar3;
                        z0.e eVar3 = null;
                        while (pVarF2 != null) {
                            if (pVarF2 instanceof v) {
                                v vVar3 = (v) pVarF2;
                                Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.j(vVar3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i13 = i12 + 1;
                                    if (objArr.length < i13) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i13, length * 2)];
                                        System.arraycopy(objArr, i10, objArr2, i10, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i12] = vVar3;
                                    i12 = i13;
                                }
                                if (vVar3 == vVar2) {
                                    z10 = false;
                                }
                            } else {
                                if ((pVarF2.f9692c & 1024) != 0 && (pVarF2 instanceof i2.n)) {
                                    int i14 = 0;
                                    for (j1.p pVar4 = ((i2.n) pVarF2).f8789p; pVar4 != null; pVar4 = pVar4.f9695f) {
                                        if ((pVar4.f9692c & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                pVarF2 = pVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF2 != null) {
                                                    eVar3.b(pVarF2);
                                                    pVarF2 = null;
                                                }
                                                eVar3.b(pVar4);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                    i10 = 0;
                                }
                                pVarF2 = i2.f.f(eVar3);
                                i10 = 0;
                            }
                            pVarF2 = i2.f.f(eVar3);
                            i10 = 0;
                        }
                    }
                    pVar3 = pVar3.f9694e;
                    i10 = 0;
                }
            }
            j0VarY2 = j0VarY2.v();
            pVar3 = (j0VarY2 == null || (d1Var = j0VarY2.F) == null) ? null : d1Var.f8666e;
            i10 = 0;
        }
        if (z10 && vVar2 != null && !e(vVar2, false)) {
            return false;
        }
        i2.f.t(vVar, new d0(24, vVar));
        int iOrdinal = vVar.D0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).g(vVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new j0();
                }
                ((k) ((j2.v) i2.f.z(vVar)).getFocusOwner()).g(vVar);
            }
        }
        u uVar = u.f16130d;
        u uVar2 = u.f16128b;
        if (eVar != null) {
            int i15 = eVar.f26374c - 1;
            Object[] objArr3 = eVar.f26372a;
            if (i15 < objArr3.length) {
                while (i15 >= 0) {
                    v vVar4 = (v) objArr3[i15];
                    if (kVar.f16104h != vVar) {
                        return false;
                    }
                    vVar4.B0(uVar2, uVar);
                    i15--;
                }
            }
        }
        int i16 = i12 - 1;
        int length2 = objArr.length;
        u uVar3 = u.f16127a;
        if (i16 < length2) {
            while (i16 >= 0) {
                v vVar5 = (v) objArr[i16];
                if (kVar.f16104h != vVar) {
                    return false;
                }
                vVar5.B0(vVar5 == vVar2 ? uVar3 : uVar, uVar2);
                i16--;
            }
        }
        if (kVar.f16104h != vVar) {
            return false;
        }
        vVar.B0(uVarD0, uVar3);
        return kVar.f16104h == vVar;
    }

    public static final boolean w(v vVar, cg.b bVar) {
        Object[] objArr = new v[16];
        if (!vVar.f9690a.f9703n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.e eVar = new z0.e(new j1.p[16]);
        j1.p pVar = vVar.f9690a;
        j1.p pVar2 = pVar.f9695f;
        if (pVar2 == null) {
            i2.f.b(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f26374c;
            if (i11 == 0) {
                break;
            }
            j1.p pVarF = (j1.p) eVar.k(i11 - 1);
            if ((pVarF.f9693d & 1024) == 0) {
                i2.f.b(eVar, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f9692c & 1024) != 0) {
                        z0.e eVar2 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof v) {
                                v vVar2 = (v) pVarF;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = vVar2;
                                i10 = i12;
                            } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                int i13 = 0;
                                for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                    if ((pVar3.f9692c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (pVarF != null) {
                                                eVar2.b(pVarF);
                                                pVarF = null;
                                            }
                                            eVar2.b(pVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            pVarF = i2.f.f(eVar2);
                        }
                    } else {
                        pVarF = pVarF.f9695f;
                    }
                }
            }
        }
        vb.l.L0(objArr, w.f16136a, 0, i10);
        int i14 = i10 - 1;
        if (i14 < objArr.length) {
            while (i14 >= 0) {
                v vVar3 = (v) objArr[i14];
                if (r(vVar3) && a(vVar3, bVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    public static final boolean x(v vVar, cg.b bVar) {
        Object[] objArr = new v[16];
        if (!vVar.f9690a.f9703n) {
            f2.a.b("visitChildren called on an unattached node");
        }
        z0.e eVar = new z0.e(new j1.p[16]);
        j1.p pVar = vVar.f9690a;
        j1.p pVar2 = pVar.f9695f;
        if (pVar2 == null) {
            i2.f.b(eVar, pVar);
        } else {
            eVar.b(pVar2);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar.f26374c;
            if (i11 == 0) {
                break;
            }
            j1.p pVarF = (j1.p) eVar.k(i11 - 1);
            if ((pVarF.f9693d & 1024) == 0) {
                i2.f.b(eVar, pVarF);
            } else {
                while (true) {
                    if (pVarF == null) {
                        break;
                    }
                    if ((pVarF.f9692c & 1024) != 0) {
                        z0.e eVar2 = null;
                        while (pVarF != null) {
                            if (pVarF instanceof v) {
                                v vVar2 = (v) pVarF;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = vVar2;
                                i10 = i12;
                            } else if ((pVarF.f9692c & 1024) != 0 && (pVarF instanceof i2.n)) {
                                int i13 = 0;
                                for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                    if ((pVar3.f9692c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            pVarF = pVar3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (pVarF != null) {
                                                eVar2.b(pVarF);
                                                pVarF = null;
                                            }
                                            eVar2.b(pVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            pVarF = i2.f.f(eVar2);
                        }
                    } else {
                        pVarF = pVarF.f9695f;
                    }
                }
            }
        }
        vb.l.L0(objArr, w.f16136a, 0, i10);
        for (int i14 = 0; i14 < i10; i14++) {
            v vVar3 = (v) objArr[i14];
            if (r(vVar3) && k(vVar3, bVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof j2.v) {
            return ((j2.v) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(o1.v r10, int r11, ic.k r12) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.f.z(o1.v, int, ic.k):java.lang.Object");
    }
}
