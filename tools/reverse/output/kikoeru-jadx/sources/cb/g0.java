package cb;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends p implements RunnableFuture, h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile f0 f3858h;

    public g0(Callable callable) {
        this.f3858h = new f0(this, callable);
    }

    @Override // cb.p
    public final void c() {
        f0 f0Var;
        Object obj = this.f3872a;
        if ((obj instanceof a) && ((a) obj).f3834a && (f0Var = this.f3858h) != null) {
            c4.o oVar = f0.f3855d;
            c4.o oVar2 = f0.f3854c;
            Runnable runnable = (Runnable) f0Var.get();
            if (runnable instanceof Thread) {
                w wVar = new w(f0Var);
                w.a(wVar, Thread.currentThread());
                if (f0Var.compareAndSet(runnable, wVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) f0Var.getAndSet(oVar2)) == oVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.f3858h = null;
    }

    @Override // cb.p
    public final String i() {
        f0 f0Var = this.f3858h;
        if (f0Var == null) {
            return super.i();
        }
        return "task=[" + f0Var + "]";
    }

    @Override // cb.p, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3872a instanceof a;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        f0 f0Var = this.f3858h;
        if (f0Var != null) {
            f0Var.run();
        }
        this.f3858h = null;
    }
}
