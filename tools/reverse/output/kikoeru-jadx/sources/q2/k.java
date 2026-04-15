package q2;

import java.util.Iterator;
import o.k0;
import o.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f17630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o.v f17631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17633d;

    public k() {
        long[] jArr = s0.f16040a;
        this.f17630a = new k0();
    }

    public final boolean a(w wVar) {
        return this.f17630a.c(wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jc.l.a(this.f17630a, kVar.f17630a) && this.f17632c == kVar.f17632c && this.f17633d == kVar.f17633d;
    }

    public final int hashCode() {
        return (((this.f17630a.hashCode() * 31) + (this.f17632c ? 1231 : 1237)) * 31) + (this.f17633d ? 1231 : 1237);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q2.k i() {
        /*
            r19 = this;
            r0 = r19
            q2.k r1 = new q2.k
            r1.<init>()
            boolean r2 = r0.f17632c
            r1.f17632c = r2
            boolean r2 = r0.f17633d
            r1.f17633d = r2
            o.k0 r2 = r1.f17630a
            r2.getClass()
            java.lang.String r3 = "from"
            o.k0 r4 = r0.f17630a
            jc.l.e(r4, r3)
            java.lang.Object[] r3 = r4.f15996b
            java.lang.Object[] r5 = r4.f15997c
            long[] r4 = r4.f15995a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = 0
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.k.i():q2.k");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        o.v vVar = this.f17631b;
        if (vVar == null) {
            k0 k0Var = this.f17630a;
            k0Var.getClass();
            o.v vVar2 = new o.v(k0Var);
            this.f17631b = vVar2;
            vVar = vVar2;
        }
        return ((o.h) vVar.entrySet()).iterator();
    }

    public final Object j(w wVar) {
        Object objG = this.f17630a.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final void k(k kVar) {
        k0 k0Var = kVar.f17630a;
        Object[] objArr = k0Var.f15996b;
        Object[] objArr2 = k0Var.f15997c;
        long[] jArr = k0Var.f15995a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        w wVar = (w) obj;
                        k0 k0Var2 = this.f17630a;
                        Object objG = k0Var2.g(wVar);
                        jc.l.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objQ = wVar.f17700b.q(objG, obj2);
                        if (objQ != null) {
                            k0Var2.m(wVar, objQ);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void l(w wVar, Object obj) {
        boolean z10 = obj instanceof a;
        k0 k0Var = this.f17630a;
        if (z10 && k0Var.c(wVar)) {
            Object objG = k0Var.g(wVar);
            jc.l.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f17586a;
            if (str == null) {
                str = aVar.f17586a;
            }
            ub.e eVar = aVar2.f17587b;
            if (eVar == null) {
                eVar = aVar.f17587b;
            }
            k0Var.m(wVar, new a(str, eVar));
        } else {
            k0Var.m(wVar, obj);
        }
        wVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r20 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f17632c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f17633d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            o.k0 r4 = r0.f17630a
            java.lang.Object[] r5 = r4.f15996b
            java.lang.Object[] r6 = r4.f15997c
            long[] r4 = r4.f15995a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            q2.w r8 = (q2.w) r8
            r1.append(r2)
            java.lang.String r2 = r8.f17699a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = j2.l0.G(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.k.toString():java.lang.String");
    }
}
