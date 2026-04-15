package lh;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12571b;

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long B() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f12571b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L94
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            lh.c0 r6 = r15.f12570a
            jc.l.b(r6)
            byte[] r7 = r6.f12556a
            int r8 = r6.f12557b
            int r9 = r6.f12558c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            lh.f r0 = new lh.f
            r0.<init>()
            r0.g0(r4)
            r0.e0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.L()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = android.support.v4.media.session.b.Y(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r8 != r9) goto L85
            lh.c0 r7 = r6.a()
            r15.f12570a = r7
            lh.d0.a(r6)
            goto L87
        L85:
            r6.f12557b = r8
        L87:
            if (r1 != 0) goto L8d
            lh.c0 r6 = r15.f12570a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r15.f12571b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f12571b = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.f.B():long");
    }

    public final short D() throws EOFException {
        short s10 = readShort();
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g E(String str) {
        k0(str);
        return this;
    }

    @Override // lh.h
    public final String F(Charset charset) {
        jc.l.e(charset, "charset");
        return G(this.f12571b, charset);
    }

    public final String G(long j10, Charset charset) throws EOFException {
        jc.l.e(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount: ").toString());
        }
        if (this.f12571b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        int i10 = c0Var.f12557b;
        if (((long) i10) + j10 > c0Var.f12558c) {
            return new String(u(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(c0Var.f12556a, i10, i11, charset);
        int i12 = c0Var.f12557b + i11;
        c0Var.f12557b = i12;
        this.f12571b -= j10;
        if (i12 == c0Var.f12558c) {
            this.f12570a = c0Var.a();
            d0.a(c0Var);
        }
        return str;
    }

    @Override // lh.f0
    public final void H(f fVar, long j10) {
        c0 c0VarB;
        jc.l.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        android.support.v4.media.session.b.y(fVar.f12571b, 0L, j10);
        while (j10 > 0) {
            c0 c0Var = fVar.f12570a;
            jc.l.b(c0Var);
            int i10 = c0Var.f12558c;
            jc.l.b(fVar.f12570a);
            int i11 = 0;
            if (j10 < i10 - r1.f12557b) {
                c0 c0Var2 = this.f12570a;
                c0 c0Var3 = c0Var2 != null ? c0Var2.f12562g : null;
                if (c0Var3 != null && c0Var3.f12560e) {
                    if ((((long) c0Var3.f12558c) + j10) - ((long) (c0Var3.f12559d ? 0 : c0Var3.f12557b)) <= 8192) {
                        c0 c0Var4 = fVar.f12570a;
                        jc.l.b(c0Var4);
                        c0Var4.d(c0Var3, (int) j10);
                        fVar.f12571b -= j10;
                        this.f12571b += j10;
                        return;
                    }
                }
                c0 c0Var5 = fVar.f12570a;
                jc.l.b(c0Var5);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > c0Var5.f12558c - c0Var5.f12557b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    c0VarB = c0Var5.c();
                } else {
                    c0VarB = d0.b();
                    byte[] bArr = c0Var5.f12556a;
                    byte[] bArr2 = c0VarB.f12556a;
                    int i13 = c0Var5.f12557b;
                    vb.l.g0(0, i13, i13 + i12, bArr, bArr2);
                }
                c0VarB.f12558c = c0VarB.f12557b + i12;
                c0Var5.f12557b += i12;
                c0 c0Var6 = c0Var5.f12562g;
                jc.l.b(c0Var6);
                c0Var6.b(c0VarB);
                fVar.f12570a = c0VarB;
            }
            c0 c0Var7 = fVar.f12570a;
            jc.l.b(c0Var7);
            long j11 = c0Var7.f12558c - c0Var7.f12557b;
            fVar.f12570a = c0Var7.a();
            c0 c0Var8 = this.f12570a;
            if (c0Var8 == null) {
                this.f12570a = c0Var7;
                c0Var7.f12562g = c0Var7;
                c0Var7.f12561f = c0Var7;
            } else {
                c0 c0Var9 = c0Var8.f12562g;
                jc.l.b(c0Var9);
                c0Var9.b(c0Var7);
                c0 c0Var10 = c0Var7.f12562g;
                if (c0Var10 == c0Var7) {
                    throw new IllegalStateException("cannot compact");
                }
                jc.l.b(c0Var10);
                if (c0Var10.f12560e) {
                    int i14 = c0Var7.f12558c - c0Var7.f12557b;
                    c0 c0Var11 = c0Var7.f12562g;
                    jc.l.b(c0Var11);
                    int i15 = 8192 - c0Var11.f12558c;
                    c0 c0Var12 = c0Var7.f12562g;
                    jc.l.b(c0Var12);
                    if (!c0Var12.f12559d) {
                        c0 c0Var13 = c0Var7.f12562g;
                        jc.l.b(c0Var13);
                        i11 = c0Var13.f12557b;
                    }
                    if (i14 <= i15 + i11) {
                        c0 c0Var14 = c0Var7.f12562g;
                        jc.l.b(c0Var14);
                        c0Var7.d(c0Var14, i14);
                        c0Var7.a();
                        d0.a(c0Var7);
                    }
                }
            }
            fVar.f12571b -= j11;
            this.f12571b += j11;
            j10 -= j11;
        }
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g J(i iVar) {
        X(iVar);
        return this;
    }

    @Override // lh.h
    public final int K(w wVar) throws EOFException {
        jc.l.e(wVar, "options");
        int iC = mh.a.c(this, wVar, false);
        if (iC == -1) {
            return -1;
        }
        skip(wVar.f12615a[iC].d());
        return iC;
    }

    public final String L() {
        return G(this.f12571b, ef.a.f6541a);
    }

    @Override // lh.h
    public final i N() {
        return j(this.f12571b);
    }

    public final i O(int i10) {
        if (i10 == 0) {
            return i.f12572d;
        }
        android.support.v4.media.session.b.y(this.f12571b, 0L, i10);
        c0 c0Var = this.f12570a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            jc.l.b(c0Var);
            int i14 = c0Var.f12558c;
            int i15 = c0Var.f12557b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            c0Var = c0Var.f12561f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        c0 c0Var2 = this.f12570a;
        int i16 = 0;
        while (i11 < i10) {
            jc.l.b(c0Var2);
            bArr[i16] = c0Var2.f12556a;
            i11 += c0Var2.f12558c - c0Var2.f12557b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c0Var2.f12557b;
            c0Var2.f12559d = true;
            i16++;
            c0Var2 = c0Var2.f12561f;
        }
        return new e0(bArr, iArr);
    }

    @Override // lh.h
    public final boolean P(long j10) {
        return this.f12571b >= j10;
    }

    public final c0 R(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            c0 c0VarB = d0.b();
            this.f12570a = c0VarB;
            c0VarB.f12562g = c0VarB;
            c0VarB.f12561f = c0VarB;
            return c0VarB;
        }
        c0 c0Var2 = c0Var.f12562g;
        jc.l.b(c0Var2);
        if (c0Var2.f12558c + i10 <= 8192 && c0Var2.f12560e) {
            return c0Var2;
        }
        c0 c0VarB2 = d0.b();
        c0Var2.b(c0VarB2);
        return c0VarB2;
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) {
        jc.l.e(fVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        long j11 = this.f12571b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        fVar.H(this, j10);
        return j10;
    }

    public final void X(i iVar) {
        jc.l.e(iVar, "byteString");
        iVar.t(this, iVar.d());
    }

    public final void Y(byte[] bArr, int i10) {
        jc.l.e(bArr, "source");
        int i11 = 0;
        long j10 = i10;
        android.support.v4.media.session.b.y(bArr.length, 0, j10);
        while (i11 < i10) {
            c0 c0VarR = R(1);
            int iMin = Math.min(i10 - i11, 8192 - c0VarR.f12558c);
            int i12 = i11 + iMin;
            vb.l.g0(c0VarR.f12558c, i11, i12, bArr, c0VarR.f12556a);
            c0VarR.f12558c += iMin;
            i11 = i12;
        }
        this.f12571b += j10;
    }

    @Override // lh.h0
    public final j0 a() {
        return j0.f12579d;
    }

    @Override // lh.h
    public final void a0(long j10) throws EOFException {
        if (this.f12571b < j10) {
            throw new EOFException();
        }
    }

    public final long b() {
        long j10 = this.f12571b;
        if (j10 == 0) {
            return 0L;
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        c0 c0Var2 = c0Var.f12562g;
        jc.l.b(c0Var2);
        int i10 = c0Var2.f12558c;
        return (i10 >= 8192 || !c0Var2.f12560e) ? j10 : j10 - ((long) (i10 - c0Var2.f12557b));
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g b0(long j10) {
        f0(j10);
        return this;
    }

    public final void c0(h0 h0Var) {
        jc.l.e(h0Var, "source");
        while (h0Var.W(this, 8192L) != -1) {
        }
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f12571b == 0) {
            return fVar;
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        c0 c0VarC = c0Var.c();
        fVar.f12570a = c0VarC;
        c0VarC.f12562g = c0VarC;
        c0VarC.f12561f = c0VarC;
        for (c0 c0Var2 = c0Var.f12561f; c0Var2 != c0Var; c0Var2 = c0Var2.f12561f) {
            c0 c0Var3 = c0VarC.f12562g;
            jc.l.b(c0Var3);
            jc.l.b(c0Var2);
            c0Var3.b(c0Var2.c());
        }
        fVar.f12571b = this.f12571b;
        return fVar;
    }

    public final void e0(int i10) {
        c0 c0VarR = R(1);
        byte[] bArr = c0VarR.f12556a;
        int i11 = c0VarR.f12558c;
        c0VarR.f12558c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f12571b++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j10 = this.f12571b;
        f fVar = (f) obj;
        if (j10 != fVar.f12571b) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        c0 c0Var2 = fVar.f12570a;
        jc.l.b(c0Var2);
        int i10 = c0Var.f12557b;
        int i11 = c0Var2.f12557b;
        long j11 = 0;
        while (j11 < this.f12571b) {
            long jMin = Math.min(c0Var.f12558c - i10, c0Var2.f12558c - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (c0Var.f12556a[i10] != c0Var2.f12556a[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == c0Var.f12558c) {
                c0Var = c0Var.f12561f;
                jc.l.b(c0Var);
                i10 = c0Var.f12557b;
            }
            if (i11 == c0Var2.f12558c) {
                c0Var2 = c0Var2.f12561f;
                jc.l.b(c0Var2);
                i11 = c0Var2.f12557b;
            }
            j11 += jMin;
        }
        return true;
    }

    public final void f0(long j10) {
        boolean z10;
        if (j10 == 0) {
            e0(48);
            return;
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                k0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        byte[] bArr = mh.a.f15164a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        int i10 = iNumberOfLeadingZeros + (j10 > mh.a.f15165b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z10) {
            i10++;
        }
        c0 c0VarR = R(i10);
        byte[] bArr2 = c0VarR.f12556a;
        int i11 = c0VarR.f12558c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr2[i11] = mh.a.f15164a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr2[i11 - 1] = 45;
        }
        c0VarR.f12558c += i10;
        this.f12571b += (long) i10;
    }

    public final void g(f fVar, long j10, long j11) {
        jc.l.e(fVar, "out");
        long j12 = j10;
        android.support.v4.media.session.b.y(this.f12571b, j12, j11);
        if (j11 == 0) {
            return;
        }
        fVar.f12571b += j11;
        c0 c0Var = this.f12570a;
        while (true) {
            jc.l.b(c0Var);
            long j13 = c0Var.f12558c - c0Var.f12557b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            c0Var = c0Var.f12561f;
        }
        c0 c0Var2 = c0Var;
        long j14 = j11;
        while (j14 > 0) {
            jc.l.b(c0Var2);
            c0 c0VarC = c0Var2.c();
            int i10 = c0VarC.f12557b + ((int) j12);
            c0VarC.f12557b = i10;
            c0VarC.f12558c = Math.min(i10 + ((int) j14), c0VarC.f12558c);
            c0 c0Var3 = fVar.f12570a;
            if (c0Var3 == null) {
                c0VarC.f12562g = c0VarC;
                c0VarC.f12561f = c0VarC;
                fVar.f12570a = c0VarC;
            } else {
                c0 c0Var4 = c0Var3.f12562g;
                jc.l.b(c0Var4);
                c0Var4.b(c0VarC);
            }
            j14 -= (long) (c0VarC.f12558c - c0VarC.f12557b);
            c0Var2 = c0Var2.f12561f;
            j12 = 0;
        }
    }

    public final void g0(long j10) {
        if (j10 == 0) {
            e0(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        c0 c0VarR = R(i10);
        byte[] bArr = c0VarR.f12556a;
        int i11 = c0VarR.f12558c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = mh.a.f15164a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        c0VarR.f12558c += i10;
        this.f12571b += (long) i10;
    }

    public final void h0(int i10) {
        c0 c0VarR = R(4);
        byte[] bArr = c0VarR.f12556a;
        int i11 = c0VarR.f12558c;
        bArr[i11] = (byte) ((i10 >>> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[i11 + 3] = (byte) (i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        c0VarR.f12558c = i11 + 4;
        this.f12571b += 4;
    }

    public final int hashCode() {
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c0Var.f12558c;
            for (int i12 = c0Var.f12557b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c0Var.f12556a[i12];
            }
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
        } while (c0Var != this.f12570a);
        return i10;
    }

    public final boolean i() {
        return this.f12571b == 0;
    }

    public final void i0(int i10) {
        c0 c0VarR = R(2);
        byte[] bArr = c0VarR.f12556a;
        int i11 = c0VarR.f12558c;
        bArr[i11] = (byte) ((i10 >>> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[i11 + 1] = (byte) (i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        c0VarR.f12558c = i11 + 2;
        this.f12571b += 2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // lh.h
    public final i j(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount: ").toString());
        }
        if (this.f12571b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new i(u(j10));
        }
        i iVarO = O((int) j10);
        skip(j10);
        return iVarO;
    }

    public final void j0(int i10, int i11, String str) {
        char cCharAt;
        jc.l.e(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.B(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(a0.c.I("endIndex < beginIndex: ", i11, i10, " < ").toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbO = j2.h0.o(i11, "endIndex > string.length: ", " > ");
            sbO.append(str.length());
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                c0 c0VarR = R(1);
                byte[] bArr = c0VarR.f12556a;
                int i12 = c0VarR.f12558c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = c0VarR.f12558c;
                int i15 = (i12 + i10) - i14;
                c0VarR.f12558c = i14 + i15;
                this.f12571b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    c0 c0VarR2 = R(2);
                    byte[] bArr2 = c0VarR2.f12556a;
                    int i16 = c0VarR2.f12558c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarR2.f12558c = i16 + 2;
                    this.f12571b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    c0 c0VarR3 = R(3);
                    byte[] bArr3 = c0VarR3.f12556a;
                    int i17 = c0VarR3.f12558c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarR3.f12558c = i17 + 3;
                    this.f12571b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        e0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        c0 c0VarR4 = R(4);
                        byte[] bArr4 = c0VarR4.f12556a;
                        int i20 = c0VarR4.f12558c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        c0VarR4.f12558c = i20 + 4;
                        this.f12571b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final byte k(long j10) {
        android.support.v4.media.session.b.y(this.f12571b, j10, 1L);
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            jc.l.b(null);
            throw null;
        }
        long j11 = this.f12571b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                c0Var = c0Var.f12562g;
                jc.l.b(c0Var);
                j11 -= (long) (c0Var.f12558c - c0Var.f12557b);
            }
            return c0Var.f12556a[(int) ((((long) c0Var.f12557b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = c0Var.f12558c;
            int i11 = c0Var.f12557b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return c0Var.f12556a[(int) ((((long) i11) + j10) - j12)];
            }
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j12 = j13;
        }
    }

    public final void k0(String str) {
        jc.l.e(str, "string");
        j0(0, str.length(), str);
    }

    public final void l0(int i10) {
        if (i10 < 128) {
            e0(i10);
            return;
        }
        if (i10 < 2048) {
            c0 c0VarR = R(2);
            byte[] bArr = c0VarR.f12556a;
            int i11 = c0VarR.f12558c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            c0VarR.f12558c = i11 + 2;
            this.f12571b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            e0(63);
            return;
        }
        if (i10 < 65536) {
            c0 c0VarR2 = R(3);
            byte[] bArr2 = c0VarR2.f12556a;
            int i12 = c0VarR2.f12558c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            c0VarR2.f12558c = i12 + 3;
            this.f12571b += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(android.support.v4.media.session.b.Z(i10)));
        }
        c0 c0VarR3 = R(4);
        byte[] bArr3 = c0VarR3.f12556a;
        int i13 = c0VarR3.f12558c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        c0VarR3.f12558c = i13 + 4;
        this.f12571b += 4;
    }

    public final long n(byte b10, long j10, long j11) {
        c0 c0Var;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + this.f12571b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long j13 = this.f12571b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (c0Var = this.f12570a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                c0Var = c0Var.f12562g;
                jc.l.b(c0Var);
                j13 -= (long) (c0Var.f12558c - c0Var.f12557b);
            }
            while (j13 < j11) {
                byte[] bArr = c0Var.f12556a;
                int iMin = (int) Math.min(c0Var.f12558c, (((long) c0Var.f12557b) + j11) - j13);
                for (int i10 = (int) ((((long) c0Var.f12557b) + j10) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - c0Var.f12557b)) + j13;
                    }
                }
                j13 += (long) (c0Var.f12558c - c0Var.f12557b);
                c0Var = c0Var.f12561f;
                jc.l.b(c0Var);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j12;
            if (j14 > j10) {
                break;
            }
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j12 = j14;
        }
        while (j12 < j11) {
            byte[] bArr2 = c0Var.f12556a;
            int iMin2 = (int) Math.min(c0Var.f12558c, (((long) c0Var.f12557b) + j11) - j12);
            for (int i11 = (int) ((((long) c0Var.f12557b) + j10) - j12); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return ((long) (i11 - c0Var.f12557b)) + j12;
                }
            }
            j12 += (long) (c0Var.f12558c - c0Var.f12557b);
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j10 = j12;
        }
        return -1L;
    }

    public final long o(i iVar) {
        int i10;
        int i11;
        jc.l.e(iVar, "targetBytes");
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            return -1L;
        }
        long j10 = this.f12571b;
        long j11 = 0;
        if (j10 < 0) {
            while (j10 > 0) {
                c0Var = c0Var.f12562g;
                jc.l.b(c0Var);
                j10 -= (long) (c0Var.f12558c - c0Var.f12557b);
            }
            if (iVar.d() == 2) {
                byte bI = iVar.i(0);
                byte bI2 = iVar.i(1);
                while (j10 < this.f12571b) {
                    byte[] bArr = c0Var.f12556a;
                    i10 = (int) ((((long) c0Var.f12557b) + j11) - j10);
                    int i12 = c0Var.f12558c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bI || b10 == bI2) {
                            i11 = c0Var.f12557b;
                        } else {
                            i10++;
                        }
                    }
                    j11 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j10;
                    c0Var = c0Var.f12561f;
                    jc.l.b(c0Var);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] bArrH = iVar.h();
            while (j10 < this.f12571b) {
                byte[] bArr2 = c0Var.f12556a;
                i10 = (int) ((((long) c0Var.f12557b) + j11) - j10);
                int i13 = c0Var.f12558c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrH) {
                        if (b11 == b12) {
                            i11 = c0Var.f12557b;
                        }
                    }
                    i10++;
                }
                j11 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j10;
                c0Var = c0Var.f12561f;
                jc.l.b(c0Var);
                j10 = j11;
            }
            return -1L;
        }
        j10 = 0;
        while (true) {
            long j12 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j10;
            if (j12 > 0) {
                break;
            }
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j10 = j12;
        }
        if (iVar.d() == 2) {
            byte bI3 = iVar.i(0);
            byte bI4 = iVar.i(1);
            while (j10 < this.f12571b) {
                byte[] bArr3 = c0Var.f12556a;
                i10 = (int) ((((long) c0Var.f12557b) + j11) - j10);
                int i14 = c0Var.f12558c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bI3 || b13 == bI4) {
                        i11 = c0Var.f12557b;
                    } else {
                        i10++;
                    }
                }
                j11 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j10;
                c0Var = c0Var.f12561f;
                jc.l.b(c0Var);
                j10 = j11;
            }
            return -1L;
        }
        byte[] bArrH2 = iVar.h();
        while (j10 < this.f12571b) {
            byte[] bArr4 = c0Var.f12556a;
            i10 = (int) ((((long) c0Var.f12557b) + j11) - j10);
            int i15 = c0Var.f12558c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrH2) {
                    if (b14 == b15) {
                        i11 = c0Var.f12557b;
                    }
                }
                i10++;
            }
            j11 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j10;
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j10 = j11;
        }
        return -1L;
        return ((long) (i10 - i11)) + j10;
    }

    public final boolean q(i iVar) {
        boolean z10;
        long j10;
        int i10;
        long j11;
        jc.l.e(iVar, "bytes");
        int iD = iVar.d();
        if (iD >= 0) {
            long j12 = iD;
            if (j12 <= this.f12571b && iD <= iVar.d()) {
                if (iD == 0) {
                    return true;
                }
                byte[] bArr = mh.a.f15164a;
                android.support.v4.media.session.b.y(iVar.d(), 0, j12);
                if (iD <= 0) {
                    throw new IllegalArgumentException("byteCount == 0");
                }
                long j13 = this.f12571b;
                long j14 = 1;
                long j15 = 1 > j13 ? j13 : 1L;
                if (0 == j15) {
                    j11 = -1;
                    z10 = false;
                } else {
                    z10 = false;
                    c0 c0Var = this.f12570a;
                    if (c0Var == null) {
                        j11 = -1;
                    } else if (j13 < 0) {
                        while (j13 > 0) {
                            c0Var = c0Var.f12562g;
                            jc.l.b(c0Var);
                            j13 -= (long) (c0Var.f12558c - c0Var.f12557b);
                            j14 = j14;
                        }
                        long j16 = j14;
                        byte[] bArrH = iVar.h();
                        byte b10 = bArrH[0];
                        long jMin = Math.min(j15, (this.f12571b - j12) + j16);
                        long j17 = 0;
                        loop1: while (j13 < jMin) {
                            byte[] bArr2 = c0Var.f12556a;
                            j10 = j13;
                            int iMin = (int) Math.min(c0Var.f12558c, (((long) c0Var.f12557b) + jMin) - j13);
                            i10 = (int) ((((long) c0Var.f12557b) + j17) - j10);
                            while (i10 < iMin) {
                                if (bArr2[i10] == b10 && mh.a.a(c0Var, i10 + 1, bArrH, 1, iD)) {
                                    j11 = ((long) (i10 - c0Var.f12557b)) + j10;
                                    break loop1;
                                }
                                i10++;
                            }
                            j17 = j10 + ((long) (c0Var.f12558c - c0Var.f12557b));
                            c0Var = c0Var.f12561f;
                            jc.l.b(c0Var);
                            j13 = j17;
                        }
                        j11 = -1;
                    } else {
                        long j18 = 0;
                        while (true) {
                            long j19 = ((long) (c0Var.f12558c - c0Var.f12557b)) + j18;
                            if (j19 > 0) {
                                break;
                            }
                            c0Var = c0Var.f12561f;
                            jc.l.b(c0Var);
                            j18 = j19;
                        }
                        byte[] bArrH2 = iVar.h();
                        byte b11 = bArrH2[0];
                        long jMin2 = Math.min(j15, (this.f12571b - j12) + 1);
                        long j20 = 0;
                        loop4: while (j18 < jMin2) {
                            byte[] bArr3 = c0Var.f12556a;
                            j10 = j18;
                            int iMin2 = (int) Math.min(c0Var.f12558c, (((long) c0Var.f12557b) + jMin2) - j18);
                            i10 = (int) ((((long) c0Var.f12557b) + j20) - j10);
                            while (i10 < iMin2) {
                                if (bArr3[i10] == b11 && mh.a.a(c0Var, i10 + 1, bArrH2, 1, iD)) {
                                    j11 = ((long) (i10 - c0Var.f12557b)) + j10;
                                    break loop1;
                                }
                                i10++;
                            }
                            j20 = j10 + ((long) (c0Var.f12558c - c0Var.f12557b));
                            c0Var = c0Var.f12561f;
                            jc.l.b(c0Var);
                            j18 = j20;
                        }
                        j11 = -1;
                    }
                }
                if (j11 != -1) {
                    return true;
                }
                return z10;
            }
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        jc.l.e(byteBuffer, "sink");
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c0Var.f12558c - c0Var.f12557b);
        byteBuffer.put(c0Var.f12556a, c0Var.f12557b, iMin);
        int i10 = c0Var.f12557b + iMin;
        c0Var.f12557b = i10;
        this.f12571b -= (long) iMin;
        if (i10 == c0Var.f12558c) {
            this.f12570a = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }

    @Override // lh.h
    public final byte readByte() throws EOFException {
        if (this.f12571b == 0) {
            throw new EOFException();
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        int i10 = c0Var.f12557b;
        int i11 = c0Var.f12558c;
        int i12 = i10 + 1;
        byte b10 = c0Var.f12556a[i10];
        this.f12571b--;
        if (i12 != i11) {
            c0Var.f12557b = i12;
            return b10;
        }
        this.f12570a = c0Var.a();
        d0.a(c0Var);
        return b10;
    }

    @Override // lh.h
    public final int readInt() throws EOFException {
        if (this.f12571b < 4) {
            throw new EOFException();
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        int i10 = c0Var.f12557b;
        int i11 = c0Var.f12558c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c0Var.f12556a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f12571b -= 4;
        if (i14 != i11) {
            c0Var.f12557b = i14;
            return i15;
        }
        this.f12570a = c0Var.a();
        d0.a(c0Var);
        return i15;
    }

    @Override // lh.h
    public final short readShort() throws EOFException {
        if (this.f12571b < 2) {
            throw new EOFException();
        }
        c0 c0Var = this.f12570a;
        jc.l.b(c0Var);
        int i10 = c0Var.f12557b;
        int i11 = c0Var.f12558c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c0Var.f12556a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f12571b -= 2;
        if (i14 == i11) {
            this.f12570a = c0Var.a();
            d0.a(c0Var);
        } else {
            c0Var.f12557b = i14;
        }
        return (short) i15;
    }

    @Override // lh.h
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            c0 c0Var = this.f12570a;
            if (c0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, c0Var.f12558c - c0Var.f12557b);
            long j11 = iMin;
            this.f12571b -= j11;
            j10 -= j11;
            int i10 = c0Var.f12557b + iMin;
            c0Var.f12557b = i10;
            if (i10 == c0Var.f12558c) {
                this.f12570a = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    public final String toString() {
        long j10 = this.f12571b;
        if (j10 <= 2147483647L) {
            return O((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f12571b).toString());
    }

    public final byte[] u(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount: ").toString());
        }
        if (this.f12571b < j10) {
            throw new EOFException();
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        return bArr;
    }

    @Override // lh.h
    public final long w(a0 a0Var) {
        long j10 = this.f12571b;
        if (j10 > 0) {
            a0Var.H(this, j10);
        }
        return j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        jc.l.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            c0 c0VarR = R(1);
            int iMin = Math.min(i10, 8192 - c0VarR.f12558c);
            byteBuffer.get(c0VarR.f12556a, c0VarR.f12558c, iMin);
            i10 -= iMin;
            c0VarR.f12558c += iMin;
        }
        this.f12571b += (long) iRemaining;
        return iRemaining;
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g writeByte(int i10) {
        e0(i10);
        return this;
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g writeInt(int i10) {
        h0(i10);
        return this;
    }

    @Override // lh.g
    public final /* bridge */ /* synthetic */ g writeShort(int i10) {
        i0(i10);
        return this;
    }

    @Override // lh.h
    public final String x(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jN = n((byte) 10, 0L, j11);
        if (jN != -1) {
            return mh.a.b(this, jN);
        }
        if (j11 < this.f12571b && k(j11 - 1) == 13 && k(j11) == 10) {
            return mh.a.b(this, j11);
        }
        f fVar = new f();
        g(fVar, 0L, Math.min(32, this.f12571b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f12571b, j10) + " content=" + fVar.j(fVar.f12571b).e() + (char) 8230);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r1 = new lh.f();
        r1.f0(r8);
        r1.e0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.L()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.f.y():long");
    }

    @Override // lh.g
    public final g write(byte[] bArr) {
        Y(bArr, bArr.length);
        return this;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        android.support.v4.media.session.b.y(bArr.length, i10, i11);
        c0 c0Var = this.f12570a;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, c0Var.f12558c - c0Var.f12557b);
        byte[] bArr2 = c0Var.f12556a;
        int i12 = c0Var.f12557b;
        vb.l.g0(i10, i12, i12 + iMin, bArr2, bArr);
        int i13 = c0Var.f12557b + iMin;
        c0Var.f12557b = i13;
        this.f12571b -= (long) iMin;
        if (i13 == c0Var.f12558c) {
            this.f12570a = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, lh.f0
    public final void close() {
    }

    @Override // lh.g, lh.f0, java.io.Flushable
    public final void flush() {
    }

    @Override // lh.h
    public final f s() {
        return this;
    }
}
