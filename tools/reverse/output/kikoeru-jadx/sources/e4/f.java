package e4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f6101a.mark(Integer.MAX_VALUE);
    }

    public final void g(long j10) throws IOException {
        int i10 = this.f6102b;
        if (i10 > j10) {
            this.f6102b = 0;
            this.f6101a.reset();
        } else {
            j10 -= (long) i10;
        }
        b((int) j10);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f6101a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
