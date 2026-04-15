package cb;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends db.a implements y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f3869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.b f3870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f3871g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f3872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f3873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile o f3874c;

    static {
        boolean z10;
        Throwable th2;
        android.support.v4.media.session.b gVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f3868d = z10;
        f3869e = new x(p.class);
        int i10 = 6;
        Throwable th3 = null;
        try {
            gVar = new n(i10);
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(o.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(o.class, o.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, o.class, "c"), AtomicReferenceFieldUpdater.newUpdater(p.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th3 = e11;
                gVar = new g(i10);
            }
        }
        f3870f = gVar;
        if (th3 != null) {
            x xVar = f3869e;
            Logger loggerA = xVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            xVar.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        f3871g = new Object();
    }

    public static void e(p pVar, boolean z10) {
        d dVar = null;
        while (true) {
            for (o oVarF = f3870f.F(pVar); oVarF != null; oVarF = oVarF.f3867b) {
                Thread thread = oVarF.f3866a;
                if (thread != null) {
                    oVarF.f3866a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            pVar.c();
            d dVar2 = dVar;
            d dVarE = f3870f.E(pVar);
            d dVar3 = dVar2;
            while (dVarE != null) {
                d dVar4 = dVarE.f3845c;
                dVarE.f3845c = dVar3;
                dVar3 = dVarE;
                dVarE = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.f3845c;
                Runnable runnable = dVar3.f3843a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    pVar = fVar.f3852a;
                    if (pVar.f3872a == fVar) {
                        if (f3870f.w(pVar, fVar, h(fVar.f3853b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.f3844b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f3869e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f3835b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3840a);
        }
        if (obj == f3871g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(cb.y r6) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.p.h(cb.y):java.lang.Object");
    }

    @Override // cb.y
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        d dVar2 = d.f3842d;
        ud.s.h(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f3873b) != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3845c = dVar;
                if (f3870f.v(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3873b;
                }
            } while (dVar != dVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e10) {
                sb.append("FAILURE, cause=[");
                sb.append(e10.getCause());
                sb.append("]");
                return;
            } catch (Exception e11) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e11.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.f3872a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f3868d) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.f3832c : a.f3833d;
            Objects.requireNonNull(aVar);
        }
        boolean z11 = false;
        p pVar = this;
        while (true) {
            if (f3870f.w(pVar, obj, aVar)) {
                e(pVar, z10);
                if (!(obj instanceof f)) {
                    break;
                }
                y yVar = ((f) obj).f3853b;
                if (!(yVar instanceof h)) {
                    yVar.cancel(z10);
                    break;
                }
                pVar = (p) yVar;
                obj = pVar.f3872a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z11 = true;
            } else {
                obj = pVar.f3872a;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c4 -> B:37:0x0082). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.p.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean isCancelled() {
        return this.f3872a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f3872a != null);
    }

    public final void j(o oVar) {
        oVar.f3866a = null;
        while (true) {
            o oVar2 = this.f3874c;
            if (oVar2 == o.f3865c) {
                return;
            }
            o oVar3 = null;
            while (oVar2 != null) {
                o oVar4 = oVar2.f3867b;
                if (oVar2.f3866a != null) {
                    oVar3 = oVar2;
                } else if (oVar3 != null) {
                    oVar3.f3867b = oVar4;
                    if (oVar3.f3866a == null) {
                        break;
                    }
                } else if (!f3870f.x(this, oVar2, oVar4)) {
                    break;
                }
                oVar2 = oVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f3871g;
        }
        if (!f3870f.w(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean l(Throwable th2) {
        if (!f3870f.w(this, null, new c(th2))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.p.toString():java.lang.String");
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        o oVar = o.f3865c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3872a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return g(obj2);
            }
            o oVar2 = this.f3874c;
            if (oVar2 != oVar) {
                o oVar3 = new o();
                do {
                    android.support.v4.media.session.b bVar = f3870f;
                    bVar.R(oVar3, oVar2);
                    if (bVar.x(this, oVar2, oVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3872a;
                            } else {
                                j(oVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return g(obj);
                    }
                    oVar2 = this.f3874c;
                } while (oVar2 != oVar);
            }
            Object obj3 = this.f3872a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
