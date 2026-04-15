package lh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f12579d = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12582c;

    public j0 a() {
        this.f12580a = false;
        return this;
    }

    public j0 b() {
        this.f12582c = 0L;
        return this;
    }

    public long c() {
        if (this.f12580a) {
            return this.f12581b;
        }
        throw new IllegalStateException("No deadline");
    }

    public j0 d(long j10) {
        this.f12580a = true;
        this.f12581b = j10;
        return this;
    }

    public boolean e() {
        return this.f12580a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f12580a && this.f12581b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public j0 g(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jc.l.e(timeUnit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(j2.h0.i(j10, "timeout < 0: ").toString());
        }
        this.f12582c = timeUnit.toNanos(j10);
        return this;
    }
}
