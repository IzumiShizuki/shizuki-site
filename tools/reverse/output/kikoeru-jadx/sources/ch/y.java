package ch;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f4278f = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh.g f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.f f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f4283e;

    public y(lh.a0 a0Var) {
        jc.l.e(a0Var, "sink");
        this.f4279a = a0Var;
        lh.f fVar = new lh.f();
        this.f4280b = fVar;
        this.f4281c = 16384;
        this.f4283e = new f(fVar);
    }

    public final void b(c0 c0Var) {
        jc.l.e(c0Var, "peerSettings");
        synchronized (this) {
            try {
                if (this.f4282d) {
                    throw new IOException("closed");
                }
                int i10 = this.f4281c;
                int i11 = c0Var.f4157a;
                if ((i11 & 32) != 0) {
                    i10 = c0Var.f4158b[5];
                }
                this.f4281c = i10;
                if (((i11 & 2) != 0 ? c0Var.f4158b[1] : -1) != -1) {
                    f fVar = this.f4283e;
                    int i12 = (i11 & 2) != 0 ? c0Var.f4158b[1] : -1;
                    fVar.getClass();
                    int iMin = Math.min(i12, 16384);
                    int i13 = fVar.f4179d;
                    if (i13 != iMin) {
                        if (iMin < i13) {
                            fVar.f4177b = Math.min(fVar.f4177b, iMin);
                        }
                        fVar.f4178c = true;
                        fVar.f4179d = iMin;
                        int i14 = fVar.f4183h;
                        if (iMin < i14) {
                            if (iMin == 0) {
                                d[] dVarArr = fVar.f4180e;
                                vb.l.p0(0, dVarArr.length, dVarArr);
                                fVar.f4181f = fVar.f4180e.length - 1;
                                fVar.f4182g = 0;
                                fVar.f4183h = 0;
                            } else {
                                fVar.a(i14 - iMin);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f4279a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f4282d = true;
            this.f4279a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            this.f4279a.flush();
        }
    }

    public final void g(boolean z10, int i10, lh.f fVar, int i11) {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            i(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                lh.g gVar = this.f4279a;
                jc.l.b(fVar);
                gVar.H(fVar, i11);
            }
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        if (i12 != 8) {
            Level level = Level.FINE;
            Logger logger = f4278f;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(false, i10, i11, i12, i13));
            }
        }
        if (i11 > this.f4281c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4281c + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(t0.B(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = wg.e.f24227a;
        lh.g gVar = this.f4279a;
        jc.l.e(gVar, "<this>");
        gVar.writeByte((i11 >>> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        gVar.writeByte((i11 >>> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        gVar.writeByte(i11 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        gVar.writeByte(i12 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        gVar.writeByte(i13 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        gVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final void k(int i10, b bVar, byte[] bArr) {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            if (bVar.f4154a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, bArr.length + 8, 7, 0);
            this.f4279a.writeInt(i10);
            this.f4279a.writeInt(bVar.f4154a);
            if (bArr.length != 0) {
                this.f4279a.write(bArr);
            }
            this.f4279a.flush();
        }
    }

    public final void n(boolean z10, int i10, ArrayList arrayList) {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            this.f4283e.d(arrayList);
            long j10 = this.f4280b.f12571b;
            long jMin = Math.min(this.f4281c, j10);
            int i11 = j10 == jMin ? 4 : 0;
            if (z10) {
                i11 |= 1;
            }
            i(i10, (int) jMin, 1, i11);
            this.f4279a.H(this.f4280b, jMin);
            if (j10 > jMin) {
                long j11 = j10 - jMin;
                while (j11 > 0) {
                    long jMin2 = Math.min(this.f4281c, j11);
                    j11 -= jMin2;
                    i(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                    this.f4279a.H(this.f4280b, jMin2);
                }
            }
        }
    }

    public final void o(int i10, int i11, boolean z10) {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            i(0, 8, 6, z10 ? 1 : 0);
            this.f4279a.writeInt(i10);
            this.f4279a.writeInt(i11);
            this.f4279a.flush();
        }
    }

    public final void q(int i10, b bVar) {
        synchronized (this) {
            if (this.f4282d) {
                throw new IOException("closed");
            }
            if (bVar.f4154a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(i10, 4, 3, 0);
            this.f4279a.writeInt(bVar.f4154a);
            this.f4279a.flush();
        }
    }

    public final void u(c0 c0Var) {
        jc.l.e(c0Var, "settings");
        synchronized (this) {
            try {
                if (this.f4282d) {
                    throw new IOException("closed");
                }
                i(0, Integer.bitCount(c0Var.f4157a) * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    boolean z10 = true;
                    if (((1 << i10) & c0Var.f4157a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f4279a.writeShort(i10);
                        this.f4279a.writeInt(c0Var.f4158b[i10]);
                    }
                }
                this.f4279a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(int i10, long j10) {
        synchronized (this) {
            try {
                if (this.f4282d) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f4278f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i10, 4, j10, false));
                }
                i(i10, 4, 8, 0);
                this.f4279a.writeInt((int) j10);
                this.f4279a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
