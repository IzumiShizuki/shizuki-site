package lh;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f12600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f12601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f12602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f12603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f12604e;

    public q(h hVar) {
        jc.l.e(hVar, "source");
        b0 b0Var = new b0(hVar);
        this.f12601b = b0Var;
        Inflater inflater = new Inflater(true);
        this.f12602c = inflater;
        this.f12603d = new r(b0Var, inflater);
        this.f12604e = new CRC32();
    }

    public static void b(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ef.n.C0(8, android.support.v4.media.session.b.Z(i11)) + " != expected 0x" + ef.n.C0(8, android.support.v4.media.session.b.Z(i10)));
    }

    @Override // lh.h0
    public final long W(f fVar, long j10) throws IOException {
        q qVar = this;
        jc.l.e(fVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b10 = qVar.f12600a;
        CRC32 crc32 = qVar.f12604e;
        b0 b0Var = qVar.f12601b;
        if (b10 == 0) {
            b0Var.a0(10L);
            f fVar2 = b0Var.f12545b;
            byte bK = fVar2.k(3L);
            boolean z10 = ((bK >> 1) & 1) == 1;
            if (z10) {
                qVar.g(fVar2, 0L, 10L);
            }
            b(8075, b0Var.readShort(), "ID1ID2");
            b0Var.skip(8L);
            if (((bK >> 2) & 1) == 1) {
                b0Var.a0(2L);
                if (z10) {
                    g(fVar2, 0L, 2L);
                }
                long jD = fVar2.D() & 65535;
                b0Var.a0(jD);
                if (z10) {
                    g(fVar2, 0L, jD);
                }
                b0Var.skip(jD);
            }
            if (((bK >> 3) & 1) == 1) {
                long jG = b0Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    g(fVar2, 0L, jG + 1);
                }
                b0Var.skip(jG + 1);
            }
            if (((bK >> 4) & 1) == 1) {
                long jG2 = b0Var.g((byte) 0, 0L, Long.MAX_VALUE);
                if (jG2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    qVar = this;
                    qVar.g(fVar2, 0L, jG2 + 1);
                } else {
                    qVar = this;
                }
                b0Var.skip(jG2 + 1);
            } else {
                qVar = this;
            }
            if (z10) {
                b(b0Var.n(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            qVar.f12600a = (byte) 1;
        }
        if (qVar.f12600a == 1) {
            long j11 = fVar.f12571b;
            long jW = qVar.f12603d.W(fVar, j10);
            if (jW != -1) {
                qVar.g(fVar, j11, jW);
                return jW;
            }
            qVar.f12600a = (byte) 2;
        }
        if (qVar.f12600a == 2) {
            b(b0Var.i(), (int) crc32.getValue(), "CRC");
            b(b0Var.i(), (int) qVar.f12602c.getBytesWritten(), "ISIZE");
            qVar.f12600a = (byte) 3;
            if (!b0Var.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12601b.f12544a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12603d.close();
    }

    public final void g(f fVar, long j10, long j11) {
        c0 c0Var = fVar.f12570a;
        jc.l.b(c0Var);
        while (true) {
            int i10 = c0Var.f12558c;
            int i11 = c0Var.f12557b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) c0Var.f12557b) + j10);
            int iMin = (int) Math.min(c0Var.f12558c - i12, j11);
            this.f12604e.update(c0Var.f12556a, i12, iMin);
            j11 -= (long) iMin;
            c0Var = c0Var.f12561f;
            jc.l.b(c0Var);
            j10 = 0;
        }
    }
}
