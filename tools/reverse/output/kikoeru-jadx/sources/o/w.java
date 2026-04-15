package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f16064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16067f;

    public w(int i10) {
        this.f16062a = s0.f16040a;
        int[] iArr = o.f16027a;
        this.f16063b = iArr;
        this.f16064c = iArr;
        if (i10 >= 0) {
            e(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f16066e = 0;
        long[] jArr = this.f16062a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16062a;
            int i10 = this.f16065d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f16067f = s0.a(this.f16065d) - this.f16066e;
    }

    public final int b(int i10) {
        int i11 = this.f16065d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f16062a;
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

    public final int c(int i10) {
        int i11 = (-862048943) * i10;
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f16065d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f16062a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (((long) i13) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i14;
                if (this.f16063b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int d(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            return this.f16064c[iC];
        }
        return -1;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f16065d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f16062a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f16067f = s0.a(this.f16065d) - this.f16066e;
        this.f16063b = new int[iMax];
        this.f16064c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof o.w
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.w r1 = (o.w) r1
            int r3 = r1.f16066e
            int r5 = r0.f16066e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f16063b
            int[] r5 = r0.f16064c
            long[] r6 = r0.f16062a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L72
            r8 = 0
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L6a
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L65
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r15 < 0) goto L5d
            r16 = 1
            int[] r2 = r1.f16064c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = 1
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = 1
            goto L3d
        L65:
            r16 = 1
            if (r11 != r12) goto L74
            goto L6c
        L6a:
            r16 = 1
        L6c:
            if (r8 == r7) goto L74
            int r8 = r8 + 1
            r2 = 1
            goto L23
        L72:
            r16 = 1
        L74:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        r20 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        if (((((~r7) << 6) & r7) & r20) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (r37.f16067f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (((r37.f16062a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        r28 = 255;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r2 = r37.f16065d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (java.lang.Long.compare((((long) r37.f16066e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r2 = r37.f16062a;
        r3 = r37.f16065d;
        r5 = r37.f16063b;
        r6 = r37.f16064c;
        r7 = (r3 + 7) >> 3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r8 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d6, code lost:
    
        r28 = r11;
        r11 = r2[r8] & r20;
        r2[r8] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r8 = r8 + 1;
        r11 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f6, code lost:
    
        r28 = r11;
        r7 = vb.l.x0(r2);
        r8 = r7 - 1;
        r13 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0116, code lost:
    
        if (r7 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0118, code lost:
    
        r8 = r7 >> 3;
        r20 = (r7 & 7) << 3;
        r11 = (r2[r8] >> r20) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0126, code lost:
    
        if (r11 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0128, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012d, code lost:
    
        if (r11 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0130, code lost:
    
        r11 = r5[r7] * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r12 = r11 >>> 7;
        r21 = b(r12);
        r12 = r12 & r3;
        r31 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014b, code lost:
    
        if ((((r21 - r12) & r3) / 8) != (((r7 - r12) & r3) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
    
        r30 = r5;
        r33 = r6;
        r2[r8] = ((~(r28 << r20)) & r2[r8]) | (((long) (r11 & 127)) << r20);
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016a, code lost:
    
        r7 = r7 + 1;
        r5 = r30;
        r13 = r31;
        r6 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0173, code lost:
    
        r30 = r5;
        r33 = r6;
        r5 = r21 >> 3;
        r12 = r2[r5];
        r6 = (r21 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0185, code lost:
    
        if (((r12 >> r6) & r28) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        r2[r5] = ((~(r28 << r6)) & r12) | (((long) (r11 & 127)) << r6);
        r2[r8] = (r2[r8] & (~(r28 << r20))) | (128 << r20);
        r30[r21] = r30[r7];
        r30[r7] = 0;
        r33[r21] = r33[r7];
        r33[r7] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b0, code lost:
    
        r2[r5] = ((~(r28 << r6)) & r12) | (((long) (r11 & 127)) << r6);
        r5 = r30[r21];
        r30[r21] = r30[r7];
        r30[r7] = r5;
        r5 = r33[r21];
        r33[r21] = r33[r7];
        r33[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d3, code lost:
    
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01df, code lost:
    
        r37.f16067f = o.s0.a(r37.f16065d) - r37.f16066e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ec, code lost:
    
        r28 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f6, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
    
        r2 = o.s0.b(r37.f16065d);
        r3 = r37.f16062a;
        r5 = r37.f16063b;
        r6 = r37.f16064c;
        r7 = r37.f16065d;
        e(r2);
        r2 = r37.f16062a;
        r8 = r37.f16063b;
        r11 = r37.f16064c;
        r12 = r37.f16065d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0213, code lost:
    
        if (r13 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0223, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r16) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0225, code lost:
    
        r14 = r5[r13];
        r18 = r14 * (-862048943);
        r18 = r18 ^ (r18 << 16);
        r15 = b(r18 >>> 7);
        r1 = r18 & 127;
        r18 = r2;
        r19 = r15 >> 3;
        r21 = (r15 & 7) << 3;
        r1 = (r18[r19] & (~(255 << r21))) | (((long) r1) << r21);
        r18[r19] = r1;
        r18[(((r15 - 7) & r12) + (r12 & 7)) >> 3] = r1;
        r8[r15] = r14;
        r11[r15] = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0260, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0262, code lost:
    
        r13 = r13 + 1;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x026a, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026e, code lost:
    
        r37.f16066e++;
        r1 = r37.f16067f;
        r3 = r37.f16062a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0286, code lost:
    
        if (((r5 >> r7) & r28) != r16) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0288, code lost:
    
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028b, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028d, code lost:
    
        r37.f16067f = r1 - r20;
        r1 = r37.f16065d;
        r5 = (r5 & (~(r28 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f16063b;
        int[] iArr2 = this.f16064c;
        long[] jArr = this.f16062a;
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
                        int i14 = (i10 << 3) + i13;
                        i11 += iArr2[i14] ^ iArr[i14];
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f16066e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f16063b
            int[] r3 = r0.f16064c
            long[] r4 = r0.f16062a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = 0
            r8 = 0
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f16066e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            jc.l.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.w.toString():java.lang.String");
    }

    public /* synthetic */ w() {
        this(6);
    }
}
