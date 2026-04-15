package q2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import g2.n1;
import i2.g1;
import i2.j0;
import i7.p2;
import java.util.List;
import o.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.c f17649a = new p1.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final q2.o a(i2.j0 r8, boolean r9) {
        /*
            i2.d1 r0 = r8.F
            j1.p r0 = r0.f8667f
            int r1 = r0.f9693d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f9692c
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof i2.y1
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f9692c
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof i2.n
            if (r4 == 0) goto L56
            r4 = r1
            i2.n r4 = (i2.n) r4
            j1.p r4 = r4.f8789p
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f9692c
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            z0.e r3 = new z0.e
            r6 = 16
            j1.p[] r6 = new j1.p[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            j1.p r4 = r4.f9695f
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            j1.p r1 = i2.f.f(r3)
            goto L15
        L5b:
            int r1 = r0.f9693d
            r1 = r1 & 8
            if (r1 == 0) goto L64
            j1.p r0 = r0.f9695f
            goto Lb
        L64:
            jc.l.b(r2)
            i2.y1 r2 = (i2.y1) r2
            j1.p r2 = (j1.p) r2
            j1.p r0 = r2.f9690a
            q2.k r1 = r8.x()
            if (r1 != 0) goto L78
            q2.k r1 = new q2.k
            r1.<init>()
        L78:
            q2.o r2 = new q2.o
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.r.a(i2.j0, boolean):q2.o");
    }

    public static final y b(q qVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            o oVarA = qVar.a();
            j0 j0Var = oVarA.f17638c;
            if (j0Var.J() && j0Var.I()) {
                y yVar = new y(48);
                p2 p2Var = new p2(24, false);
                f3.k kVarX = g8.a.X(oVarA.g());
                ((Region) p2Var.f9258a).set(kVarX.f6662a, kVarX.f6663b, kVarX.f6664c, kVarX.f6665d);
                c(p2Var, oVarA, yVar, oVarA, new p2(24, false));
                return yVar;
            }
            y yVar2 = o.n.f16024a;
            jc.l.c(yVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return yVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(p2 p2Var, o oVar, y yVar, o oVar2, p2 p2Var2) {
        p1.c cVarI1;
        j0 j0Var;
        int i10 = oVar.f17642g;
        Region region = (Region) p2Var2.f9258a;
        j0 j0Var2 = oVar2.f17638c;
        int i11 = oVar2.f17642g;
        boolean z10 = (j0Var2.J() && j0Var2.I()) ? false : true;
        Region region2 = (Region) p2Var.f9258a;
        if (!region2.isEmpty() || i11 == i10) {
            if (!z10 || oVar2.f17640e) {
                i2.m mVarF = oVar2.f();
                if (mVarF == null) {
                    cVarI1 = j0Var2.F.f8664c.i1();
                } else {
                    j1.p pVar = ((j1.p) mVarF).f9690a;
                    Object objG = oVar2.f17639d.f17630a.g(j.f17605b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z11 = objG != null;
                    if (!pVar.f9690a.f9703n) {
                        cVarI1 = p1.c.f16482e;
                    } else if (z11) {
                        cVarI1 = i2.f.v(pVar, 8).i1();
                    } else {
                        g1 g1VarV = i2.f.v(pVar, 8);
                        cVarI1 = n1.i(g1VarV).s(g1VarV, true);
                    }
                }
                f3.k kVarX = g8.a.X(cVarI1);
                region.set(kVarX.f6662a, kVarX.f6663b, kVarX.f6664c, kVarX.f6665d);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (oVar2.f17640e) {
                        o oVarL = oVar2.l();
                        yVar.h(i11, new p(oVar2, g8.a.X((oVarL == null || (j0Var = oVarL.f17638c) == null || !j0Var.J()) ? f17649a : oVarL.g())));
                        return;
                    } else {
                        if (i11 == -1) {
                            Rect bounds = region.getBounds();
                            yVar.h(i11, new p(oVar2, new f3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                yVar.h(i11, new p(oVar2, new f3.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = o.j(4, oVar2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((o) listJ.get(size)).k().f17630a.c(t.f17695z)) {
                        c(p2Var, oVar, yVar, (o) listJ.get(size), p2Var2);
                    }
                }
                if (f(oVar2)) {
                    region2.op(kVarX.f6662a, kVarX.f6663b, kVarX.f6664c, kVarX.f6665d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(k kVar, w wVar) {
        Object objG = kVar.f17630a.g(wVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(o oVar) {
        g1 g1VarD = oVar.d();
        k kVar = oVar.f17639d;
        if (g1VarD != null ? g1VarD.U0() : false) {
            return true;
        }
        w wVar = t.f17670a;
        if (kVar.f17630a.c(t.f17685p)) {
            return true;
        }
        return kVar.f17630a.c(t.f17684o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(q2.o r15) {
        /*
            boolean r0 = e(r15)
            r1 = 0
            if (r0 != 0) goto L5b
            q2.k r15 = r15.f17639d
            boolean r0 = r15.f17632c
            if (r0 != 0) goto L59
            o.k0 r15 = r15.f17630a
            java.lang.Object[] r0 = r15.f15996b
            java.lang.Object[] r2 = r15.f15997c
            long[] r15 = r15.f15995a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = 0
        L1b:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = 0
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            q2.w r11 = (q2.w) r11
            boolean r10 = r11.f17701c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r15 = 1
            return r15
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.r.f(q2.o):boolean");
    }
}
