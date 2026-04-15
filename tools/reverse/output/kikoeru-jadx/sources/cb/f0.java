package cb;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4.o f3854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c4.o f3855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f3856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3857b;

    static {
        int i10 = 1;
        f3854c = new c4.o(i10);
        f3855d = new c4.o(i10);
    }

    public f0(g0 g0Var, Callable callable) {
        this.f3857b = g0Var;
        callable.getClass();
        this.f3856a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        w wVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof w;
            c4.o oVar = f3855d;
            if (!z11 && runnable != oVar) {
                break;
            }
            if (z11) {
                wVar = (w) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == oVar || compareAndSet(runnable, oVar)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(wVar);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            g0 g0Var = this.f3857b;
            boolean zIsDone = g0Var.isDone();
            c4.o oVar = f3854c;
            if (!zIsDone) {
                try {
                    objCall = this.f3856a.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, oVar)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        g0Var.l(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, oVar)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            g0Var.k(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f3854c) {
            str = "running=[DONE]";
        } else if (runnable instanceof w) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.f3856a.toString();
    }
}
