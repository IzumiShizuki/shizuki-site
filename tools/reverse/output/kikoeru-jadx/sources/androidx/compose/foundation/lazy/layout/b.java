package androidx.compose.foundation.lazy.layout;

import ah.j;
import b0.a0;
import b0.c0;
import b0.e0;
import b0.r0;
import b0.z;
import i2.a1;
import j1.p;
import j1.q;
import java.util.ArrayList;
import jc.l;
import o.k0;
import o.l0;
import o.s0;
import o.t0;
import r.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c0 f585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f586k;

    public b() {
        long[] jArr = s0.f16040a;
        this.f576a = new k0();
        int i10 = t0.f16044a;
        this.f579d = new l0();
        this.f580e = new ArrayList();
        this.f581f = new ArrayList();
        this.f582g = new ArrayList();
        this.f583h = new ArrayList();
        this.f584i = new ArrayList();
        this.f586k = new a1(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f570a;

            {
                this.f570a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && l.a(this.f570a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f570a);
            }

            @Override // i2.a1
            public final p h() {
                c0 c0Var = new c0();
                c0Var.f1206o = this.f570a;
                return c0Var;
            }

            public final int hashCode() {
                return this.f570a.hashCode();
            }

            @Override // i2.a1
            public final void l(p pVar) {
                c0 c0Var = (c0) pVar;
                b bVar = c0Var.f1206o;
                b bVar2 = this.f570a;
                if (l.a(bVar, bVar2) || !c0Var.f9690a.f9703n) {
                    return;
                }
                b bVar3 = c0Var.f1206o;
                bVar3.e();
                bVar3.f577b = null;
                bVar3.f578c = -1;
                bVar2.f585j = c0Var;
                c0Var.f1206o = bVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f570a + ')';
            }
        };
    }

    public static void c(r0 r0Var, int i10, e0 e0Var) {
        int i11 = 0;
        long jI = r0Var.i(0);
        long jA = r0Var.g() ? f3.j.a(0, i10, 1, jI) : f3.j.a(i10, 0, 2, jI);
        a0[] a0VarArr = e0Var.f1218a;
        int length = a0VarArr.length;
        int i12 = 0;
        while (i11 < length) {
            a0 a0Var = a0VarArr[i11];
            int i13 = i12 + 1;
            if (a0Var != null) {
                a0Var.f1183l = f3.j.d(jA, f3.j.c(r0Var.i(i12), jI));
            }
            i11++;
            i12 = i13;
        }
    }

    public static int h(int[] iArr, r0 r0Var) {
        int iJ = r0Var.j();
        int iD = r0Var.d() + iJ;
        int iMax = 0;
        while (iJ < iD) {
            int iC = r0Var.c() + iArr[iJ];
            iArr[iJ] = iC;
            iMax = Math.max(iMax, iC);
            iJ++;
        }
        return iMax;
    }

    public final a0 a(int i10, Object obj) {
        e0 e0Var = (e0) this.f576a.g(obj);
        if (e0Var != null) {
            return e0Var.f1218a[i10];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.f584i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            t1.b bVar = a0Var.f1185n;
            if (bVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (a0Var.f1183l >> 32)) + ((int) (bVar.f20159u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (a0Var.f1183l & 4294967295L)) + ((int) (bVar.f20159u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [hf.z, yb.c, yb.h] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r5v42, types: [b0.a0[]] */
    /* JADX WARN: Type inference failed for: r6v23, types: [b0.a0[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r50, int r51, int r52, java.util.ArrayList r53, ah.j r54, b0.s0 r55, boolean r56, boolean r57, int r58, boolean r59, int r60, int r61, hf.y r62, q1.v r63) {
        /*
            Method dump skipped, instruction units count: 1605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.d(int, int, int, java.util.ArrayList, ah.j, b0.s0, boolean, boolean, int, boolean, int, int, hf.y, q1.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            o.k0 r1 = r0.f576a
            boolean r2 = r1.j()
            if (r2 == 0) goto L5f
            java.lang.Object[] r2 = r1.f15997c
            long[] r3 = r1.f15995a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5c
            r5 = 0
            r6 = 0
        L15:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L57
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L2f:
            if (r11 >= r9) goto L55
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L51
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r2[r12]
            b0.e0 r12 = (b0.e0) r12
            b0.a0[] r12 = r12.f1218a
            int r13 = r12.length
            r14 = 0
        L45:
            if (r14 >= r13) goto L51
            r15 = r12[r14]
            if (r15 == 0) goto L4e
            r15.c()
        L4e:
            int r14 = r14 + 1
            goto L45
        L51:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2f
        L55:
            if (r9 != r10) goto L5c
        L57:
            if (r6 == r4) goto L5c
            int r6 = r6 + 1
            goto L15
        L5c:
            r1.a()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e():void");
    }

    public final void f(Object obj) {
        a0[] a0VarArr;
        e0 e0Var = (e0) this.f576a.k(obj);
        if (e0Var == null || (a0VarArr = e0Var.f1218a) == null) {
            return;
        }
        for (a0 a0Var : a0VarArr) {
            if (a0Var != null) {
                a0Var.c();
            }
        }
    }

    public final void g(r0 r0Var, boolean z10) {
        Object objG = this.f576a.g(r0Var.getKey());
        l.b(objG);
        a0[] a0VarArr = ((e0) objG).f1218a;
        int length = a0VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            a0 a0Var = a0VarArr[i10];
            int i12 = i11 + 1;
            if (a0Var != null) {
                long jI = r0Var.i(i11);
                long j10 = a0Var.f1183l;
                if (!f3.j.b(j10, a0.f1170s) && !f3.j.b(j10, jI)) {
                    long jC = f3.j.c(jI, j10);
                    x xVar = a0Var.f1176e;
                    if (xVar != null) {
                        long jC2 = f3.j.c(((f3.j) a0Var.f1188q.getValue()).f6660a, jC);
                        a0Var.g(jC2);
                        a0Var.f(true);
                        a0Var.f1178g = z10;
                        hf.a0.y(a0Var.f1172a, null, null, new z(a0Var, xVar, jC2, (yb.c) null), 3);
                    }
                }
                a0Var.f1183l = jI;
            }
            i10++;
            i11 = i12;
        }
    }
}
