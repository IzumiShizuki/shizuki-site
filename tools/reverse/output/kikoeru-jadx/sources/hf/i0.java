package hf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends nf.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8547e = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // nf.q, hf.k1
    public final void l(Object obj) throws h0 {
        p(obj);
    }

    @Override // nf.q, hf.k1
    public final void p(Object obj) throws h0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8547e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                nf.b.h(a0.A(obj), ud.s.p(this.f15852d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
