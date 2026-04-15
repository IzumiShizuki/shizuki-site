package hf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends g1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8529f = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final de.h f8530e;

    public c1(de.h hVar) {
        this.f8530e = hVar;
    }

    @Override // hf.g1
    public final boolean k() {
        return true;
    }

    @Override // hf.g1
    public final void l(Throwable th2) {
        if (f8529f.compareAndSet(this, 0, 1)) {
            this.f8530e.a(th2);
        }
    }
}
