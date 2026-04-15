package lh;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f12617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f12618b;

    public x(FileOutputStream fileOutputStream, j0 j0Var) {
        this.f12617a = fileOutputStream;
        this.f12618b = j0Var;
    }

    @Override // lh.f0
    public final void H(f fVar, long j10) throws IOException {
        android.support.v4.media.session.b.y(fVar.f12571b, 0L, j10);
        while (j10 > 0) {
            this.f12618b.f();
            c0 c0Var = fVar.f12570a;
            jc.l.b(c0Var);
            int iMin = (int) Math.min(j10, c0Var.f12558c - c0Var.f12557b);
            this.f12617a.write(c0Var.f12556a, c0Var.f12557b, iMin);
            int i10 = c0Var.f12557b + iMin;
            c0Var.f12557b = i10;
            long j11 = iMin;
            j10 -= j11;
            fVar.f12571b -= j11;
            if (i10 == c0Var.f12558c) {
                fVar.f12570a = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f12618b;
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12617a.close();
    }

    @Override // lh.f0, java.io.Flushable
    public final void flush() throws IOException {
        this.f12617a.flush();
    }

    public final String toString() {
        return "sink(" + this.f12617a + ')';
    }
}
