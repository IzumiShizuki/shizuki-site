package h1;

import java.util.HashMap;
import o.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f8077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o.f0 f8079c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8086j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8080d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.k0 f8081e = ud.b.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o.k0 f8082f = new o.k0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f8083g = new l0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0.e f8084h = new z0.e(new x0.c0[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f8085i = new w(0, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o.k0 f8087k = ud.b.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f8088l = new HashMap();

    public x(ic.k kVar) {
        this.f8077a = kVar;
    }

    public final void a(Object obj, e7.y yVar, ic.a aVar) {
        int i10;
        char c3;
        Object obj2 = this.f8078b;
        o.f0 f0Var = this.f8079c;
        int i11 = this.f8080d;
        this.f8078b = obj;
        this.f8079c = (o.f0) this.f8082f.g(obj);
        if (this.f8080d == -1) {
            long jG = n.k().g();
            this.f8080d = (int) (jG ^ (jG >>> 32));
        }
        w wVar = this.f8085i;
        z0.e eVarN = x0.v.n();
        try {
            eVarN.b(wVar);
            t.i(aVar, yVar);
            eVarN.k(eVarN.f26374c - 1);
            Object obj3 = this.f8078b;
            jc.l.b(obj3);
            int i12 = this.f8080d;
            o.f0 f0Var2 = this.f8079c;
            if (f0Var2 != null) {
                long[] jArr = f0Var2.f15953a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j10 & 255) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    c3 = '\b';
                                    Object obj4 = f0Var2.f15954b[i16];
                                    i10 = i15;
                                    boolean z10 = f0Var2.f15955c[i16] != i12;
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        f0Var2.g(i16);
                                    }
                                } else {
                                    i10 = i15;
                                    c3 = '\b';
                                }
                                j10 >>= c3;
                                i15 = i10 + 1;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            this.f8078b = obj2;
            this.f8079c = f0Var;
            this.f8080d = i11;
        } catch (Throwable th2) {
            eVarN.k(eVarN.f26374c - 1);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0274 A[PHI: r13
      0x0274: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x024d, B:117:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0495 A[PHI: r13
      0x0495: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x046e, B:218:0x0493] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f2 A[EDGE_INSN: B:241:0x04f2->B:321:0x04fb BREAK  A[LOOP:18: B:231:0x04c1->B:242:0x04f4], PHI: r13
      0x04f2: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04cb, B:240:0x04f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130 A[PHI: r33
      0x0130: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x0105, B:56:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207 A[PHI: r13
      0x0207: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e0, B:93:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r47) {
        /*
            Method dump skipped, instruction units count: 1509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x.b(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r22, int r23, java.lang.Object r24, o.f0 r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            int r4 = r0.f8086j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f15955c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f15954b
            r7[r4] = r1
            int[] r3 = r3.f15955c
            r3[r4] = r2
            boolean r3 = r1 instanceof x0.c0
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            x0.c0 r2 = (x0.c0) r2
            x0.b0 r2 = r2.f()
            java.util.HashMap r3 = r0.f8088l
            java.lang.Object r7 = r2.f24251f
            r3.put(r1, r7)
            o.f0 r2 = r2.f24250e
            o.k0 r3 = r0.f8087k
            ud.b.F(r3, r1)
            java.lang.Object[] r7 = r2.f15954b
            long[] r2 = r2.f15953a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            h1.e0 r9 = (h1.e0) r9
            boolean r5 = r9 instanceof h1.f0
            if (r5 == 0) goto L82
            r5 = r9
            h1.f0 r5 = (h1.f0) r5
            r5.d(r4)
        L82:
            ud.b.b(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof h1.f0
            if (r2 == 0) goto L9d
            r2 = r1
            h1.f0 r2 = (h1.f0) r2
            r2.d(r4)
        L9d:
            o.k0 r2 = r0.f8081e
            r3 = r24
            ud.b.b(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x.c(java.lang.Object, int, java.lang.Object, o.f0):void");
    }

    public final void d(Object obj, Object obj2) {
        o.k0 k0Var = this.f8081e;
        ud.b.E(k0Var, obj2, obj);
        if (!(obj2 instanceof x0.c0) || k0Var.c(obj2)) {
            return;
        }
        ud.b.F(this.f8087k, obj2);
        this.f8088l.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x.e():void");
    }
}
