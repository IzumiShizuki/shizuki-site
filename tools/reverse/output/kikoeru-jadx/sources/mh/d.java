package mh;

import b0.w1;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import lh.c0;
import lh.d0;
import lh.f0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f15172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f15174c;

    public d(w1 w1Var) {
        this.f15174c = w1Var;
        Socket socket = (Socket) w1Var.f1395c;
        this.f15172a = socket.getOutputStream();
        this.f15173b = new i(socket);
    }

    @Override // lh.f0
    public final void H(lh.f fVar, long j10) throws IOException {
        android.support.v4.media.session.b.y(fVar.f12571b, 0L, j10);
        while (j10 > 0) {
            i iVar = this.f15173b;
            iVar.f();
            c0 c0Var = fVar.f12570a;
            jc.l.b(c0Var);
            int iMin = (int) Math.min(j10, c0Var.f12558c - c0Var.f12557b);
            iVar.h();
            try {
                try {
                    this.f15172a.write(c0Var.f12556a, c0Var.f12557b, iMin);
                    if (iVar.i()) {
                        throw iVar.j(null);
                    }
                    int i10 = c0Var.f12557b + iMin;
                    c0Var.f12557b = i10;
                    long j11 = iMin;
                    j10 -= j11;
                    fVar.f12571b -= j11;
                    if (i10 == c0Var.f12558c) {
                        fVar.f12570a = c0Var.a();
                        d0.a(c0Var);
                    }
                } catch (IOException e10) {
                    if (!iVar.i()) {
                        throw e10;
                    }
                    throw iVar.j(e10);
                }
            } catch (Throwable th2) {
                iVar.i();
                throw th2;
            }
        }
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f15173b;
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10;
        OutputStream outputStream = this.f15172a;
        w1 w1Var = this.f15174c;
        i iVar = this.f15173b;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) w1Var.f1396d;
            Socket socket = (Socket) w1Var.f1395c;
            jc.l.e(atomicInteger, "<this>");
            while (true) {
                int i11 = atomicInteger.get();
                if ((i11 & 1) != 0) {
                    i10 = 0;
                    break;
                }
                int i12 = i11 | 1;
                if (atomicInteger.compareAndSet(i11, i12)) {
                    i10 = i12;
                    break;
                }
            }
            if (i10 != 0) {
                if (i10 != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (iVar.i()) {
                    throw iVar.j(null);
                }
            }
        } catch (IOException e10) {
            if (!iVar.i()) {
                throw e10;
            }
            throw iVar.j(e10);
        } finally {
            iVar.i();
        }
    }

    @Override // lh.f0, java.io.Flushable
    public final void flush() throws IOException {
        i iVar = this.f15173b;
        iVar.h();
        try {
            this.f15172a.flush();
            if (iVar.i()) {
                throw iVar.j(null);
            }
        } catch (IOException e10) {
            if (!iVar.i()) {
                throw e10;
            }
            throw iVar.j(e10);
        } finally {
            iVar.i();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f15174c.f1395c) + ')';
    }
}
