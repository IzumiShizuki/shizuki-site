package qg;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg.b f18269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18271d = new byte[1];

    public b(j jVar, rg.f fVar, char[] cArr, int i10, boolean z10) {
        this.f18268a = jVar;
        this.f18269b = g(fVar, cArr, z10);
        if (w0.c.a(n7.d.r(fVar), 2)) {
            this.f18270c = new byte[i10];
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18268a.close();
    }

    public abstract lg.b g(rg.f fVar, char[] cArr, boolean z10);

    public final void i(byte[] bArr) throws IOException {
        PushbackInputStream pushbackInputStream = this.f18268a.f18286a;
        int i10 = pushbackInputStream.read(bArr);
        if (i10 == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (i10 != bArr.length) {
            int length = bArr.length - i10;
            int i11 = 0;
            for (int i12 = 0; i10 < bArr.length && i11 != -1 && i12 < 15; i12++) {
                i11 += pushbackInputStream.read(bArr, i10, length);
                if (i11 > 0) {
                    i10 += i11;
                    length -= i11;
                }
            }
            if (i10 != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f18271d;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int iY = n7.d.y(this.f18268a, bArr, i10, i11);
        if (iY > 0) {
            byte[] bArr2 = this.f18270c;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, iY);
            }
            this.f18269b.g(bArr, i10, iY);
        }
        return iY;
    }

    public void b(InputStream inputStream, int i10) {
    }
}
