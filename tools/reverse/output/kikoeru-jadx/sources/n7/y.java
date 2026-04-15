package n7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15591a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f15593c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15592b = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15594d = new Object();

    public y(Executor executor) {
        this.f15591a = executor;
    }

    public final void a() {
        synchronized (this.f15594d) {
            Object objPoll = this.f15592b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f15593c = runnable;
            if (objPoll != null) {
                this.f15591a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        jc.l.e(runnable, "command");
        synchronized (this.f15594d) {
            this.f15592b.offer(new b5.h(18, runnable, this));
            if (this.f15593c == null) {
                a();
            }
        }
    }
}
