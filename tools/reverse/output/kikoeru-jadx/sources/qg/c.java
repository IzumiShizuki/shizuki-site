package qg;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18273b = new byte[1];

    public c(b bVar) {
        this.f18272a = bVar;
    }

    public void b(InputStream inputStream, int i10) {
        this.f18272a.b(inputStream, i10);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18272a.close();
    }

    public int g(PushbackInputStream pushbackInputStream) {
        return 0;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f18273b;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.f18272a.read(bArr, i10, i11);
    }
}
