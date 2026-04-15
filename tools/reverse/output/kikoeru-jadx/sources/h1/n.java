package h1;

import b0.t1;
import c7.e1;
import java.util.HashMap;
import o.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1.d f8049a = new g1.d(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f8050b = new e1(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8051c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f8052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f8053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1 f8054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ah.j f8055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f8056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f8057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f8058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f1.a f8059k;

    static {
        k kVar = k.f8034e;
        f8052d = kVar;
        long j10 = 1;
        f8053e = j10 + j10;
        t1 t1Var = new t1();
        t1Var.f1351c = new long[16];
        t1Var.f1352d = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        t1Var.f1353e = iArr;
        f8054f = t1Var;
        ah.j jVar = new ah.j(5, (char) 0);
        jVar.f391c = new int[16];
        jVar.f392d = new f1.p[16];
        f8055g = jVar;
        vb.r rVar = vb.r.f22819a;
        f8056h = rVar;
        f8057i = rVar;
        long j11 = f8053e;
        f8053e = j10 + j11;
        b bVar = new b(j11, kVar, null, new g1.d(2));
        f8052d = f8052d.l(bVar.f8009b);
        f8058j = bVar;
        f8059k = new f1.a(0);
    }

    public static final void a() {
        f(f8049a);
    }

    public static final ic.k b(ic.k kVar, ic.k kVar2) {
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new l(kVar, kVar2, 1);
    }

    public static final HashMap c(long j10, c cVar, k kVar) {
        long[] jArr;
        k kVar2;
        long[] jArr2;
        k kVar3;
        char c3;
        g0 g0VarT;
        long j11 = j10;
        l0 l0VarX = cVar.x();
        if (l0VarX != null) {
            k kVarK = cVar.d().l(cVar.g()).k(cVar.f7991j);
            Object[] objArr = l0VarX.f16003b;
            long[] jArr3 = l0VarX.f16002a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i10 = 0;
                HashMap map = null;
                while (true) {
                    long j12 = jArr3[i10];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j12 & 255) < 128) {
                                e0 e0Var = (e0) objArr[(i10 << 3) + i12];
                                g0 g0VarA = e0Var.a();
                                jArr2 = jArr3;
                                c3 = '\b';
                                g0 g0VarT2 = t(g0VarA, j11, kVar);
                                if (g0VarT2 == null || (g0VarT = t(g0VarA, j11, kVarK)) == null || g0VarT2.equals(g0VarT)) {
                                    kVar3 = kVarK;
                                } else {
                                    kVar3 = kVarK;
                                    g0 g0VarT3 = t(g0VarA, cVar.g(), cVar.d());
                                    if (g0VarT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    g0 g0VarJ = e0Var.j(g0VarT, g0VarT2, g0VarT3);
                                    if (g0VarJ == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(g0VarT2, g0VarJ);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                kVar3 = kVarK;
                                c3 = '\b';
                            }
                            j12 >>= c3;
                            i12++;
                            j11 = j10;
                            jArr3 = jArr2;
                            kVarK = kVar3;
                        }
                        jArr = jArr3;
                        kVar2 = kVarK;
                        if (i11 != 8) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        kVar2 = kVarK;
                    }
                    if (i10 == length) {
                        return map;
                    }
                    i10++;
                    j11 = j10;
                    jArr3 = jArr;
                    kVarK = kVar2;
                }
            }
        }
        return null;
    }

    public static final void d(g gVar) {
        long j10;
        if (f8052d.j(gVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(gVar.g());
        sb.append(", disposed=");
        sb.append(gVar.f8010c);
        sb.append(", applied=");
        c cVar = gVar instanceof c ? (c) gVar : null;
        sb.append(cVar != null ? Boolean.valueOf(cVar.f7994m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f8051c) {
            t1 t1Var = f8054f;
            j10 = t1Var.f1349a > 0 ? ((long[]) t1Var.f1351c)[0] : -1L;
        }
        sb.append(j10);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final k e(k kVar, long j10, long j11) {
        while (jc.l.h(j10, j11) < 0) {
            kVar = kVar.l(j10);
            j10 += (long) 1;
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(ic.k r17) {
        /*
            h1.b r0 = h1.n.f8058j
            java.lang.Object r1 = h1.n.f8051c
            monitor-enter(r1)
            o.l0 r2 = r0.f7989h     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lf
            f1.a r3 = h1.n.f8059k     // Catch: java.lang.Throwable -> L12
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L12
        Lf:
            r3 = r17
            goto L15
        L12:
            r0 = move-exception
            goto L9c
        L15:
            java.lang.Object r3 = w(r0, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L49
            r4 = -1
            java.lang.Object r5 = h1.n.f8056h     // Catch: java.lang.Throwable -> L3b
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L3b
            r7 = 0
        L28:
            if (r7 >= r6) goto L3d
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L3b
            ic.n r8 = (ic.n) r8     // Catch: java.lang.Throwable -> L3b
            z0.g r9 = new z0.g     // Catch: java.lang.Throwable -> L3b
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            r8.q(r9, r0)     // Catch: java.lang.Throwable -> L3b
            int r7 = r7 + 1
            goto L28
        L3b:
            r0 = move-exception
            goto L43
        L3d:
            f1.a r0 = h1.n.f8059k
            r0.addAndGet(r4)
            goto L49
        L43:
            f1.a r1 = h1.n.f8059k
            r1.addAndGet(r4)
            throw r0
        L49:
            java.lang.Object r4 = h1.n.f8051c
            monitor-enter(r4)
            g()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L98
            java.lang.Object[] r0 = r2.f16003b     // Catch: java.lang.Throwable -> L8b
            long[] r2 = r2.f16002a     // Catch: java.lang.Throwable -> L8b
            int r5 = r2.length     // Catch: java.lang.Throwable -> L8b
            int r5 = r5 + (-2)
            if (r5 < 0) goto L98
            r6 = 0
        L5b:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L8b
            long r9 = ~r7     // Catch: java.lang.Throwable -> L8b
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L93
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> L8b
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L75:
            if (r11 >= r9) goto L91
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L8d
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r0[r12]     // Catch: java.lang.Throwable -> L8b
            h1.e0 r12 = (h1.e0) r12     // Catch: java.lang.Throwable -> L8b
            r(r12)     // Catch: java.lang.Throwable -> L8b
            goto L8d
        L8b:
            r0 = move-exception
            goto L9a
        L8d:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L75
        L91:
            if (r9 != r10) goto L98
        L93:
            if (r6 == r5) goto L98
            int r6 = r6 + 1
            goto L5b
        L98:
            monitor-exit(r4)
            return r3
        L9a:
            monitor-exit(r4)
            throw r0
        L9c:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.n.f(ic.k):java.lang.Object");
    }

    public static final void g() {
        ah.j jVar = f8055g;
        int i10 = jVar.f390b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            f1.p pVar = ((f1.p[]) jVar.f392d)[i11];
            Object obj = pVar != null ? pVar.get() : null;
            if (obj != null && q((e0) obj)) {
                if (i12 != i11) {
                    ((f1.p[]) jVar.f392d)[i12] = pVar;
                    int[] iArr = (int[]) jVar.f391c;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((f1.p[]) jVar.f392d)[i13] = null;
            ((int[]) jVar.f391c)[i13] = 0;
        }
        if (i12 != i10) {
            jVar.f390b = i12;
        }
    }

    public static final g h(g gVar, ic.k kVar, boolean z10) {
        boolean z11 = gVar instanceof c;
        if (z11 || gVar == null) {
            return new j0(z11 ? (c) gVar : null, kVar, null, false, z10);
        }
        return new k0(gVar, kVar, false, z10);
    }

    public static final g0 i(g0 g0Var) {
        g0 g0VarT;
        g gVarK = k();
        g0 g0VarT2 = t(g0Var, gVarK.g(), gVarK.d());
        if (g0VarT2 != null) {
            return g0VarT2;
        }
        synchronized (f8051c) {
            g gVarK2 = k();
            g0VarT = t(g0Var, gVarK2.g(), gVarK2.d());
        }
        if (g0VarT != null) {
            return g0VarT;
        }
        s();
        throw null;
    }

    public static final g0 j(g0 g0Var, g gVar) {
        g0 g0VarT;
        g0 g0VarT2 = t(g0Var, gVar.g(), gVar.d());
        if (g0VarT2 != null) {
            return g0VarT2;
        }
        synchronized (f8051c) {
            g0VarT = t(g0Var, gVar.g(), gVar.d());
        }
        if (g0VarT != null) {
            return g0VarT;
        }
        s();
        throw null;
    }

    public static final g k() {
        g gVar = (g) f8050b.y();
        return gVar == null ? f8058j : gVar;
    }

    public static final ic.k l(ic.k kVar, ic.k kVar2, boolean z10) {
        if (!z10) {
            kVar2 = null;
        }
        return (kVar == null || kVar2 == null || kVar == kVar2) ? kVar == null ? kVar2 : kVar : new l(kVar, kVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h1.g0 m(h1.g0 r10, h1.e0 r11) {
        /*
            h1.g0 r0 = r11.a()
            long r1 = h1.n.f8053e
            b0.t1 r3 = h1.n.f8054f
            int r4 = r3.f1349a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f1351c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f8012a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L48
            int r7 = jc.l.h(r5, r1)
            if (r7 > 0) goto L48
            h1.k r7 = h1.k.f8034e
            boolean r5 = r7.j(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f8012a
            long r5 = r4.f8012a
            int r1 = jc.l.h(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            h1.g0 r0 = r0.f8013b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f8012a = r0
            return r3
        L55:
            h1.g0 r10 = r10.c(r0)
            h1.g0 r0 = r11.a()
            r10.f8013b = r0
            r11.i(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.n.m(h1.g0, h1.e0):h1.g0");
    }

    public static final g0 n(g0 g0Var, x0.c0 c0Var, g gVar) {
        g0 g0VarM;
        synchronized (f8051c) {
            g0VarM = m(g0Var, c0Var);
            g0VarM.a(g0Var);
            g0VarM.f8012a = gVar.g();
        }
        return g0VarM;
    }

    public static final void o(g gVar, e0 e0Var) {
        gVar.t(gVar.h() + 1);
        ic.k kVarI = gVar.i();
        if (kVarI != null) {
            kVarI.a(e0Var);
        }
    }

    public static final g0 p(g0 g0Var, f0 f0Var, g gVar, g0 g0Var2) {
        g0 g0VarM;
        if (gVar.f()) {
            gVar.n(f0Var);
        }
        long jG = gVar.g();
        if (g0Var2.f8012a == jG) {
            return g0Var2;
        }
        synchronized (f8051c) {
            g0VarM = m(g0Var, f0Var);
        }
        g0VarM.f8012a = jG;
        if (g0Var2.f8012a != 1) {
            gVar.n(f0Var);
        }
        return g0VarM;
    }

    public static final boolean q(e0 e0Var) {
        g0 g0Var;
        long j10 = f8053e;
        t1 t1Var = f8054f;
        if (t1Var.f1349a > 0) {
            j10 = ((long[]) t1Var.f1351c)[0];
        }
        g0 g0Var2 = null;
        g0 g0VarA = null;
        int i10 = 0;
        for (g0 g0VarA2 = e0Var.a(); g0VarA2 != null; g0VarA2 = g0VarA2.f8013b) {
            long j11 = g0VarA2.f8012a;
            if (j11 != 0) {
                if (jc.l.h(j11, j10) >= 0) {
                    i10++;
                } else if (g0Var2 == null) {
                    i10++;
                    g0Var2 = g0VarA2;
                } else {
                    if (jc.l.h(g0VarA2.f8012a, g0Var2.f8012a) < 0) {
                        g0Var = g0Var2;
                        g0Var2 = g0VarA2;
                    } else {
                        g0Var = g0VarA2;
                    }
                    if (g0VarA == null) {
                        g0VarA = e0Var.a();
                        g0 g0Var3 = g0VarA;
                        while (true) {
                            if (g0VarA == null) {
                                g0VarA = g0Var3;
                                break;
                            }
                            if (jc.l.h(g0VarA.f8012a, j10) >= 0) {
                                break;
                            }
                            if (jc.l.h(g0Var3.f8012a, g0VarA.f8012a) < 0) {
                                g0Var3 = g0VarA;
                            }
                            g0VarA = g0VarA.f8013b;
                        }
                    }
                    g0Var2.f8012a = 0L;
                    g0Var2.a(g0VarA);
                    g0Var2 = g0Var;
                }
            }
        }
        return i10 > 1;
    }

    public static final void r(e0 e0Var) {
        if (q(e0Var)) {
            ah.j jVar = f8055g;
            int i10 = jVar.f390b;
            int iIdentityHashCode = System.identityHashCode(e0Var);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = jVar.f390b - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i11 = -(i13 + 1);
                        break;
                    }
                    int i14 = (i13 + i12) >>> 1;
                    int i15 = ((int[]) jVar.f391c)[i14];
                    if (i15 < iIdentityHashCode) {
                        i13 = i14 + 1;
                    } else if (i15 > iIdentityHashCode) {
                        i12 = i14 - 1;
                    } else {
                        f1.p pVar = ((f1.p[]) jVar.f392d)[i14];
                        if (e0Var == (pVar != null ? pVar.get() : null)) {
                            i11 = i14;
                        } else {
                            for (int i16 = i14 - 1; -1 < i16 && ((int[]) jVar.f391c)[i16] == iIdentityHashCode; i16--) {
                                f1.p pVar2 = ((f1.p[]) jVar.f392d)[i16];
                                if ((pVar2 != null ? pVar2.get() : null) == e0Var) {
                                    i11 = i16;
                                    break;
                                }
                            }
                            i14++;
                            int i17 = jVar.f390b;
                            while (true) {
                                if (i14 >= i17) {
                                    i11 = -(jVar.f390b + 1);
                                    break;
                                } else {
                                    if (((int[]) jVar.f391c)[i14] != iIdentityHashCode) {
                                        i11 = -(i14 + 1);
                                        break;
                                    }
                                    f1.p pVar3 = ((f1.p[]) jVar.f392d)[i14];
                                    if ((pVar3 != null ? pVar3.get() : null) == e0Var) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                            i11 = i14;
                        }
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            f1.p[] pVarArr = (f1.p[]) jVar.f392d;
            int length = pVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                f1.p[] pVarArr2 = new f1.p[i19];
                int[] iArr = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(pVarArr, i18, pVarArr2, i20, i10 - i18);
                System.arraycopy((f1.p[]) jVar.f392d, 0, pVarArr2, 0, i18);
                vb.l.h0(i20, i18, i10, (int[]) jVar.f391c, iArr);
                vb.l.l0(0, i18, 6, (int[]) jVar.f391c, iArr);
                jVar.f392d = pVarArr2;
                jVar.f391c = iArr;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(pVarArr, i18, pVarArr, i21, i10 - i18);
                int[] iArr2 = (int[]) jVar.f391c;
                vb.l.h0(i21, i18, i10, iArr2, iArr2);
            }
            ((f1.p[]) jVar.f392d)[i18] = new f1.p(e0Var);
            ((int[]) jVar.f391c)[i18] = iIdentityHashCode;
            jVar.f390b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final g0 t(g0 g0Var, long j10, k kVar) {
        g0 g0Var2 = null;
        while (g0Var != null) {
            long j11 = g0Var.f8012a;
            if (j11 != 0 && jc.l.h(j11, j10) <= 0 && !kVar.j(j11) && (g0Var2 == null || jc.l.h(g0Var2.f8012a, g0Var.f8012a) < 0)) {
                g0Var2 = g0Var;
            }
            g0Var = g0Var.f8013b;
        }
        if (g0Var2 != null) {
            return g0Var2;
        }
        return null;
    }

    public static final g0 u(g0 g0Var, e0 e0Var) {
        g0 g0VarT;
        g gVarK = k();
        ic.k kVarE = gVarK.e();
        if (kVarE != null) {
            kVarE.a(e0Var);
        }
        g0 g0VarT2 = t(g0Var, gVarK.g(), gVarK.d());
        if (g0VarT2 != null) {
            return g0VarT2;
        }
        synchronized (f8051c) {
            g gVarK2 = k();
            g0 g0VarA = e0Var.a();
            jc.l.c(g0VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            g0VarT = t(g0VarA, gVarK2.g(), gVarK2.d());
            if (g0VarT == null) {
                s();
                throw null;
            }
        }
        return g0VarT;
    }

    public static final void v(int i10) {
        t1 t1Var = f8054f;
        int i11 = ((int[]) t1Var.f1353e)[i10];
        t1Var.b(i11, t1Var.f1349a - 1);
        t1Var.f1349a--;
        long[] jArr = (long[]) t1Var.f1351c;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (jc.l.h(jArr[i13], j10) <= 0) {
                break;
            }
            t1Var.b(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = (long[]) t1Var.f1351c;
        int i14 = t1Var.f1349a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < t1Var.f1349a && jc.l.h(jArr2[i15], jArr2[i16]) < 0) {
                if (jc.l.h(jArr2[i15], jArr2[i11]) >= 0) {
                    break;
                }
                t1Var.b(i15, i11);
                i11 = i15;
            } else {
                if (jc.l.h(jArr2[i16], jArr2[i11]) >= 0) {
                    break;
                }
                t1Var.b(i16, i11);
                i11 = i16;
            }
        }
        ((int[]) t1Var.f1353e)[i10] = t1Var.f1350b;
        t1Var.f1350b = i10;
    }

    public static final Object w(b bVar, ic.k kVar) {
        long j10 = bVar.f8009b;
        Object objA = kVar.a(f8052d.i(j10));
        long j11 = f8053e;
        f8053e = ((long) 1) + j11;
        k kVarI = f8052d.i(j10);
        f8052d = kVarI;
        bVar.f8009b = j11;
        bVar.f8008a = kVarI;
        bVar.f7988g = 0;
        bVar.f7989h = null;
        bVar.o();
        f8052d = f8052d.l(j11);
        return objA;
    }

    public static final g0 x(g0 g0Var, e0 e0Var, g gVar) {
        g0 g0VarT;
        if (gVar.f()) {
            gVar.n(e0Var);
        }
        long jG = gVar.g();
        g0 g0VarT2 = t(g0Var, jG, gVar.d());
        if (g0VarT2 == null) {
            s();
            throw null;
        }
        if (g0VarT2.f8012a == gVar.g()) {
            return g0VarT2;
        }
        synchronized (f8051c) {
            g0VarT = t(e0Var.a(), jG, gVar.d());
            if (g0VarT == null) {
                s();
                throw null;
            }
            if (g0VarT.f8012a != jG) {
                g0 g0VarM = m(g0VarT, e0Var);
                g0VarM.a(g0VarT);
                g0VarM.f8012a = gVar.g();
                g0VarT = g0VarM;
            }
        }
        if (g0VarT2.f8012a != 1) {
            gVar.n(e0Var);
        }
        return g0VarT;
    }
}
