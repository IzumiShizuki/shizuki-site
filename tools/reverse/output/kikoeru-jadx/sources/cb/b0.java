package cb;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ya.q implements ScheduledFuture, y, Future {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f3838c;

    public b0(p pVar, ScheduledFuture scheduledFuture) {
        this.f3837b = pVar;
        this.f3838c = scheduledFuture;
    }

    @Override // cb.y
    public final void a(Runnable runnable, Executor executor) {
        this.f3837b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zW = w(z10);
        if (zW) {
            this.f3838c.cancel(z10);
        }
        return zW;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f3838c.compareTo(delayed);
    }

    @Override // ya.q
    public final Object f() {
        return this.f3837b;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3837b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f3838c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3837b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3837b.isDone();
    }

    public final boolean w(boolean z10) {
        return this.f3837b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f3837b.get(j10, timeUnit);
    }
}
