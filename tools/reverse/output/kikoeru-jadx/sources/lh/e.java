package lh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12567b;

    public /* synthetic */ e(h hVar, int i10) {
        this.f12566a = i10;
        this.f12567b = hVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f12566a) {
            case 0:
                jMin = Math.min(((f) this.f12567b).f12571b, Integer.MAX_VALUE);
                break;
            default:
                b0 b0Var = (b0) this.f12567b;
                if (b0Var.f12546c) {
                    throw new IOException("closed");
                }
                jMin = Math.min(b0Var.f12545b.f12571b, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12566a) {
            case 0:
                break;
            default:
                ((b0) this.f12567b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f12566a) {
            case 0:
                f fVar = (f) this.f12567b;
                if (fVar.f12571b > 0) {
                    return fVar.readByte() & 255;
                }
                return -1;
            default:
                b0 b0Var = (b0) this.f12567b;
                f fVar2 = b0Var.f12545b;
                if (b0Var.f12546c) {
                    throw new IOException("closed");
                }
                if (fVar2.f12571b == 0 && b0Var.f12544a.W(fVar2, 8192L) == -1) {
                    return -1;
                }
                return fVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f12566a) {
            case 0:
                return ((f) this.f12567b) + ".inputStream()";
            default:
                return ((b0) this.f12567b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.f12566a) {
            case 1:
                jc.l.e(outputStream, "out");
                b0 b0Var = (b0) this.f12567b;
                f fVar = b0Var.f12545b;
                if (b0Var.f12546c) {
                    throw new IOException("closed");
                }
                long j10 = 0;
                long j11 = 0;
                while (true) {
                    if (fVar.f12571b == j10 && b0Var.f12544a.W(fVar, 8192L) == -1) {
                        return j11;
                    }
                    long j12 = fVar.f12571b;
                    j11 += j12;
                    android.support.v4.media.session.b.y(j12, 0L, j12);
                    c0 c0Var = fVar.f12570a;
                    while (j12 > j10) {
                        jc.l.b(c0Var);
                        int iMin = (int) Math.min(j12, c0Var.f12558c - c0Var.f12557b);
                        outputStream.write(c0Var.f12556a, c0Var.f12557b, iMin);
                        int i10 = c0Var.f12557b + iMin;
                        c0Var.f12557b = i10;
                        long j13 = iMin;
                        fVar.f12571b -= j13;
                        j12 -= j13;
                        if (i10 == c0Var.f12558c) {
                            c0 c0VarA = c0Var.a();
                            fVar.f12570a = c0VarA;
                            d0.a(c0Var);
                            c0Var = c0VarA;
                        }
                        j10 = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f12566a) {
            case 0:
                jc.l.e(bArr, "sink");
                return ((f) this.f12567b).read(bArr, i10, i11);
            default:
                jc.l.e(bArr, "data");
                b0 b0Var = (b0) this.f12567b;
                f fVar = b0Var.f12545b;
                if (!b0Var.f12546c) {
                    android.support.v4.media.session.b.y(bArr.length, i10, i11);
                    if (fVar.f12571b == 0 && b0Var.f12544a.W(fVar, 8192L) == -1) {
                        return -1;
                    }
                    return fVar.read(bArr, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}
