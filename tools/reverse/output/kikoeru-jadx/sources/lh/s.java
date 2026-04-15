package lh;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f12609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f12610b;

    public s(InputStream inputStream, j0 j0Var) {
        jc.l.e(inputStream, "input");
        this.f12609a = inputStream;
        this.f12610b = j0Var;
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) throws IOException {
        jc.l.e(fVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        try {
            this.f12610b.f();
            c0 c0VarR = fVar.R(1);
            int i10 = this.f12609a.read(c0VarR.f12556a, c0VarR.f12558c, (int) Math.min(j10, 8192 - c0VarR.f12558c));
            if (i10 != -1) {
                c0VarR.f12558c += i10;
                long j11 = i10;
                fVar.f12571b += j11;
                return j11;
            }
            if (c0VarR.f12557b != c0VarR.f12558c) {
                return -1L;
            }
            fVar.f12570a = c0VarR.a();
            d0.a(c0VarR);
            return -1L;
        } catch (AssertionError e10) {
            if (mh.m.a(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12610b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12609a.close();
    }

    public final String toString() {
        return "source(" + this.f12609a + ')';
    }
}
