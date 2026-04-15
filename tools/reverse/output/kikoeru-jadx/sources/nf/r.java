package nf;

import hf.p1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends c implements p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15853d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15854c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j10, r rVar, int i10) {
        super(rVar);
        this.f15854c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // nf.c
    public final boolean d() {
        return f15853d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f15853d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, yb.h hVar);

    public final void i() {
        if (f15853d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f15853d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
