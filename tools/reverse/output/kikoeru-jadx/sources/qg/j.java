package qg;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PushbackInputStream f18286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f18288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18289d;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18286a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f18288c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f18289d;
        if (j10 != -1) {
            long j11 = this.f18287b;
            if (j11 >= j10) {
                return -1;
            }
            long j12 = j10 - j11;
            if (i11 > j12) {
                i11 = (int) j12;
            }
        }
        int i12 = this.f18286a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f18287b += (long) i12;
        }
        return i12;
    }
}
