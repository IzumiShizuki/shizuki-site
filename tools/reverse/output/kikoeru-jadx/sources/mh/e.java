package mh;

import b0.w1;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import lh.c0;
import lh.d0;
import lh.h0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f15175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f15177c;

    public e(w1 w1Var) {
        this.f15177c = w1Var;
        Socket socket = (Socket) w1Var.f1395c;
        this.f15175a = socket.getInputStream();
        this.f15176b = new i(socket);
    }

    @Override // lh.h0
    public final long W(lh.f fVar, long j10) throws IOException {
        jc.l.e(fVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "byteCount < 0: ").toString());
        }
        i iVar = this.f15176b;
        iVar.f();
        c0 c0VarR = fVar.R(1);
        int iMin = (int) Math.min(j10, 8192 - c0VarR.f12558c);
        try {
            iVar.h();
            try {
                int i10 = this.f15175a.read(c0VarR.f12556a, c0VarR.f12558c, iMin);
                if (iVar.i()) {
                    throw iVar.j(null);
                }
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
            } catch (IOException e10) {
                if (iVar.i()) {
                    throw iVar.j(e10);
                }
                throw e10;
            } finally {
                iVar.i();
            }
        } catch (AssertionError e11) {
            if (m.a(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f15176b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10;
        w1 w1Var = this.f15177c;
        i iVar = this.f15176b;
        iVar.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) w1Var.f1396d;
            Socket socket = (Socket) w1Var.f1395c;
            jc.l.e(atomicInteger, "<this>");
            while (true) {
                int i11 = atomicInteger.get();
                if ((i11 & 2) != 0) {
                    i10 = 0;
                    break;
                }
                int i12 = i11 | 2;
                if (atomicInteger.compareAndSet(i11, i12)) {
                    i10 = i12;
                    break;
                }
            }
            if (i10 != 0) {
                if (i10 == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f15175a.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.f15177c.f1395c) + ')';
    }
}
