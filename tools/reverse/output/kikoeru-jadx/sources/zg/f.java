package zg;

import b5.d0;
import java.io.IOException;
import java.net.ProtocolException;
import lh.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends lh.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f26849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f26852h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d0 d0Var, f0 f0Var, long j10, boolean z10) {
        super(f0Var);
        jc.l.e(f0Var, "delegate");
        this.f26852h = d0Var;
        this.f26846b = j10;
        this.f26847c = z10;
        this.f26850f = z10;
    }

    @Override // lh.n, lh.f0
    public final void H(lh.f fVar, long j10) throws IOException {
        if (this.f26851g) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f26846b;
        if (j11 != -1 && this.f26849e + j10 > j11) {
            throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f26849e + j10));
        }
        try {
            if (this.f26850f) {
                this.f26850f = false;
            }
            super.H(fVar, j10);
            this.f26849e += j10;
        } catch (IOException e10) {
            IOException iOExceptionB = b(e10);
            jc.l.b(iOExceptionB);
            throw iOExceptionB;
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f26848d) {
            return iOException;
        }
        this.f26848d = true;
        return d0.c(this.f26852h, this.f26847c, iOException, 4);
    }

    @Override // lh.n, lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f26851g) {
            return;
        }
        this.f26851g = true;
        long j10 = this.f26846b;
        if (j10 != -1 && this.f26849e != j10) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e10) {
            IOException iOExceptionB = b(e10);
            jc.l.b(iOExceptionB);
            throw iOExceptionB;
        }
    }

    @Override // lh.n, lh.f0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e10) {
            IOException iOExceptionB = b(e10);
            jc.l.b(iOExceptionB);
            throw iOExceptionB;
        }
    }
}
