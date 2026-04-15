package hf;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f8570a;

    public m0(ScheduledFuture scheduledFuture) {
        this.f8570a = scheduledFuture;
    }

    @Override // hf.n0
    public final void a() {
        this.f8570a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8570a + ']';
    }
}
