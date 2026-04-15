package lh;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f12568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f12569f;

    public e0(byte[][] bArr, int[] iArr) {
        super(i.f12572d.f12573a);
        this.f12568e = bArr;
        this.f12569f = iArr;
    }

    @Override // lh.i
    public final String a() {
        return u().a();
    }

    @Override // lh.i
    public final i c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f12568e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f12569f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        jc.l.b(bArrDigest);
        return new i(bArrDigest);
    }

    @Override // lh.i
    public final int d() {
        return this.f12569f[this.f12568e.length - 1];
    }

    @Override // lh.i
    public final String e() {
        return u().e();
    }

    @Override // lh.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.d() == d() && m(0, iVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // lh.i
    public final int f(byte[] bArr, int i10) {
        jc.l.e(bArr, "other");
        return u().f(bArr, i10);
    }

    @Override // lh.i
    public final byte[] h() {
        return r();
    }

    @Override // lh.i
    public final int hashCode() {
        int i10 = this.f12574b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f12568e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            int[] iArr = this.f12569f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f12574b = i13;
        return i13;
    }

    @Override // lh.i
    public final byte i(int i10) {
        byte[][] bArr = this.f12568e;
        int length = bArr.length - 1;
        int[] iArr = this.f12569f;
        android.support.v4.media.session.b.y(iArr[length], i10, 1L);
        int iG = mh.b.g(this, i10);
        return bArr[iG][(i10 - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // lh.i
    public final int j(byte[] bArr) {
        jc.l.e(bArr, "other");
        return u().j(bArr);
    }

    @Override // lh.i
    public final boolean l(int i10, int i11, int i12, byte[] bArr) {
        jc.l.e(bArr, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iG = mh.b.g(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f12569f;
            int i14 = iG == 0 ? 0 : iArr[iG - 1];
            int i15 = iArr[iG] - i14;
            byte[][] bArr2 = this.f12568e;
            int i16 = iArr[bArr2.length + iG];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!android.support.v4.media.session.b.t((i10 - i14) + i16, i11, iMin, bArr2[iG], bArr)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iG++;
        }
        return true;
    }

    @Override // lh.i
    public final boolean m(int i10, i iVar, int i11) {
        jc.l.e(iVar, "other");
        if (i10 >= 0 && i10 <= d() - i11) {
            int i12 = i11 + i10;
            int iG = mh.b.g(this, i10);
            int i13 = 0;
            while (i10 < i12) {
                int[] iArr = this.f12569f;
                int i14 = iG == 0 ? 0 : iArr[iG - 1];
                int i15 = iArr[iG] - i14;
                byte[][] bArr = this.f12568e;
                int i16 = iArr[bArr.length + iG];
                int iMin = Math.min(i12, i15 + i14) - i10;
                if (iVar.l(i13, (i10 - i14) + i16, iMin, bArr[iG])) {
                    i13 += iMin;
                    i10 += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // lh.i
    public final String n(Charset charset) {
        jc.l.e(charset, "charset");
        return u().n(charset);
    }

    @Override // lh.i
    public final i o(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "beginIndex=", " < 0").toString());
        }
        if (i11 > d()) {
            StringBuilder sbO = j2.h0.o(i11, "endIndex=", " > length(");
            sbO.append(d());
            sbO.append(')');
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(a0.c.I("endIndex=", i11, i10, " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == d()) {
            return this;
        }
        if (i10 == i11) {
            return i.f12572d;
        }
        int iG = mh.b.g(this, i10);
        int iG2 = mh.b.g(this, i11 - 1);
        byte[][] bArr = this.f12568e;
        byte[][] bArr2 = (byte[][]) vb.l.o0(iG, iG2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f12569f;
        if (iG <= iG2) {
            int i13 = iG;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iG2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new e0(bArr2, iArr);
    }

    @Override // lh.i
    public final i q() {
        return u().q();
    }

    @Override // lh.i
    public final byte[] r() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f12568e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f12569f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            vb.l.g0(i12, i13, i13 + i15, bArr2[i10], bArr);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // lh.i
    public final void t(f fVar, int i10) {
        int iG = mh.b.g(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f12569f;
            int i12 = iG == 0 ? 0 : iArr[iG - 1];
            int i13 = iArr[iG] - i12;
            byte[][] bArr = this.f12568e;
            int i14 = iArr[bArr.length + iG];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            c0 c0Var = new c0(bArr[iG], i15, i15 + iMin, true);
            c0 c0Var2 = fVar.f12570a;
            if (c0Var2 == null) {
                c0Var.f12562g = c0Var;
                c0Var.f12561f = c0Var;
                fVar.f12570a = c0Var;
            } else {
                c0 c0Var3 = c0Var2.f12562g;
                jc.l.b(c0Var3);
                c0Var3.b(c0Var);
            }
            i11 += iMin;
            iG++;
        }
        fVar.f12571b += (long) i10;
    }

    @Override // lh.i
    public final String toString() {
        return u().toString();
    }

    public final i u() {
        return new i(r());
    }
}
