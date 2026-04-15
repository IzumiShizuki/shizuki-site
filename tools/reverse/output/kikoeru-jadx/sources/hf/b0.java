package hf;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends u0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b0 f8520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f8521k;

    static {
        Long l10;
        b0 b0Var = new b0();
        f8520j = b0Var;
        b0Var.l0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f8521k = timeUnit.toNanos(l10.longValue());
    }

    @Override // hf.u0, hf.f0
    public final n0 O(long j10, Runnable runnable, yb.h hVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 >= 4611686018427387903L) {
            return o1.f8575a;
        }
        long jNanoTime = System.nanoTime();
        r0 r0Var = new r0(runnable, j11 + jNanoTime);
        t0(jNanoTime, r0Var);
        return r0Var;
    }

    @Override // hf.v0
    public final Thread k0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f8520j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // hf.v0
    public final void o0(long j10, s0 s0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // hf.u0
    public final void p0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.p0(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zS0;
        u1.f8597a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (zS0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM0 = m0();
                    if (jM0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f8521k + jNanoTime;
                        }
                        long j11 = j10 - jNanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            u0();
                            if (s0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        if (jM0 > j11) {
                            jM0 = j11;
                        }
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (jM0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            u0();
                            if (s0()) {
                                return;
                            }
                            k0();
                            return;
                        }
                        LockSupport.parkNanos(this, jM0);
                    }
                }
            }
        } finally {
            _thread = null;
            u0();
            if (!s0()) {
                k0();
            }
        }
    }

    @Override // hf.u0, hf.v0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // hf.u
    public final String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void u0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            u0.f8594g.set(this, null);
            u0.f8595h.set(this, null);
            notifyAll();
        }
    }
}
