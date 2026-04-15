package s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f19312a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf.c f19313b = new rf.c();

    public static final void a(y0 y0Var, w0 w0Var) {
        AtomicReference atomicReference = y0Var.f19312a;
        while (true) {
            w0 w0Var2 = (w0) atomicReference.get();
            if (w0Var2 != null && w0Var.f19295a.compareTo(w0Var2.f19295a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(w0Var2, w0Var)) {
                if (atomicReference.get() != w0Var2) {
                    break;
                }
            }
            if (w0Var2 != null) {
                w0Var2.f19296b.g(new r.k0(1, "Mutation interrupted"));
                return;
            }
            return;
        }
    }
}
