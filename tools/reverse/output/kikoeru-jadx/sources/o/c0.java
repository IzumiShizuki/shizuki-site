package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15934f;

    public c0(int i10) {
        this.f15929a = s0.f16040a;
        this.f15930b = r.f16034a;
        this.f15931c = p.a.f16476c;
        if (i10 >= 0) {
            f(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f15933e = 0;
        long[] jArr = this.f15929a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f15929a;
            int i10 = this.f15932d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vb.l.p0(0, this.f15932d, this.f15931c);
        this.f15934f = s0.a(this.f15932d) - this.f15933e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 32
            long r1 = r18 >>> r1
            long r1 = r18 ^ r1
            int r2 = (int) r1
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r1 = r2 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f15932d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = 0
        L1a:
            long[] r6 = r0.f15929a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L47:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f15930b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6e
        L5e:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L47
        L64:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L72
            r10 = -1
        L6e:
            if (r10 < 0) goto L71
            return r11
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c0.b(long):boolean");
    }

    public final int c(long j10) {
        long j11;
        long j12;
        int i10;
        long[] jArr;
        long[] jArr2;
        int i11;
        int i12;
        int i13 = ((int) (j10 ^ (j10 >>> 32))) * (-862048943);
        int i14 = i13 ^ (i13 << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f15932d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f15929a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            char c3 = ' ';
            long j13 = (((-i21) >> 63) & (jArr3[i20 + 1] << (64 - i21))) | (jArr3[i20] >>> i21);
            long j14 = i16;
            int i22 = i19;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = -9187201950435737472L;
            long j17 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j17) >> 3)) & i17;
                long j18 = j16;
                if (this.f15930b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                j16 = j18;
            }
            long j19 = j16;
            if ((j13 & ((~j13) << 6) & j19) != 0) {
                int iD = d(i15);
                long j20 = 255;
                if (this.f15934f != 0 || ((this.f15929a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = 128;
                    i10 = 0;
                } else {
                    int i23 = this.f15932d;
                    if (i23 > 8) {
                        j12 = 128;
                        if (Long.compare((((long) this.f15933e) * 32) ^ Long.MIN_VALUE, (((long) i23) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f15929a;
                            int i24 = this.f15932d;
                            long[] jArr5 = this.f15930b;
                            Object[] objArr = this.f15931c;
                            int i25 = 0;
                            for (int i26 = (i24 + 7) >> 3; i25 < i26; i26 = i26) {
                                long j21 = jArr4[i25] & j19;
                                jArr4[i25] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i25++;
                                j20 = j20;
                            }
                            j11 = j20;
                            int iX0 = vb.l.x0(jArr4);
                            int i27 = iX0 - 1;
                            jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iX0] = jArr4[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j22 = (jArr4[i29] >> i30) & j11;
                                if (j22 != 128 && j22 == 254) {
                                    long j23 = jArr5[i28];
                                    int i31 = ((int) (j23 ^ (j23 >>> c3))) * (-862048943);
                                    int i32 = (i31 << 16) ^ i31;
                                    int i33 = i32 >>> 7;
                                    int iD2 = d(i33);
                                    int i34 = i33 & i24;
                                    if (((iD2 - i34) & i24) / 8 == ((i28 - i34) & i24) / 8) {
                                        jArr4[i29] = (((long) (i32 & 127)) << i30) | (jArr4[i29] & (~(j11 << i30)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                    } else {
                                        int i35 = iD2 >> 3;
                                        long j24 = jArr4[i35];
                                        int i36 = (iD2 & 7) << 3;
                                        if (((j24 >> i36) & j11) == 128) {
                                            i11 = i24;
                                            int i37 = i28;
                                            jArr4[i35] = (j24 & (~(j11 << i36))) | (((long) (i32 & 127)) << i36);
                                            jArr4[i29] = (jArr4[i29] & (~(j11 << i30))) | (128 << i30);
                                            jArr5[iD2] = jArr5[i37];
                                            jArr5[i37] = 0;
                                            objArr[iD2] = objArr[i37];
                                            objArr[i37] = null;
                                            i12 = i37;
                                        } else {
                                            int i38 = i28;
                                            i11 = i24;
                                            jArr4[i35] = (((long) (i32 & 127)) << i36) | (j24 & (~(j11 << i36)));
                                            long j25 = jArr5[iD2];
                                            jArr5[iD2] = jArr5[i38];
                                            jArr5[i38] = j25;
                                            Object obj = objArr[iD2];
                                            objArr[iD2] = objArr[i38];
                                            objArr[i38] = obj;
                                            i12 = i38 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28 = i12 + 1;
                                        i24 = i11;
                                    }
                                    c3 = ' ';
                                } else {
                                    i28++;
                                }
                            }
                            i10 = 0;
                            this.f15934f = s0.a(this.f15932d) - this.f15933e;
                        }
                        iD = d(i15);
                    } else {
                        j12 = 128;
                    }
                    j11 = 255;
                    i10 = 0;
                    int iB = s0.b(this.f15932d);
                    long[] jArr6 = this.f15929a;
                    long[] jArr7 = this.f15930b;
                    Object[] objArr2 = this.f15931c;
                    int i39 = this.f15932d;
                    f(iB);
                    long[] jArr8 = this.f15929a;
                    long[] jArr9 = this.f15930b;
                    Object[] objArr3 = this.f15931c;
                    int i40 = this.f15932d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr6[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j12) {
                            long j26 = jArr7[i41];
                            jArr = jArr8;
                            jArr2 = jArr6;
                            int i42 = ((int) (j26 ^ (j26 >>> 32))) * (-862048943);
                            int i43 = (i42 << 16) ^ i42;
                            int iD3 = d(i43 >>> 7);
                            int i44 = iD3 >> 3;
                            int i45 = (iD3 & 7) << 3;
                            long j27 = (jArr[i44] & (~(255 << i45))) | (((long) (i43 & 127)) << i45);
                            jArr[i44] = j27;
                            jArr[(((iD3 - 7) & i40) + (i40 & 7)) >> 3] = j27;
                            jArr9[iD3] = j26;
                            objArr3[iD3] = objArr2[i41];
                        } else {
                            jArr = jArr8;
                            jArr2 = jArr6;
                        }
                        i41++;
                        jArr6 = jArr2;
                        jArr8 = jArr;
                    }
                    iD = d(i15);
                }
                this.f15933e++;
                int i46 = this.f15934f;
                long[] jArr10 = this.f15929a;
                int i47 = iD >> 3;
                long j28 = jArr10[i47];
                int i48 = (iD & 7) << 3;
                if (((j28 >> i48) & j11) == j12) {
                    i10 = 1;
                }
                this.f15934f = i46 - i10;
                int i49 = this.f15932d;
                long j29 = (j28 & (~(j11 << i48))) | (j14 << i48);
                jArr10[i47] = j29;
                jArr10[(((iD - 7) & i49) + (i49 & 7)) >> 3] = j29;
                return iD;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
        }
    }

    public final int d(int i10) {
        int i11 = this.f15932d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15929a;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r1 = (int) r0
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f15932d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L16:
            long[] r4 = r14.f15929a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f15930b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L5a
            goto L6a
        L5a:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L60:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L73
            r10 = -1
        L6a:
            if (r10 < 0) goto L71
            java.lang.Object[] r0 = r14.f15931c
            r0 = r0[r10]
            return r0
        L71:
            r0 = 0
            return r0
        L73:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c0.e(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
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
            boolean r3 = r1 instanceof o.c0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.c0 r1 = (o.c0) r1
            int r3 = r1.f15933e
            int r5 = r0.f15933e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f15930b
            java.lang.Object[] r5 = r0.f15931c
            long[] r6 = r0.f15929a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
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
            if (r15 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r16 = r3
            r15 = 1
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.e(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.e(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r16 = r3
            r15 = 1
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r3 = r16
            r2 = 1
            goto L3d
        L76:
            r16 = r3
            r15 = 1
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r16 = r3
            r15 = 1
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r3 = r16
            r2 = 1
            goto L23
        L87:
            r15 = 1
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c0.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f15932d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f15929a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f15934f = s0.a(this.f15932d) - this.f15933e;
        this.f15930b = new long[iMax];
        this.f15931c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r15) {
        /*
            r14 = this;
            r0 = 32
            long r0 = r15 >>> r0
            long r0 = r0 ^ r15
            int r1 = (int) r0
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f15932d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L16:
            long[] r4 = r14.f15929a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f15930b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L5a
            goto L6a
        L5a:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L60:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L9c
            r10 = -1
        L6a:
            r0 = 0
            if (r10 < 0) goto L9b
            int r1 = r14.f15933e
            int r1 = r1 + (-1)
            r14.f15933e = r1
            long[] r1 = r14.f15929a
            int r2 = r14.f15932d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r5 = r5 | r7
            r1[r3] = r5
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r5
            java.lang.Object[] r1 = r14.f15931c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L9b:
            return r0
        L9c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.c0.g(long):java.lang.Object");
    }

    public final void h(long j10, Object obj) {
        int iC = c(j10);
        this.f15930b[iC] = j10;
        this.f15931c[iC] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f15930b;
        Object[] objArr = this.f15931c;
        long[] jArr2 = this.f15929a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        long j11 = jArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j11 ^ (j11 >>> 32)));
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f15933e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f15930b;
        Object[] objArr = this.f15931c;
        long[] jArr2 = this.f15929a;
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
                            Object obj = objArr[i16];
                            sb.append(j11);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i13++;
                            if (i13 < this.f15933e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
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

    public /* synthetic */ c0() {
        this(6);
    }
}
