package bh;

import j2.h0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jc.l;
import ug.r;
import ug.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f3020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, t tVar, long j10) {
        super(hVar, tVar);
        l.e(tVar, "url");
        this.f3020f = hVar;
        this.f3019e = j10;
        if (j10 == 0) {
            b(r.f21859b);
        }
    }

    @Override // bh.b, lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        l.e(fVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(h0.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f3011c) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f3019e;
        if (j11 == 0) {
            return -1L;
        }
        long jW = super.W(fVar, Math.min(j11, j10));
        if (jW == -1) {
            this.f3020f.f3027b.f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(h.f3025f);
            throw protocolException;
        }
        long j12 = this.f3019e - jW;
        this.f3019e = j12;
        if (j12 == 0) {
            b(r.f21859b);
        }
        return jW;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zF;
        if (this.f3011c) {
            return;
        }
        if (this.f3019e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = wg.g.f24231a;
            l.e(timeUnit, "timeUnit");
            try {
                zF = wg.g.f(this, 100);
            } catch (IOException unused) {
                zF = false;
            }
            if (!zF) {
                this.f3020f.f3027b.f();
                b(h.f3025f);
            }
        }
        this.f3011c = true;
    }
}
