package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15944a = s0.f16040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15945b = p.a.f16476c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f15946c = i.f15982a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15949f;

    public e0(int i10) {
        if (i10 >= 0) {
            c(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f15947d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15944a;
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

    public final int b(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f15947d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f15944a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (jc.l.a(this.f15945b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f15947d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f15944a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f15949f = s0.a(this.f15947d) - this.f15948e;
        this.f15945b = new Object[iMax];
        this.f15946c = new float[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r38.f15949f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (((r38.f15944a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        r26 = 255;
        r30 = r11;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        r2 = r38.f15947d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
    
        if (r2 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (java.lang.Long.compare((((long) r38.f15948e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r2 = r38.f15944a;
        r3 = r38.f15947d;
        r6 = r38.f15945b;
        r7 = r38.f15946c;
        r4 = (r3 + 7) >> 3;
        r26 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r8 >= r4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        r30 = r11;
        r4 = vb.l.x0(r2);
        r8 = r4 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r4] = r2[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (r4 == r3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        r8 = r4 >> 3;
        r14 = (r4 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0129, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        if (r10 == 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0133, code lost:
    
        r10 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0137, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        r10 = r10 * (-862048943);
        r10 = r10 ^ (r10 << 16);
        r11 = r10 >>> 7;
        r19 = a(r11);
        r11 = r11 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0156, code lost:
    
        if ((((r19 - r11) & r3) / 8) != (((r4 - r11) & r3) / 8)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        r34 = r12;
        r2[r8] = (((long) (r10 & 127)) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r34) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0175, code lost:
    
        r12 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0179, code lost:
    
        r34 = r12;
        r9 = r19 >> 3;
        r11 = r2[r9];
        r13 = (r19 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0189, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018b, code lost:
    
        r28 = r3;
        r32 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r6[r19] = r6[r32];
        r6[r32] = null;
        r7[r19] = r7[r32];
        r7[r32] = 0.0f;
        r4 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        r28 = r3;
        r32 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r3 = r6[r19];
        r6[r19] = r6[r32];
        r6[r32] = r3;
        r3 = r7[r19];
        r7[r19] = r7[r32];
        r7[r32] = r3;
        r4 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01dd, code lost:
    
        r2[r2.length - 1] = (r2[0] & r34) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ed, code lost:
    
        r38.f15949f = o.s0.a(r38.f15947d) - r38.f15948e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01fc, code lost:
    
        r26 = 255;
        r30 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0206, code lost:
    
        r2 = o.s0.b(r38.f15947d);
        r3 = r38.f15944a;
        r4 = r38.f15945b;
        r6 = r38.f15946c;
        r7 = r38.f15947d;
        c(r2);
        r2 = r38.f15944a;
        r8 = r38.f15945b;
        r9 = r38.f15946c;
        r10 = r38.f15947d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0220, code lost:
    
        if (r11 >= r7) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022f, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r17) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0231, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0233, code lost:
    
        if (r12 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0235, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023a, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023b, code lost:
    
        r13 = r13 * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r19 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r19[r13] & (~(255 << r21))) | (r1 << r21);
        r19[r13] = r1;
        r19[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0272, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0274, code lost:
    
        r11 = r11 + 1;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027b, code lost:
    
        r2 = a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027f, code lost:
    
        r38.f15948e++;
        r1 = r38.f15949f;
        r3 = r38.f15944a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0297, code lost:
    
        if (((r5 >> r7) & r26) != r17) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0299, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x029a, code lost:
    
        r38.f15949f = r1 - r15;
        r1 = r38.f15947d;
        r5 = (r5 & (~(r26 << r7))) | (r30 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r39, float r40) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e0.d(java.lang.String, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof o.e0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.e0 r1 = (o.e0) r1
            int r3 = r1.f15948e
            int r5 = r0.f15948e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f15945b
            float[] r5 = r0.f15946c
            long[] r6 = r0.f15944a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L75
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
            if (r15 == 0) goto L6d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L61
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.b(r15)
            if (r15 < 0) goto L60
            r16 = 1
            float[] r2 = r1.f15946c
            r2 = r2[r15]
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L60
            goto L63
        L60:
            return r4
        L61:
            r16 = 1
        L63:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = 1
            goto L3d
        L68:
            r16 = 1
            if (r11 != r12) goto L77
            goto L6f
        L6d:
            r16 = 1
        L6f:
            if (r8 == r7) goto L77
            int r8 = r8 + 1
            r2 = 1
            goto L23
        L75:
            r16 = 1
        L77:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f15945b;
        float[] fArr = this.f15946c;
        long[] jArr = this.f15944a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iFloatToIntBits = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iFloatToIntBits += Float.floatToIntBits(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i10 == length) {
                return iFloatToIntBits;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f15948e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f15945b
            float[] r3 = r0.f15946c
            long[] r4 = r0.f15944a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
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
            if (r15 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f15948e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            jc.l.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e0.toString():java.lang.String");
    }
}
