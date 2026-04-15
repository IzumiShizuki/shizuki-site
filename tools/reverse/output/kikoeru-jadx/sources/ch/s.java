package ch;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lh.h0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh.h f4244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4249f;

    public s(lh.h hVar) {
        jc.l.e(hVar, "source");
        this.f4244a = hVar;
    }

    @Override // lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        int i10;
        int i11;
        jc.l.e(fVar, "sink");
        do {
            int i12 = this.f4248e;
            lh.h hVar = this.f4244a;
            if (i12 == 0) {
                hVar.skip(this.f4249f);
                this.f4249f = 0;
                if ((this.f4246c & 4) == 0) {
                    i10 = this.f4247d;
                    int iN = wg.e.n(hVar);
                    this.f4248e = iN;
                    this.f4245b = iN;
                    int i13 = hVar.readByte() & 255;
                    this.f4246c = hVar.readByte() & 255;
                    Logger logger = t.f4250d;
                    if (logger.isLoggable(Level.FINE)) {
                        lh.i iVar = h.f4186a;
                        logger.fine(h.b(true, this.f4247d, this.f4245b, i13, this.f4246c));
                    }
                    i11 = hVar.readInt() & Integer.MAX_VALUE;
                    this.f4247d = i11;
                    if (i13 != 9) {
                        throw new IOException(i13 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jW = hVar.W(fVar, Math.min(j10, i12));
                if (jW != -1) {
                    this.f4248e -= (int) jW;
                    return jW;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f4244a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
