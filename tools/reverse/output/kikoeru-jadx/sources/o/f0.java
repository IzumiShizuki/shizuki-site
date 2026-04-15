package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15958f;

    public f0(int i10) {
        this.f15953a = s0.f16040a;
        this.f15954b = p.a.f16476c;
        this.f15955c = o.f16027a;
        if (i10 >= 0) {
            f(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f15957e = 0;
        long[] jArr = this.f15953a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15953a;
            int i10 = this.f15956d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vb.l.p0(0, this.f15956d, this.f15954b);
        this.f15958f = s0.a(this.f15956d) - this.f15957e;
    }

    public final int b(int i10) {
        int i11 = this.f15956d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15953a;
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

    public final int c(Object obj) {
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f15956d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f15953a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j14 = i13;
            int i19 = i13;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j16) >> 3)) & i14;
                if (jc.l.a(this.f15954b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                long j17 = 255;
                if (this.f15958f != 0 || ((this.f15953a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i20 = this.f15956d;
                    if (i20 <= 8 || Long.compare((((long) this.f15957e) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = 255;
                        j11 = j14;
                        j12 = 128;
                        int iB2 = s0.b(this.f15956d);
                        long[] jArr4 = this.f15953a;
                        Object[] objArr2 = this.f15954b;
                        int[] iArr = this.f15955c;
                        int i21 = this.f15956d;
                        f(iB2);
                        long[] jArr5 = this.f15953a;
                        Object[] objArr3 = this.f15954b;
                        int[] iArr2 = this.f15955c;
                        int i22 = this.f15956d;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr4[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iB3 = b(i24 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j18 = i24 & 127;
                                int i25 = iB3 >> 3;
                                int i26 = (iB3 & 7) << 3;
                                long j19 = (jArr[i25] & (~(255 << i26))) | (j18 << i26);
                                jArr[i25] = j19;
                                jArr[(((iB3 - 7) & i22) + (i22 & 7)) >> 3] = j19;
                                objArr3[iB3] = obj2;
                                iArr2[iB3] = iArr[i23];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i23++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f15953a;
                        int i27 = this.f15956d;
                        Object[] objArr4 = this.f15954b;
                        int[] iArr3 = this.f15955c;
                        j12 = 128;
                        int i28 = (i27 + 7) >> 3;
                        int i29 = 0;
                        while (i29 < i28) {
                            long j20 = j17;
                            long j21 = jArr6[i29] & (-9187201950435737472L);
                            jArr6[i29] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                            i29++;
                            j14 = j14;
                            j17 = j20;
                        }
                        j10 = j17;
                        j11 = j14;
                        int i30 = 8;
                        int iX0 = vb.l.x0(jArr6);
                        int i31 = iX0 - 1;
                        long j22 = 72057594037927935L;
                        jArr6[i31] = (jArr6[i31] & 72057594037927935L) | (-72057594037927936L);
                        jArr6[iX0] = jArr6[0];
                        int i32 = 0;
                        while (i32 != i27) {
                            int i33 = i32 >> 3;
                            int i34 = (i32 & 7) << 3;
                            long j23 = (jArr6[i33] >> i34) & j10;
                            if (j23 != 128 && j23 == 254) {
                                Object obj3 = objArr4[i32];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i35 = iHashCode3 ^ (iHashCode3 << 16);
                                int i36 = i35 >>> 7;
                                int iB4 = b(i36);
                                int i37 = i36 & i27;
                                long j24 = j22;
                                if (((iB4 - i37) & i27) / 8 == ((i32 - i37) & i27) / i30) {
                                    jArr6[i33] = (((long) (i35 & 127)) << i34) | (jArr6[i33] & (~(j10 << i34)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & j24) | Long.MIN_VALUE;
                                    i32++;
                                    j22 = j24;
                                } else {
                                    int i38 = iB4 >> 3;
                                    long j25 = jArr6[i38];
                                    int i39 = (iB4 & 7) << 3;
                                    if (((j25 >> i39) & j10) == 128) {
                                        i10 = i27;
                                        objArr = objArr4;
                                        jArr6[i38] = ((~(j10 << i39)) & j25) | (((long) (i35 & 127)) << i39);
                                        jArr6[i33] = (jArr6[i33] & (~(j10 << i34))) | (128 << i34);
                                        objArr[iB4] = objArr[i32];
                                        objArr[i32] = null;
                                        iArr3[iB4] = iArr3[i32];
                                        iArr3[i32] = 0;
                                    } else {
                                        i10 = i27;
                                        objArr = objArr4;
                                        jArr6[i38] = (((long) (i35 & 127)) << i39) | ((~(j10 << i39)) & j25);
                                        Object obj4 = objArr[iB4];
                                        objArr[iB4] = objArr[i32];
                                        objArr[i32] = obj4;
                                        int i40 = iArr3[iB4];
                                        iArr3[iB4] = iArr3[i32];
                                        iArr3[i32] = i40;
                                        i32--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & j24) | Long.MIN_VALUE;
                                    i32++;
                                    i27 = i10;
                                    j22 = j24;
                                    objArr4 = objArr;
                                }
                                i30 = 8;
                            } else {
                                i32++;
                            }
                        }
                        this.f15958f = s0.a(this.f15956d) - this.f15957e;
                    }
                    iB = b(i12);
                }
                this.f15957e++;
                int i41 = this.f15958f;
                long[] jArr7 = this.f15953a;
                int i42 = iB >> 3;
                long j26 = jArr7[i42];
                int i43 = (iB & 7) << 3;
                this.f15958f = i41 - (((j26 >> i43) & j10) == j12 ? 1 : 0);
                int i44 = this.f15956d;
                long j27 = (j26 & (~(j10 << i43))) | (j11 << i43);
                jArr7[i42] = j27;
                jArr7[(((iB - 7) & i44) + (i44 & 7)) >> 3] = j27;
                return ~iB;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f15956d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f15953a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (jc.l.a(this.f15954b[iNumberOfTrailingZeros], obj)) {
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

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f15955c[iD];
        }
        p.a.e("There is no key " + obj + " in the map");
        throw null;
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
            boolean r3 = r1 instanceof o.f0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.f0 r1 = (o.f0) r1
            int r3 = r1.f15957e
            int r5 = r0.f15957e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f15954b
            int[] r5 = r0.f15955c
            long[] r6 = r0.f15953a
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
            int r15 = r1.d(r15)
            if (r15 < 0) goto L5d
            r16 = 1
            int[] r2 = r1.f15955c
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
        throw new UnsupportedOperationException("Method not decompiled: o.f0.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f15956d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f15953a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f15958f = s0.a(this.f15956d) - this.f15957e;
        this.f15954b = new Object[iMax];
        this.f15955c = new int[iMax];
    }

    public final void g(int i10) {
        this.f15957e--;
        long[] jArr = this.f15953a;
        int i11 = this.f15956d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f15954b[i10] = null;
    }

    public final void h(int i10, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f15954b[iC] = obj;
        this.f15955c[iC] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f15954b;
        int[] iArr = this.f15955c;
        long[] jArr = this.f15953a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += iArr[i13] ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
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
            int r1 = r0.f15957e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f15954b
            int[] r3 = r0.f15955c
            long[] r4 = r0.f15953a
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
            int r14 = r0.f15957e
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
        throw new UnsupportedOperationException("Method not decompiled: o.f0.toString():java.lang.String");
    }

    public /* synthetic */ f0() {
        this(6);
    }
}
