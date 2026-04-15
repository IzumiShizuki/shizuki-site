package r5;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.i f18844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18846d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18849g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f18847e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18843a = new byte[4096];

    static {
        m4.j0.a("media3.extractor");
    }

    public k(m4.i iVar, long j10, long j11) {
        this.f18844b = iVar;
        this.f18846d = j10;
        this.f18845c = j11;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        b(i10);
        int iC = this.f18849g - this.f18848f;
        while (iC < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iC = c(this.f18847e, this.f18848f, i11, iC, z11);
            if (iC == -1) {
                return false;
            }
            this.f18849g = this.f18848f + iC;
            i10 = i11;
            z10 = z11;
        }
        this.f18848f += i10;
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f18848f + i10;
        byte[] bArr = this.f18847e;
        if (i11 > bArr.length) {
            this.f18847e = Arrays.copyOf(this.f18847e, p4.c0.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int c(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f18844b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // r5.o
    public final boolean d(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f18849g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f18847e, 0, bArr, i10, iMin);
            e(iMin);
        }
        int iC = iMin;
        while (iC < i11 && iC != -1) {
            iC = c(bArr, i10, i11, iC, z10);
        }
        if (iC != -1) {
            this.f18846d += (long) iC;
        }
        return iC != -1;
    }

    public final void e(int i10) {
        int i11 = this.f18849g - i10;
        this.f18849g = i11;
        this.f18848f = 0;
        byte[] bArr = this.f18847e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f18847e = bArr2;
    }

    @Override // r5.o
    public final long getLength() {
        return this.f18845c;
    }

    @Override // r5.o
    public final long getPosition() {
        return this.f18846d;
    }

    @Override // r5.o
    public final boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f18847e, this.f18848f - i11, bArr, i10, i11);
        return true;
    }

    @Override // r5.o
    public final long j() {
        return this.f18846d + ((long) this.f18848f);
    }

    @Override // r5.o
    public final void k(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    @Override // r5.o
    public final int m(int i10) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin = Math.min(this.f18849g, i10);
        e(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f18843a;
            kVar = this;
            iMin = kVar.c(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            kVar = this;
        }
        if (iMin != -1) {
            kVar.f18846d += (long) iMin;
        }
        return iMin;
    }

    @Override // r5.o
    public final int o(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin;
        b(i11);
        int i12 = this.f18849g;
        int i13 = this.f18848f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            kVar = this;
            iMin = kVar.c(this.f18847e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            kVar.f18849g += iMin;
        } else {
            kVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(kVar.f18847e, kVar.f18848f, bArr, i10, iMin);
        kVar.f18848f += iMin;
        return iMin;
    }

    @Override // r5.o
    public final void q() {
        this.f18848f = 0;
    }

    @Override // r5.o
    public final void r(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f18849g, i10);
        e(iMin);
        int iC = iMin;
        while (iC < i10 && iC != -1) {
            byte[] bArr = this.f18843a;
            iC = c(bArr, -iC, Math.min(i10, bArr.length + iC), iC, false);
        }
        if (iC != -1) {
            this.f18846d += (long) iC;
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        k kVar;
        int i12 = this.f18849g;
        int iC = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f18847e, 0, bArr, i10, iMin);
            e(iMin);
            iC = iMin;
        }
        if (iC == 0) {
            kVar = this;
            iC = kVar.c(bArr, i10, i11, 0, true);
        } else {
            kVar = this;
        }
        if (iC != -1) {
            kVar.f18846d += (long) iC;
        }
        return iC;
    }

    @Override // r5.o
    public final void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        d(bArr, i10, i11, false);
    }

    @Override // r5.o
    public final void z(byte[] bArr, int i10, int i11) {
        i(bArr, i10, i11, false);
    }
}
