package pf;

import hf.a0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f17145c;

    public j(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f17145c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17145c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f17145c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.q(runnable));
        sb.append(", ");
        sb.append(this.f17143a);
        sb.append(", ");
        return t0.E(sb, this.f17144b ? "Blocking" : "Non-blocking", ']');
    }
}
