package cb;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f3883a;

    public w(f0 f0Var) {
        this.f3883a = f0Var;
    }

    public static void a(w wVar, Thread thread) {
        wVar.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f3883a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
