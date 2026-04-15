package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16006e;

    public l0(int i10) {
        this.f16002a = s0.f16040a;
        this.f16003b = p.a.f16476c;
        if (i10 >= 0) {
            f(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i10 = this.f16005d;
        this.f16003b[d(obj)] = obj;
        return this.f16005d != i10;
    }

    public final void b() {
        this.f16005d = 0;
        long[] jArr = this.f16002a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16002a;
            int i10 = this.f16004c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vb.l.p0(0, this.f16004c, this.f16003b);
        this.f16006e = s0.a(this.f16004c) - this.f16005d;
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
            int r5 = r0.f16004c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.f16002a
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
            java.lang.Object[] r15 = r0.f16003b
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
        throw new UnsupportedOperationException("Method not decompiled: o.l0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
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
        int i14 = this.f16004c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f16002a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j13 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j14 = i13;
            int i19 = i13;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            for (long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j16) >> 3)) & i14;
                if (jc.l.a(this.f16003b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j17 = 255;
                if (this.f16006e != 0 || ((this.f16002a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i20 = this.f16004c;
                    if (i20 <= 8 || Long.compare((((long) this.f16005d) * 32) ^ Long.MIN_VALUE, (((long) i20) * 25) ^ Long.MIN_VALUE) > 0) {
                        j10 = 255;
                        j11 = j14;
                        j12 = 128;
                        int iB = s0.b(this.f16004c);
                        long[] jArr4 = this.f16002a;
                        Object[] objArr2 = this.f16003b;
                        int i21 = this.f16004c;
                        f(iB);
                        long[] jArr5 = this.f16002a;
                        Object[] objArr3 = this.f16003b;
                        int i22 = this.f16004c;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr4[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i24 >>> 7);
                                long j18 = i24 & 127;
                                int i25 = iE2 >> 3;
                                int i26 = (iE2 & 7) << 3;
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j19 = (jArr5[i25] & (~(255 << i26))) | (j18 << i26);
                                jArr[i25] = j19;
                                jArr[(((iE2 - 7) & i22) + (i22 & 7)) >> 3] = j19;
                                objArr3[iE2] = obj2;
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i23++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f16002a;
                        int i27 = this.f16004c;
                        Object[] objArr4 = this.f16003b;
                        int i28 = (i27 + 7) >> 3;
                        int i29 = 0;
                        j12 = 128;
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
                                int iE3 = e(i36);
                                int i37 = i36 & i27;
                                if (((iE3 - i37) & i27) / i30 == ((i32 - i37) & i27) / i30) {
                                    long j24 = j22;
                                    jArr6[i33] = (((long) (i35 & 127)) << i34) | ((~(j10 << i34)) & jArr6[i33]);
                                    jArr6[jArr6.length - 1] = (jArr6[0] & j24) | Long.MIN_VALUE;
                                    i32++;
                                    j22 = j24;
                                } else {
                                    long j25 = j22;
                                    int i38 = iE3 >> 3;
                                    long j26 = jArr6[i38];
                                    int i39 = (iE3 & 7) << 3;
                                    if (((j26 >> i39) & j10) == 128) {
                                        i10 = i27;
                                        objArr = objArr4;
                                        jArr6[i38] = ((~(j10 << i39)) & j26) | (((long) (i35 & 127)) << i39);
                                        jArr6[i33] = (jArr6[i33] & (~(j10 << i34))) | (128 << i34);
                                        objArr[iE3] = objArr[i32];
                                        objArr[i32] = null;
                                    } else {
                                        i10 = i27;
                                        objArr = objArr4;
                                        jArr6[i38] = (((long) (i35 & 127)) << i39) | ((~(j10 << i39)) & j26);
                                        Object obj4 = objArr[iE3];
                                        objArr[iE3] = objArr[i32];
                                        objArr[i32] = obj4;
                                        i32--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & j25) | Long.MIN_VALUE;
                                    i32++;
                                    j22 = j25;
                                    i27 = i10;
                                    objArr4 = objArr;
                                    i30 = 8;
                                }
                            } else {
                                i32++;
                            }
                        }
                        this.f16006e = s0.a(this.f16004c) - this.f16005d;
                    }
                    iE = e(i12);
                }
                this.f16005d++;
                int i40 = this.f16006e;
                long[] jArr7 = this.f16002a;
                int i41 = iE >> 3;
                long j27 = jArr7[i41];
                int i42 = (iE & 7) << 3;
                this.f16006e = i40 - (((j27 >> i42) & j10) == j12 ? 1 : 0);
                int i43 = this.f16004c;
                long j28 = (j27 & (~(j10 << i42))) | (j11 << i42);
                jArr7[i41] = j28;
                jArr7[(((iE - 7) & i43) + (i43 & 7)) >> 3] = j28;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    public final int e(int i10) {
        int i11 = this.f16004c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f16002a;
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
            boolean r3 = r1 instanceof o.l0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.l0 r1 = (o.l0) r1
            int r3 = r1.f16005d
            int r5 = r0.f16005d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f16003b
            long[] r5 = r0.f16002a
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
        throw new UnsupportedOperationException("Method not decompiled: o.l0.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f16004c = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f16002a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f16006e = s0.a(this.f16004c) - this.f16005d;
        this.f16003b = iMax == 0 ? p.a.f16476c : new Object[iMax];
    }

    public final boolean g() {
        return this.f16005d == 0;
    }

    public final boolean h() {
        return this.f16005d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f16004c * 31) + this.f16005d;
        Object[] objArr = this.f16003b;
        long[] jArr = this.f16002a;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f16004c
            int r1 = r1 >>> 7
        L17:
            r1 = r1 & r3
            long[] r4 = r13.f16002a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L45:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f16003b
            r11 = r11[r10]
            boolean r11 = jc.l.a(r11, r14)
            if (r11 == 0) goto L5e
            goto L6e
        L5e:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L45
        L64:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L74
            r10 = -1
        L6e:
            if (r10 < 0) goto L73
            r13.m(r10)
        L73:
            return
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l0.i(java.lang.Object):void");
    }

    public final void j(Object obj) {
        this.f16003b[d(obj)] = obj;
    }

    public final void k(l0 l0Var) {
        jc.l.e(l0Var, "elements");
        Object[] objArr = l0Var.f16003b;
        long[] jArr = l0Var.f16002a;
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
                        j(objArr[(i10 << 3) + i12]);
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
    public final boolean l(java.lang.Object r18) {
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
            int r5 = r0.f16004c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L1d:
            long[] r7 = r0.f16002a
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
            java.lang.Object[] r15 = r0.f16003b
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
            r0.m(r11)
        L7b:
            return r2
        L7c:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l0.l(java.lang.Object):boolean");
    }

    public final void m(int i10) {
        this.f16005d--;
        long[] jArr = this.f16002a;
        int i11 = this.f16004c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f16003b[i10] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[PHI: r7
      0x0066: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r2 = r0.f16003b
            long[] r3 = r0.f16002a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6b
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
            if (r14 == 0) goto L66
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L32:
            if (r12 >= r10) goto L64
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L60
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L70
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            if (r13 != r0) goto L57
            java.lang.String r13 = "(this)"
            goto L5b
        L57:
            java.lang.String r13 = java.lang.String.valueOf(r13)
        L5b:
            r1.append(r13)
            int r7 = r7 + 1
        L60:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L64:
            if (r10 != r11) goto L6b
        L66:
            if (r6 == r4) goto L6b
            int r6 = r6 + 1
            goto L18
        L6b:
            java.lang.String r2 = "]"
            r1.append(r2)
        L70:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            jc.l.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l0.toString():java.lang.String");
    }

    public /* synthetic */ l0() {
        this(6);
    }
}
