package pf;

import hf.u;
import hf.w0;
import java.util.concurrent.Executor;
import nf.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends w0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f17138c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f17139d;

    static {
        l lVar = l.f17152c;
        int i10 = t.f15856a;
        if (64 >= i10) {
            i10 = 64;
        }
        f17139d = lVar.h0(nf.b.l(i10, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        f17139d.e0(hVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e0(yb.i.f26088a, runnable);
    }

    @Override // hf.u
    public final void f0(yb.h hVar, Runnable runnable) {
        f17139d.f0(hVar, runnable);
    }

    @Override // hf.u
    public final u h0(int i10) {
        return l.f17152c.h0(i10);
    }

    @Override // hf.u
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // hf.w0
    public final Executor i0() {
        return this;
    }
}
