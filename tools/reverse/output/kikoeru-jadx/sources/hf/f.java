package hf;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f8536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f8537e;

    public f(yb.h hVar, Thread thread, v0 v0Var) {
        super(hVar, true);
        this.f8536d = thread;
        this.f8537e = v0Var;
    }

    @Override // hf.k1
    public final void l(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f8536d;
        if (jc.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
