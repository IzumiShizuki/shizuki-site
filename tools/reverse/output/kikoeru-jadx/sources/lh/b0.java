package lh;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f12544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12546c;

    public b0(h0 h0Var) {
        jc.l.e(h0Var, "source");
        this.f12544a = h0Var;
        this.f12545b = new f();
    }

    @Override // lh.h
    public final String F(Charset charset) {
        jc.l.e(charset, "charset");
        h0 h0Var = this.f12544a;
        f fVar = this.f12545b;
        fVar.c0(h0Var);
        return fVar.F(charset);
    }

    @Override // lh.h
    public final int K(w wVar) throws EOFException {
        jc.l.e(wVar, "options");
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f12545b;
            int iC = mh.a.c(fVar, wVar, true);
            if (iC != -2) {
                if (iC != -1) {
                    fVar.skip(wVar.f12615a[iC].d());
                    return iC;
                }
            } else if (this.f12544a.W(fVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // lh.h
    public final i N() {
        h0 h0Var = this.f12544a;
        f fVar = this.f12545b;
        fVar.c0(h0Var);
        return fVar.j(fVar.f12571b);
    }

    @Override // lh.h
    public final boolean P(long j10) {
        f fVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f12545b;
            if (fVar.f12571b >= j10) {
                return true;
            }
        } while (this.f12544a.W(fVar, 8192L) != -1);
        return false;
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) {
        jc.l.e(fVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f12545b;
        if (fVar2.f12571b == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f12544a.W(fVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return fVar2.W(fVar, Math.min(j10, fVar2.f12571b));
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12544a.a();
    }

    @Override // lh.h
    public final void a0(long j10) {
        if (!P(j10)) {
            throw new EOFException();
        }
    }

    public final boolean b() {
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f12545b;
        return fVar.i() && this.f12544a.W(fVar, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f12546c) {
            return;
        }
        this.f12546c = true;
        this.f12544a.close();
        f fVar = this.f12545b;
        fVar.skip(fVar.f12571b);
    }

    public final long g(byte b10, long j10, long j11) {
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11) {
            throw new IllegalArgumentException(j2.h0.i(j11, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j11) {
            f fVar = this.f12545b;
            byte b11 = b10;
            long j12 = j11;
            long jN = fVar.n(b11, jMax, j12);
            if (jN != -1) {
                return jN;
            }
            long j13 = fVar.f12571b;
            if (j13 >= j12 || this.f12544a.W(fVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public final int i() {
        a0(4L);
        int i10 = this.f12545b.readInt();
        return ((i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f12546c;
    }

    @Override // lh.h
    public final i j(long j10) {
        a0(j10);
        return this.f12545b.j(j10);
    }

    public final long k() throws EOFException {
        char c3;
        char c10;
        char c11;
        char c12;
        long j10;
        a0(8L);
        f fVar = this.f12545b;
        if (fVar.f12571b < 8) {
            throw new EOFException();
        }
        c0 c0Var = fVar.f12570a;
        jc.l.b(c0Var);
        int i10 = c0Var.f12557b;
        int i11 = c0Var.f12558c;
        if (i11 - i10 < 8) {
            j10 = ((((long) fVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) fVar.readInt()));
            c11 = '8';
            c12 = '\b';
            c3 = 24;
            c10 = '(';
        } else {
            byte[] bArr = c0Var.f12556a;
            c3 = 24;
            c10 = '(';
            c11 = '8';
            c12 = '\b';
            int i12 = i10 + 7;
            long j11 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
            int i13 = i10 + 8;
            long j12 = j11 | (((long) bArr[i12]) & 255);
            fVar.f12571b -= 8;
            if (i13 == i11) {
                fVar.f12570a = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.f12557b = i13;
            }
            j10 = j12;
        }
        return ((j10 & 255) << c11) | (((-72057594037927936L) & j10) >>> c11) | ((71776119061217280L & j10) >>> c10) | ((280375465082880L & j10) >>> c3) | ((1095216660480L & j10) >>> c12) | ((4278190080L & j10) << c12) | ((16711680 & j10) << c3) | ((65280 & j10) << c10);
    }

    public final short n() {
        a0(2L);
        return this.f12545b.D();
    }

    public final String o(long j10) {
        a0(j10);
        f fVar = this.f12545b;
        fVar.getClass();
        return fVar.G(j10, ef.a.f6541a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        jc.l.e(byteBuffer, "sink");
        f fVar = this.f12545b;
        if (fVar.f12571b == 0 && this.f12544a.W(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // lh.h
    public final byte readByte() {
        a0(1L);
        return this.f12545b.readByte();
    }

    @Override // lh.h
    public final int readInt() {
        a0(4L);
        return this.f12545b.readInt();
    }

    @Override // lh.h
    public final short readShort() {
        a0(2L);
        return this.f12545b.readShort();
    }

    @Override // lh.h
    public final f s() {
        return this.f12545b;
    }

    @Override // lh.h
    public final void skip(long j10) {
        if (this.f12546c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            f fVar = this.f12545b;
            if (fVar.f12571b == 0 && this.f12544a.W(fVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, fVar.f12571b);
            fVar.skip(jMin);
            j10 -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f12544a + ')';
    }

    @Override // lh.h
    public final long w(a0 a0Var) {
        f fVar;
        long j10 = 0;
        while (true) {
            h0 h0Var = this.f12544a;
            fVar = this.f12545b;
            if (h0Var.W(fVar, 8192L) == -1) {
                break;
            }
            long jB = fVar.b();
            if (jB > 0) {
                j10 += jB;
                a0Var.H(fVar, jB);
            }
        }
        long j11 = fVar.f12571b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        a0Var.H(fVar, j11);
        return j12;
    }

    @Override // lh.h
    public final String x(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jG = g((byte) 10, 0L, j11);
        f fVar = this.f12545b;
        if (jG != -1) {
            return mh.a.b(fVar, jG);
        }
        if (j11 < Long.MAX_VALUE && P(j11) && fVar.k(j11 - 1) == 13 && P(j11 + 1) && fVar.k(j11) == 10) {
            return mh.a.b(fVar, j11);
        }
        f fVar2 = new f();
        fVar.g(fVar2, 0L, Math.min(32, fVar.f12571b));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f12571b, j10) + " content=" + fVar2.j(fVar2.f12571b).e() + (char) 8230);
    }
}
