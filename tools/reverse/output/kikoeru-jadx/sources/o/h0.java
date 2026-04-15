package o;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15974a = s0.f16040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15975b = p.a.f16476c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f15976c = t.f16042b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15977d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15978e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15981h;

    public h0(int i10) {
        if (i10 >= 0) {
            f(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f15980g;
        int iD = d(obj);
        this.f15975b[iD] = obj;
        long[] jArr = this.f15976c;
        int i11 = this.f15977d;
        jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((2147483647L & ((long) iD)) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f15977d = iD;
        if (this.f15978e == Integer.MAX_VALUE) {
            this.f15978e = iD;
        }
        return this.f15980g != i10;
    }

    public final void b() {
        this.f15980g = 0;
        long[] jArr = this.f15974a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15974a;
            int i10 = this.f15979f;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vb.l.p0(0, this.f15979f, this.f15975b);
        vb.l.r0(this.f15976c, 4611686018427387903L);
        this.f15977d = Integer.MAX_VALUE;
        this.f15978e = Integer.MAX_VALUE;
        this.f15981h = s0.a(this.f15979f) - this.f15980g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f15979f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.f15974a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L4a:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L69
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f15975b
            r15 = r15[r11]
            boolean r15 = jc.l.a(r15, r1)
            if (r15 == 0) goto L63
            goto L73
        L63:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L4a
        L69:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L77
            r11 = -1
        L73:
            if (r11 < 0) goto L76
            return r12
        L76:
            return r2
        L77:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        long j10;
        long j11;
        long j12;
        int i10;
        char c3;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long[] jArr3;
        int i11 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f15979f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr4 = this.f15974a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr4[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr4[i18] >>> i19);
            long j14 = i14;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (j15 - 72340172838076673L) & (~j15) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i16) & i15;
                if (jc.l.a(this.f15975b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                if (this.f15981h != 0 || ((this.f15974a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    i10 = 0;
                } else {
                    int i20 = this.f15979f;
                    if (i20 > 8) {
                        c3 = 31;
                        j12 = 128;
                        j10 = 255;
                        if (Long.compare((((long) this.f15980g) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = this.f15974a;
                            if (jArr5 == null) {
                                j11 = j14;
                                i10 = 0;
                            } else {
                                int i21 = this.f15979f;
                                Object[] objArr2 = this.f15975b;
                                long[] jArr6 = this.f15976c;
                                long[] jArr7 = new long[i21];
                                j11 = j14;
                                long j17 = 9223372034707292159L;
                                Arrays.fill(jArr7, i11, i21, 9223372034707292159L);
                                int i22 = (i21 + 7) >> 3;
                                i10 = 0;
                                while (i11 < i22) {
                                    long j18 = jArr5[i11] & (-9187201950435737472L);
                                    jArr5[i11] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                    i11++;
                                    j17 = j17;
                                }
                                long j19 = j17;
                                int length = jArr5.length;
                                int i23 = length - 1;
                                int i24 = length - 2;
                                jArr5[i24] = (jArr5[i24] & 72057594037927935L) | (-72057594037927936L);
                                jArr5[i23] = jArr5[0];
                                int i25 = 0;
                                while (i25 != i21) {
                                    int i26 = i25 >> 3;
                                    int i27 = (i25 & 7) << 3;
                                    long j20 = (jArr5[i26] >> i27) & 255;
                                    if (j20 != 128 && j20 == 254) {
                                        Object obj2 = objArr2[i25];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                        int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i29 = i28 >>> 7;
                                        int iE2 = e(i29);
                                        int i30 = i29 & i21;
                                        if (((iE2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                            jArr5[i26] = (((long) (i28 & 127)) << i27) | (jArr5[i26] & (~(255 << i27)));
                                            if (jArr7[i25] == j19) {
                                                long j21 = i25;
                                                jArr7[i25] = j21 | (j21 << 32);
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[0];
                                            i25++;
                                        } else {
                                            int i31 = iE2 >> 3;
                                            long j22 = jArr5[i31];
                                            int i32 = (iE2 & 7) << 3;
                                            if (((j22 >> i32) & 255) == 128) {
                                                objArr = objArr2;
                                                jArr3 = jArr6;
                                                jArr5[i31] = ((~(255 << i32)) & j22) | (((long) (i28 & 127)) << i32);
                                                jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
                                                objArr[iE2] = objArr[i25];
                                                objArr[i25] = null;
                                                jArr3[iE2] = jArr3[i25];
                                                jArr3[i25] = 4611686018427387903L;
                                                int i33 = (int) ((jArr7[i25] >> 32) & 4294967295L);
                                                if (i33 != Integer.MAX_VALUE) {
                                                    jArr7[i33] = (jArr7[i33] & (-4294967296L)) | ((long) iE2);
                                                    jArr7[i25] = (jArr7[i25] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr7[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr7[iE2] = (((long) i25) << 32) | ((long) Integer.MAX_VALUE);
                                            } else {
                                                objArr = objArr2;
                                                jArr3 = jArr6;
                                                jArr5[i31] = (((long) (i28 & 127)) << i32) | ((~(255 << i32)) & j22);
                                                Object obj3 = objArr[iE2];
                                                objArr[iE2] = objArr[i25];
                                                objArr[i25] = obj3;
                                                long j23 = jArr3[iE2];
                                                jArr3[iE2] = jArr3[i25];
                                                jArr3[i25] = j23;
                                                int i34 = (int) ((jArr7[i25] >> 32) & 4294967295L);
                                                if (i34 != Integer.MAX_VALUE) {
                                                    long j24 = iE2;
                                                    jArr7[i34] = (jArr7[i34] & (-4294967296L)) | j24;
                                                    jArr7[i25] = (jArr7[i25] & 4294967295L) | (j24 << 32);
                                                } else {
                                                    long j25 = iE2;
                                                    jArr7[i25] = j25 | (j25 << 32);
                                                    i34 = i25;
                                                }
                                                jArr7[iE2] = (((long) i34) << 32) | ((long) i25);
                                                i25--;
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[0];
                                            i25++;
                                            objArr2 = objArr;
                                            jArr6 = jArr3;
                                        }
                                    } else {
                                        i25++;
                                    }
                                }
                                this.f15981h = s0.a(this.f15979f) - this.f15980g;
                                long[] jArr8 = this.f15976c;
                                int length2 = jArr8.length;
                                for (int i35 = 0; i35 < length2; i35++) {
                                    long j26 = jArr8[i35];
                                    int i36 = (int) ((j26 >> 31) & 2147483647L);
                                    int i37 = (int) (j26 & 2147483647L);
                                    jArr8[i35] = (((j26 & (-4611686018427387904L)) | ((long) (i36 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr7[i36] & 4294967295L)))) << 31) | ((long) (i37 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr7[i37] & 4294967295L)));
                                }
                                int i38 = this.f15977d;
                                if (i38 != Integer.MAX_VALUE) {
                                    this.f15977d = (int) (jArr7[i38] & 4294967295L);
                                }
                                int i39 = this.f15978e;
                                if (i39 != Integer.MAX_VALUE) {
                                    this.f15978e = (int) (jArr7[i39] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i13);
                    } else {
                        j10 = 255;
                        c3 = 31;
                        j12 = 128;
                    }
                    j11 = j14;
                    i10 = 0;
                    int iB = s0.b(this.f15979f);
                    long[] jArr9 = this.f15974a;
                    Object[] objArr3 = this.f15975b;
                    long[] jArr10 = this.f15976c;
                    int i40 = this.f15979f;
                    int[] iArr = new int[i40];
                    f(iB);
                    long[] jArr11 = this.f15974a;
                    Object[] objArr4 = this.f15975b;
                    long[] jArr12 = this.f15976c;
                    int i41 = this.f15979f;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr9[i42 >> 3] >> ((i42 & 7) << 3)) & j10) < j12) {
                            Object obj4 = objArr3[i42];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i43 >>> 7);
                            jArr = jArr11;
                            jArr2 = jArr9;
                            long j27 = i43 & 127;
                            int i44 = iE3 >> 3;
                            int i45 = (iE3 & 7) << 3;
                            long j28 = (jArr[i44] & (~(j10 << i45))) | (j27 << i45);
                            jArr[i44] = j28;
                            jArr[(((iE3 - 7) & i41) + (i41 & 7)) >> 3] = j28;
                            objArr4[iE3] = obj4;
                            jArr12[iE3] = jArr10[i42];
                            iArr[i42] = iE3;
                        } else {
                            jArr = jArr11;
                            jArr2 = jArr9;
                        }
                        i42++;
                        jArr9 = jArr2;
                        jArr11 = jArr;
                    }
                    long[] jArr13 = this.f15976c;
                    int length3 = jArr13.length;
                    for (int i46 = 0; i46 < length3; i46++) {
                        long j29 = jArr13[i46];
                        int i47 = (int) ((j29 >> c3) & 2147483647L);
                        int i48 = (int) (j29 & 2147483647L);
                        jArr13[i46] = (((j29 & (-4611686018427387904L)) | ((long) (i47 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i47]))) << c3) | ((long) (i48 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i48]));
                    }
                    int i49 = this.f15977d;
                    if (i49 != Integer.MAX_VALUE) {
                        this.f15977d = iArr[i49];
                    }
                    int i50 = this.f15978e;
                    if (i50 != Integer.MAX_VALUE) {
                        this.f15978e = iArr[i50];
                    }
                    iE = e(i13);
                }
                this.f15980g++;
                int i51 = this.f15981h;
                long[] jArr14 = this.f15974a;
                int i52 = iE >> 3;
                long j30 = jArr14[i52];
                int i53 = (iE & 7) << 3;
                if (((j30 >> i53) & j10) == j12) {
                    i10 = 1;
                }
                this.f15981h = i51 - i10;
                int i54 = this.f15979f;
                long j31 = (j30 & (~(j10 << i53))) | (j11 << i53);
                jArr14[i52] = j31;
                jArr14[(((iE - 7) & i54) + (i54 & 7)) >> 3] = j31;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = 0;
        }
    }

    public final int e(int i10) {
        int i11 = this.f15979f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15974a;
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
            boolean r3 = r1 instanceof o.h0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.h0 r1 = (o.h0) r1
            int r3 = r1.f15980g
            int r5 = r0.f15980g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f15975b
            long[] r5 = r0.f15974a
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
            boolean r13 = r1.c(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: o.h0.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f15979f = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f15974a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f15981h = s0.a(this.f15979f) - this.f15980g;
        this.f15975b = iMax == 0 ? p.a.f16476c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = t.f16042b;
        } else {
            jArr2 = new long[iMax];
            vb.l.r0(jArr2, 4611686018427387903L);
        }
        this.f15976c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = 0
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f15979f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.f15974a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L4a:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L69
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f15975b
            r15 = r15[r11]
            boolean r15 = jc.l.a(r15, r1)
            if (r15 == 0) goto L63
            goto L73
        L63:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L4a
        L69:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 == 0) goto L7c
            r11 = -1
        L73:
            if (r11 < 0) goto L76
            r2 = 1
        L76:
            if (r2 == 0) goto L7b
            r0.h(r11)
        L7b:
            return r2
        L7c:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h0.g(java.lang.Object):boolean");
    }

    public final void h(int i10) {
        this.f15980g--;
        long[] jArr = this.f15974a;
        int i11 = this.f15979f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f15975b[i10] = null;
        long[] jArr2 = this.f15976c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & 2147483647L);
        int i15 = (int) (j11 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f15977d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f15978e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f15979f * 31) + this.f15980g;
        Object[] objArr = this.f15975b;
        long[] jArr = this.f15974a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!jc.l.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.Collection r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "elements"
            jc.l.e(r1, r2)
            java.lang.Object[] r2 = r0.f15975b
            int r3 = r0.f15980g
            long[] r4 = r0.f15974a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = 0
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = vb.m.S(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f15980g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.h0.i(java.util.Collection):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f15975b;
        long[] jArr = this.f15976c;
        int i10 = this.f15978e;
        int i11 = 0;
        while (true) {
            if (i10 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i11++;
            i10 = i12;
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
