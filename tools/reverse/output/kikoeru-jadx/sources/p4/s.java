package p4;

import j2.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import q.t0;
import ya.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f16608d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f16609e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0 f16610f = m0.p(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f16611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16613c;

    public s() {
        this.f16611a = c0.f16553f;
    }

    public final int A() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f16612b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long B() {
        int i10;
        int i11;
        long j10 = this.f16611a[this.f16612b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(h0.i(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f16611a[this.f16612b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(h0.i(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f16612b += i11;
        return j10;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f16611a;
            int i10 = this.f16612b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f16612b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f16611a;
        int i11 = this.f16612b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f16612b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f16612b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i10) {
        byte[] bArr = this.f16611a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        E(bArr, i10);
    }

    public final void E(byte[] bArr, int i10) {
        this.f16611a = bArr;
        this.f16613c = i10;
        this.f16612b = 0;
    }

    public final void F(int i10) {
        c.c(i10 >= 0 && i10 <= this.f16611a.length);
        this.f16613c = i10;
    }

    public final void G(int i10) {
        c.c(i10 >= 0 && i10 <= this.f16613c);
        this.f16612b = i10;
    }

    public final void H(int i10) {
        G(this.f16612b + i10);
    }

    public final int a() {
        return this.f16613c - this.f16612b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f16611a;
        if (i10 > bArr.length) {
            this.f16611a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        c.b("Unsupported charset: " + charset, f16610f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b10;
        int i10;
        byte b11;
        byte b12;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            long j10 = this.f16611a[this.f16612b] & 255;
            char c3 = (char) j10;
            ud.s.f(j10, "Out of range: %s", ((long) c3) == j10);
            b10 = (byte) c3;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f16611a;
                int i11 = this.f16612b;
                b11 = bArr[i11];
                b12 = bArr[i11 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f16611a;
                int i12 = this.f16612b;
                b11 = bArr2[i12 + 1];
                b12 = bArr2[i12];
            }
            b10 = (byte) ((char) ((b12 & 255) | (b11 << 8)));
        }
        long j11 = b10;
        char c10 = (char) j11;
        ud.s.f(j11, "Out of range: %s", ((long) c10) == j11);
        return (c10 << 16) + i10;
    }

    public final void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f16611a, this.f16612b, bArr, i10, i11);
        this.f16612b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c3 = (char) (iD >> 16);
            for (char c10 : cArr) {
                if (c10 == c3) {
                    this.f16612b += iD & 65535;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f16612b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f16612b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f16612b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(java.nio.charset.Charset r5) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.s.h(java.nio.charset.Charset):java.lang.String");
    }

    public final int i() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f16612b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f16612b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f16612b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long j() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f16612b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f16612b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f16612b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f16612b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f16612b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f16612b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f16612b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public final short k() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = bArr[i10] & 255;
        this.f16612b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long l() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f16612b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f16612b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f16612b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(t0.B(i10, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = bArr[i10] & 255;
        this.f16612b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f16612b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f16612b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f16612b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f16612b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f16612b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f16612b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f16612b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f16612b;
        while (i10 < this.f16613c && this.f16611a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f16611a;
        int i11 = this.f16612b;
        int i12 = c0.f16548a;
        String str = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f16612b = i10;
        if (i10 < this.f16613c) {
            this.f16612b = i10 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f16612b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f16613c || this.f16611a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f16611a;
        int i14 = c0.f16548a;
        String str = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.f16612b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f16612b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String s(int i10, Charset charset) {
        String str = new String(this.f16611a, this.f16612b, i10, charset);
        this.f16612b += i10;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        this.f16612b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int v() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f16612b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f16612b = i10 + 4;
        return i13;
    }

    public final long w() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f16612b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f16612b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f16612b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int x() {
        byte[] bArr = this.f16611a;
        int i10 = this.f16612b;
        int i11 = i10 + 1;
        this.f16612b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f16612b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f16612b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int y() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(t0.B(iG, "Top bit not zero: "));
    }

    public final long z() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(h0.i(jO, "Top bit not zero: "));
    }

    public s(int i10) {
        this.f16611a = new byte[i10];
        this.f16613c = i10;
    }

    public s(byte[] bArr) {
        this.f16611a = bArr;
        this.f16613c = bArr.length;
    }

    public s(byte[] bArr, int i10) {
        this.f16611a = bArr;
        this.f16613c = i10;
    }
}
