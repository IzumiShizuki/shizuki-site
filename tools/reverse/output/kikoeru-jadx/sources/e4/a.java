package e4;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6100b;

    public a(f fVar) {
        this.f6100b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f6099a;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) this.f6100b.f6101a.available())) {
                    return -1;
                }
                this.f6100b.g(j10);
                this.f6099a = j10;
            }
            if (i11 > this.f6100b.f6101a.available()) {
                i11 = this.f6100b.f6101a.available();
            }
            int i12 = this.f6100b.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f6099a += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f6099a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
