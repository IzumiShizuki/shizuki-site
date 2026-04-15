package ce;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3918c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f3920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3921f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3924i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3923h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3916a = new byte[4096];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3917b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3919d = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3922g = 0;

    public f(InputStream inputStream) {
        this.f3920e = inputStream;
    }

    public final void a(int i10) throws s {
        if (this.f3921f != i10) {
            throw new s("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i10 = this.f3923h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f3922g + this.f3919d);
    }

    public final void c(int i10) {
        this.f3923h = i10;
        o();
    }

    public final int d(int i10) throws s {
        if (i10 < 0) {
            throw new s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f3922g + this.f3919d + i10;
        int i12 = this.f3923h;
        if (i11 > i12) {
            throw s.b();
        }
        this.f3923h = i11;
        o();
        return i12;
    }

    public final w e() {
        int iK = k();
        int i10 = this.f3917b;
        int i11 = this.f3919d;
        if (iK > i10 - i11 || iK <= 0) {
            return iK == 0 ? e.f3915a : new w(h(iK));
        }
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f3916a, i11, bArr, 0, iK);
        w wVar = new w(bArr);
        this.f3919d += iK;
        return wVar;
    }

    public final int f() {
        return k();
    }

    public final b g(y yVar, i iVar) throws s {
        int iK = k();
        if (this.f3924i >= 64) {
            throw new s("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iD = d(iK);
        this.f3924i++;
        b bVar = (b) yVar.a(this, iVar);
        a(0);
        this.f3924i--;
        c(iD);
        return bVar;
    }

    public final byte[] h(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return r.f3963a;
            }
            throw new s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f3922g;
        int i12 = this.f3919d;
        int i13 = i11 + i12 + i10;
        int i14 = this.f3923h;
        if (i13 > i14) {
            r((i14 - i11) - i12);
            throw s.b();
        }
        byte[] bArr = this.f3916a;
        if (i10 < 4096) {
            byte[] bArr2 = new byte[i10];
            int i15 = this.f3917b - i12;
            System.arraycopy(bArr, i12, bArr2, 0, i15);
            this.f3919d = this.f3917b;
            int i16 = i10 - i15;
            if (i16 > 0) {
                p(i16);
            }
            System.arraycopy(bArr, 0, bArr2, i15, i16);
            this.f3919d = i16;
            return bArr2;
        }
        int i17 = this.f3917b;
        this.f3922g = i11 + i17;
        this.f3919d = 0;
        this.f3917b = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr3 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                int i20 = this.f3920e.read(bArr3, i19, iMin - i19);
                if (i20 == -1) {
                    throw s.b();
                }
                this.f3922g += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i12, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int i() throws s {
        int i10 = this.f3919d;
        if (this.f3917b - i10 < 4) {
            p(4);
            i10 = this.f3919d;
        }
        this.f3919d = i10 + 4;
        byte[] bArr = this.f3916a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long j() throws s {
        int i10 = this.f3919d;
        if (this.f3917b - i10 < 8) {
            p(8);
            i10 = this.f3919d;
        }
        this.f3919d = i10 + 8;
        byte[] bArr = this.f3916a;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final int k() {
        int i10;
        int i11 = this.f3919d;
        int i12 = this.f3917b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f3916a;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f3919d = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f3919d = i14;
                return i10;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l() {
        /*
            r12 = this;
            int r0 = r12.f3919d
            int r1 = r12.f3917b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f3916a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f3919d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.m()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.f3919d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.f.l():long");
    }

    public final long m() throws s {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f3919d == this.f3917b) {
                p(1);
            }
            int i11 = this.f3919d;
            this.f3919d = i11 + 1;
            byte b10 = this.f3916a[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new s("CodedInputStream encountered a malformed varint.");
    }

    public final int n() throws s {
        if (this.f3919d == this.f3917b && !s(1)) {
            this.f3921f = 0;
            return 0;
        }
        int iK = k();
        this.f3921f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new s("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i10 = this.f3917b + this.f3918c;
        this.f3917b = i10;
        int i11 = this.f3922g + i10;
        int i12 = this.f3923h;
        if (i11 <= i12) {
            this.f3918c = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f3918c = i13;
        this.f3917b = i10 - i13;
    }

    public final void p(int i10) throws s {
        if (!s(i10)) {
            throw s.b();
        }
    }

    public final boolean q(int i10, g gVar) throws IOException {
        int iN;
        int i11 = i10 & 7;
        if (i11 == 0) {
            long jL = l();
            gVar.O(i10);
            gVar.P(jL);
            return true;
        }
        if (i11 == 1) {
            long j10 = j();
            gVar.O(i10);
            gVar.N(j10);
            return true;
        }
        if (i11 == 2) {
            w wVarE = e();
            gVar.O(i10);
            gVar.O(wVarE.size());
            gVar.K(wVarE);
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new s("Protocol message tag had invalid wire type.");
            }
            int i12 = i();
            gVar.O(i10);
            gVar.M(i12);
            return true;
        }
        gVar.O(i10);
        do {
            iN = n();
            if (iN == 0) {
                break;
            }
        } while (q(iN, gVar));
        int i13 = ((i10 >>> 3) << 3) | 4;
        a(i13);
        gVar.O(i13);
        return true;
    }

    public final void r(int i10) throws s {
        int i11 = this.f3917b;
        int i12 = this.f3919d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f3919d = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new s("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f3922g;
        int i15 = i14 + i12 + i10;
        int i16 = this.f3923h;
        if (i15 > i16) {
            r((i16 - i14) - i12);
            throw s.b();
        }
        this.f3919d = i11;
        p(1);
        while (true) {
            int i17 = i10 - i13;
            int i18 = this.f3917b;
            if (i17 <= i18) {
                this.f3919d = i17;
                return;
            } else {
                i13 += i18;
                this.f3919d = i18;
                p(1);
            }
        }
    }

    public final boolean s(int i10) throws IOException {
        InputStream inputStream;
        int i11 = this.f3919d;
        int i12 = i11 + i10;
        int i13 = this.f3917b;
        if (i12 <= i13) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i10);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f3922g + i11 + i10 <= this.f3923h && (inputStream = this.f3920e) != null) {
            byte[] bArr = this.f3916a;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f3922g += i11;
                this.f3917b -= i11;
                this.f3919d = 0;
            }
            int i14 = this.f3917b;
            int i15 = inputStream.read(bArr, i14, bArr.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i15);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i15 > 0) {
                this.f3917b += i15;
                if ((this.f3922g + i10) - 67108864 > 0) {
                    throw new s("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f3917b >= i10) {
                    return true;
                }
                return s(i10);
            }
        }
        return false;
    }
}
