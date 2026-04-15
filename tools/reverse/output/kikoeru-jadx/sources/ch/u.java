package ch;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import lh.f0;
import lh.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.f f4255b = new lh.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f4257d;

    public u(x xVar, boolean z10) {
        this.f4257d = xVar;
        this.f4254a = z10;
    }

    @Override // lh.f0
    public final void H(lh.f fVar, long j10) {
        TimeZone timeZone = wg.g.f24231a;
        lh.f fVar2 = this.f4255b;
        fVar2.H(fVar, j10);
        while (fVar2.f12571b >= 16384) {
            b(false);
        }
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f4257d.f4275k;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z10) {
        long jMin;
        boolean z11;
        x xVar = this.f4257d;
        synchronized (xVar) {
            xVar.f4275k.h();
            while (xVar.f4268d >= xVar.f4269e && !this.f4254a && !this.f4256c && xVar.f() == null) {
                try {
                    try {
                        xVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    xVar.f4275k.l();
                    throw th2;
                }
            }
            xVar.f4275k.l();
            xVar.b();
            jMin = Math.min(xVar.f4269e - xVar.f4268d, this.f4255b.f12571b);
            xVar.f4268d += jMin;
            z11 = z10 && jMin == this.f4255b.f12571b;
        }
        this.f4257d.f4275k.h();
        try {
            x xVar2 = this.f4257d;
            xVar2.f4266b.q(xVar2.f4265a, z11, this.f4255b, jMin);
        } finally {
            this.f4257d.f4275k.l();
        }
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f4257d;
        TimeZone timeZone = wg.g.f24231a;
        synchronized (xVar) {
            if (this.f4256c) {
                return;
            }
            boolean z10 = xVar.f() == null;
            x xVar2 = this.f4257d;
            if (!xVar2.f4273i.f4254a) {
                if (this.f4255b.f12571b > 0) {
                    while (this.f4255b.f12571b > 0) {
                        b(true);
                    }
                } else if (z10) {
                    xVar2.f4266b.q(xVar2.f4265a, true, null, 0L);
                }
            }
            x xVar3 = this.f4257d;
            synchronized (xVar3) {
                this.f4256c = true;
                xVar3.notifyAll();
            }
            this.f4257d.f4266b.flush();
            this.f4257d.a();
        }
    }

    @Override // lh.f0, java.io.Flushable
    public final void flush() {
        x xVar = this.f4257d;
        TimeZone timeZone = wg.g.f24231a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.f4255b.f12571b > 0) {
            b(false);
            this.f4257d.f4266b.flush();
        }
    }
}
