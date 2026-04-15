package x4;

import java.nio.ByteBuffer;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends n4.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f24591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f24593o;

    @Override // n4.g, n4.f
    public final ByteBuffer a() {
        int i10;
        if (super.f() && (i10 = this.f24592n) > 0) {
            k(i10).put(this.f24591m, 0, this.f24592n).flip();
            this.f24592n = 0;
        }
        return super.a();
    }

    @Override // n4.f
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f24590l);
        this.f24593o += (long) (iMin / this.f15272b.f15270d);
        this.f24590l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f24590l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f24592n + i11) - this.f24591m.length;
        ByteBuffer byteBufferK = k(length);
        int i12 = c0.i(length, 0, this.f24592n);
        byteBufferK.put(this.f24591m, 0, i12);
        int i13 = c0.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - i13;
        int i15 = this.f24592n - i12;
        this.f24592n = i15;
        byte[] bArr = this.f24591m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.f24591m, this.f24592n, i14);
        this.f24592n += i14;
        byteBufferK.flip();
    }

    @Override // n4.g, n4.f
    public final boolean f() {
        return super.f() && this.f24592n == 0;
    }

    @Override // n4.g
    public final n4.d g(n4.d dVar) throws n4.e {
        if (dVar.f15269c != 2) {
            throw new n4.e(dVar);
        }
        this.f24589k = true;
        return (this.f24587i == 0 && this.f24588j == 0) ? n4.d.f15266e : dVar;
    }

    @Override // n4.g
    public final void h() {
        if (this.f24589k) {
            this.f24589k = false;
            int i10 = this.f24588j;
            int i11 = this.f15272b.f15270d;
            this.f24591m = new byte[i10 * i11];
            this.f24590l = this.f24587i * i11;
        }
        this.f24592n = 0;
    }

    @Override // n4.g
    public final void i() {
        if (this.f24589k) {
            int i10 = this.f24592n;
            if (i10 > 0) {
                this.f24593o += (long) (i10 / this.f15272b.f15270d);
            }
            this.f24592n = 0;
        }
    }

    @Override // n4.g
    public final void j() {
        this.f24591m = c0.f16553f;
    }
}
