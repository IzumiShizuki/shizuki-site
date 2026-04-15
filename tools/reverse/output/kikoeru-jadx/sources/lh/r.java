package lh;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f12605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f12606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12608d;

    public r(b0 b0Var, Inflater inflater) {
        this.f12605a = b0Var;
        this.f12606b = inflater;
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) throws IOException {
        long j11;
        jc.l.e(fVar, "sink");
        while (j10 >= 0) {
            if (this.f12608d) {
                throw new IllegalStateException("closed");
            }
            b0 b0Var = this.f12605a;
            Inflater inflater = this.f12606b;
            if (j10 == 0) {
                j11 = 0;
            } else {
                try {
                    c0 c0VarR = fVar.R(1);
                    int iMin = (int) Math.min(j10, 8192 - c0VarR.f12558c);
                    if (inflater.needsInput() && !b0Var.b()) {
                        c0 c0Var = b0Var.f12545b.f12570a;
                        jc.l.b(c0Var);
                        int i10 = c0Var.f12558c;
                        int i11 = c0Var.f12557b;
                        int i12 = i10 - i11;
                        this.f12607c = i12;
                        inflater.setInput(c0Var.f12556a, i11, i12);
                    }
                    int iInflate = inflater.inflate(c0VarR.f12556a, c0VarR.f12558c, iMin);
                    int i13 = this.f12607c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f12607c -= remaining;
                        b0Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        c0VarR.f12558c += iInflate;
                        j11 = iInflate;
                        fVar.f12571b += j11;
                    } else {
                        if (c0VarR.f12557b == c0VarR.f12558c) {
                            fVar.f12570a = c0VarR.a();
                            d0.a(c0VarR);
                        }
                        j11 = 0;
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            if (j11 > 0) {
                return j11;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (b0Var.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12605a.f12544a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12608d) {
            return;
        }
        this.f12606b.end();
        this.f12608d = true;
        this.f12605a.close();
    }
}
