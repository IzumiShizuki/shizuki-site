package x4;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.nio.ByteBuffer;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends n4.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f24747q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f24749s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f24752v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24748r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24750t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24751u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f24742l = 100000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24739i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f24743m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24741k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f24740j = 1024;

    public z() {
        byte[] bArr = c0.f16553f;
        this.f24749s = bArr;
        this.f24752v = bArr;
    }

    @Override // n4.g, n4.f
    public final boolean b() {
        return super.b() && this.f24745o;
    }

    @Override // n4.f
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f15277g.hasRemaining()) {
            int i10 = this.f24746p;
            short s10 = this.f24740j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f24749s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s10) {
                        int i11 = this.f24744n;
                        iPosition = ((iLimit3 / i11) * i11) + i11;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f24746p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                p4.c.i(this.f24750t < this.f24749s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s10) {
                        int i12 = this.f24744n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f24750t;
                int i13 = this.f24751u;
                int length2 = length + i13;
                byte[] bArr = this.f24749s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f24749s, length2, iMin);
                int i15 = this.f24751u + iMin;
                this.f24751u = i15;
                p4.c.i(i15 <= this.f24749s.length);
                boolean z11 = z10 && iPosition3 < i14;
                m(z11);
                if (z11) {
                    this.f24746p = 0;
                    this.f24748r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // n4.g
    public final n4.d g(n4.d dVar) throws n4.e {
        if (dVar.f15269c == 2) {
            return dVar.f15267a == -1 ? n4.d.f15266e : dVar;
        }
        throw new n4.e(dVar);
    }

    @Override // n4.g
    public final void h() {
        if (b()) {
            n4.d dVar = this.f15272b;
            int i10 = dVar.f15268b * 2;
            this.f24744n = i10;
            int i11 = ((((int) ((this.f24742l * ((long) dVar.f15267a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f24749s.length != i11) {
                this.f24749s = new byte[i11];
                this.f24752v = new byte[i11];
            }
        }
        this.f24746p = 0;
        this.f24747q = 0L;
        this.f24748r = 0;
        this.f24750t = 0;
        this.f24751u = 0;
    }

    @Override // n4.g
    public final void i() {
        if (this.f24751u > 0) {
            m(true);
            this.f24748r = 0;
        }
    }

    @Override // n4.g
    public final void j() {
        this.f24745o = false;
        byte[] bArr = c0.f16553f;
        this.f24749s = bArr;
        this.f24752v = bArr;
    }

    public final int l(int i10) {
        int length = ((((int) ((this.f24743m * ((long) this.f15272b.f15267a)) / 1000000)) - this.f24748r) * this.f24744n) - (this.f24749s.length / 2);
        p4.c.i(length >= 0);
        int iMin = (int) Math.min((i10 * this.f24739i) + 0.5f, length);
        int i11 = this.f24744n;
        return (iMin / i11) * i11;
    }

    public final void m(boolean z10) {
        int length;
        int iL;
        int i10 = this.f24751u;
        byte[] bArr = this.f24749s;
        if (i10 == bArr.length || z10) {
            if (this.f24748r == 0) {
                if (z10) {
                    n(i10, 3);
                    length = i10;
                } else {
                    p4.c.i(i10 >= bArr.length / 2);
                    length = this.f24749s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f24749s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            p4.c.h("bytesConsumed is not aligned to frame size: %s" + length, length % this.f24744n == 0);
            p4.c.i(i10 >= iL);
            this.f24751u -= length;
            int i11 = this.f24750t + length;
            this.f24750t = i11;
            this.f24750t = i11 % this.f24749s.length;
            int i12 = this.f24748r;
            int i13 = this.f24744n;
            this.f24748r = (iL / i13) + i12;
            this.f24747q += (long) ((length - iL) / i13);
        }
    }

    public final void n(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        p4.c.c(this.f24751u >= i10);
        if (i11 == 2) {
            int i12 = this.f24750t;
            int i13 = this.f24751u;
            int i14 = i12 + i13;
            byte[] bArr = this.f24749s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f24752v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f24752v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f24752v, 0, i15);
                    System.arraycopy(this.f24749s, 0, this.f24752v, i15, length);
                }
            }
        } else {
            int i16 = this.f24750t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f24749s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f24752v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f24752v, 0, length2);
                System.arraycopy(this.f24749s, 0, this.f24752v, length2, i10 - length2);
            }
        }
        p4.c.b("sizeToOutput is not aligned to frame size: " + i10, i10 % this.f24744n == 0);
        p4.c.i(this.f24750t < this.f24749s.length);
        byte[] bArr3 = this.f24752v;
        p4.c.b("byteOutput size is not aligned to frame size " + i10, i10 % this.f24744n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f24741k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        k(i10).put(bArr3, 0, i10).flip();
    }
}
