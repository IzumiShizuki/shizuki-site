package p4;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements RunnableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16614a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16615b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16616c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f16617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f16619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16620g;

    public final void b() {
        this.f16615b.d();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f16616c) {
            try {
                if (!this.f16620g && !this.f16615b.e()) {
                    this.f16620g = true;
                    c();
                    Thread thread = this.f16619f;
                    if (thread == null) {
                        this.f16614a.f();
                        this.f16615b.f();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public abstract Object d();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.f16615b.c();
        if (this.f16620g) {
            throw new CancellationException();
        }
        if (this.f16617d == null) {
            return this.f16618e;
        }
        throw new ExecutionException(this.f16617d);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16620g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16615b.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f16616c) {
            try {
                if (this.f16620g) {
                    return;
                }
                this.f16619f = Thread.currentThread();
                this.f16614a.f();
                try {
                    try {
                        this.f16618e = d();
                        synchronized (this.f16616c) {
                            this.f16615b.f();
                            this.f16619f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f16616c) {
                            this.f16615b.f();
                            this.f16619f = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f16617d = e10;
                    synchronized (this.f16616c) {
                        this.f16615b.f();
                        this.f16619f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z10;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        f fVar = this.f16615b;
        synchronized (fVar) {
            if (jConvert <= 0) {
                z10 = fVar.f16572a;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jConvert + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    fVar.c();
                } else {
                    while (!fVar.f16572a && jElapsedRealtime < j11) {
                        fVar.wait(j11 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z10 = fVar.f16572a;
            }
        }
        if (z10) {
            if (!this.f16620g) {
                if (this.f16617d == null) {
                    return this.f16618e;
                }
                throw new ExecutionException(this.f16617d);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }

    public void c() {
    }
}
