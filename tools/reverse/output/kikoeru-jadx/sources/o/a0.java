package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15916a = s0.f16040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15917b = r.f16034a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15918c = o.f16027a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15921f;

    public a0(int i10) {
        if (i10 >= 0) {
            d(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f15919d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15916a;
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

    public final int b(long j10) {
        int i10 = ((int) ((j10 >>> 32) ^ j10)) * (-862048943);
        int i11 = (i10 << 16) ^ i10;
        int i12 = i11 & 127;
        int i13 = this.f15919d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f15916a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f15917b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(long j10) {
        int iB = b(j10);
        if (iB >= 0) {
            return this.f15918c[iB];
        }
        p.a.e("Cannot find value for key " + j10);
        throw null;
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f15919d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f15916a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f15921f = s0.a(this.f15919d) - this.f15920e;
        this.f15917b = new long[iMax];
        this.f15918c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        r20 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
    
        if (((r1 & ((~r1) << 6)) & r20) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0084, code lost:
    
        r1 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        if (r39.f15921f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        if (((r39.f15916a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        r28 = 255;
        r22 = 128;
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        r1 = r39.f15919d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r1 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        if (java.lang.Long.compare((((long) r39.f15920e) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        r1 = r39.f15916a;
        r2 = r39.f15919d;
        r5 = r39.f15917b;
        r6 = r39.f15918c;
        r8 = (r2 + 7) >> 3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00db, code lost:
    
        if (r3 >= r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        r7 = r1[r3] & r20;
        r1[r3] = (-72340172838076674L) & ((~r7) + (r7 >>> 7));
        r3 = r3 + 1;
        r11 = r11;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fc, code lost:
    
        r28 = r11;
        r3 = vb.l.x0(r1);
        r7 = r3 - 1;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r3] = r1[0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
    
        if (r3 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        r7 = r3 >> 3;
        r8 = (r3 & 7) << 3;
        r11 = (r1[r7] >> r8) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0129, code lost:
    
        if (r11 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0130, code lost:
    
        if (r11 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        r11 = r5[r3];
        r12 = ((int) (r11 ^ (r11 >>> r15))) * (-862048943);
        r11 = (r12 << 16) ^ r12;
        r12 = r11 >>> 7;
        r31 = a(r12);
        r12 = r12 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0153, code lost:
    
        if ((((r31 - r12) & r2) / 8) != (((r3 - r12) & r2) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0155, code lost:
    
        r1[r7] = (((long) (r11 & 127)) << r8) | (r1[r7] & (~(r28 << r8)));
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0172, code lost:
    
        r15 = ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0177, code lost:
    
        r12 = r31 >> 3;
        r14 = r1[r12];
        r32 = (r31 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0188, code lost:
    
        if (((r14 >> r32) & r28) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018a, code lost:
    
        r15 = r2;
        r38 = r3;
        r1[r12] = (r14 & (~(r28 << r32))) | (((long) (r11 & 127)) << r32);
        r1[r7] = (r1[r7] & (~(r28 << r8))) | (128 << r8);
        r5[r31] = r5[r38];
        r5[r38] = 0;
        r6[r31] = r6[r38];
        r6[r38] = 0;
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b8, code lost:
    
        r38 = r3;
        r15 = r2;
        r1[r12] = (((long) (r11 & 127)) << r32) | (r14 & (~(r28 << r32)));
        r2 = r5[r31];
        r5[r31] = r5[r38];
        r5[r38] = r2;
        r2 = r6[r31];
        r6[r31] = r6[r38];
        r6[r38] = r2;
        r3 = r38 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01de, code lost:
    
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r3 = r3 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ed, code lost:
    
        r33 = 0;
        r39.f15921f = o.s0.a(r39.f15919d) - r39.f15920e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fe, code lost:
    
        r28 = 255;
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0209, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020c, code lost:
    
        r1 = o.s0.b(r39.f15919d);
        r2 = r39.f15916a;
        r3 = r39.f15917b;
        r5 = r39.f15918c;
        r6 = r39.f15919d;
        d(r1);
        r1 = r39.f15916a;
        r7 = r39.f15917b;
        r8 = r39.f15918c;
        r11 = r39.f15919d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0226, code lost:
    
        if (r12 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0235, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r22) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0237, code lost:
    
        r13 = r3[r12];
        r20 = r1;
        r15 = r2;
        r2 = ((int) (r13 ^ (r13 >>> 32))) * (-862048943);
        r1 = (r2 << 16) ^ r2;
        r2 = a(r1 >>> 7);
        r18 = r2 >> 3;
        r21 = (r2 & 7) << 3;
        r1 = (r20[r18] & (~(255 << r21))) | (((long) (r1 & 127)) << r21);
        r20[r18] = r1;
        r20[(((r2 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r7[r2] = r13;
        r8[r2] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0279, code lost:
    
        r20 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027c, code lost:
    
        r12 = r12 + 1;
        r2 = r15;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0282, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0286, code lost:
    
        r39.f15920e++;
        r2 = r39.f15921f;
        r3 = r39.f15916a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x029e, code lost:
    
        if (((r5 >> r7) & r28) != r22) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a0, code lost:
    
        r33 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02a2, code lost:
    
        r39.f15921f = r2 - r33;
        r2 = r39.f15919d;
        r5 = (r5 & (~(r28 << r7))) | (r9 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r40, long r41) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a0.e(int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
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
            boolean r3 = r1 instanceof o.a0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.a0 r1 = (o.a0) r1
            int r3 = r1.f15920e
            int r5 = r0.f15920e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f15917b
            int[] r5 = r0.f15918c
            long[] r6 = r0.f15916a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7a
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
            if (r15 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L5f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r16 = r3
            r15 = 1
            r2 = r16[r14]
            r14 = r5[r14]
            int r2 = r1.b(r2)
            if (r2 < 0) goto L5e
            int[] r3 = r1.f15918c
            r2 = r3[r2]
            if (r14 == r2) goto L62
        L5e:
            return r4
        L5f:
            r16 = r3
            r15 = 1
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r3 = r16
            r2 = 1
            goto L3d
        L69:
            r16 = r3
            r15 = 1
            if (r11 != r12) goto L7b
            goto L72
        L6f:
            r16 = r3
            r15 = 1
        L72:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            r3 = r16
            r2 = 1
            goto L23
        L7a:
            r15 = 1
        L7b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f15917b;
        int[] iArr = this.f15918c;
        long[] jArr2 = this.f15916a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j11 = jArr[i14];
                        i11 += iArr[i14] ^ ((int) (j11 ^ (j11 >>> 32)));
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f15920e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f15917b;
        int[] iArr = this.f15918c;
        long[] jArr2 = this.f15916a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            int i17 = iArr[i16];
                            sb.append(j11);
                            sb.append("=");
                            sb.append(i17);
                            i13++;
                            if (i13 < this.f15920e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i18 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
