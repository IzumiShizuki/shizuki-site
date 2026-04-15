package bh;

import j2.h0;
import java.io.IOException;
import jc.l;
import ug.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3024e;

    @Override // bh.b, lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        l.e(fVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(h0.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f3011c) {
            throw new IllegalStateException("closed");
        }
        if (this.f3024e) {
            return -1L;
        }
        long jW = super.W(fVar, j10);
        if (jW != -1) {
            return jW;
        }
        this.f3024e = true;
        b(r.f21859b);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3011c) {
            return;
        }
        if (!this.f3024e) {
            b(h.f3025f);
        }
        this.f3011c = true;
    }
}
