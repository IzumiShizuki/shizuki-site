package hf;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends w0 implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8610c;

    public x0(Executor executor) {
        Method method;
        this.f8610c = executor;
        Method method2 = nf.a.f15813a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = nf.a.f15813a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // hf.f0
    public final n0 O(long j10, Runnable runnable, yb.h hVar) {
        Executor executor = this.f8610c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0.i(hVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new m0(scheduledFutureSchedule) : b0.f8520j.O(j10, runnable, hVar);
    }

    @Override // hf.f0
    public final void X(long j10, k kVar) {
        Executor executor = this.f8610c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            cb.t tVar = new cb.t(5, this, kVar);
            yb.h hVar = kVar.f8561e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(tVar, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                a0.i(hVar, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            kVar.x(new h(0, scheduledFutureSchedule));
        } else {
            b0.f8520j.X(j10, kVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8610c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        try {
            this.f8610c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            a0.i(hVar, cancellationException);
            pf.e eVar = l0.f8566a;
            pf.d.f17138c.e0(hVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).f8610c == this.f8610c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8610c);
    }

    @Override // hf.w0
    public final Executor i0() {
        return this.f8610c;
    }

    @Override // hf.u
    public final String toString() {
        return this.f8610c.toString();
    }
}
