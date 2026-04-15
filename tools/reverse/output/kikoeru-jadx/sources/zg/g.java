package zg;

import b5.d0;
import java.io.IOException;
import java.net.ProtocolException;
import lh.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends lh.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d0 f26859h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d0 d0Var, h0 h0Var, long j10, boolean z10) {
        super(h0Var);
        jc.l.e(h0Var, "delegate");
        this.f26859h = d0Var;
        this.f26853b = j10;
        this.f26854c = z10;
        this.f26856e = true;
        if (j10 == 0) {
            b(null);
        }
    }

    @Override // lh.o, lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        d0 d0Var = this.f26859h;
        jc.l.e(fVar, "sink");
        if (this.f26858g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jW = this.f12598a.W(fVar, j10);
            if (this.f26856e) {
                this.f26856e = false;
            }
            if (jW == -1) {
                b(null);
                return -1L;
            }
            long j11 = this.f26855d + jW;
            long j12 = this.f26853b;
            if (j12 == -1 || j11 <= j12) {
                this.f26855d = j11;
                if (((ah.f) d0Var.f1523d).b()) {
                    b(null);
                }
                return jW;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e10) {
            IOException iOExceptionB = b(e10);
            jc.l.b(iOExceptionB);
            throw iOExceptionB;
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f26857f) {
            return iOException;
        }
        this.f26857f = true;
        if (iOException == null && this.f26856e) {
            this.f26856e = false;
        }
        return d0.c(this.f26859h, this.f26854c, iOException, 8);
    }

    @Override // lh.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f26858g) {
            return;
        }
        this.f26858g = true;
        try {
            super.close();
            b(null);
        } catch (IOException e10) {
            IOException iOExceptionB = b(e10);
            jc.l.b(iOExceptionB);
            throw iOExceptionB;
        }
    }
}
