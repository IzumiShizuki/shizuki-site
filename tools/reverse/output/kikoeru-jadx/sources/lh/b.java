package lh;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        c cVarO;
        while (true) {
            try {
                b7.m mVar = c.f12547h;
                reentrantLock = c.f12549j;
                reentrantLock.lock();
                try {
                    cVarO = g5.w.o();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (cVarO == c.f12548i) {
                c.f12548i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (cVarO != null) {
                    cVarO.k();
                }
            }
        }
    }
}
