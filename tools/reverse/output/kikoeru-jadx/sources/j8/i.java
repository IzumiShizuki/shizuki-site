package j8;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10624b = 1073741824;

    public i(InputStream inputStream) {
        this.f10623a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10624b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10623a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f10623a.read();
        if (i10 == -1) {
            this.f10624b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f10623a.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f10623a.read(bArr);
        if (i10 == -1) {
            this.f10624b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f10623a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f10624b = 0;
        }
        return i12;
    }
}
