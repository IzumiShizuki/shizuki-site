package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f4913a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static W f4914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f4915c;

    public W() {
        this.f4915c = null;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new b0(0));
        this.f4915c = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool == null || scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
            X.e("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized W c() {
        try {
            if (f4914b == null) {
                f4914b = new W();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4914b;
    }

    public synchronized void b() {
        ScheduledExecutorService scheduledExecutorService = this.f4915c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            X.a("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f4915c.shutdownNow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean d() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r1.f4915c     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.W.d():boolean");
    }

    public synchronized boolean a(Runnable runnable, long j10) {
        if (!d()) {
            X.e("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            X.e("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        if (j10 <= 0) {
            j10 = 0;
        }
        X.a("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j10), runnable.getClass().getName());
        try {
            this.f4915c.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th2) {
            if (com.tencent.bugly.b.f4350c) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    public synchronized boolean a(Runnable runnable) {
        if (!d()) {
            X.e("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            X.e("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        X.a("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f4915c.execute(runnable);
            return true;
        } catch (Throwable th2) {
            if (com.tencent.bugly.b.f4350c) {
                th2.printStackTrace();
            }
            return false;
        }
    }
}
