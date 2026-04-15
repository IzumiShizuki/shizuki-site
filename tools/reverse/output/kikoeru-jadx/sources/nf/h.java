package nf;

import hf.c0;
import hf.f0;
import hf.n0;
import j2.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends hf.u implements f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15831h = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f15832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hf.u f15833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f15835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f15836g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(hf.u uVar, int i10) {
        f0 f0Var = uVar instanceof f0 ? (f0) uVar : null;
        this.f15832c = f0Var == null ? c0.f8528a : f0Var;
        this.f15833d = uVar;
        this.f15834e = i10;
        this.f15835f = new k();
        this.f15836g = new Object();
    }

    @Override // hf.f0
    public final n0 O(long j10, Runnable runnable, yb.h hVar) {
        return this.f15832c.O(j10, runnable, hVar);
    }

    @Override // hf.f0
    public final void X(long j10, hf.k kVar) {
        this.f15832c.X(j10, kVar);
    }

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        Runnable runnableI0;
        this.f15835f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15831h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f15834e || !j0() || (runnableI0 = i0()) == null) {
            return;
        }
        try {
            b.i(this.f15833d, this, new cb.t(6, this, runnableI0, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // hf.u
    public final void f0(yb.h hVar, Runnable runnable) {
        Runnable runnableI0;
        this.f15835f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15831h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f15834e || !j0() || (runnableI0 = i0()) == null) {
            return;
        }
        try {
            this.f15833d.f0(this, new cb.t(6, this, runnableI0, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // hf.u
    public final hf.u h0(int i10) {
        b.a(i10);
        return i10 >= this.f15834e ? this : super.h0(i10);
    }

    public final Runnable i0() {
        while (true) {
            Runnable runnable = (Runnable) this.f15835f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f15836g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15831h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f15835f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean j0() {
        synchronized (this.f15836g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15831h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f15834e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // hf.u
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15833d);
        sb.append(".limitedParallelism(");
        return h0.m(sb, this.f15834e, ')');
    }
}
