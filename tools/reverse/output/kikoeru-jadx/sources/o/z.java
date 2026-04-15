package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16077e;

    public z(int i10) {
        this.f16073a = s0.f16040a;
        this.f16074b = o.f16027a;
        if (i10 >= 0) {
            d(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r21 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & r21) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r37.f16077e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (((r37.f16073a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r28 = r10;
        r26 = 255;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r3 = r37.f16075c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16076d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r3 = r37.f16073a;
        r4 = r37.f16075c;
        r6 = r37.f16074b;
        r7 = (r4 + 7) >> 3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r8 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r9 = r3[r8] & r21;
        r3[r8] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r8 = r8 + 1;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        r28 = r10;
        r26 = r12;
        r7 = vb.l.x0(r3);
        r8 = r7 - 1;
        r11 = 72057594037927935L;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r8 = r7 >> 3;
        r21 = (r7 & 7) << 3;
        r9 = (r3[r8] >> r21) & r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011d, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        if (r9 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        r9 = r6[r7] * r14;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r22 = c(r10);
        r10 = r10 & r4;
        r31 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0142, code lost:
    
        if ((((r22 - r10) & r4) / 8) != (((r7 - r10) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0144, code lost:
    
        r3[r8] = (((long) (r9 & 127)) << r21) | (r3[r8] & (~(r26 << r21)));
        r3[r3.length - 1] = (r3[0] & r31) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
    
        r11 = r31;
        r14 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016a, code lost:
    
        r10 = r22 >> 3;
        r11 = r3[r10];
        r13 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017d, code lost:
    
        if (((r11 >> r13) & r26) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
    
        r14 = r6;
        r34 = r7;
        r3[r10] = ((~(r26 << r13)) & r11) | (((long) (r9 & 127)) << r13);
        r3[r8] = (r3[r8] & (~(r26 << r21))) | (128 << r21);
        r14[r22] = r14[r34];
        r14[r34] = 0;
        r7 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a4, code lost:
    
        r14 = r6;
        r34 = r7;
        r3[r10] = (((long) (r9 & 127)) << r13) | ((~(r26 << r13)) & r11);
        r6 = r14[r22];
        r14[r22] = r14[r34];
        r14[r34] = r6;
        r7 = r34 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bc, code lost:
    
        r3[r3.length - 1] = (r3[0] & r31) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c9, code lost:
    
        r37.f16077e = o.s0.a(r37.f16075c) - r37.f16076d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d8, code lost:
    
        r28 = r10;
        r26 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e2, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
    
        r3 = o.s0.b(r37.f16075c);
        r4 = r37.f16073a;
        r6 = r37.f16074b;
        r7 = r37.f16075c;
        d(r3);
        r3 = r37.f16073a;
        r8 = r37.f16074b;
        r9 = r37.f16075c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fb, code lost:
    
        if (r10 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020a, code lost:
    
        if (((r4[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020c, code lost:
    
        r11 = r6[r10];
        r12 = r11 * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r13 = c(r12 >>> 7);
        r19 = r3;
        r14 = r4;
        r3 = r12 & 127;
        r12 = r13 >> 3;
        r20 = (r13 & 7) << 3;
        r3 = (r19[r12] & (~(255 << r20))) | (r3 << r20);
        r19[r12] = r3;
        r19[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r13] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0242, code lost:
    
        r19 = r3;
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0245, code lost:
    
        r10 = r10 + 1;
        r4 = r14;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024b, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x024f, code lost:
    
        r37.f16076d++;
        r4 = r37.f16077e;
        r5 = r37.f16073a;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0266, code lost:
    
        if (((r7 >> r9) & r26) != r17) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0268, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x026a, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026b, code lost:
    
        r37.f16077e = r4 - r10;
        r4 = r37.f16075c;
        r7 = (r7 & (~(r26 << r9))) | (r28 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r38) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f16075c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = 0
        L15:
            long[] r7 = r0.f16073a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L42:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f16074b
            r15 = r15[r11]
            if (r15 != r1) goto L57
            goto L67
        L57:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L42
        L5d:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L6b
            r11 = -1
        L67:
            if (r11 < 0) goto L6a
            return r12
        L6a:
            return r5
        L6b:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.b(int):boolean");
    }

    public final int c(int i10) {
        int i11 = this.f16075c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f16073a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f16075c = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f16073a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f16077e = s0.a(this.f16075c) - this.f16076d;
        this.f16074b = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f16075c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = 0
        L15:
            long[] r7 = r0.f16073a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L42:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f16074b
            r15 = r15[r11]
            if (r15 != r1) goto L57
            goto L67
        L57:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L42
        L5d:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L70
            r11 = -1
        L67:
            if (r11 < 0) goto L6a
            r5 = 1
        L6a:
            if (r5 == 0) goto L6f
            r0.f(r11)
        L6f:
            return r5
        L70:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.e(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof o.z
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.z r1 = (o.z) r1
            int r3 = r1.f16076d
            int r5 = r0.f16076d
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16074b
            long[] r5 = r0.f16073a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = 0
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.b(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        this.f16076d--;
        long[] jArr = this.f16073a;
        int i11 = this.f16075c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final int hashCode() {
        int[] iArr = this.f16074b;
        long[] jArr = this.f16073a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        i11 += iArr[(i10 << 3) + i13];
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int[] r2 = r0.f16074b
            long[] r3 = r0.f16073a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = 0
            r7 = 0
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            jc.l.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.toString():java.lang.String");
    }

    public /* synthetic */ z() {
        this(6);
    }
}
