package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16072f;

    public y(int i10) {
        this.f16007a = s0.f16040a;
        this.f16008b = o.f16027a;
        this.f16009c = p.a.f16476c;
        if (i10 >= 0) {
            f(s0.d(i10));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f16011e = 0;
        long[] jArr = this.f16007a;
        if (jArr != s0.f16040a) {
            vb.l.r0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f16007a;
            int i10 = this.f16010d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        vb.l.p0(0, this.f16010d, this.f16009c);
        this.f16072f = s0.a(this.f16010d) - this.f16011e;
    }

    public final int d(int i10) {
        long j10;
        long j11;
        int i11;
        long[] jArr;
        long[] jArr2;
        int i12;
        int i13;
        int i14 = i10 * (-862048943);
        int i15 = i14 ^ (i14 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f16010d;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr3 = this.f16007a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            int i23 = i20;
            long j12 = (((-i22) >> 63) & (jArr3[i21 + 1] << (64 - i22))) | (jArr3[i21] >>> i22);
            long j13 = i17;
            int i24 = i17;
            int i25 = -862048943;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j16) >> 3)) & i18;
                long j17 = j15;
                if (this.f16008b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                j15 = j17;
            }
            long j18 = j15;
            if ((((~j12) << 6) & j12 & j18) != 0) {
                int iE = e(i16);
                long j19 = 255;
                if (this.f16072f != 0 || ((this.f16007a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = 128;
                    i11 = 0;
                } else {
                    int i26 = this.f16010d;
                    if (i26 > 8) {
                        j11 = 128;
                        if (Long.compare((((long) this.f16011e) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f16007a;
                            int i27 = this.f16010d;
                            int[] iArr = this.f16008b;
                            Object[] objArr = this.f16009c;
                            int i28 = 0;
                            for (int i29 = (i27 + 7) >> 3; i28 < i29; i29 = i29) {
                                long j20 = jArr4[i28] & j18;
                                jArr4[i28] = (-72340172838076674L) & ((~j20) + (j20 >>> 7));
                                i28++;
                                j19 = j19;
                            }
                            j10 = j19;
                            int iX0 = vb.l.x0(jArr4);
                            int i30 = iX0 - 1;
                            jArr4[i30] = (jArr4[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iX0] = jArr4[0];
                            int i31 = 0;
                            while (i31 != i27) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j21 = (jArr4[i32] >> i33) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    int i34 = iArr[i31] * i25;
                                    int i35 = i34 ^ (i34 << 16);
                                    int i36 = i35 >>> 7;
                                    int iE2 = e(i36);
                                    int i37 = i36 & i27;
                                    if (((iE2 - i37) & i27) / 8 == ((i31 - i37) & i27) / 8) {
                                        jArr4[i32] = (((long) (i35 & 127)) << i33) | (jArr4[i32] & (~(j10 << i33)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31++;
                                    } else {
                                        int i38 = iE2 >> 3;
                                        long j22 = jArr4[i38];
                                        int i39 = (iE2 & 7) << 3;
                                        if (((j22 >> i39) & j10) == 128) {
                                            i12 = i27;
                                            int i40 = i31;
                                            jArr4[i38] = (j22 & (~(j10 << i39))) | (((long) (i35 & 127)) << i39);
                                            jArr4[i32] = (jArr4[i32] & (~(j10 << i33))) | (128 << i33);
                                            iArr[iE2] = iArr[i40];
                                            iArr[i40] = 0;
                                            objArr[iE2] = objArr[i40];
                                            objArr[i40] = null;
                                            i13 = i40;
                                        } else {
                                            int i41 = i31;
                                            i12 = i27;
                                            jArr4[i38] = (((long) (i35 & 127)) << i39) | (j22 & (~(j10 << i39)));
                                            int i42 = iArr[iE2];
                                            iArr[iE2] = iArr[i41];
                                            iArr[i41] = i42;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i41];
                                            objArr[i41] = obj;
                                            i13 = i41 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31 = i13 + 1;
                                        i27 = i12;
                                    }
                                    i25 = -862048943;
                                } else {
                                    i31++;
                                }
                            }
                            i11 = 0;
                            this.f16072f = s0.a(this.f16010d) - this.f16011e;
                        }
                        iE = e(i16);
                    } else {
                        j11 = 128;
                    }
                    j10 = 255;
                    i11 = 0;
                    int iB = s0.b(this.f16010d);
                    long[] jArr5 = this.f16007a;
                    int[] iArr2 = this.f16008b;
                    Object[] objArr2 = this.f16009c;
                    int i43 = this.f16010d;
                    f(iB);
                    long[] jArr6 = this.f16007a;
                    int[] iArr3 = this.f16008b;
                    Object[] objArr3 = this.f16009c;
                    int i44 = this.f16010d;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j11) {
                            int i46 = iArr2[i45];
                            int i47 = i46 * (-862048943);
                            int i48 = i47 ^ (i47 << 16);
                            int iE3 = e(i48 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = i48 & 127;
                            int i49 = iE3 >> 3;
                            int i50 = (iE3 & 7) << 3;
                            long j24 = (jArr[i49] & (~(255 << i50))) | (j23 << i50);
                            jArr[i49] = j24;
                            jArr[(((iE3 - 7) & i44) + (i44 & 7)) >> 3] = j24;
                            iArr3[iE3] = i46;
                            objArr3[iE3] = objArr2[i45];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i16);
                }
                this.f16011e++;
                int i51 = this.f16072f;
                long[] jArr7 = this.f16007a;
                int i52 = iE >> 3;
                long j25 = jArr7[i52];
                int i53 = (iE & 7) << 3;
                if (((j25 >> i53) & j10) == j11) {
                    i11 = 1;
                }
                this.f16072f = i51 - i11;
                int i54 = this.f16010d;
                long j26 = (j25 & (~(j10 << i53))) | (j13 << i53);
                jArr7[i52] = j26;
                jArr7[(((iE - 7) & i54) + (i54 & 7)) >> 3] = j26;
                return iE;
            }
            i20 = i23 + 8;
            i19 = (i19 + i20) & i18;
            i17 = i24;
        }
    }

    public final int e(int i10) {
        int i11 = this.f16010d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f16007a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, s0.c(i10)) : 0;
        this.f16010d = iMax;
        if (iMax == 0) {
            jArr = s0.f16040a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        this.f16007a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f16072f = s0.a(this.f16010d) - this.f16011e;
        this.f16008b = new int[iMax];
        this.f16009c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f16010d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L10:
            long[] r4 = r13.f16007a
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
        L3d:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L58
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f16008b
            r11 = r11[r10]
            if (r11 != r14) goto L52
            goto L62
        L52:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3d
        L58:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 == 0) goto L94
            r10 = -1
        L62:
            r14 = 0
            if (r10 < 0) goto L93
            int r0 = r13.f16011e
            int r0 = r0 + (-1)
            r13.f16011e = r0
            long[] r0 = r13.f16007a
            int r1 = r13.f16010d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r4 = r4 | r6
            r0[r2] = r4
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r4
            java.lang.Object[] r0 = r13.f16009c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L93:
            return r14
        L94:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y.g(int):java.lang.Object");
    }

    public final void h(int i10, Object obj) {
        int iD = d(i10);
        this.f16008b[iD] = i10;
        this.f16009c[iD] = obj;
    }

    public /* synthetic */ y() {
        this(6);
    }
}
