package k3;

import cb.y;
import j2.h0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11016d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f11017e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a2.c f11018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f11019g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f11020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f11021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f11022c;

    static {
        a2.c eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        f11018f = eVar;
        if (th != null) {
            f11017e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f11019g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f11022c;
        } while (!f11018f.z(gVar, fVar, f.f11013c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f11014a;
            if (thread != null) {
                fVar.f11014a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f11015b;
        }
        do {
            cVar2 = gVar.f11021b;
        } while (!f11018f.x(gVar, cVar2, c.f11004d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f11007c;
            cVar.f11007c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f11007c;
            d(cVar3.f11005a, cVar3.f11006b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f11017e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f11003a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f11019g) {
            return null;
        }
        return obj;
    }

    public static Object f(g gVar) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // cb.y
    public final void a(Runnable runnable, Executor executor) {
        c cVar = this.f11021b;
        c cVar2 = c.f11004d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f11007c = cVar;
                if (f11018f.x(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f11021b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f11020a;
        if (obj != null) {
            return false;
        }
        if (!f11018f.y(this, obj, f11016d ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f11001b : a.f11002c)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void g(f fVar) {
        fVar.f11014a = null;
        while (true) {
            f fVar2 = this.f11022c;
            if (fVar2 == f.f11013c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f11015b;
                if (fVar2.f11014a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f11015b = fVar4;
                    if (fVar3.f11014a == null) {
                        break;
                    }
                } else if (!f11018f.z(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f11013c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f11020a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f11022c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a2.c cVar = f11018f;
                    cVar.X(fVar3, fVar2);
                    if (cVar.z(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f11020a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            long jNanoTime2 = jNanoTime - System.nanoTime();
                            if (jNanoTime2 < 1000) {
                                g(fVar3);
                                nanos = jNanoTime2;
                                break;
                            }
                            nanos = jNanoTime2;
                        }
                    } else {
                        fVar2 = this.f11022c;
                    }
                } while (fVar2 != fVar);
            }
            return e(this.f11020a);
        }
        while (nanos > 0) {
            Object obj3 = this.f11020a;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strJ = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strJ2 = h0.j(strJ, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strJ3 = strJ2 + jConvert + " " + lowerCase;
                if (z10) {
                    strJ3 = h0.j(strJ3, ",");
                }
                strJ2 = h0.j(strJ3, " ");
            }
            if (z10) {
                strJ2 = strJ2 + nanos2 + " nanoseconds ";
            }
            strJ = h0.j(strJ2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(h0.j(strJ, " but future completed as timeout expired"));
        }
        throw new TimeoutException(h0.k(strJ, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11020a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11020a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f11020a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f11013c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f11020a;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar2 = this.f11022c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    a2.c cVar = f11018f;
                    cVar.X(fVar3, fVar2);
                    if (cVar.z(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f11020a;
                            } else {
                                g(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar2 = this.f11022c;
                } while (fVar2 != fVar);
            }
            return e(this.f11020a);
        }
        throw new InterruptedException();
    }
}
